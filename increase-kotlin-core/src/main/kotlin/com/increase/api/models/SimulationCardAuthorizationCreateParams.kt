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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class SimulationCardAuthorizationCreateParams
constructor(
    private val amount: Long,
    private val authenticatedCardPaymentId: String?,
    private val cardId: String?,
    private val declineReason: DeclineReason?,
    private val digitalWalletTokenId: String?,
    private val direction: Direction?,
    private val eventSubscriptionId: String?,
    private val merchantAcceptorId: String?,
    private val merchantCategoryCode: String?,
    private val merchantCity: String?,
    private val merchantCountry: String?,
    private val merchantDescriptor: String?,
    private val physicalCardId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun authenticatedCardPaymentId(): String? = authenticatedCardPaymentId

    fun cardId(): String? = cardId

    fun declineReason(): DeclineReason? = declineReason

    fun digitalWalletTokenId(): String? = digitalWalletTokenId

    fun direction(): Direction? = direction

    fun eventSubscriptionId(): String? = eventSubscriptionId

    fun merchantAcceptorId(): String? = merchantAcceptorId

    fun merchantCategoryCode(): String? = merchantCategoryCode

    fun merchantCity(): String? = merchantCity

    fun merchantCountry(): String? = merchantCountry

    fun merchantDescriptor(): String? = merchantDescriptor

    fun physicalCardId(): String? = physicalCardId

    internal fun getBody(): SimulationCardAuthorizationCreateBody {
        return SimulationCardAuthorizationCreateBody(
            amount,
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
            physicalCardId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationCardAuthorizationCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardAuthorizationCreateBody
    internal constructor(
        private val amount: Long?,
        private val authenticatedCardPaymentId: String?,
        private val cardId: String?,
        private val declineReason: DeclineReason?,
        private val digitalWalletTokenId: String?,
        private val direction: Direction?,
        private val eventSubscriptionId: String?,
        private val merchantAcceptorId: String?,
        private val merchantCategoryCode: String?,
        private val merchantCity: String?,
        private val merchantCountry: String?,
        private val merchantDescriptor: String?,
        private val physicalCardId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The authorization amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

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

        /** The identifier of the Physical Card to be authorized. */
        @JsonProperty("physical_card_id") fun physicalCardId(): String? = physicalCardId

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
            private var physicalCardId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationCardAuthorizationCreateBody: SimulationCardAuthorizationCreateBody
            ) = apply {
                this.amount = simulationCardAuthorizationCreateBody.amount
                this.authenticatedCardPaymentId =
                    simulationCardAuthorizationCreateBody.authenticatedCardPaymentId
                this.cardId = simulationCardAuthorizationCreateBody.cardId
                this.declineReason = simulationCardAuthorizationCreateBody.declineReason
                this.digitalWalletTokenId =
                    simulationCardAuthorizationCreateBody.digitalWalletTokenId
                this.direction = simulationCardAuthorizationCreateBody.direction
                this.eventSubscriptionId = simulationCardAuthorizationCreateBody.eventSubscriptionId
                this.merchantAcceptorId = simulationCardAuthorizationCreateBody.merchantAcceptorId
                this.merchantCategoryCode =
                    simulationCardAuthorizationCreateBody.merchantCategoryCode
                this.merchantCity = simulationCardAuthorizationCreateBody.merchantCity
                this.merchantCountry = simulationCardAuthorizationCreateBody.merchantCountry
                this.merchantDescriptor = simulationCardAuthorizationCreateBody.merchantDescriptor
                this.physicalCardId = simulationCardAuthorizationCreateBody.physicalCardId
                additionalProperties(simulationCardAuthorizationCreateBody.additionalProperties)
            }

            /** The authorization amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The identifier of a Card Payment with a `card_authentication` if you want to simulate
             * an authenticated authorization.
             */
            @JsonProperty("authenticated_card_payment_id")
            fun authenticatedCardPaymentId(authenticatedCardPaymentId: String) = apply {
                this.authenticatedCardPaymentId = authenticatedCardPaymentId
            }

            /** The identifier of the Card to be authorized. */
            @JsonProperty("card_id") fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** Forces a card decline with a specific reason. No real time decision will be sent. */
            @JsonProperty("decline_reason")
            fun declineReason(declineReason: DeclineReason) = apply {
                this.declineReason = declineReason
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            @JsonProperty("digital_wallet_token_id")
            fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /**
             * The identifier of the Event Subscription to use. If provided, will override the
             * default real time event subscription. Because you can only create one real time
             * decision event subscription, you can use this field to route events to any specified
             * event subscription for testing purposes.
             */
            @JsonProperty("event_subscription_id")
            fun eventSubscriptionId(eventSubscriptionId: String) = apply {
                this.eventSubscriptionId = eventSubscriptionId
            }

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            fun merchantCategoryCode(merchantCategoryCode: String) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city")
            fun merchantCity(merchantCity: String) = apply { this.merchantCity = merchantCity }

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            fun merchantCountry(merchantCountry: String) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            fun merchantDescriptor(merchantDescriptor: String) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /** The identifier of the Physical Card to be authorized. */
            @JsonProperty("physical_card_id")
            fun physicalCardId(physicalCardId: String) = apply {
                this.physicalCardId = physicalCardId
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
                    physicalCardId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardAuthorizationCreateBody && this.amount == other.amount && this.authenticatedCardPaymentId == other.authenticatedCardPaymentId && this.cardId == other.cardId && this.declineReason == other.declineReason && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.eventSubscriptionId == other.eventSubscriptionId && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.physicalCardId == other.physicalCardId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, authenticatedCardPaymentId, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, physicalCardId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardAuthorizationCreateBody{amount=$amount, authenticatedCardPaymentId=$authenticatedCardPaymentId, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardAuthorizationCreateParams && this.amount == other.amount && this.authenticatedCardPaymentId == other.authenticatedCardPaymentId && this.cardId == other.cardId && this.declineReason == other.declineReason && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.eventSubscriptionId == other.eventSubscriptionId && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.physicalCardId == other.physicalCardId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, authenticatedCardPaymentId, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, physicalCardId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardAuthorizationCreateParams{amount=$amount, authenticatedCardPaymentId=$authenticatedCardPaymentId, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
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
        private var physicalCardId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationCardAuthorizationCreateParams: SimulationCardAuthorizationCreateParams
        ) = apply {
            this.amount = simulationCardAuthorizationCreateParams.amount
            this.authenticatedCardPaymentId =
                simulationCardAuthorizationCreateParams.authenticatedCardPaymentId
            this.cardId = simulationCardAuthorizationCreateParams.cardId
            this.declineReason = simulationCardAuthorizationCreateParams.declineReason
            this.digitalWalletTokenId = simulationCardAuthorizationCreateParams.digitalWalletTokenId
            this.direction = simulationCardAuthorizationCreateParams.direction
            this.eventSubscriptionId = simulationCardAuthorizationCreateParams.eventSubscriptionId
            this.merchantAcceptorId = simulationCardAuthorizationCreateParams.merchantAcceptorId
            this.merchantCategoryCode = simulationCardAuthorizationCreateParams.merchantCategoryCode
            this.merchantCity = simulationCardAuthorizationCreateParams.merchantCity
            this.merchantCountry = simulationCardAuthorizationCreateParams.merchantCountry
            this.merchantDescriptor = simulationCardAuthorizationCreateParams.merchantDescriptor
            this.physicalCardId = simulationCardAuthorizationCreateParams.physicalCardId
            additionalHeaders(simulationCardAuthorizationCreateParams.additionalHeaders)
            additionalQueryParams(simulationCardAuthorizationCreateParams.additionalQueryParams)
            additionalBodyProperties(
                simulationCardAuthorizationCreateParams.additionalBodyProperties
            )
        }

        /** The authorization amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The identifier of a Card Payment with a `card_authentication` if you want to simulate an
         * authenticated authorization.
         */
        fun authenticatedCardPaymentId(authenticatedCardPaymentId: String) = apply {
            this.authenticatedCardPaymentId = authenticatedCardPaymentId
        }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(declineReason: DeclineReason) = apply {
            this.declineReason = declineReason
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            this.eventSubscriptionId = eventSubscriptionId
        }

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) = apply {
            this.merchantCategoryCode = merchantCategoryCode
        }

        /** The city the merchant resides in. */
        fun merchantCity(merchantCity: String) = apply { this.merchantCity = merchantCity }

        /** The country the merchant resides in. */
        fun merchantCountry(merchantCountry: String) = apply {
            this.merchantCountry = merchantCountry
        }

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(merchantDescriptor: String) = apply {
            this.merchantDescriptor = merchantDescriptor
        }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SimulationCardAuthorizationCreateParams =
            SimulationCardAuthorizationCreateParams(
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
                physicalCardId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class DeclineReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DeclineReason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CARD_NOT_ACTIVE = DeclineReason(JsonField.of("card_not_active"))

            val PHYSICAL_CARD_NOT_ACTIVE = DeclineReason(JsonField.of("physical_card_not_active"))

            val ENTITY_NOT_ACTIVE = DeclineReason(JsonField.of("entity_not_active"))

            val GROUP_LOCKED = DeclineReason(JsonField.of("group_locked"))

            val INSUFFICIENT_FUNDS = DeclineReason(JsonField.of("insufficient_funds"))

            val CVV2_MISMATCH = DeclineReason(JsonField.of("cvv2_mismatch"))

            val CARD_EXPIRATION_MISMATCH = DeclineReason(JsonField.of("card_expiration_mismatch"))

            val TRANSACTION_NOT_ALLOWED = DeclineReason(JsonField.of("transaction_not_allowed"))

            val BREACHES_LIMIT = DeclineReason(JsonField.of("breaches_limit"))

            val WEBHOOK_DECLINED = DeclineReason(JsonField.of("webhook_declined"))

            val WEBHOOK_TIMED_OUT = DeclineReason(JsonField.of("webhook_timed_out"))

            val DECLINED_BY_STAND_IN_PROCESSING =
                DeclineReason(JsonField.of("declined_by_stand_in_processing"))

            val INVALID_PHYSICAL_CARD = DeclineReason(JsonField.of("invalid_physical_card"))

            val MISSING_ORIGINAL_AUTHORIZATION =
                DeclineReason(JsonField.of("missing_original_authorization"))

            val SUSPECTED_FRAUD = DeclineReason(JsonField.of("suspected_fraud"))

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

            return /* spotless:off */ other is Direction && this.value == other.value /* spotless:on */
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
}
