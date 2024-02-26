// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class FileCreateParams
constructor(
    private val file: String,
    private val purpose: Purpose,
    private val description: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun file(): String = file

    fun purpose(): Purpose = purpose

    fun description(): String? = description

    internal fun getBody(): FileCreateBody {
        return FileCreateBody(
            file,
            purpose,
            description,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = FileCreateBody.Builder::class)
    @NoAutoDetect
    class FileCreateBody
    internal constructor(
        private val file: String?,
        private val purpose: Purpose?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        @JsonProperty("file") fun file(): String? = file

        /** What the File will be used for in Increase's systems. */
        @JsonProperty("purpose") fun purpose(): Purpose? = purpose

        /** The description you choose to give the File. */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FileCreateBody &&
                this.file == other.file &&
                this.purpose == other.purpose &&
                this.description == other.description &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        file,
                        purpose,
                        description,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FileCreateBody{file=$file, purpose=$purpose, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var file: String? = null
            private var purpose: Purpose? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fileCreateBody: FileCreateBody) = apply {
                this.file = fileCreateBody.file
                this.purpose = fileCreateBody.purpose
                this.description = fileCreateBody.description
                additionalProperties(fileCreateBody.additionalProperties)
            }

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            @JsonProperty("file") fun file(file: String) = apply { this.file = file }

            /** What the File will be used for in Increase's systems. */
            @JsonProperty("purpose")
            fun purpose(purpose: Purpose) = apply { this.purpose = purpose }

            /** The description you choose to give the File. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FileCreateBody =
                FileCreateBody(
                    checkNotNull(file) { "`file` is required but was not set" },
                    checkNotNull(purpose) { "`purpose` is required but was not set" },
                    description,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileCreateParams &&
            this.file == other.file &&
            this.purpose == other.purpose &&
            this.description == other.description &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            file,
            purpose,
            description,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FileCreateParams{file=$file, purpose=$purpose, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var file: String? = null
        private var purpose: Purpose? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(fileCreateParams: FileCreateParams) = apply {
            this.file = fileCreateParams.file
            this.purpose = fileCreateParams.purpose
            this.description = fileCreateParams.description
            additionalQueryParams(fileCreateParams.additionalQueryParams)
            additionalHeaders(fileCreateParams.additionalHeaders)
            additionalBodyProperties(fileCreateParams.additionalBodyProperties)
        }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(file: String) = apply { this.file = file }

        /** What the File will be used for in Increase's systems. */
        fun purpose(purpose: Purpose) = apply { this.purpose = purpose }

        /** The description you choose to give the File. */
        fun description(description: String) = apply { this.description = description }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FileCreateParams =
            FileCreateParams(
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(purpose) { "`purpose` is required but was not set" },
                description,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Purpose && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CHECK_IMAGE_FRONT = Purpose(JsonField.of("check_image_front"))

            val CHECK_IMAGE_BACK = Purpose(JsonField.of("check_image_back"))

            val MAILED_CHECK_IMAGE = Purpose(JsonField.of("mailed_check_image"))

            val FORM_SS_4 = Purpose(JsonField.of("form_ss_4"))

            val IDENTITY_DOCUMENT = Purpose(JsonField.of("identity_document"))

            val OTHER = Purpose(JsonField.of("other"))

            val TRUST_FORMATION_DOCUMENT = Purpose(JsonField.of("trust_formation_document"))

            val DIGITAL_WALLET_ARTWORK = Purpose(JsonField.of("digital_wallet_artwork"))

            val DIGITAL_WALLET_APP_ICON = Purpose(JsonField.of("digital_wallet_app_icon"))

            val PHYSICAL_CARD_FRONT = Purpose(JsonField.of("physical_card_front"))

            val PHYSICAL_CARD_CARRIER = Purpose(JsonField.of("physical_card_carrier"))

            val DOCUMENT_REQUEST = Purpose(JsonField.of("document_request"))

            val ENTITY_SUPPLEMENTAL_DOCUMENT = Purpose(JsonField.of("entity_supplemental_document"))

            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT =
                Purpose(JsonField.of("unusual_activity_report_attachment"))

            fun of(value: String) = Purpose(JsonField.of(value))
        }

        enum class Known {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
        }

        enum class Value {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                FORM_SS_4 -> Value.FORM_SS_4
                IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                OTHER -> Value.OTHER
                TRUST_FORMATION_DOCUMENT -> Value.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Value.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Value.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Value.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_CARRIER -> Value.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Value.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Value.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                FORM_SS_4 -> Known.FORM_SS_4
                IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                OTHER -> Known.OTHER
                TRUST_FORMATION_DOCUMENT -> Known.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Known.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Known.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Known.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_CARRIER -> Known.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Known.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Known.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                else -> throw IncreaseInvalidDataException("Unknown Purpose: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
