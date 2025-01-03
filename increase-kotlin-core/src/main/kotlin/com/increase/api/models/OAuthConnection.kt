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
 * When a user authorizes your OAuth application, an OAuth Connection object is created. Learn more
 * about OAuth [here](https://increase.com/documentation/oauth).
 */
@NoAutoDetect
class OAuthConnection
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("group_id")
    @ExcludeMissing
    private val groupId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("oauth_application_id")
    @ExcludeMissing
    private val oauthApplicationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Connection
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Connection
     * was deleted.
     */
    fun deletedAt(): OffsetDateTime? = deletedAt.getNullable("deleted_at")

    /** The identifier of the Group that has authorized your OAuth application. */
    fun groupId(): String = groupId.getRequired("group_id")

    /** The OAuth Connection's identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier of the OAuth application this connection is for. */
    fun oauthApplicationId(): String = oauthApplicationId.getRequired("oauth_application_id")

    /** Whether the connection is active. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_connection`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Connection
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Connection
     * was deleted.
     */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** The identifier of the Group that has authorized your OAuth application. */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId() = groupId

    /** The OAuth Connection's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The identifier of the OAuth application this connection is for. */
    @JsonProperty("oauth_application_id")
    @ExcludeMissing
    fun _oauthApplicationId() = oauthApplicationId

    /** Whether the connection is active. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_connection`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OAuthConnection = apply {
        if (!validated) {
            createdAt()
            deletedAt()
            groupId()
            id()
            oauthApplicationId()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var oauthApplicationId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthConnection: OAuthConnection) = apply {
            createdAt = oauthConnection.createdAt
            deletedAt = oauthConnection.deletedAt
            groupId = oauthConnection.groupId
            id = oauthConnection.id
            oauthApplicationId = oauthConnection.oauthApplicationId
            status = oauthConnection.status
            type = oauthConnection.type
            additionalProperties = oauthConnection.additionalProperties.toMutableMap()
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was deleted.
         */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was deleted.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** The identifier of the Group that has authorized your OAuth application. */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /** The identifier of the Group that has authorized your OAuth application. */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** The OAuth Connection's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The OAuth Connection's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the OAuth application this connection is for. */
        fun oauthApplicationId(oauthApplicationId: String) =
            oauthApplicationId(JsonField.of(oauthApplicationId))

        /** The identifier of the OAuth application this connection is for. */
        fun oauthApplicationId(oauthApplicationId: JsonField<String>) = apply {
            this.oauthApplicationId = oauthApplicationId
        }

        /** Whether the connection is active. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the connection is active. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_connection`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_connection`.
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

        fun build(): OAuthConnection =
            OAuthConnection(
                createdAt,
                deletedAt,
                groupId,
                id,
                oauthApplicationId,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val INACTIVE = of("inactive")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
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

            val OAUTH_CONNECTION = of("oauth_connection")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OAUTH_CONNECTION,
        }

        enum class Value {
            OAUTH_CONNECTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OAUTH_CONNECTION -> Value.OAUTH_CONNECTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OAUTH_CONNECTION -> Known.OAUTH_CONNECTION
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

        return /* spotless:off */ other is OAuthConnection && createdAt == other.createdAt && deletedAt == other.deletedAt && groupId == other.groupId && id == other.id && oauthApplicationId == other.oauthApplicationId && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, deletedAt, groupId, id, oauthApplicationId, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthConnection{createdAt=$createdAt, deletedAt=$deletedAt, groupId=$groupId, id=$id, oauthApplicationId=$oauthApplicationId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
