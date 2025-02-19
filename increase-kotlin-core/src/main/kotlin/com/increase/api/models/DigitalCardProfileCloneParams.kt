// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/** Clones a Digital Card Profile */
class DigitalCardProfileCloneParams
private constructor(
    private val digitalCardProfileId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Digital Card Profile to clone. */
    fun digitalCardProfileId(): String = digitalCardProfileId

    /** The identifier of the File containing the card's icon image. */
    fun appIconFileId(): String? = body.appIconFileId()

    /** The identifier of the File containing the card's front image. */
    fun backgroundImageFileId(): String? = body.backgroundImageFileId()

    /** A user-facing description for the card itself. */
    fun cardDescription(): String? = body.cardDescription()

    /** An email address the user can contact to receive support for their card. */
    fun contactEmail(): String? = body.contactEmail()

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): String? = body.contactPhone()

    /** A website the user can visit to view and receive support for their card. */
    fun contactWebsite(): String? = body.contactWebsite()

    /** A description you can use to identify the Card Profile. */
    fun description(): String? = body.description()

    /** A user-facing description for whoever is issuing the card. */
    fun issuerName(): String? = body.issuerName()

    /** The Card's text color, specified as an RGB triple. The default is white. */
    fun textColor(): TextColor? = body.textColor()

    /** The identifier of the File containing the card's icon image. */
    fun _appIconFileId(): JsonField<String> = body._appIconFileId()

    /** The identifier of the File containing the card's front image. */
    fun _backgroundImageFileId(): JsonField<String> = body._backgroundImageFileId()

    /** A user-facing description for the card itself. */
    fun _cardDescription(): JsonField<String> = body._cardDescription()

    /** An email address the user can contact to receive support for their card. */
    fun _contactEmail(): JsonField<String> = body._contactEmail()

    /** A phone number the user can contact to receive support for their card. */
    fun _contactPhone(): JsonField<String> = body._contactPhone()

    /** A website the user can visit to view and receive support for their card. */
    fun _contactWebsite(): JsonField<String> = body._contactWebsite()

    /** A description you can use to identify the Card Profile. */
    fun _description(): JsonField<String> = body._description()

    /** A user-facing description for whoever is issuing the card. */
    fun _issuerName(): JsonField<String> = body._issuerName()

    /** The Card's text color, specified as an RGB triple. The default is white. */
    fun _textColor(): JsonField<TextColor> = body._textColor()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> digitalCardProfileId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
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
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issuer_name")
        @ExcludeMissing
        private val issuerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_color")
        @ExcludeMissing
        private val textColor: JsonField<TextColor> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(): String? = appIconFileId.getNullable("app_icon_file_id")

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(): String? =
            backgroundImageFileId.getNullable("background_image_file_id")

        /** A user-facing description for the card itself. */
        fun cardDescription(): String? = cardDescription.getNullable("card_description")

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(): String? = contactEmail.getNullable("contact_email")

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(): String? = contactPhone.getNullable("contact_phone")

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(): String? = contactWebsite.getNullable("contact_website")

        /** A description you can use to identify the Card Profile. */
        fun description(): String? = description.getNullable("description")

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(): String? = issuerName.getNullable("issuer_name")

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(): TextColor? = textColor.getNullable("text_color")

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id")
        @ExcludeMissing
        fun _appIconFileId(): JsonField<String> = appIconFileId

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        @ExcludeMissing
        fun _backgroundImageFileId(): JsonField<String> = backgroundImageFileId

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description")
        @ExcludeMissing
        fun _cardDescription(): JsonField<String> = cardDescription

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email")
        @ExcludeMissing
        fun _contactEmail(): JsonField<String> = contactEmail

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website")
        @ExcludeMissing
        fun _contactWebsite(): JsonField<String> = contactWebsite

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name")
        @ExcludeMissing
        fun _issuerName(): JsonField<String> = issuerName

        /** The Card's text color, specified as an RGB triple. The default is white. */
        @JsonProperty("text_color")
        @ExcludeMissing
        fun _textColor(): JsonField<TextColor> = textColor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            appIconFileId()
            backgroundImageFileId()
            cardDescription()
            contactEmail()
            contactPhone()
            contactWebsite()
            description()
            issuerName()
            textColor()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var appIconFileId: JsonField<String> = JsonMissing.of()
            private var backgroundImageFileId: JsonField<String> = JsonMissing.of()
            private var cardDescription: JsonField<String> = JsonMissing.of()
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var contactPhone: JsonField<String> = JsonMissing.of()
            private var contactWebsite: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var issuerName: JsonField<String> = JsonMissing.of()
            private var textColor: JsonField<TextColor> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                appIconFileId = body.appIconFileId
                backgroundImageFileId = body.backgroundImageFileId
                cardDescription = body.cardDescription
                contactEmail = body.contactEmail
                contactPhone = body.contactPhone
                contactWebsite = body.contactWebsite
                description = body.description
                issuerName = body.issuerName
                textColor = body.textColor
                additionalProperties = body.additionalProperties.toMutableMap()
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
            fun contactWebsite(contactWebsite: String) =
                contactWebsite(JsonField.of(contactWebsite))

            /** A website the user can visit to view and receive support for their card. */
            fun contactWebsite(contactWebsite: JsonField<String>) = apply {
                this.contactWebsite = contactWebsite
            }

            /** A description you can use to identify the Card Profile. */
            fun description(description: String) = description(JsonField.of(description))

            /** A description you can use to identify the Card Profile. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** A user-facing description for whoever is issuing the card. */
            fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

            /** A user-facing description for whoever is issuing the card. */
            fun issuerName(issuerName: JsonField<String>) = apply { this.issuerName = issuerName }

            /** The Card's text color, specified as an RGB triple. The default is white. */
            fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

            /** The Card's text color, specified as an RGB triple. The default is white. */
            fun textColor(textColor: JsonField<TextColor>) = apply { this.textColor = textColor }

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

            fun build(): Body =
                Body(
                    appIconFileId,
                    backgroundImageFileId,
                    cardDescription,
                    contactEmail,
                    contactPhone,
                    contactWebsite,
                    description,
                    issuerName,
                    textColor,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && appIconFileId == other.appIconFileId && backgroundImageFileId == other.backgroundImageFileId && cardDescription == other.cardDescription && contactEmail == other.contactEmail && contactPhone == other.contactPhone && contactWebsite == other.contactWebsite && description == other.description && issuerName == other.issuerName && textColor == other.textColor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, description, issuerName, textColor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, description=$description, issuerName=$issuerName, textColor=$textColor, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [DigitalCardProfileCloneParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var digitalCardProfileId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(digitalCardProfileCloneParams: DigitalCardProfileCloneParams) = apply {
            digitalCardProfileId = digitalCardProfileCloneParams.digitalCardProfileId
            body = digitalCardProfileCloneParams.body.toBuilder()
            additionalHeaders = digitalCardProfileCloneParams.additionalHeaders.toBuilder()
            additionalQueryParams = digitalCardProfileCloneParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Digital Card Profile to clone. */
        fun digitalCardProfileId(digitalCardProfileId: String) = apply {
            this.digitalCardProfileId = digitalCardProfileId
        }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = apply { body.appIconFileId(appIconFileId) }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            body.appIconFileId(appIconFileId)
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) = apply {
            body.backgroundImageFileId(backgroundImageFileId)
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            body.backgroundImageFileId(backgroundImageFileId)
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) = apply {
            body.cardDescription(cardDescription)
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            body.cardDescription(cardDescription)
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = apply { body.contactEmail(contactEmail) }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            body.contactEmail(contactEmail)
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { body.contactPhone(contactPhone) }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            body.contactPhone(contactPhone)
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = apply { body.contactWebsite(contactWebsite) }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: JsonField<String>) = apply {
            body.contactWebsite(contactWebsite)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { body.description(description) }

        /** A description you can use to identify the Card Profile. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = apply { body.issuerName(issuerName) }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: JsonField<String>) = apply { body.issuerName(issuerName) }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: TextColor) = apply { body.textColor(textColor) }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: JsonField<TextColor>) = apply { body.textColor(textColor) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): DigitalCardProfileCloneParams =
            DigitalCardProfileCloneParams(
                checkRequired("digitalCardProfileId", digitalCardProfileId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The Card's text color, specified as an RGB triple. The default is white. */
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
        @JsonProperty("blue") @ExcludeMissing fun _blue(): JsonField<Long> = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") @ExcludeMissing fun _green(): JsonField<Long> = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") @ExcludeMissing fun _red(): JsonField<Long> = red

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TextColor = apply {
            if (validated) {
                return@apply
            }

            blue()
            green()
            red()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [TextColor]. */
        class Builder internal constructor() {

            private var blue: JsonField<Long>? = null
            private var green: JsonField<Long>? = null
            private var red: JsonField<Long>? = null
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
                    checkRequired("blue", blue),
                    checkRequired("green", green),
                    checkRequired("red", red),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileCloneParams && digitalCardProfileId == other.digitalCardProfileId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardProfileId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileCloneParams{digitalCardProfileId=$digitalCardProfileId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
