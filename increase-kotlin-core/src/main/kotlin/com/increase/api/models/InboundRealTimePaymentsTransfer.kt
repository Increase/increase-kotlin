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
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * An Inbound Real-Time Payments Transfer is a Real-Time Payments transfer initiated outside of
 * Increase to your account.
 */
@NoAutoDetect
class InboundRealTimePaymentsTransfer
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_id")
    @ExcludeMissing
    private val accountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("confirmation")
    @ExcludeMissing
    private val confirmation: JsonField<Confirmation> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("creditor_name")
    @ExcludeMissing
    private val creditorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    private val debtorAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debtor_name")
    @ExcludeMissing
    private val debtorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debtor_routing_number")
    @ExcludeMissing
    private val debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("decline")
    @ExcludeMissing
    private val decline: JsonField<Decline> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_identification")
    @ExcludeMissing
    private val transactionIdentification: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Account to which the transfer was sent. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    fun confirmation(): Confirmation? = confirmation.getNullable("confirmation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The name the sender of the transfer specified as the recipient of the transfer. */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The account number of the account that sent the transfer. */
    fun debtorAccountNumber(): String = debtorAccountNumber.getRequired("debtor_account_number")

    /** The name provided by the sender of the transfer. */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /** The routing number of the account that sent the transfer. */
    fun debtorRoutingNumber(): String = debtorRoutingNumber.getRequired("debtor_routing_number")

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Decline? = decline.getNullable("decline")

    /** The inbound Real-Time Payments transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** Additional information included with the transfer. */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittance_information")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The Real-Time Payments network identification of the transfer. */
    fun transactionIdentification(): String =
        transactionIdentification.getRequired("transaction_identification")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account to which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @JsonProperty("confirmation") @ExcludeMissing fun _confirmation() = confirmation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The name the sender of the transfer specified as the recipient of the transfer. */
    @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The account number of the account that sent the transfer. */
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    fun _debtorAccountNumber() = debtorAccountNumber

    /** The name provided by the sender of the transfer. */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

    /** The routing number of the account that sent the transfer. */
    @JsonProperty("debtor_routing_number")
    @ExcludeMissing
    fun _debtorRoutingNumber() = debtorRoutingNumber

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline") @ExcludeMissing fun _decline() = decline

    /** The inbound Real-Time Payments transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Additional information included with the transfer. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Real-Time Payments network identification of the transfer. */
    @JsonProperty("transaction_identification")
    @ExcludeMissing
    fun _transactionIdentification() = transactionIdentification

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundRealTimePaymentsTransfer = apply {
        if (!validated) {
            accountId()
            accountNumberId()
            amount()
            confirmation()?.validate()
            createdAt()
            creditorName()
            currency()
            debtorAccountNumber()
            debtorName()
            debtorRoutingNumber()
            decline()?.validate()
            id()
            remittanceInformation()
            status()
            transactionIdentification()
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
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var confirmation: JsonField<Confirmation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditorName: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
        private var debtorName: JsonField<String> = JsonMissing.of()
        private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var decline: JsonField<Decline> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionIdentification: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inboundRealTimePaymentsTransfer: InboundRealTimePaymentsTransfer) =
            apply {
                accountId = inboundRealTimePaymentsTransfer.accountId
                accountNumberId = inboundRealTimePaymentsTransfer.accountNumberId
                amount = inboundRealTimePaymentsTransfer.amount
                confirmation = inboundRealTimePaymentsTransfer.confirmation
                createdAt = inboundRealTimePaymentsTransfer.createdAt
                creditorName = inboundRealTimePaymentsTransfer.creditorName
                currency = inboundRealTimePaymentsTransfer.currency
                debtorAccountNumber = inboundRealTimePaymentsTransfer.debtorAccountNumber
                debtorName = inboundRealTimePaymentsTransfer.debtorName
                debtorRoutingNumber = inboundRealTimePaymentsTransfer.debtorRoutingNumber
                decline = inboundRealTimePaymentsTransfer.decline
                id = inboundRealTimePaymentsTransfer.id
                remittanceInformation = inboundRealTimePaymentsTransfer.remittanceInformation
                status = inboundRealTimePaymentsTransfer.status
                transactionIdentification =
                    inboundRealTimePaymentsTransfer.transactionIdentification
                type = inboundRealTimePaymentsTransfer.type
                additionalProperties =
                    inboundRealTimePaymentsTransfer.additionalProperties.toMutableMap()
            }

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: Confirmation) = confirmation(JsonField.of(confirmation))

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: JsonField<Confirmation>) = apply {
            this.confirmation = confirmation
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency.
         * This will always be "USD" for a Real-Time Payments transfer.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency.
         * This will always be "USD" for a Real-Time Payments transfer.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String) =
            debtorAccountNumber(JsonField.of(debtorAccountNumber))

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            this.debtorAccountNumber = debtorAccountNumber
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) =
            debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            this.debtorRoutingNumber = debtorRoutingNumber
        }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline) = decline(JsonField.of(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** The inbound Real-Time Payments transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound Real-Time Payments transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(transactionIdentification: String) =
            transactionIdentification(JsonField.of(transactionIdentification))

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(transactionIdentification: JsonField<String>) = apply {
            this.transactionIdentification = transactionIdentification
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer`.
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

        fun build(): InboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer(
                accountId,
                accountNumberId,
                amount,
                confirmation,
                createdAt,
                creditorName,
                currency,
                debtorAccountNumber,
                debtorName,
                debtorRoutingNumber,
                decline,
                id,
                remittanceInformation,
                status,
                transactionIdentification,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @NoAutoDetect
    class Confirmation
    @JsonCreator
    private constructor(
        @JsonProperty("confirmed_at")
        @ExcludeMissing
        private val confirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The time at which the transfer was confirmed. */
        fun confirmedAt(): OffsetDateTime = confirmedAt.getRequired("confirmed_at")

        /** The id of the transaction for the confirmed transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was confirmed. */
        @JsonProperty("confirmed_at") @ExcludeMissing fun _confirmedAt() = confirmedAt

        /** The id of the transaction for the confirmed transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Confirmation = apply {
            if (!validated) {
                confirmedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var confirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(confirmation: Confirmation) = apply {
                confirmedAt = confirmation.confirmedAt
                transactionId = confirmation.transactionId
                additionalProperties = confirmation.additionalProperties.toMutableMap()
            }

            /** The time at which the transfer was confirmed. */
            fun confirmedAt(confirmedAt: OffsetDateTime) = confirmedAt(JsonField.of(confirmedAt))

            /** The time at which the transfer was confirmed. */
            fun confirmedAt(confirmedAt: JsonField<OffsetDateTime>) = apply {
                this.confirmedAt = confirmedAt
            }

            /** The id of the transaction for the confirmed transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the confirmed transfer. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Confirmation =
                Confirmation(
                    confirmedAt,
                    transactionId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Confirmation && confirmedAt == other.confirmedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(confirmedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Confirmation{confirmedAt=$confirmedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
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

    /** If your transfer is declined, this will contain details of the decline. */
    @NoAutoDetect
    class Decline
    @JsonCreator
    private constructor(
        @JsonProperty("declined_at")
        @ExcludeMissing
        private val declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (!validated) {
                declinedAt()
                declinedTransactionId()
                reason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decline: Decline) = apply {
                declinedAt = decline.declinedAt
                declinedTransactionId = decline.declinedTransactionId
                reason = decline.reason
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            fun build(): Decline =
                Decline(
                    declinedAt,
                    declinedTransactionId,
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT_NUMBER_CANCELED = of("account_number_canceled")

                val ACCOUNT_NUMBER_DISABLED = of("account_number_disabled")

                val ACCOUNT_RESTRICTED = of("account_restricted")

                val GROUP_LOCKED = of("group_locked")

                val ENTITY_NOT_ACTIVE = of("entity_not_active")

                val REAL_TIME_PAYMENTS_NOT_ENABLED = of("real_time_payments_not_enabled")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_NUMBER_CANCELED,
                ACCOUNT_NUMBER_DISABLED,
                ACCOUNT_RESTRICTED,
                GROUP_LOCKED,
                ENTITY_NOT_ACTIVE,
                REAL_TIME_PAYMENTS_NOT_ENABLED,
            }

            enum class Value {
                ACCOUNT_NUMBER_CANCELED,
                ACCOUNT_NUMBER_DISABLED,
                ACCOUNT_RESTRICTED,
                GROUP_LOCKED,
                ENTITY_NOT_ACTIVE,
                REAL_TIME_PAYMENTS_NOT_ENABLED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    REAL_TIME_PAYMENTS_NOT_ENABLED -> Value.REAL_TIME_PAYMENTS_NOT_ENABLED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    REAL_TIME_PAYMENTS_NOT_ENABLED -> Known.REAL_TIME_PAYMENTS_NOT_ENABLED
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

            return /* spotless:off */ other is Decline && declinedAt == other.declinedAt && declinedTransactionId == other.declinedTransactionId && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(declinedAt, declinedTransactionId, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING_CONFIRMING = of("pending_confirming")

            val TIMED_OUT = of("timed_out")

            val CONFIRMED = of("confirmed")

            val DECLINED = of("declined")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_CONFIRMING,
            TIMED_OUT,
            CONFIRMED,
            DECLINED,
        }

        enum class Value {
            PENDING_CONFIRMING,
            TIMED_OUT,
            CONFIRMED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_CONFIRMING -> Value.PENDING_CONFIRMING
                TIMED_OUT -> Value.TIMED_OUT
                CONFIRMED -> Value.CONFIRMED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_CONFIRMING -> Known.PENDING_CONFIRMING
                TIMED_OUT -> Known.TIMED_OUT
                CONFIRMED -> Known.CONFIRMED
                DECLINED -> Known.DECLINED
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

            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER = of("inbound_real_time_payments_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER,
        }

        enum class Value {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER -> Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER -> Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
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

        return /* spotless:off */ other is InboundRealTimePaymentsTransfer && accountId == other.accountId && accountNumberId == other.accountNumberId && amount == other.amount && confirmation == other.confirmation && createdAt == other.createdAt && creditorName == other.creditorName && currency == other.currency && debtorAccountNumber == other.debtorAccountNumber && debtorName == other.debtorName && debtorRoutingNumber == other.debtorRoutingNumber && decline == other.decline && id == other.id && remittanceInformation == other.remittanceInformation && status == other.status && transactionIdentification == other.transactionIdentification && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, accountNumberId, amount, confirmation, createdAt, creditorName, currency, debtorAccountNumber, debtorName, debtorRoutingNumber, decline, id, remittanceInformation, status, transactionIdentification, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundRealTimePaymentsTransfer{accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, confirmation=$confirmation, createdAt=$createdAt, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, decline=$decline, id=$id, remittanceInformation=$remittanceInformation, status=$status, transactionIdentification=$transactionIdentification, type=$type, additionalProperties=$additionalProperties}"
}
