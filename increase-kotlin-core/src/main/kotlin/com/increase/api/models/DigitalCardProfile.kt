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
 * This contains artwork and metadata relating to a Card's appearance in digital wallet apps like
 * Apple Pay and Google Pay. For more information, see our guide on
 * [digital card artwork](https://increase.com/documentation/card-art).
 */
@NoAutoDetect
class DigitalCardProfile
@JsonCreator
private constructor(
    @JsonProperty("app_icon_file_id")
    @ExcludeMissing
    private val appIconFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    private val backgroundImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_description")
    @ExcludeMissing
    private val cardDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_email")
    @ExcludeMissing
    private val contactEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_phone")
    @ExcludeMissing
    private val contactPhone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_website")
    @ExcludeMissing
    private val contactWebsite: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("issuer_name")
    @ExcludeMissing
    private val issuerName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("text_color")
    @ExcludeMissing
    private val textColor: JsonField<TextColor> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier of the File containing the card's icon image. */
    fun appIconFileId(): String = appIconFileId.getRequired("app_icon_file_id")

    /** The identifier of the File containing the card's front image. */
    fun backgroundImageFileId(): String =
        backgroundImageFileId.getRequired("background_image_file_id")

    /** A user-facing description for the card itself. */
    fun cardDescription(): String = cardDescription.getRequired("card_description")

    /** An email address the user can contact to receive support for their card. */
    fun contactEmail(): String? = contactEmail.getNullable("contact_email")

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): String? = contactPhone.getNullable("contact_phone")

    /** A website the user can visit to view and receive support for their card. */
    fun contactWebsite(): String? = contactWebsite.getNullable("contact_website")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A description you can use to identify the Card Profile. */
    fun description(): String = description.getRequired("description")

    /** The Card Profile identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /** A user-facing description for whoever is issuing the card. */
    fun issuerName(): String = issuerName.getRequired("issuer_name")

    /** The status of the Card Profile. */
    fun status(): Status = status.getRequired("status")

    /** The Card's text color, specified as an RGB triple. */
    fun textColor(): TextColor = textColor.getRequired("text_color")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of the File containing the card's icon image. */
    @JsonProperty("app_icon_file_id") @ExcludeMissing fun _appIconFileId() = appIconFileId

    /** The identifier of the File containing the card's front image. */
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    fun _backgroundImageFileId() = backgroundImageFileId

    /** A user-facing description for the card itself. */
    @JsonProperty("card_description") @ExcludeMissing fun _cardDescription() = cardDescription

    /** An email address the user can contact to receive support for their card. */
    @JsonProperty("contact_email") @ExcludeMissing fun _contactEmail() = contactEmail

    /** A phone number the user can contact to receive support for their card. */
    @JsonProperty("contact_phone") @ExcludeMissing fun _contactPhone() = contactPhone

    /** A website the user can visit to view and receive support for their card. */
    @JsonProperty("contact_website") @ExcludeMissing fun _contactWebsite() = contactWebsite

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** A description you can use to identify the Card Profile. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Card Profile identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** A user-facing description for whoever is issuing the card. */
    @JsonProperty("issuer_name") @ExcludeMissing fun _issuerName() = issuerName

    /** The status of the Card Profile. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Card's text color, specified as an RGB triple. */
    @JsonProperty("text_color") @ExcludeMissing fun _textColor() = textColor

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DigitalCardProfile = apply {
        if (!validated) {
            appIconFileId()
            backgroundImageFileId()
            cardDescription()
            contactEmail()
            contactPhone()
            contactWebsite()
            createdAt()
            description()
            id()
            idempotencyKey()
            issuerName()
            status()
            textColor().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var appIconFileId: JsonField<String> = JsonMissing.of()
        private var backgroundImageFileId: JsonField<String> = JsonMissing.of()
        private var cardDescription: JsonField<String> = JsonMissing.of()
        private var contactEmail: JsonField<String> = JsonMissing.of()
        private var contactPhone: JsonField<String> = JsonMissing.of()
        private var contactWebsite: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var issuerName: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var textColor: JsonField<TextColor> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(digitalCardProfile: DigitalCardProfile) = apply {
            appIconFileId = digitalCardProfile.appIconFileId
            backgroundImageFileId = digitalCardProfile.backgroundImageFileId
            cardDescription = digitalCardProfile.cardDescription
            contactEmail = digitalCardProfile.contactEmail
            contactPhone = digitalCardProfile.contactPhone
            contactWebsite = digitalCardProfile.contactWebsite
            createdAt = digitalCardProfile.createdAt
            description = digitalCardProfile.description
            id = digitalCardProfile.id
            idempotencyKey = digitalCardProfile.idempotencyKey
            issuerName = digitalCardProfile.issuerName
            status = digitalCardProfile.status
            textColor = digitalCardProfile.textColor
            type = digitalCardProfile.type
            additionalProperties = digitalCardProfile.additionalProperties.toMutableMap()
        }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            this.appIconFileId = appIconFileId
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) =
            backgroundImageFileId(JsonField.of(backgroundImageFileId))

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            this.backgroundImageFileId = backgroundImageFileId
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) =
            cardDescription(JsonField.of(cardDescription))

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            this.cardDescription = cardDescription
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = contactEmail(JsonField.of(contactEmail))

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = contactWebsite(JsonField.of(contactWebsite))

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: JsonField<String>) = apply {
            this.contactWebsite = contactWebsite
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

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description you can use to identify the Card Profile. */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: JsonField<String>) = apply { this.issuerName = issuerName }

        /** The status of the Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Card Profile. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: JsonField<TextColor>) = apply { this.textColor = textColor }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_card_profile`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_card_profile`.
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

        fun build(): DigitalCardProfile =
            DigitalCardProfile(
                appIconFileId,
                backgroundImageFileId,
                cardDescription,
                contactEmail,
                contactPhone,
                contactWebsite,
                createdAt,
                description,
                id,
                idempotencyKey,
                issuerName,
                status,
                textColor,
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

            val PENDING = of("pending")

            val REJECTED = of("rejected")

            val ACTIVE = of("active")

            val ARCHIVED = of("archived")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            REJECTED,
            ACTIVE,
            ARCHIVED,
        }

        enum class Value {
            PENDING,
            REJECTED,
            ACTIVE,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REJECTED -> Value.REJECTED
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                REJECTED -> Known.REJECTED
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

    /** The Card's text color, specified as an RGB triple. */
    @NoAutoDetect
    class TextColor
    @JsonCreator
    private constructor(
        @JsonProperty("blue") @ExcludeMissing private val blue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("green")
        @ExcludeMissing
        private val green: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("red") @ExcludeMissing private val red: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The value of the blue channel in the RGB color. */
        fun blue(): Long = blue.getRequired("blue")

        /** The value of the green channel in the RGB color. */
        fun green(): Long = green.getRequired("green")

        /** The value of the red channel in the RGB color. */
        fun red(): Long = red.getRequired("red")

        /** The value of the blue channel in the RGB color. */
        @JsonProperty("blue") @ExcludeMissing fun _blue() = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") @ExcludeMissing fun _green() = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") @ExcludeMissing fun _red() = red

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TextColor = apply {
            if (!validated) {
                blue()
                green()
                red()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var blue: JsonField<Long> = JsonMissing.of()
            private var green: JsonField<Long> = JsonMissing.of()
            private var red: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(textColor: TextColor) = apply {
                blue = textColor.blue
                green = textColor.green
                red = textColor.red
                additionalProperties = textColor.additionalProperties.toMutableMap()
            }

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: Long) = blue(JsonField.of(blue))

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: JsonField<Long>) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            fun green(green: Long) = green(JsonField.of(green))

            /** The value of the green channel in the RGB color. */
            fun green(green: JsonField<Long>) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            fun red(red: Long) = red(JsonField.of(red))

            /** The value of the red channel in the RGB color. */
            fun red(red: JsonField<Long>) = apply { this.red = red }

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

            fun build(): TextColor =
                TextColor(
                    blue,
                    green,
                    red,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TextColor && blue == other.blue && green == other.green && red == other.red && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(blue, green, red, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TextColor{blue=$blue, green=$green, red=$red, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DIGITAL_CARD_PROFILE = of("digital_card_profile")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_CARD_PROFILE,
        }

        enum class Value {
            DIGITAL_CARD_PROFILE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIGITAL_CARD_PROFILE -> Value.DIGITAL_CARD_PROFILE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIGITAL_CARD_PROFILE -> Known.DIGITAL_CARD_PROFILE
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

        return /* spotless:off */ other is DigitalCardProfile && appIconFileId == other.appIconFileId && backgroundImageFileId == other.backgroundImageFileId && cardDescription == other.cardDescription && contactEmail == other.contactEmail && contactPhone == other.contactPhone && contactWebsite == other.contactWebsite && createdAt == other.createdAt && description == other.description && id == other.id && idempotencyKey == other.idempotencyKey && issuerName == other.issuerName && status == other.status && textColor == other.textColor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, createdAt, description, id, idempotencyKey, issuerName, status, textColor, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalCardProfile{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, createdAt=$createdAt, description=$description, id=$id, idempotencyKey=$idempotencyKey, issuerName=$issuerName, status=$status, textColor=$textColor, type=$type, additionalProperties=$additionalProperties}"
}
