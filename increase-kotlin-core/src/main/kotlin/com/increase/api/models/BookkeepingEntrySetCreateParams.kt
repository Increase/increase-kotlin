// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

class BookkeepingEntrySetCreateParams
constructor(
    private val entries: List<Entry>,
    private val date: OffsetDateTime?,
    private val transactionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entries(): List<Entry> = entries

    fun date(): OffsetDateTime? = date

    fun transactionId(): String? = transactionId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): BookkeepingEntrySetCreateBody {
        return BookkeepingEntrySetCreateBody(
            entries,
            date,
            transactionId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = BookkeepingEntrySetCreateBody.Builder::class)
    @NoAutoDetect
    class BookkeepingEntrySetCreateBody
    internal constructor(
        private val entries: List<Entry>?,
        private val date: OffsetDateTime?,
        private val transactionId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The bookkeeping entries. */
        @JsonProperty("entries") fun entries(): List<Entry>? = entries

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        @JsonProperty("date") fun date(): OffsetDateTime? = date

        /** The identifier of the Transaction related to this entry set, if any. */
        @JsonProperty("transaction_id") fun transactionId(): String? = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var entries: List<Entry>? = null
            private var date: OffsetDateTime? = null
            private var transactionId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bookkeepingEntrySetCreateBody: BookkeepingEntrySetCreateBody) =
                apply {
                    this.entries = bookkeepingEntrySetCreateBody.entries
                    this.date = bookkeepingEntrySetCreateBody.date
                    this.transactionId = bookkeepingEntrySetCreateBody.transactionId
                    additionalProperties(bookkeepingEntrySetCreateBody.additionalProperties)
                }

            /** The bookkeeping entries. */
            @JsonProperty("entries")
            fun entries(entries: List<Entry>) = apply { this.entries = entries }

            /**
             * The date of the transaction. Optional if `transaction_id` is provided, in which case
             * we use the `date` of that transaction. Required otherwise.
             */
            @JsonProperty("date") fun date(date: OffsetDateTime) = apply { this.date = date }

            /** The identifier of the Transaction related to this entry set, if any. */
            @JsonProperty("transaction_id")
            fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BookkeepingEntrySetCreateBody =
                BookkeepingEntrySetCreateBody(
                    checkNotNull(entries) { "`entries` is required but was not set" }.toImmutable(),
                    date,
                    transactionId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookkeepingEntrySetCreateBody && entries == other.entries && date == other.date && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entries, date, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingEntrySetCreateBody{entries=$entries, date=$date, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entries: MutableList<Entry> = mutableListOf()
        private var date: OffsetDateTime? = null
        private var transactionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bookkeepingEntrySetCreateParams: BookkeepingEntrySetCreateParams) =
            apply {
                entries = bookkeepingEntrySetCreateParams.entries.toMutableList()
                date = bookkeepingEntrySetCreateParams.date
                transactionId = bookkeepingEntrySetCreateParams.transactionId
                additionalHeaders = bookkeepingEntrySetCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    bookkeepingEntrySetCreateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    bookkeepingEntrySetCreateParams.additionalBodyProperties.toMutableMap()
            }

        /** The bookkeeping entries. */
        fun entries(entries: List<Entry>) = apply {
            this.entries.clear()
            this.entries.addAll(entries)
        }

        /** The bookkeeping entries. */
        fun addEntry(entry: Entry) = apply { this.entries.add(entry) }

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        fun date(date: OffsetDateTime) = apply { this.date = date }

        /** The identifier of the Transaction related to this entry set, if any. */
        fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): BookkeepingEntrySetCreateParams =
            BookkeepingEntrySetCreateParams(
                entries.toImmutable(),
                date,
                transactionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Entry.Builder::class)
    @NoAutoDetect
    class Entry
    private constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the Bookkeeping Account impacted by this entry. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The entry amount in the minor unit of the account currency. For dollars, for example,
         * this is cents. Debit entries have positive amounts; credit entries have negative amounts.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entry: Entry) = apply {
                this.accountId = entry.accountId
                this.amount = entry.amount
                additionalProperties(entry.additionalProperties)
            }

            /** The identifier for the Bookkeeping Account impacted by this entry. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The entry amount in the minor unit of the account currency. For dollars, for example,
             * this is cents. Debit entries have positive amounts; credit entries have negative
             * amounts.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Entry =
                Entry(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Entry && accountId == other.accountId && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entry{accountId=$accountId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetCreateParams && entries == other.entries && date == other.date && transactionId == other.transactionId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entries, date, transactionId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetCreateParams{entries=$entries, date=$date, transactionId=$transactionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
