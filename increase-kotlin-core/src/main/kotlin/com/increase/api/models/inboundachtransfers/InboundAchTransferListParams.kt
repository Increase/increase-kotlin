// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** List Inbound ACH Transfers */
class InboundAchTransferListParams private constructor(
    private val accountId: String?,
    private val accountNumberId: String?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Filter Inbound ACH Transfers to ones belonging to the specified Account. */
    fun accountId(): String? = accountId

    /** Filter Inbound ACH Transfers to ones belonging to the specified Account Number. */
    fun accountNumberId(): String? = accountNumberId

    fun createdAt(): CreatedAt? = createdAt

    /** Return the page of entries after this one. */
    fun cursor(): String? = cursor

    /**
     * Limit the size of the list that is returned. The default (and maximum) is 100
     * objects.
     */
    fun limit(): Long? = limit

    fun status(): Status? = status

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
      val queryParams = QueryParams.builder()
      this.accountId?.let {
          queryParams.put(
            "account_id", listOf(it.toString())
          )
      }
      this.accountNumberId?.let {
          queryParams.put(
            "account_number_id", listOf(it.toString())
          )
      }
      this.createdAt?.forEachQueryParam { key, values ->
          queryParams.put(
            "created_at.$key", values
          )
      }
      this.cursor?.let {
          queryParams.put(
            "cursor", listOf(it.toString())
          )
      }
      this.limit?.let {
          queryParams.put(
            "limit", listOf(it.toString())
          )
      }
      this.status?.forEachQueryParam { key, values ->
          queryParams.put(
            "status.$key", values
          )
      }
      queryParams.putAll(additionalQueryParams)
      return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): InboundAchTransferListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountId: String? = null
        private var accountNumberId: String? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inboundAchTransferListParams: InboundAchTransferListParams) =
            apply {
                accountId = inboundAchTransferListParams.accountId
                accountNumberId = inboundAchTransferListParams.accountNumberId
                createdAt = inboundAchTransferListParams.createdAt
                cursor = inboundAchTransferListParams.cursor
                limit = inboundAchTransferListParams.limit
                status = inboundAchTransferListParams.status
                additionalHeaders = inboundAchTransferListParams.additionalHeaders.toBuilder()
                additionalQueryParams = inboundAchTransferListParams.additionalQueryParams.toBuilder()
            }

        /** Filter Inbound ACH Transfers to ones belonging to the specified Account. */
        fun accountId(accountId: String?) =
            apply {
                this.accountId = accountId
            }

        /** Filter Inbound ACH Transfers to ones belonging to the specified Account Number. */
        fun accountNumberId(accountNumberId: String?) =
            apply {
                this.accountNumberId = accountNumberId
            }

        fun createdAt(createdAt: CreatedAt?) =
            apply {
                this.createdAt = createdAt
            }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) =
            apply {
                this.cursor = cursor
            }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long?) =
            apply {
                this.limit = limit
            }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        fun status(status: Status?) =
            apply {
                this.status = status
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
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

    class CreatedAt private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,

    ) {

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.after?.let {
              putParam(
                "after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
              )
          }
          this.before?.let {
              putParam(
                "before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
              )
          }
          this.onOrAfter?.let {
              putParam(
                "on_or_after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
              )
          }
          this.onOrBefore?.let {
              putParam(
                "on_or_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
              )
          }
          additionalProperties.keys().forEach {
              putParam(it, additionalProperties.values(it))
          }
        }

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

            internal fun from(createdAt: CreatedAt) =
                apply {
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
            fun after(after: OffsetDateTime?) =
                apply {
                    this.after = after
                }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) =
                apply {
                    this.before = before
                }

            /**
             * Return results on or after this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) =
                apply {
                    this.onOrAfter = onOrAfter
                }

            /**
             * Return results on or before this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) =
                apply {
                    this.onOrBefore = onOrBefore
                }

            fun additionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: String) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAdditionalProperties(key: String, values: Iterable<String>) =
                apply {
                    additionalProperties.put(key, values)
                }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) =
                apply {
                    additionalProperties.replace(key, value)
                }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) =
                apply {
                    additionalProperties.replace(key, values)
                }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.replaceAll(additionalProperties)
                }

            fun replaceAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.replaceAll(additionalProperties)
                }

            fun removeAdditionalProperties(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
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

        override fun toString() = "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    class Status private constructor(
        private val in_: List<In>?,
        private val additionalProperties: QueryParams,

    ) {

        /**
         * Filter Inbound ACH Transfers to those with the specified status. For GET
         * requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.in_?.let {
              putParam(
                "in", listOf(it.joinToString(separator = ","))
              )
          }
          additionalProperties.keys().forEach {
              putParam(it, additionalProperties.values(it))
          }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Status]. */
            fun builder() = Builder()
        }

        /** A builder for [Status]. */
        class Builder internal constructor() {

            private var in_: MutableList<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(status: Status) =
                apply {
                    in_ = status.in_?.toMutableList()
                    additionalProperties = status.additionalProperties.toBuilder()
                }

            /**
             * Filter Inbound ACH Transfers to those with the specified status. For GET
             * requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) =
                apply {
                    this.in_ = in_?.toMutableList()
                }

            /**
             * Filter Inbound ACH Transfers to those with the specified status. For GET
             * requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun addIn(in_: In) =
                apply {
                    this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
                }

            fun additionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: String) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAdditionalProperties(key: String, values: Iterable<String>) =
                apply {
                    additionalProperties.put(key, values)
                }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) =
                apply {
                    additionalProperties.replace(key, value)
                }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) =
                apply {
                    additionalProperties.replace(key, values)
                }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) =
                apply {
                    this.additionalProperties.replaceAll(additionalProperties)
                }

            fun replaceAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.replaceAll(additionalProperties)
                }

            fun removeAdditionalProperties(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    additionalProperties.removeAll(keys)
                }

            fun build(): Status =
                Status(
                  in_?.toImmutable(), additionalProperties.build()
                )
        }

        class In @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The Inbound ACH Transfer is awaiting action, will transition automatically if no
                 * action is taken.
                 */
                val PENDING = of("pending")

                /** The Inbound ACH Transfer has been declined. */
                val DECLINED = of("declined")

                /** The Inbound ACH Transfer is accepted. */
                val ACCEPTED = of("accepted")

                /** The Inbound ACH Transfer has been returned. */
                val RETURNED = of("returned")

                fun of(value: String) = In(JsonField.of(value))
            }

            /** An enum containing [In]'s known values. */
            enum class Known {
                /**
                 * The Inbound ACH Transfer is awaiting action, will transition automatically if no
                 * action is taken.
                 */
                PENDING,
                /** The Inbound ACH Transfer has been declined. */
                DECLINED,
                /** The Inbound ACH Transfer is accepted. */
                ACCEPTED,
                /** The Inbound ACH Transfer has been returned. */
                RETURNED,
            }

            /**
             * An enum containing [In]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [In] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The Inbound ACH Transfer is awaiting action, will transition automatically if no
                 * action is taken.
                 */
                PENDING,
                /** The Inbound ACH Transfer has been declined. */
                DECLINED,
                /** The Inbound ACH Transfer is accepted. */
                ACCEPTED,
                /** The Inbound ACH Transfer has been returned. */
                RETURNED,
                /** An enum member indicating that [In] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if
             * you want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    DECLINED -> Value.DECLINED
                    ACCEPTED -> Value.ACCEPTED
                    RETURNED -> Value.RETURNED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    DECLINED -> Known.DECLINED
                    ACCEPTED -> Known.ACCEPTED
                    RETURNED -> Known.RETURNED
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

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

          return /* spotless:off */ other is Status && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is InboundAchTransferListParams && accountId == other.accountId && accountNumberId == other.accountNumberId && createdAt == other.createdAt && cursor == other.cursor && limit == other.limit && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, accountNumberId, createdAt, cursor, limit, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "InboundAchTransferListParams{accountId=$accountId, accountNumberId=$accountNumberId, createdAt=$createdAt, cursor=$cursor, limit=$limit, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
