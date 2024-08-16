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
 * Programs determine the compliance and commercial terms of Accounts. By default, you have a
 * Commercial Banking program for managing your own funds. If you are lending or managing funds on
 * behalf of your customers, or otherwise engaged in regulated activity, we will work together to
 * create additional Programs for you.
 */
@JsonDeserialize(builder = Program.Builder::class)
@NoAutoDetect
class Program
private constructor(
    private val billingAccountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultDigitalCardProfileId: JsonField<String>,
    private val id: JsonField<String>,
    private val interestRate: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    fun validate(): Program = apply {
        if (!validated) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Program &&
            this.billingAccountId == other.billingAccountId &&
            this.createdAt == other.createdAt &&
            this.defaultDigitalCardProfileId == other.defaultDigitalCardProfileId &&
            this.id == other.id &&
            this.interestRate == other.interestRate &&
            this.name == other.name &&
            this.type == other.type &&
            this.updatedAt == other.updatedAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    billingAccountId,
                    createdAt,
                    defaultDigitalCardProfileId,
                    id,
                    interestRate,
                    name,
                    type,
                    updatedAt,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Program{billingAccountId=$billingAccountId, createdAt=$createdAt, defaultDigitalCardProfileId=$defaultDigitalCardProfileId, id=$id, interestRate=$interestRate, name=$name, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

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
            this.billingAccountId = program.billingAccountId
            this.createdAt = program.createdAt
            this.defaultDigitalCardProfileId = program.defaultDigitalCardProfileId
            this.id = program.id
            this.interestRate = program.interestRate
            this.name = program.name
            this.type = program.type
            this.updatedAt = program.updatedAt
            additionalProperties(program.additionalProperties)
        }

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: String) =
            billingAccountId(JsonField.of(billingAccountId))

        /** The Program billing account. */
        @JsonProperty("billing_account_id")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: String) =
            defaultDigitalCardProfileId(JsonField.of(defaultDigitalCardProfileId))

        /** The default configuration for digital cards attached to this Program. */
        @JsonProperty("default_digital_card_profile_id")
        @ExcludeMissing
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: JsonField<String>) = apply {
            this.defaultDigitalCardProfileId = defaultDigitalCardProfileId
        }

        /** The Program identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Program identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        @JsonProperty("interest_rate")
        @ExcludeMissing
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name of the Program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Program. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        @JsonProperty("type")
        @ExcludeMissing
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
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): Program =
            Program(
                billingAccountId,
                createdAt,
                defaultDigitalCardProfileId,
                id,
                interestRate,
                name,
                type,
                updatedAt,
                additionalProperties.toUnmodifiable(),
            )
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

            val PROGRAM = Type(JsonField.of("program"))

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
    }
}
