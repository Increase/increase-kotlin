// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

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

/** Update an Entity */
class EntityUpdateParams
private constructor(
    private val entityId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The entity identifier. */
    fun entityId(): String? = entityId

    /**
     * An assessment of the entity’s potential risk of involvement in financial crimes, such as
     * money laundering.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun riskRating(): RiskRating? = body.riskRating()

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdPartyVerification(): ThirdPartyVerification? = body.thirdPartyVerification()

    /**
     * Returns the raw JSON value of [riskRating].
     *
     * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _riskRating(): JsonField<RiskRating> = body._riskRating()

    /**
     * Returns the raw JSON value of [thirdPartyVerification].
     *
     * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> =
        body._thirdPartyVerification()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): EntityUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EntityUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [EntityUpdateParams]. */
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(entityUpdateParams: EntityUpdateParams) = apply {
            entityId = entityUpdateParams.entityId
            body = entityUpdateParams.body.toBuilder()
            additionalHeaders = entityUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The entity identifier. */
        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [riskRating]
         * - [thirdPartyVerification]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * An assessment of the entity’s potential risk of involvement in financial crimes, such as
         * money laundering.
         */
        fun riskRating(riskRating: RiskRating) = apply { body.riskRating(riskRating) }

        /**
         * Sets [Builder.riskRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { body.riskRating(riskRating) }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
            body.thirdPartyVerification(thirdPartyVerification)
        }

        /**
         * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerification] with a well-typed
         * [ThirdPartyVerification] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                body.thirdPartyVerification(thirdPartyVerification)
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
         * Returns an immutable instance of [EntityUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EntityUpdateParams =
            EntityUpdateParams(
                entityId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> entityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val riskRating: JsonField<RiskRating>,
        private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("third_party_verification")
            @ExcludeMissing
            thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
        ) : this(riskRating, thirdPartyVerification, mutableMapOf())

        /**
         * An assessment of the entity’s potential risk of involvement in financial crimes, such as
         * money laundering.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun thirdPartyVerification(): ThirdPartyVerification? =
            thirdPartyVerification.getNullable("third_party_verification")

        /**
         * Returns the raw JSON value of [riskRating].
         *
         * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /**
         * Returns the raw JSON value of [thirdPartyVerification].
         *
         * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                riskRating = body.riskRating
                thirdPartyVerification = body.thirdPartyVerification
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * An assessment of the entity’s potential risk of involvement in financial crimes, such
             * as money laundering.
             */
            fun riskRating(riskRating: RiskRating) = riskRating(JsonField.of(riskRating))

            /**
             * Sets [Builder.riskRating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /**
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) =
                thirdPartyVerification(JsonField.of(thirdPartyVerification))

            /**
             * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thirdPartyVerification] with a well-typed
             * [ThirdPartyVerification] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
                apply {
                    this.thirdPartyVerification = thirdPartyVerification
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
             */
            fun build(): Body =
                Body(riskRating, thirdPartyVerification, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            riskRating()?.validate()
            thirdPartyVerification()?.validate()
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
            (riskRating.asKnown()?.validity() ?: 0) +
                (thirdPartyVerification.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                riskRating == other.riskRating &&
                thirdPartyVerification == other.thirdPartyVerification &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(riskRating, thirdPartyVerification, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{riskRating=$riskRating, thirdPartyVerification=$thirdPartyVerification, additionalProperties=$additionalProperties}"
    }

    /**
     * An assessment of the entity’s potential risk of involvement in financial crimes, such as
     * money laundering.
     */
    class RiskRating
    private constructor(
        private val ratedAt: JsonField<OffsetDateTime>,
        private val rating: JsonField<Rating>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rated_at")
            @ExcludeMissing
            ratedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("rating") @ExcludeMissing rating: JsonField<Rating> = JsonMissing.of(),
        ) : this(ratedAt, rating, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the risk rating was
         * performed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ratedAt(): OffsetDateTime = ratedAt.getRequired("rated_at")

        /**
         * The rating given to this entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rating(): Rating = rating.getRequired("rating")

        /**
         * Returns the raw JSON value of [ratedAt].
         *
         * Unlike [ratedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rated_at")
        @ExcludeMissing
        fun _ratedAt(): JsonField<OffsetDateTime> = ratedAt

        /**
         * Returns the raw JSON value of [rating].
         *
         * Unlike [rating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rating") @ExcludeMissing fun _rating(): JsonField<Rating> = rating

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
             * Returns a mutable builder for constructing an instance of [RiskRating].
             *
             * The following fields are required:
             * ```kotlin
             * .ratedAt()
             * .rating()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RiskRating]. */
        class Builder internal constructor() {

            private var ratedAt: JsonField<OffsetDateTime>? = null
            private var rating: JsonField<Rating>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(riskRating: RiskRating) = apply {
                ratedAt = riskRating.ratedAt
                rating = riskRating.rating
                additionalProperties = riskRating.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the risk rating
             * was performed.
             */
            fun ratedAt(ratedAt: OffsetDateTime) = ratedAt(JsonField.of(ratedAt))

            /**
             * Sets [Builder.ratedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ratedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ratedAt(ratedAt: JsonField<OffsetDateTime>) = apply { this.ratedAt = ratedAt }

            /** The rating given to this entity. */
            fun rating(rating: Rating) = rating(JsonField.of(rating))

            /**
             * Sets [Builder.rating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rating] with a well-typed [Rating] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rating(rating: JsonField<Rating>) = apply { this.rating = rating }

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
             * Returns an immutable instance of [RiskRating].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .ratedAt()
             * .rating()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RiskRating =
                RiskRating(
                    checkRequired("ratedAt", ratedAt),
                    checkRequired("rating", rating),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RiskRating = apply {
            if (validated) {
                return@apply
            }

            ratedAt()
            rating().validate()
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
            (if (ratedAt.asKnown() == null) 0 else 1) + (rating.asKnown()?.validity() ?: 0)

        /** The rating given to this entity. */
        class Rating @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Low */
                val LOW = of("low")

                /** Medium */
                val MEDIUM = of("medium")

                /** High */
                val HIGH = of("high")

                fun of(value: String) = Rating(JsonField.of(value))
            }

            /** An enum containing [Rating]'s known values. */
            enum class Known {
                /** Low */
                LOW,
                /** Medium */
                MEDIUM,
                /** High */
                HIGH,
            }

            /**
             * An enum containing [Rating]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Rating] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Low */
                LOW,
                /** Medium */
                MEDIUM,
                /** High */
                HIGH,
                /**
                 * An enum member indicating that [Rating] was instantiated with an unknown value.
                 */
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
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
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
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw IncreaseInvalidDataException("Unknown Rating: $value")
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

            fun validate(): Rating = apply {
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

                return other is Rating && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RiskRating &&
                ratedAt == other.ratedAt &&
                rating == other.rating &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(ratedAt, rating, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RiskRating{ratedAt=$ratedAt, rating=$rating, additionalProperties=$additionalProperties}"
    }

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    class ThirdPartyVerification
    private constructor(
        private val reference: JsonField<String>,
        private val vendor: JsonField<Vendor>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor") @ExcludeMissing vendor: JsonField<Vendor> = JsonMissing.of(),
        ) : this(reference, vendor, mutableMapOf())

        /**
         * The reference identifier for the third party verification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * The vendor that was used to perform the verification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vendor(): Vendor = vendor.getRequired("vendor")

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /**
         * Returns the raw JSON value of [vendor].
         *
         * Unlike [vendor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vendor") @ExcludeMissing fun _vendor(): JsonField<Vendor> = vendor

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
             * Returns a mutable builder for constructing an instance of [ThirdPartyVerification].
             *
             * The following fields are required:
             * ```kotlin
             * .reference()
             * .vendor()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ThirdPartyVerification]. */
        class Builder internal constructor() {

            private var reference: JsonField<String>? = null
            private var vendor: JsonField<Vendor>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(thirdPartyVerification: ThirdPartyVerification) = apply {
                reference = thirdPartyVerification.reference
                vendor = thirdPartyVerification.vendor
                additionalProperties = thirdPartyVerification.additionalProperties.toMutableMap()
            }

            /** The reference identifier for the third party verification. */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            fun vendor(vendor: Vendor) = vendor(JsonField.of(vendor))

            /**
             * Sets [Builder.vendor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendor] with a well-typed [Vendor] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vendor(vendor: JsonField<Vendor>) = apply { this.vendor = vendor }

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
             * Returns an immutable instance of [ThirdPartyVerification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .reference()
             * .vendor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ThirdPartyVerification =
                ThirdPartyVerification(
                    checkRequired("reference", reference),
                    checkRequired("vendor", vendor),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ThirdPartyVerification = apply {
            if (validated) {
                return@apply
            }

            reference()
            vendor().validate()
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
            (if (reference.asKnown() == null) 0 else 1) + (vendor.asKnown()?.validity() ?: 0)

        /** The vendor that was used to perform the verification. */
        class Vendor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Alloy. See https://alloy.com for more information. */
                val ALLOY = of("alloy")

                /** Middesk. See https://middesk.com for more information. */
                val MIDDESK = of("middesk")

                /** Oscilar. See https://oscilar.com for more information. */
                val OSCILAR = of("oscilar")

                fun of(value: String) = Vendor(JsonField.of(value))
            }

            /** An enum containing [Vendor]'s known values. */
            enum class Known {
                /** Alloy. See https://alloy.com for more information. */
                ALLOY,
                /** Middesk. See https://middesk.com for more information. */
                MIDDESK,
                /** Oscilar. See https://oscilar.com for more information. */
                OSCILAR,
            }

            /**
             * An enum containing [Vendor]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Vendor] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Alloy. See https://alloy.com for more information. */
                ALLOY,
                /** Middesk. See https://middesk.com for more information. */
                MIDDESK,
                /** Oscilar. See https://oscilar.com for more information. */
                OSCILAR,
                /**
                 * An enum member indicating that [Vendor] was instantiated with an unknown value.
                 */
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
                    ALLOY -> Value.ALLOY
                    MIDDESK -> Value.MIDDESK
                    OSCILAR -> Value.OSCILAR
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
                    ALLOY -> Known.ALLOY
                    MIDDESK -> Known.MIDDESK
                    OSCILAR -> Known.OSCILAR
                    else -> throw IncreaseInvalidDataException("Unknown Vendor: $value")
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

            fun validate(): Vendor = apply {
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

                return other is Vendor && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThirdPartyVerification &&
                reference == other.reference &&
                vendor == other.vendor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reference, vendor, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdPartyVerification{reference=$reference, vendor=$vendor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityUpdateParams &&
            entityId == other.entityId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(entityId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntityUpdateParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
