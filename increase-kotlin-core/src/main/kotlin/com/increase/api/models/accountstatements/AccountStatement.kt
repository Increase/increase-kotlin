// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

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
 * Account Statements are generated monthly for every active Account. You can access the statement's
 * data via the API or retrieve a PDF with its details via its associated File.
 */
@NoAutoDetect
class AccountStatement
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("file_id")
    @ExcludeMissing
    private val fileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("statement_period_end")
    @ExcludeMissing
    private val statementPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("statement_period_start")
    @ExcludeMissing
    private val statementPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Account Statement identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Account this Account Statement belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Statement
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The Account's balance at the start of its statement period.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * The identifier of the File containing a PDF of the statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The Account's balance at the start of its statement period.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
     * period the Account Statement covers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementPeriodEnd(): OffsetDateTime =
        statementPeriodEnd.getRequired("statement_period_end")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
     * period the Account Statement covers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementPeriodStart(): OffsetDateTime =
        statementPeriodStart.getRequired("statement_period_start")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /**
     * Returns the raw JSON value of [statementPeriodEnd].
     *
     * Unlike [statementPeriodEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_period_end")
    @ExcludeMissing
    fun _statementPeriodEnd(): JsonField<OffsetDateTime> = statementPeriodEnd

    /**
     * Returns the raw JSON value of [statementPeriodStart].
     *
     * Unlike [statementPeriodStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_period_start")
    @ExcludeMissing
    fun _statementPeriodStart(): JsonField<OffsetDateTime> = statementPeriodStart

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountStatement = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        createdAt()
        endingBalance()
        fileId()
        startingBalance()
        statementPeriodEnd()
        statementPeriodStart()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountStatement].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .createdAt()
         * .endingBalance()
         * .fileId()
         * .startingBalance()
         * .statementPeriodEnd()
         * .statementPeriodStart()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountStatement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var endingBalance: JsonField<Long>? = null
        private var fileId: JsonField<String>? = null
        private var startingBalance: JsonField<Long>? = null
        private var statementPeriodEnd: JsonField<OffsetDateTime>? = null
        private var statementPeriodStart: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountStatement: AccountStatement) = apply {
            id = accountStatement.id
            accountId = accountStatement.accountId
            createdAt = accountStatement.createdAt
            endingBalance = accountStatement.endingBalance
            fileId = accountStatement.fileId
            startingBalance = accountStatement.startingBalance
            statementPeriodEnd = accountStatement.statementPeriodEnd
            statementPeriodStart = accountStatement.statementPeriodStart
            type = accountStatement.type
            additionalProperties = accountStatement.additionalProperties.toMutableMap()
        }

        /** The Account Statement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account this Account Statement belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * Statement was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The Account's balance at the start of its statement period. */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /** The identifier of the File containing a PDF of the statement. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** The Account's balance at the start of its statement period. */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
         * period the Account Statement covers.
         */
        fun statementPeriodEnd(statementPeriodEnd: OffsetDateTime) =
            statementPeriodEnd(JsonField.of(statementPeriodEnd))

        /**
         * Sets [Builder.statementPeriodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementPeriodEnd] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statementPeriodEnd(statementPeriodEnd: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodEnd = statementPeriodEnd
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
         * period the Account Statement covers.
         */
        fun statementPeriodStart(statementPeriodStart: OffsetDateTime) =
            statementPeriodStart(JsonField.of(statementPeriodStart))

        /**
         * Sets [Builder.statementPeriodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementPeriodStart] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statementPeriodStart(statementPeriodStart: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodStart = statementPeriodStart
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_statement`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        fun build(): AccountStatement =
            AccountStatement(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("createdAt", createdAt),
                checkRequired("endingBalance", endingBalance),
                checkRequired("fileId", fileId),
                checkRequired("startingBalance", startingBalance),
                checkRequired("statementPeriodEnd", statementPeriodEnd),
                checkRequired("statementPeriodStart", statementPeriodStart),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
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

            val ACCOUNT_STATEMENT = of("account_statement")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACCOUNT_STATEMENT
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
            ACCOUNT_STATEMENT,
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
                ACCOUNT_STATEMENT -> Value.ACCOUNT_STATEMENT
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
                ACCOUNT_STATEMENT -> Known.ACCOUNT_STATEMENT
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

        return /* spotless:off */ other is AccountStatement && id == other.id && accountId == other.accountId && createdAt == other.createdAt && endingBalance == other.endingBalance && fileId == other.fileId && startingBalance == other.startingBalance && statementPeriodEnd == other.statementPeriodEnd && statementPeriodStart == other.statementPeriodStart && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, createdAt, endingBalance, fileId, startingBalance, statementPeriodEnd, statementPeriodStart, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountStatement{id=$id, accountId=$accountId, createdAt=$createdAt, endingBalance=$endingBalance, fileId=$fileId, startingBalance=$startingBalance, statementPeriodEnd=$statementPeriodEnd, statementPeriodStart=$statementPeriodStart, type=$type, additionalProperties=$additionalProperties}"
}
