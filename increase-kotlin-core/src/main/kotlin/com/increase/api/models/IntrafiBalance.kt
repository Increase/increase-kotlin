// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * When using IntraFi, each account's balance over the standard FDIC insurance
 * amount are swept to various other institutions. Funds are rebalanced across
 * banks as needed once per business day.
 */
@JsonDeserialize(builder = IntrafiBalance.Builder::class)
@NoAutoDetect
class IntrafiBalance private constructor(
  private val balances: JsonField<List<Balance>>,
  private val currency: JsonField<Currency>,
  private val effectiveDate: JsonField<LocalDate>,
  private val id: JsonField<String>,
  private val totalBalance: JsonField<Long>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Each entry represents a balance held at a different bank. IntraFi separates the
     * total balance across many participating banks in the network.
     */
    fun balances(): List<Balance> = balances.getRequired("balances")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account
     * currency.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The date this balance reflects. */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /** The identifier of this balance. */
    fun id(): String = id.getRequired("id")

    /**
     * The total balance, in minor units of `currency`. Increase reports this balance
     * to IntraFi daily.
     */
    fun totalBalance(): Long = totalBalance.getRequired("total_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_balance`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Each entry represents a balance held at a different bank. IntraFi separates the
     * total balance across many participating banks in the network.
     */
    @JsonProperty("balances")
    @ExcludeMissing
    fun _balances() = balances

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account
     * currency.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /** The date this balance reflects. */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate() = effectiveDate

    /** The identifier of this balance. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The total balance, in minor units of `currency`. Increase reports this balance
     * to IntraFi daily.
     */
    @JsonProperty("total_balance")
    @ExcludeMissing
    fun _totalBalance() = totalBalance

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_balance`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): IntrafiBalance = apply {
        if (!validated) {
          balances().forEach { it.validate() }
          currency()
          effectiveDate()
          id()
          totalBalance()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is IntrafiBalance &&
          this.balances == other.balances &&
          this.currency == other.currency &&
          this.effectiveDate == other.effectiveDate &&
          this.id == other.id &&
          this.totalBalance == other.totalBalance &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            balances,
            currency,
            effectiveDate,
            id,
            totalBalance,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "IntrafiBalance{balances=$balances, currency=$currency, effectiveDate=$effectiveDate, id=$id, totalBalance=$totalBalance, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var balances: JsonField<List<Balance>> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var totalBalance: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(intrafiBalance: IntrafiBalance) = apply {
            this.balances = intrafiBalance.balances
            this.currency = intrafiBalance.currency
            this.effectiveDate = intrafiBalance.effectiveDate
            this.id = intrafiBalance.id
            this.totalBalance = intrafiBalance.totalBalance
            this.type = intrafiBalance.type
            additionalProperties(intrafiBalance.additionalProperties)
        }

        /**
         * Each entry represents a balance held at a different bank. IntraFi separates the
         * total balance across many participating banks in the network.
         */
        fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

        /**
         * Each entry represents a balance held at a different bank. IntraFi separates the
         * total balance across many participating banks in the network.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun balances(balances: JsonField<List<Balance>>) = apply {
            this.balances = balances
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account
         * currency.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account
         * currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply {
            this.currency = currency
        }

        /** The date this balance reflects. */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /** The date this balance reflects. */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** The identifier of this balance. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this balance. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * The total balance, in minor units of `currency`. Increase reports this balance
         * to IntraFi daily.
         */
        fun totalBalance(totalBalance: Long) = totalBalance(JsonField.of(totalBalance))

        /**
         * The total balance, in minor units of `currency`. Increase reports this balance
         * to IntraFi daily.
         */
        @JsonProperty("total_balance")
        @ExcludeMissing
        fun totalBalance(totalBalance: JsonField<Long>) = apply {
            this.totalBalance = totalBalance
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_balance`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_balance`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
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

        fun build(): IntrafiBalance = IntrafiBalance(
            balances.map { it.toUnmodifiable() },
            currency,
            effectiveDate,
            id,
            totalBalance,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Balance.Builder::class)
    @NoAutoDetect
    class Balance private constructor(
      private val balance: JsonField<Long>,
      private val bank: JsonField<String>,
      private val bankLocation: JsonField<BankLocation>,
      private val fdicCertificateNumber: JsonField<String>,
      private val id: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The balance, in minor units of `currency`, held with this bank. */
        fun balance(): Long = balance.getRequired("balance")

        /** The name of the bank holding these funds. */
        fun bank(): String = bank.getRequired("bank")

        /** The primary location of the bank. */
        fun bankLocation(): BankLocation? = bankLocation.getNullable("bank_location")

        /**
         * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
         * Because many banks have the same or similar names, this can be used to uniquely
         * identify the institution.
         */
        fun fdicCertificateNumber(): String = fdicCertificateNumber.getRequired("fdic_certificate_number")

        /** The identifier of this balance. */
        fun id(): String = id.getRequired("id")

        /** The balance, in minor units of `currency`, held with this bank. */
        @JsonProperty("balance")
        @ExcludeMissing
        fun _balance() = balance

        /** The name of the bank holding these funds. */
        @JsonProperty("bank")
        @ExcludeMissing
        fun _bank() = bank

        /** The primary location of the bank. */
        @JsonProperty("bank_location")
        @ExcludeMissing
        fun _bankLocation() = bankLocation

        /**
         * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
         * Because many banks have the same or similar names, this can be used to uniquely
         * identify the institution.
         */
        @JsonProperty("fdic_certificate_number")
        @ExcludeMissing
        fun _fdicCertificateNumber() = fdicCertificateNumber

        /** The identifier of this balance. */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Balance = apply {
            if (!validated) {
              balance()
              bank()
              bankLocation()?.validate()
              fdicCertificateNumber()
              id()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Balance &&
              this.balance == other.balance &&
              this.bank == other.bank &&
              this.bankLocation == other.bankLocation &&
              this.fdicCertificateNumber == other.fdicCertificateNumber &&
              this.id == other.id &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                balance,
                bank,
                bankLocation,
                fdicCertificateNumber,
                id,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Balance{balance=$balance, bank=$bank, bankLocation=$bankLocation, fdicCertificateNumber=$fdicCertificateNumber, id=$id, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var balance: JsonField<Long> = JsonMissing.of()
            private var bank: JsonField<String> = JsonMissing.of()
            private var bankLocation: JsonField<BankLocation> = JsonMissing.of()
            private var fdicCertificateNumber: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balance: Balance) = apply {
                this.balance = balance.balance
                this.bank = balance.bank
                this.bankLocation = balance.bankLocation
                this.fdicCertificateNumber = balance.fdicCertificateNumber
                this.id = balance.id
                additionalProperties(balance.additionalProperties)
            }

            /** The balance, in minor units of `currency`, held with this bank. */
            fun balance(balance: Long) = balance(JsonField.of(balance))

            /** The balance, in minor units of `currency`, held with this bank. */
            @JsonProperty("balance")
            @ExcludeMissing
            fun balance(balance: JsonField<Long>) = apply {
                this.balance = balance
            }

            /** The name of the bank holding these funds. */
            fun bank(bank: String) = bank(JsonField.of(bank))

            /** The name of the bank holding these funds. */
            @JsonProperty("bank")
            @ExcludeMissing
            fun bank(bank: JsonField<String>) = apply {
                this.bank = bank
            }

            /** The primary location of the bank. */
            fun bankLocation(bankLocation: BankLocation) = bankLocation(JsonField.of(bankLocation))

            /** The primary location of the bank. */
            @JsonProperty("bank_location")
            @ExcludeMissing
            fun bankLocation(bankLocation: JsonField<BankLocation>) = apply {
                this.bankLocation = bankLocation
            }

            /**
             * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
             * Because many banks have the same or similar names, this can be used to uniquely
             * identify the institution.
             */
            fun fdicCertificateNumber(fdicCertificateNumber: String) = fdicCertificateNumber(JsonField.of(fdicCertificateNumber))

            /**
             * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
             * Because many banks have the same or similar names, this can be used to uniquely
             * identify the institution.
             */
            @JsonProperty("fdic_certificate_number")
            @ExcludeMissing
            fun fdicCertificateNumber(fdicCertificateNumber: JsonField<String>) = apply {
                this.fdicCertificateNumber = fdicCertificateNumber
            }

            /** The identifier of this balance. */
            fun id(id: String) = id(JsonField.of(id))

            /** The identifier of this balance. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
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

            fun build(): Balance = Balance(
                balance,
                bank,
                bankLocation,
                fdicCertificateNumber,
                id,
                additionalProperties.toUnmodifiable(),
            )
        }

        /** The primary location of the bank. */
        @JsonDeserialize(builder = BankLocation.Builder::class)
        @NoAutoDetect
        class BankLocation private constructor(private val city: JsonField<String>, private val state: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The bank's city. */
            fun city(): String = city.getRequired("city")

            /** The bank's state. */
            fun state(): String = state.getRequired("state")

            /** The bank's city. */
            @JsonProperty("city")
            @ExcludeMissing
            fun _city() = city

            /** The bank's state. */
            @JsonProperty("state")
            @ExcludeMissing
            fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BankLocation = apply {
                if (!validated) {
                  city()
                  state()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is BankLocation &&
                  this.city == other.city &&
                  this.state == other.state &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    city,
                    state,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "BankLocation{city=$city, state=$state, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bankLocation: BankLocation) = apply {
                    this.city = bankLocation.city
                    this.state = bankLocation.state
                    additionalProperties(bankLocation.additionalProperties)
                }

                /** The bank's city. */
                fun city(city: String) = city(JsonField.of(city))

                /** The bank's city. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply {
                    this.city = city
                }

                /** The bank's state. */
                fun state(state: String) = state(JsonField.of(state))

                /** The bank's state. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply {
                    this.state = state
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

                fun build(): BankLocation = BankLocation(
                    city,
                    state,
                    additionalProperties.toUnmodifiable(),
                )
            }
        }
    }

    class Currency @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Currency &&
              this.value == other.value
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

        fun value(): Value = when (this) {
            CAD -> Value.CAD
            CHF -> Value.CHF
            EUR -> Value.EUR
            GBP -> Value.GBP
            JPY -> Value.JPY
            USD -> Value.USD
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
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

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INTRAFI_BALANCE = Type(JsonField.of("intrafi_balance"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTRAFI_BALANCE,
        }

        enum class Value {
            INTRAFI_BALANCE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INTRAFI_BALANCE -> Value.INTRAFI_BALANCE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INTRAFI_BALANCE -> Known.INTRAFI_BALANCE
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
