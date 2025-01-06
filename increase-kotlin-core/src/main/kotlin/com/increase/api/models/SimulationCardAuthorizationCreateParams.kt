// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

class SimulationCardAuthorizationCreateParams
constructor(
    private val body: SimulationCardAuthorizationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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

    /** The identifier of the Physical Card to be authorized. */
    fun physicalCardId(): String? = body.physicalCardId()

    /**
     * The terminal identifier (commonly abbreviated as TID) of the terminal the card is transacting
     * with.
     */
    fun terminalId(): String? = body.terminalId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): SimulationCardAuthorizationCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationCardAuthorizationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("authenticated_card_payment_id")
        private val authenticatedCardPaymentId: String?,
        @JsonProperty("card_id") private val cardId: String?,
        @JsonProperty("decline_reason") private val declineReason: DeclineReason?,
        @JsonProperty("digital_wallet_token_id") private val digitalWalletTokenId: String?,
        @JsonProperty("direction") private val direction: Direction?,
        @JsonProperty("event_subscription_id") private val eventSubscriptionId: String?,
        @JsonProperty("merchant_acceptor_id") private val merchantAcceptorId: String?,
        @JsonProperty("merchant_category_code") private val merchantCategoryCode: String?,
        @JsonProperty("merchant_city") private val merchantCity: String?,
        @JsonProperty("merchant_country") private val merchantCountry: String?,
        @JsonProperty("merchant_descriptor") private val merchantDescriptor: String?,
        @JsonProperty("merchant_state") private val merchantState: String?,
        @JsonProperty("physical_card_id") private val physicalCardId: String?,
        @JsonProperty("terminal_id") private val terminalId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The authorization amount in cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        @JsonProperty("authenticated_card_payment_id")
        fun authenticatedCardPaymentId(): String? = authenticatedCardPaymentId

        /** The identifier of the Card to be authorized. */
        @JsonProperty("card_id") fun cardId(): String? = cardId

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        @JsonProperty("decline_reason") fun declineReason(): DeclineReason? = declineReason

        /** The identifier of the Digital Wallet Token to be authorized. */
        @JsonProperty("digital_wallet_token_id")
        fun digitalWalletTokenId(): String? = digitalWalletTokenId

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        @JsonProperty("event_subscription_id")
        fun eventSubscriptionId(): String? = eventSubscriptionId

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_acceptor_id") fun merchantAcceptorId(): String? = merchantAcceptorId

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_category_code")
        fun merchantCategoryCode(): String? = merchantCategoryCode

        /** The city the merchant resides in. */
        @JsonProperty("merchant_city") fun merchantCity(): String? = merchantCity

        /** The country the merchant resides in. */
        @JsonProperty("merchant_country") fun merchantCountry(): String? = merchantCountry

        /** The merchant descriptor of the merchant the card is transacting with. */
        @JsonProperty("merchant_descriptor") fun merchantDescriptor(): String? = merchantDescriptor

        /** The state the merchant resides in. */
        @JsonProperty("merchant_state") fun merchantState(): String? = merchantState

        /** The identifier of the Physical Card to be authorized. */
        @JsonProperty("physical_card_id") fun physicalCardId(): String? = physicalCardId

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        @JsonProperty("terminal_id") fun terminalId(): String? = terminalId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var authenticatedCardPaymentId: String? = null
            private var cardId: String? = null
            private var declineReason: DeclineReason? = null
            private var digitalWalletTokenId: String? = null
            private var direction: Direction? = null
            private var eventSubscriptionId: String? = null
            private var merchantAcceptorId: String? = null
            private var merchantCategoryCode: String? = null
            private var merchantCity: String? = null
            private var merchantCountry: String? = null
            private var merchantDescriptor: String? = null
            private var merchantState: String? = null
            private var physicalCardId: String? = null
            private var terminalId: String? = null
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
                physicalCardId = simulationCardAuthorizationCreateBody.physicalCardId
                terminalId = simulationCardAuthorizationCreateBody.terminalId
                additionalProperties =
                    simulationCardAuthorizationCreateBody.additionalProperties.toMutableMap()
            }

            /** The authorization amount in cents. */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The identifier of a Card Payment with a `card_authentication` if you want to simulate
             * an authenticated authorization.
             */
            fun authenticatedCardPaymentId(authenticatedCardPaymentId: String?) = apply {
                this.authenticatedCardPaymentId = authenticatedCardPaymentId
            }

            /** The identifier of the Card to be authorized. */
            fun cardId(cardId: String?) = apply { this.cardId = cardId }

            /** Forces a card decline with a specific reason. No real time decision will be sent. */
            fun declineReason(declineReason: DeclineReason?) = apply {
                this.declineReason = declineReason
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            fun digitalWalletTokenId(digitalWalletTokenId: String?) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(direction: Direction?) = apply { this.direction = direction }

            /**
             * The identifier of the Event Subscription to use. If provided, will override the
             * default real time event subscription. Because you can only create one real time
             * decision event subscription, you can use this field to route events to any specified
             * event subscription for testing purposes.
             */
            fun eventSubscriptionId(eventSubscriptionId: String?) = apply {
                this.eventSubscriptionId = eventSubscriptionId
            }

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(merchantAcceptorId: String?) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(merchantCategoryCode: String?) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: String?) = apply { this.merchantCity = merchantCity }

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: String?) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: String?) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /** The state the merchant resides in. */
            fun merchantState(merchantState: String?) = apply { this.merchantState = merchantState }

            /** The identifier of the Physical Card to be authorized. */
            fun physicalCardId(physicalCardId: String?) = apply {
                this.physicalCardId = physicalCardId
            }

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: String?) = apply { this.terminalId = terminalId }

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
                    checkNotNull(amount) { "`amount` is required but was not set" },
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
                    physicalCardId,
                    terminalId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardAuthorizationCreateBody && amount == other.amount && authenticatedCardPaymentId == other.authenticatedCardPaymentId && cardId == other.cardId && declineReason == other.declineReason && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && eventSubscriptionId == other.eventSubscriptionId && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantState == other.merchantState && physicalCardId == other.physicalCardId && terminalId == other.terminalId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, authenticatedCardPaymentId, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantState, physicalCardId, terminalId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationCardAuthorizationCreateBody{amount=$amount, authenticatedCardPaymentId=$authenticatedCardPaymentId, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, physicalCardId=$physicalCardId, terminalId=$terminalId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

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

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        fun authenticatedCardPaymentId(authenticatedCardPaymentId: String?) = apply {
            body.authenticatedCardPaymentId(authenticatedCardPaymentId)
        }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String?) = apply { body.cardId(cardId) }

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(declineReason: DeclineReason?) = apply {
            body.declineReason(declineReason)
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String?) = apply {
            body.digitalWalletTokenId(digitalWalletTokenId)
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(direction: Direction?) = apply { body.direction(direction) }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String?) = apply {
            body.eventSubscriptionId(eventSubscriptionId)
        }

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(merchantAcceptorId: String?) = apply {
            body.merchantAcceptorId(merchantAcceptorId)
        }

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(merchantCategoryCode: String?) = apply {
            body.merchantCategoryCode(merchantCategoryCode)
        }

        /** The city the merchant resides in. */
        fun merchantCity(merchantCity: String?) = apply { body.merchantCity(merchantCity) }

        /** The country the merchant resides in. */
        fun merchantCountry(merchantCountry: String?) = apply {
            body.merchantCountry(merchantCountry)
        }

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(merchantDescriptor: String?) = apply {
            body.merchantDescriptor(merchantDescriptor)
        }

        /** The state the merchant resides in. */
        fun merchantState(merchantState: String?) = apply { body.merchantState(merchantState) }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: String?) = apply { body.physicalCardId(physicalCardId) }

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        fun terminalId(terminalId: String?) = apply { body.terminalId(terminalId) }

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

        fun build(): SimulationCardAuthorizationCreateParams =
            SimulationCardAuthorizationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class DeclineReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CARD_NOT_ACTIVE = of("card_not_active")

            val PHYSICAL_CARD_NOT_ACTIVE = of("physical_card_not_active")

            val ENTITY_NOT_ACTIVE = of("entity_not_active")

            val GROUP_LOCKED = of("group_locked")

            val INSUFFICIENT_FUNDS = of("insufficient_funds")

            val CVV2_MISMATCH = of("cvv2_mismatch")

            val CARD_EXPIRATION_MISMATCH = of("card_expiration_mismatch")

            val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

            val BREACHES_LIMIT = of("breaches_limit")

            val WEBHOOK_DECLINED = of("webhook_declined")

            val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

            val DECLINED_BY_STAND_IN_PROCESSING = of("declined_by_stand_in_processing")

            val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

            val MISSING_ORIGINAL_AUTHORIZATION = of("missing_original_authorization")

            val SUSPECTED_FRAUD = of("suspected_fraud")

            fun of(value: String) = DeclineReason(JsonField.of(value))
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

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SETTLEMENT = of("settlement")

            val REFUND = of("refund")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
