// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

class RealTimePaymentsTransferCreateParams
constructor(
    private val amount: Long,
    private val creditorName: String,
    private val remittanceInformation: String,
    private val sourceAccountNumberId: String,
    private val debtorName: String?,
    private val destinationAccountNumber: String?,
    private val destinationRoutingNumber: String?,
    private val externalAccountId: String?,
    private val requireApproval: Boolean?,
    private val ultimateCreditorName: String?,
    private val ultimateDebtorName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun creditorName(): String = creditorName

    fun remittanceInformation(): String = remittanceInformation

    fun sourceAccountNumberId(): String = sourceAccountNumberId

    fun debtorName(): String? = debtorName

    fun destinationAccountNumber(): String? = destinationAccountNumber

    fun destinationRoutingNumber(): String? = destinationRoutingNumber

    fun externalAccountId(): String? = externalAccountId

    fun requireApproval(): Boolean? = requireApproval

    fun ultimateCreditorName(): String? = ultimateCreditorName

    fun ultimateDebtorName(): String? = ultimateDebtorName

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): RealTimePaymentsTransferCreateBody {
        return RealTimePaymentsTransferCreateBody(
            amount,
            creditorName,
            remittanceInformation,
            sourceAccountNumberId,
            debtorName,
            destinationAccountNumber,
            destinationRoutingNumber,
            externalAccountId,
            requireApproval,
            ultimateCreditorName,
            ultimateDebtorName,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class RealTimePaymentsTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("creditor_name") private val creditorName: String,
        @JsonProperty("remittance_information") private val remittanceInformation: String,
        @JsonProperty("source_account_number_id") private val sourceAccountNumberId: String,
        @JsonProperty("debtor_name") private val debtorName: String?,
        @JsonProperty("destination_account_number") private val destinationAccountNumber: String?,
        @JsonProperty("destination_routing_number") private val destinationRoutingNumber: String?,
        @JsonProperty("external_account_id") private val externalAccountId: String?,
        @JsonProperty("require_approval") private val requireApproval: Boolean?,
        @JsonProperty("ultimate_creditor_name") private val ultimateCreditorName: String?,
        @JsonProperty("ultimate_debtor_name") private val ultimateDebtorName: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The name of the transfer's recipient. */
        @JsonProperty("creditor_name") fun creditorName(): String = creditorName

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String = remittanceInformation

        /** The identifier of the Account Number from which to send the transfer. */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): String = sourceAccountNumberId

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        @JsonProperty("debtor_name") fun debtorName(): String? = debtorName

        /** The destination account number. */
        @JsonProperty("destination_account_number")
        fun destinationAccountNumber(): String? = destinationAccountNumber

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("destination_routing_number")
        fun destinationRoutingNumber(): String? = destinationRoutingNumber

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        @JsonProperty("external_account_id") fun externalAccountId(): String? = externalAccountId

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        @JsonProperty("ultimate_creditor_name")
        fun ultimateCreditorName(): String? = ultimateCreditorName

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        @JsonProperty("ultimate_debtor_name") fun ultimateDebtorName(): String? = ultimateDebtorName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var creditorName: String? = null
            private var remittanceInformation: String? = null
            private var sourceAccountNumberId: String? = null
            private var debtorName: String? = null
            private var destinationAccountNumber: String? = null
            private var destinationRoutingNumber: String? = null
            private var externalAccountId: String? = null
            private var requireApproval: Boolean? = null
            private var ultimateCreditorName: String? = null
            private var ultimateDebtorName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                realTimePaymentsTransferCreateBody: RealTimePaymentsTransferCreateBody
            ) = apply {
                amount = realTimePaymentsTransferCreateBody.amount
                creditorName = realTimePaymentsTransferCreateBody.creditorName
                remittanceInformation = realTimePaymentsTransferCreateBody.remittanceInformation
                sourceAccountNumberId = realTimePaymentsTransferCreateBody.sourceAccountNumberId
                debtorName = realTimePaymentsTransferCreateBody.debtorName
                destinationAccountNumber =
                    realTimePaymentsTransferCreateBody.destinationAccountNumber
                destinationRoutingNumber =
                    realTimePaymentsTransferCreateBody.destinationRoutingNumber
                externalAccountId = realTimePaymentsTransferCreateBody.externalAccountId
                requireApproval = realTimePaymentsTransferCreateBody.requireApproval
                ultimateCreditorName = realTimePaymentsTransferCreateBody.ultimateCreditorName
                ultimateDebtorName = realTimePaymentsTransferCreateBody.ultimateDebtorName
                additionalProperties =
                    realTimePaymentsTransferCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /** The name of the transfer's recipient. */
            fun creditorName(creditorName: String) = apply { this.creditorName = creditorName }

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of the Account Number from which to send the transfer. */
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /**
             * The name of the transfer's sender. If not provided, defaults to the name of the
             * account's entity.
             */
            fun debtorName(debtorName: String?) = apply { this.debtorName = debtorName }

            /** The destination account number. */
            fun destinationAccountNumber(destinationAccountNumber: String?) = apply {
                this.destinationAccountNumber = destinationAccountNumber
            }

            /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun destinationRoutingNumber(destinationRoutingNumber: String?) = apply {
                this.destinationRoutingNumber = destinationRoutingNumber
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `destination_account_number` and `destination_routing_number` must be
             * absent.
             */
            fun externalAccountId(externalAccountId: String?) = apply {
                this.externalAccountId = externalAccountId
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean?) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The name of the ultimate recipient of the transfer. Set this if the creditor is an
             * intermediary receiving the payment for someone else.
             */
            fun ultimateCreditorName(ultimateCreditorName: String?) = apply {
                this.ultimateCreditorName = ultimateCreditorName
            }

            /**
             * The name of the ultimate sender of the transfer. Set this if the funds are being sent
             * on behalf of someone who is not the account holder at Increase.
             */
            fun ultimateDebtorName(ultimateDebtorName: String?) = apply {
                this.ultimateDebtorName = ultimateDebtorName
            }

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

            fun build(): RealTimePaymentsTransferCreateBody =
                RealTimePaymentsTransferCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                    checkNotNull(remittanceInformation) {
                        "`remittanceInformation` is required but was not set"
                    },
                    checkNotNull(sourceAccountNumberId) {
                        "`sourceAccountNumberId` is required but was not set"
                    },
                    debtorName,
                    destinationAccountNumber,
                    destinationRoutingNumber,
                    externalAccountId,
                    requireApproval,
                    ultimateCreditorName,
                    ultimateDebtorName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimePaymentsTransferCreateBody && amount == other.amount && creditorName == other.creditorName && remittanceInformation == other.remittanceInformation && sourceAccountNumberId == other.sourceAccountNumberId && debtorName == other.debtorName && destinationAccountNumber == other.destinationAccountNumber && destinationRoutingNumber == other.destinationRoutingNumber && externalAccountId == other.externalAccountId && requireApproval == other.requireApproval && ultimateCreditorName == other.ultimateCreditorName && ultimateDebtorName == other.ultimateDebtorName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditorName, remittanceInformation, sourceAccountNumberId, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, requireApproval, ultimateCreditorName, ultimateDebtorName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealTimePaymentsTransferCreateBody{amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, requireApproval=$requireApproval, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var creditorName: String? = null
        private var remittanceInformation: String? = null
        private var sourceAccountNumberId: String? = null
        private var debtorName: String? = null
        private var destinationAccountNumber: String? = null
        private var destinationRoutingNumber: String? = null
        private var externalAccountId: String? = null
        private var requireApproval: Boolean? = null
        private var ultimateCreditorName: String? = null
        private var ultimateDebtorName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            realTimePaymentsTransferCreateParams: RealTimePaymentsTransferCreateParams
        ) = apply {
            amount = realTimePaymentsTransferCreateParams.amount
            creditorName = realTimePaymentsTransferCreateParams.creditorName
            remittanceInformation = realTimePaymentsTransferCreateParams.remittanceInformation
            sourceAccountNumberId = realTimePaymentsTransferCreateParams.sourceAccountNumberId
            debtorName = realTimePaymentsTransferCreateParams.debtorName
            destinationAccountNumber = realTimePaymentsTransferCreateParams.destinationAccountNumber
            destinationRoutingNumber = realTimePaymentsTransferCreateParams.destinationRoutingNumber
            externalAccountId = realTimePaymentsTransferCreateParams.externalAccountId
            requireApproval = realTimePaymentsTransferCreateParams.requireApproval
            ultimateCreditorName = realTimePaymentsTransferCreateParams.ultimateCreditorName
            ultimateDebtorName = realTimePaymentsTransferCreateParams.ultimateDebtorName
            additionalHeaders = realTimePaymentsTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsTransferCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                realTimePaymentsTransferCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The name of the transfer's recipient. */
        fun creditorName(creditorName: String) = apply { this.creditorName = creditorName }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String) = apply { this.debtorName = debtorName }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) = apply {
            this.destinationAccountNumber = destinationAccountNumber
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) = apply {
            this.destinationRoutingNumber = destinationRoutingNumber
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: String) = apply {
            this.ultimateCreditorName = ultimateCreditorName
        }

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: String) = apply {
            this.ultimateDebtorName = ultimateDebtorName
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

        fun build(): RealTimePaymentsTransferCreateParams =
            RealTimePaymentsTransferCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                checkNotNull(remittanceInformation) {
                    "`remittanceInformation` is required but was not set"
                },
                checkNotNull(sourceAccountNumberId) {
                    "`sourceAccountNumberId` is required but was not set"
                },
                debtorName,
                destinationAccountNumber,
                destinationRoutingNumber,
                externalAccountId,
                requireApproval,
                ultimateCreditorName,
                ultimateDebtorName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferCreateParams && amount == other.amount && creditorName == other.creditorName && remittanceInformation == other.remittanceInformation && sourceAccountNumberId == other.sourceAccountNumberId && debtorName == other.debtorName && destinationAccountNumber == other.destinationAccountNumber && destinationRoutingNumber == other.destinationRoutingNumber && externalAccountId == other.externalAccountId && requireApproval == other.requireApproval && ultimateCreditorName == other.ultimateCreditorName && ultimateDebtorName == other.ultimateDebtorName && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, creditorName, remittanceInformation, sourceAccountNumberId, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, requireApproval, ultimateCreditorName, ultimateDebtorName, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferCreateParams{amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, requireApproval=$requireApproval, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
