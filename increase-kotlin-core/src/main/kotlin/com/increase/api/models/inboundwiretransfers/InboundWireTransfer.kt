// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** An Inbound Wire Transfer is a wire transfer initiated outside of Increase to your account. */
class InboundWireTransfer
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val beneficiaryAddressLine1: JsonField<String>,
    private val beneficiaryAddressLine2: JsonField<String>,
    private val beneficiaryAddressLine3: JsonField<String>,
    private val beneficiaryName: JsonField<String>,
    private val beneficiaryReference: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val inputMessageAccountabilityData: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val originatorToBeneficiaryInformation: JsonField<String>,
    private val originatorToBeneficiaryInformationLine1: JsonField<String>,
    private val originatorToBeneficiaryInformationLine2: JsonField<String>,
    private val originatorToBeneficiaryInformationLine3: JsonField<String>,
    private val originatorToBeneficiaryInformationLine4: JsonField<String>,
    private val reversal: JsonField<Reversal>,
    private val senderReference: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val wireDrawdownRequestId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        beneficiaryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_reference")
        @ExcludeMissing
        beneficiaryReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        originatorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        originatorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        originatorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name")
        @ExcludeMissing
        originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information")
        @ExcludeMissing
        originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reversal") @ExcludeMissing reversal: JsonField<Reversal> = JsonMissing.of(),
        @JsonProperty("sender_reference")
        @ExcludeMissing
        senderReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("wire_drawdown_request_id")
        @ExcludeMissing
        wireDrawdownRequestId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumberId,
        amount,
        beneficiaryAddressLine1,
        beneficiaryAddressLine2,
        beneficiaryAddressLine3,
        beneficiaryName,
        beneficiaryReference,
        createdAt,
        description,
        inputMessageAccountabilityData,
        originatorAddressLine1,
        originatorAddressLine2,
        originatorAddressLine3,
        originatorName,
        originatorRoutingNumber,
        originatorToBeneficiaryInformation,
        originatorToBeneficiaryInformationLine1,
        originatorToBeneficiaryInformationLine2,
        originatorToBeneficiaryInformationLine3,
        originatorToBeneficiaryInformationLine4,
        reversal,
        senderReference,
        status,
        type,
        wireDrawdownRequestId,
        mutableMapOf(),
    )

    /**
     * The inbound wire transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account to which the transfer belongs.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The identifier of the Account Number to which this transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine1(): String? =
        beneficiaryAddressLine1.getNullable("beneficiary_address_line1")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine2(): String? =
        beneficiaryAddressLine2.getNullable("beneficiary_address_line2")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine3(): String? =
        beneficiaryAddressLine3.getNullable("beneficiary_address_line3")

    /**
     * A name set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryName(): String? = beneficiaryName.getNullable("beneficiary_name")

    /**
     * A free-form reference string set by the sender, to help identify the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryReference(): String? = beneficiaryReference.getNullable("beneficiary_reference")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire transfer was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * An Increase-constructed description of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * A unique identifier available to the originating and receiving banks, commonly abbreviated as
     * IMAD. It is created when the wire is submitted to the Fedwire service and is helpful when
     * debugging wires with the originating bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputMessageAccountabilityData(): String? =
        inputMessageAccountabilityData.getNullable("input_message_accountability_data")

    /**
     * The address of the wire originator, set by the sending bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): String? =
        originatorAddressLine1.getNullable("originator_address_line1")

    /**
     * The address of the wire originator, set by the sending bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): String? =
        originatorAddressLine2.getNullable("originator_address_line2")

    /**
     * The address of the wire originator, set by the sending bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): String? =
        originatorAddressLine3.getNullable("originator_address_line3")

    /**
     * The originator of the wire, set by the sending bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): String? = originatorName.getNullable("originator_name")

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorRoutingNumber(): String? =
        originatorRoutingNumber.getNullable("originator_routing_number")

    /**
     * An Increase-created concatenation of the Originator-to-Beneficiary lines.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformation(): String? =
        originatorToBeneficiaryInformation.getNullable("originator_to_beneficiary_information")

    /**
     * A free-form message set by the wire originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine1(): String? =
        originatorToBeneficiaryInformationLine1.getNullable(
            "originator_to_beneficiary_information_line1"
        )

    /**
     * A free-form message set by the wire originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine2(): String? =
        originatorToBeneficiaryInformationLine2.getNullable(
            "originator_to_beneficiary_information_line2"
        )

    /**
     * A free-form message set by the wire originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine3(): String? =
        originatorToBeneficiaryInformationLine3.getNullable(
            "originator_to_beneficiary_information_line3"
        )

    /**
     * A free-form message set by the wire originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine4(): String? =
        originatorToBeneficiaryInformationLine4.getNullable(
            "originator_to_beneficiary_information_line4"
        )

    /**
     * Information about the reversal of the inbound wire transfer if it has been reversed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reversal(): Reversal? = reversal.getNullable("reversal")

    /**
     * The sending bank's reference number for the wire transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderReference(): String? = senderReference.getNullable("sender_reference")

    /**
     * The status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The wire drawdown request the inbound wire transfer is fulfilling.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireDrawdownRequestId(): String? =
        wireDrawdownRequestId.getNullable("wire_drawdown_request_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine1].
     *
     * Unlike [beneficiaryAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine2].
     *
     * Unlike [beneficiaryAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine3].
     *
     * Unlike [beneficiaryAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

    /**
     * Returns the raw JSON value of [beneficiaryName].
     *
     * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    fun _beneficiaryName(): JsonField<String> = beneficiaryName

    /**
     * Returns the raw JSON value of [beneficiaryReference].
     *
     * Unlike [beneficiaryReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("beneficiary_reference")
    @ExcludeMissing
    fun _beneficiaryReference(): JsonField<String> = beneficiaryReference

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [inputMessageAccountabilityData].
     *
     * Unlike [inputMessageAccountabilityData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("input_message_accountability_data")
    @ExcludeMissing
    fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

    /**
     * Returns the raw JSON value of [originatorAddressLine1].
     *
     * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

    /**
     * Returns the raw JSON value of [originatorAddressLine2].
     *
     * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

    /**
     * Returns the raw JSON value of [originatorAddressLine3].
     *
     * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

    /**
     * Returns the raw JSON value of [originatorName].
     *
     * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originator_name")
    @ExcludeMissing
    fun _originatorName(): JsonField<String> = originatorName

    /**
     * Returns the raw JSON value of [originatorRoutingNumber].
     *
     * Unlike [originatorRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformation].
     *
     * Unlike [originatorToBeneficiaryInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformation(): JsonField<String> =
        originatorToBeneficiaryInformation

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine1].
     *
     * Unlike [originatorToBeneficiaryInformationLine1], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
        originatorToBeneficiaryInformationLine1

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine2].
     *
     * Unlike [originatorToBeneficiaryInformationLine2], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
        originatorToBeneficiaryInformationLine2

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine3].
     *
     * Unlike [originatorToBeneficiaryInformationLine3], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
        originatorToBeneficiaryInformationLine3

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine4].
     *
     * Unlike [originatorToBeneficiaryInformationLine4], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
        originatorToBeneficiaryInformationLine4

    /**
     * Returns the raw JSON value of [reversal].
     *
     * Unlike [reversal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reversal") @ExcludeMissing fun _reversal(): JsonField<Reversal> = reversal

    /**
     * Returns the raw JSON value of [senderReference].
     *
     * Unlike [senderReference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_reference")
    @ExcludeMissing
    fun _senderReference(): JsonField<String> = senderReference

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [wireDrawdownRequestId].
     *
     * Unlike [wireDrawdownRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("wire_drawdown_request_id")
    @ExcludeMissing
    fun _wireDrawdownRequestId(): JsonField<String> = wireDrawdownRequestId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundWireTransfer].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .beneficiaryAddressLine1()
         * .beneficiaryAddressLine2()
         * .beneficiaryAddressLine3()
         * .beneficiaryName()
         * .beneficiaryReference()
         * .createdAt()
         * .description()
         * .inputMessageAccountabilityData()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .originatorRoutingNumber()
         * .originatorToBeneficiaryInformation()
         * .originatorToBeneficiaryInformationLine1()
         * .originatorToBeneficiaryInformationLine2()
         * .originatorToBeneficiaryInformationLine3()
         * .originatorToBeneficiaryInformationLine4()
         * .reversal()
         * .senderReference()
         * .status()
         * .type()
         * .wireDrawdownRequestId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InboundWireTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var beneficiaryAddressLine1: JsonField<String>? = null
        private var beneficiaryAddressLine2: JsonField<String>? = null
        private var beneficiaryAddressLine3: JsonField<String>? = null
        private var beneficiaryName: JsonField<String>? = null
        private var beneficiaryReference: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var inputMessageAccountabilityData: JsonField<String>? = null
        private var originatorAddressLine1: JsonField<String>? = null
        private var originatorAddressLine2: JsonField<String>? = null
        private var originatorAddressLine3: JsonField<String>? = null
        private var originatorName: JsonField<String>? = null
        private var originatorRoutingNumber: JsonField<String>? = null
        private var originatorToBeneficiaryInformation: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine1: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine2: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine3: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine4: JsonField<String>? = null
        private var reversal: JsonField<Reversal>? = null
        private var senderReference: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var wireDrawdownRequestId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundWireTransfer: InboundWireTransfer) = apply {
            id = inboundWireTransfer.id
            accountId = inboundWireTransfer.accountId
            accountNumberId = inboundWireTransfer.accountNumberId
            amount = inboundWireTransfer.amount
            beneficiaryAddressLine1 = inboundWireTransfer.beneficiaryAddressLine1
            beneficiaryAddressLine2 = inboundWireTransfer.beneficiaryAddressLine2
            beneficiaryAddressLine3 = inboundWireTransfer.beneficiaryAddressLine3
            beneficiaryName = inboundWireTransfer.beneficiaryName
            beneficiaryReference = inboundWireTransfer.beneficiaryReference
            createdAt = inboundWireTransfer.createdAt
            description = inboundWireTransfer.description
            inputMessageAccountabilityData = inboundWireTransfer.inputMessageAccountabilityData
            originatorAddressLine1 = inboundWireTransfer.originatorAddressLine1
            originatorAddressLine2 = inboundWireTransfer.originatorAddressLine2
            originatorAddressLine3 = inboundWireTransfer.originatorAddressLine3
            originatorName = inboundWireTransfer.originatorName
            originatorRoutingNumber = inboundWireTransfer.originatorRoutingNumber
            originatorToBeneficiaryInformation =
                inboundWireTransfer.originatorToBeneficiaryInformation
            originatorToBeneficiaryInformationLine1 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine1
            originatorToBeneficiaryInformationLine2 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine2
            originatorToBeneficiaryInformationLine3 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine3
            originatorToBeneficiaryInformationLine4 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine4
            reversal = inboundWireTransfer.reversal
            senderReference = inboundWireTransfer.senderReference
            status = inboundWireTransfer.status
            type = inboundWireTransfer.type
            wireDrawdownRequestId = inboundWireTransfer.wireDrawdownRequestId
            additionalProperties = inboundWireTransfer.additionalProperties.toMutableMap()
        }

        /** The inbound wire transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) =
            beneficiaryAddressLine1(JsonField.ofNullable(beneficiaryAddressLine1))

        /**
         * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) =
            beneficiaryAddressLine2(JsonField.ofNullable(beneficiaryAddressLine2))

        /**
         * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) =
            beneficiaryAddressLine3(JsonField.ofNullable(beneficiaryAddressLine3))

        /**
         * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** A name set by the sender. */
        fun beneficiaryName(beneficiaryName: String?) =
            beneficiaryName(JsonField.ofNullable(beneficiaryName))

        /**
         * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** A free-form reference string set by the sender, to help identify the transfer. */
        fun beneficiaryReference(beneficiaryReference: String?) =
            beneficiaryReference(JsonField.ofNullable(beneficiaryReference))

        /**
         * Sets [Builder.beneficiaryReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
            this.beneficiaryReference = beneficiaryReference
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * wire transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An Increase-constructed description of the transfer. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * A unique identifier available to the originating and receiving banks, commonly
         * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service and
         * is helpful when debugging wires with the originating bank.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: String?) =
            inputMessageAccountabilityData(JsonField.ofNullable(inputMessageAccountabilityData))

        /**
         * Sets [Builder.inputMessageAccountabilityData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputMessageAccountabilityData] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
            apply {
                this.inputMessageAccountabilityData = inputMessageAccountabilityData
            }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine1(originatorAddressLine1: String?) =
            originatorAddressLine1(JsonField.ofNullable(originatorAddressLine1))

        /**
         * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine2(originatorAddressLine2: String?) =
            originatorAddressLine2(JsonField.ofNullable(originatorAddressLine2))

        /**
         * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine3(originatorAddressLine3: String?) =
            originatorAddressLine3(JsonField.ofNullable(originatorAddressLine3))

        /**
         * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator of the wire, set by the sending bank. */
        fun originatorName(originatorName: String?) =
            originatorName(JsonField.ofNullable(originatorName))

        /**
         * Sets [Builder.originatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String?) =
            originatorRoutingNumber(JsonField.ofNullable(originatorRoutingNumber))

        /**
         * Sets [Builder.originatorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
        fun originatorToBeneficiaryInformation(originatorToBeneficiaryInformation: String?) =
            originatorToBeneficiaryInformation(
                JsonField.ofNullable(originatorToBeneficiaryInformation)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun originatorToBeneficiaryInformation(
            originatorToBeneficiaryInformation: JsonField<String>
        ) = apply { this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String?
        ) =
            originatorToBeneficiaryInformationLine1(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine1)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine1] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String?
        ) =
            originatorToBeneficiaryInformationLine2(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine2)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine2] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String?
        ) =
            originatorToBeneficiaryInformationLine3(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine3)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine3] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String?
        ) =
            originatorToBeneficiaryInformationLine4(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine4)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine4] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /** Information about the reversal of the inbound wire transfer if it has been reversed. */
        fun reversal(reversal: Reversal?) = reversal(JsonField.ofNullable(reversal))

        /**
         * Sets [Builder.reversal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversal] with a well-typed [Reversal] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reversal(reversal: JsonField<Reversal>) = apply { this.reversal = reversal }

        /** The sending bank's reference number for the wire transfer. */
        fun senderReference(senderReference: String?) =
            senderReference(JsonField.ofNullable(senderReference))

        /**
         * Sets [Builder.senderReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderReference(senderReference: JsonField<String>) = apply {
            this.senderReference = senderReference
        }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The wire drawdown request the inbound wire transfer is fulfilling. */
        fun wireDrawdownRequestId(wireDrawdownRequestId: String?) =
            wireDrawdownRequestId(JsonField.ofNullable(wireDrawdownRequestId))

        /**
         * Sets [Builder.wireDrawdownRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireDrawdownRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireDrawdownRequestId(wireDrawdownRequestId: JsonField<String>) = apply {
            this.wireDrawdownRequestId = wireDrawdownRequestId
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

        /**
         * Returns an immutable instance of [InboundWireTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .beneficiaryAddressLine1()
         * .beneficiaryAddressLine2()
         * .beneficiaryAddressLine3()
         * .beneficiaryName()
         * .beneficiaryReference()
         * .createdAt()
         * .description()
         * .inputMessageAccountabilityData()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .originatorRoutingNumber()
         * .originatorToBeneficiaryInformation()
         * .originatorToBeneficiaryInformationLine1()
         * .originatorToBeneficiaryInformationLine2()
         * .originatorToBeneficiaryInformationLine3()
         * .originatorToBeneficiaryInformationLine4()
         * .reversal()
         * .senderReference()
         * .status()
         * .type()
         * .wireDrawdownRequestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireTransfer =
            InboundWireTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("beneficiaryAddressLine1", beneficiaryAddressLine1),
                checkRequired("beneficiaryAddressLine2", beneficiaryAddressLine2),
                checkRequired("beneficiaryAddressLine3", beneficiaryAddressLine3),
                checkRequired("beneficiaryName", beneficiaryName),
                checkRequired("beneficiaryReference", beneficiaryReference),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                checkRequired("originatorAddressLine1", originatorAddressLine1),
                checkRequired("originatorAddressLine2", originatorAddressLine2),
                checkRequired("originatorAddressLine3", originatorAddressLine3),
                checkRequired("originatorName", originatorName),
                checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                checkRequired(
                    "originatorToBeneficiaryInformation",
                    originatorToBeneficiaryInformation,
                ),
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
                checkRequired("reversal", reversal),
                checkRequired("senderReference", senderReference),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("wireDrawdownRequestId", wireDrawdownRequestId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundWireTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumberId()
        amount()
        beneficiaryAddressLine1()
        beneficiaryAddressLine2()
        beneficiaryAddressLine3()
        beneficiaryName()
        beneficiaryReference()
        createdAt()
        description()
        inputMessageAccountabilityData()
        originatorAddressLine1()
        originatorAddressLine2()
        originatorAddressLine3()
        originatorName()
        originatorRoutingNumber()
        originatorToBeneficiaryInformation()
        originatorToBeneficiaryInformationLine1()
        originatorToBeneficiaryInformationLine2()
        originatorToBeneficiaryInformationLine3()
        originatorToBeneficiaryInformationLine4()
        reversal()?.validate()
        senderReference()
        status().validate()
        type().validate()
        wireDrawdownRequestId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (accountId.asKnown() == null) 0 else 1) +
            (if (accountNumberId.asKnown() == null) 0 else 1) +
            (if (amount.asKnown() == null) 0 else 1) +
            (if (beneficiaryAddressLine1.asKnown() == null) 0 else 1) +
            (if (beneficiaryAddressLine2.asKnown() == null) 0 else 1) +
            (if (beneficiaryAddressLine3.asKnown() == null) 0 else 1) +
            (if (beneficiaryName.asKnown() == null) 0 else 1) +
            (if (beneficiaryReference.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (inputMessageAccountabilityData.asKnown() == null) 0 else 1) +
            (if (originatorAddressLine1.asKnown() == null) 0 else 1) +
            (if (originatorAddressLine2.asKnown() == null) 0 else 1) +
            (if (originatorAddressLine3.asKnown() == null) 0 else 1) +
            (if (originatorName.asKnown() == null) 0 else 1) +
            (if (originatorRoutingNumber.asKnown() == null) 0 else 1) +
            (if (originatorToBeneficiaryInformation.asKnown() == null) 0 else 1) +
            (if (originatorToBeneficiaryInformationLine1.asKnown() == null) 0 else 1) +
            (if (originatorToBeneficiaryInformationLine2.asKnown() == null) 0 else 1) +
            (if (originatorToBeneficiaryInformationLine3.asKnown() == null) 0 else 1) +
            (if (originatorToBeneficiaryInformationLine4.asKnown() == null) 0 else 1) +
            (reversal.asKnown()?.validity() ?: 0) +
            (if (senderReference.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (wireDrawdownRequestId.asKnown() == null) 0 else 1)

    /** Information about the reversal of the inbound wire transfer if it has been reversed. */
    class Reversal
    private constructor(
        private val reason: JsonField<Reason>,
        private val reversedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("reversed_at")
            @ExcludeMissing
            reversedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(reason, reversedAt, mutableMapOf())

        /**
         * The reason for the reversal.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was reversed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reversedAt(): OffsetDateTime = reversedAt.getRequired("reversed_at")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [reversedAt].
         *
         * Unlike [reversedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reversed_at")
        @ExcludeMissing
        fun _reversedAt(): JsonField<OffsetDateTime> = reversedAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Reversal].
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .reversedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Reversal]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var reversedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reversal: Reversal) = apply {
                reason = reversal.reason
                reversedAt = reversal.reversedAt
                additionalProperties = reversal.additionalProperties.toMutableMap()
            }

            /** The reason for the reversal. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was reversed.
             */
            fun reversedAt(reversedAt: OffsetDateTime) = reversedAt(JsonField.of(reversedAt))

            /**
             * Sets [Builder.reversedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reversedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reversedAt(reversedAt: JsonField<OffsetDateTime>) = apply {
                this.reversedAt = reversedAt
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

            /**
             * Returns an immutable instance of [Reversal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .reversedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Reversal =
                Reversal(
                    checkRequired("reason", reason),
                    checkRequired("reversedAt", reversedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Reversal = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            reversedAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (reason.asKnown()?.validity() ?: 0) + (if (reversedAt.asKnown() == null) 0 else 1)

        /** The reason for the reversal. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The inbound wire transfer was a duplicate. */
                val DUPLICATE = of("duplicate")

                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                val CREDITOR_REQUEST = of("creditor_request")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The inbound wire transfer was a duplicate. */
                DUPLICATE,
                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                CREDITOR_REQUEST,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The inbound wire transfer was a duplicate. */
                DUPLICATE,
                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                CREDITOR_REQUEST,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DUPLICATE -> Value.DUPLICATE
                    CREDITOR_REQUEST -> Value.CREDITOR_REQUEST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DUPLICATE -> Known.DUPLICATE
                    CREDITOR_REQUEST -> Known.CREDITOR_REQUEST
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Reason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reversal &&
                reason == other.reason &&
                reversedAt == other.reversedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, reversedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reversal{reason=$reason, reversedAt=$reversedAt, additionalProperties=$additionalProperties}"
    }

    /** The status of the transfer. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            val PENDING = of("pending")

            /** The Inbound Wire Transfer is accepted. */
            val ACCEPTED = of("accepted")

            /** The Inbound Wire Transfer was declined. */
            val DECLINED = of("declined")

            /** The Inbound Wire Transfer was reversed. */
            val REVERSED = of("reversed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound Wire Transfer is accepted. */
            ACCEPTED,
            /** The Inbound Wire Transfer was declined. */
            DECLINED,
            /** The Inbound Wire Transfer was reversed. */
            REVERSED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound Wire Transfer is accepted. */
            ACCEPTED,
            /** The Inbound Wire Transfer was declined. */
            DECLINED,
            /** The Inbound Wire Transfer was reversed. */
            REVERSED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
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
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
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

            val INBOUND_WIRE_TRANSFER = of("inbound_wire_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_WIRE_TRANSFER
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
            INBOUND_WIRE_TRANSFER,
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
                INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
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
                INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireTransfer &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            amount == other.amount &&
            beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
            beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
            beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
            beneficiaryName == other.beneficiaryName &&
            beneficiaryReference == other.beneficiaryReference &&
            createdAt == other.createdAt &&
            description == other.description &&
            inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
            originatorAddressLine1 == other.originatorAddressLine1 &&
            originatorAddressLine2 == other.originatorAddressLine2 &&
            originatorAddressLine3 == other.originatorAddressLine3 &&
            originatorName == other.originatorName &&
            originatorRoutingNumber == other.originatorRoutingNumber &&
            originatorToBeneficiaryInformation == other.originatorToBeneficiaryInformation &&
            originatorToBeneficiaryInformationLine1 ==
                other.originatorToBeneficiaryInformationLine1 &&
            originatorToBeneficiaryInformationLine2 ==
                other.originatorToBeneficiaryInformationLine2 &&
            originatorToBeneficiaryInformationLine3 ==
                other.originatorToBeneficiaryInformationLine3 &&
            originatorToBeneficiaryInformationLine4 ==
                other.originatorToBeneficiaryInformationLine4 &&
            reversal == other.reversal &&
            senderReference == other.senderReference &&
            status == other.status &&
            type == other.type &&
            wireDrawdownRequestId == other.wireDrawdownRequestId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            accountNumberId,
            amount,
            beneficiaryAddressLine1,
            beneficiaryAddressLine2,
            beneficiaryAddressLine3,
            beneficiaryName,
            beneficiaryReference,
            createdAt,
            description,
            inputMessageAccountabilityData,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            originatorRoutingNumber,
            originatorToBeneficiaryInformation,
            originatorToBeneficiaryInformationLine1,
            originatorToBeneficiaryInformationLine2,
            originatorToBeneficiaryInformationLine3,
            originatorToBeneficiaryInformationLine4,
            reversal,
            senderReference,
            status,
            type,
            wireDrawdownRequestId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireTransfer{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, createdAt=$createdAt, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, reversal=$reversal, senderReference=$senderReference, status=$status, type=$type, wireDrawdownRequestId=$wireDrawdownRequestId, additionalProperties=$additionalProperties}"
}
