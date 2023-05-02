package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class SimulationCheckTransferReturnParams
constructor(
    private val checkTransferId: String,
    private val reason: Reason,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun checkTransferId(): String = checkTransferId

    fun reason(): Reason = reason

    internal fun getBody(): SimulationCheckTransferReturnBody {
        return SimulationCheckTransferReturnBody(reason, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> checkTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationCheckTransferReturnBody.Builder::class)
    @NoAutoDetect
    class SimulationCheckTransferReturnBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The reason why the Check Transfer was returned to Increase. */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationCheckTransferReturnBody &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(reason, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCheckTransferReturnBody{reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationCheckTransferReturnBody: SimulationCheckTransferReturnBody
            ) = apply {
                this.reason = simulationCheckTransferReturnBody.reason
                additionalProperties(simulationCheckTransferReturnBody.additionalProperties)
            }

            /** The reason why the Check Transfer was returned to Increase. */
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

            fun build(): SimulationCheckTransferReturnBody =
                SimulationCheckTransferReturnBody(
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationCheckTransferReturnParams &&
            this.checkTransferId == other.checkTransferId &&
            this.reason == other.reason &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            checkTransferId,
            reason,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationCheckTransferReturnParams{checkTransferId=$checkTransferId, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var checkTransferId: String? = null
        private var reason: Reason? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationCheckTransferReturnParams: SimulationCheckTransferReturnParams
        ) = apply {
            this.checkTransferId = simulationCheckTransferReturnParams.checkTransferId
            this.reason = simulationCheckTransferReturnParams.reason
            additionalQueryParams(simulationCheckTransferReturnParams.additionalQueryParams)
            additionalHeaders(simulationCheckTransferReturnParams.additionalHeaders)
            additionalBodyProperties(simulationCheckTransferReturnParams.additionalBodyProperties)
        }

        /** The identifier of the Check Transfer you wish to mark returned. */
        fun checkTransferId(checkTransferId: String) = apply {
            this.checkTransferId = checkTransferId
        }

        /** The reason why the Check Transfer was returned to Increase. */
        fun reason(reason: Reason) = apply { this.reason = reason }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SimulationCheckTransferReturnParams =
            SimulationCheckTransferReturnParams(
                checkNotNull(checkTransferId) { "`checkTransferId` is required but was not set" },
                checkNotNull(reason) { "`reason` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MAIL_DELIVERY_FAILURE = Reason(JsonField.of("mail_delivery_failure"))

            val REFUSED_BY_RECIPIENT = Reason(JsonField.of("refused_by_recipient"))

            fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            MAIL_DELIVERY_FAILURE,
            REFUSED_BY_RECIPIENT,
        }

        enum class Value {
            MAIL_DELIVERY_FAILURE,
            REFUSED_BY_RECIPIENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MAIL_DELIVERY_FAILURE -> Value.MAIL_DELIVERY_FAILURE
                REFUSED_BY_RECIPIENT -> Value.REFUSED_BY_RECIPIENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MAIL_DELIVERY_FAILURE -> Known.MAIL_DELIVERY_FAILURE
                REFUSED_BY_RECIPIENT -> Known.REFUSED_BY_RECIPIENT
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
