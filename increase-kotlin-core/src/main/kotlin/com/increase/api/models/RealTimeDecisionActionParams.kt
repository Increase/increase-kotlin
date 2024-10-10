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
import com.increase.api.core.toUnmodifiable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun realTimeDecisionId(): String = realTimeDecisionId

    fun cardAuthentication(): CardAuthentication? = cardAuthentication

    fun cardAuthenticationChallenge(): CardAuthenticationChallenge? = cardAuthenticationChallenge

    fun cardAuthorization(): CardAuthorization? = cardAuthorization

    fun digitalWalletAuthentication(): DigitalWalletAuthentication? = digitalWalletAuthentication

    fun digitalWalletToken(): DigitalWalletToken? = digitalWalletToken

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

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimeDecisionActionBody && this.cardAuthentication == other.cardAuthentication && this.cardAuthenticationChallenge == other.cardAuthenticationChallenge && this.cardAuthorization == other.cardAuthorization && this.digitalWalletAuthentication == other.digitalWalletAuthentication && this.digitalWalletToken == other.digitalWalletToken && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RealTimeDecisionActionBody{cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimeDecisionActionParams && this.realTimeDecisionId == other.realTimeDecisionId && this.cardAuthentication == other.cardAuthentication && this.cardAuthenticationChallenge == other.cardAuthenticationChallenge && this.cardAuthorization == other.cardAuthorization && this.digitalWalletAuthentication == other.digitalWalletAuthentication && this.digitalWalletToken == other.digitalWalletToken && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(realTimeDecisionId, cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "RealTimeDecisionActionParams{realTimeDecisionId=$realTimeDecisionId, cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(realTimeDecisionActionParams: RealTimeDecisionActionParams) = apply {
            this.realTimeDecisionId = realTimeDecisionActionParams.realTimeDecisionId
            this.cardAuthentication = realTimeDecisionActionParams.cardAuthentication
            this.cardAuthenticationChallenge =
                realTimeDecisionActionParams.cardAuthenticationChallenge
            this.cardAuthorization = realTimeDecisionActionParams.cardAuthorization
            this.digitalWalletAuthentication =
                realTimeDecisionActionParams.digitalWalletAuthentication
            this.digitalWalletToken = realTimeDecisionActionParams.digitalWalletToken
            additionalQueryParams(realTimeDecisionActionParams.additionalQueryParams)
            additionalHeaders(realTimeDecisionActionParams.additionalHeaders)
            additionalBodyProperties(realTimeDecisionActionParams.additionalBodyProperties)
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
                    additionalProperties.toUnmodifiable()
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

                return /* spotless:off */ other is Decision && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is CardAuthentication && this.decision == other.decision && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(decision, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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
                    additionalProperties.toUnmodifiable()
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

                return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is CardAuthenticationChallenge && this.result == other.result && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(result, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Whether the card authorization should be approved or declined. */
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

            internal fun from(cardAuthorization: CardAuthorization) = apply {
                this.decision = cardAuthorization.decision
                additionalProperties(cardAuthorization.additionalProperties)
            }

            /** Whether the card authorization should be approved or declined. */
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

            fun build(): CardAuthorization =
                CardAuthorization(
                    checkNotNull(decision) { "`decision` is required but was not set" },
                    additionalProperties.toUnmodifiable()
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

                return /* spotless:off */ other is Decision && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthorization && this.decision == other.decision && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(decision, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthorization{decision=$decision, additionalProperties=$additionalProperties}"
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
                    additionalProperties.toUnmodifiable(),
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

                return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
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
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Success && this.email == other.email && this.phone == other.phone && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(email, phone, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Success{email=$email, phone=$phone, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletAuthentication && this.result == other.result && this.success == other.success && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(result, success, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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
                    additionalProperties.toUnmodifiable(),
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
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Approval && this.email == other.email && this.phone == other.phone && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(email, phone, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                fun build(): Decline = Decline(reason, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decline && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(reason, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Decline{reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletToken && this.approval == other.approval && this.decline == other.decline && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(approval, decline, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletToken{approval=$approval, decline=$decline, additionalProperties=$additionalProperties}"
    }
}
