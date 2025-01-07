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
 * Groups represent organizations using Increase. You can retrieve information about your own
 * organization via the API. More commonly, OAuth platforms can retrieve information about the
 * organizations that have granted them access. Learn more about OAuth
 * [here](https://increase.com/documentation/oauth).
 */
@NoAutoDetect
class Group
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ach_debit_status")
    @ExcludeMissing
    private val achDebitStatus: JsonField<AchDebitStatus> = JsonMissing.of(),
    @JsonProperty("activation_status")
    @ExcludeMissing
    private val activationStatus: JsonField<ActivationStatus> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Group identifier. */
    fun id(): String = id.getRequired("id")

    /** If the Group is allowed to create ACH debits. */
    fun achDebitStatus(): AchDebitStatus = achDebitStatus.getRequired("ach_debit_status")

    /** If the Group is activated or not. */
    fun activationStatus(): ActivationStatus = activationStatus.getRequired("activation_status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A constant representing the object's type. For this resource it will always be `group`. */
    fun type(): Type = type.getRequired("type")

    /** The Group identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** If the Group is allowed to create ACH debits. */
    @JsonProperty("ach_debit_status")
    @ExcludeMissing
    fun _achDebitStatus(): JsonField<AchDebitStatus> = achDebitStatus

    /** If the Group is activated or not. */
    @JsonProperty("activation_status")
    @ExcludeMissing
    fun _activationStatus(): JsonField<ActivationStatus> = activationStatus

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A constant representing the object's type. For this resource it will always be `group`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Group = apply {
        if (!validated) {
            id()
            achDebitStatus()
            activationStatus()
            createdAt()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var achDebitStatus: JsonField<AchDebitStatus>? = null
        private var activationStatus: JsonField<ActivationStatus>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(group: Group) = apply {
            id = group.id
            achDebitStatus = group.achDebitStatus
            activationStatus = group.activationStatus
            createdAt = group.createdAt
            type = group.type
            additionalProperties = group.additionalProperties.toMutableMap()
        }

        /** The Group identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Group identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** If the Group is allowed to create ACH debits. */
        fun achDebitStatus(achDebitStatus: AchDebitStatus) =
            achDebitStatus(JsonField.of(achDebitStatus))

        /** If the Group is allowed to create ACH debits. */
        fun achDebitStatus(achDebitStatus: JsonField<AchDebitStatus>) = apply {
            this.achDebitStatus = achDebitStatus
        }

        /** If the Group is activated or not. */
        fun activationStatus(activationStatus: ActivationStatus) =
            activationStatus(JsonField.of(activationStatus))

        /** If the Group is activated or not. */
        fun activationStatus(activationStatus: JsonField<ActivationStatus>) = apply {
            this.activationStatus = activationStatus
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * A constant representing the object's type. For this resource it will always be `group`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `group`.
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

        fun build(): Group =
            Group(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(achDebitStatus) { "`achDebitStatus` is required but was not set" },
                checkNotNull(activationStatus) { "`activationStatus` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class AchDebitStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DISABLED = of("disabled")

            val ENABLED = of("enabled")

            fun of(value: String) = AchDebitStatus(JsonField.of(value))
        }

        enum class Known {
            DISABLED,
            ENABLED,
        }

        enum class Value {
            DISABLED,
            ENABLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DISABLED -> Value.DISABLED
                ENABLED -> Value.ENABLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DISABLED -> Known.DISABLED
                ENABLED -> Known.ENABLED
                else -> throw IncreaseInvalidDataException("Unknown AchDebitStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchDebitStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ActivationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val UNACTIVATED = of("unactivated")

            val ACTIVATED = of("activated")

            fun of(value: String) = ActivationStatus(JsonField.of(value))
        }

        enum class Known {
            UNACTIVATED,
            ACTIVATED,
        }

        enum class Value {
            UNACTIVATED,
            ACTIVATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UNACTIVATED -> Value.UNACTIVATED
                ACTIVATED -> Value.ACTIVATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UNACTIVATED -> Known.UNACTIVATED
                ACTIVATED -> Known.ACTIVATED
                else -> throw IncreaseInvalidDataException("Unknown ActivationStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActivationStatus && value == other.value /* spotless:on */
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

            val GROUP = of("group")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            GROUP,
        }

        enum class Value {
            GROUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                GROUP -> Value.GROUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                GROUP -> Known.GROUP
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

        return /* spotless:off */ other is Group && id == other.id && achDebitStatus == other.achDebitStatus && activationStatus == other.activationStatus && createdAt == other.createdAt && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, achDebitStatus, activationStatus, createdAt, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Group{id=$id, achDebitStatus=$achDebitStatus, activationStatus=$activationStatus, createdAt=$createdAt, type=$type, additionalProperties=$additionalProperties}"
}
