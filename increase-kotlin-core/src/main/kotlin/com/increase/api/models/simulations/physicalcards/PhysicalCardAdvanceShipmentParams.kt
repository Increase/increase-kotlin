// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.physicalcards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
 * simulate e.g., that a physical card was attempted shipped but then failed delivery.
 */
class PhysicalCardAdvanceShipmentParams
private constructor(
    private val physicalCardId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The Physical Card you would like to action. */
    fun physicalCardId(): String? = physicalCardId

    /**
     * The shipment status to move the Physical Card to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shipmentStatus(): ShipmentStatus = body.shipmentStatus()

    /**
     * Returns the raw JSON value of [shipmentStatus].
     *
     * Unlike [shipmentStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipmentStatus(): JsonField<ShipmentStatus> = body._shipmentStatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardAdvanceShipmentParams].
         *
         * The following fields are required:
         * ```kotlin
         * .shipmentStatus()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PhysicalCardAdvanceShipmentParams]. */
    class Builder internal constructor() {

        private var physicalCardId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(physicalCardAdvanceShipmentParams: PhysicalCardAdvanceShipmentParams) =
            apply {
                physicalCardId = physicalCardAdvanceShipmentParams.physicalCardId
                body = physicalCardAdvanceShipmentParams.body.toBuilder()
                additionalHeaders = physicalCardAdvanceShipmentParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    physicalCardAdvanceShipmentParams.additionalQueryParams.toBuilder()
            }

        /** The Physical Card you would like to action. */
        fun physicalCardId(physicalCardId: String?) = apply { this.physicalCardId = physicalCardId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [shipmentStatus]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The shipment status to move the Physical Card to. */
        fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
            body.shipmentStatus(shipmentStatus)
        }

        /**
         * Sets [Builder.shipmentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipmentStatus] with a well-typed [ShipmentStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipmentStatus(shipmentStatus: JsonField<ShipmentStatus>) = apply {
            body.shipmentStatus(shipmentStatus)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [PhysicalCardAdvanceShipmentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .shipmentStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardAdvanceShipmentParams =
            PhysicalCardAdvanceShipmentParams(
                physicalCardId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> physicalCardId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val shipmentStatus: JsonField<ShipmentStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("shipment_status")
            @ExcludeMissing
            shipmentStatus: JsonField<ShipmentStatus> = JsonMissing.of()
        ) : this(shipmentStatus, mutableMapOf())

        /**
         * The shipment status to move the Physical Card to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shipmentStatus(): ShipmentStatus = shipmentStatus.getRequired("shipment_status")

        /**
         * Returns the raw JSON value of [shipmentStatus].
         *
         * Unlike [shipmentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipment_status")
        @ExcludeMissing
        fun _shipmentStatus(): JsonField<ShipmentStatus> = shipmentStatus

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .shipmentStatus()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var shipmentStatus: JsonField<ShipmentStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                shipmentStatus = body.shipmentStatus
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The shipment status to move the Physical Card to. */
            fun shipmentStatus(shipmentStatus: ShipmentStatus) =
                shipmentStatus(JsonField.of(shipmentStatus))

            /**
             * Sets [Builder.shipmentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipmentStatus] with a well-typed [ShipmentStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shipmentStatus(shipmentStatus: JsonField<ShipmentStatus>) = apply {
                this.shipmentStatus = shipmentStatus
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .shipmentStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("shipmentStatus", shipmentStatus),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            shipmentStatus().validate()
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
        internal fun validity(): Int = (shipmentStatus.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && shipmentStatus == other.shipmentStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(shipmentStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{shipmentStatus=$shipmentStatus, additionalProperties=$additionalProperties}"
    }

    /** The shipment status to move the Physical Card to. */
    class ShipmentStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The physical card has not yet been shipped. */
            val PENDING = of("pending")

            /** The physical card shipment was canceled prior to submission. */
            val CANCELED = of("canceled")

            /** The physical card shipment has been submitted to the card fulfillment provider. */
            val SUBMITTED = of("submitted")

            /**
             * The physical card shipment has been acknowledged by the card fulfillment provider and
             * will be processed in their next batch.
             */
            val ACKNOWLEDGED = of("acknowledged")

            /** The physical card shipment was rejected by the card printer due to an error. */
            val REJECTED = of("rejected")

            /** The physical card has been shipped. */
            val SHIPPED = of("shipped")

            /**
             * The physical card shipment was returned to the sender and destroyed by the production
             * facility.
             */
            val RETURNED = of("returned")

            /** The physical card shipment requires attention from Increase before progressing. */
            val REQUIRES_ATTENTION = of("requires_attention")

            fun of(value: String) = ShipmentStatus(JsonField.of(value))
        }

        /** An enum containing [ShipmentStatus]'s known values. */
        enum class Known {
            /** The physical card has not yet been shipped. */
            PENDING,
            /** The physical card shipment was canceled prior to submission. */
            CANCELED,
            /** The physical card shipment has been submitted to the card fulfillment provider. */
            SUBMITTED,
            /**
             * The physical card shipment has been acknowledged by the card fulfillment provider and
             * will be processed in their next batch.
             */
            ACKNOWLEDGED,
            /** The physical card shipment was rejected by the card printer due to an error. */
            REJECTED,
            /** The physical card has been shipped. */
            SHIPPED,
            /**
             * The physical card shipment was returned to the sender and destroyed by the production
             * facility.
             */
            RETURNED,
            /** The physical card shipment requires attention from Increase before progressing. */
            REQUIRES_ATTENTION,
        }

        /**
         * An enum containing [ShipmentStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ShipmentStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The physical card has not yet been shipped. */
            PENDING,
            /** The physical card shipment was canceled prior to submission. */
            CANCELED,
            /** The physical card shipment has been submitted to the card fulfillment provider. */
            SUBMITTED,
            /**
             * The physical card shipment has been acknowledged by the card fulfillment provider and
             * will be processed in their next batch.
             */
            ACKNOWLEDGED,
            /** The physical card shipment was rejected by the card printer due to an error. */
            REJECTED,
            /** The physical card has been shipped. */
            SHIPPED,
            /**
             * The physical card shipment was returned to the sender and destroyed by the production
             * facility.
             */
            RETURNED,
            /** The physical card shipment requires attention from Increase before progressing. */
            REQUIRES_ATTENTION,
            /**
             * An enum member indicating that [ShipmentStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                CANCELED -> Value.CANCELED
                SUBMITTED -> Value.SUBMITTED
                ACKNOWLEDGED -> Value.ACKNOWLEDGED
                REJECTED -> Value.REJECTED
                SHIPPED -> Value.SHIPPED
                RETURNED -> Value.RETURNED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                CANCELED -> Known.CANCELED
                SUBMITTED -> Known.SUBMITTED
                ACKNOWLEDGED -> Known.ACKNOWLEDGED
                REJECTED -> Known.REJECTED
                SHIPPED -> Known.SHIPPED
                RETURNED -> Known.RETURNED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown ShipmentStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ShipmentStatus = apply {
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

            return /* spotless:off */ other is ShipmentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardAdvanceShipmentParams && physicalCardId == other.physicalCardId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PhysicalCardAdvanceShipmentParams{physicalCardId=$physicalCardId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
