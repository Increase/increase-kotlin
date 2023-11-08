// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Real Time Decisions are created when your application needs to take action in real-time to some
 * event such as a card authorization. Real time decisions are currently in beta; please contact
 * support@increase.com if you're interested in trying them out!
 */
@JsonDeserialize(builder = RealTimeDecision.Builder::class)
@NoAutoDetect
class RealTimeDecision
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val timeoutAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val category: JsonField<Category>,
    private val cardAuthorization: JsonField<CardAuthorization>,
    private val digitalWalletToken: JsonField<DigitalWalletToken>,
    private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Real-Time Decision identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    fun timeoutAt(): OffsetDateTime = timeoutAt.getRequired("timeout_at")

    /** The status of the Real-Time Decision. */
    fun status(): Status = status.getRequired("status")

    /** The category of the Real-Time Decision. */
    fun category(): Category = category.getRequired("category")

    /** Fields related to a card authorization. */
    fun cardAuthorization(): CardAuthorization? =
        cardAuthorization.getNullable("card_authorization")

    /** Fields related to a digital wallet token provisioning attempt. */
    fun digitalWalletToken(): DigitalWalletToken? =
        digitalWalletToken.getNullable("digital_wallet_token")

    /** Fields related to a digital wallet authentication attempt. */
    fun digitalWalletAuthentication(): DigitalWalletAuthentication? =
        digitalWalletAuthentication.getNullable("digital_wallet_authentication")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Real-Time Decision identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    @JsonProperty("timeout_at") @ExcludeMissing fun _timeoutAt() = timeoutAt

    /** The status of the Real-Time Decision. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The category of the Real-Time Decision. */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Fields related to a card authorization. */
    @JsonProperty("card_authorization") @ExcludeMissing fun _cardAuthorization() = cardAuthorization

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    fun _digitalWalletToken() = digitalWalletToken

    /** Fields related to a digital wallet authentication attempt. */
    @JsonProperty("digital_wallet_authentication")
    @ExcludeMissing
    fun _digitalWalletAuthentication() = digitalWalletAuthentication

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RealTimeDecision = apply {
        if (!validated) {
            id()
            createdAt()
            timeoutAt()
            status()
            category()
            cardAuthorization()?.validate()
            digitalWalletToken()?.validate()
            digitalWalletAuthentication()?.validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimeDecision &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.timeoutAt == other.timeoutAt &&
            this.status == other.status &&
            this.category == other.category &&
            this.cardAuthorization == other.cardAuthorization &&
            this.digitalWalletToken == other.digitalWalletToken &&
            this.digitalWalletAuthentication == other.digitalWalletAuthentication &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    timeoutAt,
                    status,
                    category,
                    cardAuthorization,
                    digitalWalletToken,
                    digitalWalletAuthentication,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RealTimeDecision{id=$id, createdAt=$createdAt, timeoutAt=$timeoutAt, status=$status, category=$category, cardAuthorization=$cardAuthorization, digitalWalletToken=$digitalWalletToken, digitalWalletAuthentication=$digitalWalletAuthentication, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeoutAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
        private var digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of()
        private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
            JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(realTimeDecision: RealTimeDecision) = apply {
            this.id = realTimeDecision.id
            this.createdAt = realTimeDecision.createdAt
            this.timeoutAt = realTimeDecision.timeoutAt
            this.status = realTimeDecision.status
            this.category = realTimeDecision.category
            this.cardAuthorization = realTimeDecision.cardAuthorization
            this.digitalWalletToken = realTimeDecision.digitalWalletToken
            this.digitalWalletAuthentication = realTimeDecision.digitalWalletAuthentication
            this.type = realTimeDecision.type
            additionalProperties(realTimeDecision.additionalProperties)
        }

        /** The Real-Time Decision identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Decision identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Real-Time Decision was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Real-Time Decision was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
         * application can no longer respond to the Real-Time Decision.
         */
        fun timeoutAt(timeoutAt: OffsetDateTime) = timeoutAt(JsonField.of(timeoutAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
         * application can no longer respond to the Real-Time Decision.
         */
        @JsonProperty("timeout_at")
        @ExcludeMissing
        fun timeoutAt(timeoutAt: JsonField<OffsetDateTime>) = apply { this.timeoutAt = timeoutAt }

        /** The status of the Real-Time Decision. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Real-Time Decision. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The category of the Real-Time Decision. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The category of the Real-Time Decision. */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: CardAuthorization) =
            cardAuthorization(JsonField.of(cardAuthorization))

        /** Fields related to a card authorization. */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) =
            digitalWalletToken(JsonField.of(digitalWalletToken))

        /** Fields related to a digital wallet token provisioning attempt. */
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            this.digitalWalletToken = digitalWalletToken
        }

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            digitalWalletAuthentication(JsonField.of(digitalWalletAuthentication))

        /** Fields related to a digital wallet authentication attempt. */
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
        ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_decision`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_decision`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): RealTimeDecision =
            RealTimeDecision(
                id,
                createdAt,
                timeoutAt,
                status,
                category,
                cardAuthorization,
                digitalWalletToken,
                digitalWalletAuthentication,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Fields related to a card authorization. */
    @JsonDeserialize(builder = CardAuthorization.Builder::class)
    @NoAutoDetect
    class CardAuthorization
    private constructor(
        private val merchantAcceptorId: JsonField<String>,
        private val merchantDescriptor: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCity: JsonField<String>,
        private val merchantCountry: JsonField<String>,
        private val digitalWalletTokenId: JsonField<String>,
        private val physicalCardId: JsonField<String>,
        private val verification: JsonField<Verification>,
        private val networkIdentifiers: JsonField<NetworkIdentifiers>,
        private val networkDetails: JsonField<NetworkDetails>,
        private val decision: JsonField<Decision>,
        private val cardId: JsonField<String>,
        private val accountId: JsonField<String>,
        private val presentmentAmount: JsonField<Long>,
        private val presentmentCurrency: JsonField<String>,
        private val settlementAmount: JsonField<Long>,
        private val settlementCurrency: JsonField<String>,
        private val processingCategory: JsonField<ProcessingCategory>,
        private val requestDetails: JsonField<RequestDetails>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(): String = merchantAcceptorId.getRequired("merchant_acceptor_id")

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(): String? =
            merchantCategoryCode.getNullable("merchant_category_code")

        /** The city the merchant resides in. */
        fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

        /** The country the merchant resides in. */
        fun merchantCountry(): String? = merchantCountry.getNullable("merchant_country")

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         */
        fun digitalWalletTokenId(): String? =
            digitalWalletTokenId.getNullable("digital_wallet_token_id")

        /**
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         */
        fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

        /** Fields related to verification of cardholder-provided values. */
        fun verification(): Verification = verification.getRequired("verification")

        /** Network-specific identifiers for a specific request or transaction. */
        fun networkIdentifiers(): NetworkIdentifiers =
            networkIdentifiers.getRequired("network_identifiers")

        /** Fields specific to the `network`. */
        fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

        /** Whether or not the authorization was approved. */
        fun decision(): Decision? = decision.getNullable("decision")

        /** The identifier of the Card that is being authorized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The identifier of the Account the authorization will debit. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         */
        fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         */
        fun presentmentCurrency(): String = presentmentCurrency.getRequired("presentment_currency")

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         */
        fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         */
        fun settlementCurrency(): String = settlementCurrency.getRequired("settlement_currency")

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        fun processingCategory(): ProcessingCategory =
            processingCategory.getRequired("processing_category")

        /** Fields specific to the type of request, such as an incremental authorization. */
        fun requestDetails(): RequestDetails = requestDetails.getRequired("request_details")

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId() = merchantAcceptorId

        /** The merchant descriptor of the merchant the card is transacting with. */
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        fun _merchantDescriptor() = merchantDescriptor

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        fun _merchantCategoryCode() = merchantCategoryCode

        /** The city the merchant resides in. */
        @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

        /** The country the merchant resides in. */
        @JsonProperty("merchant_country") @ExcludeMissing fun _merchantCountry() = merchantCountry

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId() = digitalWalletTokenId

        /**
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         */
        @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

        /** Fields related to verification of cardholder-provided values. */
        @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

        /** Network-specific identifiers for a specific request or transaction. */
        @JsonProperty("network_identifiers")
        @ExcludeMissing
        fun _networkIdentifiers() = networkIdentifiers

        /** Fields specific to the `network`. */
        @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

        /** Whether or not the authorization was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /** The identifier of the Card that is being authorized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The identifier of the Account the authorization will debit. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         */
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        fun _presentmentAmount() = presentmentAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         */
        @JsonProperty("presentment_currency")
        @ExcludeMissing
        fun _presentmentCurrency() = presentmentCurrency

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount() = settlementAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         */
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        fun _settlementCurrency() = settlementCurrency

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        @JsonProperty("processing_category")
        @ExcludeMissing
        fun _processingCategory() = processingCategory

        /** Fields specific to the type of request, such as an incremental authorization. */
        @JsonProperty("request_details") @ExcludeMissing fun _requestDetails() = requestDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CardAuthorization = apply {
            if (!validated) {
                merchantAcceptorId()
                merchantDescriptor()
                merchantCategoryCode()
                merchantCity()
                merchantCountry()
                digitalWalletTokenId()
                physicalCardId()
                verification().validate()
                networkIdentifiers().validate()
                networkDetails().validate()
                decision()
                cardId()
                accountId()
                presentmentAmount()
                presentmentCurrency()
                settlementAmount()
                settlementCurrency()
                processingCategory()
                requestDetails().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardAuthorization &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.merchantDescriptor == other.merchantDescriptor &&
                this.merchantCategoryCode == other.merchantCategoryCode &&
                this.merchantCity == other.merchantCity &&
                this.merchantCountry == other.merchantCountry &&
                this.digitalWalletTokenId == other.digitalWalletTokenId &&
                this.physicalCardId == other.physicalCardId &&
                this.verification == other.verification &&
                this.networkIdentifiers == other.networkIdentifiers &&
                this.networkDetails == other.networkDetails &&
                this.decision == other.decision &&
                this.cardId == other.cardId &&
                this.accountId == other.accountId &&
                this.presentmentAmount == other.presentmentAmount &&
                this.presentmentCurrency == other.presentmentCurrency &&
                this.settlementAmount == other.settlementAmount &&
                this.settlementCurrency == other.settlementCurrency &&
                this.processingCategory == other.processingCategory &&
                this.requestDetails == other.requestDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        merchantAcceptorId,
                        merchantDescriptor,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        digitalWalletTokenId,
                        physicalCardId,
                        verification,
                        networkIdentifiers,
                        networkDetails,
                        decision,
                        cardId,
                        accountId,
                        presentmentAmount,
                        presentmentCurrency,
                        settlementAmount,
                        settlementCurrency,
                        processingCategory,
                        requestDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthorization{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, verification=$verification, networkIdentifiers=$networkIdentifiers, networkDetails=$networkDetails, decision=$decision, cardId=$cardId, accountId=$accountId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, processingCategory=$processingCategory, requestDetails=$requestDetails, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
            private var merchantDescriptor: JsonField<String> = JsonMissing.of()
            private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
            private var merchantCity: JsonField<String> = JsonMissing.of()
            private var merchantCountry: JsonField<String> = JsonMissing.of()
            private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
            private var physicalCardId: JsonField<String> = JsonMissing.of()
            private var verification: JsonField<Verification> = JsonMissing.of()
            private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
            private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
            private var decision: JsonField<Decision> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var accountId: JsonField<String> = JsonMissing.of()
            private var presentmentAmount: JsonField<Long> = JsonMissing.of()
            private var presentmentCurrency: JsonField<String> = JsonMissing.of()
            private var settlementAmount: JsonField<Long> = JsonMissing.of()
            private var settlementCurrency: JsonField<String> = JsonMissing.of()
            private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
            private var requestDetails: JsonField<RequestDetails> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardAuthorization: CardAuthorization) = apply {
                this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                this.merchantDescriptor = cardAuthorization.merchantDescriptor
                this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                this.merchantCity = cardAuthorization.merchantCity
                this.merchantCountry = cardAuthorization.merchantCountry
                this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                this.physicalCardId = cardAuthorization.physicalCardId
                this.verification = cardAuthorization.verification
                this.networkIdentifiers = cardAuthorization.networkIdentifiers
                this.networkDetails = cardAuthorization.networkDetails
                this.decision = cardAuthorization.decision
                this.cardId = cardAuthorization.cardId
                this.accountId = cardAuthorization.accountId
                this.presentmentAmount = cardAuthorization.presentmentAmount
                this.presentmentCurrency = cardAuthorization.presentmentCurrency
                this.settlementAmount = cardAuthorization.settlementAmount
                this.settlementCurrency = cardAuthorization.settlementCurrency
                this.processingCategory = cardAuthorization.processingCategory
                this.requestDetails = cardAuthorization.requestDetails
                additionalProperties(cardAuthorization.additionalProperties)
            }

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(merchantAcceptorId: String) =
                merchantAcceptorId(JsonField.of(merchantAcceptorId))

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: String) =
                merchantDescriptor(JsonField.of(merchantDescriptor))

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(merchantCategoryCode: String) =
                merchantCategoryCode(JsonField.of(merchantCategoryCode))

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city")
            @ExcludeMissing
            fun merchantCity(merchantCity: JsonField<String>) = apply {
                this.merchantCity = merchantCity
            }

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: String) =
                merchantCountry(JsonField.of(merchantCountry))

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                this.merchantCountry = merchantCountry
            }

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: String) =
                digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(physicalCardId: String) =
                physicalCardId(JsonField.of(physicalCardId))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                this.physicalCardId = physicalCardId
            }

            /** Fields related to verification of cardholder-provided values. */
            fun verification(verification: Verification) = verification(JsonField.of(verification))

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification")
            @ExcludeMissing
            fun verification(verification: JsonField<Verification>) = apply {
                this.verification = verification
            }

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                networkIdentifiers(JsonField.of(networkIdentifiers))

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                this.networkIdentifiers = networkIdentifiers
            }

            /** Fields specific to the `network`. */
            fun networkDetails(networkDetails: NetworkDetails) =
                networkDetails(JsonField.of(networkDetails))

            /** Fields specific to the `network`. */
            @JsonProperty("network_details")
            @ExcludeMissing
            fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                this.networkDetails = networkDetails
            }

            /** Whether or not the authorization was approved. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether or not the authorization was approved. */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being authorized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the authorization will debit. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The amount of the attempted authorization in the currency the card user sees at the
             * time of purchase, in the minor unit of that currency. For dollars, for example, this
             * is cents.
             */
            fun presentmentAmount(presentmentAmount: Long) =
                presentmentAmount(JsonField.of(presentmentAmount))

            /**
             * The amount of the attempted authorization in the currency the card user sees at the
             * time of purchase, in the minor unit of that currency. For dollars, for example, this
             * is cents.
             */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                this.presentmentAmount = presentmentAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
             * sees at the time of purchase.
             */
            fun presentmentCurrency(presentmentCurrency: String) =
                presentmentCurrency(JsonField.of(presentmentCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
             * sees at the time of purchase.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                this.presentmentCurrency = presentmentCurrency
            }

            /**
             * The amount of the attempted authorization in the currency it will be settled in. This
             * currency is the same as that of the Account the card belongs to.
             */
            fun settlementAmount(settlementAmount: Long) =
                settlementAmount(JsonField.of(settlementAmount))

            /**
             * The amount of the attempted authorization in the currency it will be settled in. This
             * currency is the same as that of the Account the card belongs to.
             */
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
                this.settlementAmount = settlementAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
             * transaction will be settled in.
             */
            fun settlementCurrency(settlementCurrency: String) =
                settlementCurrency(JsonField.of(settlementCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
             * transaction will be settled in.
             */
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            fun settlementCurrency(settlementCurrency: JsonField<String>) = apply {
                this.settlementCurrency = settlementCurrency
            }

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(processingCategory: ProcessingCategory) =
                processingCategory(JsonField.of(processingCategory))

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                this.processingCategory = processingCategory
            }

            /** Fields specific to the type of request, such as an incremental authorization. */
            fun requestDetails(requestDetails: RequestDetails) =
                requestDetails(JsonField.of(requestDetails))

            /** Fields specific to the type of request, such as an incremental authorization. */
            @JsonProperty("request_details")
            @ExcludeMissing
            fun requestDetails(requestDetails: JsonField<RequestDetails>) = apply {
                this.requestDetails = requestDetails
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

            fun build(): CardAuthorization =
                CardAuthorization(
                    merchantAcceptorId,
                    merchantDescriptor,
                    merchantCategoryCode,
                    merchantCity,
                    merchantCountry,
                    digitalWalletTokenId,
                    physicalCardId,
                    verification,
                    networkIdentifiers,
                    networkDetails,
                    decision,
                    cardId,
                    accountId,
                    presentmentAmount,
                    presentmentCurrency,
                    settlementAmount,
                    settlementCurrency,
                    processingCategory,
                    requestDetails,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Decision && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPROVE = Decision(JsonField.of("approve"))

                val DECLINE = Decision(JsonField.of("decline"))

                fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                DECLINE,
            }

            enum class Value {
                APPROVE,
                DECLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Fields specific to the `network`. */
        @JsonDeserialize(builder = NetworkDetails.Builder::class)
        @NoAutoDetect
        class NetworkDetails
        private constructor(
            private val category: JsonField<Category>,
            private val visa: JsonField<Visa>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The payment network used to process this card authorization. */
            fun category(): Category = category.getRequired("category")

            /** Fields specific to the `visa` network. */
            fun visa(): Visa? = visa.getNullable("visa")

            /** The payment network used to process this card authorization. */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /** Fields specific to the `visa` network. */
            @JsonProperty("visa") @ExcludeMissing fun _visa() = visa

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NetworkDetails = apply {
                if (!validated) {
                    category()
                    visa()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkDetails &&
                    this.category == other.category &&
                    this.visa == other.visa &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            category,
                            visa,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var visa: JsonField<Visa> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(networkDetails: NetworkDetails) = apply {
                    this.category = networkDetails.category
                    this.visa = networkDetails.visa
                    additionalProperties(networkDetails.additionalProperties)
                }

                /** The payment network used to process this card authorization. */
                fun category(category: Category) = category(JsonField.of(category))

                /** The payment network used to process this card authorization. */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the `visa` network. */
                fun visa(visa: Visa) = visa(JsonField.of(visa))

                /** Fields specific to the `visa` network. */
                @JsonProperty("visa")
                @ExcludeMissing
                fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): NetworkDetails =
                    NetworkDetails(
                        category,
                        visa,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Category && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VISA = Category(JsonField.of("visa"))

                    fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    VISA,
                }

                enum class Value {
                    VISA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        VISA -> Value.VISA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        VISA -> Known.VISA
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields specific to the `visa` network. */
            @JsonDeserialize(builder = Visa.Builder::class)
            @NoAutoDetect
            class Visa
            private constructor(
                private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>,
                private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
                 */
                fun electronicCommerceIndicator(): ElectronicCommerceIndicator? =
                    electronicCommerceIndicator.getNullable("electronic_commerce_indicator")

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 */
                fun pointOfServiceEntryMode(): PointOfServiceEntryMode? =
                    pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")

                /**
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
                 */
                @JsonProperty("electronic_commerce_indicator")
                @ExcludeMissing
                fun _electronicCommerceIndicator() = electronicCommerceIndicator

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 */
                @JsonProperty("point_of_service_entry_mode")
                @ExcludeMissing
                fun _pointOfServiceEntryMode() = pointOfServiceEntryMode

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Visa = apply {
                    if (!validated) {
                        electronicCommerceIndicator()
                        pointOfServiceEntryMode()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Visa &&
                        this.electronicCommerceIndicator == other.electronicCommerceIndicator &&
                        this.pointOfServiceEntryMode == other.pointOfServiceEntryMode &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                electronicCommerceIndicator,
                                pointOfServiceEntryMode,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var electronicCommerceIndicator:
                        JsonField<ElectronicCommerceIndicator> =
                        JsonMissing.of()
                    private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(visa: Visa) = apply {
                        this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                        this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                        additionalProperties(visa.additionalProperties)
                    }

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: ElectronicCommerceIndicator
                    ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                    ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(pointOfServiceEntryMode: PointOfServiceEntryMode) =
                        pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                    ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Visa =
                        Visa(
                            electronicCommerceIndicator,
                            pointOfServiceEntryMode,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class ElectronicCommerceIndicator
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ElectronicCommerceIndicator && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MAIL_PHONE_ORDER =
                            ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                        val RECURRING = ElectronicCommerceIndicator(JsonField.of("recurring"))

                        val INSTALLMENT = ElectronicCommerceIndicator(JsonField.of("installment"))

                        val UNKNOWN_MAIL_PHONE_ORDER =
                            ElectronicCommerceIndicator(JsonField.of("unknown_mail_phone_order"))

                        val SECURE_ELECTRONIC_COMMERCE =
                            ElectronicCommerceIndicator(JsonField.of("secure_electronic_commerce"))

                        val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                            ElectronicCommerceIndicator(
                                JsonField.of(
                                    "non_authenticated_security_transaction_at_3ds_capable_merchant"
                                )
                            )

                        val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                            ElectronicCommerceIndicator(
                                JsonField.of("non_authenticated_security_transaction")
                            )

                        val NON_SECURE_TRANSACTION =
                            ElectronicCommerceIndicator(JsonField.of("non_secure_transaction"))

                        fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                    }

                    enum class Known {
                        MAIL_PHONE_ORDER,
                        RECURRING,
                        INSTALLMENT,
                        UNKNOWN_MAIL_PHONE_ORDER,
                        SECURE_ELECTRONIC_COMMERCE,
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        NON_SECURE_TRANSACTION,
                    }

                    enum class Value {
                        MAIL_PHONE_ORDER,
                        RECURRING,
                        INSTALLMENT,
                        UNKNOWN_MAIL_PHONE_ORDER,
                        SECURE_ELECTRONIC_COMMERCE,
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        NON_SECURE_TRANSACTION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAIL_PHONE_ORDER -> Value.MAIL_PHONE_ORDER
                            RECURRING -> Value.RECURRING
                            INSTALLMENT -> Value.INSTALLMENT
                            UNKNOWN_MAIL_PHONE_ORDER -> Value.UNKNOWN_MAIL_PHONE_ORDER
                            SECURE_ELECTRONIC_COMMERCE -> Value.SECURE_ELECTRONIC_COMMERCE
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                Value.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                            NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                Value.NON_AUTHENTICATED_SECURITY_TRANSACTION
                            NON_SECURE_TRANSACTION -> Value.NON_SECURE_TRANSACTION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAIL_PHONE_ORDER -> Known.MAIL_PHONE_ORDER
                            RECURRING -> Known.RECURRING
                            INSTALLMENT -> Known.INSTALLMENT
                            UNKNOWN_MAIL_PHONE_ORDER -> Known.UNKNOWN_MAIL_PHONE_ORDER
                            SECURE_ELECTRONIC_COMMERCE -> Known.SECURE_ELECTRONIC_COMMERCE
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                Known.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                            NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                Known.NON_AUTHENTICATED_SECURITY_TRANSACTION
                            NON_SECURE_TRANSACTION -> Known.NON_SECURE_TRANSACTION
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ElectronicCommerceIndicator: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class PointOfServiceEntryMode
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PointOfServiceEntryMode && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val UNKNOWN = PointOfServiceEntryMode(JsonField.of("unknown"))

                        val MANUAL = PointOfServiceEntryMode(JsonField.of("manual"))

                        val MAGNETIC_STRIPE_NO_CVV =
                            PointOfServiceEntryMode(JsonField.of("magnetic_stripe_no_cvv"))

                        val OPTICAL_CODE = PointOfServiceEntryMode(JsonField.of("optical_code"))

                        val INTEGRATED_CIRCUIT_CARD =
                            PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

                        val CONTACTLESS = PointOfServiceEntryMode(JsonField.of("contactless"))

                        val CREDENTIAL_ON_FILE =
                            PointOfServiceEntryMode(JsonField.of("credential_on_file"))

                        val MAGNETIC_STRIPE =
                            PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

                        val CONTACTLESS_MAGNETIC_STRIPE =
                            PointOfServiceEntryMode(JsonField.of("contactless_magnetic_stripe"))

                        val INTEGRATED_CIRCUIT_CARD_NO_CVV =
                            PointOfServiceEntryMode(JsonField.of("integrated_circuit_card_no_cvv"))

                        fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                    }

                    enum class Known {
                        UNKNOWN,
                        MANUAL,
                        MAGNETIC_STRIPE_NO_CVV,
                        OPTICAL_CODE,
                        INTEGRATED_CIRCUIT_CARD,
                        CONTACTLESS,
                        CREDENTIAL_ON_FILE,
                        MAGNETIC_STRIPE,
                        CONTACTLESS_MAGNETIC_STRIPE,
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                    }

                    enum class Value {
                        UNKNOWN,
                        MANUAL,
                        MAGNETIC_STRIPE_NO_CVV,
                        OPTICAL_CODE,
                        INTEGRATED_CIRCUIT_CARD,
                        CONTACTLESS,
                        CREDENTIAL_ON_FILE,
                        MAGNETIC_STRIPE,
                        CONTACTLESS_MAGNETIC_STRIPE,
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            UNKNOWN -> Value.UNKNOWN
                            MANUAL -> Value.MANUAL
                            MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
                            OPTICAL_CODE -> Value.OPTICAL_CODE
                            INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
                            CONTACTLESS -> Value.CONTACTLESS
                            CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                            MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                            CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            UNKNOWN -> Known.UNKNOWN
                            MANUAL -> Known.MANUAL
                            MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
                            OPTICAL_CODE -> Known.OPTICAL_CODE
                            INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
                            CONTACTLESS -> Known.CONTACTLESS
                            CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                            MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                            CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PointOfServiceEntryMode: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        /** Network-specific identifiers for a specific request or transaction. */
        @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
        @NoAutoDetect
        class NetworkIdentifiers
        private constructor(
            private val transactionId: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val retrievalReferenceNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
             */
            fun transactionId(): String? = transactionId.getNullable("transaction_id")

            /**
             * A counter used to verify an individual authorization. Expected to be unique per
             * acquirer within a window of time.
             */
            fun traceNumber(): String? = traceNumber.getNullable("trace_number")

            /**
             * A life-cycle identifier used across e.g., an authorization and a reversal. Expected
             * to be unique per acquirer within a window of time. For some card networks the
             * retrieval reference number includes the trace counter.
             */
            fun retrievalReferenceNumber(): String? =
                retrievalReferenceNumber.getNullable("retrieval_reference_number")

            /**
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A counter used to verify an individual authorization. Expected to be unique per
             * acquirer within a window of time.
             */
            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            /**
             * A life-cycle identifier used across e.g., an authorization and a reversal. Expected
             * to be unique per acquirer within a window of time. For some card networks the
             * retrieval reference number includes the trace counter.
             */
            @JsonProperty("retrieval_reference_number")
            @ExcludeMissing
            fun _retrievalReferenceNumber() = retrievalReferenceNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NetworkIdentifiers = apply {
                if (!validated) {
                    transactionId()
                    traceNumber()
                    retrievalReferenceNumber()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkIdentifiers &&
                    this.transactionId == other.transactionId &&
                    this.traceNumber == other.traceNumber &&
                    this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            transactionId,
                            traceNumber,
                            retrievalReferenceNumber,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "NetworkIdentifiers{transactionId=$transactionId, traceNumber=$traceNumber, retrievalReferenceNumber=$retrievalReferenceNumber, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var transactionId: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                    this.transactionId = networkIdentifiers.transactionId
                    this.traceNumber = networkIdentifiers.traceNumber
                    this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                    additionalProperties(networkIdentifiers.additionalProperties)
                }

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                    retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                    this.retrievalReferenceNumber = retrievalReferenceNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): NetworkIdentifiers =
                    NetworkIdentifiers(
                        transactionId,
                        traceNumber,
                        retrievalReferenceNumber,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ProcessingCategory
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProcessingCategory && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_FUNDING = ProcessingCategory(JsonField.of("account_funding"))

                val AUTOMATIC_FUEL_DISPENSER =
                    ProcessingCategory(JsonField.of("automatic_fuel_dispenser"))

                val BILL_PAYMENT = ProcessingCategory(JsonField.of("bill_payment"))

                val PURCHASE = ProcessingCategory(JsonField.of("purchase"))

                val QUASI_CASH = ProcessingCategory(JsonField.of("quasi_cash"))

                val REFUND = ProcessingCategory(JsonField.of("refund"))

                fun of(value: String) = ProcessingCategory(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_FUNDING,
                AUTOMATIC_FUEL_DISPENSER,
                BILL_PAYMENT,
                PURCHASE,
                QUASI_CASH,
                REFUND,
            }

            enum class Value {
                ACCOUNT_FUNDING,
                AUTOMATIC_FUEL_DISPENSER,
                BILL_PAYMENT,
                PURCHASE,
                QUASI_CASH,
                REFUND,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                    AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                    BILL_PAYMENT -> Value.BILL_PAYMENT
                    PURCHASE -> Value.PURCHASE
                    QUASI_CASH -> Value.QUASI_CASH
                    REFUND -> Value.REFUND
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                    AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                    BILL_PAYMENT -> Known.BILL_PAYMENT
                    PURCHASE -> Known.PURCHASE
                    QUASI_CASH -> Known.QUASI_CASH
                    REFUND -> Known.REFUND
                    else -> throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Fields specific to the type of request, such as an incremental authorization. */
        @JsonDeserialize(builder = RequestDetails.Builder::class)
        @NoAutoDetect
        class RequestDetails
        private constructor(
            private val category: JsonField<Category>,
            private val initialAuthorization: JsonValue,
            private val incrementalAuthorization: JsonField<IncrementalAuthorization>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            fun category(): Category = category.getRequired("category")

            /** Fields specific to the category `incremental_authorization`. */
            fun incrementalAuthorization(): IncrementalAuthorization? =
                incrementalAuthorization.getNullable("incremental_authorization")

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /** Fields specific to the category `initial_authorization`. */
            @JsonProperty("initial_authorization")
            @ExcludeMissing
            fun _initialAuthorization() = initialAuthorization

            /** Fields specific to the category `incremental_authorization`. */
            @JsonProperty("incremental_authorization")
            @ExcludeMissing
            fun _incrementalAuthorization() = incrementalAuthorization

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RequestDetails = apply {
                if (!validated) {
                    category()
                    incrementalAuthorization()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequestDetails &&
                    this.category == other.category &&
                    this.initialAuthorization == other.initialAuthorization &&
                    this.incrementalAuthorization == other.incrementalAuthorization &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            category,
                            initialAuthorization,
                            incrementalAuthorization,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RequestDetails{category=$category, initialAuthorization=$initialAuthorization, incrementalAuthorization=$incrementalAuthorization, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var initialAuthorization: JsonValue = JsonMissing.of()
                private var incrementalAuthorization: JsonField<IncrementalAuthorization> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(requestDetails: RequestDetails) = apply {
                    this.category = requestDetails.category
                    this.initialAuthorization = requestDetails.initialAuthorization
                    this.incrementalAuthorization = requestDetails.incrementalAuthorization
                    additionalProperties(requestDetails.additionalProperties)
                }

                /**
                 * The type of this request (e.g., an initial authorization or an incremental
                 * authorization).
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of this request (e.g., an initial authorization or an incremental
                 * authorization).
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the category `initial_authorization`. */
                @JsonProperty("initial_authorization")
                @ExcludeMissing
                fun initialAuthorization(initialAuthorization: JsonValue) = apply {
                    this.initialAuthorization = initialAuthorization
                }

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(incrementalAuthorization: IncrementalAuthorization) =
                    incrementalAuthorization(JsonField.of(incrementalAuthorization))

                /** Fields specific to the category `incremental_authorization`. */
                @JsonProperty("incremental_authorization")
                @ExcludeMissing
                fun incrementalAuthorization(
                    incrementalAuthorization: JsonField<IncrementalAuthorization>
                ) = apply { this.incrementalAuthorization = incrementalAuthorization }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RequestDetails =
                    RequestDetails(
                        category,
                        initialAuthorization,
                        incrementalAuthorization,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Category && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val INITIAL_AUTHORIZATION = Category(JsonField.of("initial_authorization"))

                    val INCREMENTAL_AUTHORIZATION =
                        Category(JsonField.of("incremental_authorization"))

                    fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    INITIAL_AUTHORIZATION,
                    INCREMENTAL_AUTHORIZATION,
                }

                enum class Value {
                    INITIAL_AUTHORIZATION,
                    INCREMENTAL_AUTHORIZATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Value.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Value.INCREMENTAL_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Known.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Known.INCREMENTAL_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields specific to the category `incremental_authorization`. */
            @JsonDeserialize(builder = IncrementalAuthorization.Builder::class)
            @NoAutoDetect
            class IncrementalAuthorization
            private constructor(
                private val cardPaymentId: JsonField<String>,
                private val originalCardAuthorizationId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The card payment for this authorization and increment. */
                fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 */
                fun originalCardAuthorizationId(): String =
                    originalCardAuthorizationId.getRequired("original_card_authorization_id")

                /** The card payment for this authorization and increment. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun _cardPaymentId() = cardPaymentId

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 */
                @JsonProperty("original_card_authorization_id")
                @ExcludeMissing
                fun _originalCardAuthorizationId() = originalCardAuthorizationId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): IncrementalAuthorization = apply {
                    if (!validated) {
                        cardPaymentId()
                        originalCardAuthorizationId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is IncrementalAuthorization &&
                        this.cardPaymentId == other.cardPaymentId &&
                        this.originalCardAuthorizationId == other.originalCardAuthorizationId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                cardPaymentId,
                                originalCardAuthorizationId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "IncrementalAuthorization{cardPaymentId=$cardPaymentId, originalCardAuthorizationId=$originalCardAuthorizationId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var cardPaymentId: JsonField<String> = JsonMissing.of()
                    private var originalCardAuthorizationId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(incrementalAuthorization: IncrementalAuthorization) = apply {
                        this.cardPaymentId = incrementalAuthorization.cardPaymentId
                        this.originalCardAuthorizationId =
                            incrementalAuthorization.originalCardAuthorizationId
                        additionalProperties(incrementalAuthorization.additionalProperties)
                    }

                    /** The card payment for this authorization and increment. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /** The card payment for this authorization and increment. */
                    @JsonProperty("card_payment_id")
                    @ExcludeMissing
                    fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                        this.cardPaymentId = cardPaymentId
                    }

                    /**
                     * The identifier of the card authorization this request is attempting to
                     * increment.
                     */
                    fun originalCardAuthorizationId(originalCardAuthorizationId: String) =
                        originalCardAuthorizationId(JsonField.of(originalCardAuthorizationId))

                    /**
                     * The identifier of the card authorization this request is attempting to
                     * increment.
                     */
                    @JsonProperty("original_card_authorization_id")
                    @ExcludeMissing
                    fun originalCardAuthorizationId(
                        originalCardAuthorizationId: JsonField<String>
                    ) = apply { this.originalCardAuthorizationId = originalCardAuthorizationId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): IncrementalAuthorization =
                        IncrementalAuthorization(
                            cardPaymentId,
                            originalCardAuthorizationId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        /** Fields related to verification of cardholder-provided values. */
        @JsonDeserialize(builder = Verification.Builder::class)
        @NoAutoDetect
        class Verification
        private constructor(
            private val cardholderAddress: JsonField<CardholderAddress>,
            private val cardVerificationCode: JsonField<CardVerificationCode>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            fun cardholderAddress(): CardholderAddress =
                cardholderAddress.getRequired("cardholder_address")

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            fun cardVerificationCode(): CardVerificationCode =
                cardVerificationCode.getRequired("card_verification_code")

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            fun _cardholderAddress() = cardholderAddress

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            @JsonProperty("card_verification_code")
            @ExcludeMissing
            fun _cardVerificationCode() = cardVerificationCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Verification = apply {
                if (!validated) {
                    cardholderAddress().validate()
                    cardVerificationCode().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Verification &&
                    this.cardholderAddress == other.cardholderAddress &&
                    this.cardVerificationCode == other.cardVerificationCode &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            cardholderAddress,
                            cardVerificationCode,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Verification{cardholderAddress=$cardholderAddress, cardVerificationCode=$cardVerificationCode, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                private var cardVerificationCode: JsonField<CardVerificationCode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(verification: Verification) = apply {
                    this.cardholderAddress = verification.cardholderAddress
                    this.cardVerificationCode = verification.cardVerificationCode
                    additionalProperties(verification.additionalProperties)
                }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(cardholderAddress: CardholderAddress) =
                    cardholderAddress(JsonField.of(cardholderAddress))

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                    this.cardholderAddress = cardholderAddress
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                    cardVerificationCode(JsonField.of(cardVerificationCode))

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun cardVerificationCode(cardVerificationCode: JsonField<CardVerificationCode>) =
                    apply {
                        this.cardVerificationCode = cardVerificationCode
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Verification =
                    Verification(
                        cardholderAddress,
                        cardVerificationCode,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            @JsonDeserialize(builder = CardVerificationCode.Builder::class)
            @NoAutoDetect
            class CardVerificationCode
            private constructor(
                private val result: JsonField<Result>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The result of verifying the Card Verification Code. */
                fun result(): Result = result.getRequired("result")

                /** The result of verifying the Card Verification Code. */
                @JsonProperty("result") @ExcludeMissing fun _result() = result

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardVerificationCode = apply {
                    if (!validated) {
                        result()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardVerificationCode &&
                        this.result == other.result &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(result, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var result: JsonField<Result> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                        this.result = cardVerificationCode.result
                        additionalProperties(cardVerificationCode.additionalProperties)
                    }

                    /** The result of verifying the Card Verification Code. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /** The result of verifying the Card Verification Code. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CardVerificationCode =
                        CardVerificationCode(result, additionalProperties.toUnmodifiable())
                }

                class Result
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Result && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val NOT_CHECKED = Result(JsonField.of("not_checked"))

                        val MATCH = Result(JsonField.of("match"))

                        val NO_MATCH = Result(JsonField.of("no_match"))

                        fun of(value: String) = Result(JsonField.of(value))
                    }

                    enum class Known {
                        NOT_CHECKED,
                        MATCH,
                        NO_MATCH,
                    }

                    enum class Value {
                        NOT_CHECKED,
                        MATCH,
                        NO_MATCH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NOT_CHECKED -> Value.NOT_CHECKED
                            MATCH -> Value.MATCH
                            NO_MATCH -> Value.NO_MATCH
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NOT_CHECKED -> Known.NOT_CHECKED
                            MATCH -> Known.MATCH
                            NO_MATCH -> Known.NO_MATCH
                            else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @JsonDeserialize(builder = CardholderAddress.Builder::class)
            @NoAutoDetect
            class CardholderAddress
            private constructor(
                private val providedPostalCode: JsonField<String>,
                private val providedLine1: JsonField<String>,
                private val actualPostalCode: JsonField<String>,
                private val actualLine1: JsonField<String>,
                private val result: JsonField<Result>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The postal code provided for verification in the authorization request. */
                fun providedPostalCode(): String? =
                    providedPostalCode.getNullable("provided_postal_code")

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 */
                fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                /** The postal code of the address on file for the cardholder. */
                fun actualPostalCode(): String? = actualPostalCode.getNullable("actual_postal_code")

                /** Line 1 of the address on file for the cardholder. */
                fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                /** The address verification result returned to the card network. */
                fun result(): Result = result.getRequired("result")

                /** The postal code provided for verification in the authorization request. */
                @JsonProperty("provided_postal_code")
                @ExcludeMissing
                fun _providedPostalCode() = providedPostalCode

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 */
                @JsonProperty("provided_line1") @ExcludeMissing fun _providedLine1() = providedLine1

                /** The postal code of the address on file for the cardholder. */
                @JsonProperty("actual_postal_code")
                @ExcludeMissing
                fun _actualPostalCode() = actualPostalCode

                /** Line 1 of the address on file for the cardholder. */
                @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                /** The address verification result returned to the card network. */
                @JsonProperty("result") @ExcludeMissing fun _result() = result

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardholderAddress = apply {
                    if (!validated) {
                        providedPostalCode()
                        providedLine1()
                        actualPostalCode()
                        actualLine1()
                        result()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardholderAddress &&
                        this.providedPostalCode == other.providedPostalCode &&
                        this.providedLine1 == other.providedLine1 &&
                        this.actualPostalCode == other.actualPostalCode &&
                        this.actualLine1 == other.actualLine1 &&
                        this.result == other.result &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                providedPostalCode,
                                providedLine1,
                                actualPostalCode,
                                actualLine1,
                                result,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardholderAddress{providedPostalCode=$providedPostalCode, providedLine1=$providedLine1, actualPostalCode=$actualPostalCode, actualLine1=$actualLine1, result=$result, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var providedPostalCode: JsonField<String> = JsonMissing.of()
                    private var providedLine1: JsonField<String> = JsonMissing.of()
                    private var actualPostalCode: JsonField<String> = JsonMissing.of()
                    private var actualLine1: JsonField<String> = JsonMissing.of()
                    private var result: JsonField<Result> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cardholderAddress: CardholderAddress) = apply {
                        this.providedPostalCode = cardholderAddress.providedPostalCode
                        this.providedLine1 = cardholderAddress.providedLine1
                        this.actualPostalCode = cardholderAddress.actualPostalCode
                        this.actualLine1 = cardholderAddress.actualLine1
                        this.result = cardholderAddress.result
                        additionalProperties(cardholderAddress.additionalProperties)
                    }

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: String) =
                        providedPostalCode(JsonField.of(providedPostalCode))

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                        this.providedPostalCode = providedPostalCode
                    }

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: String) =
                        providedLine1(JsonField.of(providedLine1))

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun providedLine1(providedLine1: JsonField<String>) = apply {
                        this.providedLine1 = providedLine1
                    }

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(actualPostalCode: String) =
                        actualPostalCode(JsonField.of(actualPostalCode))

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                        this.actualPostalCode = actualPostalCode
                    }

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: String) = actualLine1(JsonField.of(actualLine1))

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    fun actualLine1(actualLine1: JsonField<String>) = apply {
                        this.actualLine1 = actualLine1
                    }

                    /** The address verification result returned to the card network. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CardholderAddress =
                        CardholderAddress(
                            providedPostalCode,
                            providedLine1,
                            actualPostalCode,
                            actualLine1,
                            result,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Result
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Result && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val NOT_CHECKED = Result(JsonField.of("not_checked"))

                        val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                            Result(JsonField.of("postal_code_match_address_not_checked"))

                        val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                            Result(JsonField.of("postal_code_match_address_no_match"))

                        val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                            Result(JsonField.of("postal_code_no_match_address_match"))

                        val MATCH = Result(JsonField.of("match"))

                        val NO_MATCH = Result(JsonField.of("no_match"))

                        fun of(value: String) = Result(JsonField.of(value))
                    }

                    enum class Known {
                        NOT_CHECKED,
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        MATCH,
                        NO_MATCH,
                    }

                    enum class Value {
                        NOT_CHECKED,
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        MATCH,
                        NO_MATCH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NOT_CHECKED -> Value.NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                            MATCH -> Value.MATCH
                            NO_MATCH -> Value.NO_MATCH
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NOT_CHECKED -> Known.NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                            MATCH -> Known.MATCH
                            NO_MATCH -> Known.NO_MATCH
                            else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CARD_AUTHORIZATION_REQUESTED =
                Category(JsonField.of("card_authorization_requested"))

            val DIGITAL_WALLET_TOKEN_REQUESTED =
                Category(JsonField.of("digital_wallet_token_requested"))

            val DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                Category(JsonField.of("digital_wallet_authentication_requested"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            CARD_AUTHORIZATION_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
        }

        enum class Value {
            CARD_AUTHORIZATION_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Value.CARD_AUTHORIZATION_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Value.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Known.CARD_AUTHORIZATION_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Known.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Fields related to a digital wallet authentication attempt. */
    @JsonDeserialize(builder = DigitalWalletAuthentication.Builder::class)
    @NoAutoDetect
    class DigitalWalletAuthentication
    private constructor(
        private val result: JsonField<Result>,
        private val cardId: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val channel: JsonField<Channel>,
        private val oneTimePasscode: JsonField<String>,
        private val phone: JsonField<String>,
        private val email: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Whether your application successfully delivered the one-time passcode. */
        fun result(): Result? = result.getNullable("result")

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /** The channel to send the card user their one-time passcode. */
        fun channel(): Channel = channel.getRequired("channel")

        /** The one-time passcode to send the card user. */
        fun oneTimePasscode(): String = oneTimePasscode.getRequired("one_time_passcode")

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        fun phone(): String? = phone.getNullable("phone")

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        fun email(): String? = email.getNullable("email")

        /** Whether your application successfully delivered the one-time passcode. */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        /** The channel to send the card user their one-time passcode. */
        @JsonProperty("channel") @ExcludeMissing fun _channel() = channel

        /** The one-time passcode to send the card user. */
        @JsonProperty("one_time_passcode") @ExcludeMissing fun _oneTimePasscode() = oneTimePasscode

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWalletAuthentication = apply {
            if (!validated) {
                result()
                cardId()
                digitalWallet()
                channel()
                oneTimePasscode()
                phone()
                email()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletAuthentication &&
                this.result == other.result &&
                this.cardId == other.cardId &&
                this.digitalWallet == other.digitalWallet &&
                this.channel == other.channel &&
                this.oneTimePasscode == other.oneTimePasscode &&
                this.phone == other.phone &&
                this.email == other.email &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        result,
                        cardId,
                        digitalWallet,
                        channel,
                        oneTimePasscode,
                        phone,
                        email,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletAuthentication{result=$result, cardId=$cardId, digitalWallet=$digitalWallet, channel=$channel, oneTimePasscode=$oneTimePasscode, phone=$phone, email=$email, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var result: JsonField<Result> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var channel: JsonField<Channel> = JsonMissing.of()
            private var oneTimePasscode: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                this.result = digitalWalletAuthentication.result
                this.cardId = digitalWalletAuthentication.cardId
                this.digitalWallet = digitalWalletAuthentication.digitalWallet
                this.channel = digitalWalletAuthentication.channel
                this.oneTimePasscode = digitalWalletAuthentication.oneTimePasscode
                this.phone = digitalWalletAuthentication.phone
                this.email = digitalWalletAuthentication.email
                additionalProperties(digitalWalletAuthentication.additionalProperties)
            }

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Result) = result(JsonField.of(result))

            /** Whether your application successfully delivered the one-time passcode. */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /** The channel to send the card user their one-time passcode. */
            @JsonProperty("channel")
            @ExcludeMissing
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** The one-time passcode to send the card user. */
            fun oneTimePasscode(oneTimePasscode: String) =
                oneTimePasscode(JsonField.of(oneTimePasscode))

            /** The one-time passcode to send the card user. */
            @JsonProperty("one_time_passcode")
            @ExcludeMissing
            fun oneTimePasscode(oneTimePasscode: JsonField<String>) = apply {
                this.oneTimePasscode = oneTimePasscode
            }

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: String) = email(JsonField.of(email))

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            fun build(): DigitalWalletAuthentication =
                DigitalWalletAuthentication(
                    result,
                    cardId,
                    digitalWallet,
                    channel,
                    oneTimePasscode,
                    phone,
                    email,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Channel
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Channel && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val SMS = Channel(JsonField.of("sms"))

                val EMAIL = Channel(JsonField.of("email"))

                fun of(value: String) = Channel(JsonField.of(value))
            }

            enum class Known {
                SMS,
                EMAIL,
            }

            enum class Value {
                SMS,
                EMAIL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SMS -> Value.SMS
                    EMAIL -> Value.EMAIL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SMS -> Known.SMS
                    EMAIL -> Known.EMAIL
                    else -> throw IncreaseInvalidDataException("Unknown Channel: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DigitalWallet
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalWallet && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                val UNKNOWN = DigitalWallet(JsonField.of("unknown"))

                fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                UNKNOWN,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val SUCCESS = Result(JsonField.of("success"))

                val FAILURE = Result(JsonField.of("failure"))

                fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                SUCCESS,
                FAILURE,
            }

            enum class Value {
                SUCCESS,
                FAILURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonDeserialize(builder = DigitalWalletToken.Builder::class)
    @NoAutoDetect
    class DigitalWalletToken
    private constructor(
        private val decision: JsonField<Decision>,
        private val cardId: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val cardProfileId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        fun decision(): Decision? = decision.getNullable("decision")

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        fun cardProfileId(): String? = cardProfileId.getNullable("card_profile_id")

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        @JsonProperty("card_profile_id") @ExcludeMissing fun _cardProfileId() = cardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWalletToken = apply {
            if (!validated) {
                decision()
                cardId()
                digitalWallet()
                cardProfileId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletToken &&
                this.decision == other.decision &&
                this.cardId == other.cardId &&
                this.digitalWallet == other.digitalWallet &&
                this.cardProfileId == other.cardProfileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        decision,
                        cardId,
                        digitalWallet,
                        cardProfileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletToken{decision=$decision, cardId=$cardId, digitalWallet=$digitalWallet, cardProfileId=$cardProfileId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var decision: JsonField<Decision> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var cardProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                this.decision = digitalWalletToken.decision
                this.cardId = digitalWalletToken.cardId
                this.digitalWallet = digitalWalletToken.digitalWallet
                this.cardProfileId = digitalWalletToken.cardProfileId
                additionalProperties(digitalWalletToken.additionalProperties)
            }

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            fun cardProfileId(cardProfileId: String) = cardProfileId(JsonField.of(cardProfileId))

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            @JsonProperty("card_profile_id")
            @ExcludeMissing
            fun cardProfileId(cardProfileId: JsonField<String>) = apply {
                this.cardProfileId = cardProfileId
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

            fun build(): DigitalWalletToken =
                DigitalWalletToken(
                    decision,
                    cardId,
                    digitalWallet,
                    cardProfileId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Decision && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPROVE = Decision(JsonField.of("approve"))

                val DECLINE = Decision(JsonField.of("decline"))

                fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                DECLINE,
            }

            enum class Value {
                APPROVE,
                DECLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DigitalWallet
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalWallet && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                val UNKNOWN = DigitalWallet(JsonField.of("unknown"))

                fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                UNKNOWN,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val RESPONDED = Status(JsonField.of("responded"))

            val TIMED_OUT = Status(JsonField.of("timed_out"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            RESPONDED,
            TIMED_OUT,
        }

        enum class Value {
            PENDING,
            RESPONDED,
            TIMED_OUT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                RESPONDED -> Value.RESPONDED
                TIMED_OUT -> Value.TIMED_OUT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                RESPONDED -> Known.RESPONDED
                TIMED_OUT -> Known.TIMED_OUT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val REAL_TIME_DECISION = Type(JsonField.of("real_time_decision"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REAL_TIME_DECISION,
        }

        enum class Value {
            REAL_TIME_DECISION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REAL_TIME_DECISION -> Value.REAL_TIME_DECISION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REAL_TIME_DECISION -> Known.REAL_TIME_DECISION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
