// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

class InboundCheckDepositReturnParams
constructor(
    private val inboundCheckDepositId: String,
    private val reason: Reason,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inboundCheckDepositId(): String = inboundCheckDepositId

    fun reason(): Reason = reason

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): InboundCheckDepositReturnBody {
        return InboundCheckDepositReturnBody(reason, additionalBodyProperties)
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundCheckDepositId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InboundCheckDepositReturnBody.Builder::class)
    @NoAutoDetect
    class InboundCheckDepositReturnBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reason to return the Inbound Check Deposit. */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundCheckDepositReturnBody: InboundCheckDepositReturnBody) =
                apply {
                    this.reason = inboundCheckDepositReturnBody.reason
                    additionalProperties(inboundCheckDepositReturnBody.additionalProperties)
                }

            /** The reason to return the Inbound Check Deposit. */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): InboundCheckDepositReturnBody =
                InboundCheckDepositReturnBody(
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundCheckDepositReturnBody && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundCheckDepositReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundCheckDepositId: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundCheckDepositReturnParams: InboundCheckDepositReturnParams) =
            apply {
                inboundCheckDepositId = inboundCheckDepositReturnParams.inboundCheckDepositId
                reason = inboundCheckDepositReturnParams.reason
                additionalHeaders = inboundCheckDepositReturnParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inboundCheckDepositReturnParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    inboundCheckDepositReturnParams.additionalBodyProperties.toMutableMap()
            }

        /** The identifier of the Inbound Check Deposit to return. */
        fun inboundCheckDepositId(inboundCheckDepositId: String) = apply {
            this.inboundCheckDepositId = inboundCheckDepositId
        }

        /** The reason to return the Inbound Check Deposit. */
        fun reason(reason: Reason) = apply { this.reason = reason }

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

        fun build(): InboundCheckDepositReturnParams =
            InboundCheckDepositReturnParams(
                checkNotNull(inboundCheckDepositId) {
                    "`inboundCheckDepositId` is required but was not set"
                },
                checkNotNull(reason) { "`reason` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ALTERED_OR_FICTITIOUS = of("altered_or_fictitious")

            val NOT_AUTHORIZED = of("not_authorized")

            val DUPLICATE_PRESENTMENT = of("duplicate_presentment")

            val ENDORSEMENT_MISSING = of("endorsement_missing")

            val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            ALTERED_OR_FICTITIOUS,
            NOT_AUTHORIZED,
            DUPLICATE_PRESENTMENT,
            ENDORSEMENT_MISSING,
            ENDORSEMENT_IRREGULAR,
        }

        enum class Value {
            ALTERED_OR_FICTITIOUS,
            NOT_AUTHORIZED,
            DUPLICATE_PRESENTMENT,
            ENDORSEMENT_MISSING,
            ENDORSEMENT_IRREGULAR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositReturnParams && inboundCheckDepositId == other.inboundCheckDepositId && reason == other.reason && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundCheckDepositId, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositReturnParams{inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
