package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.services.async.InboundAchTransferReturnServiceAsync
import java.util.Objects

class InboundAchTransferReturnListPageAsync
private constructor(
    private val inboundAchTransferReturnsService: InboundAchTransferReturnServiceAsync,
    private val params: InboundAchTransferReturnListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<InboundAchTransferReturn> = response().data()

    fun nextCursor(): String = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransferReturnListPageAsync &&
            this.inboundAchTransferReturnsService == other.inboundAchTransferReturnsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            inboundAchTransferReturnsService,
            params,
            response,
        )
    }

    override fun toString() =
        "InboundAchTransferReturnListPageAsync{inboundAchTransferReturnsService=$inboundAchTransferReturnsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isNotEmpty()
    }

    fun getNextPageParams(): InboundAchTransferReturnListParams? {
        if (!hasNextPage()) {
            return null
        }

        return InboundAchTransferReturnListParams.builder()
            .from(params)
            .cursor(nextCursor())
            .build()
    }

    suspend fun getNextPage(): InboundAchTransferReturnListPageAsync? {
        return getNextPageParams()?.let { inboundAchTransferReturnsService.list(it) }
    }

    companion object {

        fun of(
            inboundAchTransferReturnsService: InboundAchTransferReturnServiceAsync,
            params: InboundAchTransferReturnListParams,
            response: Response
        ) =
            InboundAchTransferReturnListPageAsync(
                inboundAchTransferReturnsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<InboundAchTransferReturn>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<InboundAchTransferReturn> = data.getRequired("data")

        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<InboundAchTransferReturn>>? = data

        @JsonProperty("next_cursor") fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                data().forEach { it.validate() }
                nextCursor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.nextCursor == other.nextCursor &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                nextCursor,
                additionalProperties,
            )
        }

        override fun toString() =
            "InboundAchTransferReturnListPageAsync.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<InboundAchTransferReturn>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<InboundAchTransferReturn>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<InboundAchTransferReturn>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    nextCursor,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
