// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
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
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/**
 * Simulates a purchase authorization on a [Card](#cards). Depending on the balance available to the
 * card and the `amount` submitted, the authorization activity will result in a
 * [Pending Transaction](#pending-transactions) of type `card_authorization` or a
 * [Declined Transaction](#declined-transactions) of type `card_decline`. You can pass either a Card
 * id or a [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different ways
 * purchases can be made.
 */
class SimulationCardAuthorizationCreateParams
private constructor(
    private val body: SimulationCardAuthorizationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The authorization amount in cents. */
    fun amount(): Long = body.amount()

    /**
     * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
     * authenticated authorization.
     */
    fun authenticatedCardPaymentId(): String? = body.authenticatedCardPaymentId()

    /** The identifier of the Card to be authorized. */
    fun cardId(): String? = body.cardId()

    /** Forces a card decline with a specific reason. No real time decision will be sent. */
    fun declineReason(): DeclineReason? = body.declineReason()

    /** The identifier of the Digital Wallet Token to be authorized. */
    fun digitalWalletTokenId(): String? = body.digitalWalletTokenId()

    /**
     * The direction describes the direction the funds will move, either from the cardholder to the
     * merchant or from the merchant to the cardholder.
     */
    fun direction(): Direction? = body.direction()

    /**
     * The identifier of the Event Subscription to use. If provided, will override the default real
     * time event subscription. Because you can only create one real time decision event
     * subscription, you can use this field to route events to any specified event subscription for
     * testing purposes.
     */
    fun eventSubscriptionId(): String? = body.eventSubscriptionId()

    /**
     * The merchant identifier (commonly abbreviated as MID) of the merchant the card is transacting
     * with.
     */
    fun merchantAcceptorId(): String? = body.merchantAcceptorId()

    /**
     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
     * transacting with.
     */
    fun merchantCategoryCode(): String? = body.merchantCategoryCode()

    /** The city the merchant resides in. */
    fun merchantCity(): String? = body.merchantCity()

    /** The country the merchant resides in. */
    fun merchantCountry(): String? = body.merchantCountry()

    /** The merchant descriptor of the merchant the card is transacting with. */
    fun merchantDescriptor(): String? = body.merchantDescriptor()

    /** The state the merchant resides in. */
    fun merchantState(): String? = body.merchantState()

    /** Fields specific to a given card network. */
    fun networkDetails(): NetworkDetails? = body.networkDetails()

    /** The identifier of the Physical Card to be authorized. */
    fun physicalCardId(): String? = body.physicalCardId()

    /**
     * The terminal identifier (commonly abbreviated as TID) of the terminal the card is transacting
     * with.
     */
    fun terminalId(): String? = body.terminalId()

    /** The authorization amount in cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
     * authenticated authorization.
     */
    fun _authenticatedCardPaymentId(): JsonField<String> = body._authenticatedCardPaymentId()

    /** The identifier of the Card to be authorized. */
    fun _cardId(): JsonField<String> = body._cardId()

    /** Forces a card decline with a specific reason. No real time decision will be sent. */
    fun _declineReason(): JsonField<DeclineReason> = body._declineReason()

    /** The identifier of the Digital Wallet Token to be authorized. */
    fun _digitalWalletTokenId(): JsonField<String> = body._digitalWalletTokenId()

    /**
     * The direction describes the direction the funds will move, either from the cardholder to the
     * merchant or from the merchant to the cardholder.
     */
    fun _direction(): JsonField<Direction> = body._direction()

    /**
     * The identifier of the Event Subscription to use. If provided, will override the default real
     * time event subscription. Because you can only create one real time decision event
     * subscription, you can use this field to route events to any specified event subscription for
     * testing purposes.
     */
    fun _eventSubscriptionId(): JsonField<String> = body._eventSubscriptionId()

    /**
     * The merchant identifier (commonly abbreviated as MID) of the merchant the card is transacting
     * with.
     */
    fun _merchantAcceptorId(): JsonField<String> = body._merchantAcceptorId()

    /**
     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
     * transacting with.
     */
    fun _merchantCategoryCode(): JsonField<String> = body._merchantCategoryCode()

    /** The city the merchant resides in. */
    fun _merchantCity(): JsonField<String> = body._merchantCity()

    /** The country the merchant resides in. */
    fun _merchantCountry(): JsonField<String> = body._merchantCountry()

    /** The merchant descriptor of the merchant the card is transacting with. */
    fun _merchantDescriptor(): JsonField<String> = body._merchantDescriptor()

    /** The state the merchant resides in. */
    fun _merchantState(): JsonField<String> = body._merchantState()

    /** Fields specific to a given card network. */
    fun _networkDetails(): JsonField<NetworkDetails> = body._networkDetails()

    /** The identifier of the Physical Card to be authorized. */
    fun _physicalCardId(): JsonField<String> = body._physicalCardId()

    /**
     * The terminal identifier (commonly abbreviated as TID) of the terminal the card is transacting
     * with.
     */
    fun _terminalId(): JsonField<String> = body._terminalId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): SimulationCardAuthorizationCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationCardAuthorizationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("authenticated_card_payment_id")
        @ExcludeMissing
        private val authenticatedCardPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decline_reason")
        @ExcludeMissing
        private val declineReason: JsonField<DeclineReason> = JsonMissing.of(),
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        private val digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("event_subscription_id")
        @ExcludeMissing
        private val eventSubscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        private val merchantAcceptorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        private val merchantCategoryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_city")
        @ExcludeMissing
        private val merchantCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_country")
        @ExcludeMissing
        private val merchantCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        private val merchantDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_state")
        @ExcludeMissing
        private val merchantState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_details")
        @ExcludeMissing
        private val networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        private val physicalCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("terminal_id")
        @ExcludeMissing
        private val terminalId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The authorization amount in cents. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        fun authenticatedCardPaymentId(): String? =
            authenticatedCardPaymentId.getNullable("authenticated_card_payment_id")

        /** The identifier of the Card to be authorized. */
        fun cardId(): String? = cardId.getNullable("card_id")

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(): DeclineReason? = declineReason.getNullable("decline_reason")

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(): String? =
            digitalWalletTokenId.getNullable("digital_wallet_token_id")

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(): Direction? = direction.getNullable("direction")

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(): String? =
            eventSubscriptionId.getNullable("event_subscription_id")

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(): String? = merchantAcceptorId.getNullable("merchant_acceptor_id")

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
        fun merchantDescriptor(): String? = merchantDescriptor.getNullable("merchant_descriptor")

        /** The state the merchant resides in. */
        fun merchantState(): String? = merchantState.getNullable("merchant_state")

        /** Fields specific to a given card network. */
        fun networkDetails(): NetworkDetails? = networkDetails.getNullable("network_details")

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        fun terminalId(): String? = terminalId.getNullable("terminal_id")

        /** The authorization amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        @JsonProperty("authenticated_card_payment_id")
        @ExcludeMissing
        fun _authenticatedCardPaymentId(): JsonField<String> = authenticatedCardPaymentId

        /** The identifier of the Card to be authorized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        @JsonProperty("decline_reason")
        @ExcludeMissing
        fun _declineReason(): JsonField<DeclineReason> = declineReason

        /** The identifier of the Digital Wallet Token to be authorized. */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        @JsonProperty("event_subscription_id")
        @ExcludeMissing
        fun _eventSubscriptionId(): JsonField<String> = eventSubscriptionId

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

        /** The city the merchant resides in. */
        @JsonProperty("merchant_city")
        @ExcludeMissing
        fun _merchantCity(): JsonField<String> = merchantCity

        /** The country the merchant resides in. */
        @JsonProperty("merchant_country")
        @ExcludeMissing
        fun _merchantCountry(): JsonField<String> = merchantCountry

        /** The merchant descriptor of the merchant the card is transacting with. */
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

        /** The state the merchant resides in. */
        @JsonProperty("merchant_state")
        @ExcludeMissing
        fun _merchantState(): JsonField<String> = merchantState

        /** Fields specific to a given card network. */
        @JsonProperty("network_details")
        @ExcludeMissing
        fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

        /** The identifier of the Physical Card to be authorized. */
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        fun _physicalCardId(): JsonField<String> = physicalCardId

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        @JsonProperty("terminal_id")
        @ExcludeMissing
        fun _terminalId(): JsonField<String> = terminalId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationCardAuthorizationCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            authenticatedCardPaymentId()
            cardId()
            declineReason()
            digitalWalletTokenId()
            direction()
            eventSubscriptionId()
            merchantAcceptorId()
            merchantCategoryCode()
            merchantCity()
            merchantCountry()
            merchantDescriptor()
            merchantState()
            networkDetails()?.validate()
            physicalCardId()
            terminalId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [SimulationCardAuthorizationCreateBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var authenticatedCardPaymentId: JsonField<String> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var declineReason: JsonField<DeclineReason> = JsonMissing.of()
            private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var eventSubscriptionId: JsonField<String> = JsonMissing.of()
            private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
            private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
            private var merchantCity: JsonField<String> = JsonMissing.of()
            private var merchantCountry: JsonField<String> = JsonMissing.of()
            private var merchantDescriptor: JsonField<String> = JsonMissing.of()
            private var merchantState: JsonField<String> = JsonMissing.of()
            private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
            private var physicalCardId: JsonField<String> = JsonMissing.of()
            private var terminalId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationCardAuthorizationCreateBody: SimulationCardAuthorizationCreateBody
            ) = apply {
                amount = simulationCardAuthorizationCreateBody.amount
                authenticatedCardPaymentId =
                    simulationCardAuthorizationCreateBody.authenticatedCardPaymentId
                cardId = simulationCardAuthorizationCreateBody.cardId
                declineReason = simulationCardAuthorizationCreateBody.declineReason
                digitalWalletTokenId = simulationCardAuthorizationCreateBody.digitalWalletTokenId
                direction = simulationCardAuthorizationCreateBody.direction
                eventSubscriptionId = simulationCardAuthorizationCreateBody.eventSubscriptionId
                merchantAcceptorId = simulationCardAuthorizationCreateBody.merchantAcceptorId
                merchantCategoryCode = simulationCardAuthorizationCreateBody.merchantCategoryCode
                merchantCity = simulationCardAuthorizationCreateBody.merchantCity
                merchantCountry = simulationCardAuthorizationCreateBody.merchantCountry
                merchantDescriptor = simulationCardAuthorizationCreateBody.merchantDescriptor
                merchantState = simulationCardAuthorizationCreateBody.merchantState
                networkDetails = simulationCardAuthorizationCreateBody.networkDetails
                physicalCardId = simulationCardAuthorizationCreateBody.physicalCardId
                terminalId = simulationCardAuthorizationCreateBody.terminalId
                additionalProperties =
                    simulationCardAuthorizationCreateBody.additionalProperties.toMutableMap()
            }

            /** The authorization amount in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The authorization amount in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The identifier of a Card Payment with a `card_authentication` if you want to simulate
             * an authenticated authorization.
             */
            fun authenticatedCardPaymentId(authenticatedCardPaymentId: String) =
                authenticatedCardPaymentId(JsonField.of(authenticatedCardPaymentId))

            /**
             * The identifier of a Card Payment with a `card_authentication` if you want to simulate
             * an authenticated authorization.
             */
            fun authenticatedCardPaymentId(authenticatedCardPaymentId: JsonField<String>) = apply {
                this.authenticatedCardPaymentId = authenticatedCardPaymentId
            }

            /** The identifier of the Card to be authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card to be authorized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Forces a card decline with a specific reason. No real time decision will be sent. */
            fun declineReason(declineReason: DeclineReason) =
                declineReason(JsonField.of(declineReason))

            /** Forces a card decline with a specific reason. No real time decision will be sent. */
            fun declineReason(declineReason: JsonField<DeclineReason>) = apply {
                this.declineReason = declineReason
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            fun digitalWalletTokenId(digitalWalletTokenId: String) =
                digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

            /** The identifier of the Digital Wallet Token to be authorized. */
            fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * The identifier of the Event Subscription to use. If provided, will override the
             * default real time event subscription. Because you can only create one real time
             * decision event subscription, you can use this field to route events to any specified
             * event subscription for testing purposes.
             */
            fun eventSubscriptionId(eventSubscriptionId: String) =
                eventSubscriptionId(JsonField.of(eventSubscriptionId))

            /**
             * The identifier of the Event Subscription to use. If provided, will override the
             * default real time event subscription. Because you can only create one real time
             * decision event subscription, you can use this field to route events to any specified
             * event subscription for testing purposes.
             */
            fun eventSubscriptionId(eventSubscriptionId: JsonField<String>) = apply {
                this.eventSubscriptionId = eventSubscriptionId
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
            fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                this.merchantAcceptorId = merchantAcceptorId
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
            fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: JsonField<String>) = apply {
                this.merchantCity = merchantCity
            }

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: String) =
                merchantCountry(JsonField.of(merchantCountry))

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: String) =
                merchantDescriptor(JsonField.of(merchantDescriptor))

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /** The state the merchant resides in. */
            fun merchantState(merchantState: String) = merchantState(JsonField.of(merchantState))

            /** The state the merchant resides in. */
            fun merchantState(merchantState: JsonField<String>) = apply {
                this.merchantState = merchantState
            }

            /** Fields specific to a given card network. */
            fun networkDetails(networkDetails: NetworkDetails) =
                networkDetails(JsonField.of(networkDetails))

            /** Fields specific to a given card network. */
            fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                this.networkDetails = networkDetails
            }

            /** The identifier of the Physical Card to be authorized. */
            fun physicalCardId(physicalCardId: String) =
                physicalCardId(JsonField.of(physicalCardId))

            /** The identifier of the Physical Card to be authorized. */
            fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                this.physicalCardId = physicalCardId
            }

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: String) = terminalId(JsonField.of(terminalId))

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: JsonField<String>) = apply { this.terminalId = terminalId }

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

            fun build(): SimulationCardAuthorizationCreateBody =
                SimulationCardAuthorizationCreateBody(
                    checkRequired("amount", amount),
                    authenticatedCardPaymentId,
                    cardId,
                    declineReason,
                    digitalWalletTokenId,
                    direction,
                    eventSubscriptionId,
                    merchantAcceptorId,
                    merchantCategoryCode,
                    merchantCity,
                    merchantCountry,
                    merchantDescriptor,
                    merchantState,
                    networkDetails,
                    physicalCardId,
                    terminalId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardAuthorizationCreateBody && amount == other.amount && authenticatedCardPaymentId == other.authenticatedCardPaymentId && cardId == other.cardId && declineReason == other.declineReason && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && eventSubscriptionId == other.eventSubscriptionId && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantState == other.merchantState && networkDetails == other.networkDetails && physicalCardId == other.physicalCardId && terminalId == other.terminalId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, authenticatedCardPaymentId, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantState, networkDetails, physicalCardId, terminalId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationCardAuthorizationCreateBody{amount=$amount, authenticatedCardPaymentId=$authenticatedCardPaymentId, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, networkDetails=$networkDetails, physicalCardId=$physicalCardId, terminalId=$terminalId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SimulationCardAuthorizationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SimulationCardAuthorizationCreateBody.Builder =
            SimulationCardAuthorizationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            simulationCardAuthorizationCreateParams: SimulationCardAuthorizationCreateParams
        ) = apply {
            body = simulationCardAuthorizationCreateParams.body.toBuilder()
            additionalHeaders =
                simulationCardAuthorizationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationCardAuthorizationCreateParams.additionalQueryParams.toBuilder()
        }

        /** The authorization amount in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The authorization amount in cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        fun authenticatedCardPaymentId(authenticatedCardPaymentId: String) = apply {
            body.authenticatedCardPaymentId(authenticatedCardPaymentId)
        }

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        fun authenticatedCardPaymentId(authenticatedCardPaymentId: JsonField<String>) = apply {
            body.authenticatedCardPaymentId(authenticatedCardPaymentId)
        }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: JsonField<String>) = apply { body.cardId(cardId) }

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(declineReason: DeclineReason) = apply {
            body.declineReason(declineReason)
        }

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(declineReason: JsonField<DeclineReason>) = apply {
            body.declineReason(declineReason)
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
            body.digitalWalletTokenId(digitalWalletTokenId)
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
            body.digitalWalletTokenId(digitalWalletTokenId)
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            body.eventSubscriptionId(eventSubscriptionId)
        }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: JsonField<String>) = apply {
            body.eventSubscriptionId(eventSubscriptionId)
        }

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) = apply {
            body.merchantCategoryCode(merchantCategoryCode)
        }

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
            body.merchantCategoryCode(merchantCategoryCode)
        }

        /** The city the merchant resides in. */
        fun merchantCity(merchantCity: String) = apply { body.merchantCity(merchantCity) }

        /** The city the merchant resides in. */
        fun merchantCity(merchantCity: JsonField<String>) = apply {
            body.merchantCity(merchantCity)
        }

        /** The country the merchant resides in. */
        fun merchantCountry(merchantCountry: String) = apply {
            body.merchantCountry(merchantCountry)
        }

        /** The country the merchant resides in. */
        fun merchantCountry(merchantCountry: JsonField<String>) = apply {
            body.merchantCountry(merchantCountry)
        }

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(merchantDescriptor: String) = apply {
            body.merchantDescriptor(merchantDescriptor)
        }

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
            body.merchantDescriptor(merchantDescriptor)
        }

        /** The state the merchant resides in. */
        fun merchantState(merchantState: String) = apply { body.merchantState(merchantState) }

        /** The state the merchant resides in. */
        fun merchantState(merchantState: JsonField<String>) = apply {
            body.merchantState(merchantState)
        }

        /** Fields specific to a given card network. */
        fun networkDetails(networkDetails: NetworkDetails) = apply {
            body.networkDetails(networkDetails)
        }

        /** Fields specific to a given card network. */
        fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
            body.networkDetails(networkDetails)
        }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: String) = apply { body.physicalCardId(physicalCardId) }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: JsonField<String>) = apply {
            body.physicalCardId(physicalCardId)
        }

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        fun terminalId(terminalId: String) = apply { body.terminalId(terminalId) }

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        fun terminalId(terminalId: JsonField<String>) = apply { body.terminalId(terminalId) }

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

        fun build(): SimulationCardAuthorizationCreateParams =
            SimulationCardAuthorizationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Forces a card decline with a specific reason. No real time decision will be sent. */
    class DeclineReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** The Card was not active. */
            val CARD_NOT_ACTIVE = of("card_not_active")

            /** The Physical Card was not active. */
            val PHYSICAL_CARD_NOT_ACTIVE = of("physical_card_not_active")

            /** The account's entity was not active. */
            val ENTITY_NOT_ACTIVE = of("entity_not_active")

            /** The account was inactive. */
            val GROUP_LOCKED = of("group_locked")

            /** The Card's Account did not have a sufficient available balance. */
            val INSUFFICIENT_FUNDS = of("insufficient_funds")

            /** The given CVV2 did not match the card's value. */
            val CVV2_MISMATCH = of("cvv2_mismatch")

            /**
             * The given expiration date did not match the card's value. Only applies when a CVV2 is
             * present.
             */
            val CARD_EXPIRATION_MISMATCH = of("card_expiration_mismatch")

            /** The attempted card transaction is not allowed per Increase's terms. */
            val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

            /** The transaction was blocked by a Limit. */
            val BREACHES_LIMIT = of("breaches_limit")

            /** Your application declined the transaction via webhook. */
            val WEBHOOK_DECLINED = of("webhook_declined")

            /** Your application webhook did not respond without the required timeout. */
            val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

            /** Declined by stand-in processing. */
            val DECLINED_BY_STAND_IN_PROCESSING = of("declined_by_stand_in_processing")

            /** The card read had an invalid CVV, dCVV, or authorization request cryptogram. */
            val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

            /**
             * The original card authorization for this incremental authorization does not exist.
             */
            val MISSING_ORIGINAL_AUTHORIZATION = of("missing_original_authorization")

            /**
             * The transaction was suspected to be fraudulent. Please reach out to
             * support@increase.com for more information.
             */
            val SUSPECTED_FRAUD = of("suspected_fraud")

            fun of(value: String) = DeclineReason(JsonField.of(value))
        }

        /** An enum containing [DeclineReason]'s known values. */
        enum class Known {
            /** The Card was not active. */
            CARD_NOT_ACTIVE,
            /** The Physical Card was not active. */
            PHYSICAL_CARD_NOT_ACTIVE,
            /** The account's entity was not active. */
            ENTITY_NOT_ACTIVE,
            /** The account was inactive. */
            GROUP_LOCKED,
            /** The Card's Account did not have a sufficient available balance. */
            INSUFFICIENT_FUNDS,
            /** The given CVV2 did not match the card's value. */
            CVV2_MISMATCH,
            /**
             * The given expiration date did not match the card's value. Only applies when a CVV2 is
             * present.
             */
            CARD_EXPIRATION_MISMATCH,
            /** The attempted card transaction is not allowed per Increase's terms. */
            TRANSACTION_NOT_ALLOWED,
            /** The transaction was blocked by a Limit. */
            BREACHES_LIMIT,
            /** Your application declined the transaction via webhook. */
            WEBHOOK_DECLINED,
            /** Your application webhook did not respond without the required timeout. */
            WEBHOOK_TIMED_OUT,
            /** Declined by stand-in processing. */
            DECLINED_BY_STAND_IN_PROCESSING,
            /** The card read had an invalid CVV, dCVV, or authorization request cryptogram. */
            INVALID_PHYSICAL_CARD,
            /**
             * The original card authorization for this incremental authorization does not exist.
             */
            MISSING_ORIGINAL_AUTHORIZATION,
            /**
             * The transaction was suspected to be fraudulent. Please reach out to
             * support@increase.com for more information.
             */
            SUSPECTED_FRAUD,
        }

        /**
         * An enum containing [DeclineReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DeclineReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The Card was not active. */
            CARD_NOT_ACTIVE,
            /** The Physical Card was not active. */
            PHYSICAL_CARD_NOT_ACTIVE,
            /** The account's entity was not active. */
            ENTITY_NOT_ACTIVE,
            /** The account was inactive. */
            GROUP_LOCKED,
            /** The Card's Account did not have a sufficient available balance. */
            INSUFFICIENT_FUNDS,
            /** The given CVV2 did not match the card's value. */
            CVV2_MISMATCH,
            /**
             * The given expiration date did not match the card's value. Only applies when a CVV2 is
             * present.
             */
            CARD_EXPIRATION_MISMATCH,
            /** The attempted card transaction is not allowed per Increase's terms. */
            TRANSACTION_NOT_ALLOWED,
            /** The transaction was blocked by a Limit. */
            BREACHES_LIMIT,
            /** Your application declined the transaction via webhook. */
            WEBHOOK_DECLINED,
            /** Your application webhook did not respond without the required timeout. */
            WEBHOOK_TIMED_OUT,
            /** Declined by stand-in processing. */
            DECLINED_BY_STAND_IN_PROCESSING,
            /** The card read had an invalid CVV, dCVV, or authorization request cryptogram. */
            INVALID_PHYSICAL_CARD,
            /**
             * The original card authorization for this incremental authorization does not exist.
             */
            MISSING_ORIGINAL_AUTHORIZATION,
            /**
             * The transaction was suspected to be fraudulent. Please reach out to
             * support@increase.com for more information.
             */
            SUSPECTED_FRAUD,
            /**
             * An enum member indicating that [DeclineReason] was instantiated with an unknown
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
                else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DeclineReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The direction describes the direction the funds will move, either from the cardholder to the
     * merchant or from the merchant to the cardholder.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A regular card authorization where funds are debited from the cardholder. */
            val SETTLEMENT = of("settlement")

            /**
             * A refund card authorization, sometimes referred to as a credit voucher authorization,
             * where funds are credited to the cardholder.
             */
            val REFUND = of("refund")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            /** A regular card authorization where funds are debited from the cardholder. */
            SETTLEMENT,
            /**
             * A refund card authorization, sometimes referred to as a credit voucher authorization,
             * where funds are credited to the cardholder.
             */
            REFUND,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A regular card authorization where funds are debited from the cardholder. */
            SETTLEMENT,
            /**
             * A refund card authorization, sometimes referred to as a credit voucher authorization,
             * where funds are credited to the cardholder.
             */
            REFUND,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                SETTLEMENT -> Value.SETTLEMENT
                REFUND -> Value.REFUND
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
                SETTLEMENT -> Known.SETTLEMENT
                REFUND -> Known.REFUND
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Fields specific to a given card network. */
    @NoAutoDetect
    class NetworkDetails
    @JsonCreator
    private constructor(
        @JsonProperty("visa") @ExcludeMissing private val visa: JsonField<Visa> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Fields specific to the Visa network. */
        fun visa(): Visa = visa.getRequired("visa")

        /** Fields specific to the Visa network. */
        @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NetworkDetails = apply {
            if (validated) {
                return@apply
            }

            visa().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [NetworkDetails]. */
        class Builder internal constructor() {

            private var visa: JsonField<Visa>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(networkDetails: NetworkDetails) = apply {
                visa = networkDetails.visa
                additionalProperties = networkDetails.additionalProperties.toMutableMap()
            }

            /** Fields specific to the Visa network. */
            fun visa(visa: Visa) = visa(JsonField.of(visa))

            /** Fields specific to the Visa network. */
            fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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

            fun build(): NetworkDetails =
                NetworkDetails(checkRequired("visa", visa), additionalProperties.toImmutable())
        }

        /** Fields specific to the Visa network. */
        @NoAutoDetect
        class Visa
        @JsonCreator
        private constructor(
            @JsonProperty("stand_in_processing_reason")
            @ExcludeMissing
            private val standInProcessingReason: JsonField<StandInProcessingReason> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The reason code for the stand-in processing. */
            fun standInProcessingReason(): StandInProcessingReason? =
                standInProcessingReason.getNullable("stand_in_processing_reason")

            /** The reason code for the stand-in processing. */
            @JsonProperty("stand_in_processing_reason")
            @ExcludeMissing
            fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                standInProcessingReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Visa = apply {
                if (validated) {
                    return@apply
                }

                standInProcessingReason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Visa]. */
            class Builder internal constructor() {

                private var standInProcessingReason: JsonField<StandInProcessingReason> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(visa: Visa) = apply {
                    standInProcessingReason = visa.standInProcessingReason
                    additionalProperties = visa.additionalProperties.toMutableMap()
                }

                /** The reason code for the stand-in processing. */
                fun standInProcessingReason(standInProcessingReason: StandInProcessingReason) =
                    standInProcessingReason(JsonField.of(standInProcessingReason))

                /** The reason code for the stand-in processing. */
                fun standInProcessingReason(
                    standInProcessingReason: JsonField<StandInProcessingReason>
                ) = apply { this.standInProcessingReason = standInProcessingReason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Visa =
                    Visa(standInProcessingReason, additionalProperties.toImmutable())
            }

            /** The reason code for the stand-in processing. */
            class StandInProcessingReason
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** Increase failed to process the authorization in a timely manner. */
                    val ISSUER_ERROR = of("issuer_error")

                    /**
                     * The physical card read had an invalid CVV, dCVV, or authorization request
                     * cryptogram.
                     */
                    val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                    /** The 3DS cardholder authentication verification value was invalid. */
                    val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                        of("invalid_cardholder_authentication_verification_value")

                    /**
                     * An internal Visa error occurred. Visa uses this reason code for certain
                     * expected occurrences as well, such as Application Transaction Counter (ATC)
                     * replays.
                     */
                    val INTERNAL_VISA_ERROR = of("internal_visa_error")

                    /**
                     * The merchant has enabled Visa's Transaction Advisory Service and requires
                     * further authentication to perform the transaction. In practice this is often
                     * utilized at fuel pumps to tell the cardholder to see the cashier.
                     */
                    val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                        of("merchant_transaction_advisory_service_authentication_required")

                    /**
                     * The transaction was blocked by Visa's Payment Fraud Disruption service due to
                     * fraudulent Acquirer behavior, such as card testing.
                     */
                    val PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK =
                        of("payment_fraud_disruption_acquirer_block")

                    /** An unspecific reason for stand-in processing. */
                    val OTHER = of("other")

                    fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                }

                /** An enum containing [StandInProcessingReason]'s known values. */
                enum class Known {
                    /** Increase failed to process the authorization in a timely manner. */
                    ISSUER_ERROR,
                    /**
                     * The physical card read had an invalid CVV, dCVV, or authorization request
                     * cryptogram.
                     */
                    INVALID_PHYSICAL_CARD,
                    /** The 3DS cardholder authentication verification value was invalid. */
                    INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                    /**
                     * An internal Visa error occurred. Visa uses this reason code for certain
                     * expected occurrences as well, such as Application Transaction Counter (ATC)
                     * replays.
                     */
                    INTERNAL_VISA_ERROR,
                    /**
                     * The merchant has enabled Visa's Transaction Advisory Service and requires
                     * further authentication to perform the transaction. In practice this is often
                     * utilized at fuel pumps to tell the cardholder to see the cashier.
                     */
                    MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                    /**
                     * The transaction was blocked by Visa's Payment Fraud Disruption service due to
                     * fraudulent Acquirer behavior, such as card testing.
                     */
                    PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                    /** An unspecific reason for stand-in processing. */
                    OTHER,
                }

                /**
                 * An enum containing [StandInProcessingReason]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [StandInProcessingReason] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** Increase failed to process the authorization in a timely manner. */
                    ISSUER_ERROR,
                    /**
                     * The physical card read had an invalid CVV, dCVV, or authorization request
                     * cryptogram.
                     */
                    INVALID_PHYSICAL_CARD,
                    /** The 3DS cardholder authentication verification value was invalid. */
                    INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                    /**
                     * An internal Visa error occurred. Visa uses this reason code for certain
                     * expected occurrences as well, such as Application Transaction Counter (ATC)
                     * replays.
                     */
                    INTERNAL_VISA_ERROR,
                    /**
                     * The merchant has enabled Visa's Transaction Advisory Service and requires
                     * further authentication to perform the transaction. In practice this is often
                     * utilized at fuel pumps to tell the cardholder to see the cashier.
                     */
                    MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                    /**
                     * The transaction was blocked by Visa's Payment Fraud Disruption service due to
                     * fraudulent Acquirer behavior, such as card testing.
                     */
                    PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                    /** An unspecific reason for stand-in processing. */
                    OTHER,
                    /**
                     * An enum member indicating that [StandInProcessingReason] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ISSUER_ERROR -> Value.ISSUER_ERROR
                        INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                            Value.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                        INTERNAL_VISA_ERROR -> Value.INTERNAL_VISA_ERROR
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                            Value.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                            Value.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ISSUER_ERROR -> Known.ISSUER_ERROR
                        INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                            Known.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                        INTERNAL_VISA_ERROR -> Known.INTERNAL_VISA_ERROR
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                            Known.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                            Known.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                        OTHER -> Known.OTHER
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown StandInProcessingReason: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StandInProcessingReason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Visa && standInProcessingReason == other.standInProcessingReason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(standInProcessingReason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Visa{standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NetworkDetails && visa == other.visa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(visa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NetworkDetails{visa=$visa, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardAuthorizationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationCardAuthorizationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
