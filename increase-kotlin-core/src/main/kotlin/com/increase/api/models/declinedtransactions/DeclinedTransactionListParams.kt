// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** List Declined Transactions */
class DeclinedTransactionListParams
private constructor(
    private val accountId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val routeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter Declined Transactions to ones belonging to the specified Account. */
    fun accountId(): String? = accountId

    fun category(): Category? = category

    fun createdAt(): CreatedAt? = createdAt

    /** Return the page of entries after this one. */
    fun cursor(): String? = cursor

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Long? = limit

    /** Filter Declined Transactions to those belonging to the specified route. */
    fun routeId(): String? = routeId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DeclinedTransactionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [DeclinedTransactionListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [DeclinedTransactionListParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var routeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(declinedTransactionListParams: DeclinedTransactionListParams) = apply {
            accountId = declinedTransactionListParams.accountId
            category = declinedTransactionListParams.category
            createdAt = declinedTransactionListParams.createdAt
            cursor = declinedTransactionListParams.cursor
            limit = declinedTransactionListParams.limit
            routeId = declinedTransactionListParams.routeId
            additionalHeaders = declinedTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = declinedTransactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Declined Transactions to ones belonging to the specified Account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        fun category(category: Category?) = apply { this.category = category }

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Filter Declined Transactions to those belonging to the specified route. */
        fun routeId(routeId: String?) = apply { this.routeId = routeId }

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

        /**
         * Returns an immutable instance of [DeclinedTransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DeclinedTransactionListParams =
            DeclinedTransactionListParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("account_id", it) }
                category?.let {
                    it.in_()?.let { put("category.in", it.joinToString(",") { it.toString() }) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("category.$key", value)
                        }
                    }
                }
                createdAt?.let {
                    it.after()?.let {
                        put("created_at.after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.before()?.let {
                        put("created_at.before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.onOrAfter()?.let {
                        put(
                            "created_at.on_or_after",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.onOrBefore()?.let {
                        put(
                            "created_at.on_or_before",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at.$key", value)
                        }
                    }
                }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                routeId?.let { put("route_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Category
    private constructor(private val in_: List<In>?, private val additionalProperties: QueryParams) {

        /**
         * Return results whose value is in the provided list. For GET requests, this should be
         * encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Category]. */
            fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var in_: MutableList<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(category: Category) = apply {
                in_ = category.in_?.toMutableList()
                additionalProperties = category.additionalProperties.toBuilder()
            }

            /**
             * Return results whose value is in the provided list. For GET requests, this should be
             * encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Adds a single [In] to [Builder.in_].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIn(in_: In) = apply {
                this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Category].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Category = Category(in_?.toImmutable(), additionalProperties.build())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** ACH Decline: details will be under the `ach_decline` object. */
                val ACH_DECLINE = of("ach_decline")

                /** Card Decline: details will be under the `card_decline` object. */
                val CARD_DECLINE = of("card_decline")

                /** Check Decline: details will be under the `check_decline` object. */
                val CHECK_DECLINE = of("check_decline")

                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    of("inbound_real_time_payments_transfer_decline")

                /** Wire Decline: details will be under the `wire_decline` object. */
                val WIRE_DECLINE = of("wire_decline")

                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                val CHECK_DEPOSIT_REJECTION = of("check_deposit_rejection")

                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                val OTHER = of("other")

                fun of(value: String) = In(JsonField.of(value))
            }

            /** An enum containing [In]'s known values. */
            enum class Known {
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                OTHER,
            }

            /**
             * An enum containing [In]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [In] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                OTHER,
                /** An enum member indicating that [In] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACH_DECLINE -> Value.ACH_DECLINE
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CHECK_DECLINE -> Value.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    WIRE_DECLINE -> Value.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Value.CHECK_DEPOSIT_REJECTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACH_DECLINE -> Known.ACH_DECLINE
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CHECK_DECLINE -> Known.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    WIRE_DECLINE -> Known.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Known.CHECK_DEPOSIT_REJECTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): In = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                in_ == other.in_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"
    }

    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,
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

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(createdAt: CreatedAt) = apply {
                after = createdAt.after
                before = createdAt.before
                onOrAfter = createdAt.onOrAfter
                onOrBefore = createdAt.onOrBefore
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime?) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt =
                CreatedAt(after, before, onOrAfter, onOrBefore, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                after == other.after &&
                before == other.before &&
                onOrAfter == other.onOrAfter &&
                onOrBefore == other.onOrBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeclinedTransactionListParams &&
            accountId == other.accountId &&
            category == other.category &&
            createdAt == other.createdAt &&
            cursor == other.cursor &&
            limit == other.limit &&
            routeId == other.routeId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            category,
            createdAt,
            cursor,
            limit,
            routeId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DeclinedTransactionListParams{accountId=$accountId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, routeId=$routeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
