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
import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects

class CardDisputeListPageAsync
private constructor(
    private val cardDisputesService: CardDisputeServiceAsync,
    private val params: CardDisputeListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CardDispute> = response().data()

    fun nextCursor(): String = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDisputeListPageAsync &&
            this.cardDisputesService == other.cardDisputesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardDisputesService,
            params,
            response,
        )
    }

    override fun toString() =
        "CardDisputeListPageAsync{cardDisputesService=$cardDisputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isNotEmpty()
    }

    fun getNextPageParams(): CardDisputeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return CardDisputeListParams.builder().from(params).cursor(nextCursor()).build()
    }

    suspend fun getNextPage(): CardDisputeListPageAsync? {
        return getNextPageParams()?.let { cardDisputesService.list(it) }
    }

    companion object {

        fun of(
            cardDisputesService: CardDisputeServiceAsync,
            params: CardDisputeListParams,
            response: Response
        ) =
            CardDisputeListPageAsync(
                cardDisputesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<CardDispute>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<CardDispute> = data.getRequired("data")

        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<CardDispute>>? = data

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
            "CardDisputeListPageAsync.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CardDispute>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CardDispute>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CardDispute>>) = apply { this.data = data }

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
