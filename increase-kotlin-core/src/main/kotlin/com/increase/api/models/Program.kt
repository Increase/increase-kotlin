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
 * Programs determine the compliance and commercial terms of Accounts. By default, you have a
 * Commercial Banking program for managing your own funds. If you are lending or managing funds on
 * behalf of your customers, or otherwise engaged in regulated activity, we will work together to
 * create additional Programs for you.
 */
@NoAutoDetect
class Program
@JsonCreator
private constructor(
    @JsonProperty("bank") @ExcludeMissing private val bank: JsonField<Bank> = JsonMissing.of(),
    @JsonProperty("billing_account_id")
    @ExcludeMissing
    private val billingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("default_digital_card_profile_id")
    @ExcludeMissing
    private val defaultDigitalCardProfileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interest_rate")
    @ExcludeMissing
    private val interestRate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Bank the Program is with. */
    fun bank(): Bank = bank.getRequired("bank")

    /** The Program billing account. */
    fun billingAccountId(): String? = billingAccountId.getNullable("billing_account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The default configuration for digital cards attached to this Program. */
    fun defaultDigitalCardProfileId(): String? =
        defaultDigitalCardProfileId.getNullable("default_digital_card_profile_id")

    /** The Program identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The Interest Rate currently being earned on the accounts in this program, as a string
     * containing a decimal number. For example, a 1% interest rate would be represented as "0.01".
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /** The name of the Program. */
    fun name(): String = name.getRequired("name")

    /** A constant representing the object's type. For this resource it will always be `program`. */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The Bank the Program is with. */
    @JsonProperty("bank") @ExcludeMissing fun _bank() = bank

    /** The Program billing account. */
    @JsonProperty("billing_account_id") @ExcludeMissing fun _billingAccountId() = billingAccountId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The default configuration for digital cards attached to this Program. */
    @JsonProperty("default_digital_card_profile_id")
    @ExcludeMissing
    fun _defaultDigitalCardProfileId() = defaultDigitalCardProfileId

    /** The Program identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The Interest Rate currently being earned on the accounts in this program, as a string
     * containing a decimal number. For example, a 1% interest rate would be represented as "0.01".
     */
    @JsonProperty("interest_rate") @ExcludeMissing fun _interestRate() = interestRate

    /** The name of the Program. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** A constant representing the object's type. For this resource it will always be `program`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Program = apply {
        if (!validated) {
            bank()
            billingAccountId()
            createdAt()
            defaultDigitalCardProfileId()
            id()
            interestRate()
            name()
            type()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var bank: JsonField<Bank> = JsonMissing.of()
        private var billingAccountId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var defaultDigitalCardProfileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var interestRate: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(program: Program) = apply {
            bank = program.bank
            billingAccountId = program.billingAccountId
            createdAt = program.createdAt
            defaultDigitalCardProfileId = program.defaultDigitalCardProfileId
            id = program.id
            interestRate = program.interestRate
            name = program.name
            type = program.type
            updatedAt = program.updatedAt
            additionalProperties = program.additionalProperties.toMutableMap()
        }

        /** The Bank the Program is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /** The Bank the Program is with. */
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: String) =
            billingAccountId(JsonField.of(billingAccountId))

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: JsonField<String>) = apply {
            this.billingAccountId = billingAccountId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: String) =
            defaultDigitalCardProfileId(JsonField.of(defaultDigitalCardProfileId))

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: JsonField<String>) = apply {
            this.defaultDigitalCardProfileId = defaultDigitalCardProfileId
        }

        /** The Program identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Program identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The Interest Rate currently being earned on the accounts in this program, as a string
         * containing a decimal number. For example, a 1% interest rate would be represented as
         * "0.01".
         */
        fun interestRate(interestRate: String) = interestRate(JsonField.of(interestRate))

        /**
         * The Interest Rate currently being earned on the accounts in this program, as a string
         * containing a decimal number. For example, a 1% interest rate would be represented as
         * "0.01".
         */
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name of the Program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Program. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): Program =
            Program(
                bank,
                billingAccountId,
                createdAt,
                defaultDigitalCardProfileId,
                id,
                interestRate,
                name,
                type,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    class Bank
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BLUE_RIDGE_BANK = of("blue_ridge_bank")

            val FIRST_INTERNET_BANK = of("first_internet_bank")

            val GRASSHOPPER_BANK = of("grasshopper_bank")

            fun of(value: String) = Bank(JsonField.of(value))
        }

        enum class Known {
            BLUE_RIDGE_BANK,
            FIRST_INTERNET_BANK,
            GRASSHOPPER_BANK,
        }

        enum class Value {
            BLUE_RIDGE_BANK,
            FIRST_INTERNET_BANK,
            GRASSHOPPER_BANK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BLUE_RIDGE_BANK -> Value.BLUE_RIDGE_BANK
                FIRST_INTERNET_BANK -> Value.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Value.GRASSHOPPER_BANK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BLUE_RIDGE_BANK -> Known.BLUE_RIDGE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Bank && value == other.value /* spotless:on */
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

            val PROGRAM = of("program")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROGRAM,
        }

        enum class Value {
            PROGRAM,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROGRAM -> Value.PROGRAM
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROGRAM -> Known.PROGRAM
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

        return /* spotless:off */ other is Program && bank == other.bank && billingAccountId == other.billingAccountId && createdAt == other.createdAt && defaultDigitalCardProfileId == other.defaultDigitalCardProfileId && id == other.id && interestRate == other.interestRate && name == other.name && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bank, billingAccountId, createdAt, defaultDigitalCardProfileId, id, interestRate, name, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Program{bank=$bank, billingAccountId=$billingAccountId, createdAt=$createdAt, defaultDigitalCardProfileId=$defaultDigitalCardProfileId, id=$id, interestRate=$interestRate, name=$name, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
