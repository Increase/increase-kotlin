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
import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class DigitalWalletTokenListPageAsync
private constructor(
    private val digitalWalletTokensService: DigitalWalletTokenServiceAsync,
    private val params: DigitalWalletTokenListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<DigitalWalletToken> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletTokenListPageAsync && digitalWalletTokensService == other.digitalWalletTokensService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalWalletTokensService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPageAsync{digitalWalletTokensService=$digitalWalletTokensService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): DigitalWalletTokenListParams? {
        if (!hasNextPage()) {
            return null
        }

        return DigitalWalletTokenListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): DigitalWalletTokenListPageAsync? {
        return getNextPageParams()?.let { digitalWalletTokensService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            digitalWalletTokensService: DigitalWalletTokenServiceAsync,
            params: DigitalWalletTokenListParams,
            response: Response
        ) =
            DigitalWalletTokenListPageAsync(
                digitalWalletTokensService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<DigitalWalletToken>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<DigitalWalletToken> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<DigitalWalletToken>>? = data

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

            private var data: JsonField<List<DigitalWalletToken>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<DigitalWalletToken>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<DigitalWalletToken>>) = apply { this.data = data }

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
        private val firstPage: DigitalWalletTokenListPageAsync,
    ) : Flow<DigitalWalletToken> {

        override suspend fun collect(collector: FlowCollector<DigitalWalletToken>) {
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
