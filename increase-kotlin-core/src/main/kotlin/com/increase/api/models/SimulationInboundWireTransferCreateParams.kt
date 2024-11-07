// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects

class SimulationInboundWireTransferCreateParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val beneficiaryAddressLine1: String?,
    private val beneficiaryAddressLine2: String?,
    private val beneficiaryAddressLine3: String?,
    private val beneficiaryName: String?,
    private val beneficiaryReference: String?,
    private val originatorAddressLine1: String?,
    private val originatorAddressLine2: String?,
    private val originatorAddressLine3: String?,
    private val originatorName: String?,
    private val originatorRoutingNumber: String?,
    private val originatorToBeneficiaryInformationLine1: String?,
    private val originatorToBeneficiaryInformationLine2: String?,
    private val originatorToBeneficiaryInformationLine3: String?,
    private val originatorToBeneficiaryInformationLine4: String?,
    private val senderReference: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun beneficiaryAddressLine1(): String? = beneficiaryAddressLine1

    fun beneficiaryAddressLine2(): String? = beneficiaryAddressLine2

    fun beneficiaryAddressLine3(): String? = beneficiaryAddressLine3

    fun beneficiaryName(): String? = beneficiaryName

    fun beneficiaryReference(): String? = beneficiaryReference

    fun originatorAddressLine1(): String? = originatorAddressLine1

    fun originatorAddressLine2(): String? = originatorAddressLine2

    fun originatorAddressLine3(): String? = originatorAddressLine3

    fun originatorName(): String? = originatorName

    fun originatorRoutingNumber(): String? = originatorRoutingNumber

    fun originatorToBeneficiaryInformationLine1(): String? = originatorToBeneficiaryInformationLine1

    fun originatorToBeneficiaryInformationLine2(): String? = originatorToBeneficiaryInformationLine2

    fun originatorToBeneficiaryInformationLine3(): String? = originatorToBeneficiaryInformationLine3

    fun originatorToBeneficiaryInformationLine4(): String? = originatorToBeneficiaryInformationLine4

    fun senderReference(): String? = senderReference

    internal fun getBody(): SimulationInboundWireTransferCreateBody {
        return SimulationInboundWireTransferCreateBody(
            accountNumberId,
            amount,
            beneficiaryAddressLine1,
            beneficiaryAddressLine2,
            beneficiaryAddressLine3,
            beneficiaryName,
            beneficiaryReference,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            originatorRoutingNumber,
            originatorToBeneficiaryInformationLine1,
            originatorToBeneficiaryInformationLine2,
            originatorToBeneficiaryInformationLine3,
            originatorToBeneficiaryInformationLine4,
            senderReference,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationInboundWireTransferCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundWireTransferCreateBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val beneficiaryAddressLine1: String?,
        private val beneficiaryAddressLine2: String?,
        private val beneficiaryAddressLine3: String?,
        private val beneficiaryName: String?,
        private val beneficiaryReference: String?,
        private val originatorAddressLine1: String?,
        private val originatorAddressLine2: String?,
        private val originatorAddressLine3: String?,
        private val originatorName: String?,
        private val originatorRoutingNumber: String?,
        private val originatorToBeneficiaryInformationLine1: String?,
        private val originatorToBeneficiaryInformationLine2: String?,
        private val originatorToBeneficiaryInformationLine3: String?,
        private val originatorToBeneficiaryInformationLine4: String?,
        private val senderReference: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /** The transfer amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): String? = beneficiaryAddressLine1

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): String? = beneficiaryAddressLine2

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): String? = beneficiaryAddressLine3

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_name") fun beneficiaryName(): String? = beneficiaryName

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_reference")
        fun beneficiaryReference(): String? = beneficiaryReference

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): String? = originatorAddressLine1

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): String? = originatorAddressLine2

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): String? = originatorAddressLine3

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        @JsonProperty("originator_name") fun originatorName(): String? = originatorName

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_routing_number")
        fun originatorRoutingNumber(): String? = originatorRoutingNumber

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        fun originatorToBeneficiaryInformationLine1(): String? =
            originatorToBeneficiaryInformationLine1

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        fun originatorToBeneficiaryInformationLine2(): String? =
            originatorToBeneficiaryInformationLine2

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        fun originatorToBeneficiaryInformationLine3(): String? =
            originatorToBeneficiaryInformationLine3

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        fun originatorToBeneficiaryInformationLine4(): String? =
            originatorToBeneficiaryInformationLine4

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("sender_reference") fun senderReference(): String? = senderReference

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var beneficiaryAddressLine1: String? = null
            private var beneficiaryAddressLine2: String? = null
            private var beneficiaryAddressLine3: String? = null
            private var beneficiaryName: String? = null
            private var beneficiaryReference: String? = null
            private var originatorAddressLine1: String? = null
            private var originatorAddressLine2: String? = null
            private var originatorAddressLine3: String? = null
            private var originatorName: String? = null
            private var originatorRoutingNumber: String? = null
            private var originatorToBeneficiaryInformationLine1: String? = null
            private var originatorToBeneficiaryInformationLine2: String? = null
            private var originatorToBeneficiaryInformationLine3: String? = null
            private var originatorToBeneficiaryInformationLine4: String? = null
            private var senderReference: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationInboundWireTransferCreateBody: SimulationInboundWireTransferCreateBody
            ) = apply {
                this.accountNumberId = simulationInboundWireTransferCreateBody.accountNumberId
                this.amount = simulationInboundWireTransferCreateBody.amount
                this.beneficiaryAddressLine1 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine1
                this.beneficiaryAddressLine2 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine2
                this.beneficiaryAddressLine3 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine3
                this.beneficiaryName = simulationInboundWireTransferCreateBody.beneficiaryName
                this.beneficiaryReference =
                    simulationInboundWireTransferCreateBody.beneficiaryReference
                this.originatorAddressLine1 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine1
                this.originatorAddressLine2 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine2
                this.originatorAddressLine3 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine3
                this.originatorName = simulationInboundWireTransferCreateBody.originatorName
                this.originatorRoutingNumber =
                    simulationInboundWireTransferCreateBody.originatorRoutingNumber
                this.originatorToBeneficiaryInformationLine1 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine1
                this.originatorToBeneficiaryInformationLine2 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine2
                this.originatorToBeneficiaryInformationLine3 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine3
                this.originatorToBeneficiaryInformationLine4 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine4
                this.senderReference = simulationInboundWireTransferCreateBody.senderReference
                additionalProperties(simulationInboundWireTransferCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line1")
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line2")
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line3")
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            @JsonProperty("beneficiary_name")
            fun beneficiaryName(beneficiaryName: String) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            @JsonProperty("beneficiary_reference")
            fun beneficiaryReference(beneficiaryReference: String) = apply {
                this.beneficiaryReference = beneficiaryReference
            }

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line1")
            fun originatorAddressLine1(originatorAddressLine1: String) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line2")
            fun originatorAddressLine2(originatorAddressLine2: String) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line3")
            fun originatorAddressLine3(originatorAddressLine3: String) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
            }

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_routing_number")
            fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line1")
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line2")
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line3")
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line4")
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
            }

            /**
             * The sending bank will set sender_reference in production. You can simulate any value
             * here.
             */
            @JsonProperty("sender_reference")
            fun senderReference(senderReference: String) = apply {
                this.senderReference = senderReference
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

            fun build(): SimulationInboundWireTransferCreateBody =
                SimulationInboundWireTransferCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    beneficiaryName,
                    beneficiaryReference,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    originatorRoutingNumber,
                    originatorToBeneficiaryInformationLine1,
                    originatorToBeneficiaryInformationLine2,
                    originatorToBeneficiaryInformationLine3,
                    originatorToBeneficiaryInformationLine4,
                    senderReference,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundWireTransferCreateBody && this.accountNumberId == other.accountNumberId && this.amount == other.amount && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.beneficiaryName == other.beneficiaryName && this.beneficiaryReference == other.beneficiaryReference && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.originatorRoutingNumber == other.originatorRoutingNumber && this.originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && this.originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && this.originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && this.originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && this.senderReference == other.senderReference && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountNumberId, amount, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryReference, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, senderReference, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInboundWireTransferCreateBody{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, senderReference=$senderReference, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundWireTransferCreateParams && this.accountNumberId == other.accountNumberId && this.amount == other.amount && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.beneficiaryName == other.beneficiaryName && this.beneficiaryReference == other.beneficiaryReference && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.originatorRoutingNumber == other.originatorRoutingNumber && this.originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && this.originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && this.originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && this.originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && this.senderReference == other.senderReference && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountNumberId, amount, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryReference, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, senderReference, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationInboundWireTransferCreateParams{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, senderReference=$senderReference, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var beneficiaryAddressLine1: String? = null
        private var beneficiaryAddressLine2: String? = null
        private var beneficiaryAddressLine3: String? = null
        private var beneficiaryName: String? = null
        private var beneficiaryReference: String? = null
        private var originatorAddressLine1: String? = null
        private var originatorAddressLine2: String? = null
        private var originatorAddressLine3: String? = null
        private var originatorName: String? = null
        private var originatorRoutingNumber: String? = null
        private var originatorToBeneficiaryInformationLine1: String? = null
        private var originatorToBeneficiaryInformationLine2: String? = null
        private var originatorToBeneficiaryInformationLine3: String? = null
        private var originatorToBeneficiaryInformationLine4: String? = null
        private var senderReference: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationInboundWireTransferCreateParams: SimulationInboundWireTransferCreateParams
        ) = apply {
            this.accountNumberId = simulationInboundWireTransferCreateParams.accountNumberId
            this.amount = simulationInboundWireTransferCreateParams.amount
            this.beneficiaryAddressLine1 =
                simulationInboundWireTransferCreateParams.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 =
                simulationInboundWireTransferCreateParams.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 =
                simulationInboundWireTransferCreateParams.beneficiaryAddressLine3
            this.beneficiaryName = simulationInboundWireTransferCreateParams.beneficiaryName
            this.beneficiaryReference =
                simulationInboundWireTransferCreateParams.beneficiaryReference
            this.originatorAddressLine1 =
                simulationInboundWireTransferCreateParams.originatorAddressLine1
            this.originatorAddressLine2 =
                simulationInboundWireTransferCreateParams.originatorAddressLine2
            this.originatorAddressLine3 =
                simulationInboundWireTransferCreateParams.originatorAddressLine3
            this.originatorName = simulationInboundWireTransferCreateParams.originatorName
            this.originatorRoutingNumber =
                simulationInboundWireTransferCreateParams.originatorRoutingNumber
            this.originatorToBeneficiaryInformationLine1 =
                simulationInboundWireTransferCreateParams.originatorToBeneficiaryInformationLine1
            this.originatorToBeneficiaryInformationLine2 =
                simulationInboundWireTransferCreateParams.originatorToBeneficiaryInformationLine2
            this.originatorToBeneficiaryInformationLine3 =
                simulationInboundWireTransferCreateParams.originatorToBeneficiaryInformationLine3
            this.originatorToBeneficiaryInformationLine4 =
                simulationInboundWireTransferCreateParams.originatorToBeneficiaryInformationLine4
            this.senderReference = simulationInboundWireTransferCreateParams.senderReference
            additionalHeaders(simulationInboundWireTransferCreateParams.additionalHeaders)
            additionalQueryParams(simulationInboundWireTransferCreateParams.additionalQueryParams)
            additionalBodyProperties(
                simulationInboundWireTransferCreateParams.additionalBodyProperties
            )
        }

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: String) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: String) = apply {
            this.beneficiaryReference = beneficiaryReference
        }

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(senderReference: String) = apply {
            this.senderReference = senderReference
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

        fun build(): SimulationInboundWireTransferCreateParams =
            SimulationInboundWireTransferCreateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                beneficiaryName,
                beneficiaryReference,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                originatorRoutingNumber,
                originatorToBeneficiaryInformationLine1,
                originatorToBeneficiaryInformationLine2,
                originatorToBeneficiaryInformationLine3,
                originatorToBeneficiaryInformationLine4,
                senderReference,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
