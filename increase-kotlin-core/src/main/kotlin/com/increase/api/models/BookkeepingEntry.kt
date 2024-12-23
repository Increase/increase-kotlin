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
 * Entries are T-account entries recording debits and credits. Your compliance setup might require
 * annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingEntry
@JsonCreator
private constructor(
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
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    /** The entry identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Entry amount in the minor unit of its currency. For dollars, for example, this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** When the entry set was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("entry_set_id") @ExcludeMissing fun _entrySetId() = entrySetId

    /** The entry identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingEntry = apply {
        if (!validated) {
            accountId()
            amount()
            createdAt()
            entrySetId()
            id()
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
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entrySetId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bookkeepingEntry: BookkeepingEntry) = apply {
            accountId = bookkeepingEntry.accountId
            amount = bookkeepingEntry.amount
            createdAt = bookkeepingEntry.createdAt
            entrySetId = bookkeepingEntry.entrySetId
            id = bookkeepingEntry.id
            type = bookkeepingEntry.type
            additionalProperties = bookkeepingEntry.additionalProperties.toMutableMap()
        }

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

        /** The entry identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
                accountId,
                amount,
                createdAt,
                entrySetId,
                id,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BOOKKEEPING_ENTRY = of("bookkeeping_entry")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BOOKKEEPING_ENTRY,
        }

        enum class Value {
            BOOKKEEPING_ENTRY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BOOKKEEPING_ENTRY -> Value.BOOKKEEPING_ENTRY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BOOKKEEPING_ENTRY -> Known.BOOKKEEPING_ENTRY
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

        return /* spotless:off */ other is BookkeepingEntry && accountId == other.accountId && amount == other.amount && createdAt == other.createdAt && entrySetId == other.entrySetId && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, amount, createdAt, entrySetId, id, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingEntry{accountId=$accountId, amount=$amount, createdAt=$createdAt, entrySetId=$entrySetId, id=$id, type=$type, additionalProperties=$additionalProperties}"
}
