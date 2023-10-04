// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class CardCreateParams
constructor(
    private val accountId: String,
    private val billingAddress: BillingAddress?,
    private val description: String?,
    private val digitalWallet: DigitalWallet?,
    private val entityId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun billingAddress(): BillingAddress? = billingAddress

    fun description(): String? = description

    fun digitalWallet(): DigitalWallet? = digitalWallet

    fun entityId(): String? = entityId

    internal fun getBody(): CardCreateBody {
        return CardCreateBody(
            accountId,
            billingAddress,
            description,
            digitalWallet,
            entityId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CardCreateBody.Builder::class)
    @NoAutoDetect
    class CardCreateBody
    internal constructor(
        private val accountId: String?,
        private val billingAddress: BillingAddress?,
        private val description: String?,
        private val digitalWallet: DigitalWallet?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Account the card should belong to. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The card's billing address. */
        @JsonProperty("billing_address") fun billingAddress(): BillingAddress? = billingAddress

        /** The description you choose to give the card. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardCreateBody &&
                this.accountId == other.accountId &&
                this.billingAddress == other.billingAddress &&
                this.description == other.description &&
                this.digitalWallet == other.digitalWallet &&
                this.entityId == other.entityId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        billingAddress,
                        description,
                        digitalWallet,
                        entityId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardCreateBody{accountId=$accountId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var billingAddress: BillingAddress? = null
            private var description: String? = null
            private var digitalWallet: DigitalWallet? = null
            private var entityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardCreateBody: CardCreateBody) = apply {
                this.accountId = cardCreateBody.accountId
                this.billingAddress = cardCreateBody.billingAddress
                this.description = cardCreateBody.description
                this.digitalWallet = cardCreateBody.digitalWallet
                this.entityId = cardCreateBody.entityId
                additionalProperties(cardCreateBody.additionalProperties)
            }

            /** The Account the card should belong to. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The card's billing address. */
            @JsonProperty("billing_address")
            fun billingAddress(billingAddress: BillingAddress) = apply {
                this.billingAddress = billingAddress
            }

            /** The description you choose to give the card. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. To add the card to a digital wallet, you may supply an email or phone
             * number with this request. Otherwise, subscribe and then action a Real Time Decision
             * with the category `digital_wallet_token_requested` or
             * `digital_wallet_authentication_requested`.
             */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * The Entity the card belongs to. You only need to supply this in rare situations when
             * the card is not for the Account holder.
             */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

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

            fun build(): CardCreateBody =
                CardCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    billingAddress,
                    description,
                    digitalWallet,
                    entityId,
                    additionalProperties.toUnmodifiable(),
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

        return other is CardCreateParams &&
            this.accountId == other.accountId &&
            this.billingAddress == other.billingAddress &&
            this.description == other.description &&
            this.digitalWallet == other.digitalWallet &&
            this.entityId == other.entityId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            billingAddress,
            description,
            digitalWallet,
            entityId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardCreateParams{accountId=$accountId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var billingAddress: BillingAddress? = null
        private var description: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var entityId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardCreateParams: CardCreateParams) = apply {
            this.accountId = cardCreateParams.accountId
            this.billingAddress = cardCreateParams.billingAddress
            this.description = cardCreateParams.description
            this.digitalWallet = cardCreateParams.digitalWallet
            this.entityId = cardCreateParams.entityId
            additionalQueryParams(cardCreateParams.additionalQueryParams)
            additionalHeaders(cardCreateParams.additionalHeaders)
            additionalBodyProperties(cardCreateParams.additionalBodyProperties)
        }

        /** The Account the card should belong to. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) = apply {
            this.billingAddress = billingAddress
        }

        /** The description you choose to give the card. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

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

        fun build(): CardCreateParams =
            CardCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                billingAddress,
                description,
                digitalWallet,
                entityId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** The card's billing address. */
    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val city: String?,
        private val state: String?,
        private val postalCode: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The first line of the billing address. */
        @JsonProperty("line1") fun line1(): String? = line1

        /** The second line of the billing address. */
        @JsonProperty("line2") fun line2(): String? = line2

        /** The city of the billing address. */
        @JsonProperty("city") fun city(): String? = city

        /** The US state of the billing address. */
        @JsonProperty("state") fun state(): String? = state

        /** The postal code of the billing address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.postalCode == other.postalCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        city,
                        state,
                        postalCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BillingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var postalCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                this.line1 = billingAddress.line1
                this.line2 = billingAddress.line2
                this.city = billingAddress.city
                this.state = billingAddress.state
                this.postalCode = billingAddress.postalCode
                additionalProperties(billingAddress.additionalProperties)
            }

            /** The first line of the billing address. */
            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            /** The second line of the billing address. */
            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** The city of the billing address. */
            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            /** The US state of the billing address. */
            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            /** The postal code of the billing address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

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

            fun build(): BillingAddress =
                BillingAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     */
    @JsonDeserialize(builder = DigitalWallet.Builder::class)
    @NoAutoDetect
    class DigitalWallet
    private constructor(
        private val email: String?,
        private val phone: String?,
        private val cardProfileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        @JsonProperty("email") fun email(): String? = email

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        @JsonProperty("phone") fun phone(): String? = phone

        /**
         * The card profile assigned to this digital card. Card profiles may also be assigned at the
         * program level.
         */
        @JsonProperty("card_profile_id") fun cardProfileId(): String? = cardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWallet &&
                this.email == other.email &&
                this.phone == other.phone &&
                this.cardProfileId == other.cardProfileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        email,
                        phone,
                        cardProfileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWallet{email=$email, phone=$phone, cardProfileId=$cardProfileId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var phone: String? = null
            private var cardProfileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWallet: DigitalWallet) = apply {
                this.email = digitalWallet.email
                this.phone = digitalWallet.phone
                this.cardProfileId = digitalWallet.cardProfileId
                additionalProperties(digitalWallet.additionalProperties)
            }

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

            /**
             * The card profile assigned to this digital card. Card profiles may also be assigned at
             * the program level.
             */
            @JsonProperty("card_profile_id")
            fun cardProfileId(cardProfileId: String) = apply { this.cardProfileId = cardProfileId }

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

            fun build(): DigitalWallet =
                DigitalWallet(
                    email,
                    phone,
                    cardProfileId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
