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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Inbound wire drawdown requests are requests from someone else to send them a wire. This feature
 * is in beta; reach out to [support@increase.com](mailto:support@increase.com) to learn more.
 */
@NoAutoDetect
class InboundWireDrawdownRequest
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("beneficiary_account_number")
    @ExcludeMissing
    private val beneficiaryAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    private val beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    private val beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    private val beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    private val beneficiaryName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_routing_number")
    @ExcludeMissing
    private val beneficiaryRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    private val messageToRecipient: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_account_number")
    @ExcludeMissing
    private val originatorAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    private val originatorAddressLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    private val originatorAddressLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    private val originatorAddressLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_name")
    @ExcludeMissing
    private val originatorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of(),
    @JsonProperty("recipient_account_number_id")
    @ExcludeMissing
    private val recipientAccountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Wire drawdown request identifier. */
    fun id(): String = id.getRequired("id")

    /** The amount being requested in cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The drawdown request's beneficiary's account number. */
    fun beneficiaryAccountNumber(): String =
        beneficiaryAccountNumber.getRequired("beneficiary_account_number")

    /** Line 1 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine1(): String? =
        beneficiaryAddressLine1.getNullable("beneficiary_address_line1")

    /** Line 2 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine2(): String? =
        beneficiaryAddressLine2.getNullable("beneficiary_address_line2")

    /** Line 3 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine3(): String? =
        beneficiaryAddressLine3.getNullable("beneficiary_address_line3")

    /** The drawdown request's beneficiary's name. */
    fun beneficiaryName(): String? = beneficiaryName.getNullable("beneficiary_name")

    /** The drawdown request's beneficiary's routing number. */
    fun beneficiaryRoutingNumber(): String =
        beneficiaryRoutingNumber.getRequired("beneficiary_routing_number")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire drawdown requested was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    fun currency(): String = currency.getRequired("currency")

    /** A message from the drawdown request's originator. */
    fun messageToRecipient(): String? = messageToRecipient.getNullable("message_to_recipient")

    /** The drawdown request's originator's account number. */
    fun originatorAccountNumber(): String =
        originatorAccountNumber.getRequired("originator_account_number")

    /** Line 1 of the drawdown request's originator's address. */
    fun originatorAddressLine1(): String? =
        originatorAddressLine1.getNullable("originator_address_line1")

    /** Line 2 of the drawdown request's originator's address. */
    fun originatorAddressLine2(): String? =
        originatorAddressLine2.getNullable("originator_address_line2")

    /** Line 3 of the drawdown request's originator's address. */
    fun originatorAddressLine3(): String? =
        originatorAddressLine3.getNullable("originator_address_line3")

    /** The drawdown request's originator's name. */
    fun originatorName(): String? = originatorName.getNullable("originator_name")

    /** The drawdown request's originator's routing number. */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /** Line 1 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine1(): String? =
        originatorToBeneficiaryInformationLine1.getNullable(
            "originator_to_beneficiary_information_line1"
        )

    /** Line 2 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine2(): String? =
        originatorToBeneficiaryInformationLine2.getNullable(
            "originator_to_beneficiary_information_line2"
        )

    /** Line 3 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine3(): String? =
        originatorToBeneficiaryInformationLine3.getNullable(
            "originator_to_beneficiary_information_line3"
        )

    /** Line 4 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine4(): String? =
        originatorToBeneficiaryInformationLine4.getNullable(
            "originator_to_beneficiary_information_line4"
        )

    /**
     * The Account Number from which the recipient of this request is being requested to send funds.
     */
    fun recipientAccountNumberId(): String =
        recipientAccountNumberId.getRequired("recipient_account_number_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Wire drawdown request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The amount being requested in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The drawdown request's beneficiary's account number. */
    @JsonProperty("beneficiary_account_number")
    @ExcludeMissing
    fun _beneficiaryAccountNumber(): JsonField<String> = beneficiaryAccountNumber

    /** Line 1 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

    /** Line 2 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

    /** Line 3 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

    /** The drawdown request's beneficiary's name. */
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    fun _beneficiaryName(): JsonField<String> = beneficiaryName

    /** The drawdown request's beneficiary's routing number. */
    @JsonProperty("beneficiary_routing_number")
    @ExcludeMissing
    fun _beneficiaryRoutingNumber(): JsonField<String> = beneficiaryRoutingNumber

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire drawdown requested was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** A message from the drawdown request's originator. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient(): JsonField<String> = messageToRecipient

    /** The drawdown request's originator's account number. */
    @JsonProperty("originator_account_number")
    @ExcludeMissing
    fun _originatorAccountNumber(): JsonField<String> = originatorAccountNumber

    /** Line 1 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

    /** Line 2 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

    /** Line 3 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

    /** The drawdown request's originator's name. */
    @JsonProperty("originator_name")
    @ExcludeMissing
    fun _originatorName(): JsonField<String> = originatorName

    /** The drawdown request's originator's routing number. */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

    /** Line 1 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
        originatorToBeneficiaryInformationLine1

    /** Line 2 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
        originatorToBeneficiaryInformationLine2

    /** Line 3 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
        originatorToBeneficiaryInformationLine3

    /** Line 4 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
        originatorToBeneficiaryInformationLine4

    /**
     * The Account Number from which the recipient of this request is being requested to send funds.
     */
    @JsonProperty("recipient_account_number_id")
    @ExcludeMissing
    fun _recipientAccountNumberId(): JsonField<String> = recipientAccountNumberId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundWireDrawdownRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        beneficiaryAccountNumber()
        beneficiaryAddressLine1()
        beneficiaryAddressLine2()
        beneficiaryAddressLine3()
        beneficiaryName()
        beneficiaryRoutingNumber()
        createdAt()
        currency()
        messageToRecipient()
        originatorAccountNumber()
        originatorAddressLine1()
        originatorAddressLine2()
        originatorAddressLine3()
        originatorName()
        originatorRoutingNumber()
        originatorToBeneficiaryInformationLine1()
        originatorToBeneficiaryInformationLine2()
        originatorToBeneficiaryInformationLine3()
        originatorToBeneficiaryInformationLine4()
        recipientAccountNumberId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InboundWireDrawdownRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var beneficiaryAccountNumber: JsonField<String>? = null
        private var beneficiaryAddressLine1: JsonField<String>? = null
        private var beneficiaryAddressLine2: JsonField<String>? = null
        private var beneficiaryAddressLine3: JsonField<String>? = null
        private var beneficiaryName: JsonField<String>? = null
        private var beneficiaryRoutingNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var messageToRecipient: JsonField<String>? = null
        private var originatorAccountNumber: JsonField<String>? = null
        private var originatorAddressLine1: JsonField<String>? = null
        private var originatorAddressLine2: JsonField<String>? = null
        private var originatorAddressLine3: JsonField<String>? = null
        private var originatorName: JsonField<String>? = null
        private var originatorRoutingNumber: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine1: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine2: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine3: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine4: JsonField<String>? = null
        private var recipientAccountNumberId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundWireDrawdownRequest: InboundWireDrawdownRequest) = apply {
            id = inboundWireDrawdownRequest.id
            amount = inboundWireDrawdownRequest.amount
            beneficiaryAccountNumber = inboundWireDrawdownRequest.beneficiaryAccountNumber
            beneficiaryAddressLine1 = inboundWireDrawdownRequest.beneficiaryAddressLine1
            beneficiaryAddressLine2 = inboundWireDrawdownRequest.beneficiaryAddressLine2
            beneficiaryAddressLine3 = inboundWireDrawdownRequest.beneficiaryAddressLine3
            beneficiaryName = inboundWireDrawdownRequest.beneficiaryName
            beneficiaryRoutingNumber = inboundWireDrawdownRequest.beneficiaryRoutingNumber
            createdAt = inboundWireDrawdownRequest.createdAt
            currency = inboundWireDrawdownRequest.currency
            messageToRecipient = inboundWireDrawdownRequest.messageToRecipient
            originatorAccountNumber = inboundWireDrawdownRequest.originatorAccountNumber
            originatorAddressLine1 = inboundWireDrawdownRequest.originatorAddressLine1
            originatorAddressLine2 = inboundWireDrawdownRequest.originatorAddressLine2
            originatorAddressLine3 = inboundWireDrawdownRequest.originatorAddressLine3
            originatorName = inboundWireDrawdownRequest.originatorName
            originatorRoutingNumber = inboundWireDrawdownRequest.originatorRoutingNumber
            originatorToBeneficiaryInformationLine1 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1
            originatorToBeneficiaryInformationLine2 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2
            originatorToBeneficiaryInformationLine3 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3
            originatorToBeneficiaryInformationLine4 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4
            recipientAccountNumberId = inboundWireDrawdownRequest.recipientAccountNumberId
            type = inboundWireDrawdownRequest.type
            additionalProperties = inboundWireDrawdownRequest.additionalProperties.toMutableMap()
        }

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Wire drawdown request identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount being requested in cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) =
            beneficiaryAccountNumber(JsonField.of(beneficiaryAccountNumber))

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: JsonField<String>) = apply {
            this.beneficiaryAccountNumber = beneficiaryAccountNumber
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) =
            beneficiaryAddressLine1(JsonField.ofNullable(beneficiaryAddressLine1))

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) =
            beneficiaryAddressLine2(JsonField.ofNullable(beneficiaryAddressLine2))

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) =
            beneficiaryAddressLine3(JsonField.ofNullable(beneficiaryAddressLine3))

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String?) =
            beneficiaryName(JsonField.ofNullable(beneficiaryName))

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) =
            beneficiaryRoutingNumber(JsonField.of(beneficiaryRoutingNumber))

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: JsonField<String>) = apply {
            this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * wire drawdown requested was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * wire drawdown requested was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String?) =
            messageToRecipient(JsonField.ofNullable(messageToRecipient))

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: String) =
            originatorAccountNumber(JsonField.of(originatorAccountNumber))

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: JsonField<String>) = apply {
            this.originatorAccountNumber = originatorAccountNumber
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String?) =
            originatorAddressLine1(JsonField.ofNullable(originatorAddressLine1))

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String?) =
            originatorAddressLine2(JsonField.ofNullable(originatorAddressLine2))

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String?) =
            originatorAddressLine3(JsonField.ofNullable(originatorAddressLine3))

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String?) =
            originatorName(JsonField.ofNullable(originatorName))

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String?
        ) =
            originatorToBeneficiaryInformationLine1(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine1)
            )

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String?
        ) =
            originatorToBeneficiaryInformationLine2(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine2)
            )

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String?
        ) =
            originatorToBeneficiaryInformationLine3(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine3)
            )

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String?
        ) =
            originatorToBeneficiaryInformationLine4(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine4)
            )

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /**
         * The Account Number from which the recipient of this request is being requested to send
         * funds.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) =
            recipientAccountNumberId(JsonField.of(recipientAccountNumberId))

        /**
         * The Account Number from which the recipient of this request is being requested to send
         * funds.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
            this.recipientAccountNumberId = recipientAccountNumberId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_drawdown_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_drawdown_request`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): InboundWireDrawdownRequest =
            InboundWireDrawdownRequest(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("beneficiaryAccountNumber", beneficiaryAccountNumber),
                checkRequired("beneficiaryAddressLine1", beneficiaryAddressLine1),
                checkRequired("beneficiaryAddressLine2", beneficiaryAddressLine2),
                checkRequired("beneficiaryAddressLine3", beneficiaryAddressLine3),
                checkRequired("beneficiaryName", beneficiaryName),
                checkRequired("beneficiaryRoutingNumber", beneficiaryRoutingNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("messageToRecipient", messageToRecipient),
                checkRequired("originatorAccountNumber", originatorAccountNumber),
                checkRequired("originatorAddressLine1", originatorAddressLine1),
                checkRequired("originatorAddressLine2", originatorAddressLine2),
                checkRequired("originatorAddressLine3", originatorAddressLine3),
                checkRequired("originatorName", originatorName),
                checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                checkRequired(
                    "originatorToBeneficiaryInformationLine1",
                    originatorToBeneficiaryInformationLine1,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine2",
                    originatorToBeneficiaryInformationLine2,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine3",
                    originatorToBeneficiaryInformationLine3,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine4",
                    originatorToBeneficiaryInformationLine4,
                ),
                checkRequired("recipientAccountNumberId", recipientAccountNumberId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val INBOUND_WIRE_DRAWDOWN_REQUEST = of("inbound_wire_drawdown_request")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_WIRE_DRAWDOWN_REQUEST
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_WIRE_DRAWDOWN_REQUEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST
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
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequest && id == other.id && amount == other.amount && beneficiaryAccountNumber == other.beneficiaryAccountNumber && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && createdAt == other.createdAt && currency == other.currency && messageToRecipient == other.messageToRecipient && originatorAccountNumber == other.originatorAccountNumber && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorRoutingNumber == other.originatorRoutingNumber && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && recipientAccountNumberId == other.recipientAccountNumberId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, beneficiaryAccountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryRoutingNumber, createdAt, currency, messageToRecipient, originatorAccountNumber, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, recipientAccountNumberId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireDrawdownRequest{id=$id, amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, createdAt=$createdAt, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, recipientAccountNumberId=$recipientAccountNumberId, type=$type, additionalProperties=$additionalProperties}"
}
