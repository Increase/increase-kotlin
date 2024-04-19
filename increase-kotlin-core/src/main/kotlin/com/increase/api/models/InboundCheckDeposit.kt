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

/**
 * Inbound Check Deposits are records of third-parties attempting to deposit checks against your
 * account.
 */
@JsonDeserialize(builder = InboundCheckDeposit.Builder::class)
@NoAutoDetect
class InboundCheckDeposit
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val status: JsonField<Status>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val checkTransferId: JsonField<String>,
    private val frontImageFileId: JsonField<String>,
    private val backImageFileId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val declinedTransactionId: JsonField<String>,
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val declinedAt: JsonField<OffsetDateTime>,
    private val bankOfFirstDepositRoutingNumber: JsonField<String>,
    private val checkNumber: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The deposited amount in the minor unit of the destination account currency. For dollars, for
     * example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The status of the Inbound Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /** The Account the check is being deposited against. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The Account Number the check is being deposited against. */
    fun accountNumberId(): String? = accountNumberId.getNullable("account_number_id")

    /** If this deposit is for an existing Check Transfer, the identifier of that Check Transfer. */
    fun checkTransferId(): String? = checkTransferId.getNullable("check_transfer_id")

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): String? = frontImageFileId.getNullable("front_image_file_id")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     */
    fun declinedTransactionId(): String? =
        declinedTransactionId.getNullable("declined_transaction_id")

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    fun acceptedAt(): OffsetDateTime? = acceptedAt.getNullable("accepted_at")

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    fun declinedAt(): OffsetDateTime? = declinedAt.getNullable("declined_at")

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     */
    fun bankOfFirstDepositRoutingNumber(): String? =
        bankOfFirstDepositRoutingNumber.getNullable("bank_of_first_deposit_routing_number")

    /** The check number printed on the check being deposited. */
    fun checkNumber(): String? = checkNumber.getNullable("check_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The deposited amount in the minor unit of the destination account currency. For dollars, for
     * example, this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The status of the Inbound Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Account the check is being deposited against. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Account Number the check is being deposited against. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** If this deposit is for an existing Check Transfer, the identifier of that Check Transfer. */
    @JsonProperty("check_transfer_id") @ExcludeMissing fun _checkTransferId() = checkTransferId

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id") @ExcludeMissing fun _frontImageFileId() = frontImageFileId

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     */
    @JsonProperty("declined_transaction_id")
    @ExcludeMissing
    fun _declinedTransactionId() = declinedTransactionId

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("declined_at") @ExcludeMissing fun _declinedAt() = declinedAt

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     */
    @JsonProperty("bank_of_first_deposit_routing_number")
    @ExcludeMissing
    fun _bankOfFirstDepositRoutingNumber() = bankOfFirstDepositRoutingNumber

    /** The check number printed on the check being deposited. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundCheckDeposit = apply {
        if (!validated) {
            id()
            amount()
            createdAt()
            currency()
            status()
            accountId()
            accountNumberId()
            checkTransferId()
            frontImageFileId()
            backImageFileId()
            transactionId()
            declinedTransactionId()
            acceptedAt()
            declinedAt()
            bankOfFirstDepositRoutingNumber()
            checkNumber()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundCheckDeposit &&
            this.id == other.id &&
            this.amount == other.amount &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.status == other.status &&
            this.accountId == other.accountId &&
            this.accountNumberId == other.accountNumberId &&
            this.checkTransferId == other.checkTransferId &&
            this.frontImageFileId == other.frontImageFileId &&
            this.backImageFileId == other.backImageFileId &&
            this.transactionId == other.transactionId &&
            this.declinedTransactionId == other.declinedTransactionId &&
            this.acceptedAt == other.acceptedAt &&
            this.declinedAt == other.declinedAt &&
            this.bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber &&
            this.checkNumber == other.checkNumber &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    amount,
                    createdAt,
                    currency,
                    status,
                    accountId,
                    accountNumberId,
                    checkTransferId,
                    frontImageFileId,
                    backImageFileId,
                    transactionId,
                    declinedTransactionId,
                    acceptedAt,
                    declinedAt,
                    bankOfFirstDepositRoutingNumber,
                    checkNumber,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundCheckDeposit{id=$id, amount=$amount, createdAt=$createdAt, currency=$currency, status=$status, accountId=$accountId, accountNumberId=$accountNumberId, checkTransferId=$checkTransferId, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, transactionId=$transactionId, declinedTransactionId=$declinedTransactionId, acceptedAt=$acceptedAt, declinedAt=$declinedAt, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, checkNumber=$checkNumber, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var checkTransferId: JsonField<String> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var declinedTransactionId: JsonField<String> = JsonMissing.of()
        private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundCheckDeposit: InboundCheckDeposit) = apply {
            this.id = inboundCheckDeposit.id
            this.amount = inboundCheckDeposit.amount
            this.createdAt = inboundCheckDeposit.createdAt
            this.currency = inboundCheckDeposit.currency
            this.status = inboundCheckDeposit.status
            this.accountId = inboundCheckDeposit.accountId
            this.accountNumberId = inboundCheckDeposit.accountNumberId
            this.checkTransferId = inboundCheckDeposit.checkTransferId
            this.frontImageFileId = inboundCheckDeposit.frontImageFileId
            this.backImageFileId = inboundCheckDeposit.backImageFileId
            this.transactionId = inboundCheckDeposit.transactionId
            this.declinedTransactionId = inboundCheckDeposit.declinedTransactionId
            this.acceptedAt = inboundCheckDeposit.acceptedAt
            this.declinedAt = inboundCheckDeposit.declinedAt
            this.bankOfFirstDepositRoutingNumber =
                inboundCheckDeposit.bankOfFirstDepositRoutingNumber
            this.checkNumber = inboundCheckDeposit.checkNumber
            this.type = inboundCheckDeposit.type
            additionalProperties(inboundCheckDeposit.additionalProperties)
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The deposited amount in the minor unit of the destination account currency. For dollars,
         * for example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The deposited amount in the minor unit of the destination account currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit
         * was attempted.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit
         * was attempted.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The status of the Inbound Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Inbound Check Deposit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Account the check is being deposited against. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check is being deposited against. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Account Number the check is being deposited against. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The Account Number the check is being deposited against. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        fun checkTransferId(checkTransferId: String) =
            checkTransferId(JsonField.of(checkTransferId))

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        @JsonProperty("check_transfer_id")
        @ExcludeMissing
        fun checkTransferId(checkTransferId: JsonField<String>) = apply {
            this.checkTransferId = checkTransferId
        }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String) =
            backImageFileId(JsonField.of(backImageFileId))

        /** The ID for the File containing the image of the back of the check. */
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        fun declinedTransactionId(declinedTransactionId: String) =
            declinedTransactionId(JsonField.of(declinedTransactionId))

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
            this.declinedTransactionId = declinedTransactionId
        }

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
            this.declinedAt = declinedAt
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: String) =
            bankOfFirstDepositRoutingNumber(JsonField.of(bankOfFirstDepositRoutingNumber))

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        @JsonProperty("bank_of_first_deposit_routing_number")
        @ExcludeMissing
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: JsonField<String>) =
            apply {
                this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber
            }

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number printed on the check being deposited. */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_check_deposit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_check_deposit`.
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

        fun build(): InboundCheckDeposit =
            InboundCheckDeposit(
                id,
                amount,
                createdAt,
                currency,
                status,
                accountId,
                accountNumberId,
                checkTransferId,
                frontImageFileId,
                backImageFileId,
                transactionId,
                declinedTransactionId,
                acceptedAt,
                declinedAt,
                bankOfFirstDepositRoutingNumber,
                checkNumber,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CAD = Currency(JsonField.of("CAD"))

            val CHF = Currency(JsonField.of("CHF"))

            val EUR = Currency(JsonField.of("EUR"))

            val GBP = Currency(JsonField.of("GBP"))

            val JPY = Currency(JsonField.of("JPY"))

            val USD = Currency(JsonField.of("USD"))

            fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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

            val ACCEPTED = Status(JsonField.of("accepted"))

            val DECLINED = Status(JsonField.of("declined"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ACCEPTED,
            DECLINED,
        }

        enum class Value {
            PENDING,
            ACCEPTED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val INBOUND_CHECK_DEPOSIT = Type(JsonField.of("inbound_check_deposit"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_CHECK_DEPOSIT,
        }

        enum class Value {
            INBOUND_CHECK_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_CHECK_DEPOSIT -> Value.INBOUND_CHECK_DEPOSIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_CHECK_DEPOSIT -> Known.INBOUND_CHECK_DEPOSIT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
