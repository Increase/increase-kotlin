// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * An Inbound ACH Transfer is an ACH transfer initiated outside of Increase to your
 * account.
 */
@NoAutoDetect
class InboundAchTransfer @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("acceptance") @ExcludeMissing private val acceptance: JsonField<Acceptance> = JsonMissing.of(),
    @JsonProperty("account_id") @ExcludeMissing private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_id") @ExcludeMissing private val accountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addenda") @ExcludeMissing private val addenda: JsonField<Addenda> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("automatically_resolves_at") @ExcludeMissing private val automaticallyResolvesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("decline") @ExcludeMissing private val decline: JsonField<Decline> = JsonMissing.of(),
    @JsonProperty("direction") @ExcludeMissing private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("effective_date") @ExcludeMissing private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("expected_settlement_schedule") @ExcludeMissing private val expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule> = JsonMissing.of(),
    @JsonProperty("international_addenda") @ExcludeMissing private val internationalAddenda: JsonField<InternationalAddenda> = JsonMissing.of(),
    @JsonProperty("notification_of_change") @ExcludeMissing private val notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of(),
    @JsonProperty("originator_company_descriptive_date") @ExcludeMissing private val originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_company_discretionary_data") @ExcludeMissing private val originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_company_entry_description") @ExcludeMissing private val originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_company_id") @ExcludeMissing private val originatorCompanyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_company_name") @ExcludeMissing private val originatorCompanyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_routing_number") @ExcludeMissing private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiver_id_number") @ExcludeMissing private val receiverIdNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiver_name") @ExcludeMissing private val receiverName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("standard_entry_class_code") @ExcludeMissing private val standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
    @JsonProperty("status") @ExcludeMissing private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trace_number") @ExcludeMissing private val traceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transfer_return") @ExcludeMissing private val transferReturn: JsonField<TransferReturn> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** The inbound ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** If your transfer is accepted, this will contain details of the acceptance. */
    fun acceptance(): Acceptance? = acceptance.getNullable("acceptance")

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** Additional information sent from the originator. */
    fun addenda(): Addenda? = addenda.getNullable("addenda")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The time at which the transfer will be automatically resolved. */
    fun automaticallyResolvesAt(): OffsetDateTime = automaticallyResolvesAt.getRequired("automatically_resolves_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the inbound ACH transfer was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Decline? = decline.getNullable("decline")

    /** The direction of the transfer. */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * The effective date of the transfer. This is sent by the sending bank and is a
     * factor in determining funds availability.
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /** The settlement schedule the transfer is expected to follow. */
    fun expectedSettlementSchedule(): ExpectedSettlementSchedule = expectedSettlementSchedule.getRequired("expected_settlement_schedule")

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    fun internationalAddenda(): InternationalAddenda? = internationalAddenda.getNullable("international_addenda")

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    fun notificationOfChange(): NotificationOfChange? = notificationOfChange.getNullable("notification_of_change")

    /** The descriptive date of the transfer. */
    fun originatorCompanyDescriptiveDate(): String? = originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date")

    /** The additional information included with the transfer. */
    fun originatorCompanyDiscretionaryData(): String? = originatorCompanyDiscretionaryData.getNullable("originator_company_discretionary_data")

    /** The description of the transfer. */
    fun originatorCompanyEntryDescription(): String = originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /** The id of the company that initiated the transfer. */
    fun originatorCompanyId(): String = originatorCompanyId.getRequired("originator_company_id")

    /** The name of the company that initiated the transfer. */
    fun originatorCompanyName(): String = originatorCompanyName.getRequired("originator_company_name")

    /**
     * The American Banking Association (ABA) routing number of the bank originating
     * the transfer.
     */
    fun originatorRoutingNumber(): String = originatorRoutingNumber.getRequired("originator_routing_number")

    /** The id of the receiver of the transfer. */
    fun receiverIdNumber(): String? = receiverIdNumber.getNullable("receiver_id_number")

    /** The name of the receiver of the transfer. */
    fun receiverName(): String? = receiverName.getNullable("receiver_name")

    /** The Standard Entry Class (SEC) code of the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode = standardEntryClassCode.getRequired("standard_entry_class_code")

    /** The status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * A 15 digit number set by the sending bank and transmitted to the receiving bank.
     * Along with the amount, date, and originating routing number, this can be used to
     * identify the ACH transfer. ACH trace numbers are not unique, but are
     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
     */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /** If your transfer is returned, this will contain details of the return. */
    fun transferReturn(): TransferReturn? = transferReturn.getNullable("transfer_return")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The inbound ACH transfer's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance(): JsonField<Acceptance> = acceptance

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /** Additional information sent from the originator. */
    @JsonProperty("addenda")
    @ExcludeMissing
    fun _addenda(): JsonField<Addenda> = addenda

    /** The transfer amount in USD cents. */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    /** The time at which the transfer will be automatically resolved. */
    @JsonProperty("automatically_resolves_at")
    @ExcludeMissing
    fun _automaticallyResolvesAt(): JsonField<OffsetDateTime> = automaticallyResolvesAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the inbound ACH transfer was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline")
    @ExcludeMissing
    fun _decline(): JsonField<Decline> = decline

    /** The direction of the transfer. */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<Direction> = direction

    /**
     * The effective date of the transfer. This is sent by the sending bank and is a
     * factor in determining funds availability.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /** The settlement schedule the transfer is expected to follow. */
    @JsonProperty("expected_settlement_schedule")
    @ExcludeMissing
    fun _expectedSettlementSchedule(): JsonField<ExpectedSettlementSchedule> = expectedSettlementSchedule

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    @JsonProperty("international_addenda")
    @ExcludeMissing
    fun _internationalAddenda(): JsonField<InternationalAddenda> = internationalAddenda

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange(): JsonField<NotificationOfChange> = notificationOfChange

    /** The descriptive date of the transfer. */
    @JsonProperty("originator_company_descriptive_date")
    @ExcludeMissing
    fun _originatorCompanyDescriptiveDate(): JsonField<String> = originatorCompanyDescriptiveDate

    /** The additional information included with the transfer. */
    @JsonProperty("originator_company_discretionary_data")
    @ExcludeMissing
    fun _originatorCompanyDiscretionaryData(): JsonField<String> = originatorCompanyDiscretionaryData

    /** The description of the transfer. */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription(): JsonField<String> = originatorCompanyEntryDescription

    /** The id of the company that initiated the transfer. */
    @JsonProperty("originator_company_id")
    @ExcludeMissing
    fun _originatorCompanyId(): JsonField<String> = originatorCompanyId

    /** The name of the company that initiated the transfer. */
    @JsonProperty("originator_company_name")
    @ExcludeMissing
    fun _originatorCompanyName(): JsonField<String> = originatorCompanyName

    /**
     * The American Banking Association (ABA) routing number of the bank originating
     * the transfer.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

    /** The id of the receiver of the transfer. */
    @JsonProperty("receiver_id_number")
    @ExcludeMissing
    fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

    /** The name of the receiver of the transfer. */
    @JsonProperty("receiver_name")
    @ExcludeMissing
    fun _receiverName(): JsonField<String> = receiverName

    /** The Standard Entry Class (SEC) code of the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

    /** The status of the transfer. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * A 15 digit number set by the sending bank and transmitted to the receiving bank.
     * Along with the amount, date, and originating routing number, this can be used to
     * identify the ACH transfer. ACH trace numbers are not unique, but are
     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
     */
    @JsonProperty("trace_number")
    @ExcludeMissing
    fun _traceNumber(): JsonField<String> = traceNumber

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("transfer_return")
    @ExcludeMissing
    fun _transferReturn(): JsonField<TransferReturn> = transferReturn

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundAchTransfer =
        apply {
            if (validated) {
              return@apply
            }

            id()
            acceptance()?.validate()
            accountId()
            accountNumberId()
            addenda()?.validate()
            amount()
            automaticallyResolvesAt()
            createdAt()
            decline()?.validate()
            direction()
            effectiveDate()
            expectedSettlementSchedule()
            internationalAddenda()?.validate()
            notificationOfChange()?.validate()
            originatorCompanyDescriptiveDate()
            originatorCompanyDiscretionaryData()
            originatorCompanyEntryDescription()
            originatorCompanyId()
            originatorCompanyName()
            originatorRoutingNumber()
            receiverIdNumber()
            receiverName()
            standardEntryClassCode()
            status()
            traceNumber()
            transferReturn()?.validate()
            type()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundAchTransfer].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .id()
         * .acceptance()
         * .accountId()
         * .accountNumberId()
         * .addenda()
         * .amount()
         * .automaticallyResolvesAt()
         * .createdAt()
         * .decline()
         * .direction()
         * .effectiveDate()
         * .expectedSettlementSchedule()
         * .internationalAddenda()
         * .notificationOfChange()
         * .originatorCompanyDescriptiveDate()
         * .originatorCompanyDiscretionaryData()
         * .originatorCompanyEntryDescription()
         * .originatorCompanyId()
         * .originatorCompanyName()
         * .originatorRoutingNumber()
         * .receiverIdNumber()
         * .receiverName()
         * .standardEntryClassCode()
         * .status()
         * .traceNumber()
         * .transferReturn()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InboundAchTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var addenda: JsonField<Addenda>? = null
        private var amount: JsonField<Long>? = null
        private var automaticallyResolvesAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var decline: JsonField<Decline>? = null
        private var direction: JsonField<Direction>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>? = null
        private var internationalAddenda: JsonField<InternationalAddenda>? = null
        private var notificationOfChange: JsonField<NotificationOfChange>? = null
        private var originatorCompanyDescriptiveDate: JsonField<String>? = null
        private var originatorCompanyDiscretionaryData: JsonField<String>? = null
        private var originatorCompanyEntryDescription: JsonField<String>? = null
        private var originatorCompanyId: JsonField<String>? = null
        private var originatorCompanyName: JsonField<String>? = null
        private var originatorRoutingNumber: JsonField<String>? = null
        private var receiverIdNumber: JsonField<String>? = null
        private var receiverName: JsonField<String>? = null
        private var standardEntryClassCode: JsonField<StandardEntryClassCode>? = null
        private var status: JsonField<Status>? = null
        private var traceNumber: JsonField<String>? = null
        private var transferReturn: JsonField<TransferReturn>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundAchTransfer: InboundAchTransfer) =
            apply {
                id = inboundAchTransfer.id
                acceptance = inboundAchTransfer.acceptance
                accountId = inboundAchTransfer.accountId
                accountNumberId = inboundAchTransfer.accountNumberId
                addenda = inboundAchTransfer.addenda
                amount = inboundAchTransfer.amount
                automaticallyResolvesAt = inboundAchTransfer.automaticallyResolvesAt
                createdAt = inboundAchTransfer.createdAt
                decline = inboundAchTransfer.decline
                direction = inboundAchTransfer.direction
                effectiveDate = inboundAchTransfer.effectiveDate
                expectedSettlementSchedule = inboundAchTransfer.expectedSettlementSchedule
                internationalAddenda = inboundAchTransfer.internationalAddenda
                notificationOfChange = inboundAchTransfer.notificationOfChange
                originatorCompanyDescriptiveDate = inboundAchTransfer.originatorCompanyDescriptiveDate
                originatorCompanyDiscretionaryData = inboundAchTransfer.originatorCompanyDiscretionaryData
                originatorCompanyEntryDescription = inboundAchTransfer.originatorCompanyEntryDescription
                originatorCompanyId = inboundAchTransfer.originatorCompanyId
                originatorCompanyName = inboundAchTransfer.originatorCompanyName
                originatorRoutingNumber = inboundAchTransfer.originatorRoutingNumber
                receiverIdNumber = inboundAchTransfer.receiverIdNumber
                receiverName = inboundAchTransfer.receiverName
                standardEntryClassCode = inboundAchTransfer.standardEntryClassCode
                status = inboundAchTransfer.status
                traceNumber = inboundAchTransfer.traceNumber
                transferReturn = inboundAchTransfer.transferReturn
                type = inboundAchTransfer.type
                additionalProperties = inboundAchTransfer.additionalProperties.toMutableMap()
            }

        /** The inbound ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound ACH transfer's identifier. */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** If your transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: Acceptance?) = acceptance(JsonField.ofNullable(acceptance))

        /** If your transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: JsonField<Acceptance>) =
            apply {
                this.acceptance = acceptance
            }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: JsonField<String>) =
            apply {
                this.accountId = accountId
            }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) = accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: JsonField<String>) =
            apply {
                this.accountNumberId = accountNumberId
            }

        /** Additional information sent from the originator. */
        fun addenda(addenda: Addenda?) = addenda(JsonField.ofNullable(addenda))

        /** Additional information sent from the originator. */
        fun addenda(addenda: JsonField<Addenda>) =
            apply {
                this.addenda = addenda
            }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        fun amount(amount: JsonField<Long>) =
            apply {
                this.amount = amount
            }

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: OffsetDateTime) = automaticallyResolvesAt(JsonField.of(automaticallyResolvesAt))

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: JsonField<OffsetDateTime>) =
            apply {
                this.automaticallyResolvesAt = automaticallyResolvesAt
            }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the inbound ACH transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the inbound ACH transfer was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: JsonField<Decline>) =
            apply {
                this.decline = decline
            }

        /** The direction of the transfer. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** The direction of the transfer. */
        fun direction(direction: JsonField<Direction>) =
            apply {
                this.direction = direction
            }

        /**
         * The effective date of the transfer. This is sent by the sending bank and is a
         * factor in determining funds availability.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * The effective date of the transfer. This is sent by the sending bank and is a
         * factor in determining funds availability.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) =
            apply {
                this.effectiveDate = effectiveDate
            }

        /** The settlement schedule the transfer is expected to follow. */
        fun expectedSettlementSchedule(expectedSettlementSchedule: ExpectedSettlementSchedule) = expectedSettlementSchedule(JsonField.of(expectedSettlementSchedule))

        /** The settlement schedule the transfer is expected to follow. */
        fun expectedSettlementSchedule(expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>) =
            apply {
                this.expectedSettlementSchedule = expectedSettlementSchedule
            }

        /**
         * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
         * contain fields pertaining to the International ACH Transaction.
         */
        fun internationalAddenda(internationalAddenda: InternationalAddenda?) = internationalAddenda(JsonField.ofNullable(internationalAddenda))

        /**
         * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
         * contain fields pertaining to the International ACH Transaction.
         */
        fun internationalAddenda(internationalAddenda: JsonField<InternationalAddenda>) =
            apply {
                this.internationalAddenda = internationalAddenda
            }

        /**
         * If you initiate a notification of change in response to the transfer, this will
         * contain its details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange?) = notificationOfChange(JsonField.ofNullable(notificationOfChange))

        /**
         * If you initiate a notification of change in response to the transfer, this will
         * contain its details.
         */
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) =
            apply {
                this.notificationOfChange = notificationOfChange
            }

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String?) = originatorCompanyDescriptiveDate(JsonField.ofNullable(originatorCompanyDescriptiveDate))

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: JsonField<String>) =
            apply {
                this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
            }

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String?) = originatorCompanyDiscretionaryData(JsonField.ofNullable(originatorCompanyDiscretionaryData))

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: JsonField<String>) =
            apply {
                this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
            }

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) = originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: JsonField<String>) =
            apply {
                this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
            }

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: String) = originatorCompanyId(JsonField.of(originatorCompanyId))

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: JsonField<String>) =
            apply {
                this.originatorCompanyId = originatorCompanyId
            }

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: String) = originatorCompanyName(JsonField.of(originatorCompanyName))

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: JsonField<String>) =
            apply {
                this.originatorCompanyName = originatorCompanyName
            }

        /**
         * The American Banking Association (ABA) routing number of the bank originating
         * the transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * The American Banking Association (ABA) routing number of the bank originating
         * the transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) =
            apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String?) = receiverIdNumber(JsonField.ofNullable(receiverIdNumber))

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) =
            apply {
                this.receiverIdNumber = receiverIdNumber
            }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String?) = receiverName(JsonField.ofNullable(receiverName))

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: JsonField<String>) =
            apply {
                this.receiverName = receiverName
            }

        /** The Standard Entry Class (SEC) code of the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code of the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transfer. */
        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
            }

        /**
         * A 15 digit number set by the sending bank and transmitted to the receiving bank.
         * Along with the amount, date, and originating routing number, this can be used to
         * identify the ACH transfer. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /**
         * A 15 digit number set by the sending bank and transmitted to the receiving bank.
         * Along with the amount, date, and originating routing number, this can be used to
         * identify the ACH transfer. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        fun traceNumber(traceNumber: JsonField<String>) =
            apply {
                this.traceNumber = traceNumber
            }

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: TransferReturn?) = transferReturn(JsonField.ofNullable(transferReturn))

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: JsonField<TransferReturn>) =
            apply {
                this.transferReturn = transferReturn
            }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
         */
        fun type(type: JsonField<Type>) =
            apply {
                this.type = type
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): InboundAchTransfer =
            InboundAchTransfer(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "acceptance", acceptance
              ),
              checkRequired(
                "accountId", accountId
              ),
              checkRequired(
                "accountNumberId", accountNumberId
              ),
              checkRequired(
                "addenda", addenda
              ),
              checkRequired(
                "amount", amount
              ),
              checkRequired(
                "automaticallyResolvesAt", automaticallyResolvesAt
              ),
              checkRequired(
                "createdAt", createdAt
              ),
              checkRequired(
                "decline", decline
              ),
              checkRequired(
                "direction", direction
              ),
              checkRequired(
                "effectiveDate", effectiveDate
              ),
              checkRequired(
                "expectedSettlementSchedule", expectedSettlementSchedule
              ),
              checkRequired(
                "internationalAddenda", internationalAddenda
              ),
              checkRequired(
                "notificationOfChange", notificationOfChange
              ),
              checkRequired(
                "originatorCompanyDescriptiveDate", originatorCompanyDescriptiveDate
              ),
              checkRequired(
                "originatorCompanyDiscretionaryData", originatorCompanyDiscretionaryData
              ),
              checkRequired(
                "originatorCompanyEntryDescription", originatorCompanyEntryDescription
              ),
              checkRequired(
                "originatorCompanyId", originatorCompanyId
              ),
              checkRequired(
                "originatorCompanyName", originatorCompanyName
              ),
              checkRequired(
                "originatorRoutingNumber", originatorRoutingNumber
              ),
              checkRequired(
                "receiverIdNumber", receiverIdNumber
              ),
              checkRequired(
                "receiverName", receiverName
              ),
              checkRequired(
                "standardEntryClassCode", standardEntryClassCode
              ),
              checkRequired(
                "status", status
              ),
              checkRequired(
                "traceNumber", traceNumber
              ),
              checkRequired(
                "transferReturn", transferReturn
              ),
              checkRequired(
                "type", type
              ),
              additionalProperties.toImmutable(),
            )
    }

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @NoAutoDetect
    class Acceptance @JsonCreator private constructor(
        @JsonProperty("accepted_at") @ExcludeMissing private val acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id") @ExcludeMissing private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The time at which the transfer was accepted. */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /** The id of the transaction for the accepted transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was accepted. */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /** The id of the transaction for the accepted transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acceptance =
            apply {
                if (validated) {
                  return@apply
                }

                acceptedAt()
                transactionId()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Acceptance].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .acceptedAt()
             * .transactionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Acceptance]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(acceptance: Acceptance) =
                apply {
                    acceptedAt = acceptance.acceptedAt
                    transactionId = acceptance.transactionId
                    additionalProperties = acceptance.additionalProperties.toMutableMap()
                }

            /** The time at which the transfer was accepted. */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /** The time at which the transfer was accepted. */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.acceptedAt = acceptedAt
                }

            /** The id of the transaction for the accepted transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the accepted transfer. */
            fun transactionId(transactionId: JsonField<String>) =
                apply {
                    this.transactionId = transactionId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Acceptance =
                Acceptance(
                  checkRequired(
                    "acceptedAt", acceptedAt
                  ),
                  checkRequired(
                    "transactionId", transactionId
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Acceptance && acceptedAt == other.acceptedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acceptedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Acceptance{acceptedAt=$acceptedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /** Additional information sent from the originator. */
    @NoAutoDetect
    class Addenda @JsonCreator private constructor(
        @JsonProperty("category") @ExcludeMissing private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("freeform") @ExcludeMissing private val freeform: JsonField<Freeform> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The type of addendum. */
        fun category(): Category = category.getRequired("category")

        /** Unstructured `payment_related_information` passed through by the originator. */
        fun freeform(): Freeform? = freeform.getNullable("freeform")

        /** The type of addendum. */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<Category> = category

        /** Unstructured `payment_related_information` passed through by the originator. */
        @JsonProperty("freeform")
        @ExcludeMissing
        fun _freeform(): JsonField<Freeform> = freeform

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Addenda =
            apply {
                if (validated) {
                  return@apply
                }

                category()
                freeform()?.validate()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Addenda].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .category()
             * .freeform()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) =
                apply {
                    category = addenda.category
                    freeform = addenda.freeform
                    additionalProperties = addenda.additionalProperties.toMutableMap()
                }

            /** The type of addendum. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of addendum. */
            fun category(category: JsonField<Category>) =
                apply {
                    this.category = category
                }

            /** Unstructured `payment_related_information` passed through by the originator. */
            fun freeform(freeform: Freeform?) = freeform(JsonField.ofNullable(freeform))

            /** Unstructured `payment_related_information` passed through by the originator. */
            fun freeform(freeform: JsonField<Freeform>) =
                apply {
                    this.freeform = freeform
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Addenda =
                Addenda(
                  checkRequired(
                    "category", category
                  ),
                  checkRequired(
                    "freeform", freeform
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        /** The type of addendum. */
        class Category @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /** Unstructured addendum. */
                val FREEFORM = of("freeform")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** Unstructured addendum. */
                FREEFORM,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Unstructured addendum. */
                FREEFORM,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown
                 * value.
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
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Unstructured `payment_related_information` passed through by the originator. */
        @NoAutoDetect
        class Freeform @JsonCreator private constructor(
            @JsonProperty("entries") @ExcludeMissing private val entries: JsonField<List<Entry>> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            /** Each entry represents an addendum received from the originator. */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /** Each entry represents an addendum received from the originator. */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Freeform =
                apply {
                    if (validated) {
                      return@apply
                    }

                    entries().forEach { it.validate() }
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Freeform].
                 *
                 * The following fields are required:
                 *
                 * ```kotlin
                 * .entries()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Freeform]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(freeform: Freeform) =
                    apply {
                        entries = freeform.entries.map { it.toMutableList() }
                        additionalProperties = freeform.additionalProperties.toMutableMap()
                    }

                /** Each entry represents an addendum received from the originator. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /** Each entry represents an addendum received from the originator. */
                fun entries(entries: JsonField<List<Entry>>) =
                    apply {
                        this.entries = entries.map { it.toMutableList() }
                    }

                /** Each entry represents an addendum received from the originator. */
                fun addEntry(entry: Entry) =
                    apply {
                        entries = (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
                        }
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): Freeform =
                    Freeform(
                      checkRequired(
                        "entries", entries
                      ).map { it.toImmutable() }, additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class Entry @JsonCreator private constructor(
                @JsonProperty("payment_related_information") @ExcludeMissing private val paymentRelatedInformation: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

            ) {

                /** The payment related information passed in the addendum. */
                fun paymentRelatedInformation(): String = paymentRelatedInformation.getRequired("payment_related_information")

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Entry =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        paymentRelatedInformation()
                        validated = true
                    }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Entry].
                     *
                     * The following fields are required:
                     *
                     * ```kotlin
                     * .paymentRelatedInformation()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var paymentRelatedInformation: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(entry: Entry) =
                        apply {
                            paymentRelatedInformation = entry.paymentRelatedInformation
                            additionalProperties = entry.additionalProperties.toMutableMap()
                        }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) = paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.clear()
                            putAllAdditionalProperties(additionalProperties)
                        }

                    fun putAdditionalProperty(key: String, value: JsonValue) =
                        apply {
                            additionalProperties.put(key, value)
                        }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) =
                        apply {
                            additionalProperties.remove(key)
                        }

                    fun removeAllAdditionalProperties(keys: Set<String>) =
                        apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                    fun build(): Entry =
                        Entry(
                          checkRequired(
                            "paymentRelatedInformation", paymentRelatedInformation
                          ), additionalProperties.toImmutable()
                        )
                }

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return /* spotless:off */ other is Entry && paymentRelatedInformation == other.paymentRelatedInformation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paymentRelatedInformation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Freeform && entries == other.entries && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Addenda && category == other.category && freeform == other.freeform && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, freeform, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @NoAutoDetect
    class Decline @JsonCreator private constructor(
        @JsonProperty("declined_at") @ExcludeMissing private val declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined_transaction_id") @ExcludeMissing private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String = declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

        /** The reason for the transfer decline. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Decline =
            apply {
                if (validated) {
                  return@apply
                }

                declinedAt()
                declinedTransactionId()
                reason()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Decline].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .declinedAt()
             * .declinedTransactionId()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Decline]. */
        class Builder internal constructor() {

            private var declinedAt: JsonField<OffsetDateTime>? = null
            private var declinedTransactionId: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decline: Decline) =
                apply {
                    declinedAt = decline.declinedAt
                    declinedTransactionId = decline.declinedTransactionId
                    reason = decline.reason
                    additionalProperties = decline.additionalProperties.toMutableMap()
                }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.declinedAt = declinedAt
                }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) = declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) =
                apply {
                    this.declinedTransactionId = declinedTransactionId
                }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            fun reason(reason: JsonField<Reason>) =
                apply {
                    this.reason = reason
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Decline =
                Decline(
                  checkRequired(
                    "declinedAt", declinedAt
                  ),
                  checkRequired(
                    "declinedTransactionId", declinedTransactionId
                  ),
                  checkRequired(
                    "reason", reason
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        /** The reason for the transfer decline. */
        class Reason @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /** The account number is canceled. */
                val ACH_ROUTE_CANCELED = of("ach_route_canceled")

                /** The account number is disabled. */
                val ACH_ROUTE_DISABLED = of("ach_route_disabled")

                /** The transaction would cause an Increase limit to be exceeded. */
                val BREACHES_LIMIT = of("breaches_limit")

                /** The account's entity is not active. */
                val ENTITY_NOT_ACTIVE = of("entity_not_active")

                /** Your account is inactive. */
                val GROUP_LOCKED = of("group_locked")

                /** The transaction is not allowed per Increase's terms. */
                val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

                /** Your integration declined this transfer via the API. */
                val USER_INITIATED = of("user_initiated")

                /** Your account contains insufficient funds. */
                val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request.
                 */
                val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /** The customer no longer authorizes this transaction. */
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /** The customer asked for the payment to be stopped. */
                val PAYMENT_STOPPED = of("payment_stopped")

                /** The customer advises that the debit was unauthorized. */
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** The payee is deceased. */
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY = of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /** The account holder is deceased. */
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = of("beneficiary_or_account_holder_deceased")

                /** The customer refused a credit entry. */
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /** The account holder identified this transaction as a duplicate. */
                val DUPLICATE_ENTRY = of("duplicate_entry")

                /** The corporate customer no longer authorizes this transaction. */
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = of("corporate_customer_advised_not_authorized")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The account number is canceled. */
                ACH_ROUTE_CANCELED,
                /** The account number is disabled. */
                ACH_ROUTE_DISABLED,
                /** The transaction would cause an Increase limit to be exceeded. */
                BREACHES_LIMIT,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The transaction is not allowed per Increase's terms. */
                TRANSACTION_NOT_ALLOWED,
                /** Your integration declined this transfer via the API. */
                USER_INITIATED,
                /** Your account contains insufficient funds. */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /** The customer no longer authorizes this transaction. */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** The customer asked for the payment to be stopped. */
                PAYMENT_STOPPED,
                /** The customer advises that the debit was unauthorized. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /** The customer refused a credit entry. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /** The account holder identified this transaction as a duplicate. */
                DUPLICATE_ENTRY,
                /** The corporate customer no longer authorizes this transaction. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The account number is canceled. */
                ACH_ROUTE_CANCELED,
                /** The account number is disabled. */
                ACH_ROUTE_DISABLED,
                /** The transaction would cause an Increase limit to be exceeded. */
                BREACHES_LIMIT,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The transaction is not allowed per Increase's terms. */
                TRANSACTION_NOT_ALLOWED,
                /** Your integration declined this transfer via the API. */
                USER_INITIATED,
                /** Your account contains insufficient funds. */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /** The customer no longer authorizes this transaction. */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** The customer asked for the payment to be stopped. */
                PAYMENT_STOPPED,
                /** The customer advises that the debit was unauthorized. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /** The customer refused a credit entry. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /** The account holder identified this transaction as a duplicate. */
                DUPLICATE_ENTRY,
                /** The corporate customer no longer authorizes this transaction. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                    ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Value.BREACHES_LIMIT
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Value.USER_INITIATED
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Known.BREACHES_LIMIT
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Known.USER_INITIATED
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Decline && declinedAt == other.declinedAt && declinedTransactionId == other.declinedTransactionId && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(declinedAt, declinedTransactionId, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The direction of the transfer. */
    class Direction @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** Credit */
            val CREDIT = of("credit")

            /** Debit */
            val DEBIT = of("debit")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            /** Credit */
            CREDIT,
            /** Debit */
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Credit */
            CREDIT,
            /** Debit */
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown
             * value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The settlement schedule the transfer is expected to follow. */
    class ExpectedSettlementSchedule @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** The transfer is expected to settle same-day. */
            val SAME_DAY = of("same_day")

            /** The transfer is expected to settle on a future date. */
            val FUTURE_DATED = of("future_dated")

            fun of(value: String) = ExpectedSettlementSchedule(JsonField.of(value))
        }

        /** An enum containing [ExpectedSettlementSchedule]'s known values. */
        enum class Known {
            /** The transfer is expected to settle same-day. */
            SAME_DAY,
            /** The transfer is expected to settle on a future date. */
            FUTURE_DATED,
        }

        /**
         * An enum containing [ExpectedSettlementSchedule]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ExpectedSettlementSchedule] can contain an unknown value in a
         * couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The transfer is expected to settle same-day. */
            SAME_DAY,
            /** The transfer is expected to settle on a future date. */
            FUTURE_DATED,
            /**
             * An enum member indicating that [ExpectedSettlementSchedule] was instantiated
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
                SAME_DAY -> Value.SAME_DAY
                FUTURE_DATED -> Value.FUTURE_DATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                SAME_DAY -> Known.SAME_DAY
                FUTURE_DATED -> Known.FUTURE_DATED
                else -> throw IncreaseInvalidDataException("Unknown ExpectedSettlementSchedule: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is ExpectedSettlementSchedule && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    @NoAutoDetect
    class InternationalAddenda @JsonCreator private constructor(
        @JsonProperty("destination_country_code") @ExcludeMissing private val destinationCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination_currency_code") @ExcludeMissing private val destinationCurrencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_indicator") @ExcludeMissing private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_reference") @ExcludeMissing private val foreignExchangeReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_reference_indicator") @ExcludeMissing private val foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator> = JsonMissing.of(),
        @JsonProperty("foreign_payment_amount") @ExcludeMissing private val foreignPaymentAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("foreign_trace_number") @ExcludeMissing private val foreignTraceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("international_transaction_type_code") @ExcludeMissing private val internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode> = JsonMissing.of(),
        @JsonProperty("originating_currency_code") @ExcludeMissing private val originatingCurrencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_depository_financial_institution_branch_country") @ExcludeMissing private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_depository_financial_institution_id") @ExcludeMissing private val originatingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_depository_financial_institution_id_qualifier") @ExcludeMissing private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> = JsonMissing.of(),
        @JsonProperty("originating_depository_financial_institution_name") @ExcludeMissing private val originatingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_city") @ExcludeMissing private val originatorCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_country") @ExcludeMissing private val originatorCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_identification") @ExcludeMissing private val originatorIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name") @ExcludeMissing private val originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_postal_code") @ExcludeMissing private val originatorPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_state_or_province") @ExcludeMissing private val originatorStateOrProvince: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_street_address") @ExcludeMissing private val originatorStreetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_related_information") @ExcludeMissing private val paymentRelatedInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_related_information2") @ExcludeMissing private val paymentRelatedInformation2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_city") @ExcludeMissing private val receiverCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_country") @ExcludeMissing private val receiverCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_identification_number") @ExcludeMissing private val receiverIdentificationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_postal_code") @ExcludeMissing private val receiverPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_state_or_province") @ExcludeMissing private val receiverStateOrProvince: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_street_address") @ExcludeMissing private val receiverStreetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_company_or_individual_name") @ExcludeMissing private val receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_depository_financial_institution_country") @ExcludeMissing private val receivingDepositoryFinancialInstitutionCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_depository_financial_institution_id") @ExcludeMissing private val receivingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_depository_financial_institution_id_qualifier") @ExcludeMissing private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> = JsonMissing.of(),
        @JsonProperty("receiving_depository_financial_institution_name") @ExcludeMissing private val receivingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the destination country.
         */
        fun destinationCountryCode(): String = destinationCountryCode.getRequired("destination_country_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * destination bank account.
         */
        fun destinationCurrencyCode(): String = destinationCurrencyCode.getRequired("destination_currency_code")

        /** A description of how the foreign exchange rate was calculated. */
        fun foreignExchangeIndicator(): ForeignExchangeIndicator = foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
         * reference to a well-known rate.
         */
        fun foreignExchangeReference(): String? = foreignExchangeReference.getNullable("foreign_exchange_reference")

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for
         * this Transaction.
         */
        fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator = foreignExchangeReferenceIndicator.getRequired("foreign_exchange_reference_indicator")

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for
         * example, this is cents.
         */
        fun foreignPaymentAmount(): Long = foreignPaymentAmount.getRequired("foreign_payment_amount")

        /** A reference number in the foreign banking infrastructure. */
        fun foreignTraceNumber(): String? = foreignTraceNumber.getNullable("foreign_trace_number")

        /** The type of transfer. Set by the originator. */
        fun internationalTransactionTypeCode(): InternationalTransactionTypeCode = internationalTransactionTypeCode.getRequired("international_transaction_type_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * originating bank account.
         */
        fun originatingCurrencyCode(): String = originatingCurrencyCode.getRequired("originating_currency_code")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the originating branch country.
         */
        fun originatingDepositoryFinancialInstitutionBranchCountry(): String = originatingDepositoryFinancialInstitutionBranchCountry.getRequired("originating_depository_financial_institution_branch_country")

        /**
         * An identifier for the originating bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        fun originatingDepositoryFinancialInstitutionId(): String = originatingDepositoryFinancialInstitutionId.getRequired("originating_depository_financial_institution_id")

        /**
         * An instruction of how to interpret the
         * `originating_depository_financial_institution_id` field for this Transaction.
         */
        fun originatingDepositoryFinancialInstitutionIdQualifier(): OriginatingDepositoryFinancialInstitutionIdQualifier = originatingDepositoryFinancialInstitutionIdQualifier.getRequired("originating_depository_financial_institution_id_qualifier")

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank
         * and obscure the correspondent foreign bank.
         */
        fun originatingDepositoryFinancialInstitutionName(): String = originatingDepositoryFinancialInstitutionName.getRequired("originating_depository_financial_institution_name")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorCity(): String = originatorCity.getRequired("originator_city")

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the originator country.
         */
        fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

        /**
         * An identifier for the originating company. This is generally stable across
         * multiple ACH transfers.
         */
        fun originatorIdentification(): String = originatorIdentification.getRequired("originator_identification")

        /** Either the name of the originator or an intermediary money transmitter. */
        fun originatorName(): String = originatorName.getRequired("originator_name")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorPostalCode(): String? = originatorPostalCode.getNullable("originator_postal_code")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStateOrProvince(): String? = originatorStateOrProvince.getNullable("originator_state_or_province")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStreetAddress(): String = originatorStreetAddress.getRequired("originator_street_address")

        /** A description field set by the originator. */
        fun paymentRelatedInformation(): String? = paymentRelatedInformation.getNullable("payment_related_information")

        /** A description field set by the originator. */
        fun paymentRelatedInformation2(): String? = paymentRelatedInformation2.getNullable("payment_related_information2")

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverCity(): String = receiverCity.getRequired("receiver_city")

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the receiver country.
         */
        fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

        /** An identification number the originator uses for the receiver. */
        fun receiverIdentificationNumber(): String? = receiverIdentificationNumber.getNullable("receiver_identification_number")

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverPostalCode(): String? = receiverPostalCode.getNullable("receiver_postal_code")

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStateOrProvince(): String? = receiverStateOrProvince.getNullable("receiver_state_or_province")

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStreetAddress(): String = receiverStreetAddress.getRequired("receiver_street_address")

        /** The name of the receiver of the transfer. This is not verified by Increase. */
        fun receivingCompanyOrIndividualName(): String = receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the receiving bank country.
         */
        fun receivingDepositoryFinancialInstitutionCountry(): String = receivingDepositoryFinancialInstitutionCountry.getRequired("receiving_depository_financial_institution_country")

        /**
         * An identifier for the receiving bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        fun receivingDepositoryFinancialInstitutionId(): String = receivingDepositoryFinancialInstitutionId.getRequired("receiving_depository_financial_institution_id")

        /**
         * An instruction of how to interpret the
         * `receiving_depository_financial_institution_id` field for this Transaction.
         */
        fun receivingDepositoryFinancialInstitutionIdQualifier(): ReceivingDepositoryFinancialInstitutionIdQualifier = receivingDepositoryFinancialInstitutionIdQualifier.getRequired("receiving_depository_financial_institution_id_qualifier")

        /** The name of the receiving bank, as set by the sending financial institution. */
        fun receivingDepositoryFinancialInstitutionName(): String = receivingDepositoryFinancialInstitutionName.getRequired("receiving_depository_financial_institution_name")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the destination country.
         */
        @JsonProperty("destination_country_code")
        @ExcludeMissing
        fun _destinationCountryCode(): JsonField<String> = destinationCountryCode

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * destination bank account.
         */
        @JsonProperty("destination_currency_code")
        @ExcludeMissing
        fun _destinationCurrencyCode(): JsonField<String> = destinationCurrencyCode

        /** A description of how the foreign exchange rate was calculated. */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> = foreignExchangeIndicator

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
         * reference to a well-known rate.
         */
        @JsonProperty("foreign_exchange_reference")
        @ExcludeMissing
        fun _foreignExchangeReference(): JsonField<String> = foreignExchangeReference

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for
         * this Transaction.
         */
        @JsonProperty("foreign_exchange_reference_indicator")
        @ExcludeMissing
        fun _foreignExchangeReferenceIndicator(): JsonField<ForeignExchangeReferenceIndicator> = foreignExchangeReferenceIndicator

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("foreign_payment_amount")
        @ExcludeMissing
        fun _foreignPaymentAmount(): JsonField<Long> = foreignPaymentAmount

        /** A reference number in the foreign banking infrastructure. */
        @JsonProperty("foreign_trace_number")
        @ExcludeMissing
        fun _foreignTraceNumber(): JsonField<String> = foreignTraceNumber

        /** The type of transfer. Set by the originator. */
        @JsonProperty("international_transaction_type_code")
        @ExcludeMissing
        fun _internationalTransactionTypeCode(): JsonField<InternationalTransactionTypeCode> = internationalTransactionTypeCode

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * originating bank account.
         */
        @JsonProperty("originating_currency_code")
        @ExcludeMissing
        fun _originatingCurrencyCode(): JsonField<String> = originatingCurrencyCode

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the originating branch country.
         */
        @JsonProperty("originating_depository_financial_institution_branch_country")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionBranchCountry(): JsonField<String> = originatingDepositoryFinancialInstitutionBranchCountry

        /**
         * An identifier for the originating bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        @JsonProperty("originating_depository_financial_institution_id")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionId(): JsonField<String> = originatingDepositoryFinancialInstitutionId

        /**
         * An instruction of how to interpret the
         * `originating_depository_financial_institution_id` field for this Transaction.
         */
        @JsonProperty("originating_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionIdQualifier(): JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> = originatingDepositoryFinancialInstitutionIdQualifier

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank
         * and obscure the correspondent foreign bank.
         */
        @JsonProperty("originating_depository_financial_institution_name")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionName(): JsonField<String> = originatingDepositoryFinancialInstitutionName

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_city")
        @ExcludeMissing
        fun _originatorCity(): JsonField<String> = originatorCity

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the originator country.
         */
        @JsonProperty("originator_country")
        @ExcludeMissing
        fun _originatorCountry(): JsonField<String> = originatorCountry

        /**
         * An identifier for the originating company. This is generally stable across
         * multiple ACH transfers.
         */
        @JsonProperty("originator_identification")
        @ExcludeMissing
        fun _originatorIdentification(): JsonField<String> = originatorIdentification

        /** Either the name of the originator or an intermediary money transmitter. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_postal_code")
        @ExcludeMissing
        fun _originatorPostalCode(): JsonField<String> = originatorPostalCode

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_state_or_province")
        @ExcludeMissing
        fun _originatorStateOrProvince(): JsonField<String> = originatorStateOrProvince

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_street_address")
        @ExcludeMissing
        fun _originatorStreetAddress(): JsonField<String> = originatorStreetAddress

        /** A description field set by the originator. */
        @JsonProperty("payment_related_information")
        @ExcludeMissing
        fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

        /** A description field set by the originator. */
        @JsonProperty("payment_related_information2")
        @ExcludeMissing
        fun _paymentRelatedInformation2(): JsonField<String> = paymentRelatedInformation2

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_city")
        @ExcludeMissing
        fun _receiverCity(): JsonField<String> = receiverCity

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the receiver country.
         */
        @JsonProperty("receiver_country")
        @ExcludeMissing
        fun _receiverCountry(): JsonField<String> = receiverCountry

        /** An identification number the originator uses for the receiver. */
        @JsonProperty("receiver_identification_number")
        @ExcludeMissing
        fun _receiverIdentificationNumber(): JsonField<String> = receiverIdentificationNumber

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_postal_code")
        @ExcludeMissing
        fun _receiverPostalCode(): JsonField<String> = receiverPostalCode

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_state_or_province")
        @ExcludeMissing
        fun _receiverStateOrProvince(): JsonField<String> = receiverStateOrProvince

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_street_address")
        @ExcludeMissing
        fun _receiverStreetAddress(): JsonField<String> = receiverStreetAddress

        /** The name of the receiver of the transfer. This is not verified by Increase. */
        @JsonProperty("receiving_company_or_individual_name")
        @ExcludeMissing
        fun _receivingCompanyOrIndividualName(): JsonField<String> = receivingCompanyOrIndividualName

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the receiving bank country.
         */
        @JsonProperty("receiving_depository_financial_institution_country")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionCountry(): JsonField<String> = receivingDepositoryFinancialInstitutionCountry

        /**
         * An identifier for the receiving bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        @JsonProperty("receiving_depository_financial_institution_id")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionId(): JsonField<String> = receivingDepositoryFinancialInstitutionId

        /**
         * An instruction of how to interpret the
         * `receiving_depository_financial_institution_id` field for this Transaction.
         */
        @JsonProperty("receiving_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionIdQualifier(): JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> = receivingDepositoryFinancialInstitutionIdQualifier

        /** The name of the receiving bank, as set by the sending financial institution. */
        @JsonProperty("receiving_depository_financial_institution_name")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionName(): JsonField<String> = receivingDepositoryFinancialInstitutionName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InternationalAddenda =
            apply {
                if (validated) {
                  return@apply
                }

                destinationCountryCode()
                destinationCurrencyCode()
                foreignExchangeIndicator()
                foreignExchangeReference()
                foreignExchangeReferenceIndicator()
                foreignPaymentAmount()
                foreignTraceNumber()
                internationalTransactionTypeCode()
                originatingCurrencyCode()
                originatingDepositoryFinancialInstitutionBranchCountry()
                originatingDepositoryFinancialInstitutionId()
                originatingDepositoryFinancialInstitutionIdQualifier()
                originatingDepositoryFinancialInstitutionName()
                originatorCity()
                originatorCountry()
                originatorIdentification()
                originatorName()
                originatorPostalCode()
                originatorStateOrProvince()
                originatorStreetAddress()
                paymentRelatedInformation()
                paymentRelatedInformation2()
                receiverCity()
                receiverCountry()
                receiverIdentificationNumber()
                receiverPostalCode()
                receiverStateOrProvince()
                receiverStreetAddress()
                receivingCompanyOrIndividualName()
                receivingDepositoryFinancialInstitutionCountry()
                receivingDepositoryFinancialInstitutionId()
                receivingDepositoryFinancialInstitutionIdQualifier()
                receivingDepositoryFinancialInstitutionName()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [InternationalAddenda].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .destinationCountryCode()
             * .destinationCurrencyCode()
             * .foreignExchangeIndicator()
             * .foreignExchangeReference()
             * .foreignExchangeReferenceIndicator()
             * .foreignPaymentAmount()
             * .foreignTraceNumber()
             * .internationalTransactionTypeCode()
             * .originatingCurrencyCode()
             * .originatingDepositoryFinancialInstitutionBranchCountry()
             * .originatingDepositoryFinancialInstitutionId()
             * .originatingDepositoryFinancialInstitutionIdQualifier()
             * .originatingDepositoryFinancialInstitutionName()
             * .originatorCity()
             * .originatorCountry()
             * .originatorIdentification()
             * .originatorName()
             * .originatorPostalCode()
             * .originatorStateOrProvince()
             * .originatorStreetAddress()
             * .paymentRelatedInformation()
             * .paymentRelatedInformation2()
             * .receiverCity()
             * .receiverCountry()
             * .receiverIdentificationNumber()
             * .receiverPostalCode()
             * .receiverStateOrProvince()
             * .receiverStreetAddress()
             * .receivingCompanyOrIndividualName()
             * .receivingDepositoryFinancialInstitutionCountry()
             * .receivingDepositoryFinancialInstitutionId()
             * .receivingDepositoryFinancialInstitutionIdQualifier()
             * .receivingDepositoryFinancialInstitutionName()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [InternationalAddenda]. */
        class Builder internal constructor() {

            private var destinationCountryCode: JsonField<String>? = null
            private var destinationCurrencyCode: JsonField<String>? = null
            private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>? = null
            private var foreignExchangeReference: JsonField<String>? = null
            private var foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>? = null
            private var foreignPaymentAmount: JsonField<Long>? = null
            private var foreignTraceNumber: JsonField<String>? = null
            private var internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>? = null
            private var originatingCurrencyCode: JsonField<String>? = null
            private var originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>? = null
            private var originatingDepositoryFinancialInstitutionId: JsonField<String>? = null
            private var originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>? = null
            private var originatingDepositoryFinancialInstitutionName: JsonField<String>? = null
            private var originatorCity: JsonField<String>? = null
            private var originatorCountry: JsonField<String>? = null
            private var originatorIdentification: JsonField<String>? = null
            private var originatorName: JsonField<String>? = null
            private var originatorPostalCode: JsonField<String>? = null
            private var originatorStateOrProvince: JsonField<String>? = null
            private var originatorStreetAddress: JsonField<String>? = null
            private var paymentRelatedInformation: JsonField<String>? = null
            private var paymentRelatedInformation2: JsonField<String>? = null
            private var receiverCity: JsonField<String>? = null
            private var receiverCountry: JsonField<String>? = null
            private var receiverIdentificationNumber: JsonField<String>? = null
            private var receiverPostalCode: JsonField<String>? = null
            private var receiverStateOrProvince: JsonField<String>? = null
            private var receiverStreetAddress: JsonField<String>? = null
            private var receivingCompanyOrIndividualName: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionCountry: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionId: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>? = null
            private var receivingDepositoryFinancialInstitutionName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(internationalAddenda: InternationalAddenda) =
                apply {
                    destinationCountryCode = internationalAddenda.destinationCountryCode
                    destinationCurrencyCode = internationalAddenda.destinationCurrencyCode
                    foreignExchangeIndicator = internationalAddenda.foreignExchangeIndicator
                    foreignExchangeReference = internationalAddenda.foreignExchangeReference
                    foreignExchangeReferenceIndicator = internationalAddenda.foreignExchangeReferenceIndicator
                    foreignPaymentAmount = internationalAddenda.foreignPaymentAmount
                    foreignTraceNumber = internationalAddenda.foreignTraceNumber
                    internationalTransactionTypeCode = internationalAddenda.internationalTransactionTypeCode
                    originatingCurrencyCode = internationalAddenda.originatingCurrencyCode
                    originatingDepositoryFinancialInstitutionBranchCountry = internationalAddenda.originatingDepositoryFinancialInstitutionBranchCountry
                    originatingDepositoryFinancialInstitutionId = internationalAddenda.originatingDepositoryFinancialInstitutionId
                    originatingDepositoryFinancialInstitutionIdQualifier = internationalAddenda.originatingDepositoryFinancialInstitutionIdQualifier
                    originatingDepositoryFinancialInstitutionName = internationalAddenda.originatingDepositoryFinancialInstitutionName
                    originatorCity = internationalAddenda.originatorCity
                    originatorCountry = internationalAddenda.originatorCountry
                    originatorIdentification = internationalAddenda.originatorIdentification
                    originatorName = internationalAddenda.originatorName
                    originatorPostalCode = internationalAddenda.originatorPostalCode
                    originatorStateOrProvince = internationalAddenda.originatorStateOrProvince
                    originatorStreetAddress = internationalAddenda.originatorStreetAddress
                    paymentRelatedInformation = internationalAddenda.paymentRelatedInformation
                    paymentRelatedInformation2 = internationalAddenda.paymentRelatedInformation2
                    receiverCity = internationalAddenda.receiverCity
                    receiverCountry = internationalAddenda.receiverCountry
                    receiverIdentificationNumber = internationalAddenda.receiverIdentificationNumber
                    receiverPostalCode = internationalAddenda.receiverPostalCode
                    receiverStateOrProvince = internationalAddenda.receiverStateOrProvince
                    receiverStreetAddress = internationalAddenda.receiverStreetAddress
                    receivingCompanyOrIndividualName = internationalAddenda.receivingCompanyOrIndividualName
                    receivingDepositoryFinancialInstitutionCountry = internationalAddenda.receivingDepositoryFinancialInstitutionCountry
                    receivingDepositoryFinancialInstitutionId = internationalAddenda.receivingDepositoryFinancialInstitutionId
                    receivingDepositoryFinancialInstitutionIdQualifier = internationalAddenda.receivingDepositoryFinancialInstitutionIdQualifier
                    receivingDepositoryFinancialInstitutionName = internationalAddenda.receivingDepositoryFinancialInstitutionName
                    additionalProperties = internationalAddenda.additionalProperties.toMutableMap()
                }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the destination country.
             */
            fun destinationCountryCode(destinationCountryCode: String) = destinationCountryCode(JsonField.of(destinationCountryCode))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the destination country.
             */
            fun destinationCountryCode(destinationCountryCode: JsonField<String>) =
                apply {
                    this.destinationCountryCode = destinationCountryCode
                }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            fun destinationCurrencyCode(destinationCurrencyCode: String) = destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) =
                apply {
                    this.destinationCurrencyCode = destinationCurrencyCode
                }

            /** A description of how the foreign exchange rate was calculated. */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) = foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

            /** A description of how the foreign exchange rate was calculated. */
            fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>) =
                apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            fun foreignExchangeReference(foreignExchangeReference: String?) = foreignExchangeReference(JsonField.ofNullable(foreignExchangeReference))

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) =
                apply {
                    this.foreignExchangeReference = foreignExchangeReference
                }

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for
             * this Transaction.
             */
            fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: ForeignExchangeReferenceIndicator) = foreignExchangeReferenceIndicator(JsonField.of(foreignExchangeReferenceIndicator))

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for
             * this Transaction.
             */
            fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>) =
                apply {
                    this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                }

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            fun foreignPaymentAmount(foreignPaymentAmount: Long) = foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) =
                apply {
                    this.foreignPaymentAmount = foreignPaymentAmount
                }

            /** A reference number in the foreign banking infrastructure. */
            fun foreignTraceNumber(foreignTraceNumber: String?) = foreignTraceNumber(JsonField.ofNullable(foreignTraceNumber))

            /** A reference number in the foreign banking infrastructure. */
            fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) =
                apply {
                    this.foreignTraceNumber = foreignTraceNumber
                }

            /** The type of transfer. Set by the originator. */
            fun internationalTransactionTypeCode(internationalTransactionTypeCode: InternationalTransactionTypeCode) = internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

            /** The type of transfer. Set by the originator. */
            fun internationalTransactionTypeCode(internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>) =
                apply {
                    this.internationalTransactionTypeCode = internationalTransactionTypeCode
                }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            fun originatingCurrencyCode(originatingCurrencyCode: String) = originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) =
                apply {
                    this.originatingCurrencyCode = originatingCurrencyCode
                }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the originating branch country.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(originatingDepositoryFinancialInstitutionBranchCountry: String) = originatingDepositoryFinancialInstitutionBranchCountry(JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the originating branch country.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>) =
                apply {
                    this.originatingDepositoryFinancialInstitutionBranchCountry = originatingDepositoryFinancialInstitutionBranchCountry
                }

            /**
             * An identifier for the originating bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun originatingDepositoryFinancialInstitutionId(originatingDepositoryFinancialInstitutionId: String) = originatingDepositoryFinancialInstitutionId(JsonField.of(originatingDepositoryFinancialInstitutionId))

            /**
             * An identifier for the originating bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun originatingDepositoryFinancialInstitutionId(originatingDepositoryFinancialInstitutionId: JsonField<String>) =
                apply {
                    this.originatingDepositoryFinancialInstitutionId = originatingDepositoryFinancialInstitutionId
                }

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            fun originatingDepositoryFinancialInstitutionIdQualifier(originatingDepositoryFinancialInstitutionIdQualifier: OriginatingDepositoryFinancialInstitutionIdQualifier) = originatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier))

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            fun originatingDepositoryFinancialInstitutionIdQualifier(originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>) =
                apply {
                    this.originatingDepositoryFinancialInstitutionIdQualifier = originatingDepositoryFinancialInstitutionIdQualifier
                }

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank
             * and obscure the correspondent foreign bank.
             */
            fun originatingDepositoryFinancialInstitutionName(originatingDepositoryFinancialInstitutionName: String) = originatingDepositoryFinancialInstitutionName(JsonField.of(originatingDepositoryFinancialInstitutionName))

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank
             * and obscure the correspondent foreign bank.
             */
            fun originatingDepositoryFinancialInstitutionName(originatingDepositoryFinancialInstitutionName: JsonField<String>) =
                apply {
                    this.originatingDepositoryFinancialInstitutionName = originatingDepositoryFinancialInstitutionName
                }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorCity(originatorCity: String) = originatorCity(JsonField.of(originatorCity))

            /** A portion of the originator address. This may be incomplete. */
            fun originatorCity(originatorCity: JsonField<String>) =
                apply {
                    this.originatorCity = originatorCity
                }

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originator country.
             */
            fun originatorCountry(originatorCountry: String) = originatorCountry(JsonField.of(originatorCountry))

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originator country.
             */
            fun originatorCountry(originatorCountry: JsonField<String>) =
                apply {
                    this.originatorCountry = originatorCountry
                }

            /**
             * An identifier for the originating company. This is generally stable across
             * multiple ACH transfers.
             */
            fun originatorIdentification(originatorIdentification: String) = originatorIdentification(JsonField.of(originatorIdentification))

            /**
             * An identifier for the originating company. This is generally stable across
             * multiple ACH transfers.
             */
            fun originatorIdentification(originatorIdentification: JsonField<String>) =
                apply {
                    this.originatorIdentification = originatorIdentification
                }

            /** Either the name of the originator or an intermediary money transmitter. */
            fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

            /** Either the name of the originator or an intermediary money transmitter. */
            fun originatorName(originatorName: JsonField<String>) =
                apply {
                    this.originatorName = originatorName
                }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorPostalCode(originatorPostalCode: String?) = originatorPostalCode(JsonField.ofNullable(originatorPostalCode))

            /** A portion of the originator address. This may be incomplete. */
            fun originatorPostalCode(originatorPostalCode: JsonField<String>) =
                apply {
                    this.originatorPostalCode = originatorPostalCode
                }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStateOrProvince(originatorStateOrProvince: String?) = originatorStateOrProvince(JsonField.ofNullable(originatorStateOrProvince))

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                apply {
                    this.originatorStateOrProvince = originatorStateOrProvince
                }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStreetAddress(originatorStreetAddress: String) = originatorStreetAddress(JsonField.of(originatorStreetAddress))

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) =
                apply {
                    this.originatorStreetAddress = originatorStreetAddress
                }

            /** A description field set by the originator. */
            fun paymentRelatedInformation(paymentRelatedInformation: String?) = paymentRelatedInformation(JsonField.ofNullable(paymentRelatedInformation))

            /** A description field set by the originator. */
            fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                apply {
                    this.paymentRelatedInformation = paymentRelatedInformation
                }

            /** A description field set by the originator. */
            fun paymentRelatedInformation2(paymentRelatedInformation2: String?) = paymentRelatedInformation2(JsonField.ofNullable(paymentRelatedInformation2))

            /** A description field set by the originator. */
            fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                apply {
                    this.paymentRelatedInformation2 = paymentRelatedInformation2
                }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverCity(receiverCity: JsonField<String>) =
                apply {
                    this.receiverCity = receiverCity
                }

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiver country.
             */
            fun receiverCountry(receiverCountry: String) = receiverCountry(JsonField.of(receiverCountry))

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiver country.
             */
            fun receiverCountry(receiverCountry: JsonField<String>) =
                apply {
                    this.receiverCountry = receiverCountry
                }

            /** An identification number the originator uses for the receiver. */
            fun receiverIdentificationNumber(receiverIdentificationNumber: String?) = receiverIdentificationNumber(JsonField.ofNullable(receiverIdentificationNumber))

            /** An identification number the originator uses for the receiver. */
            fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                apply {
                    this.receiverIdentificationNumber = receiverIdentificationNumber
                }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverPostalCode(receiverPostalCode: String?) = receiverPostalCode(JsonField.ofNullable(receiverPostalCode))

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverPostalCode(receiverPostalCode: JsonField<String>) =
                apply {
                    this.receiverPostalCode = receiverPostalCode
                }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStateOrProvince(receiverStateOrProvince: String?) = receiverStateOrProvince(JsonField.ofNullable(receiverStateOrProvince))

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) =
                apply {
                    this.receiverStateOrProvince = receiverStateOrProvince
                }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStreetAddress(receiverStreetAddress: String) = receiverStreetAddress(JsonField.of(receiverStreetAddress))

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) =
                apply {
                    this.receiverStreetAddress = receiverStreetAddress
                }

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) = receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: JsonField<String>) =
                apply {
                    this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the receiving bank country.
             */
            fun receivingDepositoryFinancialInstitutionCountry(receivingDepositoryFinancialInstitutionCountry: String) = receivingDepositoryFinancialInstitutionCountry(JsonField.of(receivingDepositoryFinancialInstitutionCountry))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the receiving bank country.
             */
            fun receivingDepositoryFinancialInstitutionCountry(receivingDepositoryFinancialInstitutionCountry: JsonField<String>) =
                apply {
                    this.receivingDepositoryFinancialInstitutionCountry = receivingDepositoryFinancialInstitutionCountry
                }

            /**
             * An identifier for the receiving bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun receivingDepositoryFinancialInstitutionId(receivingDepositoryFinancialInstitutionId: String) = receivingDepositoryFinancialInstitutionId(JsonField.of(receivingDepositoryFinancialInstitutionId))

            /**
             * An identifier for the receiving bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun receivingDepositoryFinancialInstitutionId(receivingDepositoryFinancialInstitutionId: JsonField<String>) =
                apply {
                    this.receivingDepositoryFinancialInstitutionId = receivingDepositoryFinancialInstitutionId
                }

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            fun receivingDepositoryFinancialInstitutionIdQualifier(receivingDepositoryFinancialInstitutionIdQualifier: ReceivingDepositoryFinancialInstitutionIdQualifier) = receivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier))

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            fun receivingDepositoryFinancialInstitutionIdQualifier(receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>) =
                apply {
                    this.receivingDepositoryFinancialInstitutionIdQualifier = receivingDepositoryFinancialInstitutionIdQualifier
                }

            /** The name of the receiving bank, as set by the sending financial institution. */
            fun receivingDepositoryFinancialInstitutionName(receivingDepositoryFinancialInstitutionName: String) = receivingDepositoryFinancialInstitutionName(JsonField.of(receivingDepositoryFinancialInstitutionName))

            /** The name of the receiving bank, as set by the sending financial institution. */
            fun receivingDepositoryFinancialInstitutionName(receivingDepositoryFinancialInstitutionName: JsonField<String>) =
                apply {
                    this.receivingDepositoryFinancialInstitutionName = receivingDepositoryFinancialInstitutionName
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): InternationalAddenda =
                InternationalAddenda(
                  checkRequired(
                    "destinationCountryCode", destinationCountryCode
                  ),
                  checkRequired(
                    "destinationCurrencyCode", destinationCurrencyCode
                  ),
                  checkRequired(
                    "foreignExchangeIndicator", foreignExchangeIndicator
                  ),
                  checkRequired(
                    "foreignExchangeReference", foreignExchangeReference
                  ),
                  checkRequired(
                    "foreignExchangeReferenceIndicator", foreignExchangeReferenceIndicator
                  ),
                  checkRequired(
                    "foreignPaymentAmount", foreignPaymentAmount
                  ),
                  checkRequired(
                    "foreignTraceNumber", foreignTraceNumber
                  ),
                  checkRequired(
                    "internationalTransactionTypeCode", internationalTransactionTypeCode
                  ),
                  checkRequired(
                    "originatingCurrencyCode", originatingCurrencyCode
                  ),
                  checkRequired(
                    "originatingDepositoryFinancialInstitutionBranchCountry", originatingDepositoryFinancialInstitutionBranchCountry
                  ),
                  checkRequired(
                    "originatingDepositoryFinancialInstitutionId", originatingDepositoryFinancialInstitutionId
                  ),
                  checkRequired(
                    "originatingDepositoryFinancialInstitutionIdQualifier", originatingDepositoryFinancialInstitutionIdQualifier
                  ),
                  checkRequired(
                    "originatingDepositoryFinancialInstitutionName", originatingDepositoryFinancialInstitutionName
                  ),
                  checkRequired(
                    "originatorCity", originatorCity
                  ),
                  checkRequired(
                    "originatorCountry", originatorCountry
                  ),
                  checkRequired(
                    "originatorIdentification", originatorIdentification
                  ),
                  checkRequired(
                    "originatorName", originatorName
                  ),
                  checkRequired(
                    "originatorPostalCode", originatorPostalCode
                  ),
                  checkRequired(
                    "originatorStateOrProvince", originatorStateOrProvince
                  ),
                  checkRequired(
                    "originatorStreetAddress", originatorStreetAddress
                  ),
                  checkRequired(
                    "paymentRelatedInformation", paymentRelatedInformation
                  ),
                  checkRequired(
                    "paymentRelatedInformation2", paymentRelatedInformation2
                  ),
                  checkRequired(
                    "receiverCity", receiverCity
                  ),
                  checkRequired(
                    "receiverCountry", receiverCountry
                  ),
                  checkRequired(
                    "receiverIdentificationNumber", receiverIdentificationNumber
                  ),
                  checkRequired(
                    "receiverPostalCode", receiverPostalCode
                  ),
                  checkRequired(
                    "receiverStateOrProvince", receiverStateOrProvince
                  ),
                  checkRequired(
                    "receiverStreetAddress", receiverStreetAddress
                  ),
                  checkRequired(
                    "receivingCompanyOrIndividualName", receivingCompanyOrIndividualName
                  ),
                  checkRequired(
                    "receivingDepositoryFinancialInstitutionCountry", receivingDepositoryFinancialInstitutionCountry
                  ),
                  checkRequired(
                    "receivingDepositoryFinancialInstitutionId", receivingDepositoryFinancialInstitutionId
                  ),
                  checkRequired(
                    "receivingDepositoryFinancialInstitutionIdQualifier", receivingDepositoryFinancialInstitutionIdQualifier
                  ),
                  checkRequired(
                    "receivingDepositoryFinancialInstitutionName", receivingDepositoryFinancialInstitutionName
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        /** A description of how the foreign exchange rate was calculated. */
        class ForeignExchangeIndicator @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                val FIXED_TO_VARIABLE = of("fixed_to_variable")

                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                val VARIABLE_TO_FIXED = of("variable_to_fixed")

                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                val FIXED_TO_FIXED = of("fixed_to_fixed")

                fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
            }

            /** An enum containing [ForeignExchangeIndicator]'s known values. */
            enum class Known {
                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                FIXED_TO_VARIABLE,
                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                VARIABLE_TO_FIXED,
                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                FIXED_TO_FIXED,
            }

            /**
             * An enum containing [ForeignExchangeIndicator]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ForeignExchangeIndicator] can contain an unknown value in a
             * couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                FIXED_TO_VARIABLE,
                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                VARIABLE_TO_FIXED,
                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                FIXED_TO_FIXED,
                /**
                 * An enum member indicating that [ForeignExchangeIndicator] was instantiated with
                 * an unknown value.
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
                    FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                    VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                    FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                    VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                    FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                    else -> throw IncreaseInvalidDataException("Unknown ForeignExchangeIndicator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for
         * this Transaction.
         */
        class ForeignExchangeReferenceIndicator @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /** The ACH file contains a foreign exchange rate. */
                val FOREIGN_EXCHANGE_RATE = of("foreign_exchange_rate")

                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                val FOREIGN_EXCHANGE_REFERENCE_NUMBER = of("foreign_exchange_reference_number")

                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                val BLANK = of("blank")

                fun of(value: String) = ForeignExchangeReferenceIndicator(JsonField.of(value))
            }

            /** An enum containing [ForeignExchangeReferenceIndicator]'s known values. */
            enum class Known {
                /** The ACH file contains a foreign exchange rate. */
                FOREIGN_EXCHANGE_RATE,
                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                BLANK,
            }

            /**
             * An enum containing [ForeignExchangeReferenceIndicator]'s known values, as well
             * as an [_UNKNOWN] member.
             *
             * An instance of [ForeignExchangeReferenceIndicator] can contain an unknown value
             * in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The ACH file contains a foreign exchange rate. */
                FOREIGN_EXCHANGE_RATE,
                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                BLANK,
                /**
                 * An enum member indicating that [ForeignExchangeReferenceIndicator] was
                 * instantiated with an unknown value.
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
                    FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                    BLANK -> Value.BLANK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                    BLANK -> Known.BLANK
                    else -> throw IncreaseInvalidDataException("Unknown ForeignExchangeReferenceIndicator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is ForeignExchangeReferenceIndicator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of transfer. Set by the originator. */
        class InternationalTransactionTypeCode @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /** Sent as `ANN` in the Nacha file. */
                val ANNUITY = of("annuity")

                /** Sent as `BUS` in the Nacha file. */
                val BUSINESS_OR_COMMERCIAL = of("business_or_commercial")

                /** Sent as `DEP` in the Nacha file. */
                val DEPOSIT = of("deposit")

                /** Sent as `LOA` in the Nacha file. */
                val LOAN = of("loan")

                /** Sent as `MIS` in the Nacha file. */
                val MISCELLANEOUS = of("miscellaneous")

                /** Sent as `MOR` in the Nacha file. */
                val MORTGAGE = of("mortgage")

                /** Sent as `PEN` in the Nacha file. */
                val PENSION = of("pension")

                /** Sent as `REM` in the Nacha file. */
                val REMITTANCE = of("remittance")

                /** Sent as `RLS` in the Nacha file. */
                val RENT_OR_LEASE = of("rent_or_lease")

                /** Sent as `SAL` in the Nacha file. */
                val SALARY_OR_PAYROLL = of("salary_or_payroll")

                /** Sent as `TAX` in the Nacha file. */
                val TAX = of("tax")

                /** Sent as `ARC` in the Nacha file. */
                val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

                /** Sent as `BOC` in the Nacha file. */
                val BACK_OFFICE_CONVERSION = of("back_office_conversion")

                /** Sent as `MTE` in the Nacha file. */
                val MACHINE_TRANSFER = of("machine_transfer")

                /** Sent as `POP` in the Nacha file. */
                val POINT_OF_PURCHASE = of("point_of_purchase")

                /** Sent as `POS` in the Nacha file. */
                val POINT_OF_SALE = of("point_of_sale")

                /** Sent as `RCK` in the Nacha file. */
                val REPRESENTED_CHECK = of("represented_check")

                /** Sent as `SHR` in the Nacha file. */
                val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

                /** Sent as `TEL` in the Nacha file. */
                val TELPHONE_INITIATED = of("telphone_initiated")

                /** Sent as `WEB` in the Nacha file. */
                val INTERNET_INITIATED = of("internet_initiated")

                fun of(value: String) = InternationalTransactionTypeCode(JsonField.of(value))
            }

            /** An enum containing [InternationalTransactionTypeCode]'s known values. */
            enum class Known {
                /** Sent as `ANN` in the Nacha file. */
                ANNUITY,
                /** Sent as `BUS` in the Nacha file. */
                BUSINESS_OR_COMMERCIAL,
                /** Sent as `DEP` in the Nacha file. */
                DEPOSIT,
                /** Sent as `LOA` in the Nacha file. */
                LOAN,
                /** Sent as `MIS` in the Nacha file. */
                MISCELLANEOUS,
                /** Sent as `MOR` in the Nacha file. */
                MORTGAGE,
                /** Sent as `PEN` in the Nacha file. */
                PENSION,
                /** Sent as `REM` in the Nacha file. */
                REMITTANCE,
                /** Sent as `RLS` in the Nacha file. */
                RENT_OR_LEASE,
                /** Sent as `SAL` in the Nacha file. */
                SALARY_OR_PAYROLL,
                /** Sent as `TAX` in the Nacha file. */
                TAX,
                /** Sent as `ARC` in the Nacha file. */
                ACCOUNTS_RECEIVABLE,
                /** Sent as `BOC` in the Nacha file. */
                BACK_OFFICE_CONVERSION,
                /** Sent as `MTE` in the Nacha file. */
                MACHINE_TRANSFER,
                /** Sent as `POP` in the Nacha file. */
                POINT_OF_PURCHASE,
                /** Sent as `POS` in the Nacha file. */
                POINT_OF_SALE,
                /** Sent as `RCK` in the Nacha file. */
                REPRESENTED_CHECK,
                /** Sent as `SHR` in the Nacha file. */
                SHARED_NETWORK_TRANSACTION,
                /** Sent as `TEL` in the Nacha file. */
                TELPHONE_INITIATED,
                /** Sent as `WEB` in the Nacha file. */
                INTERNET_INITIATED,
            }

            /**
             * An enum containing [InternationalTransactionTypeCode]'s known values, as well as
             * an [_UNKNOWN] member.
             *
             * An instance of [InternationalTransactionTypeCode] can contain an unknown value
             * in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Sent as `ANN` in the Nacha file. */
                ANNUITY,
                /** Sent as `BUS` in the Nacha file. */
                BUSINESS_OR_COMMERCIAL,
                /** Sent as `DEP` in the Nacha file. */
                DEPOSIT,
                /** Sent as `LOA` in the Nacha file. */
                LOAN,
                /** Sent as `MIS` in the Nacha file. */
                MISCELLANEOUS,
                /** Sent as `MOR` in the Nacha file. */
                MORTGAGE,
                /** Sent as `PEN` in the Nacha file. */
                PENSION,
                /** Sent as `REM` in the Nacha file. */
                REMITTANCE,
                /** Sent as `RLS` in the Nacha file. */
                RENT_OR_LEASE,
                /** Sent as `SAL` in the Nacha file. */
                SALARY_OR_PAYROLL,
                /** Sent as `TAX` in the Nacha file. */
                TAX,
                /** Sent as `ARC` in the Nacha file. */
                ACCOUNTS_RECEIVABLE,
                /** Sent as `BOC` in the Nacha file. */
                BACK_OFFICE_CONVERSION,
                /** Sent as `MTE` in the Nacha file. */
                MACHINE_TRANSFER,
                /** Sent as `POP` in the Nacha file. */
                POINT_OF_PURCHASE,
                /** Sent as `POS` in the Nacha file. */
                POINT_OF_SALE,
                /** Sent as `RCK` in the Nacha file. */
                REPRESENTED_CHECK,
                /** Sent as `SHR` in the Nacha file. */
                SHARED_NETWORK_TRANSACTION,
                /** Sent as `TEL` in the Nacha file. */
                TELPHONE_INITIATED,
                /** Sent as `WEB` in the Nacha file. */
                INTERNET_INITIATED,
                /**
                 * An enum member indicating that [InternationalTransactionTypeCode] was
                 * instantiated with an unknown value.
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
                    ANNUITY -> Value.ANNUITY
                    BUSINESS_OR_COMMERCIAL -> Value.BUSINESS_OR_COMMERCIAL
                    DEPOSIT -> Value.DEPOSIT
                    LOAN -> Value.LOAN
                    MISCELLANEOUS -> Value.MISCELLANEOUS
                    MORTGAGE -> Value.MORTGAGE
                    PENSION -> Value.PENSION
                    REMITTANCE -> Value.REMITTANCE
                    RENT_OR_LEASE -> Value.RENT_OR_LEASE
                    SALARY_OR_PAYROLL -> Value.SALARY_OR_PAYROLL
                    TAX -> Value.TAX
                    ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                    BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                    MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                    POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                    POINT_OF_SALE -> Value.POINT_OF_SALE
                    REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                    SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                    TELPHONE_INITIATED -> Value.TELPHONE_INITIATED
                    INTERNET_INITIATED -> Value.INTERNET_INITIATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    ANNUITY -> Known.ANNUITY
                    BUSINESS_OR_COMMERCIAL -> Known.BUSINESS_OR_COMMERCIAL
                    DEPOSIT -> Known.DEPOSIT
                    LOAN -> Known.LOAN
                    MISCELLANEOUS -> Known.MISCELLANEOUS
                    MORTGAGE -> Known.MORTGAGE
                    PENSION -> Known.PENSION
                    REMITTANCE -> Known.REMITTANCE
                    RENT_OR_LEASE -> Known.RENT_OR_LEASE
                    SALARY_OR_PAYROLL -> Known.SALARY_OR_PAYROLL
                    TAX -> Known.TAX
                    ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                    BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                    MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                    POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                    POINT_OF_SALE -> Known.POINT_OF_SALE
                    REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                    SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                    TELPHONE_INITIATED -> Known.TELPHONE_INITIATED
                    INTERNET_INITIATED -> Known.INTERNET_INITIATED
                    else -> throw IncreaseInvalidDataException("Unknown InternationalTransactionTypeCode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is InternationalTransactionTypeCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the
         * `originating_depository_financial_institution_id` field for this Transaction.
         */
        class OriginatingDepositoryFinancialInstitutionIdQualifier @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                val NATIONAL_CLEARING_SYSTEM_NUMBER = of("national_clearing_system_number")

                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                val BIC_CODE = of("bic_code")

                /** An International Bank Account Number. */
                val IBAN = of("iban")

                fun of(value: String) = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
            }

            /**
             * An enum containing [OriginatingDepositoryFinancialInstitutionIdQualifier]'s
             * known values.
             */
            enum class Known {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
            }

            /**
             * An enum containing [OriginatingDepositoryFinancialInstitutionIdQualifier]'s
             * known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OriginatingDepositoryFinancialInstitutionIdQualifier] can
             * contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
                /**
                 * An enum member indicating that
                 * [OriginatingDepositoryFinancialInstitutionIdQualifier] was instantiated with an
                 * unknown value.
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Value.BIC_CODE
                    IBAN -> Value.IBAN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Known.BIC_CODE
                    IBAN -> Known.IBAN
                    else -> throw IncreaseInvalidDataException("Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is OriginatingDepositoryFinancialInstitutionIdQualifier && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the
         * `receiving_depository_financial_institution_id` field for this Transaction.
         */
        class ReceivingDepositoryFinancialInstitutionIdQualifier @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                val NATIONAL_CLEARING_SYSTEM_NUMBER = of("national_clearing_system_number")

                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                val BIC_CODE = of("bic_code")

                /** An International Bank Account Number. */
                val IBAN = of("iban")

                fun of(value: String) = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
            }

            /**
             * An enum containing [ReceivingDepositoryFinancialInstitutionIdQualifier]'s known
             * values.
             */
            enum class Known {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
            }

            /**
             * An enum containing [ReceivingDepositoryFinancialInstitutionIdQualifier]'s known
             * values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ReceivingDepositoryFinancialInstitutionIdQualifier] can contain
             * an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
                /**
                 * An enum member indicating that
                 * [ReceivingDepositoryFinancialInstitutionIdQualifier] was instantiated with an
                 * unknown value.
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Value.BIC_CODE
                    IBAN -> Value.IBAN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Known.BIC_CODE
                    IBAN -> Known.IBAN
                    else -> throw IncreaseInvalidDataException("Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is ReceivingDepositoryFinancialInstitutionIdQualifier && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is InternationalAddenda && destinationCountryCode == other.destinationCountryCode && destinationCurrencyCode == other.destinationCurrencyCode && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeReference == other.foreignExchangeReference && foreignExchangeReferenceIndicator == other.foreignExchangeReferenceIndicator && foreignPaymentAmount == other.foreignPaymentAmount && foreignTraceNumber == other.foreignTraceNumber && internationalTransactionTypeCode == other.internationalTransactionTypeCode && originatingCurrencyCode == other.originatingCurrencyCode && originatingDepositoryFinancialInstitutionBranchCountry == other.originatingDepositoryFinancialInstitutionBranchCountry && originatingDepositoryFinancialInstitutionId == other.originatingDepositoryFinancialInstitutionId && originatingDepositoryFinancialInstitutionIdQualifier == other.originatingDepositoryFinancialInstitutionIdQualifier && originatingDepositoryFinancialInstitutionName == other.originatingDepositoryFinancialInstitutionName && originatorCity == other.originatorCity && originatorCountry == other.originatorCountry && originatorIdentification == other.originatorIdentification && originatorName == other.originatorName && originatorPostalCode == other.originatorPostalCode && originatorStateOrProvince == other.originatorStateOrProvince && originatorStreetAddress == other.originatorStreetAddress && paymentRelatedInformation == other.paymentRelatedInformation && paymentRelatedInformation2 == other.paymentRelatedInformation2 && receiverCity == other.receiverCity && receiverCountry == other.receiverCountry && receiverIdentificationNumber == other.receiverIdentificationNumber && receiverPostalCode == other.receiverPostalCode && receiverStateOrProvince == other.receiverStateOrProvince && receiverStreetAddress == other.receiverStreetAddress && receivingCompanyOrIndividualName == other.receivingCompanyOrIndividualName && receivingDepositoryFinancialInstitutionCountry == other.receivingDepositoryFinancialInstitutionCountry && receivingDepositoryFinancialInstitutionId == other.receivingDepositoryFinancialInstitutionId && receivingDepositoryFinancialInstitutionIdQualifier == other.receivingDepositoryFinancialInstitutionIdQualifier && receivingDepositoryFinancialInstitutionName == other.receivingDepositoryFinancialInstitutionName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(destinationCountryCode, destinationCurrencyCode, foreignExchangeIndicator, foreignExchangeReference, foreignExchangeReferenceIndicator, foreignPaymentAmount, foreignTraceNumber, internationalTransactionTypeCode, originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName, originatorCity, originatorCountry, originatorIdentification, originatorName, originatorPostalCode, originatorStateOrProvince, originatorStreetAddress, paymentRelatedInformation, paymentRelatedInformation2, receiverCity, receiverCountry, receiverIdentificationNumber, receiverPostalCode, receiverStateOrProvince, receiverStreetAddress, receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "InternationalAddenda{destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReference=$foreignExchangeReference, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatorCity=$originatorCity, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStateOrProvince=$originatorStateOrProvince, originatorStreetAddress=$originatorStreetAddress, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverCity=$receiverCity, receiverCountry=$receiverCountry, receiverIdentificationNumber=$receiverIdentificationNumber, receiverPostalCode=$receiverPostalCode, receiverStateOrProvince=$receiverStateOrProvince, receiverStreetAddress=$receiverStreetAddress, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, additionalProperties=$additionalProperties}"
    }

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    @NoAutoDetect
    class NotificationOfChange @JsonCreator private constructor(
        @JsonProperty("updated_account_number") @ExcludeMissing private val updatedAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_routing_number") @ExcludeMissing private val updatedRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The new account number provided in the notification of change. */
        fun updatedAccountNumber(): String? = updatedAccountNumber.getNullable("updated_account_number")

        /** The new account number provided in the notification of change. */
        fun updatedRoutingNumber(): String? = updatedRoutingNumber.getNullable("updated_routing_number")

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber(): JsonField<String> = updatedAccountNumber

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber(): JsonField<String> = updatedRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NotificationOfChange =
            apply {
                if (validated) {
                  return@apply
                }

                updatedAccountNumber()
                updatedRoutingNumber()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [NotificationOfChange].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .updatedAccountNumber()
             * .updatedRoutingNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NotificationOfChange]. */
        class Builder internal constructor() {

            private var updatedAccountNumber: JsonField<String>? = null
            private var updatedRoutingNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(notificationOfChange: NotificationOfChange) =
                apply {
                    updatedAccountNumber = notificationOfChange.updatedAccountNumber
                    updatedRoutingNumber = notificationOfChange.updatedRoutingNumber
                    additionalProperties = notificationOfChange.additionalProperties.toMutableMap()
                }

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String?) = updatedAccountNumber(JsonField.ofNullable(updatedAccountNumber))

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) =
                apply {
                    this.updatedAccountNumber = updatedAccountNumber
                }

            /** The new account number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String?) = updatedRoutingNumber(JsonField.ofNullable(updatedRoutingNumber))

            /** The new account number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) =
                apply {
                    this.updatedRoutingNumber = updatedRoutingNumber
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): NotificationOfChange =
                NotificationOfChange(
                  checkRequired(
                    "updatedAccountNumber", updatedAccountNumber
                  ),
                  checkRequired(
                    "updatedRoutingNumber", updatedRoutingNumber
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is NotificationOfChange && updatedAccountNumber == other.updatedAccountNumber && updatedRoutingNumber == other.updatedRoutingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(updatedAccountNumber, updatedRoutingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "NotificationOfChange{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    /** The Standard Entry Class (SEC) code of the transfer. */
    class StandardEntryClassCode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** Corporate Credit and Debit (CCD). */
            val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /** Corporate Trade Exchange (CTX). */
            val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /** Prearranged Payments and Deposits (PPD). */
            val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /** Internet Initiated (WEB). */
            val INTERNET_INITIATED = of("internet_initiated")

            /** Point of Sale (POS). */
            val POINT_OF_SALE = of("point_of_sale")

            /** Telephone Initiated (TEL). */
            val TELEPHONE_INITIATED = of("telephone_initiated")

            /** Customer Initiated (CIE). */
            val CUSTOMER_INITIATED = of("customer_initiated")

            /** Accounts Receivable (ARC). */
            val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

            /** Machine Transfer (MTE). */
            val MACHINE_TRANSFER = of("machine_transfer")

            /** Shared Network Transaction (SHR). */
            val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

            /** Represented Check (RCK). */
            val REPRESENTED_CHECK = of("represented_check")

            /** Back Office Conversion (BOC). */
            val BACK_OFFICE_CONVERSION = of("back_office_conversion")

            /** Point of Purchase (POP). */
            val POINT_OF_PURCHASE = of("point_of_purchase")

            /** Check Truncation (TRC). */
            val CHECK_TRUNCATION = of("check_truncation")

            /** Destroyed Check (XCK). */
            val DESTROYED_CHECK = of("destroyed_check")

            /** International ACH Transaction (IAT). */
            val INTERNATIONAL_ACH_TRANSACTION = of("international_ach_transaction")

            fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
        }

        /**
         * An enum containing [StandardEntryClassCode]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [StandardEntryClassCode] can contain an unknown value in a couple
         * of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
            /**
             * An enum member indicating that [StandardEntryClassCode] was instantiated with an
             * unknown value.
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
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                POINT_OF_SALE -> Value.POINT_OF_SALE
                TELEPHONE_INITIATED -> Value.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Value.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Value.CHECK_TRUNCATION
                DESTROYED_CHECK -> Value.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Value.INTERNATIONAL_ACH_TRANSACTION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                POINT_OF_SALE -> Known.POINT_OF_SALE
                TELEPHONE_INITIATED -> Known.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Known.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Known.CHECK_TRUNCATION
                DESTROYED_CHECK -> Known.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Known.INTERNATIONAL_ACH_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the transfer. */
    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /**
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            val PENDING = of("pending")

            /** The Inbound ACH Transfer has been declined. */
            val DECLINED = of("declined")

            /** The Inbound ACH Transfer is accepted. */
            val ACCEPTED = of("accepted")

            /** The Inbound ACH Transfer has been returned. */
            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /**
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound ACH Transfer has been declined. */
            DECLINED,
            /** The Inbound ACH Transfer is accepted. */
            ACCEPTED,
            /** The Inbound ACH Transfer has been returned. */
            RETURNED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound ACH Transfer has been declined. */
            DECLINED,
            /** The Inbound ACH Transfer is accepted. */
            ACCEPTED,
            /** The Inbound ACH Transfer has been returned. */
            RETURNED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                DECLINED -> Value.DECLINED
                ACCEPTED -> Value.ACCEPTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                DECLINED -> Known.DECLINED
                ACCEPTED -> Known.ACCEPTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If your transfer is returned, this will contain details of the return. */
    @NoAutoDetect
    class TransferReturn @JsonCreator private constructor(
        @JsonProperty("reason") @ExcludeMissing private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("returned_at") @ExcludeMissing private val returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id") @ExcludeMissing private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The reason for the transfer return. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason for the transfer return. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun _reason(): JsonField<Reason> = reason

        /** The time at which the transfer was returned. */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt(): JsonField<OffsetDateTime> = returnedAt

        /** The id of the transaction for the returned transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransferReturn =
            apply {
                if (validated) {
                  return@apply
                }

                reason()
                returnedAt()
                transactionId()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TransferReturn].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .reason()
             * .returnedAt()
             * .transactionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TransferReturn]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var returnedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transferReturn: TransferReturn) =
                apply {
                    reason = transferReturn.reason
                    returnedAt = transferReturn.returnedAt
                    transactionId = transferReturn.transactionId
                    additionalProperties = transferReturn.additionalProperties.toMutableMap()
                }

            /** The reason for the transfer return. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer return. */
            fun reason(reason: JsonField<Reason>) =
                apply {
                    this.reason = reason
                }

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.returnedAt = returnedAt
                }

            /** The id of the transaction for the returned transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned transfer. */
            fun transactionId(transactionId: JsonField<String>) =
                apply {
                    this.transactionId = transactionId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): TransferReturn =
                TransferReturn(
                  checkRequired(
                    "reason", reason
                  ),
                  checkRequired(
                    "returnedAt", returnedAt
                  ),
                  checkRequired(
                    "transactionId", transactionId
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        /** The reason for the transfer return. */
        class Reason @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request. The Nacha return code is R06.
                 */
                val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is
                 * R07.
                 */
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed
                 * for debits. The Nacha return code is R08.
                 */
                val PAYMENT_STOPPED = of("payment_stopped")

                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** The payee is deceased. The Nacha return code is R14. */
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY = of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /** The account holder is deceased. The Nacha return code is R15. */
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = of("beneficiary_or_account_holder_deceased")

                /**
                 * The customer refused a credit entry. This reason is only allowed for credits.
                 * The Nacha return code is R23.
                 */
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                val DUPLICATE_ENTRY = of("duplicate_entry")

                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = of("corporate_customer_advised_not_authorized")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request. The Nacha return code is R06.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is
                 * R07.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed
                 * for debits. The Nacha return code is R08.
                 */
                PAYMENT_STOPPED,
                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. The Nacha return code is R14. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. The Nacha return code is R15. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * The customer refused a credit entry. This reason is only allowed for credits.
                 * The Nacha return code is R23.
                 */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                DUPLICATE_ENTRY,
                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned.
                 * The receiving bank is complying with the request. The Nacha return code is R06.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is
                 * R07.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed
                 * for debits. The Nacha return code is R08.
                 */
                PAYMENT_STOPPED,
                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. The Nacha return code is R14. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. The Nacha return code is R15. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * The customer refused a credit entry. This reason is only allowed for credits.
                 * The Nacha return code is R23.
                 */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                DUPLICATE_ENTRY,
                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is TransferReturn && reason == other.reason && returnedAt == other.returnedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, returnedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "TransferReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    class Type @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            val INBOUND_ACH_TRANSFER = of("inbound_ach_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_ACH_TRANSFER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_ACH_TRANSFER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

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

      return /* spotless:off */ other is InboundAchTransfer && id == other.id && acceptance == other.acceptance && accountId == other.accountId && accountNumberId == other.accountNumberId && addenda == other.addenda && amount == other.amount && automaticallyResolvesAt == other.automaticallyResolvesAt && createdAt == other.createdAt && decline == other.decline && direction == other.direction && effectiveDate == other.effectiveDate && expectedSettlementSchedule == other.expectedSettlementSchedule && internationalAddenda == other.internationalAddenda && notificationOfChange == other.notificationOfChange && originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate && originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData && originatorCompanyEntryDescription == other.originatorCompanyEntryDescription && originatorCompanyId == other.originatorCompanyId && originatorCompanyName == other.originatorCompanyName && originatorRoutingNumber == other.originatorRoutingNumber && receiverIdNumber == other.receiverIdNumber && receiverName == other.receiverName && standardEntryClassCode == other.standardEntryClassCode && status == other.status && traceNumber == other.traceNumber && transferReturn == other.transferReturn && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, acceptance, accountId, accountNumberId, addenda, amount, automaticallyResolvesAt, createdAt, decline, direction, effectiveDate, expectedSettlementSchedule, internationalAddenda, notificationOfChange, originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData, originatorCompanyEntryDescription, originatorCompanyId, originatorCompanyName, originatorRoutingNumber, receiverIdNumber, receiverName, standardEntryClassCode, status, traceNumber, transferReturn, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "InboundAchTransfer{id=$id, acceptance=$acceptance, accountId=$accountId, accountNumberId=$accountNumberId, addenda=$addenda, amount=$amount, automaticallyResolvesAt=$automaticallyResolvesAt, createdAt=$createdAt, decline=$decline, direction=$direction, effectiveDate=$effectiveDate, expectedSettlementSchedule=$expectedSettlementSchedule, internationalAddenda=$internationalAddenda, notificationOfChange=$notificationOfChange, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, originatorRoutingNumber=$originatorRoutingNumber, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, standardEntryClassCode=$standardEntryClassCode, status=$status, traceNumber=$traceNumber, transferReturn=$transferReturn, type=$type, additionalProperties=$additionalProperties}"
}
