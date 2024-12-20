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
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Check Deposits allow you to deposit images of paper checks into your account. */
@JsonDeserialize(builder = CheckDeposit.Builder::class)
@NoAutoDetect
class CheckDeposit
private constructor(
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val backImageFileId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val depositAcceptance: JsonField<DepositAcceptance>,
    private val depositRejection: JsonField<DepositRejection>,
    private val depositReturn: JsonField<DepositReturn>,
    private val depositSubmission: JsonField<DepositSubmission>,
    private val description: JsonField<String>,
    private val frontImageFileId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val inboundFundsHold: JsonField<InboundFundsHold>,
    private val inboundMailItemId: JsonField<String>,
    private val lockboxId: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The Account the check was deposited into. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The deposited amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    fun depositAcceptance(): DepositAcceptance? =
        depositAcceptance.getNullable("deposit_acceptance")

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    fun depositRejection(): DepositRejection? = depositRejection.getNullable("deposit_rejection")

    /** If your deposit is returned, this will contain details as to why it was returned. */
    fun depositReturn(): DepositReturn? = depositReturn.getNullable("deposit_return")

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    fun depositSubmission(): DepositSubmission? =
        depositSubmission.getNullable("deposit_submission")

    /** The description of the Check Deposit, for display purposes only. */
    fun description(): String? = description.getNullable("description")

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    fun inboundFundsHold(): InboundFundsHold? = inboundFundsHold.getNullable("inbound_funds_hold")

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Inbound Mail Item.
     */
    fun inboundMailItemId(): String? = inboundMailItemId.getNullable("inbound_mail_item_id")

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Lockbox that received it.
     */
    fun lockboxId(): String? = lockboxId.getNullable("lockbox_id")

    /** The status of the Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /** The ID for the Transaction created by the deposit. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account the check was deposited into. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The deposited amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @JsonProperty("deposit_acceptance") @ExcludeMissing fun _depositAcceptance() = depositAcceptance

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @JsonProperty("deposit_rejection") @ExcludeMissing fun _depositRejection() = depositRejection

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @JsonProperty("deposit_return") @ExcludeMissing fun _depositReturn() = depositReturn

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    @JsonProperty("deposit_submission") @ExcludeMissing fun _depositSubmission() = depositSubmission

    /** The description of the Check Deposit, for display purposes only. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id") @ExcludeMissing fun _frontImageFileId() = frontImageFileId

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    @JsonProperty("inbound_funds_hold") @ExcludeMissing fun _inboundFundsHold() = inboundFundsHold

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Inbound Mail Item.
     */
    @JsonProperty("inbound_mail_item_id")
    @ExcludeMissing
    fun _inboundMailItemId() = inboundMailItemId

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Lockbox that received it.
     */
    @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId() = lockboxId

    /** The status of the Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The ID for the Transaction created by the deposit. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CheckDeposit = apply {
        if (!validated) {
            accountId()
            amount()
            backImageFileId()
            createdAt()
            depositAcceptance()?.validate()
            depositRejection()?.validate()
            depositReturn()?.validate()
            depositSubmission()?.validate()
            description()
            frontImageFileId()
            id()
            idempotencyKey()
            inboundFundsHold()?.validate()
            inboundMailItemId()
            lockboxId()
            status()
            transactionId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var depositAcceptance: JsonField<DepositAcceptance> = JsonMissing.of()
        private var depositRejection: JsonField<DepositRejection> = JsonMissing.of()
        private var depositReturn: JsonField<DepositReturn> = JsonMissing.of()
        private var depositSubmission: JsonField<DepositSubmission> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
        private var inboundMailItemId: JsonField<String> = JsonMissing.of()
        private var lockboxId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkDeposit: CheckDeposit) = apply {
            accountId = checkDeposit.accountId
            amount = checkDeposit.amount
            backImageFileId = checkDeposit.backImageFileId
            createdAt = checkDeposit.createdAt
            depositAcceptance = checkDeposit.depositAcceptance
            depositRejection = checkDeposit.depositRejection
            depositReturn = checkDeposit.depositReturn
            depositSubmission = checkDeposit.depositSubmission
            description = checkDeposit.description
            frontImageFileId = checkDeposit.frontImageFileId
            id = checkDeposit.id
            idempotencyKey = checkDeposit.idempotencyKey
            inboundFundsHold = checkDeposit.inboundFundsHold
            inboundMailItemId = checkDeposit.inboundMailItemId
            lockboxId = checkDeposit.lockboxId
            status = checkDeposit.status
            transactionId = checkDeposit.transactionId
            type = checkDeposit.type
            additionalProperties = checkDeposit.additionalProperties.toMutableMap()
        }

        /** The Account the check was deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check was deposited into. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The deposited amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The deposited amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: DepositAcceptance) =
            depositAcceptance(JsonField.of(depositAcceptance))

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        @JsonProperty("deposit_acceptance")
        @ExcludeMissing
        fun depositAcceptance(depositAcceptance: JsonField<DepositAcceptance>) = apply {
            this.depositAcceptance = depositAcceptance
        }

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        fun depositRejection(depositRejection: DepositRejection) =
            depositRejection(JsonField.of(depositRejection))

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        @JsonProperty("deposit_rejection")
        @ExcludeMissing
        fun depositRejection(depositRejection: JsonField<DepositRejection>) = apply {
            this.depositRejection = depositRejection
        }

        /** If your deposit is returned, this will contain details as to why it was returned. */
        fun depositReturn(depositReturn: DepositReturn) = depositReturn(JsonField.of(depositReturn))

        /** If your deposit is returned, this will contain details as to why it was returned. */
        @JsonProperty("deposit_return")
        @ExcludeMissing
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: DepositSubmission) =
            depositSubmission(JsonField.of(depositSubmission))

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        @JsonProperty("deposit_submission")
        @ExcludeMissing
        fun depositSubmission(depositSubmission: JsonField<DepositSubmission>) = apply {
            this.depositSubmission = depositSubmission
        }

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the Check Deposit, for display purposes only. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold) =
            inboundFundsHold(JsonField.of(inboundFundsHold))

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
            this.inboundFundsHold = inboundFundsHold
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Inbound Mail Item.
         */
        fun inboundMailItemId(inboundMailItemId: String) =
            inboundMailItemId(JsonField.of(inboundMailItemId))

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Inbound Mail Item.
         */
        @JsonProperty("inbound_mail_item_id")
        @ExcludeMissing
        fun inboundMailItemId(inboundMailItemId: JsonField<String>) = apply {
            this.inboundMailItemId = inboundMailItemId
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: String) = lockboxId(JsonField.of(lockboxId))

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        @JsonProperty("lockbox_id")
        @ExcludeMissing
        fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

        /** The status of the Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Check Deposit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the Transaction created by the deposit. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): CheckDeposit =
            CheckDeposit(
                accountId,
                amount,
                backImageFileId,
                createdAt,
                depositAcceptance,
                depositRejection,
                depositReturn,
                depositSubmission,
                description,
                frontImageFileId,
                id,
                idempotencyKey,
                inboundFundsHold,
                inboundMailItemId,
                lockboxId,
                status,
                transactionId,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @JsonDeserialize(builder = DepositAcceptance.Builder::class)
    @NoAutoDetect
    class DepositAcceptance
    private constructor(
        private val accountNumber: JsonField<String>,
        private val amount: JsonField<Long>,
        private val auxiliaryOnUs: JsonField<String>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val routingNumber: JsonField<String>,
        private val serialNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The account number printed on the check. */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        fun auxiliaryOnUs(): String? = auxiliaryOnUs.getNullable("auxiliary_on_us")

        /** The ID of the Check Deposit that was accepted. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The routing number printed on the check. */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        fun serialNumber(): String? = serialNumber.getNullable("serial_number")

        /** The account number printed on the check. */
        @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

        /** The ID of the Check Deposit that was accepted. */
        @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The routing number printed on the check. */
        @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        @JsonProperty("serial_number") @ExcludeMissing fun _serialNumber() = serialNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositAcceptance = apply {
            if (!validated) {
                accountNumber()
                amount()
                auxiliaryOnUs()
                checkDepositId()
                currency()
                routingNumber()
                serialNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var serialNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(depositAcceptance: DepositAcceptance) = apply {
                accountNumber = depositAcceptance.accountNumber
                amount = depositAcceptance.amount
                auxiliaryOnUs = depositAcceptance.auxiliaryOnUs
                checkDepositId = depositAcceptance.checkDepositId
                currency = depositAcceptance.currency
                routingNumber = depositAcceptance.routingNumber
                serialNumber = depositAcceptance.serialNumber
                additionalProperties = depositAcceptance.additionalProperties.toMutableMap()
            }

            /** The account number printed on the check. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** The account number printed on the check. */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: String) = auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
            }

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The ID of the Check Deposit that was accepted. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The routing number printed on the check. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /** The routing number printed on the check. */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            @JsonProperty("serial_number")
            @ExcludeMissing
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): DepositAcceptance =
                DepositAcceptance(
                    accountNumber,
                    amount,
                    auxiliaryOnUs,
                    checkDepositId,
                    currency,
                    routingNumber,
                    serialNumber,
                    additionalProperties.toImmutable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CAD = of("CAD")

                val CHF = of("CHF")

                val EUR = of("EUR")

                val GBP = of("GBP")

                val JPY = of("JPY")

                val USD = of("USD")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositAcceptance && accountNumber == other.accountNumber && amount == other.amount && auxiliaryOnUs == other.auxiliaryOnUs && checkDepositId == other.checkDepositId && currency == other.currency && routingNumber == other.routingNumber && serialNumber == other.serialNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, amount, auxiliaryOnUs, checkDepositId, currency, routingNumber, serialNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositAcceptance{accountNumber=$accountNumber, amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, checkDepositId=$checkDepositId, currency=$currency, routingNumber=$routingNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @JsonDeserialize(builder = DepositRejection.Builder::class)
    @NoAutoDetect
    class DepositRejection
    private constructor(
        private val amount: JsonField<Long>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val declinedTransactionId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was rejected. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(): Currency = currency.getRequired("currency")

        /** The identifier of the associated declined transaction. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** Why the check deposit was rejected. */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The identifier of the Check Deposit that was rejected. */
        @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The identifier of the associated declined transaction. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId() = declinedTransactionId

        /** Why the check deposit was rejected. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositRejection = apply {
            if (!validated) {
                amount()
                checkDepositId()
                currency()
                declinedTransactionId()
                reason()
                rejectedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(depositRejection: DepositRejection) = apply {
                amount = depositRejection.amount
                checkDepositId = depositRejection.checkDepositId
                currency = depositRejection.currency
                declinedTransactionId = depositRejection.declinedTransactionId
                reason = depositRejection.reason
                rejectedAt = depositRejection.rejectedAt
                additionalProperties = depositRejection.additionalProperties.toMutableMap()
            }

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was rejected. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The identifier of the associated declined transaction. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The identifier of the associated declined transaction. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** Why the check deposit was rejected. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Why the check deposit was rejected. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): DepositRejection =
                DepositRejection(
                    amount,
                    checkDepositId,
                    currency,
                    declinedTransactionId,
                    reason,
                    rejectedAt,
                    additionalProperties.toImmutable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CAD = of("CAD")

                val CHF = of("CHF")

                val EUR = of("EUR")

                val GBP = of("GBP")

                val JPY = of("JPY")

                val USD = of("USD")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCOMPLETE_IMAGE = of("incomplete_image")

                val DUPLICATE = of("duplicate")

                val POOR_IMAGE_QUALITY = of("poor_image_quality")

                val INCORRECT_AMOUNT = of("incorrect_amount")

                val INCORRECT_RECIPIENT = of("incorrect_recipient")

                val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT = of("not_eligible_for_mobile_deposit")

                val MISSING_REQUIRED_DATA_ELEMENTS = of("missing_required_data_elements")

                val SUSPECTED_FRAUD = of("suspected_fraud")

                val DEPOSIT_WINDOW_EXPIRED = of("deposit_window_expired")

                val REQUESTED_BY_USER = of("requested_by_user")

                val UNKNOWN = of("unknown")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                SUSPECTED_FRAUD,
                DEPOSIT_WINDOW_EXPIRED,
                REQUESTED_BY_USER,
                UNKNOWN,
            }

            enum class Value {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                SUSPECTED_FRAUD,
                DEPOSIT_WINDOW_EXPIRED,
                REQUESTED_BY_USER,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCOMPLETE_IMAGE -> Value.INCOMPLETE_IMAGE
                    DUPLICATE -> Value.DUPLICATE
                    POOR_IMAGE_QUALITY -> Value.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Value.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Value.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Value.MISSING_REQUIRED_DATA_ELEMENTS
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    DEPOSIT_WINDOW_EXPIRED -> Value.DEPOSIT_WINDOW_EXPIRED
                    REQUESTED_BY_USER -> Value.REQUESTED_BY_USER
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCOMPLETE_IMAGE -> Known.INCOMPLETE_IMAGE
                    DUPLICATE -> Known.DUPLICATE
                    POOR_IMAGE_QUALITY -> Known.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Known.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Known.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Known.MISSING_REQUIRED_DATA_ELEMENTS
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    DEPOSIT_WINDOW_EXPIRED -> Known.DEPOSIT_WINDOW_EXPIRED
                    REQUESTED_BY_USER -> Known.REQUESTED_BY_USER
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is DepositRejection && amount == other.amount && checkDepositId == other.checkDepositId && currency == other.currency && declinedTransactionId == other.declinedTransactionId && reason == other.reason && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, checkDepositId, currency, declinedTransactionId, reason, rejectedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @JsonDeserialize(builder = DepositReturn.Builder::class)
    @NoAutoDetect
    class DepositReturn
    private constructor(
        private val amount: JsonField<Long>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val returnReason: JsonField<ReturnReason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The returned amount in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was returned. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** Why this check was returned by the bank holding the account it was drawn against. */
        fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The returned amount in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The identifier of the Check Deposit that was returned. */
        @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** Why this check was returned by the bank holding the account it was drawn against. */
        @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositReturn = apply {
            if (!validated) {
                amount()
                checkDepositId()
                currency()
                returnReason()
                returnedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(depositReturn: DepositReturn) = apply {
                amount = depositReturn.amount
                checkDepositId = depositReturn.checkDepositId
                currency = depositReturn.currency
                returnReason = depositReturn.returnReason
                returnedAt = depositReturn.returnedAt
                transactionId = depositReturn.transactionId
                additionalProperties = depositReturn.additionalProperties.toMutableMap()
            }

            /** The returned amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The returned amount in USD cents. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was returned. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Why this check was returned by the bank holding the account it was drawn against. */
            fun returnReason(returnReason: ReturnReason) = returnReason(JsonField.of(returnReason))

            /** Why this check was returned by the bank holding the account it was drawn against. */
            @JsonProperty("return_reason")
            @ExcludeMissing
            fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                this.returnReason = returnReason
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): DepositReturn =
                DepositReturn(
                    amount,
                    checkDepositId,
                    currency,
                    returnReason,
                    returnedAt,
                    transactionId,
                    additionalProperties.toImmutable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CAD = of("CAD")

                val CHF = of("CHF")

                val EUR = of("EUR")

                val GBP = of("GBP")

                val JPY = of("JPY")

                val USD = of("USD")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ReturnReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_CONVERSION_NOT_SUPPORTED = of("ach_conversion_not_supported")

                val CLOSED_ACCOUNT = of("closed_account")

                val DUPLICATE_SUBMISSION = of("duplicate_submission")

                val INSUFFICIENT_FUNDS = of("insufficient_funds")

                val NO_ACCOUNT = of("no_account")

                val NOT_AUTHORIZED = of("not_authorized")

                val STALE_DATED = of("stale_dated")

                val STOP_PAYMENT = of("stop_payment")

                val UNKNOWN_REASON = of("unknown_reason")

                val UNMATCHED_DETAILS = of("unmatched_details")

                val UNREADABLE_IMAGE = of("unreadable_image")

                val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

                val ALTERED_OR_FICTITIOUS_ITEM = of("altered_or_fictitious_item")

                val FROZEN_OR_BLOCKED_ACCOUNT = of("frozen_or_blocked_account")

                val POST_DATED = of("post_dated")

                val ENDORSEMENT_MISSING = of("endorsement_missing")

                val SIGNATURE_MISSING = of("signature_missing")

                val STOP_PAYMENT_SUSPECT = of("stop_payment_suspect")

                val UNUSABLE_IMAGE = of("unusable_image")

                val IMAGE_FAILS_SECURITY_CHECK = of("image_fails_security_check")

                val CANNOT_DETERMINE_AMOUNT = of("cannot_determine_amount")

                val SIGNATURE_IRREGULAR = of("signature_irregular")

                val NON_CASH_ITEM = of("non_cash_item")

                val UNABLE_TO_PROCESS = of("unable_to_process")

                val ITEM_EXCEEDS_DOLLAR_LIMIT = of("item_exceeds_dollar_limit")

                val BRANCH_OR_ACCOUNT_SOLD = of("branch_or_account_sold")

                fun of(value: String) = ReturnReason(JsonField.of(value))
            }

            enum class Known {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
                ENDORSEMENT_IRREGULAR,
                ALTERED_OR_FICTITIOUS_ITEM,
                FROZEN_OR_BLOCKED_ACCOUNT,
                POST_DATED,
                ENDORSEMENT_MISSING,
                SIGNATURE_MISSING,
                STOP_PAYMENT_SUSPECT,
                UNUSABLE_IMAGE,
                IMAGE_FAILS_SECURITY_CHECK,
                CANNOT_DETERMINE_AMOUNT,
                SIGNATURE_IRREGULAR,
                NON_CASH_ITEM,
                UNABLE_TO_PROCESS,
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                BRANCH_OR_ACCOUNT_SOLD,
            }

            enum class Value {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
                ENDORSEMENT_IRREGULAR,
                ALTERED_OR_FICTITIOUS_ITEM,
                FROZEN_OR_BLOCKED_ACCOUNT,
                POST_DATED,
                ENDORSEMENT_MISSING,
                SIGNATURE_MISSING,
                STOP_PAYMENT_SUSPECT,
                UNUSABLE_IMAGE,
                IMAGE_FAILS_SECURITY_CHECK,
                CANNOT_DETERMINE_AMOUNT,
                SIGNATURE_IRREGULAR,
                NON_CASH_ITEM,
                UNABLE_TO_PROCESS,
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                BRANCH_OR_ACCOUNT_SOLD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_CONVERSION_NOT_SUPPORTED -> Value.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Value.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Value.NO_ACCOUNT
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    STALE_DATED -> Value.STALE_DATED
                    STOP_PAYMENT -> Value.STOP_PAYMENT
                    UNKNOWN_REASON -> Value.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Value.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Value.UNREADABLE_IMAGE
                    ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                    ALTERED_OR_FICTITIOUS_ITEM -> Value.ALTERED_OR_FICTITIOUS_ITEM
                    FROZEN_OR_BLOCKED_ACCOUNT -> Value.FROZEN_OR_BLOCKED_ACCOUNT
                    POST_DATED -> Value.POST_DATED
                    ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                    SIGNATURE_MISSING -> Value.SIGNATURE_MISSING
                    STOP_PAYMENT_SUSPECT -> Value.STOP_PAYMENT_SUSPECT
                    UNUSABLE_IMAGE -> Value.UNUSABLE_IMAGE
                    IMAGE_FAILS_SECURITY_CHECK -> Value.IMAGE_FAILS_SECURITY_CHECK
                    CANNOT_DETERMINE_AMOUNT -> Value.CANNOT_DETERMINE_AMOUNT
                    SIGNATURE_IRREGULAR -> Value.SIGNATURE_IRREGULAR
                    NON_CASH_ITEM -> Value.NON_CASH_ITEM
                    UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                    ITEM_EXCEEDS_DOLLAR_LIMIT -> Value.ITEM_EXCEEDS_DOLLAR_LIMIT
                    BRANCH_OR_ACCOUNT_SOLD -> Value.BRANCH_OR_ACCOUNT_SOLD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_CONVERSION_NOT_SUPPORTED -> Known.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Known.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Known.NO_ACCOUNT
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    STALE_DATED -> Known.STALE_DATED
                    STOP_PAYMENT -> Known.STOP_PAYMENT
                    UNKNOWN_REASON -> Known.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Known.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Known.UNREADABLE_IMAGE
                    ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                    ALTERED_OR_FICTITIOUS_ITEM -> Known.ALTERED_OR_FICTITIOUS_ITEM
                    FROZEN_OR_BLOCKED_ACCOUNT -> Known.FROZEN_OR_BLOCKED_ACCOUNT
                    POST_DATED -> Known.POST_DATED
                    ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                    SIGNATURE_MISSING -> Known.SIGNATURE_MISSING
                    STOP_PAYMENT_SUSPECT -> Known.STOP_PAYMENT_SUSPECT
                    UNUSABLE_IMAGE -> Known.UNUSABLE_IMAGE
                    IMAGE_FAILS_SECURITY_CHECK -> Known.IMAGE_FAILS_SECURITY_CHECK
                    CANNOT_DETERMINE_AMOUNT -> Known.CANNOT_DETERMINE_AMOUNT
                    SIGNATURE_IRREGULAR -> Known.SIGNATURE_IRREGULAR
                    NON_CASH_ITEM -> Known.NON_CASH_ITEM
                    UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                    ITEM_EXCEEDS_DOLLAR_LIMIT -> Known.ITEM_EXCEEDS_DOLLAR_LIMIT
                    BRANCH_OR_ACCOUNT_SOLD -> Known.BRANCH_OR_ACCOUNT_SOLD
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositReturn && amount == other.amount && checkDepositId == other.checkDepositId && currency == other.currency && returnReason == other.returnReason && returnedAt == other.returnedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, checkDepositId, currency, returnReason, returnedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositReturn{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, returnReason=$returnReason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    @JsonDeserialize(builder = DepositSubmission.Builder::class)
    @NoAutoDetect
    class DepositSubmission
    private constructor(
        private val backFileId: JsonField<String>,
        private val frontFileId: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The ID for the File containing the check back image that was submitted to the Check21
         * network.
         */
        fun backFileId(): String = backFileId.getRequired("back_file_id")

        /**
         * The ID for the File containing the check front image that was submitted to the Check21
         * network.
         */
        fun frontFileId(): String = frontFileId.getRequired("front_file_id")

        /**
         * When the check deposit was submitted to the Check21 network for processing. During
         * business days, this happens within a few hours of the check being accepted by Increase.
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * The ID for the File containing the check back image that was submitted to the Check21
         * network.
         */
        @JsonProperty("back_file_id") @ExcludeMissing fun _backFileId() = backFileId

        /**
         * The ID for the File containing the check front image that was submitted to the Check21
         * network.
         */
        @JsonProperty("front_file_id") @ExcludeMissing fun _frontFileId() = frontFileId

        /**
         * When the check deposit was submitted to the Check21 network for processing. During
         * business days, this happens within a few hours of the check being accepted by Increase.
         */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositSubmission = apply {
            if (!validated) {
                backFileId()
                frontFileId()
                submittedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var backFileId: JsonField<String> = JsonMissing.of()
            private var frontFileId: JsonField<String> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(depositSubmission: DepositSubmission) = apply {
                backFileId = depositSubmission.backFileId
                frontFileId = depositSubmission.frontFileId
                submittedAt = depositSubmission.submittedAt
                additionalProperties = depositSubmission.additionalProperties.toMutableMap()
            }

            /**
             * The ID for the File containing the check back image that was submitted to the Check21
             * network.
             */
            fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

            /**
             * The ID for the File containing the check back image that was submitted to the Check21
             * network.
             */
            @JsonProperty("back_file_id")
            @ExcludeMissing
            fun backFileId(backFileId: JsonField<String>) = apply { this.backFileId = backFileId }

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            fun frontFileId(frontFileId: String) = frontFileId(JsonField.of(frontFileId))

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            @JsonProperty("front_file_id")
            @ExcludeMissing
            fun frontFileId(frontFileId: JsonField<String>) = apply {
                this.frontFileId = frontFileId
            }

            /**
             * When the check deposit was submitted to the Check21 network for processing. During
             * business days, this happens within a few hours of the check being accepted by
             * Increase.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * When the check deposit was submitted to the Check21 network for processing. During
             * business days, this happens within a few hours of the check being accepted by
             * Increase.
             */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): DepositSubmission =
                DepositSubmission(
                    backFileId,
                    frontFileId,
                    submittedAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositSubmission && backFileId == other.backFileId && frontFileId == other.frontFileId && submittedAt == other.submittedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(backFileId, frontFileId, submittedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositSubmission{backFileId=$backFileId, frontFileId=$frontFileId, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    @JsonDeserialize(builder = InboundFundsHold.Builder::class)
    @NoAutoDetect
    class InboundFundsHold
    private constructor(
        private val amount: JsonField<Long>,
        private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val heldTransactionId: JsonField<String>,
        private val id: JsonField<String>,
        private val pendingTransactionId: JsonField<String>,
        private val releasedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        fun automaticallyReleasesAt(): OffsetDateTime =
            automaticallyReleasesAt.getRequired("automatically_releases_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(): Currency = currency.getRequired("currency")

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(): String? = heldTransactionId.getNullable("held_transaction_id")

        /** The Inbound Funds Hold identifier. */
        fun id(): String = id.getRequired("id")

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(): String? =
            pendingTransactionId.getNullable("pending_transaction_id")

        /** When the hold was released (if it has been released). */
        fun releasedAt(): OffsetDateTime? = releasedAt.getNullable("released_at")

        /** The status of the hold. */
        fun status(): Status = status.getRequired("status")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun _automaticallyReleasesAt() = automaticallyReleasesAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The ID of the Transaction for which funds were held. */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun _heldTransactionId() = heldTransactionId

        /** The Inbound Funds Hold identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The ID of the Pending Transaction representing the held funds. */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId() = pendingTransactionId

        /** When the hold was released (if it has been released). */
        @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

        /** The status of the hold. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundFundsHold = apply {
            if (!validated) {
                amount()
                automaticallyReleasesAt()
                createdAt()
                currency()
                heldTransactionId()
                id()
                pendingTransactionId()
                releasedAt()
                status()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var heldTransactionId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var pendingTransactionId: JsonField<String> = JsonMissing.of()
            private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                amount = inboundFundsHold.amount
                automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                createdAt = inboundFundsHold.createdAt
                currency = inboundFundsHold.currency
                heldTransactionId = inboundFundsHold.heldTransactionId
                id = inboundFundsHold.id
                pendingTransactionId = inboundFundsHold.pendingTransactionId
                releasedAt = inboundFundsHold.releasedAt
                status = inboundFundsHold.status
                type = inboundFundsHold.type
                additionalProperties = inboundFundsHold.additionalProperties.toMutableMap()
            }

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) =
                apply {
                    this.automaticallyReleasesAt = automaticallyReleasesAt
                }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: String) =
                heldTransactionId(JsonField.of(heldTransactionId))

            /** The ID of the Transaction for which funds were held. */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                this.heldTransactionId = heldTransactionId
            }

            /** The Inbound Funds Hold identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Inbound Funds Hold identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: String) =
                pendingTransactionId(JsonField.of(pendingTransactionId))

            /** The ID of the Pending Transaction representing the held funds. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: OffsetDateTime) = releasedAt(JsonField.of(releasedAt))

            /** When the hold was released (if it has been released). */
            @JsonProperty("released_at")
            @ExcludeMissing
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /** The status of the hold. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the hold. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): InboundFundsHold =
                InboundFundsHold(
                    amount,
                    automaticallyReleasesAt,
                    createdAt,
                    currency,
                    heldTransactionId,
                    id,
                    pendingTransactionId,
                    releasedAt,
                    status,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CAD = of("CAD")

                val CHF = of("CHF")

                val EUR = of("EUR")

                val GBP = of("GBP")

                val JPY = of("JPY")

                val USD = of("USD")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val HELD = of("held")

                val COMPLETE = of("complete")

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                HELD,
                COMPLETE,
            }

            enum class Value {
                HELD,
                COMPLETE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    HELD -> Value.HELD
                    COMPLETE -> Value.COMPLETE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    HELD -> Known.HELD
                    COMPLETE -> Known.COMPLETE
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                INBOUND_FUNDS_HOLD,
            }

            enum class Value {
                INBOUND_FUNDS_HOLD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
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

            return /* spotless:off */ other is InboundFundsHold && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && id == other.id && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, id, pendingTransactionId, releasedAt, status, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundFundsHold{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val SUBMITTED = of("submitted")

            val REJECTED = of("rejected")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                SUBMITTED -> Value.SUBMITTED
                REJECTED -> Value.REJECTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                SUBMITTED -> Known.SUBMITTED
                REJECTED -> Known.REJECTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CHECK_DEPOSIT = of("check_deposit")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECK_DEPOSIT,
        }

        enum class Value {
            CHECK_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_DEPOSIT -> Value.CHECK_DEPOSIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_DEPOSIT -> Known.CHECK_DEPOSIT
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

        return /* spotless:off */ other is CheckDeposit && accountId == other.accountId && amount == other.amount && backImageFileId == other.backImageFileId && createdAt == other.createdAt && depositAcceptance == other.depositAcceptance && depositRejection == other.depositRejection && depositReturn == other.depositReturn && depositSubmission == other.depositSubmission && description == other.description && frontImageFileId == other.frontImageFileId && id == other.id && idempotencyKey == other.idempotencyKey && inboundFundsHold == other.inboundFundsHold && inboundMailItemId == other.inboundMailItemId && lockboxId == other.lockboxId && status == other.status && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, amount, backImageFileId, createdAt, depositAcceptance, depositRejection, depositReturn, depositSubmission, description, frontImageFileId, id, idempotencyKey, inboundFundsHold, inboundMailItemId, lockboxId, status, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckDeposit{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, createdAt=$createdAt, depositAcceptance=$depositAcceptance, depositRejection=$depositRejection, depositReturn=$depositReturn, depositSubmission=$depositSubmission, description=$description, frontImageFileId=$frontImageFileId, id=$id, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, inboundMailItemId=$inboundMailItemId, lockboxId=$lockboxId, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
