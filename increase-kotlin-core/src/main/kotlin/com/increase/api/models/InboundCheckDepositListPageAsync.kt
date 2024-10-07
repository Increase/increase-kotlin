// File generated from our OpenAPI spec by Stainless.

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
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class InboundCheckDepositListPageAsync
private constructor(
    private val inboundCheckDepositsService: InboundCheckDepositServiceAsync,
    private val params: InboundCheckDepositListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<InboundCheckDeposit> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositListPageAsync && this.inboundCheckDepositsService == other.inboundCheckDepositsService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inboundCheckDepositsService, params, response) /* spotless:on */
    }

    override fun toString() =
        "InboundCheckDepositListPageAsync{inboundCheckDepositsService=$inboundCheckDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): InboundCheckDepositListParams? {
        if (!hasNextPage()) {
            return null
        }

        return InboundCheckDepositListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): InboundCheckDepositListPageAsync? {
        return getNextPageParams()?.let { inboundCheckDepositsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundCheckDepositsService: InboundCheckDepositServiceAsync,
            params: InboundCheckDepositListParams,
            response: Response
        ) =
            InboundCheckDepositListPageAsync(
                inboundCheckDepositsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<InboundCheckDeposit>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<InboundCheckDeposit> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<InboundCheckDeposit>>? = data

        @JsonProperty("next_cursor") fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                nextCursor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && this.data == other.data && this.nextCursor == other.nextCursor && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "InboundCheckDepositListPageAsync.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<InboundCheckDeposit>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<InboundCheckDeposit>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<InboundCheckDeposit>>) = apply { this.data = data }

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

    class AutoPager
    constructor(
        private val firstPage: InboundCheckDepositListPageAsync,
    ) : Flow<InboundCheckDeposit> {

        override suspend fun collect(collector: FlowCollector<InboundCheckDeposit>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
