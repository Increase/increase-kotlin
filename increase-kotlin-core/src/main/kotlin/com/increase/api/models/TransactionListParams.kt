// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class TransactionListParams
constructor(
    private val accountId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val routeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountId(): String? = accountId

    fun category(): Category? = category

    fun createdAt(): CreatedAt? = createdAt

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun routeId(): String? = routeId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("account_id", listOf(it.toString())) }
        this.category?.forEachQueryParam { key, values -> queryParams.put("category.$key", values) }
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at.$key", values)
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.routeId?.let { queryParams.put("route_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var routeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            accountId = transactionListParams.accountId
            category = transactionListParams.category
            createdAt = transactionListParams.createdAt
            cursor = transactionListParams.cursor
            limit = transactionListParams.limit
            routeId = transactionListParams.routeId
            additionalHeaders = transactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Transactions for those belonging to the specified Account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        fun category(category: Category) = apply { this.category = category }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        /**
         * Filter Transactions for those belonging to the specified route. This could be a Card ID
         * or an Account Number ID.
         */
        fun routeId(routeId: String) = apply { this.routeId = routeId }

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

        fun build(): TransactionListParams =
            TransactionListParams(
                accountId,
                category,
                createdAt,
                cursor,
                limit,
                routeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        /**
         * Return results whose value is in the provided list. For GET requests, this should be
         * encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(category: Category) = apply {
                this.in_ = category.in_
                additionalProperties(category.additionalProperties)
            }

            /**
             * Return results whose value is in the provided list. For GET requests, this should be
             * encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Category = Category(in_?.toImmutable(), additionalProperties.toImmutable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT_TRANSFER_INTENTION = of("account_transfer_intention")

                val ACH_TRANSFER_INTENTION = of("ach_transfer_intention")

                val ACH_TRANSFER_REJECTION = of("ach_transfer_rejection")

                val ACH_TRANSFER_RETURN = of("ach_transfer_return")

                val CASHBACK_PAYMENT = of("cashback_payment")

                val CARD_DISPUTE_ACCEPTANCE = of("card_dispute_acceptance")

                val CARD_DISPUTE_LOSS = of("card_dispute_loss")

                val CARD_REFUND = of("card_refund")

                val CARD_SETTLEMENT = of("card_settlement")

                val CARD_REVENUE_PAYMENT = of("card_revenue_payment")

                val CHECK_DEPOSIT_ACCEPTANCE = of("check_deposit_acceptance")

                val CHECK_DEPOSIT_RETURN = of("check_deposit_return")

                val CHECK_TRANSFER_DEPOSIT = of("check_transfer_deposit")

                val FEE_PAYMENT = of("fee_payment")

                val INBOUND_ACH_TRANSFER = of("inbound_ach_transfer")

                val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                    of("inbound_ach_transfer_return_intention")

                val INBOUND_CHECK_DEPOSIT_RETURN_INTENTION =
                    of("inbound_check_deposit_return_intention")

                val INBOUND_CHECK_ADJUSTMENT = of("inbound_check_adjustment")

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                    of("inbound_real_time_payments_transfer_confirmation")

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    of("inbound_real_time_payments_transfer_decline")

                val INBOUND_WIRE_REVERSAL = of("inbound_wire_reversal")

                val INBOUND_WIRE_TRANSFER = of("inbound_wire_transfer")

                val INBOUND_WIRE_TRANSFER_REVERSAL = of("inbound_wire_transfer_reversal")

                val INTEREST_PAYMENT = of("interest_payment")

                val INTERNAL_SOURCE = of("internal_source")

                val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                    of("real_time_payments_transfer_acknowledgement")

                val SAMPLE_FUNDS = of("sample_funds")

                val WIRE_TRANSFER_INTENTION = of("wire_transfer_intention")

                val OTHER = of("other")

                fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CASHBACK_PAYMENT,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_DISPUTE_LOSS,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CARD_REVENUE_PAYMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                INBOUND_CHECK_ADJUSTMENT,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CASHBACK_PAYMENT,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_DISPUTE_LOSS,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CARD_REVENUE_PAYMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                INBOUND_CHECK_ADJUSTMENT,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Value.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Value.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Value.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Value.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Value.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_CHECK_ADJUSTMENT -> Value.INBOUND_CHECK_ADJUSTMENT
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Value.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Known.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Known.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Known.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Known.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Known.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_CHECK_ADJUSTMENT -> Known.INBOUND_CHECK_ADJUSTMENT
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Known.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is In && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let {
                putParam("after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.before?.let {
                putParam("before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrAfter?.let {
                putParam("on_or_after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrBefore?.let {
                putParam("on_or_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(createdAt: CreatedAt) = apply {
                this.after = createdAt.after
                this.before = createdAt.before
                this.onOrAfter = createdAt.onOrAfter
                this.onOrBefore = createdAt.onOrBefore
                additionalProperties(createdAt.additionalProperties)
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && after == other.after && before == other.before && onOrAfter == other.onOrAfter && onOrBefore == other.onOrBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListParams && accountId == other.accountId && category == other.category && createdAt == other.createdAt && cursor == other.cursor && limit == other.limit && routeId == other.routeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, category, createdAt, cursor, limit, routeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionListParams{accountId=$accountId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, routeId=$routeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
