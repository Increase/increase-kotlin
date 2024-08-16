// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Enum
import com.increase.api.core.ContentTypes
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class ExportListParams constructor(
  private val category: Category?,
  private val createdAt: CreatedAt?,
  private val cursor: String?,
  private val idempotencyKey: String?,
  private val limit: Long?,
  private val status: Status?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun category(): Category? = category

    fun createdAt(): CreatedAt? = createdAt

    fun cursor(): String? = cursor

    fun idempotencyKey(): String? = idempotencyKey

    fun limit(): Long? = limit

    fun status(): Status? = status

    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.category?.forEachQueryParam { key, values -> 
          params.put("category.$key", values)
      }
      this.createdAt?.forEachQueryParam { key, values -> 
          params.put("created_at.$key", values)
      }
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.idempotencyKey?.let {
          params.put("idempotency_key", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.status?.forEachQueryParam { key, values -> 
          params.put("status.$key", values)
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ExportListParams &&
          this.category == other.category &&
          this.createdAt == other.createdAt &&
          this.cursor == other.cursor &&
          this.idempotencyKey == other.idempotencyKey &&
          this.limit == other.limit &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          category,
          createdAt,
          cursor,
          idempotencyKey,
          limit,
          status,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ExportListParams{category=$category, createdAt=$createdAt, cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(exportListParams: ExportListParams) = apply {
            this.category = exportListParams.category
            this.createdAt = exportListParams.createdAt
            this.cursor = exportListParams.cursor
            this.idempotencyKey = exportListParams.idempotencyKey
            this.limit = exportListParams.limit
            this.status = exportListParams.status
            additionalQueryParams(exportListParams.additionalQueryParams)
            additionalHeaders(exportListParams.additionalHeaders)
            additionalBodyProperties(exportListParams.additionalBodyProperties)
        }

        fun category(category: Category) = apply {
            this.category = category
        }

        fun createdAt(createdAt: CreatedAt) = apply {
            this.createdAt = createdAt
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for
         * that object. This value is unique across Increase and is used to ensure that a
         * request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        fun status(status: Status) = apply {
            this.status = status
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): ExportListParams = ExportListParams(
            category,
            createdAt,
            cursor,
            idempotencyKey,
            limit,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category private constructor(private val in_: List<In>?, private val additionalProperties: Map<String, List<String>>, ) {

        private var hashCode: Int = 0

        /**
         * Filter Exports for those with the specified category or categories. For GET
         * requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.in_?.let {
              putParam("in", listOf(it.joinToString(separator = ",")))
          }
          this.additionalProperties.forEach { key, values -> 
              putParam(key, values)
          }
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
             * Filter Exports for those with the specified category or categories. For GET
             * requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply {
                this.in_ = in_
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Category = Category(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is In &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_STATEMENT_OFX = In(JsonField.of("account_statement_ofx"))

                val TRANSACTION_CSV = In(JsonField.of("transaction_csv"))

                val BALANCE_CSV = In(JsonField.of("balance_csv"))

                val BOOKKEEPING_ACCOUNT_BALANCE_CSV = In(JsonField.of("bookkeeping_account_balance_csv"))

                val ENTITY_CSV = In(JsonField.of("entity_csv"))

                val VENDOR_CSV = In(JsonField.of("vendor_csv"))

                fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_STATEMENT_OFX,
                TRANSACTION_CSV,
                BALANCE_CSV,
                BOOKKEEPING_ACCOUNT_BALANCE_CSV,
                ENTITY_CSV,
                VENDOR_CSV,
            }

            enum class Value {
                ACCOUNT_STATEMENT_OFX,
                TRANSACTION_CSV,
                BALANCE_CSV,
                BOOKKEEPING_ACCOUNT_BALANCE_CSV,
                ENTITY_CSV,
                VENDOR_CSV,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Value.ENTITY_CSV
                VENDOR_CSV -> Value.VENDOR_CSV
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Known.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Known.ENTITY_CSV
                VENDOR_CSV -> Known.VENDOR_CSV
                else -> throw IncreaseInvalidDataException("Unknown In: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt private constructor(
      private val after: OffsetDateTime?,
      private val before: OffsetDateTime?,
      private val onOrAfter: OffsetDateTime?,
      private val onOrBefore: OffsetDateTime?,
      private val additionalProperties: Map<String, List<String>>,

    ) {

        private var hashCode: Int = 0

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

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.after?.let {
              putParam("after", listOf(it.toString()))
          }
          this.before?.let {
              putParam("before", listOf(it.toString()))
          }
          this.onOrAfter?.let {
              putParam("on_or_after", listOf(it.toString()))
          }
          this.onOrBefore?.let {
              putParam("on_or_before", listOf(it.toString()))
          }
          this.additionalProperties.forEach { key, values -> 
              putParam(key, values)
          }
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
            hashCode = Objects.hash(
                after,
                before,
                onOrAfter,
                onOrBefore,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

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
            fun after(after: OffsetDateTime) = apply {
                this.after = after
            }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply {
                this.before = before
            }

            /**
             * Return results on or after this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply {
                this.onOrAfter = onOrAfter
            }

            /**
             * Return results on or before this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply {
                this.onOrBefore = onOrBefore
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CreatedAt = CreatedAt(
                after,
                before,
                onOrAfter,
                onOrBefore,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    @JsonDeserialize(builder = Status.Builder::class)
    @NoAutoDetect
    class Status private constructor(private val in_: List<In>?, private val additionalProperties: Map<String, List<String>>, ) {

        private var hashCode: Int = 0

        /**
         * Filter Exports for those with the specified status or statuses. For GET
         * requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.in_?.let {
              putParam("in", listOf(it.joinToString(separator = ",")))
          }
          this.additionalProperties.forEach { key, values -> 
              putParam(key, values)
          }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.in_ == other.in_ &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(in_, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(status: Status) = apply {
                this.in_ = status.in_
                additionalProperties(status.additionalProperties)
            }

            /**
             * Filter Exports for those with the specified status or statuses. For GET
             * requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply {
                this.in_ = in_
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Status = Status(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is In &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PENDING = In(JsonField.of("pending"))

                val COMPLETE = In(JsonField.of("complete"))

                val FAILED = In(JsonField.of("failed"))

                fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                PENDING,
                COMPLETE,
                FAILED,
            }

            enum class Value {
                PENDING,
                COMPLETE,
                FAILED,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                FAILED -> Known.FAILED
                else -> throw IncreaseInvalidDataException("Unknown In: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
