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

class RealTimeDecisionActionParams
constructor(
    private val realTimeDecisionId: String,
    private val cardAuthentication: CardAuthentication?,
    private val cardAuthenticationChallenge: CardAuthenticationChallenge?,
    private val cardAuthorization: CardAuthorization?,
    private val digitalWalletAuthentication: DigitalWalletAuthentication?,
    private val digitalWalletToken: DigitalWalletToken?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun realTimeDecisionId(): String = realTimeDecisionId

    fun cardAuthentication(): CardAuthentication? = cardAuthentication

    fun cardAuthenticationChallenge(): CardAuthenticationChallenge? = cardAuthenticationChallenge

    fun cardAuthorization(): CardAuthorization? = cardAuthorization

    fun digitalWalletAuthentication(): DigitalWalletAuthentication? = digitalWalletAuthentication

    fun digitalWalletToken(): DigitalWalletToken? = digitalWalletToken

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): RealTimeDecisionActionBody {
        return RealTimeDecisionActionBody(
            cardAuthentication,
            cardAuthenticationChallenge,
            cardAuthorization,
            digitalWalletAuthentication,
            digitalWalletToken,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> realTimeDecisionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = RealTimeDecisionActionBody.Builder::class)
    @NoAutoDetect
    class RealTimeDecisionActionBody
    internal constructor(
        private val cardAuthentication: CardAuthentication?,
        private val cardAuthenticationChallenge: CardAuthenticationChallenge?,
        private val cardAuthorization: CardAuthorization?,
        private val digitalWalletAuthentication: DigitalWalletAuthentication?,
        private val digitalWalletToken: DigitalWalletToken?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("card_authentication")
        fun cardAuthentication(): CardAuthentication? = cardAuthentication

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        @JsonProperty("card_authentication_challenge")
        fun cardAuthenticationChallenge(): CardAuthenticationChallenge? =
            cardAuthenticationChallenge

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        @JsonProperty("card_authorization")
        fun cardAuthorization(): CardAuthorization? = cardAuthorization

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("digital_wallet_authentication")
        fun digitalWalletAuthentication(): DigitalWalletAuthentication? =
            digitalWalletAuthentication

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        @JsonProperty("digital_wallet_token")
        fun digitalWalletToken(): DigitalWalletToken? = digitalWalletToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cardAuthentication: CardAuthentication? = null
            private var cardAuthenticationChallenge: CardAuthenticationChallenge? = null
            private var cardAuthorization: CardAuthorization? = null
            private var digitalWalletAuthentication: DigitalWalletAuthentication? = null
            private var digitalWalletToken: DigitalWalletToken? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(realTimeDecisionActionBody: RealTimeDecisionActionBody) = apply {
                this.cardAuthentication = realTimeDecisionActionBody.cardAuthentication
                this.cardAuthenticationChallenge =
                    realTimeDecisionActionBody.cardAuthenticationChallenge
                this.cardAuthorization = realTimeDecisionActionBody.cardAuthorization
                this.digitalWalletAuthentication =
                    realTimeDecisionActionBody.digitalWalletAuthentication
                this.digitalWalletToken = realTimeDecisionActionBody.digitalWalletToken
                additionalProperties(realTimeDecisionActionBody.additionalProperties)
            }

            /**
             * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
             * contains your response to the authentication.
             */
            @JsonProperty("card_authentication")
            fun cardAuthentication(cardAuthentication: CardAuthentication) = apply {
                this.cardAuthentication = cardAuthentication
            }

            /**
             * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
             * object contains your response.
             */
            @JsonProperty("card_authentication_challenge")
            fun cardAuthenticationChallenge(
                cardAuthenticationChallenge: CardAuthenticationChallenge
            ) = apply { this.cardAuthenticationChallenge = cardAuthenticationChallenge }

            /**
             * If the Real-Time Decision relates to a card authorization attempt, this object
             * contains your response to the authorization.
             */
            @JsonProperty("card_authorization")
            fun cardAuthorization(cardAuthorization: CardAuthorization) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * If the Real-Time Decision relates to a digital wallet authentication attempt, this
             * object contains your response to the authentication.
             */
            @JsonProperty("digital_wallet_authentication")
            fun digitalWalletAuthentication(
                digitalWalletAuthentication: DigitalWalletAuthentication
            ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

            /**
             * If the Real-Time Decision relates to a digital wallet token provisioning attempt,
             * this object contains your response to the attempt.
             */
            @JsonProperty("digital_wallet_token")
            fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) = apply {
                this.digitalWalletToken = digitalWalletToken
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

            fun build(): RealTimeDecisionActionBody =
                RealTimeDecisionActionBody(
                    cardAuthentication,
                    cardAuthenticationChallenge,
                    cardAuthorization,
                    digitalWalletAuthentication,
                    digitalWalletToken,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimeDecisionActionBody && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealTimeDecisionActionBody{cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var realTimeDecisionId: String? = null
        private var cardAuthentication: CardAuthentication? = null
        private var cardAuthenticationChallenge: CardAuthenticationChallenge? = null
        private var cardAuthorization: CardAuthorization? = null
        private var digitalWalletAuthentication: DigitalWalletAuthentication? = null
        private var digitalWalletToken: DigitalWalletToken? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(realTimeDecisionActionParams: RealTimeDecisionActionParams) = apply {
            realTimeDecisionId = realTimeDecisionActionParams.realTimeDecisionId
            cardAuthentication = realTimeDecisionActionParams.cardAuthentication
            cardAuthenticationChallenge = realTimeDecisionActionParams.cardAuthenticationChallenge
            cardAuthorization = realTimeDecisionActionParams.cardAuthorization
            digitalWalletAuthentication = realTimeDecisionActionParams.digitalWalletAuthentication
            digitalWalletToken = realTimeDecisionActionParams.digitalWalletToken
            additionalHeaders = realTimeDecisionActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = realTimeDecisionActionParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                realTimeDecisionActionParams.additionalBodyProperties.toMutableMap()
        }

        /** The identifier of the Real-Time Decision. */
        fun realTimeDecisionId(realTimeDecisionId: String) = apply {
            this.realTimeDecisionId = realTimeDecisionId
        }

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        fun cardAuthentication(cardAuthentication: CardAuthentication) = apply {
            this.cardAuthentication = cardAuthentication
        }

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge) =
            apply {
                this.cardAuthenticationChallenge = cardAuthenticationChallenge
            }

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        fun cardAuthorization(cardAuthorization: CardAuthorization) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            apply {
                this.digitalWalletAuthentication = digitalWalletAuthentication
            }

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) = apply {
            this.digitalWalletToken = digitalWalletToken
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

        fun build(): RealTimeDecisionActionParams =
            RealTimeDecisionActionParams(
                checkNotNull(realTimeDecisionId) {
                    "`realTimeDecisionId` is required but was not set"
                },
                cardAuthentication,
                cardAuthenticationChallenge,
                cardAuthorization,
                digitalWalletAuthentication,
                digitalWalletToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     */
    @JsonDeserialize(builder = CardAuthentication.Builder::class)
    @NoAutoDetect
    class CardAuthentication
    private constructor(
        private val decision: Decision?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Whether the card authentication attempt should be approved or declined. */
        @JsonProperty("decision") fun decision(): Decision? = decision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var decision: Decision? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardAuthentication: CardAuthentication) = apply {
                this.decision = cardAuthentication.decision
                additionalProperties(cardAuthentication.additionalProperties)
            }

            /** Whether the card authentication attempt should be approved or declined. */
            @JsonProperty("decision")
            fun decision(decision: Decision) = apply { this.decision = decision }

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

            fun build(): CardAuthentication =
                CardAuthentication(
                    checkNotNull(decision) { "`decision` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPROVE = Decision(JsonField.of("approve"))

                val CHALLENGE = Decision(JsonField.of("challenge"))

                val DENY = Decision(JsonField.of("deny"))

                fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                CHALLENGE,
                DENY,
            }

            enum class Value {
                APPROVE,
                CHALLENGE,
                DENY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    CHALLENGE -> Value.CHALLENGE
                    DENY -> Value.DENY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    CHALLENGE -> Known.CHALLENGE
                    DENY -> Known.DENY
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthentication && decision == other.decision && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(decision, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthentication{decision=$decision, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this object
     * contains your response.
     */
    @JsonDeserialize(builder = CardAuthenticationChallenge.Builder::class)
    @NoAutoDetect
    class CardAuthenticationChallenge
    private constructor(
        private val result: Result?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         */
        @JsonProperty("result") fun result(): Result? = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var result: Result? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardAuthenticationChallenge: CardAuthenticationChallenge) = apply {
                this.result = cardAuthenticationChallenge.result
                additionalProperties(cardAuthenticationChallenge.additionalProperties)
            }

            /**
             * Whether the card authentication challenge was successfully delivered to the
             * cardholder.
             */
            @JsonProperty("result") fun result(result: Result) = apply { this.result = result }

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

            fun build(): CardAuthenticationChallenge =
                CardAuthenticationChallenge(
                    checkNotNull(result) { "`result` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthenticationChallenge && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthenticationChallenge{result=$result, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a card authorization attempt, this object contains your
     * response to the authorization.
     */
    @JsonDeserialize(builder = CardAuthorization.Builder::class)
    @NoAutoDetect
    class CardAuthorization
    private constructor(
        private val decision: Decision?,
        private val declineReason: DeclineReason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Whether the card authorization should be approved or declined. */
        @JsonProperty("decision") fun decision(): Decision? = decision

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         */
        @JsonProperty("decline_reason") fun declineReason(): DeclineReason? = declineReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var decision: Decision? = null
            private var declineReason: DeclineReason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardAuthorization: CardAuthorization) = apply {
                this.decision = cardAuthorization.decision
                this.declineReason = cardAuthorization.declineReason
                additionalProperties(cardAuthorization.additionalProperties)
            }

            /** Whether the card authorization should be approved or declined. */
            @JsonProperty("decision")
            fun decision(decision: Decision) = apply { this.decision = decision }

            /**
             * The reason the card authorization was declined. This translates to a specific decline
             * code that is sent to the card network.
             */
            @JsonProperty("decline_reason")
            fun declineReason(declineReason: DeclineReason) = apply {
                this.declineReason = declineReason
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
                    checkNotNull(decision) { "`decision` is required but was not set" },
                    declineReason,
                    additionalProperties.toImmutable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is DeclineReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val INSUFFICIENT_FUNDS = DeclineReason(JsonField.of("insufficient_funds"))

                val TRANSACTION_NEVER_ALLOWED =
                    DeclineReason(JsonField.of("transaction_never_allowed"))

                val EXCEEDS_APPROVAL_LIMIT = DeclineReason(JsonField.of("exceeds_approval_limit"))

                val CARD_TEMPORARILY_DISABLED =
                    DeclineReason(JsonField.of("card_temporarily_disabled"))

                val SUSPECTED_FRAUD = DeclineReason(JsonField.of("suspected_fraud"))

                val OTHER = DeclineReason(JsonField.of("other"))

                fun of(value: String) = DeclineReason(JsonField.of(value))
            }

            enum class Known {
                INSUFFICIENT_FUNDS,
                TRANSACTION_NEVER_ALLOWED,
                EXCEEDS_APPROVAL_LIMIT,
                CARD_TEMPORARILY_DISABLED,
                SUSPECTED_FRAUD,
                OTHER,
            }

            enum class Value {
                INSUFFICIENT_FUNDS,
                TRANSACTION_NEVER_ALLOWED,
                EXCEEDS_APPROVAL_LIMIT,
                CARD_TEMPORARILY_DISABLED,
                SUSPECTED_FRAUD,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    TRANSACTION_NEVER_ALLOWED -> Value.TRANSACTION_NEVER_ALLOWED
                    EXCEEDS_APPROVAL_LIMIT -> Value.EXCEEDS_APPROVAL_LIMIT
                    CARD_TEMPORARILY_DISABLED -> Value.CARD_TEMPORARILY_DISABLED
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    TRANSACTION_NEVER_ALLOWED -> Known.TRANSACTION_NEVER_ALLOWED
                    EXCEEDS_APPROVAL_LIMIT -> Known.EXCEEDS_APPROVAL_LIMIT
                    CARD_TEMPORARILY_DISABLED -> Known.CARD_TEMPORARILY_DISABLED
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthorization && decision == other.decision && declineReason == other.declineReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(decision, declineReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthorization{decision=$decision, declineReason=$declineReason, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
     * contains your response to the authentication.
     */
    @JsonDeserialize(builder = DigitalWalletAuthentication.Builder::class)
    @NoAutoDetect
    class DigitalWalletAuthentication
    private constructor(
        private val result: Result?,
        private val success: Success?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Whether your application was able to deliver the one-time passcode. */
        @JsonProperty("result") fun result(): Result? = result

        @JsonProperty("success") fun success(): Success? = success

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var result: Result? = null
            private var success: Success? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                this.result = digitalWalletAuthentication.result
                this.success = digitalWalletAuthentication.success
                additionalProperties(digitalWalletAuthentication.additionalProperties)
            }

            /** Whether your application was able to deliver the one-time passcode. */
            @JsonProperty("result") fun result(result: Result) = apply { this.result = result }

            @JsonProperty("success")
            fun success(success: Success) = apply { this.success = success }

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
                    checkNotNull(result) { "`result` is required but was not set" },
                    success,
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
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

        @JsonDeserialize(builder = Success.Builder::class)
        @NoAutoDetect
        class Success
        private constructor(
            private val email: String?,
            private val phone: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The email address that was used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") fun email(): String? = email

            /**
             * The phone number that was used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(): String? = phone

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var email: String? = null
                private var phone: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(success: Success) = apply {
                    this.email = success.email
                    this.phone = success.phone
                    additionalProperties(success.additionalProperties)
                }

                /**
                 * The email address that was used to verify the cardholder via one-time passcode.
                 */
                @JsonProperty("email") fun email(email: String) = apply { this.email = email }

                /**
                 * The phone number that was used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

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

                fun build(): Success =
                    Success(
                        email,
                        phone,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Success && email == other.email && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, phone, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Success{email=$email, phone=$phone, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletAuthentication && result == other.result && success == other.success && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(result, success, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletAuthentication{result=$result, success=$success, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this object
     * contains your response to the attempt.
     */
    @JsonDeserialize(builder = DigitalWalletToken.Builder::class)
    @NoAutoDetect
    class DigitalWalletToken
    private constructor(
        private val approval: Approval?,
        private val decline: Decline?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        @JsonProperty("approval") fun approval(): Approval? = approval

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        @JsonProperty("decline") fun decline(): Decline? = decline

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var approval: Approval? = null
            private var decline: Decline? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                this.approval = digitalWalletToken.approval
                this.decline = digitalWalletToken.decline
                additionalProperties(digitalWalletToken.additionalProperties)
            }

            /**
             * If your application approves the provisioning attempt, this contains metadata about
             * the digital wallet token that will be generated.
             */
            @JsonProperty("approval")
            fun approval(approval: Approval) = apply { this.approval = approval }

            /**
             * If your application declines the provisioning attempt, this contains details about
             * the decline.
             */
            @JsonProperty("decline")
            fun decline(decline: Decline) = apply { this.decline = decline }

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
                    approval,
                    decline,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        @JsonDeserialize(builder = Approval.Builder::class)
        @NoAutoDetect
        class Approval
        private constructor(
            private val email: String?,
            private val phone: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** An email address that can be used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") fun email(): String? = email

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(): String? = phone

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var email: String? = null
                private var phone: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(approval: Approval) = apply {
                    this.email = approval.email
                    this.phone = approval.phone
                    additionalProperties(approval.additionalProperties)
                }

                /**
                 * An email address that can be used to verify the cardholder via one-time passcode.
                 */
                @JsonProperty("email") fun email(email: String) = apply { this.email = email }

                /**
                 * A phone number that can be used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

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

                fun build(): Approval =
                    Approval(
                        email,
                        phone,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Approval && email == other.email && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, phone, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Approval{email=$email, phone=$phone, additionalProperties=$additionalProperties}"
        }

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        @JsonDeserialize(builder = Decline.Builder::class)
        @NoAutoDetect
        class Decline
        private constructor(
            private val reason: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Why the tokenization attempt was declined. This is for logging purposes only and is
             * not displayed to the end-user.
             */
            @JsonProperty("reason") fun reason(): String? = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var reason: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decline: Decline) = apply {
                    this.reason = decline.reason
                    additionalProperties(decline.additionalProperties)
                }

                /**
                 * Why the tokenization attempt was declined. This is for logging purposes only and
                 * is not displayed to the end-user.
                 */
                @JsonProperty("reason") fun reason(reason: String) = apply { this.reason = reason }

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

                fun build(): Decline = Decline(reason, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decline && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Decline{reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletToken && approval == other.approval && decline == other.decline && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(approval, decline, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletToken{approval=$approval, decline=$decline, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimeDecisionActionParams && realTimeDecisionId == other.realTimeDecisionId && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimeDecisionId, cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RealTimeDecisionActionParams{realTimeDecisionId=$realTimeDecisionId, cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
