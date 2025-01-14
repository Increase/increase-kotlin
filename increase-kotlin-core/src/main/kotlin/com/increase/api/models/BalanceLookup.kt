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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Represents a request to lookup the balance of an Account at a given point in time. */
@NoAutoDetect
class BalanceLookup
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("available_balance")
    @ExcludeMissing
    private val availableBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("current_balance")
    @ExcludeMissing
    private val currentBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier for the account for which the balance was queried. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     */
    fun availableBalance(): Long = availableBalance.getRequired("available_balance")

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     */
    fun currentBalance(): Long = currentBalance.getRequired("current_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the account for which the balance was queried. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     */
    @JsonProperty("available_balance")
    @ExcludeMissing
    fun _availableBalance(): JsonField<Long> = availableBalance

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     */
    @JsonProperty("current_balance")
    @ExcludeMissing
    fun _currentBalance(): JsonField<Long> = currentBalance

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceLookup = apply {
        if (validated) {
            return@apply
        }

        accountId()
        availableBalance()
        currentBalance()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String>? = null
        private var availableBalance: JsonField<Long>? = null
        private var currentBalance: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceLookup: BalanceLookup) = apply {
            accountId = balanceLookup.accountId
            availableBalance = balanceLookup.availableBalance
            currentBalance = balanceLookup.currentBalance
            type = balanceLookup.type
            additionalProperties = balanceLookup.additionalProperties.toMutableMap()
        }

        /** The identifier for the account for which the balance was queried. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account for which the balance was queried. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        fun availableBalance(availableBalance: Long) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        fun availableBalance(availableBalance: JsonField<Long>) = apply {
            this.availableBalance = availableBalance
        }

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        fun currentBalance(currentBalance: Long) = currentBalance(JsonField.of(currentBalance))

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        fun currentBalance(currentBalance: JsonField<Long>) = apply {
            this.currentBalance = currentBalance
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
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

        fun build(): BalanceLookup =
            BalanceLookup(
                checkRequired("accountId", accountId),
                checkRequired("availableBalance", availableBalance),
                checkRequired("currentBalance", currentBalance),
                checkRequired("type", type),
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

            val BALANCE_LOOKUP = of("balance_lookup")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BALANCE_LOOKUP,
        }

        enum class Value {
            BALANCE_LOOKUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BALANCE_LOOKUP -> Value.BALANCE_LOOKUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BALANCE_LOOKUP -> Known.BALANCE_LOOKUP
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

        return /* spotless:off */ other is BalanceLookup && accountId == other.accountId && availableBalance == other.availableBalance && currentBalance == other.currentBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, availableBalance, currentBalance, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceLookup{accountId=$accountId, availableBalance=$availableBalance, currentBalance=$currentBalance, type=$type, additionalProperties=$additionalProperties}"
}
