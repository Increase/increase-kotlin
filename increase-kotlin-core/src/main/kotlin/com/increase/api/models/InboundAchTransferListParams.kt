// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** List Inbound ACH Transfers */
class InboundAchTransferListParams
constructor(
    private val accountId: String?,
    private val accountNumberId: String?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Filter Inbound ACH Tranfers to ones belonging to the specified Account. */
    fun accountId(): String? = accountId

    /** Filter Inbound ACH Tranfers to ones belonging to the specified Account Number. */
    fun accountNumberId(): String? = accountNumberId

    fun createdAt(): CreatedAt? = createdAt

    /** Return the page of entries after this one. */
    fun cursor(): String? = cursor

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Long? = limit

    /** Filter Inbound ACH Transfers to those with the specified status. */
    fun status(): Status? = status

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("account_id", listOf(it.toString())) }
        this.accountNumberId?.let { queryParams.put("account_number_id", listOf(it.toString())) }
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at.$key", values)
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
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
        private var accountNumberId: String? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inboundAchTransferListParams: InboundAchTransferListParams) = apply {
            accountId = inboundAchTransferListParams.accountId
            accountNumberId = inboundAchTransferListParams.accountNumberId
            createdAt = inboundAchTransferListParams.createdAt
            cursor = inboundAchTransferListParams.cursor
            limit = inboundAchTransferListParams.limit
            status = inboundAchTransferListParams.status
            additionalHeaders = inboundAchTransferListParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboundAchTransferListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Inbound ACH Tranfers to ones belonging to the specified Account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Filter Inbound ACH Tranfers to ones belonging to the specified Account Number. */
        fun accountNumberId(accountNumberId: String?) = apply {
            this.accountNumberId = accountNumberId
        }

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Filter Inbound ACH Transfers to those with the specified status. */
        fun status(status: Status?) = apply { this.status = status }

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

        fun build(): InboundAchTransferListParams =
            InboundAchTransferListParams(
                accountId,
                accountNumberId,
                createdAt,
                cursor,
                limit,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

        fun _additionalProperties(): QueryParams = additionalProperties

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
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
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

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.build(),
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val DECLINED = of("declined")

            val ACCEPTED = of("accepted")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                DECLINED -> Value.DECLINED
                ACCEPTED -> Value.ACCEPTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                DECLINED -> Known.DECLINED
                ACCEPTED -> Known.ACCEPTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListParams && accountId == other.accountId && accountNumberId == other.accountNumberId && createdAt == other.createdAt && cursor == other.cursor && limit == other.limit && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, accountNumberId, createdAt, cursor, limit, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListParams{accountId=$accountId, accountNumberId=$accountNumberId, createdAt=$createdAt, cursor=$cursor, limit=$limit, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
