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

class ExternalAccountListParams constructor(
  private val cursor: String?,
  private val idempotencyKey: String?,
  private val limit: Long?,
  private val routingNumber: String?,
  private val status: Status?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun cursor(): String? = cursor

    fun idempotencyKey(): String? = idempotencyKey

    fun limit(): Long? = limit

    fun routingNumber(): String? = routingNumber

    fun status(): Status? = status

    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.idempotencyKey?.let {
          params.put("idempotency_key", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.routingNumber?.let {
          params.put("routing_number", listOf(it.toString()))
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

      return other is ExternalAccountListParams &&
          this.cursor == other.cursor &&
          this.idempotencyKey == other.idempotencyKey &&
          this.limit == other.limit &&
          this.routingNumber == other.routingNumber &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cursor,
          idempotencyKey,
          limit,
          routingNumber,
          status,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ExternalAccountListParams{cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, routingNumber=$routingNumber, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var routingNumber: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountListParams: ExternalAccountListParams) = apply {
            this.cursor = externalAccountListParams.cursor
            this.idempotencyKey = externalAccountListParams.idempotencyKey
            this.limit = externalAccountListParams.limit
            this.routingNumber = externalAccountListParams.routingNumber
            this.status = externalAccountListParams.status
            additionalQueryParams(externalAccountListParams.additionalQueryParams)
            additionalHeaders(externalAccountListParams.additionalHeaders)
            additionalBodyProperties(externalAccountListParams.additionalBodyProperties)
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

        /** Filter External Accounts to those with the specified Routing Number. */
        fun routingNumber(routingNumber: String) = apply {
            this.routingNumber = routingNumber
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

        fun build(): ExternalAccountListParams = ExternalAccountListParams(
            cursor,
            idempotencyKey,
            limit,
            routingNumber,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Status.Builder::class)
    @NoAutoDetect
    class Status private constructor(private val in_: List<In>?, private val additionalProperties: Map<String, List<String>>, ) {

        private var hashCode: Int = 0

        /**
         * Filter External Accounts for those with the specified status or statuses. For
         * GET requests, this should be encoded as a comma-delimited string, such as
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
             * Filter External Accounts for those with the specified status or statuses. For
             * GET requests, this should be encoded as a comma-delimited string, such as
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

                val ACTIVE = In(JsonField.of("active"))

                val ARCHIVED = In(JsonField.of("archived"))

                fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACTIVE,
                ARCHIVED,
            }

            enum class Value {
                ACTIVE,
                ARCHIVED,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                else -> throw IncreaseInvalidDataException("Unknown In: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
