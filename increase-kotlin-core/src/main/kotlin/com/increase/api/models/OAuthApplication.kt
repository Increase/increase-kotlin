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
import java.time.OffsetDateTime
import java.util.Objects

/**
 * An OAuth Application lets you build an application for others to use with their Increase data.
 * You can create an OAuth Application via the Dashboard and read information about it with the API.
 * Learn more about OAuth [here](https://increase.com/documentation/oauth).
 */
@NoAutoDetect
class OAuthApplication
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_id")
    @ExcludeMissing
    private val clientId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The OAuth Application's identifier. */
    fun id(): String = id.getRequired("id")

    /** The OAuth Application's client_id. Use this to authenticate with the OAuth Application. */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was deleted.
     */
    fun deletedAt(): OffsetDateTime? = deletedAt.getNullable("deleted_at")

    /** The name you chose for this OAuth Application. */
    fun name(): String? = name.getNullable("name")

    /** Whether the application is active. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_application`.
     */
    fun type(): Type = type.getRequired("type")

    /** The OAuth Application's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The OAuth Application's client_id. Use this to authenticate with the OAuth Application. */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was deleted.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** The name you chose for this OAuth Application. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Whether the application is active. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_application`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OAuthApplication = apply {
        if (validated) {
            return@apply
        }

        id()
        clientId()
        createdAt()
        deletedAt()
        name()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthApplication].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .clientId()
         * .createdAt()
         * .deletedAt()
         * .name()
         * .status()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OAuthApplication]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var clientId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var deletedAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthApplication: OAuthApplication) = apply {
            id = oauthApplication.id
            clientId = oauthApplication.clientId
            createdAt = oauthApplication.createdAt
            deletedAt = oauthApplication.deletedAt
            name = oauthApplication.name
            status = oauthApplication.status
            type = oauthApplication.type
            additionalProperties = oauthApplication.additionalProperties.toMutableMap()
        }

        /** The OAuth Application's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The OAuth Application's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The OAuth Application's client_id. Use this to authenticate with the OAuth Application.
         */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * The OAuth Application's client_id. Use this to authenticate with the OAuth Application.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was deleted.
         */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was deleted.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** The name you chose for this OAuth Application. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** The name you chose for this OAuth Application. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether the application is active. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the application is active. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_application`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_application`.
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

        fun build(): OAuthApplication =
            OAuthApplication(
                checkRequired("id", id),
                checkRequired("clientId", clientId),
                checkRequired("createdAt", createdAt),
                checkRequired("deletedAt", deletedAt),
                checkRequired("name", name),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Whether the application is active. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The application is active and can be used by your users. */
            val ACTIVE = of("active")

            /** The application is deleted. */
            val DELETED = of("deleted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The application is active and can be used by your users. */
            ACTIVE,
            /** The application is deleted. */
            DELETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The application is active and can be used by your users. */
            ACTIVE,
            /** The application is deleted. */
            DELETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                DELETED -> Value.DELETED
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
                ACTIVE -> Known.ACTIVE
                DELETED -> Known.DELETED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_application`.
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

            val OAUTH_APPLICATION = of("oauth_application")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OAUTH_APPLICATION
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
            OAUTH_APPLICATION,
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
                OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
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
                OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
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

        return /* spotless:off */ other is OAuthApplication && id == other.id && clientId == other.clientId && createdAt == other.createdAt && deletedAt == other.deletedAt && name == other.name && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, clientId, createdAt, deletedAt, name, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthApplication{id=$id, clientId=$clientId, createdAt=$createdAt, deletedAt=$deletedAt, name=$name, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
