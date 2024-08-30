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
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Card Payments group together interactions related to a single card payment, such as an
 * authorization and its corresponding settlement.
 */
@JsonDeserialize(builder = CardPayment.Builder::class)
@NoAutoDetect
class CardPayment
private constructor(
    private val accountId: JsonField<String>,
    private val cardId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val digitalWalletTokenId: JsonField<String>,
    private val elements: JsonField<List<Element>>,
    private val id: JsonField<String>,
    private val physicalCardId: JsonField<String>,
    private val state: JsonField<State>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the Account the Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The Card identifier for this payment. */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Digital Wallet Token identifier for this payment. */
    fun digitalWalletTokenId(): String? =
        digitalWalletTokenId.getNullable("digital_wallet_token_id")

    /** The interactions related to this card payment. */
    fun elements(): List<Element> = elements.getRequired("elements")

    /** The Card Payment identifier. */
    fun id(): String = id.getRequired("id")

    /** The Physical Card identifier for this payment. */
    fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

    /** The summarized state of this card payment. */
    fun state(): State = state.getRequired("state")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_payment`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Card identifier for this payment. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The Digital Wallet Token identifier for this payment. */
    @JsonProperty("digital_wallet_token_id")
    @ExcludeMissing
    fun _digitalWalletTokenId() = digitalWalletTokenId

    /** The interactions related to this card payment. */
    @JsonProperty("elements") @ExcludeMissing fun _elements() = elements

    /** The Card Payment identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The Physical Card identifier for this payment. */
    @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

    /** The summarized state of this card payment. */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_payment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardPayment = apply {
        if (!validated) {
            accountId()
            cardId()
            createdAt()
            digitalWalletTokenId()
            elements().forEach { it.validate() }
            id()
            physicalCardId()
            state().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPayment &&
            this.accountId == other.accountId &&
            this.cardId == other.cardId &&
            this.createdAt == other.createdAt &&
            this.digitalWalletTokenId == other.digitalWalletTokenId &&
            this.elements == other.elements &&
            this.id == other.id &&
            this.physicalCardId == other.physicalCardId &&
            this.state == other.state &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    cardId,
                    createdAt,
                    digitalWalletTokenId,
                    elements,
                    id,
                    physicalCardId,
                    state,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardPayment{accountId=$accountId, cardId=$cardId, createdAt=$createdAt, digitalWalletTokenId=$digitalWalletTokenId, elements=$elements, id=$id, physicalCardId=$physicalCardId, state=$state, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
        private var elements: JsonField<List<Element>> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var physicalCardId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardPayment: CardPayment) = apply {
            this.accountId = cardPayment.accountId
            this.cardId = cardPayment.cardId
            this.createdAt = cardPayment.createdAt
            this.digitalWalletTokenId = cardPayment.digitalWalletTokenId
            this.elements = cardPayment.elements
            this.id = cardPayment.id
            this.physicalCardId = cardPayment.physicalCardId
            this.state = cardPayment.state
            this.type = cardPayment.type
            additionalProperties(cardPayment.additionalProperties)
        }

        /** The identifier for the Account the Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Card identifier for this payment. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The Card identifier for this payment. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The Digital Wallet Token identifier for this payment. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) =
            digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

        /** The Digital Wallet Token identifier for this payment. */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
        }

        /** The interactions related to this card payment. */
        fun elements(elements: List<Element>) = elements(JsonField.of(elements))

        /** The interactions related to this card payment. */
        @JsonProperty("elements")
        @ExcludeMissing
        fun elements(elements: JsonField<List<Element>>) = apply { this.elements = elements }

        /** The Card Payment identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Payment identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Physical Card identifier for this payment. */
        fun physicalCardId(physicalCardId: String) = physicalCardId(JsonField.of(physicalCardId))

        /** The Physical Card identifier for this payment. */
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        fun physicalCardId(physicalCardId: JsonField<String>) = apply {
            this.physicalCardId = physicalCardId
        }

        /** The summarized state of this card payment. */
        fun state(state: State) = state(JsonField.of(state))

        /** The summarized state of this card payment. */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_payment`.
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

        fun build(): CardPayment =
            CardPayment(
                accountId,
                cardId,
                createdAt,
                digitalWalletTokenId,
                elements.map { it.toUnmodifiable() },
                id,
                physicalCardId,
                state,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Element.Builder::class)
    @NoAutoDetect
    class Element
    private constructor(
        private val cardAuthorization: JsonField<CardAuthorization>,
        private val cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration>,
        private val cardDecline: JsonField<CardDecline>,
        private val cardFuelConfirmation: JsonField<CardFuelConfirmation>,
        private val cardIncrement: JsonField<CardIncrement>,
        private val cardRefund: JsonField<CardRefund>,
        private val cardReversal: JsonField<CardReversal>,
        private val cardSettlement: JsonField<CardSettlement>,
        private val cardValidation: JsonField<CardValidation>,
        private val category: JsonField<Category>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        fun cardAuthorization(): CardAuthorization? =
            cardAuthorization.getNullable("card_authorization")

        /**
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        fun cardAuthorizationExpiration(): CardAuthorizationExpiration? =
            cardAuthorizationExpiration.getNullable("card_authorization_expiration")

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        fun cardDecline(): CardDecline? = cardDecline.getNullable("card_decline")

        /**
         * A Card Fuel Confirmation object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_fuel_confirmation`.
         */
        fun cardFuelConfirmation(): CardFuelConfirmation? =
            cardFuelConfirmation.getNullable("card_fuel_confirmation")

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        fun cardIncrement(): CardIncrement? = cardIncrement.getNullable("card_increment")

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        fun cardRefund(): CardRefund? = cardRefund.getNullable("card_refund")

        /**
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        fun cardReversal(): CardReversal? = cardReversal.getNullable("card_reversal")

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        fun cardSettlement(): CardSettlement? = cardSettlement.getNullable("card_settlement")

        /**
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        fun cardValidation(): CardValidation? = cardValidation.getNullable("card_validation")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the card
         * payment element was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization() = cardAuthorization

        /**
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        @JsonProperty("card_authorization_expiration")
        @ExcludeMissing
        fun _cardAuthorizationExpiration() = cardAuthorizationExpiration

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonProperty("card_decline") @ExcludeMissing fun _cardDecline() = cardDecline

        /**
         * A Card Fuel Confirmation object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_fuel_confirmation`.
         */
        @JsonProperty("card_fuel_confirmation")
        @ExcludeMissing
        fun _cardFuelConfirmation() = cardFuelConfirmation

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        @JsonProperty("card_increment") @ExcludeMissing fun _cardIncrement() = cardIncrement

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonProperty("card_refund") @ExcludeMissing fun _cardRefund() = cardRefund

        /**
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        @JsonProperty("card_reversal") @ExcludeMissing fun _cardReversal() = cardReversal

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonProperty("card_settlement") @ExcludeMissing fun _cardSettlement() = cardSettlement

        /**
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        @JsonProperty("card_validation") @ExcludeMissing fun _cardValidation() = cardValidation

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the card
         * payment element was created.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Element = apply {
            if (!validated) {
                cardAuthorization()?.validate()
                cardAuthorizationExpiration()?.validate()
                cardDecline()?.validate()
                cardFuelConfirmation()?.validate()
                cardIncrement()?.validate()
                cardRefund()?.validate()
                cardReversal()?.validate()
                cardSettlement()?.validate()
                cardValidation()?.validate()
                category()
                createdAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Element &&
                this.cardAuthorization == other.cardAuthorization &&
                this.cardAuthorizationExpiration == other.cardAuthorizationExpiration &&
                this.cardDecline == other.cardDecline &&
                this.cardFuelConfirmation == other.cardFuelConfirmation &&
                this.cardIncrement == other.cardIncrement &&
                this.cardRefund == other.cardRefund &&
                this.cardReversal == other.cardReversal &&
                this.cardSettlement == other.cardSettlement &&
                this.cardValidation == other.cardValidation &&
                this.category == other.category &&
                this.createdAt == other.createdAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cardAuthorization,
                        cardAuthorizationExpiration,
                        cardDecline,
                        cardFuelConfirmation,
                        cardIncrement,
                        cardRefund,
                        cardReversal,
                        cardSettlement,
                        cardValidation,
                        category,
                        createdAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Element{cardAuthorization=$cardAuthorization, cardAuthorizationExpiration=$cardAuthorizationExpiration, cardDecline=$cardDecline, cardFuelConfirmation=$cardFuelConfirmation, cardIncrement=$cardIncrement, cardRefund=$cardRefund, cardReversal=$cardReversal, cardSettlement=$cardSettlement, cardValidation=$cardValidation, category=$category, createdAt=$createdAt, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
            private var cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration> =
                JsonMissing.of()
            private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
            private var cardFuelConfirmation: JsonField<CardFuelConfirmation> = JsonMissing.of()
            private var cardIncrement: JsonField<CardIncrement> = JsonMissing.of()
            private var cardRefund: JsonField<CardRefund> = JsonMissing.of()
            private var cardReversal: JsonField<CardReversal> = JsonMissing.of()
            private var cardSettlement: JsonField<CardSettlement> = JsonMissing.of()
            private var cardValidation: JsonField<CardValidation> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(element: Element) = apply {
                this.cardAuthorization = element.cardAuthorization
                this.cardAuthorizationExpiration = element.cardAuthorizationExpiration
                this.cardDecline = element.cardDecline
                this.cardFuelConfirmation = element.cardFuelConfirmation
                this.cardIncrement = element.cardIncrement
                this.cardRefund = element.cardRefund
                this.cardReversal = element.cardReversal
                this.cardSettlement = element.cardSettlement
                this.cardValidation = element.cardValidation
                this.category = element.category
                this.createdAt = element.createdAt
                additionalProperties(element.additionalProperties)
            }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization) =
                cardAuthorization(JsonField.of(cardAuthorization))

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * A Card Authorization Expiration object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_authorization_expiration`.
             */
            fun cardAuthorizationExpiration(
                cardAuthorizationExpiration: CardAuthorizationExpiration
            ) = cardAuthorizationExpiration(JsonField.of(cardAuthorizationExpiration))

            /**
             * A Card Authorization Expiration object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_authorization_expiration`.
             */
            @JsonProperty("card_authorization_expiration")
            @ExcludeMissing
            fun cardAuthorizationExpiration(
                cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration>
            ) = apply { this.cardAuthorizationExpiration = cardAuthorizationExpiration }

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: CardDecline) = cardDecline(JsonField.of(cardDecline))

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            @JsonProperty("card_decline")
            @ExcludeMissing
            fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                this.cardDecline = cardDecline
            }

            /**
             * A Card Fuel Confirmation object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_fuel_confirmation`.
             */
            fun cardFuelConfirmation(cardFuelConfirmation: CardFuelConfirmation) =
                cardFuelConfirmation(JsonField.of(cardFuelConfirmation))

            /**
             * A Card Fuel Confirmation object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_fuel_confirmation`.
             */
            @JsonProperty("card_fuel_confirmation")
            @ExcludeMissing
            fun cardFuelConfirmation(cardFuelConfirmation: JsonField<CardFuelConfirmation>) =
                apply {
                    this.cardFuelConfirmation = cardFuelConfirmation
                }

            /**
             * A Card Increment object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_increment`.
             */
            fun cardIncrement(cardIncrement: CardIncrement) =
                cardIncrement(JsonField.of(cardIncrement))

            /**
             * A Card Increment object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_increment`.
             */
            @JsonProperty("card_increment")
            @ExcludeMissing
            fun cardIncrement(cardIncrement: JsonField<CardIncrement>) = apply {
                this.cardIncrement = cardIncrement
            }

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            fun cardRefund(cardRefund: CardRefund) = cardRefund(JsonField.of(cardRefund))

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            @JsonProperty("card_refund")
            @ExcludeMissing
            fun cardRefund(cardRefund: JsonField<CardRefund>) = apply {
                this.cardRefund = cardRefund
            }

            /**
             * A Card Reversal object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_reversal`.
             */
            fun cardReversal(cardReversal: CardReversal) = cardReversal(JsonField.of(cardReversal))

            /**
             * A Card Reversal object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_reversal`.
             */
            @JsonProperty("card_reversal")
            @ExcludeMissing
            fun cardReversal(cardReversal: JsonField<CardReversal>) = apply {
                this.cardReversal = cardReversal
            }

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            fun cardSettlement(cardSettlement: CardSettlement) =
                cardSettlement(JsonField.of(cardSettlement))

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            @JsonProperty("card_settlement")
            @ExcludeMissing
            fun cardSettlement(cardSettlement: JsonField<CardSettlement>) = apply {
                this.cardSettlement = cardSettlement
            }

            /**
             * A Card Validation object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_validation`.
             */
            fun cardValidation(cardValidation: CardValidation) =
                cardValidation(JsonField.of(cardValidation))

            /**
             * A Card Validation object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_validation`.
             */
            @JsonProperty("card_validation")
            @ExcludeMissing
            fun cardValidation(cardValidation: JsonField<CardValidation>) = apply {
                this.cardValidation = cardValidation
            }

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * card payment element was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * card payment element was created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun build(): Element =
                Element(
                    cardAuthorization,
                    cardAuthorizationExpiration,
                    cardDecline,
                    cardFuelConfirmation,
                    cardIncrement,
                    cardRefund,
                    cardReversal,
                    cardSettlement,
                    cardValidation,
                    category,
                    createdAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonDeserialize(builder = CardAuthorization.Builder::class)
        @NoAutoDetect
        class CardAuthorization
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val digitalWalletTokenId: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val id: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantPostalCode: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val networkRiskScore: JsonField<Long>,
            private val pendingTransactionId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val processingCategory: JsonField<ProcessingCategory>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): String? =
                digitalWalletTokenId.getNullable("digital_wallet_token_id")

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /** The Card Authorization identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

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

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): String? =
                merchantPostalCode.getNullable("merchant_postal_code")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

            /** The pending amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(): ProcessingCategory =
                processingCategory.getRequired("processing_category")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            fun type(): Type = type.getRequired("type")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

            /** The Card Authorization identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

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
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode() = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore() = networkRiskScore

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /** The pending amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory() = processingCategory

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardAuthorization = apply {
                if (!validated) {
                    actioner()
                    amount()
                    cardPaymentId()
                    currency()
                    digitalWalletTokenId()
                    direction()
                    expiresAt()
                    id()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantDescriptor()
                    merchantPostalCode()
                    merchantState()
                    networkDetails().validate()
                    networkIdentifiers().validate()
                    networkRiskScore()
                    pendingTransactionId()
                    physicalCardId()
                    presentmentAmount()
                    presentmentCurrency()
                    processingCategory()
                    realTimeDecisionId()
                    type()
                    verification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardAuthorization &&
                    this.actioner == other.actioner &&
                    this.amount == other.amount &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.direction == other.direction &&
                    this.expiresAt == other.expiresAt &&
                    this.id == other.id &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantPostalCode == other.merchantPostalCode &&
                    this.merchantState == other.merchantState &&
                    this.networkDetails == other.networkDetails &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.networkRiskScore == other.networkRiskScore &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.physicalCardId == other.physicalCardId &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.processingCategory == other.processingCategory &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.type == other.type &&
                    this.verification == other.verification &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            actioner,
                            amount,
                            cardPaymentId,
                            currency,
                            digitalWalletTokenId,
                            direction,
                            expiresAt,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantPostalCode,
                            merchantState,
                            networkDetails,
                            networkIdentifiers,
                            networkRiskScore,
                            pendingTransactionId,
                            physicalCardId,
                            presentmentAmount,
                            presentmentCurrency,
                            processingCategory,
                            realTimeDecisionId,
                            type,
                            verification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardAuthorization{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, expiresAt=$expiresAt, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var actioner: JsonField<Actioner> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantPostalCode: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var verification: JsonField<Verification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardAuthorization: CardAuthorization) = apply {
                    this.actioner = cardAuthorization.actioner
                    this.amount = cardAuthorization.amount
                    this.cardPaymentId = cardAuthorization.cardPaymentId
                    this.currency = cardAuthorization.currency
                    this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                    this.direction = cardAuthorization.direction
                    this.expiresAt = cardAuthorization.expiresAt
                    this.id = cardAuthorization.id
                    this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                    this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                    this.merchantCity = cardAuthorization.merchantCity
                    this.merchantCountry = cardAuthorization.merchantCountry
                    this.merchantDescriptor = cardAuthorization.merchantDescriptor
                    this.merchantPostalCode = cardAuthorization.merchantPostalCode
                    this.merchantState = cardAuthorization.merchantState
                    this.networkDetails = cardAuthorization.networkDetails
                    this.networkIdentifiers = cardAuthorization.networkIdentifiers
                    this.networkRiskScore = cardAuthorization.networkRiskScore
                    this.pendingTransactionId = cardAuthorization.pendingTransactionId
                    this.physicalCardId = cardAuthorization.physicalCardId
                    this.presentmentAmount = cardAuthorization.presentmentAmount
                    this.presentmentCurrency = cardAuthorization.presentmentCurrency
                    this.processingCategory = cardAuthorization.processingCategory
                    this.realTimeDecisionId = cardAuthorization.realTimeDecisionId
                    this.type = cardAuthorization.type
                    this.verification = cardAuthorization.verification
                    additionalProperties(cardAuthorization.additionalProperties)
                }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner")
                @ExcludeMissing
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                @JsonProperty("expires_at")
                @ExcludeMissing
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /** The Card Authorization identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Authorization identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String) =
                    merchantPostalCode(JsonField.of(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
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

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(JsonField.of(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String) =
                    physicalCardId(JsonField.of(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
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

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification")
                @ExcludeMissing
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
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

                fun build(): CardAuthorization =
                    CardAuthorization(
                        actioner,
                        amount,
                        cardPaymentId,
                        currency,
                        digitalWalletTokenId,
                        direction,
                        expiresAt,
                        id,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantDescriptor,
                        merchantPostalCode,
                        merchantState,
                        networkDetails,
                        networkIdentifiers,
                        networkRiskScore,
                        pendingTransactionId,
                        physicalCardId,
                        presentmentAmount,
                        presentmentCurrency,
                        processingCategory,
                        realTimeDecisionId,
                        type,
                        verification,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Actioner && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USER = Actioner(JsonField.of("user"))

                    val INCREASE = Actioner(JsonField.of("increase"))

                    val NETWORK = Actioner(JsonField.of("network"))

                    fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Direction && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val SETTLEMENT = Direction(JsonField.of("settlement"))

                    val REFUND = Direction(JsonField.of("refund"))

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    SETTLEMENT,
                    REFUND,
                }

                enum class Value {
                    SETTLEMENT,
                    REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SETTLEMENT -> Value.SETTLEMENT
                        REFUND -> Value.REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SETTLEMENT -> Known.SETTLEMENT
                        REFUND -> Known.REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            additionalProperties(visa.additionalProperties)
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator
                        ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
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
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    ) : Enum {

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

                            val INSTALLMENT =
                                ElectronicCommerceIndicator(JsonField.of("installment"))

                            val UNKNOWN_MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(
                                    JsonField.of("unknown_mail_phone_order")
                                )

                            val SECURE_ELECTRONIC_COMMERCE =
                                ElectronicCommerceIndicator(
                                    JsonField.of("secure_electronic_commerce")
                                )

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
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                    ) : Enum {

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
                                PointOfServiceEntryMode(
                                    JsonField.of("integrated_circuit_card_no_cvv")
                                )

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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ProcessingCategory
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                        else ->
                            throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_AUTHORIZATION = Type(JsonField.of("card_authorization"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_AUTHORIZATION,
                }

                enum class Value {
                    CARD_AUTHORIZATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields related to verification of cardholder-provided values. */
            @JsonDeserialize(builder = Verification.Builder::class)
            @NoAutoDetect
            class Verification
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode() = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress() = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Verification = apply {
                    if (!validated) {
                        cardVerificationCode().validate()
                        cardholderAddress().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Verification &&
                        this.cardVerificationCode == other.cardVerificationCode &&
                        this.cardholderAddress == other.cardholderAddress &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                cardVerificationCode,
                                cardholderAddress,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var cardVerificationCode: JsonField<CardVerificationCode> =
                        JsonMissing.of()
                    private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(verification: Verification) = apply {
                        this.cardVerificationCode = verification.cardVerificationCode
                        this.cardholderAddress = verification.cardholderAddress
                        additionalProperties(verification.additionalProperties)
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                        cardVerificationCode(JsonField.of(cardVerificationCode))

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    fun cardVerificationCode(
                        cardVerificationCode: JsonField<CardVerificationCode>
                    ) = apply { this.cardVerificationCode = cardVerificationCode }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: CardholderAddress) =
                        cardholderAddress(JsonField.of(cardholderAddress))

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
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
                            cardVerificationCode,
                            cardholderAddress,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardVerificationCode =
                            CardVerificationCode(result, additionalProperties.toUnmodifiable())
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonDeserialize(builder = CardholderAddress.Builder::class)
                @NoAutoDetect
                class CardholderAddress
                private constructor(
                    private val actualLine1: JsonField<String>,
                    private val actualPostalCode: JsonField<String>,
                    private val providedLine1: JsonField<String>,
                    private val providedPostalCode: JsonField<String>,
                    private val result: JsonField<Result>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(): String? =
                        actualPostalCode.getNullable("actual_postal_code")

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(): String? =
                        providedPostalCode.getNullable("provided_postal_code")

                    /** The address verification result returned to the card network. */
                    fun result(): Result = result.getRequired("result")

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode() = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1() = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode() = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result") @ExcludeMissing fun _result() = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CardholderAddress = apply {
                        if (!validated) {
                            actualLine1()
                            actualPostalCode()
                            providedLine1()
                            providedPostalCode()
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
                            this.actualLine1 == other.actualLine1 &&
                            this.actualPostalCode == other.actualPostalCode &&
                            this.providedLine1 == other.providedLine1 &&
                            this.providedPostalCode == other.providedPostalCode &&
                            this.result == other.result &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    actualLine1,
                                    actualPostalCode,
                                    providedLine1,
                                    providedPostalCode,
                                    result,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var actualLine1: JsonField<String> = JsonMissing.of()
                        private var actualPostalCode: JsonField<String> = JsonMissing.of()
                        private var providedLine1: JsonField<String> = JsonMissing.of()
                        private var providedPostalCode: JsonField<String> = JsonMissing.of()
                        private var result: JsonField<Result> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            this.actualLine1 = cardholderAddress.actualLine1
                            this.actualPostalCode = cardholderAddress.actualPostalCode
                            this.providedLine1 = cardholderAddress.providedLine1
                            this.providedPostalCode = cardholderAddress.providedPostalCode
                            this.result = cardholderAddress.result
                            additionalProperties(cardholderAddress.additionalProperties)
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String) =
                            actualLine1(JsonField.of(actualLine1))

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
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

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String) =
                            providedLine1(JsonField.of(providedLine1))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String) =
                            providedPostalCode(JsonField.of(providedPostalCode))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                actualLine1,
                                actualPostalCode,
                                providedLine1,
                                providedPostalCode,
                                result,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

        /**
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        @JsonDeserialize(builder = CardAuthorizationExpiration.Builder::class)
        @NoAutoDetect
        class CardAuthorizationExpiration
        private constructor(
            private val cardAuthorizationId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val expiredAmount: JsonField<Long>,
            private val id: JsonField<String>,
            private val network: JsonField<Network>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier for the Card Authorization this reverses. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The amount of this authorization expiration in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            fun expiredAmount(): Long = expiredAmount.getRequired("expired_amount")

            /** The Card Authorization Expiration identifier. */
            fun id(): String = id.getRequired("id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization_expiration`.
             */
            fun type(): Type = type.getRequired("type")

            /** The identifier for the Card Authorization this reverses. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * The amount of this authorization expiration in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            @JsonProperty("expired_amount") @ExcludeMissing fun _expiredAmount() = expiredAmount

            /** The Card Authorization Expiration identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization_expiration`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardAuthorizationExpiration = apply {
                if (!validated) {
                    cardAuthorizationId()
                    currency()
                    expiredAmount()
                    id()
                    network()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardAuthorizationExpiration &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.currency == other.currency &&
                    this.expiredAmount == other.expiredAmount &&
                    this.id == other.id &&
                    this.network == other.network &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            cardAuthorizationId,
                            currency,
                            expiredAmount,
                            id,
                            network,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardAuthorizationExpiration{cardAuthorizationId=$cardAuthorizationId, currency=$currency, expiredAmount=$expiredAmount, id=$id, network=$network, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var expiredAmount: JsonField<Long> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardAuthorizationExpiration: CardAuthorizationExpiration) =
                    apply {
                        this.cardAuthorizationId = cardAuthorizationExpiration.cardAuthorizationId
                        this.currency = cardAuthorizationExpiration.currency
                        this.expiredAmount = cardAuthorizationExpiration.expiredAmount
                        this.id = cardAuthorizationExpiration.id
                        this.network = cardAuthorizationExpiration.network
                        this.type = cardAuthorizationExpiration.type
                        additionalProperties(cardAuthorizationExpiration.additionalProperties)
                    }

                /** The identifier for the Card Authorization this reverses. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this reverses. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * The amount of this authorization expiration in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun expiredAmount(expiredAmount: Long) = expiredAmount(JsonField.of(expiredAmount))

                /**
                 * The amount of this authorization expiration in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("expired_amount")
                @ExcludeMissing
                fun expiredAmount(expiredAmount: JsonField<Long>) = apply {
                    this.expiredAmount = expiredAmount
                }

                /** The Card Authorization Expiration identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Authorization Expiration identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization_expiration`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization_expiration`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardAuthorizationExpiration =
                    CardAuthorizationExpiration(
                        cardAuthorizationId,
                        currency,
                        expiredAmount,
                        id,
                        network,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Network
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Network && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VISA = Network(JsonField.of("visa"))

                    fun of(value: String) = Network(JsonField.of(value))
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
                        else -> throw IncreaseInvalidDataException("Unknown Network: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_AUTHORIZATION_EXPIRATION =
                        Type(JsonField.of("card_authorization_expiration"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_AUTHORIZATION_EXPIRATION,
                }

                enum class Value {
                    CARD_AUTHORIZATION_EXPIRATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_AUTHORIZATION_EXPIRATION -> Value.CARD_AUTHORIZATION_EXPIRATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_AUTHORIZATION_EXPIRATION -> Known.CARD_AUTHORIZATION_EXPIRATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonDeserialize(builder = CardDecline.Builder::class)
        @NoAutoDetect
        class CardDecline
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val declinedTransactionId: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val id: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantPostalCode: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val networkRiskScore: JsonField<Long>,
            private val physicalCardId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val processingCategory: JsonField<ProcessingCategory>,
            private val realTimeDecisionId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the declined transaction created for this Card Decline. */
            fun declinedTransactionId(): String =
                declinedTransactionId.getRequired("declined_transaction_id")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): String? =
                digitalWalletTokenId.getNullable("digital_wallet_token_id")

            /** The Card Decline identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

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

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): String? =
                merchantPostalCode.getNullable("merchant_postal_code")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

            /** The declined amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(): ProcessingCategory =
                processingCategory.getRequired("processing_category")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /** Why the transaction was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the declined transaction created for this Card Decline. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId() = declinedTransactionId

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /** The Card Decline identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

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
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode() = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore() = networkRiskScore

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /** The declined amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory() = processingCategory

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /** Why the transaction was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDecline = apply {
                if (!validated) {
                    actioner()
                    amount()
                    cardPaymentId()
                    currency()
                    declinedTransactionId()
                    digitalWalletTokenId()
                    id()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantDescriptor()
                    merchantPostalCode()
                    merchantState()
                    networkDetails().validate()
                    networkIdentifiers().validate()
                    networkRiskScore()
                    physicalCardId()
                    presentmentAmount()
                    presentmentCurrency()
                    processingCategory()
                    realTimeDecisionId()
                    reason()
                    verification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDecline &&
                    this.actioner == other.actioner &&
                    this.amount == other.amount &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.declinedTransactionId == other.declinedTransactionId &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.id == other.id &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantPostalCode == other.merchantPostalCode &&
                    this.merchantState == other.merchantState &&
                    this.networkDetails == other.networkDetails &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.networkRiskScore == other.networkRiskScore &&
                    this.physicalCardId == other.physicalCardId &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.processingCategory == other.processingCategory &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.reason == other.reason &&
                    this.verification == other.verification &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            actioner,
                            amount,
                            cardPaymentId,
                            currency,
                            declinedTransactionId,
                            digitalWalletTokenId,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantPostalCode,
                            merchantState,
                            networkDetails,
                            networkIdentifiers,
                            networkRiskScore,
                            physicalCardId,
                            presentmentAmount,
                            presentmentCurrency,
                            processingCategory,
                            realTimeDecisionId,
                            reason,
                            verification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDecline{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, declinedTransactionId=$declinedTransactionId, digitalWalletTokenId=$digitalWalletTokenId, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, reason=$reason, verification=$verification, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var actioner: JsonField<Actioner> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var declinedTransactionId: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantPostalCode: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var verification: JsonField<Verification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardDecline: CardDecline) = apply {
                    this.actioner = cardDecline.actioner
                    this.amount = cardDecline.amount
                    this.cardPaymentId = cardDecline.cardPaymentId
                    this.currency = cardDecline.currency
                    this.declinedTransactionId = cardDecline.declinedTransactionId
                    this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    this.id = cardDecline.id
                    this.merchantAcceptorId = cardDecline.merchantAcceptorId
                    this.merchantCategoryCode = cardDecline.merchantCategoryCode
                    this.merchantCity = cardDecline.merchantCity
                    this.merchantCountry = cardDecline.merchantCountry
                    this.merchantDescriptor = cardDecline.merchantDescriptor
                    this.merchantPostalCode = cardDecline.merchantPostalCode
                    this.merchantState = cardDecline.merchantState
                    this.networkDetails = cardDecline.networkDetails
                    this.networkIdentifiers = cardDecline.networkIdentifiers
                    this.networkRiskScore = cardDecline.networkRiskScore
                    this.physicalCardId = cardDecline.physicalCardId
                    this.presentmentAmount = cardDecline.presentmentAmount
                    this.presentmentCurrency = cardDecline.presentmentCurrency
                    this.processingCategory = cardDecline.processingCategory
                    this.realTimeDecisionId = cardDecline.realTimeDecisionId
                    this.reason = cardDecline.reason
                    this.verification = cardDecline.verification
                    additionalProperties(cardDecline.additionalProperties)
                }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner")
                @ExcludeMissing
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the declined transaction created for this Card Decline. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /** The identifier of the declined transaction created for this Card Decline. */
                @JsonProperty("declined_transaction_id")
                @ExcludeMissing
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
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

                /** The Card Decline identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Decline identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String) =
                    merchantPostalCode(JsonField.of(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
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

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(JsonField.of(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String) =
                    physicalCardId(JsonField.of(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /**
                 * The declined amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /**
                 * The declined amount in the minor unit of the transaction's presentment currency.
                 */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
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

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /** Why the transaction was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transaction was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification")
                @ExcludeMissing
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
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

                fun build(): CardDecline =
                    CardDecline(
                        actioner,
                        amount,
                        cardPaymentId,
                        currency,
                        declinedTransactionId,
                        digitalWalletTokenId,
                        id,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantDescriptor,
                        merchantPostalCode,
                        merchantState,
                        networkDetails,
                        networkIdentifiers,
                        networkRiskScore,
                        physicalCardId,
                        presentmentAmount,
                        presentmentCurrency,
                        processingCategory,
                        realTimeDecisionId,
                        reason,
                        verification,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Actioner && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USER = Actioner(JsonField.of("user"))

                    val INCREASE = Actioner(JsonField.of("increase"))

                    val NETWORK = Actioner(JsonField.of("network"))

                    fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            additionalProperties(visa.additionalProperties)
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator
                        ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
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
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    ) : Enum {

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

                            val INSTALLMENT =
                                ElectronicCommerceIndicator(JsonField.of("installment"))

                            val UNKNOWN_MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(
                                    JsonField.of("unknown_mail_phone_order")
                                )

                            val SECURE_ELECTRONIC_COMMERCE =
                                ElectronicCommerceIndicator(
                                    JsonField.of("secure_electronic_commerce")
                                )

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
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                    ) : Enum {

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
                                PointOfServiceEntryMode(
                                    JsonField.of("integrated_circuit_card_no_cvv")
                                )

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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ProcessingCategory
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                        else ->
                            throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_NOT_ACTIVE = Reason(JsonField.of("card_not_active"))

                    val PHYSICAL_CARD_NOT_ACTIVE = Reason(JsonField.of("physical_card_not_active"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                    val CARD_EXPIRATION_MISMATCH = Reason(JsonField.of("card_expiration_mismatch"))

                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    val WEBHOOK_DECLINED = Reason(JsonField.of("webhook_declined"))

                    val WEBHOOK_TIMED_OUT = Reason(JsonField.of("webhook_timed_out"))

                    val DECLINED_BY_STAND_IN_PROCESSING =
                        Reason(JsonField.of("declined_by_stand_in_processing"))

                    val INVALID_PHYSICAL_CARD = Reason(JsonField.of("invalid_physical_card"))

                    val MISSING_ORIGINAL_AUTHORIZATION =
                        Reason(JsonField.of("missing_original_authorization"))

                    val SUSPECTED_FRAUD = Reason(JsonField.of("suspected_fraud"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    CARD_EXPIRATION_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                }

                enum class Value {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    CARD_EXPIRATION_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Value.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Value.CVV2_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Value.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Value.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Value.MISSING_ORIGINAL_AUTHORIZATION
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Known.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Known.CVV2_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Known.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields related to verification of cardholder-provided values. */
            @JsonDeserialize(builder = Verification.Builder::class)
            @NoAutoDetect
            class Verification
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode() = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress() = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Verification = apply {
                    if (!validated) {
                        cardVerificationCode().validate()
                        cardholderAddress().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Verification &&
                        this.cardVerificationCode == other.cardVerificationCode &&
                        this.cardholderAddress == other.cardholderAddress &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                cardVerificationCode,
                                cardholderAddress,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var cardVerificationCode: JsonField<CardVerificationCode> =
                        JsonMissing.of()
                    private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(verification: Verification) = apply {
                        this.cardVerificationCode = verification.cardVerificationCode
                        this.cardholderAddress = verification.cardholderAddress
                        additionalProperties(verification.additionalProperties)
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                        cardVerificationCode(JsonField.of(cardVerificationCode))

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    fun cardVerificationCode(
                        cardVerificationCode: JsonField<CardVerificationCode>
                    ) = apply { this.cardVerificationCode = cardVerificationCode }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: CardholderAddress) =
                        cardholderAddress(JsonField.of(cardholderAddress))

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
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
                            cardVerificationCode,
                            cardholderAddress,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardVerificationCode =
                            CardVerificationCode(result, additionalProperties.toUnmodifiable())
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonDeserialize(builder = CardholderAddress.Builder::class)
                @NoAutoDetect
                class CardholderAddress
                private constructor(
                    private val actualLine1: JsonField<String>,
                    private val actualPostalCode: JsonField<String>,
                    private val providedLine1: JsonField<String>,
                    private val providedPostalCode: JsonField<String>,
                    private val result: JsonField<Result>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(): String? =
                        actualPostalCode.getNullable("actual_postal_code")

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(): String? =
                        providedPostalCode.getNullable("provided_postal_code")

                    /** The address verification result returned to the card network. */
                    fun result(): Result = result.getRequired("result")

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode() = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1() = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode() = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result") @ExcludeMissing fun _result() = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CardholderAddress = apply {
                        if (!validated) {
                            actualLine1()
                            actualPostalCode()
                            providedLine1()
                            providedPostalCode()
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
                            this.actualLine1 == other.actualLine1 &&
                            this.actualPostalCode == other.actualPostalCode &&
                            this.providedLine1 == other.providedLine1 &&
                            this.providedPostalCode == other.providedPostalCode &&
                            this.result == other.result &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    actualLine1,
                                    actualPostalCode,
                                    providedLine1,
                                    providedPostalCode,
                                    result,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var actualLine1: JsonField<String> = JsonMissing.of()
                        private var actualPostalCode: JsonField<String> = JsonMissing.of()
                        private var providedLine1: JsonField<String> = JsonMissing.of()
                        private var providedPostalCode: JsonField<String> = JsonMissing.of()
                        private var result: JsonField<Result> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            this.actualLine1 = cardholderAddress.actualLine1
                            this.actualPostalCode = cardholderAddress.actualPostalCode
                            this.providedLine1 = cardholderAddress.providedLine1
                            this.providedPostalCode = cardholderAddress.providedPostalCode
                            this.result = cardholderAddress.result
                            additionalProperties(cardholderAddress.additionalProperties)
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String) =
                            actualLine1(JsonField.of(actualLine1))

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
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

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String) =
                            providedLine1(JsonField.of(providedLine1))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String) =
                            providedPostalCode(JsonField.of(providedPostalCode))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                actualLine1,
                                actualPostalCode,
                                providedLine1,
                                providedPostalCode,
                                result,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

        /**
         * A Card Fuel Confirmation object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_fuel_confirmation`.
         */
        @JsonDeserialize(builder = CardFuelConfirmation.Builder::class)
        @NoAutoDetect
        class CardFuelConfirmation
        private constructor(
            private val cardAuthorizationId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val network: JsonField<Network>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val pendingTransactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val updatedAuthorizationAmount: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier for the Card Authorization this updates. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Fuel Confirmation identifier. */
            fun id(): String = id.getRequired("id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The identifier of the Pending Transaction associated with this Card Fuel
             * Confirmation.
             */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_fuel_confirmation`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The updated authorization amount after this fuel confirmation, in the minor unit of
             * the transaction's currency. For dollars, for example, this is cents.
             */
            fun updatedAuthorizationAmount(): Long =
                updatedAuthorizationAmount.getRequired("updated_authorization_amount")

            /** The identifier for the Card Authorization this updates. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Fuel Confirmation identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The identifier of the Pending Transaction associated with this Card Fuel
             * Confirmation.
             */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_fuel_confirmation`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * The updated authorization amount after this fuel confirmation, in the minor unit of
             * the transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("updated_authorization_amount")
            @ExcludeMissing
            fun _updatedAuthorizationAmount() = updatedAuthorizationAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardFuelConfirmation = apply {
                if (!validated) {
                    cardAuthorizationId()
                    currency()
                    id()
                    network()
                    networkIdentifiers().validate()
                    pendingTransactionId()
                    type()
                    updatedAuthorizationAmount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardFuelConfirmation &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.network == other.network &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.type == other.type &&
                    this.updatedAuthorizationAmount == other.updatedAuthorizationAmount &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            cardAuthorizationId,
                            currency,
                            id,
                            network,
                            networkIdentifiers,
                            pendingTransactionId,
                            type,
                            updatedAuthorizationAmount,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardFuelConfirmation{cardAuthorizationId=$cardAuthorizationId, currency=$currency, id=$id, network=$network, networkIdentifiers=$networkIdentifiers, pendingTransactionId=$pendingTransactionId, type=$type, updatedAuthorizationAmount=$updatedAuthorizationAmount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var updatedAuthorizationAmount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardFuelConfirmation: CardFuelConfirmation) = apply {
                    this.cardAuthorizationId = cardFuelConfirmation.cardAuthorizationId
                    this.currency = cardFuelConfirmation.currency
                    this.id = cardFuelConfirmation.id
                    this.network = cardFuelConfirmation.network
                    this.networkIdentifiers = cardFuelConfirmation.networkIdentifiers
                    this.pendingTransactionId = cardFuelConfirmation.pendingTransactionId
                    this.type = cardFuelConfirmation.type
                    this.updatedAuthorizationAmount =
                        cardFuelConfirmation.updatedAuthorizationAmount
                    additionalProperties(cardFuelConfirmation.additionalProperties)
                }

                /** The identifier for the Card Authorization this updates. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this updates. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Fuel Confirmation identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Fuel Confirmation identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The identifier of the Pending Transaction associated with this Card Fuel
                 * Confirmation.
                 */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /**
                 * The identifier of the Pending Transaction associated with this Card Fuel
                 * Confirmation.
                 */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_fuel_confirmation`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_fuel_confirmation`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The updated authorization amount after this fuel confirmation, in the minor unit
                 * of the transaction's currency. For dollars, for example, this is cents.
                 */
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: Long) =
                    updatedAuthorizationAmount(JsonField.of(updatedAuthorizationAmount))

                /**
                 * The updated authorization amount after this fuel confirmation, in the minor unit
                 * of the transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("updated_authorization_amount")
                @ExcludeMissing
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: JsonField<Long>) =
                    apply {
                        this.updatedAuthorizationAmount = updatedAuthorizationAmount
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

                fun build(): CardFuelConfirmation =
                    CardFuelConfirmation(
                        cardAuthorizationId,
                        currency,
                        id,
                        network,
                        networkIdentifiers,
                        pendingTransactionId,
                        type,
                        updatedAuthorizationAmount,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Network
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Network && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VISA = Network(JsonField.of("visa"))

                    fun of(value: String) = Network(JsonField.of(value))
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
                        else -> throw IncreaseInvalidDataException("Unknown Network: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_FUEL_CONFIRMATION = Type(JsonField.of("card_fuel_confirmation"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_FUEL_CONFIRMATION,
                }

                enum class Value {
                    CARD_FUEL_CONFIRMATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_FUEL_CONFIRMATION -> Value.CARD_FUEL_CONFIRMATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_FUEL_CONFIRMATION -> Known.CARD_FUEL_CONFIRMATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        @JsonDeserialize(builder = CardIncrement.Builder::class)
        @NoAutoDetect
        class CardIncrement
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardAuthorizationId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val network: JsonField<Network>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val networkRiskScore: JsonField<Long>,
            private val pendingTransactionId: JsonField<String>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val updatedAuthorizationAmount: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The amount of this increment in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier for the Card Authorization this increments. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Increment identifier. */
            fun id(): String = id.getRequired("id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

            /** The identifier of the Pending Transaction associated with this Card Increment. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this incremental
             * authorization.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_increment`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The updated authorization amount after this increment, in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun updatedAuthorizationAmount(): Long =
                updatedAuthorizationAmount.getRequired("updated_authorization_amount")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /**
             * The amount of this increment in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The identifier for the Card Authorization this increments. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Increment identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore() = networkRiskScore

            /** The identifier of the Pending Transaction associated with this Card Increment. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this incremental
             * authorization.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_increment`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * The updated authorization amount after this increment, in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("updated_authorization_amount")
            @ExcludeMissing
            fun _updatedAuthorizationAmount() = updatedAuthorizationAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardIncrement = apply {
                if (!validated) {
                    actioner()
                    amount()
                    cardAuthorizationId()
                    currency()
                    id()
                    network()
                    networkIdentifiers().validate()
                    networkRiskScore()
                    pendingTransactionId()
                    realTimeDecisionId()
                    type()
                    updatedAuthorizationAmount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardIncrement &&
                    this.actioner == other.actioner &&
                    this.amount == other.amount &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.network == other.network &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.networkRiskScore == other.networkRiskScore &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.type == other.type &&
                    this.updatedAuthorizationAmount == other.updatedAuthorizationAmount &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            actioner,
                            amount,
                            cardAuthorizationId,
                            currency,
                            id,
                            network,
                            networkIdentifiers,
                            networkRiskScore,
                            pendingTransactionId,
                            realTimeDecisionId,
                            type,
                            updatedAuthorizationAmount,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardIncrement{actioner=$actioner, amount=$amount, cardAuthorizationId=$cardAuthorizationId, currency=$currency, id=$id, network=$network, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, realTimeDecisionId=$realTimeDecisionId, type=$type, updatedAuthorizationAmount=$updatedAuthorizationAmount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var actioner: JsonField<Actioner> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var updatedAuthorizationAmount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardIncrement: CardIncrement) = apply {
                    this.actioner = cardIncrement.actioner
                    this.amount = cardIncrement.amount
                    this.cardAuthorizationId = cardIncrement.cardAuthorizationId
                    this.currency = cardIncrement.currency
                    this.id = cardIncrement.id
                    this.network = cardIncrement.network
                    this.networkIdentifiers = cardIncrement.networkIdentifiers
                    this.networkRiskScore = cardIncrement.networkRiskScore
                    this.pendingTransactionId = cardIncrement.pendingTransactionId
                    this.realTimeDecisionId = cardIncrement.realTimeDecisionId
                    this.type = cardIncrement.type
                    this.updatedAuthorizationAmount = cardIncrement.updatedAuthorizationAmount
                    additionalProperties(cardIncrement.additionalProperties)
                }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner")
                @ExcludeMissing
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The amount of this increment in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount of this increment in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier for the Card Authorization this increments. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this increments. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Increment identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Increment identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(JsonField.of(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /**
                 * The identifier of the Pending Transaction associated with this Card Increment.
                 */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /**
                 * The identifier of the Pending Transaction associated with this Card Increment.
                 */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * incremental authorization.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * incremental authorization.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_increment`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_increment`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The updated authorization amount after this increment, in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: Long) =
                    updatedAuthorizationAmount(JsonField.of(updatedAuthorizationAmount))

                /**
                 * The updated authorization amount after this increment, in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("updated_authorization_amount")
                @ExcludeMissing
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: JsonField<Long>) =
                    apply {
                        this.updatedAuthorizationAmount = updatedAuthorizationAmount
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

                fun build(): CardIncrement =
                    CardIncrement(
                        actioner,
                        amount,
                        cardAuthorizationId,
                        currency,
                        id,
                        network,
                        networkIdentifiers,
                        networkRiskScore,
                        pendingTransactionId,
                        realTimeDecisionId,
                        type,
                        updatedAuthorizationAmount,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Actioner && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USER = Actioner(JsonField.of("user"))

                    val INCREASE = Actioner(JsonField.of("increase"))

                    val NETWORK = Actioner(JsonField.of("network"))

                    fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Network
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Network && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VISA = Network(JsonField.of("visa"))

                    fun of(value: String) = Network(JsonField.of(value))
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
                        else -> throw IncreaseInvalidDataException("Unknown Network: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_INCREMENT = Type(JsonField.of("card_increment"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_INCREMENT,
                }

                enum class Value {
                    CARD_INCREMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_INCREMENT -> Value.CARD_INCREMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_INCREMENT -> Known.CARD_INCREMENT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonDeserialize(builder = CardRefund.Builder::class)
        @NoAutoDetect
        class CardRefund
        private constructor(
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val interchange: JsonField<Interchange>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Refund identifier. */
            fun id(): String = id.getRequired("id")

            /** Interchange assessed as a part of this transaciton. */
            fun interchange(): Interchange? = interchange.getNullable("interchange")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String? =
                merchantAcceptorId.getNullable("merchant_acceptor_id")

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): String? = merchantName.getNullable("merchant_name")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Network-specific identifiers for this refund. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /** The amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): PurchaseDetails? =
                purchaseDetails.getNullable("purchase_details")

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Refund identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** Interchange assessed as a part of this transaciton. */
            @JsonProperty("interchange") @ExcludeMissing fun _interchange() = interchange

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Network-specific identifiers for this refund. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /** The amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardRefund = apply {
                if (!validated) {
                    amount()
                    cardPaymentId()
                    currency()
                    id()
                    interchange()?.validate()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantName()
                    merchantState()
                    networkIdentifiers().validate()
                    presentmentAmount()
                    presentmentCurrency()
                    purchaseDetails()?.validate()
                    transactionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardRefund &&
                    this.amount == other.amount &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.interchange == other.interchange &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantState == other.merchantState &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            cardPaymentId,
                            currency,
                            id,
                            interchange,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantName,
                            merchantState,
                            networkIdentifiers,
                            presentmentAmount,
                            presentmentCurrency,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRefund{amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, id=$id, interchange=$interchange, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantState=$merchantState, networkIdentifiers=$networkIdentifiers, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var interchange: JsonField<Interchange> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardRefund: CardRefund) = apply {
                    this.amount = cardRefund.amount
                    this.cardPaymentId = cardRefund.cardPaymentId
                    this.currency = cardRefund.currency
                    this.id = cardRefund.id
                    this.interchange = cardRefund.interchange
                    this.merchantAcceptorId = cardRefund.merchantAcceptorId
                    this.merchantCategoryCode = cardRefund.merchantCategoryCode
                    this.merchantCity = cardRefund.merchantCity
                    this.merchantCountry = cardRefund.merchantCountry
                    this.merchantName = cardRefund.merchantName
                    this.merchantState = cardRefund.merchantState
                    this.networkIdentifiers = cardRefund.networkIdentifiers
                    this.presentmentAmount = cardRefund.presentmentAmount
                    this.presentmentCurrency = cardRefund.presentmentCurrency
                    this.purchaseDetails = cardRefund.purchaseDetails
                    this.transactionId = cardRefund.transactionId
                    this.type = cardRefund.type
                    additionalProperties(cardRefund.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Refund identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Refund identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Interchange assessed as a part of this transaciton. */
                fun interchange(interchange: Interchange) = interchange(JsonField.of(interchange))

                /** Interchange assessed as a part of this transaciton. */
                @JsonProperty("interchange")
                @ExcludeMissing
                fun interchange(interchange: JsonField<Interchange>) = apply {
                    this.interchange = interchange
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

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
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

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Network-specific identifiers for this refund. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for this refund. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /** The amount in the minor unit of the transaction's presentment currency. */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
                }

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardRefund =
                    CardRefund(
                        amount,
                        cardPaymentId,
                        currency,
                        id,
                        interchange,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantName,
                        merchantState,
                        networkIdentifiers,
                        presentmentAmount,
                        presentmentCurrency,
                        purchaseDetails,
                        transactionId,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Interchange assessed as a part of this transaciton. */
            @JsonDeserialize(builder = Interchange.Builder::class)
            @NoAutoDetect
            class Interchange
            private constructor(
                private val amount: JsonField<String>,
                private val code: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                fun amount(): String = amount.getRequired("amount")

                /** The card network specific interchange code. */
                fun code(): String? = code.getNullable("code")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The card network specific interchange code. */
                @JsonProperty("code") @ExcludeMissing fun _code() = code

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Interchange = apply {
                    if (!validated) {
                        amount()
                        code()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Interchange &&
                        this.amount == other.amount &&
                        this.code == other.code &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                code,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Interchange{amount=$amount, code=$code, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var code: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(interchange: Interchange) = apply {
                        this.amount = interchange.amount
                        this.code = interchange.code
                        this.currency = interchange.currency
                        additionalProperties(interchange.additionalProperties)
                    }

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The card network specific interchange code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /** The card network specific interchange code. */
                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Interchange =
                        Interchange(
                            amount,
                            code,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Currency && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val CAD = Currency(JsonField.of("CAD"))

                        val CHF = Currency(JsonField.of("CHF"))

                        val EUR = Currency(JsonField.of("EUR"))

                        val GBP = Currency(JsonField.of("GBP"))

                        val JPY = Currency(JsonField.of("JPY"))

                        val USD = Currency(JsonField.of("USD"))

                        fun of(value: String) = Currency(JsonField.of(value))
                    }

                    enum class Known {
                        CAD,
                        CHF,
                        EUR,
                        GBP,
                        JPY,
                        USD,
                    }

                    enum class Value {
                        CAD,
                        CHF,
                        EUR,
                        GBP,
                        JPY,
                        USD,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CAD -> Value.CAD
                            CHF -> Value.CHF
                            EUR -> Value.EUR
                            GBP -> Value.GBP
                            JPY -> Value.JPY
                            USD -> Value.USD
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CAD -> Known.CAD
                            CHF -> Known.CHF
                            EUR -> Known.EUR
                            GBP -> Known.GBP
                            JPY -> Known.JPY
                            USD -> Known.USD
                            else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /** Network-specific identifiers for this refund. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val acquirerBusinessId: JsonField<String>,
                private val acquirerReferenceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                fun acquirerBusinessId(): String =
                    acquirerBusinessId.getRequired("acquirer_business_id")

                /** A globally unique identifier for this settlement. */
                fun acquirerReferenceNumber(): String =
                    acquirerReferenceNumber.getRequired("acquirer_reference_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                @JsonProperty("acquirer_business_id")
                @ExcludeMissing
                fun _acquirerBusinessId() = acquirerBusinessId

                /** A globally unique identifier for this settlement. */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber() = acquirerReferenceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        acquirerBusinessId()
                        acquirerReferenceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.acquirerBusinessId == other.acquirerBusinessId &&
                        this.acquirerReferenceNumber == other.acquirerReferenceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                acquirerBusinessId,
                                acquirerReferenceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{acquirerBusinessId=$acquirerBusinessId, acquirerReferenceNumber=$acquirerReferenceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var acquirerBusinessId: JsonField<String> = JsonMissing.of()
                    private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.acquirerBusinessId = networkIdentifiers.acquirerBusinessId
                        this.acquirerReferenceNumber = networkIdentifiers.acquirerReferenceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
                    }

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    fun acquirerBusinessId(acquirerBusinessId: String) =
                        acquirerBusinessId(JsonField.of(acquirerBusinessId))

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    @JsonProperty("acquirer_business_id")
                    @ExcludeMissing
                    fun acquirerBusinessId(acquirerBusinessId: JsonField<String>) = apply {
                        this.acquirerBusinessId = acquirerBusinessId
                    }

                    /** A globally unique identifier for this settlement. */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
                        acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

                    /** A globally unique identifier for this settlement. */
                    @JsonProperty("acquirer_reference_number")
                    @ExcludeMissing
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
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
                            acquirerBusinessId,
                            acquirerReferenceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val carRental: JsonField<CarRental>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val lodging: JsonField<Lodging>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Fields specific to car rentals. */
                fun carRental(): CarRental? = carRental.getNullable("car_rental")

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): String? =
                    customerReferenceIdentifier.getNullable("customer_reference_identifier")

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Long? = localTaxAmount.getNullable("local_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): String? = localTaxCurrency.getNullable("local_tax_currency")

                /** Fields specific to lodging. */
                fun lodging(): Lodging? = lodging.getNullable("lodging")

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Long? =
                    nationalTaxAmount.getNullable("national_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): String? =
                    nationalTaxCurrency.getNullable("national_tax_currency")

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): String? =
                    purchaseIdentifier.getNullable("purchase_identifier")

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): PurchaseIdentifierFormat? =
                    purchaseIdentifierFormat.getNullable("purchase_identifier_format")

                /** Fields specific to travel. */
                fun travel(): Travel? = travel.getNullable("travel")

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        carRental()?.validate()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        lodging()?.validate()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        travel()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.carRental == other.carRental &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.lodging == other.lodging &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                carRental,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                lodging,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{carRental=$carRental, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, lodging=$lodging, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.carRental = purchaseDetails.carRental
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.lodging = purchaseDetails.lodging
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

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

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            carRental,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            lodging,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val carClassCode: JsonField<String>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val daysRented: JsonField<Long>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): String? = carClassCode.getNullable("car_class_code")

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): LocalDate? = checkoutDate.getNullable("checkout_date")

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Long? =
                        dailyRentalRateAmount.getNullable("daily_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): String? =
                        dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Long? = daysRented.getNullable("days_rented")

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Long? =
                        fuelChargesAmount.getNullable("fuel_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): String? =
                        fuelChargesCurrency.getNullable("fuel_charges_currency")

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Long? =
                        insuranceChargesAmount.getNullable("insurance_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): String? =
                        insuranceChargesCurrency.getNullable("insurance_charges_currency")

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Long? =
                        oneWayDropOffChargesAmount.getNullable("one_way_drop_off_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): String? =
                        oneWayDropOffChargesCurrency.getNullable(
                            "one_way_drop_off_charges_currency"
                        )

                    /** Name of the person renting the vehicle. */
                    fun renterName(): String? = renterName.getNullable("renter_name")

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Long? =
                        weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): String? =
                        weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            carClassCode()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            daysRented()
                            extraCharges()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            noShowIndicator()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            renterName()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.carClassCode == other.carClassCode &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.daysRented == other.daysRented &&
                            this.extraCharges == other.extraCharges &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.renterName == other.renterName &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    carClassCode,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    daysRented,
                                    extraCharges,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    noShowIndicator,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    renterName,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{carClassCode=$carClassCode, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, daysRented=$daysRented, extraCharges=$extraCharges, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, noShowIndicator=$noShowIndicator, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, renterName=$renterName, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(carRental: CarRental) = apply {
                            this.carClassCode = carRental.carClassCode
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.daysRented = carRental.daysRented
                            this.extraCharges = carRental.extraCharges
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.noShowIndicator = carRental.noShowIndicator
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.renterName = carRental.renterName
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CarRental =
                            CarRental(
                                carClassCode,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                daysRented,
                                extraCharges,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                noShowIndicator,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                renterName,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val GAS = ExtraCharges(JsonField.of("gas"))

                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Date the customer checked in. */
                    fun checkInDate(): LocalDate? = checkInDate.getNullable("check_in_date")

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Long? =
                        dailyRoomRateAmount.getNullable("daily_room_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): String? =
                        dailyRoomRateCurrency.getNullable("daily_room_rate_currency")

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Long? =
                        folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): String? =
                        folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Long? =
                        foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): String? =
                        foodBeverageChargesCurrency.getNullable("food_beverage_charges_currency")

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Long? =
                        prepaidExpensesAmount.getNullable("prepaid_expenses_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): String? =
                        prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")

                    /** Number of nights the room was rented. */
                    fun roomNights(): Long? = roomNights.getNullable("room_nights")

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Long? =
                        totalRoomTaxAmount.getNullable("total_room_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): String? =
                        totalRoomTaxCurrency.getNullable("total_room_tax_currency")

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Long? = totalTaxAmount.getNullable("total_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): String? =
                        totalTaxCurrency.getNullable("total_tax_currency")

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            extraCharges()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            noShowIndicator()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.extraCharges == other.extraCharges &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    extraCharges,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    noShowIndicator,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, extraCharges=$extraCharges, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, noShowIndicator=$noShowIndicator, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lodging: Lodging) = apply {
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.extraCharges = lodging.extraCharges
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.noShowIndicator = lodging.noShowIndicator
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Lodging =
                            Lodging(
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                extraCharges,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                noShowIndicator,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            val OTHER = ExtraCharges(JsonField.of("other"))

                            val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ancillary: JsonField<Ancillary>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val ticketNumber: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Ancillary? = ancillary.getNullable("ancillary")

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): String? =
                        computerizedReservationSystem.getNullable("computerized_reservation_system")

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): CreditReasonIndicator? =
                        creditReasonIndicator.getNullable("credit_reason_indicator")

                    /** Date of departure. */
                    fun departureDate(): LocalDate? = departureDate.getNullable("departure_date")

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): String? =
                        originationCityAirportCode.getNullable("origination_city_airport_code")

                    /** Name of the passenger. */
                    fun passengerName(): String? = passengerName.getNullable("passenger_name")

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): RestrictedTicketIndicator? =
                        restrictedTicketIndicator.getNullable("restricted_ticket_indicator")

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): TicketChangeIndicator? =
                        ticketChangeIndicator.getNullable("ticket_change_indicator")

                    /** Ticket number. */
                    fun ticketNumber(): String? = ticketNumber.getNullable("ticket_number")

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): String? =
                        travelAgencyCode.getNullable("travel_agency_code")

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): String? =
                        travelAgencyName.getNullable("travel_agency_name")

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): List<TripLeg>? = tripLegs.getNullable("trip_legs")

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ancillary()?.validate()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            departureDate()
                            originationCityAirportCode()
                            passengerName()
                            restrictedTicketIndicator()
                            ticketChangeIndicator()
                            ticketNumber()
                            travelAgencyCode()
                            travelAgencyName()
                            tripLegs()?.forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ancillary == other.ancillary &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.passengerName == other.passengerName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.ticketNumber == other.ticketNumber &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.tripLegs == other.tripLegs &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ancillary,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    departureDate,
                                    originationCityAirportCode,
                                    passengerName,
                                    restrictedTicketIndicator,
                                    ticketChangeIndicator,
                                    ticketNumber,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    tripLegs,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ancillary=$ancillary, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, passengerName=$passengerName, restrictedTicketIndicator=$restrictedTicketIndicator, ticketChangeIndicator=$ticketChangeIndicator, ticketNumber=$ticketNumber, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, tripLegs=$tripLegs, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(travel: Travel) = apply {
                            this.ancillary = travel.ancillary
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.passengerName = travel.passengerName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.ticketNumber = travel.ticketNumber
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.tripLegs = travel.tripLegs
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Travel =
                            Travel(
                                ancillary,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                departureDate,
                                originationCityAirportCode,
                                passengerName,
                                restrictedTicketIndicator,
                                ticketChangeIndicator,
                                ticketNumber,
                                travelAgencyCode,
                                travelAgencyName,
                                tripLegs.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val services: JsonField<List<Service>>,
                        private val ticketDocumentNumber: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): String? =
                            connectedTicketDocumentNumber.getNullable(
                                "connected_ticket_document_number"
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): CreditReasonIndicator? =
                            creditReasonIndicator.getNullable("credit_reason_indicator")

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): String? =
                            passengerNameOrDescription.getNullable("passenger_name_or_description")

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): String? =
                            ticketDocumentNumber.getNullable("ticket_document_number")

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                passengerNameOrDescription()
                                services().forEach { it.validate() }
                                ticketDocumentNumber()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.services == other.services &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        passengerNameOrDescription,
                                        services,
                                        ticketDocumentNumber,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, passengerNameOrDescription=$passengerNameOrDescription, services=$services, ticketDocumentNumber=$ticketDocumentNumber, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(ancillary: Ancillary) = apply {
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.services = ancillary.services
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Ancillary =
                                Ancillary(
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    passengerNameOrDescription,
                                    services.map { it.toUnmodifiable() },
                                    ticketDocumentNumber,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Category? = category.getNullable("category")

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): String? = subCategory.getNullable("sub_category")

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            class Category
                            @JsonCreator
                            private constructor(
                                private val value: JsonField<String>,
                            ) : Enum {

                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    val NONE = Category(JsonField.of("none"))

                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    val CARGO = Category(JsonField.of("cargo"))

                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    val LOUNGE = Category(JsonField.of("lounge"))

                                    val MEDICAL = Category(JsonField.of("medical"))

                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    val OTHER = Category(JsonField.of("other"))

                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    val PETS = Category(JsonField.of("pets"))

                                    val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    val STANDBY = Category(JsonField.of("standby"))

                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    val STORE = Category(JsonField.of("store"))

                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    val UPGRADES = Category(JsonField.of("upgrades"))

                                    val WIFI = Category(JsonField.of("wifi"))

                                    fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NONE = TicketChangeIndicator(JsonField.of("none"))

                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val carrierCode: JsonField<String>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val flightNumber: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): String? = carrierCode.getNullable("carrier_code")

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): String? =
                            destinationCityAirportCode.getNullable("destination_city_airport_code")

                        /** Fare basis code. */
                        fun fareBasisCode(): String? = fareBasisCode.getNullable("fare_basis_code")

                        /** Flight number. */
                        fun flightNumber(): String? = flightNumber.getNullable("flight_number")

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): String? = serviceClass.getNullable("service_class")

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): StopOverCode? =
                            stopOverCode.getNullable("stop_over_code")

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                carrierCode()
                                destinationCityAirportCode()
                                fareBasisCode()
                                flightNumber()
                                serviceClass()
                                stopOverCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.carrierCode == other.carrierCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.flightNumber == other.flightNumber &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        carrierCode,
                                        destinationCityAirportCode,
                                        fareBasisCode,
                                        flightNumber,
                                        serviceClass,
                                        stopOverCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{carrierCode=$carrierCode, destinationCityAirportCode=$destinationCityAirportCode, fareBasisCode=$fareBasisCode, flightNumber=$flightNumber, serviceClass=$serviceClass, stopOverCode=$stopOverCode, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tripLeg: TripLeg) = apply {
                                this.carrierCode = tripLeg.carrierCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.flightNumber = tripLeg.flightNumber
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): TripLeg =
                                TripLeg(
                                    carrierCode,
                                    destinationCityAirportCode,
                                    fareBasisCode,
                                    flightNumber,
                                    serviceClass,
                                    stopOverCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NONE = StopOverCode(JsonField.of("none"))

                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_REFUND = Type(JsonField.of("card_refund"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_REFUND,
                }

                enum class Value {
                    CARD_REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_REFUND -> Value.CARD_REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_REFUND -> Known.CARD_REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        @JsonDeserialize(builder = CardReversal.Builder::class)
        @NoAutoDetect
        class CardReversal
        private constructor(
            private val cardAuthorizationId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantPostalCode: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val network: JsonField<Network>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val pendingTransactionId: JsonField<String>,
            private val reversalAmount: JsonField<Long>,
            private val reversalReason: JsonField<ReversalReason>,
            private val type: JsonField<Type>,
            private val updatedAuthorizationAmount: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier for the Card Authorization this reverses. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Reversal identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(): String? =
                merchantCategoryCode.getNullable("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): String? =
                merchantPostalCode.getNullable("merchant_postal_code")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /** The identifier of the Pending Transaction associated with this Card Reversal. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * The amount of this reversal in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun reversalAmount(): Long = reversalAmount.getRequired("reversal_amount")

            /** Why this reversal was initiated. */
            fun reversalReason(): ReversalReason? = reversalReason.getNullable("reversal_reason")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_reversal`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The amount left pending on the Card Authorization in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun updatedAuthorizationAmount(): Long =
                updatedAuthorizationAmount.getRequired("updated_authorization_amount")

            /** The identifier for the Card Authorization this reverses. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Reversal identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

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
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode() = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /** The identifier of the Pending Transaction associated with this Card Reversal. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * The amount of this reversal in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("reversal_amount") @ExcludeMissing fun _reversalAmount() = reversalAmount

            /** Why this reversal was initiated. */
            @JsonProperty("reversal_reason") @ExcludeMissing fun _reversalReason() = reversalReason

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_reversal`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * The amount left pending on the Card Authorization in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("updated_authorization_amount")
            @ExcludeMissing
            fun _updatedAuthorizationAmount() = updatedAuthorizationAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardReversal = apply {
                if (!validated) {
                    cardAuthorizationId()
                    currency()
                    id()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantDescriptor()
                    merchantPostalCode()
                    merchantState()
                    network()
                    networkIdentifiers().validate()
                    pendingTransactionId()
                    reversalAmount()
                    reversalReason()
                    type()
                    updatedAuthorizationAmount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardReversal &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantPostalCode == other.merchantPostalCode &&
                    this.merchantState == other.merchantState &&
                    this.network == other.network &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.reversalAmount == other.reversalAmount &&
                    this.reversalReason == other.reversalReason &&
                    this.type == other.type &&
                    this.updatedAuthorizationAmount == other.updatedAuthorizationAmount &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            cardAuthorizationId,
                            currency,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantPostalCode,
                            merchantState,
                            network,
                            networkIdentifiers,
                            pendingTransactionId,
                            reversalAmount,
                            reversalReason,
                            type,
                            updatedAuthorizationAmount,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardReversal{cardAuthorizationId=$cardAuthorizationId, currency=$currency, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, network=$network, networkIdentifiers=$networkIdentifiers, pendingTransactionId=$pendingTransactionId, reversalAmount=$reversalAmount, reversalReason=$reversalReason, type=$type, updatedAuthorizationAmount=$updatedAuthorizationAmount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantPostalCode: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var reversalAmount: JsonField<Long> = JsonMissing.of()
                private var reversalReason: JsonField<ReversalReason> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var updatedAuthorizationAmount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardReversal: CardReversal) = apply {
                    this.cardAuthorizationId = cardReversal.cardAuthorizationId
                    this.currency = cardReversal.currency
                    this.id = cardReversal.id
                    this.merchantAcceptorId = cardReversal.merchantAcceptorId
                    this.merchantCategoryCode = cardReversal.merchantCategoryCode
                    this.merchantCity = cardReversal.merchantCity
                    this.merchantCountry = cardReversal.merchantCountry
                    this.merchantDescriptor = cardReversal.merchantDescriptor
                    this.merchantPostalCode = cardReversal.merchantPostalCode
                    this.merchantState = cardReversal.merchantState
                    this.network = cardReversal.network
                    this.networkIdentifiers = cardReversal.networkIdentifiers
                    this.pendingTransactionId = cardReversal.pendingTransactionId
                    this.reversalAmount = cardReversal.reversalAmount
                    this.reversalReason = cardReversal.reversalReason
                    this.type = cardReversal.type
                    this.updatedAuthorizationAmount = cardReversal.updatedAuthorizationAmount
                    additionalProperties(cardReversal.additionalProperties)
                }

                /** The identifier for the Card Authorization this reverses. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this reverses. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Reversal identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Reversal identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String) =
                    merchantPostalCode(JsonField.of(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /** The identifier of the Pending Transaction associated with this Card Reversal. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Card Reversal. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * The amount of this reversal in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun reversalAmount(reversalAmount: Long) =
                    reversalAmount(JsonField.of(reversalAmount))

                /**
                 * The amount of this reversal in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("reversal_amount")
                @ExcludeMissing
                fun reversalAmount(reversalAmount: JsonField<Long>) = apply {
                    this.reversalAmount = reversalAmount
                }

                /** Why this reversal was initiated. */
                fun reversalReason(reversalReason: ReversalReason) =
                    reversalReason(JsonField.of(reversalReason))

                /** Why this reversal was initiated. */
                @JsonProperty("reversal_reason")
                @ExcludeMissing
                fun reversalReason(reversalReason: JsonField<ReversalReason>) = apply {
                    this.reversalReason = reversalReason
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_reversal`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_reversal`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The amount left pending on the Card Authorization in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: Long) =
                    updatedAuthorizationAmount(JsonField.of(updatedAuthorizationAmount))

                /**
                 * The amount left pending on the Card Authorization in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("updated_authorization_amount")
                @ExcludeMissing
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: JsonField<Long>) =
                    apply {
                        this.updatedAuthorizationAmount = updatedAuthorizationAmount
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

                fun build(): CardReversal =
                    CardReversal(
                        cardAuthorizationId,
                        currency,
                        id,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantDescriptor,
                        merchantPostalCode,
                        merchantState,
                        network,
                        networkIdentifiers,
                        pendingTransactionId,
                        reversalAmount,
                        reversalReason,
                        type,
                        updatedAuthorizationAmount,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Network
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Network && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VISA = Network(JsonField.of("visa"))

                    fun of(value: String) = Network(JsonField.of(value))
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
                        else -> throw IncreaseInvalidDataException("Unknown Network: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ReversalReason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReversalReason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val REVERSED_BY_CUSTOMER = ReversalReason(JsonField.of("reversed_by_customer"))

                    val REVERSED_BY_NETWORK_OR_ACQUIRER =
                        ReversalReason(JsonField.of("reversed_by_network_or_acquirer"))

                    val REVERSED_BY_POINT_OF_SALE =
                        ReversalReason(JsonField.of("reversed_by_point_of_sale"))

                    val PARTIAL_REVERSAL = ReversalReason(JsonField.of("partial_reversal"))

                    fun of(value: String) = ReversalReason(JsonField.of(value))
                }

                enum class Known {
                    REVERSED_BY_CUSTOMER,
                    REVERSED_BY_NETWORK_OR_ACQUIRER,
                    REVERSED_BY_POINT_OF_SALE,
                    PARTIAL_REVERSAL,
                }

                enum class Value {
                    REVERSED_BY_CUSTOMER,
                    REVERSED_BY_NETWORK_OR_ACQUIRER,
                    REVERSED_BY_POINT_OF_SALE,
                    PARTIAL_REVERSAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        REVERSED_BY_CUSTOMER -> Value.REVERSED_BY_CUSTOMER
                        REVERSED_BY_NETWORK_OR_ACQUIRER -> Value.REVERSED_BY_NETWORK_OR_ACQUIRER
                        REVERSED_BY_POINT_OF_SALE -> Value.REVERSED_BY_POINT_OF_SALE
                        PARTIAL_REVERSAL -> Value.PARTIAL_REVERSAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        REVERSED_BY_CUSTOMER -> Known.REVERSED_BY_CUSTOMER
                        REVERSED_BY_NETWORK_OR_ACQUIRER -> Known.REVERSED_BY_NETWORK_OR_ACQUIRER
                        REVERSED_BY_POINT_OF_SALE -> Known.REVERSED_BY_POINT_OF_SALE
                        PARTIAL_REVERSAL -> Known.PARTIAL_REVERSAL
                        else -> throw IncreaseInvalidDataException("Unknown ReversalReason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_REVERSAL = Type(JsonField.of("card_reversal"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_REVERSAL,
                }

                enum class Value {
                    CARD_REVERSAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_REVERSAL -> Value.CARD_REVERSAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_REVERSAL -> Known.CARD_REVERSAL
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonDeserialize(builder = CardSettlement.Builder::class)
        @NoAutoDetect
        class CardSettlement
        private constructor(
            private val amount: JsonField<Long>,
            private val cardAuthorization: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val interchange: JsonField<Interchange>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val pendingTransactionId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            fun cardAuthorization(): String? = cardAuthorization.getNullable("card_authorization")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Settlement identifier. */
            fun id(): String = id.getRequired("id")

            /** Interchange assessed as a part of this transaciton. */
            fun interchange(): Interchange? = interchange.getNullable("interchange")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String? =
                merchantAcceptorId.getNullable("merchant_acceptor_id")

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): String? = merchantName.getNullable("merchant_name")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Network-specific identifiers for this refund. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /** The amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): PurchaseDetails? =
                purchaseDetails.getNullable("purchase_details")

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Settlement identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** Interchange assessed as a part of this transaciton. */
            @JsonProperty("interchange") @ExcludeMissing fun _interchange() = interchange

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Network-specific identifiers for this refund. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /** The amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardSettlement = apply {
                if (!validated) {
                    amount()
                    cardAuthorization()
                    cardPaymentId()
                    currency()
                    id()
                    interchange()?.validate()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantName()
                    merchantState()
                    networkIdentifiers().validate()
                    pendingTransactionId()
                    presentmentAmount()
                    presentmentCurrency()
                    purchaseDetails()?.validate()
                    transactionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardSettlement &&
                    this.amount == other.amount &&
                    this.cardAuthorization == other.cardAuthorization &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.interchange == other.interchange &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantState == other.merchantState &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            cardAuthorization,
                            cardPaymentId,
                            currency,
                            id,
                            interchange,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantName,
                            merchantState,
                            networkIdentifiers,
                            pendingTransactionId,
                            presentmentAmount,
                            presentmentCurrency,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardSettlement{amount=$amount, cardAuthorization=$cardAuthorization, cardPaymentId=$cardPaymentId, currency=$currency, id=$id, interchange=$interchange, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantState=$merchantState, networkIdentifiers=$networkIdentifiers, pendingTransactionId=$pendingTransactionId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardAuthorization: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var interchange: JsonField<Interchange> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardSettlement: CardSettlement) = apply {
                    this.amount = cardSettlement.amount
                    this.cardAuthorization = cardSettlement.cardAuthorization
                    this.cardPaymentId = cardSettlement.cardPaymentId
                    this.currency = cardSettlement.currency
                    this.id = cardSettlement.id
                    this.interchange = cardSettlement.interchange
                    this.merchantAcceptorId = cardSettlement.merchantAcceptorId
                    this.merchantCategoryCode = cardSettlement.merchantCategoryCode
                    this.merchantCity = cardSettlement.merchantCity
                    this.merchantCountry = cardSettlement.merchantCountry
                    this.merchantName = cardSettlement.merchantName
                    this.merchantState = cardSettlement.merchantState
                    this.networkIdentifiers = cardSettlement.networkIdentifiers
                    this.pendingTransactionId = cardSettlement.pendingTransactionId
                    this.presentmentAmount = cardSettlement.presentmentAmount
                    this.presentmentCurrency = cardSettlement.presentmentCurrency
                    this.purchaseDetails = cardSettlement.purchaseDetails
                    this.transactionId = cardSettlement.transactionId
                    this.type = cardSettlement.type
                    additionalProperties(cardSettlement.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if one
                 * exists.
                 */
                fun cardAuthorization(cardAuthorization: String) =
                    cardAuthorization(JsonField.of(cardAuthorization))

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if one
                 * exists.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun cardAuthorization(cardAuthorization: JsonField<String>) = apply {
                    this.cardAuthorization = cardAuthorization
                }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Settlement identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Settlement identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Interchange assessed as a part of this transaciton. */
                fun interchange(interchange: Interchange) = interchange(JsonField.of(interchange))

                /** Interchange assessed as a part of this transaciton. */
                @JsonProperty("interchange")
                @ExcludeMissing
                fun interchange(interchange: JsonField<Interchange>) = apply {
                    this.interchange = interchange
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

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
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

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Network-specific identifiers for this refund. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for this refund. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /** The amount in the minor unit of the transaction's presentment currency. */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
                }

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardSettlement =
                    CardSettlement(
                        amount,
                        cardAuthorization,
                        cardPaymentId,
                        currency,
                        id,
                        interchange,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantName,
                        merchantState,
                        networkIdentifiers,
                        pendingTransactionId,
                        presentmentAmount,
                        presentmentCurrency,
                        purchaseDetails,
                        transactionId,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Interchange assessed as a part of this transaciton. */
            @JsonDeserialize(builder = Interchange.Builder::class)
            @NoAutoDetect
            class Interchange
            private constructor(
                private val amount: JsonField<String>,
                private val code: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                fun amount(): String = amount.getRequired("amount")

                /** The card network specific interchange code. */
                fun code(): String? = code.getNullable("code")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The card network specific interchange code. */
                @JsonProperty("code") @ExcludeMissing fun _code() = code

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Interchange = apply {
                    if (!validated) {
                        amount()
                        code()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Interchange &&
                        this.amount == other.amount &&
                        this.code == other.code &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                code,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Interchange{amount=$amount, code=$code, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var code: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(interchange: Interchange) = apply {
                        this.amount = interchange.amount
                        this.code = interchange.code
                        this.currency = interchange.currency
                        additionalProperties(interchange.additionalProperties)
                    }

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The card network specific interchange code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /** The card network specific interchange code. */
                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Interchange =
                        Interchange(
                            amount,
                            code,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Currency && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val CAD = Currency(JsonField.of("CAD"))

                        val CHF = Currency(JsonField.of("CHF"))

                        val EUR = Currency(JsonField.of("EUR"))

                        val GBP = Currency(JsonField.of("GBP"))

                        val JPY = Currency(JsonField.of("JPY"))

                        val USD = Currency(JsonField.of("USD"))

                        fun of(value: String) = Currency(JsonField.of(value))
                    }

                    enum class Known {
                        CAD,
                        CHF,
                        EUR,
                        GBP,
                        JPY,
                        USD,
                    }

                    enum class Value {
                        CAD,
                        CHF,
                        EUR,
                        GBP,
                        JPY,
                        USD,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CAD -> Value.CAD
                            CHF -> Value.CHF
                            EUR -> Value.EUR
                            GBP -> Value.GBP
                            JPY -> Value.JPY
                            USD -> Value.USD
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CAD -> Known.CAD
                            CHF -> Known.CHF
                            EUR -> Known.EUR
                            GBP -> Known.GBP
                            JPY -> Known.JPY
                            USD -> Known.USD
                            else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /** Network-specific identifiers for this refund. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val acquirerBusinessId: JsonField<String>,
                private val acquirerReferenceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                fun acquirerBusinessId(): String =
                    acquirerBusinessId.getRequired("acquirer_business_id")

                /** A globally unique identifier for this settlement. */
                fun acquirerReferenceNumber(): String =
                    acquirerReferenceNumber.getRequired("acquirer_reference_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                @JsonProperty("acquirer_business_id")
                @ExcludeMissing
                fun _acquirerBusinessId() = acquirerBusinessId

                /** A globally unique identifier for this settlement. */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber() = acquirerReferenceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        acquirerBusinessId()
                        acquirerReferenceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.acquirerBusinessId == other.acquirerBusinessId &&
                        this.acquirerReferenceNumber == other.acquirerReferenceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                acquirerBusinessId,
                                acquirerReferenceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{acquirerBusinessId=$acquirerBusinessId, acquirerReferenceNumber=$acquirerReferenceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var acquirerBusinessId: JsonField<String> = JsonMissing.of()
                    private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.acquirerBusinessId = networkIdentifiers.acquirerBusinessId
                        this.acquirerReferenceNumber = networkIdentifiers.acquirerReferenceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
                    }

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    fun acquirerBusinessId(acquirerBusinessId: String) =
                        acquirerBusinessId(JsonField.of(acquirerBusinessId))

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    @JsonProperty("acquirer_business_id")
                    @ExcludeMissing
                    fun acquirerBusinessId(acquirerBusinessId: JsonField<String>) = apply {
                        this.acquirerBusinessId = acquirerBusinessId
                    }

                    /** A globally unique identifier for this settlement. */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
                        acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

                    /** A globally unique identifier for this settlement. */
                    @JsonProperty("acquirer_reference_number")
                    @ExcludeMissing
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
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
                            acquirerBusinessId,
                            acquirerReferenceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val carRental: JsonField<CarRental>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val lodging: JsonField<Lodging>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Fields specific to car rentals. */
                fun carRental(): CarRental? = carRental.getNullable("car_rental")

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): String? =
                    customerReferenceIdentifier.getNullable("customer_reference_identifier")

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Long? = localTaxAmount.getNullable("local_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): String? = localTaxCurrency.getNullable("local_tax_currency")

                /** Fields specific to lodging. */
                fun lodging(): Lodging? = lodging.getNullable("lodging")

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Long? =
                    nationalTaxAmount.getNullable("national_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): String? =
                    nationalTaxCurrency.getNullable("national_tax_currency")

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): String? =
                    purchaseIdentifier.getNullable("purchase_identifier")

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): PurchaseIdentifierFormat? =
                    purchaseIdentifierFormat.getNullable("purchase_identifier_format")

                /** Fields specific to travel. */
                fun travel(): Travel? = travel.getNullable("travel")

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        carRental()?.validate()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        lodging()?.validate()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        travel()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.carRental == other.carRental &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.lodging == other.lodging &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                carRental,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                lodging,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{carRental=$carRental, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, lodging=$lodging, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.carRental = purchaseDetails.carRental
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.lodging = purchaseDetails.lodging
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

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

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            carRental,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            lodging,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val carClassCode: JsonField<String>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val daysRented: JsonField<Long>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): String? = carClassCode.getNullable("car_class_code")

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): LocalDate? = checkoutDate.getNullable("checkout_date")

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Long? =
                        dailyRentalRateAmount.getNullable("daily_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): String? =
                        dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Long? = daysRented.getNullable("days_rented")

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Long? =
                        fuelChargesAmount.getNullable("fuel_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): String? =
                        fuelChargesCurrency.getNullable("fuel_charges_currency")

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Long? =
                        insuranceChargesAmount.getNullable("insurance_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): String? =
                        insuranceChargesCurrency.getNullable("insurance_charges_currency")

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Long? =
                        oneWayDropOffChargesAmount.getNullable("one_way_drop_off_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): String? =
                        oneWayDropOffChargesCurrency.getNullable(
                            "one_way_drop_off_charges_currency"
                        )

                    /** Name of the person renting the vehicle. */
                    fun renterName(): String? = renterName.getNullable("renter_name")

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Long? =
                        weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): String? =
                        weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            carClassCode()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            daysRented()
                            extraCharges()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            noShowIndicator()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            renterName()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.carClassCode == other.carClassCode &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.daysRented == other.daysRented &&
                            this.extraCharges == other.extraCharges &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.renterName == other.renterName &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    carClassCode,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    daysRented,
                                    extraCharges,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    noShowIndicator,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    renterName,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{carClassCode=$carClassCode, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, daysRented=$daysRented, extraCharges=$extraCharges, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, noShowIndicator=$noShowIndicator, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, renterName=$renterName, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(carRental: CarRental) = apply {
                            this.carClassCode = carRental.carClassCode
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.daysRented = carRental.daysRented
                            this.extraCharges = carRental.extraCharges
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.noShowIndicator = carRental.noShowIndicator
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.renterName = carRental.renterName
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CarRental =
                            CarRental(
                                carClassCode,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                daysRented,
                                extraCharges,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                noShowIndicator,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                renterName,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val GAS = ExtraCharges(JsonField.of("gas"))

                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Date the customer checked in. */
                    fun checkInDate(): LocalDate? = checkInDate.getNullable("check_in_date")

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Long? =
                        dailyRoomRateAmount.getNullable("daily_room_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): String? =
                        dailyRoomRateCurrency.getNullable("daily_room_rate_currency")

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Long? =
                        folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): String? =
                        folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Long? =
                        foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): String? =
                        foodBeverageChargesCurrency.getNullable("food_beverage_charges_currency")

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Long? =
                        prepaidExpensesAmount.getNullable("prepaid_expenses_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): String? =
                        prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")

                    /** Number of nights the room was rented. */
                    fun roomNights(): Long? = roomNights.getNullable("room_nights")

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Long? =
                        totalRoomTaxAmount.getNullable("total_room_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): String? =
                        totalRoomTaxCurrency.getNullable("total_room_tax_currency")

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Long? = totalTaxAmount.getNullable("total_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): String? =
                        totalTaxCurrency.getNullable("total_tax_currency")

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            extraCharges()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            noShowIndicator()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.extraCharges == other.extraCharges &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    extraCharges,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    noShowIndicator,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, extraCharges=$extraCharges, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, noShowIndicator=$noShowIndicator, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lodging: Lodging) = apply {
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.extraCharges = lodging.extraCharges
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.noShowIndicator = lodging.noShowIndicator
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Lodging =
                            Lodging(
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                extraCharges,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                noShowIndicator,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            val OTHER = ExtraCharges(JsonField.of("other"))

                            val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ancillary: JsonField<Ancillary>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val ticketNumber: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Ancillary? = ancillary.getNullable("ancillary")

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): String? =
                        computerizedReservationSystem.getNullable("computerized_reservation_system")

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): CreditReasonIndicator? =
                        creditReasonIndicator.getNullable("credit_reason_indicator")

                    /** Date of departure. */
                    fun departureDate(): LocalDate? = departureDate.getNullable("departure_date")

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): String? =
                        originationCityAirportCode.getNullable("origination_city_airport_code")

                    /** Name of the passenger. */
                    fun passengerName(): String? = passengerName.getNullable("passenger_name")

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): RestrictedTicketIndicator? =
                        restrictedTicketIndicator.getNullable("restricted_ticket_indicator")

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): TicketChangeIndicator? =
                        ticketChangeIndicator.getNullable("ticket_change_indicator")

                    /** Ticket number. */
                    fun ticketNumber(): String? = ticketNumber.getNullable("ticket_number")

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): String? =
                        travelAgencyCode.getNullable("travel_agency_code")

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): String? =
                        travelAgencyName.getNullable("travel_agency_name")

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): List<TripLeg>? = tripLegs.getNullable("trip_legs")

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ancillary()?.validate()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            departureDate()
                            originationCityAirportCode()
                            passengerName()
                            restrictedTicketIndicator()
                            ticketChangeIndicator()
                            ticketNumber()
                            travelAgencyCode()
                            travelAgencyName()
                            tripLegs()?.forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ancillary == other.ancillary &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.passengerName == other.passengerName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.ticketNumber == other.ticketNumber &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.tripLegs == other.tripLegs &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ancillary,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    departureDate,
                                    originationCityAirportCode,
                                    passengerName,
                                    restrictedTicketIndicator,
                                    ticketChangeIndicator,
                                    ticketNumber,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    tripLegs,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ancillary=$ancillary, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, passengerName=$passengerName, restrictedTicketIndicator=$restrictedTicketIndicator, ticketChangeIndicator=$ticketChangeIndicator, ticketNumber=$ticketNumber, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, tripLegs=$tripLegs, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(travel: Travel) = apply {
                            this.ancillary = travel.ancillary
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.passengerName = travel.passengerName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.ticketNumber = travel.ticketNumber
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.tripLegs = travel.tripLegs
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Travel =
                            Travel(
                                ancillary,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                departureDate,
                                originationCityAirportCode,
                                passengerName,
                                restrictedTicketIndicator,
                                ticketChangeIndicator,
                                ticketNumber,
                                travelAgencyCode,
                                travelAgencyName,
                                tripLegs.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val services: JsonField<List<Service>>,
                        private val ticketDocumentNumber: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): String? =
                            connectedTicketDocumentNumber.getNullable(
                                "connected_ticket_document_number"
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): CreditReasonIndicator? =
                            creditReasonIndicator.getNullable("credit_reason_indicator")

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): String? =
                            passengerNameOrDescription.getNullable("passenger_name_or_description")

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): String? =
                            ticketDocumentNumber.getNullable("ticket_document_number")

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                passengerNameOrDescription()
                                services().forEach { it.validate() }
                                ticketDocumentNumber()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.services == other.services &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        passengerNameOrDescription,
                                        services,
                                        ticketDocumentNumber,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, passengerNameOrDescription=$passengerNameOrDescription, services=$services, ticketDocumentNumber=$ticketDocumentNumber, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(ancillary: Ancillary) = apply {
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.services = ancillary.services
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Ancillary =
                                Ancillary(
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    passengerNameOrDescription,
                                    services.map { it.toUnmodifiable() },
                                    ticketDocumentNumber,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Category? = category.getNullable("category")

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): String? = subCategory.getNullable("sub_category")

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            class Category
                            @JsonCreator
                            private constructor(
                                private val value: JsonField<String>,
                            ) : Enum {

                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    val NONE = Category(JsonField.of("none"))

                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    val CARGO = Category(JsonField.of("cargo"))

                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    val LOUNGE = Category(JsonField.of("lounge"))

                                    val MEDICAL = Category(JsonField.of("medical"))

                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    val OTHER = Category(JsonField.of("other"))

                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    val PETS = Category(JsonField.of("pets"))

                                    val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    val STANDBY = Category(JsonField.of("standby"))

                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    val STORE = Category(JsonField.of("store"))

                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    val UPGRADES = Category(JsonField.of("upgrades"))

                                    val WIFI = Category(JsonField.of("wifi"))

                                    fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NONE = TicketChangeIndicator(JsonField.of("none"))

                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val carrierCode: JsonField<String>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val flightNumber: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): String? = carrierCode.getNullable("carrier_code")

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): String? =
                            destinationCityAirportCode.getNullable("destination_city_airport_code")

                        /** Fare basis code. */
                        fun fareBasisCode(): String? = fareBasisCode.getNullable("fare_basis_code")

                        /** Flight number. */
                        fun flightNumber(): String? = flightNumber.getNullable("flight_number")

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): String? = serviceClass.getNullable("service_class")

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): StopOverCode? =
                            stopOverCode.getNullable("stop_over_code")

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                carrierCode()
                                destinationCityAirportCode()
                                fareBasisCode()
                                flightNumber()
                                serviceClass()
                                stopOverCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.carrierCode == other.carrierCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.flightNumber == other.flightNumber &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        carrierCode,
                                        destinationCityAirportCode,
                                        fareBasisCode,
                                        flightNumber,
                                        serviceClass,
                                        stopOverCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{carrierCode=$carrierCode, destinationCityAirportCode=$destinationCityAirportCode, fareBasisCode=$fareBasisCode, flightNumber=$flightNumber, serviceClass=$serviceClass, stopOverCode=$stopOverCode, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tripLeg: TripLeg) = apply {
                                this.carrierCode = tripLeg.carrierCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.flightNumber = tripLeg.flightNumber
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): TripLeg =
                                TripLeg(
                                    carrierCode,
                                    destinationCityAirportCode,
                                    fareBasisCode,
                                    flightNumber,
                                    serviceClass,
                                    stopOverCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NONE = StopOverCode(JsonField.of("none"))

                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_SETTLEMENT = Type(JsonField.of("card_settlement"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_SETTLEMENT,
                }

                enum class Value {
                    CARD_SETTLEMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        @JsonDeserialize(builder = CardValidation.Builder::class)
        @NoAutoDetect
        class CardValidation
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val digitalWalletTokenId: JsonField<String>,
            private val id: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantPostalCode: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val networkRiskScore: JsonField<Long>,
            private val physicalCardId: JsonField<String>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): String? =
                digitalWalletTokenId.getNullable("digital_wallet_token_id")

            /** The Card Validation identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

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

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): String? =
                merchantPostalCode.getNullable("merchant_postal_code")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_validation`.
             */
            fun type(): Type = type.getRequired("type")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /** The Card Validation identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

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
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode() = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore() = networkRiskScore

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_validation`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardValidation = apply {
                if (!validated) {
                    actioner()
                    cardPaymentId()
                    currency()
                    digitalWalletTokenId()
                    id()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantDescriptor()
                    merchantPostalCode()
                    merchantState()
                    networkDetails().validate()
                    networkIdentifiers().validate()
                    networkRiskScore()
                    physicalCardId()
                    realTimeDecisionId()
                    type()
                    verification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardValidation &&
                    this.actioner == other.actioner &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.id == other.id &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantPostalCode == other.merchantPostalCode &&
                    this.merchantState == other.merchantState &&
                    this.networkDetails == other.networkDetails &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.networkRiskScore == other.networkRiskScore &&
                    this.physicalCardId == other.physicalCardId &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.type == other.type &&
                    this.verification == other.verification &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            actioner,
                            cardPaymentId,
                            currency,
                            digitalWalletTokenId,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantPostalCode,
                            merchantState,
                            networkDetails,
                            networkIdentifiers,
                            networkRiskScore,
                            physicalCardId,
                            realTimeDecisionId,
                            type,
                            verification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardValidation{actioner=$actioner, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, realTimeDecisionId=$realTimeDecisionId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var actioner: JsonField<Actioner> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantPostalCode: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var verification: JsonField<Verification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardValidation: CardValidation) = apply {
                    this.actioner = cardValidation.actioner
                    this.cardPaymentId = cardValidation.cardPaymentId
                    this.currency = cardValidation.currency
                    this.digitalWalletTokenId = cardValidation.digitalWalletTokenId
                    this.id = cardValidation.id
                    this.merchantAcceptorId = cardValidation.merchantAcceptorId
                    this.merchantCategoryCode = cardValidation.merchantCategoryCode
                    this.merchantCity = cardValidation.merchantCity
                    this.merchantCountry = cardValidation.merchantCountry
                    this.merchantDescriptor = cardValidation.merchantDescriptor
                    this.merchantPostalCode = cardValidation.merchantPostalCode
                    this.merchantState = cardValidation.merchantState
                    this.networkDetails = cardValidation.networkDetails
                    this.networkIdentifiers = cardValidation.networkIdentifiers
                    this.networkRiskScore = cardValidation.networkRiskScore
                    this.physicalCardId = cardValidation.physicalCardId
                    this.realTimeDecisionId = cardValidation.realTimeDecisionId
                    this.type = cardValidation.type
                    this.verification = cardValidation.verification
                    additionalProperties(cardValidation.additionalProperties)
                }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner")
                @ExcludeMissing
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                /** The Card Validation identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Validation identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String) =
                    merchantPostalCode(JsonField.of(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
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

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(JsonField.of(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String) =
                    physicalCardId(JsonField.of(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_validation`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_validation`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification")
                @ExcludeMissing
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
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

                fun build(): CardValidation =
                    CardValidation(
                        actioner,
                        cardPaymentId,
                        currency,
                        digitalWalletTokenId,
                        id,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantDescriptor,
                        merchantPostalCode,
                        merchantState,
                        networkDetails,
                        networkIdentifiers,
                        networkRiskScore,
                        physicalCardId,
                        realTimeDecisionId,
                        type,
                        verification,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Actioner && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USER = Actioner(JsonField.of("user"))

                    val INCREASE = Actioner(JsonField.of("increase"))

                    val NETWORK = Actioner(JsonField.of("network"))

                    fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            additionalProperties(visa.additionalProperties)
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator
                        ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
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
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    ) : Enum {

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

                            val INSTALLMENT =
                                ElectronicCommerceIndicator(JsonField.of("installment"))

                            val UNKNOWN_MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(
                                    JsonField.of("unknown_mail_phone_order")
                                )

                            val SECURE_ELECTRONIC_COMMERCE =
                                ElectronicCommerceIndicator(
                                    JsonField.of("secure_electronic_commerce")
                                )

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
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                    ) : Enum {

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
                                PointOfServiceEntryMode(
                                    JsonField.of("integrated_circuit_card_no_cvv")
                                )

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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        this.traceNumber == other.traceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val CARD_VALIDATION = Type(JsonField.of("card_validation"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_VALIDATION,
                }

                enum class Value {
                    CARD_VALIDATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_VALIDATION -> Value.CARD_VALIDATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_VALIDATION -> Known.CARD_VALIDATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields related to verification of cardholder-provided values. */
            @JsonDeserialize(builder = Verification.Builder::class)
            @NoAutoDetect
            class Verification
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode() = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress() = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Verification = apply {
                    if (!validated) {
                        cardVerificationCode().validate()
                        cardholderAddress().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Verification &&
                        this.cardVerificationCode == other.cardVerificationCode &&
                        this.cardholderAddress == other.cardholderAddress &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                cardVerificationCode,
                                cardholderAddress,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var cardVerificationCode: JsonField<CardVerificationCode> =
                        JsonMissing.of()
                    private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(verification: Verification) = apply {
                        this.cardVerificationCode = verification.cardVerificationCode
                        this.cardholderAddress = verification.cardholderAddress
                        additionalProperties(verification.additionalProperties)
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                        cardVerificationCode(JsonField.of(cardVerificationCode))

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    fun cardVerificationCode(
                        cardVerificationCode: JsonField<CardVerificationCode>
                    ) = apply { this.cardVerificationCode = cardVerificationCode }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: CardholderAddress) =
                        cardholderAddress(JsonField.of(cardholderAddress))

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
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
                            cardVerificationCode,
                            cardholderAddress,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardVerificationCode =
                            CardVerificationCode(result, additionalProperties.toUnmodifiable())
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonDeserialize(builder = CardholderAddress.Builder::class)
                @NoAutoDetect
                class CardholderAddress
                private constructor(
                    private val actualLine1: JsonField<String>,
                    private val actualPostalCode: JsonField<String>,
                    private val providedLine1: JsonField<String>,
                    private val providedPostalCode: JsonField<String>,
                    private val result: JsonField<Result>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(): String? =
                        actualPostalCode.getNullable("actual_postal_code")

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(): String? =
                        providedPostalCode.getNullable("provided_postal_code")

                    /** The address verification result returned to the card network. */
                    fun result(): Result = result.getRequired("result")

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode() = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1() = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode() = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result") @ExcludeMissing fun _result() = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CardholderAddress = apply {
                        if (!validated) {
                            actualLine1()
                            actualPostalCode()
                            providedLine1()
                            providedPostalCode()
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
                            this.actualLine1 == other.actualLine1 &&
                            this.actualPostalCode == other.actualPostalCode &&
                            this.providedLine1 == other.providedLine1 &&
                            this.providedPostalCode == other.providedPostalCode &&
                            this.result == other.result &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    actualLine1,
                                    actualPostalCode,
                                    providedLine1,
                                    providedPostalCode,
                                    result,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var actualLine1: JsonField<String> = JsonMissing.of()
                        private var actualPostalCode: JsonField<String> = JsonMissing.of()
                        private var providedLine1: JsonField<String> = JsonMissing.of()
                        private var providedPostalCode: JsonField<String> = JsonMissing.of()
                        private var result: JsonField<Result> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            this.actualLine1 = cardholderAddress.actualLine1
                            this.actualPostalCode = cardholderAddress.actualPostalCode
                            this.providedLine1 = cardholderAddress.providedLine1
                            this.providedPostalCode = cardholderAddress.providedPostalCode
                            this.result = cardholderAddress.result
                            additionalProperties(cardholderAddress.additionalProperties)
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String) =
                            actualLine1(JsonField.of(actualLine1))

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
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

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String) =
                            providedLine1(JsonField.of(providedLine1))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String) =
                            providedPostalCode(JsonField.of(providedPostalCode))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                actualLine1,
                                actualPostalCode,
                                providedLine1,
                                providedPostalCode,
                                result,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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
        ) : Enum {

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

                val CARD_AUTHORIZATION = Category(JsonField.of("card_authorization"))

                val CARD_VALIDATION = Category(JsonField.of("card_validation"))

                val CARD_DECLINE = Category(JsonField.of("card_decline"))

                val CARD_REVERSAL = Category(JsonField.of("card_reversal"))

                val CARD_AUTHORIZATION_EXPIRATION =
                    Category(JsonField.of("card_authorization_expiration"))

                val CARD_INCREMENT = Category(JsonField.of("card_increment"))

                val CARD_SETTLEMENT = Category(JsonField.of("card_settlement"))

                val CARD_REFUND = Category(JsonField.of("card_refund"))

                val CARD_FUEL_CONFIRMATION = Category(JsonField.of("card_fuel_confirmation"))

                val OTHER = Category(JsonField.of("other"))

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                CARD_AUTHORIZATION,
                CARD_VALIDATION,
                CARD_DECLINE,
                CARD_REVERSAL,
                CARD_AUTHORIZATION_EXPIRATION,
                CARD_INCREMENT,
                CARD_SETTLEMENT,
                CARD_REFUND,
                CARD_FUEL_CONFIRMATION,
                OTHER,
            }

            enum class Value {
                CARD_AUTHORIZATION,
                CARD_VALIDATION,
                CARD_DECLINE,
                CARD_REVERSAL,
                CARD_AUTHORIZATION_EXPIRATION,
                CARD_INCREMENT,
                CARD_SETTLEMENT,
                CARD_REFUND,
                CARD_FUEL_CONFIRMATION,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                    CARD_VALIDATION -> Value.CARD_VALIDATION
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CARD_REVERSAL -> Value.CARD_REVERSAL
                    CARD_AUTHORIZATION_EXPIRATION -> Value.CARD_AUTHORIZATION_EXPIRATION
                    CARD_INCREMENT -> Value.CARD_INCREMENT
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_FUEL_CONFIRMATION -> Value.CARD_FUEL_CONFIRMATION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                    CARD_VALIDATION -> Known.CARD_VALIDATION
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CARD_REVERSAL -> Known.CARD_REVERSAL
                    CARD_AUTHORIZATION_EXPIRATION -> Known.CARD_AUTHORIZATION_EXPIRATION
                    CARD_INCREMENT -> Known.CARD_INCREMENT
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_FUEL_CONFIRMATION -> Known.CARD_FUEL_CONFIRMATION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** The summarized state of this card payment. */
    @JsonDeserialize(builder = State.Builder::class)
    @NoAutoDetect
    class State
    private constructor(
        private val authorizedAmount: JsonField<Long>,
        private val fuelConfirmedAmount: JsonField<Long>,
        private val incrementedAmount: JsonField<Long>,
        private val reversedAmount: JsonField<Long>,
        private val settledAmount: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The total authorized amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun authorizedAmount(): Long = authorizedAmount.getRequired("authorized_amount")

        /**
         * The total amount from fuel confirmations in the minor unit of the transaction's currency.
         * For dollars, for example, this is cents.
         */
        fun fuelConfirmedAmount(): Long = fuelConfirmedAmount.getRequired("fuel_confirmed_amount")

        /**
         * The total incrementally updated authorized amount in the minor unit of the transaction's
         * currency. For dollars, for example, this is cents.
         */
        fun incrementedAmount(): Long = incrementedAmount.getRequired("incremented_amount")

        /**
         * The total reversed amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun reversedAmount(): Long = reversedAmount.getRequired("reversed_amount")

        /**
         * The total settled or refunded amount in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * The total authorized amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("authorized_amount")
        @ExcludeMissing
        fun _authorizedAmount() = authorizedAmount

        /**
         * The total amount from fuel confirmations in the minor unit of the transaction's currency.
         * For dollars, for example, this is cents.
         */
        @JsonProperty("fuel_confirmed_amount")
        @ExcludeMissing
        fun _fuelConfirmedAmount() = fuelConfirmedAmount

        /**
         * The total incrementally updated authorized amount in the minor unit of the transaction's
         * currency. For dollars, for example, this is cents.
         */
        @JsonProperty("incremented_amount")
        @ExcludeMissing
        fun _incrementedAmount() = incrementedAmount

        /**
         * The total reversed amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("reversed_amount") @ExcludeMissing fun _reversedAmount() = reversedAmount

        /**
         * The total settled or refunded amount in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): State = apply {
            if (!validated) {
                authorizedAmount()
                fuelConfirmedAmount()
                incrementedAmount()
                reversedAmount()
                settledAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State &&
                this.authorizedAmount == other.authorizedAmount &&
                this.fuelConfirmedAmount == other.fuelConfirmedAmount &&
                this.incrementedAmount == other.incrementedAmount &&
                this.reversedAmount == other.reversedAmount &&
                this.settledAmount == other.settledAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        authorizedAmount,
                        fuelConfirmedAmount,
                        incrementedAmount,
                        reversedAmount,
                        settledAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "State{authorizedAmount=$authorizedAmount, fuelConfirmedAmount=$fuelConfirmedAmount, incrementedAmount=$incrementedAmount, reversedAmount=$reversedAmount, settledAmount=$settledAmount, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var authorizedAmount: JsonField<Long> = JsonMissing.of()
            private var fuelConfirmedAmount: JsonField<Long> = JsonMissing.of()
            private var incrementedAmount: JsonField<Long> = JsonMissing.of()
            private var reversedAmount: JsonField<Long> = JsonMissing.of()
            private var settledAmount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(state: State) = apply {
                this.authorizedAmount = state.authorizedAmount
                this.fuelConfirmedAmount = state.fuelConfirmedAmount
                this.incrementedAmount = state.incrementedAmount
                this.reversedAmount = state.reversedAmount
                this.settledAmount = state.settledAmount
                additionalProperties(state.additionalProperties)
            }

            /**
             * The total authorized amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun authorizedAmount(authorizedAmount: Long) =
                authorizedAmount(JsonField.of(authorizedAmount))

            /**
             * The total authorized amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("authorized_amount")
            @ExcludeMissing
            fun authorizedAmount(authorizedAmount: JsonField<Long>) = apply {
                this.authorizedAmount = authorizedAmount
            }

            /**
             * The total amount from fuel confirmations in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            fun fuelConfirmedAmount(fuelConfirmedAmount: Long) =
                fuelConfirmedAmount(JsonField.of(fuelConfirmedAmount))

            /**
             * The total amount from fuel confirmations in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            @JsonProperty("fuel_confirmed_amount")
            @ExcludeMissing
            fun fuelConfirmedAmount(fuelConfirmedAmount: JsonField<Long>) = apply {
                this.fuelConfirmedAmount = fuelConfirmedAmount
            }

            /**
             * The total incrementally updated authorized amount in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun incrementedAmount(incrementedAmount: Long) =
                incrementedAmount(JsonField.of(incrementedAmount))

            /**
             * The total incrementally updated authorized amount in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("incremented_amount")
            @ExcludeMissing
            fun incrementedAmount(incrementedAmount: JsonField<Long>) = apply {
                this.incrementedAmount = incrementedAmount
            }

            /**
             * The total reversed amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun reversedAmount(reversedAmount: Long) = reversedAmount(JsonField.of(reversedAmount))

            /**
             * The total reversed amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("reversed_amount")
            @ExcludeMissing
            fun reversedAmount(reversedAmount: JsonField<Long>) = apply {
                this.reversedAmount = reversedAmount
            }

            /**
             * The total settled or refunded amount in the minor unit of the transaction's currency.
             * For dollars, for example, this is cents.
             */
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * The total settled or refunded amount in the minor unit of the transaction's currency.
             * For dollars, for example, this is cents.
             */
            @JsonProperty("settled_amount")
            @ExcludeMissing
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
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

            fun build(): State =
                State(
                    authorizedAmount,
                    fuelConfirmedAmount,
                    incrementedAmount,
                    reversedAmount,
                    settledAmount,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val CARD_PAYMENT = Type(JsonField.of("card_payment"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_PAYMENT,
        }

        enum class Value {
            CARD_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_PAYMENT -> Value.CARD_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_PAYMENT -> Known.CARD_PAYMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
