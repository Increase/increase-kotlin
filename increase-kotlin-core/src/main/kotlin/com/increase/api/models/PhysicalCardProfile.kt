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
 * This contains artwork and metadata relating to a Physical Card's appearance. For more
 * information, see our guide on
 * [physical card artwork](https://increase.com/documentation/card-art-physical-cards).
 */
@NoAutoDetect
class PhysicalCardProfile
@JsonCreator
private constructor(
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    private val backImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("carrier_image_file_id")
    @ExcludeMissing
    private val carrierImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_phone")
    @ExcludeMissing
    private val contactPhone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("creator")
    @ExcludeMissing
    private val creator: JsonField<Creator> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    private val frontImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("is_default")
    @ExcludeMissing
    private val isDefault: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier of the File containing the physical card's back image. */
    fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

    /** The identifier of the File containing the physical card's carrier image. */
    fun carrierImageFileId(): String? = carrierImageFileId.getNullable("carrier_image_file_id")

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): String? = contactPhone.getNullable("contact_phone")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The creator of this Physical Card Profile. */
    fun creator(): Creator = creator.getRequired("creator")

    /** A description you can use to identify the Physical Card Profile. */
    fun description(): String = description.getRequired("description")

    /** The identifier of the File containing the physical card's front image. */
    fun frontImageFileId(): String? = frontImageFileId.getNullable("front_image_file_id")

    /** The Card Profile identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /** Whether this Physical Card Profile is the default for all cards in its Increase group. */
    fun isDefault(): Boolean = isDefault.getRequired("is_default")

    /** The status of the Physical Card Profile. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card_profile`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of the File containing the physical card's back image. */
    @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

    /** The identifier of the File containing the physical card's carrier image. */
    @JsonProperty("carrier_image_file_id")
    @ExcludeMissing
    fun _carrierImageFileId() = carrierImageFileId

    /** A phone number the user can contact to receive support for their card. */
    @JsonProperty("contact_phone") @ExcludeMissing fun _contactPhone() = contactPhone

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The creator of this Physical Card Profile. */
    @JsonProperty("creator") @ExcludeMissing fun _creator() = creator

    /** A description you can use to identify the Physical Card Profile. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The identifier of the File containing the physical card's front image. */
    @JsonProperty("front_image_file_id") @ExcludeMissing fun _frontImageFileId() = frontImageFileId

    /** The Card Profile identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** Whether this Physical Card Profile is the default for all cards in its Increase group. */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault() = isDefault

    /** The status of the Physical Card Profile. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card_profile`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PhysicalCardProfile = apply {
        if (!validated) {
            backImageFileId()
            carrierImageFileId()
            contactPhone()
            createdAt()
            creator()
            description()
            frontImageFileId()
            id()
            idempotencyKey()
            isDefault()
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

        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var carrierImageFileId: JsonField<String> = JsonMissing.of()
        private var contactPhone: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creator: JsonField<Creator> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(physicalCardProfile: PhysicalCardProfile) = apply {
            backImageFileId = physicalCardProfile.backImageFileId
            carrierImageFileId = physicalCardProfile.carrierImageFileId
            contactPhone = physicalCardProfile.contactPhone
            createdAt = physicalCardProfile.createdAt
            creator = physicalCardProfile.creator
            description = physicalCardProfile.description
            frontImageFileId = physicalCardProfile.frontImageFileId
            id = physicalCardProfile.id
            idempotencyKey = physicalCardProfile.idempotencyKey
            isDefault = physicalCardProfile.isDefault
            status = physicalCardProfile.status
            type = physicalCardProfile.type
            additionalProperties = physicalCardProfile.additionalProperties.toMutableMap()
        }

        /** The identifier of the File containing the physical card's back image. */
        fun backImageFileId(backImageFileId: String) =
            backImageFileId(JsonField.of(backImageFileId))

        /** The identifier of the File containing the physical card's back image. */
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) =
            carrierImageFileId(JsonField.of(carrierImageFileId))

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
            this.carrierImageFileId = carrierImageFileId
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The creator of this Physical Card Profile. */
        fun creator(creator: Creator) = creator(JsonField.of(creator))

        /** The creator of this Physical Card Profile. */
        fun creator(creator: JsonField<Creator>) = apply { this.creator = creator }

        /** A description you can use to identify the Physical Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description you can use to identify the Physical Card Profile. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Profile identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Whether this Physical Card Profile is the default for all cards in its Increase group.
         */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Whether this Physical Card Profile is the default for all cards in its Increase group.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** The status of the Physical Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Physical Card Profile. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `physical_card_profile`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `physical_card_profile`.
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

        fun build(): PhysicalCardProfile =
            PhysicalCardProfile(
                backImageFileId,
                carrierImageFileId,
                contactPhone,
                createdAt,
                creator,
                description,
                frontImageFileId,
                id,
                idempotencyKey,
                isDefault,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Creator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INCREASE = of("increase")

            val USER = of("user")

            fun of(value: String) = Creator(JsonField.of(value))
        }

        enum class Known {
            INCREASE,
            USER,
        }

        enum class Value {
            INCREASE,
            USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCREASE -> Value.INCREASE
                USER -> Value.USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCREASE -> Known.INCREASE
                USER -> Known.USER
                else -> throw IncreaseInvalidDataException("Unknown Creator: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Creator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING_CREATING = of("pending_creating")

            val PENDING_REVIEWING = of("pending_reviewing")

            val REJECTED = of("rejected")

            val PENDING_SUBMITTING = of("pending_submitting")

            val ACTIVE = of("active")

            val ARCHIVED = of("archived")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_CREATING,
            PENDING_REVIEWING,
            REJECTED,
            PENDING_SUBMITTING,
            ACTIVE,
            ARCHIVED,
        }

        enum class Value {
            PENDING_CREATING,
            PENDING_REVIEWING,
            REJECTED,
            PENDING_SUBMITTING,
            ACTIVE,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_CREATING -> Value.PENDING_CREATING
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REJECTED -> Value.REJECTED
                PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_CREATING -> Known.PENDING_CREATING
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REJECTED -> Known.REJECTED
                PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
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

            val PHYSICAL_CARD_PROFILE = of("physical_card_profile")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PHYSICAL_CARD_PROFILE,
        }

        enum class Value {
            PHYSICAL_CARD_PROFILE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PHYSICAL_CARD_PROFILE -> Value.PHYSICAL_CARD_PROFILE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PHYSICAL_CARD_PROFILE -> Known.PHYSICAL_CARD_PROFILE
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

        return /* spotless:off */ other is PhysicalCardProfile && backImageFileId == other.backImageFileId && carrierImageFileId == other.carrierImageFileId && contactPhone == other.contactPhone && createdAt == other.createdAt && creator == other.creator && description == other.description && frontImageFileId == other.frontImageFileId && id == other.id && idempotencyKey == other.idempotencyKey && isDefault == other.isDefault && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(backImageFileId, carrierImageFileId, contactPhone, createdAt, creator, description, frontImageFileId, id, idempotencyKey, isDefault, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalCardProfile{backImageFileId=$backImageFileId, carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, createdAt=$createdAt, creator=$creator, description=$description, frontImageFileId=$frontImageFileId, id=$id, idempotencyKey=$idempotencyKey, isDefault=$isDefault, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
