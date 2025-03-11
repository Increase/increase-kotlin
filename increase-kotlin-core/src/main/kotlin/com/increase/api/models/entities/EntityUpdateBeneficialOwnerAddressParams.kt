// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/** Update the address for a beneficial owner belonging to a corporate Entity */
class EntityUpdateBeneficialOwnerAddressParams private constructor(
    private val entityId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /**
     * The identifier of the Entity associated with the Beneficial Owner whose address
     * is being updated.
     */
    fun entityId(): String = entityId

    /**
     * The individual's physical address. Mail receiving locations like PO Boxes and
     * PMB's are disallowed.
     */
    fun address(): Address = body.address()

    /**
     * The identifying details of anyone controlling or owning 25% or more of the
     * corporation.
     */
    fun beneficialOwnerId(): String = body.beneficialOwnerId()

    /**
     * The individual's physical address. Mail receiving locations like PO Boxes and
     * PMB's are disallowed.
     */
    fun _address(): JsonField<Address> = body._address()

    /**
     * The identifying details of anyone controlling or owning 25% or more of the
     * corporation.
     */
    fun _beneficialOwnerId(): JsonField<String> = body._beneficialOwnerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> entityId
          else -> ""
      }
    }

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("address") @ExcludeMissing private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("beneficial_owner_id") @ExcludeMissing private val beneficialOwnerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and
         * PMB's are disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        fun beneficialOwnerId(): String = beneficialOwnerId.getRequired("beneficial_owner_id")

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and
         * PMB's are disallowed.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<Address> = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        @JsonProperty("beneficial_owner_id")
        @ExcludeMissing
        fun _beneficialOwnerId(): JsonField<String> = beneficialOwnerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                address().validate()
                beneficialOwnerId()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .address()
             * .beneficialOwnerId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var beneficialOwnerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) =
                apply {
                    address = body.address
                    beneficialOwnerId = body.beneficialOwnerId
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and
             * PMB's are disallowed.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and
             * PMB's are disallowed.
             */
            fun address(address: JsonField<Address>) =
                apply {
                    this.address = address
                }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwnerId(beneficialOwnerId: String) = beneficialOwnerId(JsonField.of(beneficialOwnerId))

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) =
                apply {
                    this.beneficialOwnerId = beneficialOwnerId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "address", address
                  ),
                  checkRequired(
                    "beneficialOwnerId", beneficialOwnerId
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && address == other.address && beneficialOwnerId == other.beneficialOwnerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, beneficialOwnerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{address=$address, beneficialOwnerId=$beneficialOwnerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntityUpdateBeneficialOwnerAddressParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .entityId()
         * .address()
         * .beneficialOwnerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EntityUpdateBeneficialOwnerAddressParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(entityUpdateBeneficialOwnerAddressParams: EntityUpdateBeneficialOwnerAddressParams) =
            apply {
                entityId = entityUpdateBeneficialOwnerAddressParams.entityId
                body = entityUpdateBeneficialOwnerAddressParams.body.toBuilder()
                additionalHeaders = entityUpdateBeneficialOwnerAddressParams.additionalHeaders.toBuilder()
                additionalQueryParams = entityUpdateBeneficialOwnerAddressParams.additionalQueryParams.toBuilder()
            }

        /**
         * The identifier of the Entity associated with the Beneficial Owner whose address
         * is being updated.
         */
        fun entityId(entityId: String) =
            apply {
                this.entityId = entityId
            }

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and
         * PMB's are disallowed.
         */
        fun address(address: Address) =
            apply {
                body.address(address)
            }

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and
         * PMB's are disallowed.
         */
        fun address(address: JsonField<Address>) =
            apply {
                body.address(address)
            }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        fun beneficialOwnerId(beneficialOwnerId: String) =
            apply {
                body.beneficialOwnerId(beneficialOwnerId)
            }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) =
            apply {
                body.beneficialOwnerId(beneficialOwnerId)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
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

        fun build(): EntityUpdateBeneficialOwnerAddressParams =
            EntityUpdateBeneficialOwnerAddressParams(
              checkRequired(
                "entityId", entityId
              ),
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    /**
     * The individual's physical address. Mail receiving locations like PO Boxes and
     * PMB's are disallowed.
     */
    @NoAutoDetect
    class Address @JsonCreator private constructor(
        @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing private val zip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The city of the address. */
        fun city(): String = city.getRequired("city")

        /** The first line of the address. This is usually the street number and street. */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of
         * the address.
         */
        fun state(): String = state.getRequired("state")

        /** The ZIP code of the address. */
        fun zip(): String = zip.getRequired("zip")

        /** The second line of the address. This might be the floor or room number. */
        fun line2(): String? = line2.getNullable("line2")

        /** The city of the address. */
        @JsonProperty("city")
        @ExcludeMissing
        fun _city(): JsonField<String> = city

        /** The first line of the address. This is usually the street number and street. */
        @JsonProperty("line1")
        @ExcludeMissing
        fun _line1(): JsonField<String> = line1

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of
         * the address.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun _state(): JsonField<String> = state

        /** The ZIP code of the address. */
        @JsonProperty("zip")
        @ExcludeMissing
        fun _zip(): JsonField<String> = zip

        /** The second line of the address. This might be the floor or room number. */
        @JsonProperty("line2")
        @ExcludeMissing
        fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address =
            apply {
                if (validated) {
                  return@apply
                }

                city()
                line1()
                state()
                zip()
                line2()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Address].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .city()
             * .line1()
             * .state()
             * .zip()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var zip: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(address: Address) =
                apply {
                    city = address.city
                    line1 = address.line1
                    state = address.state
                    zip = address.zip
                    line2 = address.line2
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

            /** The city of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the address. */
            fun city(city: JsonField<String>) =
                apply {
                    this.city = city
                }

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: JsonField<String>) =
                apply {
                    this.line1 = line1
                }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of
             * the address.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of
             * the address.
             */
            fun state(state: JsonField<String>) =
                apply {
                    this.state = state
                }

            /** The ZIP code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** The ZIP code of the address. */
            fun zip(zip: JsonField<String>) =
                apply {
                    this.zip = zip
                }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: JsonField<String>) =
                apply {
                    this.line2 = line2
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Address =
                Address(
                  checkRequired(
                    "city", city
                  ),
                  checkRequired(
                    "line1", line1
                  ),
                  checkRequired(
                    "state", state
                  ),
                  checkRequired(
                    "zip", zip
                  ),
                  line2,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EntityUpdateBeneficialOwnerAddressParams && entityId == other.entityId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entityId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "EntityUpdateBeneficialOwnerAddressParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
