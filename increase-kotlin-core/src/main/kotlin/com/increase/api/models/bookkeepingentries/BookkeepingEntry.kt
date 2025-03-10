// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

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
 * Entries are T-account entries recording debits and credits. Your compliance setup might require
 * annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingEntry
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entry_set_id")
    @ExcludeMissing
    private val entrySetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The entry identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Account the Entry belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Entry amount in the minor unit of its currency. For dollars, for example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /** When the entry set was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier for the Account the Entry belongs to. */
    fun entrySetId(): String = entrySetId.getRequired("entry_set_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    fun type(): Type = type.getRequired("type")

    /** The entry identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The Entry amount in the minor unit of its currency. For dollars, for example, this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** When the entry set was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("entry_set_id") @ExcludeMissing fun _entrySetId(): JsonField<String> = entrySetId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        amount()
        createdAt()
        entrySetId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingEntry].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .amount()
         * .createdAt()
         * .entrySetId()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BookkeepingEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entrySetId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bookkeepingEntry: BookkeepingEntry) = apply {
            id = bookkeepingEntry.id
            accountId = bookkeepingEntry.accountId
            amount = bookkeepingEntry.amount
            createdAt = bookkeepingEntry.createdAt
            entrySetId = bookkeepingEntry.entrySetId
            type = bookkeepingEntry.type
            additionalProperties = bookkeepingEntry.additionalProperties.toMutableMap()
        }

        /** The entry identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account the Entry belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Entry belongs to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Entry amount in the minor unit of its currency. For dollars, for example, this is
         * cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Entry amount in the minor unit of its currency. For dollars, for example, this is
         * cents.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** When the entry set was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** When the entry set was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier for the Account the Entry belongs to. */
        fun entrySetId(entrySetId: String) = entrySetId(JsonField.of(entrySetId))

        /** The identifier for the Account the Entry belongs to. */
        fun entrySetId(entrySetId: JsonField<String>) = apply { this.entrySetId = entrySetId }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry`.
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

        fun build(): BookkeepingEntry =
            BookkeepingEntry(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("entrySetId", entrySetId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
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

            val BOOKKEEPING_ENTRY = of("bookkeeping_entry")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOKKEEPING_ENTRY
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
            BOOKKEEPING_ENTRY,
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
                BOOKKEEPING_ENTRY -> Value.BOOKKEEPING_ENTRY
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
                BOOKKEEPING_ENTRY -> Known.BOOKKEEPING_ENTRY
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

        return /* spotless:off */ other is BookkeepingEntry && id == other.id && accountId == other.accountId && amount == other.amount && createdAt == other.createdAt && entrySetId == other.entrySetId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, createdAt, entrySetId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingEntry{id=$id, accountId=$accountId, amount=$amount, createdAt=$createdAt, entrySetId=$entrySetId, type=$type, additionalProperties=$additionalProperties}"
}
