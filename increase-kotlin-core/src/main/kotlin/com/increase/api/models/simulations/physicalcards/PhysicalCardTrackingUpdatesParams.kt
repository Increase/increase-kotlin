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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows you to simulate receiving a tracking update for a Physical Card, to simulate
 * the progress of a shipment.
 */
class PhysicalCardTrackingUpdatesParams
private constructor(
    private val physicalCardId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The Physical Card you would like to action. */
    fun physicalCardId(): String? = physicalCardId

    /**
     * The type of tracking event.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = body.category()

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the carrier expects
     * the card to be delivered.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrierEstimatedDeliveryAt(): OffsetDateTime? = body.carrierEstimatedDeliveryAt()

    /**
     * The city where the event took place.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): String? = body.city()

    /**
     * The postal code where the event took place.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): String? = body.postalCode()

    /**
     * The state where the event took place.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): String? = body.state()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [carrierEstimatedDeliveryAt].
     *
     * Unlike [carrierEstimatedDeliveryAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _carrierEstimatedDeliveryAt(): JsonField<OffsetDateTime> =
        body._carrierEstimatedDeliveryAt()

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _city(): JsonField<String> = body._city()

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _postalCode(): JsonField<String> = body._postalCode()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<String> = body._state()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardTrackingUpdatesParams].
         *
         * The following fields are required:
         * ```kotlin
         * .category()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PhysicalCardTrackingUpdatesParams]. */
    class Builder internal constructor() {

        private var physicalCardId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(physicalCardTrackingUpdatesParams: PhysicalCardTrackingUpdatesParams) =
            apply {
                physicalCardId = physicalCardTrackingUpdatesParams.physicalCardId
                body = physicalCardTrackingUpdatesParams.body.toBuilder()
                additionalHeaders = physicalCardTrackingUpdatesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    physicalCardTrackingUpdatesParams.additionalQueryParams.toBuilder()
            }

        /** The Physical Card you would like to action. */
        fun physicalCardId(physicalCardId: String?) = apply { this.physicalCardId = physicalCardId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [category]
         * - [carrierEstimatedDeliveryAt]
         * - [city]
         * - [postalCode]
         * - [state]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The type of tracking event. */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the carrier
         * expects the card to be delivered.
         */
        fun carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt: OffsetDateTime) = apply {
            body.carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt)
        }

        /**
         * Sets [Builder.carrierEstimatedDeliveryAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierEstimatedDeliveryAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>) =
            apply {
                body.carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt)
            }

        /** The city where the event took place. */
        fun city(city: String) = apply { body.city(city) }

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { body.city(city) }

        /** The postal code where the event took place. */
        fun postalCode(postalCode: String) = apply { body.postalCode(postalCode) }

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { body.postalCode(postalCode) }

        /** The state where the event took place. */
        fun state(state: String) = apply { body.state(state) }

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { body.state(state) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PhysicalCardTrackingUpdatesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .category()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardTrackingUpdatesParams =
            PhysicalCardTrackingUpdatesParams(
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
        private val category: JsonField<Category>,
        private val carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>,
        private val city: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("carrier_estimated_delivery_at")
            @ExcludeMissing
            carrierEstimatedDeliveryAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(category, carrierEstimatedDeliveryAt, city, postalCode, state, mutableMapOf())

        /**
         * The type of tracking event.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the carrier
         * expects the card to be delivered.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun carrierEstimatedDeliveryAt(): OffsetDateTime? =
            carrierEstimatedDeliveryAt.getNullable("carrier_estimated_delivery_at")

        /**
         * The city where the event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun city(): String? = city.getNullable("city")

        /**
         * The postal code where the event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /**
         * The state where the event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun state(): String? = state.getNullable("state")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [carrierEstimatedDeliveryAt].
         *
         * Unlike [carrierEstimatedDeliveryAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("carrier_estimated_delivery_at")
        @ExcludeMissing
        fun _carrierEstimatedDeliveryAt(): JsonField<OffsetDateTime> = carrierEstimatedDeliveryAt

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
             * .category()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var carrierEstimatedDeliveryAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                category = body.category
                carrierEstimatedDeliveryAt = body.carrierEstimatedDeliveryAt
                city = body.city
                postalCode = body.postalCode
                state = body.state
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of tracking event. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the carrier
             * expects the card to be delivered.
             */
            fun carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt: OffsetDateTime) =
                carrierEstimatedDeliveryAt(JsonField.of(carrierEstimatedDeliveryAt))

            /**
             * Sets [Builder.carrierEstimatedDeliveryAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierEstimatedDeliveryAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>) =
                apply {
                    this.carrierEstimatedDeliveryAt = carrierEstimatedDeliveryAt
                }

            /** The city where the event took place. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The postal code where the event took place. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The state where the event took place. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("category", category),
                    carrierEstimatedDeliveryAt,
                    city,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            carrierEstimatedDeliveryAt()
            city()
            postalCode()
            state()
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
        internal fun validity(): Int =
            (category.asKnown()?.validity() ?: 0) +
                (if (carrierEstimatedDeliveryAt.asKnown() == null) 0 else 1) +
                (if (city.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (state.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                category == other.category &&
                carrierEstimatedDeliveryAt == other.carrierEstimatedDeliveryAt &&
                city == other.city &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                category,
                carrierEstimatedDeliveryAt,
                city,
                postalCode,
                state,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{category=$category, carrierEstimatedDeliveryAt=$carrierEstimatedDeliveryAt, city=$city, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /** The type of tracking event. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The physical card is in transit. */
            val IN_TRANSIT = of("in_transit")

            /** The physical card has been processed for delivery. */
            val PROCESSED_FOR_DELIVERY = of("processed_for_delivery")

            /** The physical card has been delivered. */
            val DELIVERED = of("delivered")

            /** Delivery failed and the physical card was returned to sender. */
            val RETURNED_TO_SENDER = of("returned_to_sender")

            fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /** The physical card is in transit. */
            IN_TRANSIT,
            /** The physical card has been processed for delivery. */
            PROCESSED_FOR_DELIVERY,
            /** The physical card has been delivered. */
            DELIVERED,
            /** Delivery failed and the physical card was returned to sender. */
            RETURNED_TO_SENDER,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The physical card is in transit. */
            IN_TRANSIT,
            /** The physical card has been processed for delivery. */
            PROCESSED_FOR_DELIVERY,
            /** The physical card has been delivered. */
            DELIVERED,
            /** Delivery failed and the physical card was returned to sender. */
            RETURNED_TO_SENDER,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                IN_TRANSIT -> Value.IN_TRANSIT
                PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                DELIVERED -> Value.DELIVERED
                RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
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
                IN_TRANSIT -> Known.IN_TRANSIT
                PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                DELIVERED -> Known.DELIVERED
                RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

        fun validate(): Category = apply {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalCardTrackingUpdatesParams &&
            physicalCardId == other.physicalCardId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(physicalCardId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhysicalCardTrackingUpdatesParams{physicalCardId=$physicalCardId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
