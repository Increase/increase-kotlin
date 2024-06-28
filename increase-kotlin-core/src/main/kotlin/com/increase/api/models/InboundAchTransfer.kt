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
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** An Inbound ACH Transfer is an ACH transfer initiated outside of Increase to your account. */
@JsonDeserialize(builder = InboundAchTransfer.Builder::class)
@NoAutoDetect
class InboundAchTransfer
private constructor(
    private val acceptance: JsonField<Acceptance>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val addenda: JsonField<Addenda>,
    private val amount: JsonField<Long>,
    private val automaticallyResolvesAt: JsonField<OffsetDateTime>,
    private val decline: JsonField<Decline>,
    private val direction: JsonField<Direction>,
    private val id: JsonField<String>,
    private val notificationOfChange: JsonField<NotificationOfChange>,
    private val originatorCompanyDescriptiveDate: JsonField<String>,
    private val originatorCompanyDiscretionaryData: JsonField<String>,
    private val originatorCompanyEntryDescription: JsonField<String>,
    private val originatorCompanyId: JsonField<String>,
    private val originatorCompanyName: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val receiverIdNumber: JsonField<String>,
    private val receiverName: JsonField<String>,
    private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
    private val status: JsonField<Status>,
    private val traceNumber: JsonField<String>,
    private val transferReturn: JsonField<TransferReturn>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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
    fun automaticallyResolvesAt(): OffsetDateTime =
        automaticallyResolvesAt.getRequired("automatically_resolves_at")

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Decline? = decline.getNullable("decline")

    /** The direction of the transfer. */
    fun direction(): Direction = direction.getRequired("direction")

    /** The inbound ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    fun notificationOfChange(): NotificationOfChange? =
        notificationOfChange.getNullable("notification_of_change")

    /** The descriptive date of the transfer. */
    fun originatorCompanyDescriptiveDate(): String? =
        originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date")

    /** The additional information included with the transfer. */
    fun originatorCompanyDiscretionaryData(): String? =
        originatorCompanyDiscretionaryData.getNullable("originator_company_discretionary_data")

    /** The description of the transfer. */
    fun originatorCompanyEntryDescription(): String =
        originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /** The id of the company that initiated the transfer. */
    fun originatorCompanyId(): String = originatorCompanyId.getRequired("originator_company_id")

    /** The name of the company that initiated the transfer. */
    fun originatorCompanyName(): String =
        originatorCompanyName.getRequired("originator_company_name")

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /** The id of the receiver of the transfer. */
    fun receiverIdNumber(): String? = receiverIdNumber.getNullable("receiver_id_number")

    /** The name of the receiver of the transfer. */
    fun receiverName(): String? = receiverName.getNullable("receiver_name")

    /** The Standard Entry Class (SEC) code of the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode =
        standardEntryClassCode.getRequired("standard_entry_class_code")

    /** The status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The trace number of the transfer. */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /** If your transfer is returned, this will contain details of the return. */
    fun transferReturn(): TransferReturn? = transferReturn.getNullable("transfer_return")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonProperty("acceptance") @ExcludeMissing fun _acceptance() = acceptance

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** Additional information sent from the originator. */
    @JsonProperty("addenda") @ExcludeMissing fun _addenda() = addenda

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The time at which the transfer will be automatically resolved. */
    @JsonProperty("automatically_resolves_at")
    @ExcludeMissing
    fun _automaticallyResolvesAt() = automaticallyResolvesAt

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline") @ExcludeMissing fun _decline() = decline

    /** The direction of the transfer. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** The inbound ACH transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange() = notificationOfChange

    /** The descriptive date of the transfer. */
    @JsonProperty("originator_company_descriptive_date")
    @ExcludeMissing
    fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

    /** The additional information included with the transfer. */
    @JsonProperty("originator_company_discretionary_data")
    @ExcludeMissing
    fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

    /** The description of the transfer. */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

    /** The id of the company that initiated the transfer. */
    @JsonProperty("originator_company_id")
    @ExcludeMissing
    fun _originatorCompanyId() = originatorCompanyId

    /** The name of the company that initiated the transfer. */
    @JsonProperty("originator_company_name")
    @ExcludeMissing
    fun _originatorCompanyName() = originatorCompanyName

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber() = originatorRoutingNumber

    /** The id of the receiver of the transfer. */
    @JsonProperty("receiver_id_number") @ExcludeMissing fun _receiverIdNumber() = receiverIdNumber

    /** The name of the receiver of the transfer. */
    @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

    /** The Standard Entry Class (SEC) code of the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode() = standardEntryClassCode

    /** The status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The trace number of the transfer. */
    @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("transfer_return") @ExcludeMissing fun _transferReturn() = transferReturn

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundAchTransfer = apply {
        if (!validated) {
            acceptance()?.validate()
            accountId()
            accountNumberId()
            addenda()?.validate()
            amount()
            automaticallyResolvesAt()
            decline()?.validate()
            direction()
            id()
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
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransfer &&
            this.acceptance == other.acceptance &&
            this.accountId == other.accountId &&
            this.accountNumberId == other.accountNumberId &&
            this.addenda == other.addenda &&
            this.amount == other.amount &&
            this.automaticallyResolvesAt == other.automaticallyResolvesAt &&
            this.decline == other.decline &&
            this.direction == other.direction &&
            this.id == other.id &&
            this.notificationOfChange == other.notificationOfChange &&
            this.originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate &&
            this.originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData &&
            this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
            this.originatorCompanyId == other.originatorCompanyId &&
            this.originatorCompanyName == other.originatorCompanyName &&
            this.originatorRoutingNumber == other.originatorRoutingNumber &&
            this.receiverIdNumber == other.receiverIdNumber &&
            this.receiverName == other.receiverName &&
            this.standardEntryClassCode == other.standardEntryClassCode &&
            this.status == other.status &&
            this.traceNumber == other.traceNumber &&
            this.transferReturn == other.transferReturn &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    acceptance,
                    accountId,
                    accountNumberId,
                    addenda,
                    amount,
                    automaticallyResolvesAt,
                    decline,
                    direction,
                    id,
                    notificationOfChange,
                    originatorCompanyDescriptiveDate,
                    originatorCompanyDiscretionaryData,
                    originatorCompanyEntryDescription,
                    originatorCompanyId,
                    originatorCompanyName,
                    originatorRoutingNumber,
                    receiverIdNumber,
                    receiverName,
                    standardEntryClassCode,
                    status,
                    traceNumber,
                    transferReturn,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundAchTransfer{acceptance=$acceptance, accountId=$accountId, accountNumberId=$accountNumberId, addenda=$addenda, amount=$amount, automaticallyResolvesAt=$automaticallyResolvesAt, decline=$decline, direction=$direction, id=$id, notificationOfChange=$notificationOfChange, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, originatorRoutingNumber=$originatorRoutingNumber, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, standardEntryClassCode=$standardEntryClassCode, status=$status, traceNumber=$traceNumber, transferReturn=$transferReturn, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var acceptance: JsonField<Acceptance> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var addenda: JsonField<Addenda> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var automaticallyResolvesAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var decline: JsonField<Decline> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of()
        private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
        private var originatorCompanyId: JsonField<String> = JsonMissing.of()
        private var originatorCompanyName: JsonField<String> = JsonMissing.of()
        private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var receiverIdNumber: JsonField<String> = JsonMissing.of()
        private var receiverName: JsonField<String> = JsonMissing.of()
        private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var traceNumber: JsonField<String> = JsonMissing.of()
        private var transferReturn: JsonField<TransferReturn> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
            this.acceptance = inboundAchTransfer.acceptance
            this.accountId = inboundAchTransfer.accountId
            this.accountNumberId = inboundAchTransfer.accountNumberId
            this.addenda = inboundAchTransfer.addenda
            this.amount = inboundAchTransfer.amount
            this.automaticallyResolvesAt = inboundAchTransfer.automaticallyResolvesAt
            this.decline = inboundAchTransfer.decline
            this.direction = inboundAchTransfer.direction
            this.id = inboundAchTransfer.id
            this.notificationOfChange = inboundAchTransfer.notificationOfChange
            this.originatorCompanyDescriptiveDate =
                inboundAchTransfer.originatorCompanyDescriptiveDate
            this.originatorCompanyDiscretionaryData =
                inboundAchTransfer.originatorCompanyDiscretionaryData
            this.originatorCompanyEntryDescription =
                inboundAchTransfer.originatorCompanyEntryDescription
            this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
            this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
            this.originatorRoutingNumber = inboundAchTransfer.originatorRoutingNumber
            this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
            this.receiverName = inboundAchTransfer.receiverName
            this.standardEntryClassCode = inboundAchTransfer.standardEntryClassCode
            this.status = inboundAchTransfer.status
            this.traceNumber = inboundAchTransfer.traceNumber
            this.transferReturn = inboundAchTransfer.transferReturn
            this.type = inboundAchTransfer.type
            additionalProperties(inboundAchTransfer.additionalProperties)
        }

        /** If your transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: Acceptance) = acceptance(JsonField.of(acceptance))

        /** If your transfer is accepted, this will contain details of the acceptance. */
        @JsonProperty("acceptance")
        @ExcludeMissing
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Additional information sent from the originator. */
        fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

        /** Additional information sent from the originator. */
        @JsonProperty("addenda")
        @ExcludeMissing
        fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: OffsetDateTime) =
            automaticallyResolvesAt(JsonField.of(automaticallyResolvesAt))

        /** The time at which the transfer will be automatically resolved. */
        @JsonProperty("automatically_resolves_at")
        @ExcludeMissing
        fun automaticallyResolvesAt(automaticallyResolvesAt: JsonField<OffsetDateTime>) = apply {
            this.automaticallyResolvesAt = automaticallyResolvesAt
        }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline) = decline(JsonField.of(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        @JsonProperty("decline")
        @ExcludeMissing
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** The direction of the transfer. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** The direction of the transfer. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The inbound ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound ACH transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If you initiate a notification of change in response to the transfer, this will contain
         * its details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange) =
            notificationOfChange(JsonField.of(notificationOfChange))

        /**
         * If you initiate a notification of change in response to the transfer, this will contain
         * its details.
         */
        @JsonProperty("notification_of_change")
        @ExcludeMissing
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) = apply {
            this.notificationOfChange = notificationOfChange
        }

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
            originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

        /** The descriptive date of the transfer. */
        @JsonProperty("originator_company_descriptive_date")
        @ExcludeMissing
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: JsonField<String>) =
            apply {
                this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
            }

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
            originatorCompanyDiscretionaryData(JsonField.of(originatorCompanyDiscretionaryData))

        /** The additional information included with the transfer. */
        @JsonProperty("originator_company_discretionary_data")
        @ExcludeMissing
        fun originatorCompanyDiscretionaryData(
            originatorCompanyDiscretionaryData: JsonField<String>
        ) = apply { this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData }

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
            originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /** The description of the transfer. */
        @JsonProperty("originator_company_entry_description")
        @ExcludeMissing
        fun originatorCompanyEntryDescription(
            originatorCompanyEntryDescription: JsonField<String>
        ) = apply { this.originatorCompanyEntryDescription = originatorCompanyEntryDescription }

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: String) =
            originatorCompanyId(JsonField.of(originatorCompanyId))

        /** The id of the company that initiated the transfer. */
        @JsonProperty("originator_company_id")
        @ExcludeMissing
        fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
            this.originatorCompanyId = originatorCompanyId
        }

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: String) =
            originatorCompanyName(JsonField.of(originatorCompanyName))

        /** The name of the company that initiated the transfer. */
        @JsonProperty("originator_company_name")
        @ExcludeMissing
        fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
            this.originatorCompanyName = originatorCompanyName
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) =
            receiverIdNumber(JsonField.of(receiverIdNumber))

        /** The id of the receiver of the transfer. */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            this.receiverIdNumber = receiverIdNumber
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun receiverName(receiverName: JsonField<String>) = apply {
            this.receiverName = receiverName
        }

        /** The Standard Entry Class (SEC) code of the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
            standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code of the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The trace number of the transfer. */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /** The trace number of the transfer. */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun traceNumber(traceNumber: JsonField<String>) = apply { this.traceNumber = traceNumber }

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: TransferReturn) =
            transferReturn(JsonField.of(transferReturn))

        /** If your transfer is returned, this will contain details of the return. */
        @JsonProperty("transfer_return")
        @ExcludeMissing
        fun transferReturn(transferReturn: JsonField<TransferReturn>) = apply {
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): InboundAchTransfer =
            InboundAchTransfer(
                acceptance,
                accountId,
                accountNumberId,
                addenda,
                amount,
                automaticallyResolvesAt,
                decline,
                direction,
                id,
                notificationOfChange,
                originatorCompanyDescriptiveDate,
                originatorCompanyDiscretionaryData,
                originatorCompanyEntryDescription,
                originatorCompanyId,
                originatorCompanyName,
                originatorRoutingNumber,
                receiverIdNumber,
                receiverName,
                standardEntryClassCode,
                status,
                traceNumber,
                transferReturn,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonDeserialize(builder = Acceptance.Builder::class)
    @NoAutoDetect
    class Acceptance
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was accepted. */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /** The id of the transaction for the accepted transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was accepted. */
        @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

        /** The id of the transaction for the accepted transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Acceptance = apply {
            if (!validated) {
                acceptedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Acceptance &&
                this.acceptedAt == other.acceptedAt &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        acceptedAt,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(acceptance: Acceptance) = apply {
                this.acceptedAt = acceptance.acceptedAt
                this.transactionId = acceptance.transactionId
                additionalProperties(acceptance.additionalProperties)
            }

            /** The time at which the transfer was accepted. */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /** The time at which the transfer was accepted. */
            @JsonProperty("accepted_at")
            @ExcludeMissing
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The id of the transaction for the accepted transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the accepted transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Acceptance =
                Acceptance(
                    acceptedAt,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Additional information sent from the originator. */
    @JsonDeserialize(builder = Addenda.Builder::class)
    @NoAutoDetect
    class Addenda
    private constructor(
        private val category: JsonField<Category>,
        private val freeform: JsonField<Freeform>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The type of addendum. */
        fun category(): Category = category.getRequired("category")

        /** Unstructured `payment_related_information` passed through by the originator. */
        fun freeform(): Freeform? = freeform.getNullable("freeform")

        /** The type of addendum. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** Unstructured `payment_related_information` passed through by the originator. */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform() = freeform

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Addenda = apply {
            if (!validated) {
                category()
                freeform()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addenda &&
                this.category == other.category &&
                this.freeform == other.freeform &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        freeform,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) = apply {
                this.category = addenda.category
                this.freeform = addenda.freeform
                additionalProperties(addenda.additionalProperties)
            }

            /** The type of addendum. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of addendum. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through by the originator. */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /** Unstructured `payment_related_information` passed through by the originator. */
            @JsonProperty("freeform")
            @ExcludeMissing
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

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

            fun build(): Addenda =
                Addenda(
                    category,
                    freeform,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val FREEFORM = Category(JsonField.of("freeform"))

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                FREEFORM,
            }

            enum class Value {
                FREEFORM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Unstructured `payment_related_information` passed through by the originator. */
        @JsonDeserialize(builder = Freeform.Builder::class)
        @NoAutoDetect
        class Freeform
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Each entry represents an addendum received from the originator. */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /** Each entry represents an addendum received from the originator. */
            @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Freeform = apply {
                if (!validated) {
                    entries().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Freeform &&
                    this.entries == other.entries &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(entries, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var entries: JsonField<List<Entry>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(freeform: Freeform) = apply {
                    this.entries = freeform.entries
                    additionalProperties(freeform.additionalProperties)
                }

                /** Each entry represents an addendum received from the originator. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /** Each entry represents an addendum received from the originator. */
                @JsonProperty("entries")
                @ExcludeMissing
                fun entries(entries: JsonField<List<Entry>>) = apply { this.entries = entries }

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

                fun build(): Freeform =
                    Freeform(
                        entries.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry
            private constructor(
                private val paymentRelatedInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The payment related information passed in the addendum. */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Entry = apply {
                    if (!validated) {
                        paymentRelatedInformation()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        this.paymentRelatedInformation == other.paymentRelatedInformation &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(paymentRelatedInformation, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(entry: Entry) = apply {
                        this.paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties(entry.additionalProperties)
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** The payment related information passed in the addendum. */
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

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

                    fun build(): Entry =
                        Entry(paymentRelatedInformation, additionalProperties.toUnmodifiable())
                }
            }
        }
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonDeserialize(builder = Decline.Builder::class)
    @NoAutoDetect
    class Decline
    private constructor(
        private val declinedAt: JsonField<OffsetDateTime>,
        private val declinedTransactionId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at") @ExcludeMissing fun _declinedAt() = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId() = declinedTransactionId

        /** The reason for the transfer decline. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Decline = apply {
            if (!validated) {
                declinedAt()
                declinedTransactionId()
                reason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Decline &&
                this.declinedAt == other.declinedAt &&
                this.declinedTransactionId == other.declinedTransactionId &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        declinedAt,
                        declinedTransactionId,
                        reason,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decline: Decline) = apply {
                this.declinedAt = decline.declinedAt
                this.declinedTransactionId = decline.declinedTransactionId
                this.reason = decline.reason
                additionalProperties(decline.additionalProperties)
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            @JsonProperty("declined_at")
            @ExcludeMissing
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            fun build(): Decline =
                Decline(
                    declinedAt,
                    declinedTransactionId,
                    reason,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                    Reason(JsonField.of("credit_entry_refused_by_receiver"))

                val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                val FIELD_ERROR = Reason(JsonField.of("field_error"))

                val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

                val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                FIELD_ERROR,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
            }

            enum class Value {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                FIELD_ERROR,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Value.BREACHES_LIMIT
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    FIELD_ERROR -> Value.FIELD_ERROR
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    MISROUTED_RETURN -> Value.MISROUTED_RETURN
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                    ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                    TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Value.USER_INITIATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Known.BREACHES_LIMIT
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    FIELD_ERROR -> Known.FIELD_ERROR
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    MISROUTED_RETURN -> Known.MISROUTED_RETURN
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                    ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                    TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Known.USER_INITIATED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
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

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    @JsonDeserialize(builder = NotificationOfChange.Builder::class)
    @NoAutoDetect
    class NotificationOfChange
    private constructor(
        private val updatedAccountNumber: JsonField<String>,
        private val updatedRoutingNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The new account number provided in the notification of change. */
        fun updatedAccountNumber(): String? =
            updatedAccountNumber.getNullable("updated_account_number")

        /** The new account number provided in the notification of change. */
        fun updatedRoutingNumber(): String? =
            updatedRoutingNumber.getNullable("updated_routing_number")

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber() = updatedAccountNumber

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber() = updatedRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NotificationOfChange = apply {
            if (!validated) {
                updatedAccountNumber()
                updatedRoutingNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NotificationOfChange &&
                this.updatedAccountNumber == other.updatedAccountNumber &&
                this.updatedRoutingNumber == other.updatedRoutingNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        updatedAccountNumber,
                        updatedRoutingNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NotificationOfChange{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var updatedAccountNumber: JsonField<String> = JsonMissing.of()
            private var updatedRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(notificationOfChange: NotificationOfChange) = apply {
                this.updatedAccountNumber = notificationOfChange.updatedAccountNumber
                this.updatedRoutingNumber = notificationOfChange.updatedRoutingNumber
                additionalProperties(notificationOfChange.additionalProperties)
            }

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String) =
                updatedAccountNumber(JsonField.of(updatedAccountNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_account_number")
            @ExcludeMissing
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The new account number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String) =
                updatedRoutingNumber(JsonField.of(updatedRoutingNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_routing_number")
            @ExcludeMissing
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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

            fun build(): NotificationOfChange =
                NotificationOfChange(
                    updatedAccountNumber,
                    updatedRoutingNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class StandardEntryClassCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StandardEntryClassCode && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CORPORATE_CREDIT_OR_DEBIT =
                StandardEntryClassCode(JsonField.of("corporate_credit_or_debit"))

            val CORPORATE_TRADE_EXCHANGE =
                StandardEntryClassCode(JsonField.of("corporate_trade_exchange"))

            val PREARRANGED_PAYMENTS_AND_DEPOSIT =
                StandardEntryClassCode(JsonField.of("prearranged_payments_and_deposit"))

            val INTERNET_INITIATED = StandardEntryClassCode(JsonField.of("internet_initiated"))

            val POINT_OF_SALE = StandardEntryClassCode(JsonField.of("point_of_sale"))

            val TELEPHONE_INITIATED = StandardEntryClassCode(JsonField.of("telephone_initiated"))

            val CUSTOMER_INITIATED = StandardEntryClassCode(JsonField.of("customer_initiated"))

            val ACCOUNTS_RECEIVABLE = StandardEntryClassCode(JsonField.of("accounts_receivable"))

            val MACHINE_TRANSFER = StandardEntryClassCode(JsonField.of("machine_transfer"))

            val SHARED_NETWORK_TRANSACTION =
                StandardEntryClassCode(JsonField.of("shared_network_transaction"))

            val REPRESENTED_CHECK = StandardEntryClassCode(JsonField.of("represented_check"))

            val BACK_OFFICE_CONVERSION =
                StandardEntryClassCode(JsonField.of("back_office_conversion"))

            val POINT_OF_PURCHASE = StandardEntryClassCode(JsonField.of("point_of_purchase"))

            val CHECK_TRUNCATION = StandardEntryClassCode(JsonField.of("check_truncation"))

            val DESTROYED_CHECK = StandardEntryClassCode(JsonField.of("destroyed_check"))

            fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            POINT_OF_SALE,
            TELEPHONE_INITIATED,
            CUSTOMER_INITIATED,
            ACCOUNTS_RECEIVABLE,
            MACHINE_TRANSFER,
            SHARED_NETWORK_TRANSACTION,
            REPRESENTED_CHECK,
            BACK_OFFICE_CONVERSION,
            POINT_OF_PURCHASE,
            CHECK_TRUNCATION,
            DESTROYED_CHECK,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            POINT_OF_SALE,
            TELEPHONE_INITIATED,
            CUSTOMER_INITIATED,
            ACCOUNTS_RECEIVABLE,
            MACHINE_TRANSFER,
            SHARED_NETWORK_TRANSACTION,
            REPRESENTED_CHECK,
            BACK_OFFICE_CONVERSION,
            POINT_OF_PURCHASE,
            CHECK_TRUNCATION,
            DESTROYED_CHECK,
            _UNKNOWN,
        }

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
                else -> Value._UNKNOWN
            }

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
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val DECLINED = Status(JsonField.of("declined"))

            val ACCEPTED = Status(JsonField.of("accepted"))

            val RETURNED = Status(JsonField.of("returned"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                DECLINED -> Value.DECLINED
                ACCEPTED -> Value.ACCEPTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                DECLINED -> Known.DECLINED
                ACCEPTED -> Known.ACCEPTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** If your transfer is returned, this will contain details of the return. */
    @JsonDeserialize(builder = TransferReturn.Builder::class)
    @NoAutoDetect
    class TransferReturn
    private constructor(
        private val reason: JsonField<Reason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The reason for the transfer return. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason for the transfer return. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time at which the transfer was returned. */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /** The id of the transaction for the returned transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransferReturn = apply {
            if (!validated) {
                reason()
                returnedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransferReturn &&
                this.reason == other.reason &&
                this.returnedAt == other.returnedAt &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        reason,
                        returnedAt,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransferReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transferReturn: TransferReturn) = apply {
                this.reason = transferReturn.reason
                this.returnedAt = transferReturn.returnedAt
                this.transactionId = transferReturn.transactionId
                additionalProperties(transferReturn.additionalProperties)
            }

            /** The reason for the transfer return. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer return. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the transfer was returned. */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): TransferReturn =
                TransferReturn(
                    reason,
                    returnedAt,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                val RETURNED_PER_ODFI_REQUEST = Reason(JsonField.of("returned_per_odfi_request"))

                val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                    Reason(JsonField.of("authorization_revoked_by_customer"))

                val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    Reason(
                        JsonField.of(
                            "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                        )
                    )

                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    Reason(
                        JsonField.of(
                            "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                        )
                    )

                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

                val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                    Reason(JsonField.of("credit_entry_refused_by_receiver"))

                val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    Reason(JsonField.of("corporate_customer_advised_not_authorized"))

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                INSUFFICIENT_FUNDS,
                RETURNED_PER_ODFI_REQUEST,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                PAYMENT_STOPPED,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_ENTRY,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            }

            enum class Value {
                INSUFFICIENT_FUNDS,
                RETURNED_PER_ODFI_REQUEST,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                PAYMENT_STOPPED,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_ENTRY,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INBOUND_ACH_TRANSFER = Type(JsonField.of("inbound_ach_transfer"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_ACH_TRANSFER,
        }

        enum class Value {
            INBOUND_ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
