// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.services.async.AccountServiceAsync
import java.util.Collections
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Accounts */
class AccountListPageAsync
private constructor(
    private val accountsService: AccountServiceAsync,
    private val params: AccountListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<Account> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPageAsync && accountsService == other.accountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPageAsync{accountsService=$accountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): AccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AccountListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): AccountListPageAsync? {
        return getNextPageParams()?.let { accountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountsService: AccountServiceAsync,
            params: AccountListParams,
            response: Response,
        ) = AccountListPageAsync(accountsService, params, response)
    }

    class Response(
        private val data: JsonField<List<Account>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<Account>> = JsonMissing.of(),
            @JsonProperty("next_cursor") nextCursor: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextCursor, mutableMapOf())

        fun data(): List<Account> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<Account>>? = data

        @JsonProperty("next_cursor") fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            nextCursor()
            validated = true
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

            /** Returns a mutable builder for constructing an instance of [AccountListPageAsync]. */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Account>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<Account>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Account>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, nextCursor, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: AccountListPageAsync) : Flow<Account> {

        override suspend fun collect(collector: FlowCollector<Account>) {
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
