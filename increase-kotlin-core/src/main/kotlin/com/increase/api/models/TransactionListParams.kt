package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class TransactionListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val accountId: String?,
    private val routeId: String?,
    private val createdAt: CreatedAt?,
    private val category: Category?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun accountId(): String? = accountId

    fun routeId(): String? = routeId

    fun createdAt(): CreatedAt? = createdAt

    fun category(): Category? = category

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.accountId?.let { params.put("account_id", listOf(it.toString())) }
        this.routeId?.let { params.put("route_id", listOf(it.toString())) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at.$key", values) }
        this.category?.forEachQueryParam { key, values -> params.put("category.$key", values) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionListParams &&
            this.cursor == other.cursor &&
            this.limit == other.limit &&
            this.accountId == other.accountId &&
            this.routeId == other.routeId &&
            this.createdAt == other.createdAt &&
            this.category == other.category &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cursor,
            limit,
            accountId,
            routeId,
            createdAt,
            category,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "TransactionListParams{cursor=$cursor, limit=$limit, accountId=$accountId, routeId=$routeId, createdAt=$createdAt, category=$category, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var accountId: String? = null
        private var routeId: String? = null
        private var createdAt: CreatedAt? = null
        private var category: Category? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            this.cursor = transactionListParams.cursor
            this.limit = transactionListParams.limit
            this.accountId = transactionListParams.accountId
            this.routeId = transactionListParams.routeId
            this.createdAt = transactionListParams.createdAt
            this.category = transactionListParams.category
            additionalQueryParams(transactionListParams.additionalQueryParams)
            additionalHeaders(transactionListParams.additionalHeaders)
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter Transactions for those belonging to the specified Account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** Filter Transactions for those belonging to the specified route. */
        fun routeId(routeId: String) = apply { this.routeId = routeId }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        fun category(category: Category) = apply { this.category = category }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): TransactionListParams =
            TransactionListParams(
                cursor,
                limit,
                accountId,
                routeId,
                createdAt,
                category,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
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

        private var hashCode: Int = 0

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
            this.after?.let { putParam("after", listOf(it.toString())) }
            this.before?.let { putParam("before", listOf(it.toString())) }
            this.onOrAfter?.let { putParam("on_or_after", listOf(it.toString())) }
            this.onOrBefore?.let { putParam("on_or_before", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                this.after == other.after &&
                this.before == other.before &&
                this.onOrAfter == other.onOrAfter &&
                this.onOrBefore == other.onOrBefore &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                this.in_ == other.in_ &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(in_, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"

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

            fun build(): Category =
                Category(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_TRANSFER_INTENTION = In(JsonField.of("account_transfer_intention"))

                val ACH_CHECK_CONVERSION_RETURN = In(JsonField.of("ach_check_conversion_return"))

                val ACH_CHECK_CONVERSION = In(JsonField.of("ach_check_conversion"))

                val ACH_TRANSFER_INTENTION = In(JsonField.of("ach_transfer_intention"))

                val ACH_TRANSFER_REJECTION = In(JsonField.of("ach_transfer_rejection"))

                val ACH_TRANSFER_RETURN = In(JsonField.of("ach_transfer_return"))

                val CARD_DISPUTE_ACCEPTANCE = In(JsonField.of("card_dispute_acceptance"))

                val CARD_REFUND = In(JsonField.of("card_refund"))

                val CARD_SETTLEMENT = In(JsonField.of("card_settlement"))

                val CHECK_DEPOSIT_ACCEPTANCE = In(JsonField.of("check_deposit_acceptance"))

                val CHECK_DEPOSIT_RETURN = In(JsonField.of("check_deposit_return"))

                val CHECK_TRANSFER_INTENTION = In(JsonField.of("check_transfer_intention"))

                val CHECK_TRANSFER_RETURN = In(JsonField.of("check_transfer_return"))

                val CHECK_TRANSFER_REJECTION = In(JsonField.of("check_transfer_rejection"))

                val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                    In(JsonField.of("check_transfer_stop_payment_request"))

                val DISPUTE_RESOLUTION = In(JsonField.of("dispute_resolution"))

                val EMPYREAL_CASH_DEPOSIT = In(JsonField.of("empyreal_cash_deposit"))

                val INBOUND_ACH_TRANSFER = In(JsonField.of("inbound_ach_transfer"))

                val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                    In(JsonField.of("inbound_ach_transfer_return_intention"))

                val INBOUND_CHECK = In(JsonField.of("inbound_check"))

                val INBOUND_INTERNATIONAL_ACH_TRANSFER =
                    In(JsonField.of("inbound_international_ach_transfer"))

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                    In(JsonField.of("inbound_real_time_payments_transfer_confirmation"))

                val INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL =
                    In(JsonField.of("inbound_wire_drawdown_payment_reversal"))

                val INBOUND_WIRE_DRAWDOWN_PAYMENT =
                    In(JsonField.of("inbound_wire_drawdown_payment"))

                val INBOUND_WIRE_REVERSAL = In(JsonField.of("inbound_wire_reversal"))

                val INBOUND_WIRE_TRANSFER = In(JsonField.of("inbound_wire_transfer"))

                val INTEREST_PAYMENT = In(JsonField.of("interest_payment"))

                val INTERNAL_GENERAL_LEDGER_TRANSACTION =
                    In(JsonField.of("internal_general_ledger_transaction"))

                val INTERNAL_SOURCE = In(JsonField.of("internal_source"))

                val CARD_ROUTE_REFUND = In(JsonField.of("card_route_refund"))

                val CARD_ROUTE_SETTLEMENT = In(JsonField.of("card_route_settlement"))

                val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                    In(JsonField.of("real_time_payments_transfer_acknowledgement"))

                val SAMPLE_FUNDS = In(JsonField.of("sample_funds"))

                val WIRE_DRAWDOWN_PAYMENT_INTENTION =
                    In(JsonField.of("wire_drawdown_payment_intention"))

                val WIRE_DRAWDOWN_PAYMENT_REJECTION =
                    In(JsonField.of("wire_drawdown_payment_rejection"))

                val WIRE_TRANSFER_INTENTION = In(JsonField.of("wire_transfer_intention"))

                val WIRE_TRANSFER_REJECTION = In(JsonField.of("wire_transfer_rejection"))

                val OTHER = In(JsonField.of("other"))

                fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_CHECK_CONVERSION_RETURN,
                ACH_CHECK_CONVERSION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_INTENTION,
                CHECK_TRANSFER_RETURN,
                CHECK_TRANSFER_REJECTION,
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                DISPUTE_RESOLUTION,
                EMPYREAL_CASH_DEPOSIT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK,
                INBOUND_INTERNATIONAL_ACH_TRANSFER,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                INBOUND_WIRE_DRAWDOWN_PAYMENT,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INTEREST_PAYMENT,
                INTERNAL_GENERAL_LEDGER_TRANSACTION,
                INTERNAL_SOURCE,
                CARD_ROUTE_REFUND,
                CARD_ROUTE_SETTLEMENT,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_DRAWDOWN_PAYMENT_INTENTION,
                WIRE_DRAWDOWN_PAYMENT_REJECTION,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_CHECK_CONVERSION_RETURN,
                ACH_CHECK_CONVERSION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_INTENTION,
                CHECK_TRANSFER_RETURN,
                CHECK_TRANSFER_REJECTION,
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                DISPUTE_RESOLUTION,
                EMPYREAL_CASH_DEPOSIT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK,
                INBOUND_INTERNATIONAL_ACH_TRANSFER,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                INBOUND_WIRE_DRAWDOWN_PAYMENT,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INTEREST_PAYMENT,
                INTERNAL_GENERAL_LEDGER_TRANSACTION,
                INTERNAL_SOURCE,
                CARD_ROUTE_REFUND,
                CARD_ROUTE_SETTLEMENT,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_DRAWDOWN_PAYMENT_INTENTION,
                WIRE_DRAWDOWN_PAYMENT_REJECTION,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                    ACH_CHECK_CONVERSION_RETURN -> Value.ACH_CHECK_CONVERSION_RETURN
                    ACH_CHECK_CONVERSION -> Value.ACH_CHECK_CONVERSION
                    ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                    CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_INTENTION -> Value.CHECK_TRANSFER_INTENTION
                    CHECK_TRANSFER_RETURN -> Value.CHECK_TRANSFER_RETURN
                    CHECK_TRANSFER_REJECTION -> Value.CHECK_TRANSFER_REJECTION
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    DISPUTE_RESOLUTION -> Value.DISPUTE_RESOLUTION
                    EMPYREAL_CASH_DEPOSIT -> Value.EMPYREAL_CASH_DEPOSIT
                    INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK -> Value.INBOUND_CHECK
                    INBOUND_INTERNATIONAL_ACH_TRANSFER -> Value.INBOUND_INTERNATIONAL_ACH_TRANSFER
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                        Value.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                    INBOUND_WIRE_DRAWDOWN_PAYMENT -> Value.INBOUND_WIRE_DRAWDOWN_PAYMENT
                    INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                    INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                    INTERNAL_GENERAL_LEDGER_TRANSACTION -> Value.INTERNAL_GENERAL_LEDGER_TRANSACTION
                    INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                    CARD_ROUTE_REFUND -> Value.CARD_ROUTE_REFUND
                    CARD_ROUTE_SETTLEMENT -> Value.CARD_ROUTE_SETTLEMENT
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                    WIRE_DRAWDOWN_PAYMENT_INTENTION -> Value.WIRE_DRAWDOWN_PAYMENT_INTENTION
                    WIRE_DRAWDOWN_PAYMENT_REJECTION -> Value.WIRE_DRAWDOWN_PAYMENT_REJECTION
                    WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Value.WIRE_TRANSFER_REJECTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                    ACH_CHECK_CONVERSION_RETURN -> Known.ACH_CHECK_CONVERSION_RETURN
                    ACH_CHECK_CONVERSION -> Known.ACH_CHECK_CONVERSION
                    ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                    CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_INTENTION -> Known.CHECK_TRANSFER_INTENTION
                    CHECK_TRANSFER_RETURN -> Known.CHECK_TRANSFER_RETURN
                    CHECK_TRANSFER_REJECTION -> Known.CHECK_TRANSFER_REJECTION
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    DISPUTE_RESOLUTION -> Known.DISPUTE_RESOLUTION
                    EMPYREAL_CASH_DEPOSIT -> Known.EMPYREAL_CASH_DEPOSIT
                    INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK -> Known.INBOUND_CHECK
                    INBOUND_INTERNATIONAL_ACH_TRANSFER -> Known.INBOUND_INTERNATIONAL_ACH_TRANSFER
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                        Known.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                    INBOUND_WIRE_DRAWDOWN_PAYMENT -> Known.INBOUND_WIRE_DRAWDOWN_PAYMENT
                    INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                    INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                    INTERNAL_GENERAL_LEDGER_TRANSACTION -> Known.INTERNAL_GENERAL_LEDGER_TRANSACTION
                    INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                    CARD_ROUTE_REFUND -> Known.CARD_ROUTE_REFUND
                    CARD_ROUTE_SETTLEMENT -> Known.CARD_ROUTE_SETTLEMENT
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                    WIRE_DRAWDOWN_PAYMENT_INTENTION -> Known.WIRE_DRAWDOWN_PAYMENT_INTENTION
                    WIRE_DRAWDOWN_PAYMENT_REJECTION -> Known.WIRE_DRAWDOWN_PAYMENT_REJECTION
                    WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Known.WIRE_TRANSFER_REJECTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
