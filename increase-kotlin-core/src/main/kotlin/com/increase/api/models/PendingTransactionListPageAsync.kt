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
import com.increase.api.core.toImmutable
import com.increase.api.services.async.PendingTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class PendingTransactionListPageAsync
private constructor(
    private val pendingTransactionsService: PendingTransactionServiceAsync,
    private val params: PendingTransactionListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<PendingTransaction> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPageAsync && pendingTransactionsService == other.pendingTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pendingTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPageAsync{pendingTransactionsService=$pendingTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): PendingTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return PendingTransactionListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): PendingTransactionListPageAsync? {
        return getNextPageParams()?.let { pendingTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            pendingTransactionsService: PendingTransactionServiceAsync,
            params: PendingTransactionListParams,
            response: Response
        ) =
            PendingTransactionListPageAsync(
                pendingTransactionsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<PendingTransaction>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<PendingTransaction> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<PendingTransaction>>? = data

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

            return /* spotless:off */ other is Response && data == other.data && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<PendingTransaction>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<PendingTransaction>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<PendingTransaction>>) = apply { this.data = data }

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
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: PendingTransactionListPageAsync,
    ) : Flow<PendingTransaction> {

        override suspend fun collect(collector: FlowCollector<PendingTransaction>) {
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
