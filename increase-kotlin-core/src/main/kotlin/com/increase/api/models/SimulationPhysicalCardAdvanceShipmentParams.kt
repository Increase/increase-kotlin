// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class SimulationPhysicalCardAdvanceShipmentParams
constructor(
    private val physicalCardId: String,
    private val shipmentStatus: ShipmentStatus,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun physicalCardId(): String = physicalCardId

    fun shipmentStatus(): ShipmentStatus = shipmentStatus

    internal fun getBody(): SimulationPhysicalCardAdvanceShipmentBody {
        return SimulationPhysicalCardAdvanceShipmentBody(shipmentStatus, additionalBodyProperties)
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> physicalCardId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationPhysicalCardAdvanceShipmentBody.Builder::class)
    @NoAutoDetect
    class SimulationPhysicalCardAdvanceShipmentBody
    internal constructor(
        private val shipmentStatus: ShipmentStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The shipment status to move the Physical Card to. */
        @JsonProperty("shipment_status") fun shipmentStatus(): ShipmentStatus? = shipmentStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var shipmentStatus: ShipmentStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationPhysicalCardAdvanceShipmentBody: SimulationPhysicalCardAdvanceShipmentBody
            ) = apply {
                this.shipmentStatus = simulationPhysicalCardAdvanceShipmentBody.shipmentStatus
                additionalProperties(simulationPhysicalCardAdvanceShipmentBody.additionalProperties)
            }

            /** The shipment status to move the Physical Card to. */
            @JsonProperty("shipment_status")
            fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
                this.shipmentStatus = shipmentStatus
            }

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

            fun build(): SimulationPhysicalCardAdvanceShipmentBody =
                SimulationPhysicalCardAdvanceShipmentBody(
                    checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationPhysicalCardAdvanceShipmentBody && this.shipmentStatus == other.shipmentStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(shipmentStatus, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationPhysicalCardAdvanceShipmentBody{shipmentStatus=$shipmentStatus, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationPhysicalCardAdvanceShipmentParams && this.physicalCardId == other.physicalCardId && this.shipmentStatus == other.shipmentStatus && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(physicalCardId, shipmentStatus, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationPhysicalCardAdvanceShipmentParams{physicalCardId=$physicalCardId, shipmentStatus=$shipmentStatus, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var physicalCardId: String? = null
        private var shipmentStatus: ShipmentStatus? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationPhysicalCardAdvanceShipmentParams: SimulationPhysicalCardAdvanceShipmentParams
        ) = apply {
            this.physicalCardId = simulationPhysicalCardAdvanceShipmentParams.physicalCardId
            this.shipmentStatus = simulationPhysicalCardAdvanceShipmentParams.shipmentStatus
            additionalHeaders(simulationPhysicalCardAdvanceShipmentParams.additionalHeaders)
            additionalQueryParams(simulationPhysicalCardAdvanceShipmentParams.additionalQueryParams)
            additionalBodyProperties(
                simulationPhysicalCardAdvanceShipmentParams.additionalBodyProperties
            )
        }

        /** The Physical Card you would like to action. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

        /** The shipment status to move the Physical Card to. */
        fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
            this.shipmentStatus = shipmentStatus
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): SimulationPhysicalCardAdvanceShipmentParams =
            SimulationPhysicalCardAdvanceShipmentParams(
                checkNotNull(physicalCardId) { "`physicalCardId` is required but was not set" },
                checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ShipmentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShipmentStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = ShipmentStatus(JsonField.of("pending"))

            val CANCELED = ShipmentStatus(JsonField.of("canceled"))

            val SUBMITTED = ShipmentStatus(JsonField.of("submitted"))

            val ACKNOWLEDGED = ShipmentStatus(JsonField.of("acknowledged"))

            val REJECTED = ShipmentStatus(JsonField.of("rejected"))

            val SHIPPED = ShipmentStatus(JsonField.of("shipped"))

            val RETURNED = ShipmentStatus(JsonField.of("returned"))

            fun of(value: String) = ShipmentStatus(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            CANCELED,
            SUBMITTED,
            ACKNOWLEDGED,
            REJECTED,
            SHIPPED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            CANCELED,
            SUBMITTED,
            ACKNOWLEDGED,
            REJECTED,
            SHIPPED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                CANCELED -> Value.CANCELED
                SUBMITTED -> Value.SUBMITTED
                ACKNOWLEDGED -> Value.ACKNOWLEDGED
                REJECTED -> Value.REJECTED
                SHIPPED -> Value.SHIPPED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                CANCELED -> Known.CANCELED
                SUBMITTED -> Known.SUBMITTED
                ACKNOWLEDGED -> Known.ACKNOWLEDGED
                REJECTED -> Known.REJECTED
                SHIPPED -> Known.SHIPPED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown ShipmentStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
