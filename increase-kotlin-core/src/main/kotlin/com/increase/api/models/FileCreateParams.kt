// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ContentTypes
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import org.apache.hc.core5.http.ContentType

class FileCreateParams
constructor(
    private val file: MultipartFormValue<ByteArray>,
    private val purpose: MultipartFormValue<Purpose>,
    private val description: MultipartFormValue<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun file(): MultipartFormValue<ByteArray> = file

    fun purpose(): MultipartFormValue<Purpose> = purpose

    fun description(): MultipartFormValue<String>? = description

    internal fun getBody(): Array<MultipartFormValue<*>?> {
        return arrayOf(
            file,
            purpose,
            description,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = FileCreateBody.Builder::class)
    @NoAutoDetect
    class FileCreateBody
    internal constructor(
        private val file: ByteArray?,
        private val purpose: Purpose?,
        private val description: String?,
    ) {

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(): ByteArray? = file

        /** What the File will be used for in Increase's systems. */
        fun purpose(): Purpose? = purpose

        /** The description you choose to give the File. */
        fun description(): String? = description

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var file: ByteArray? = null
            private var purpose: Purpose? = null
            private var description: String? = null

            internal fun from(fileCreateBody: FileCreateBody) = apply {
                this.file = fileCreateBody.file
                this.purpose = fileCreateBody.purpose
                this.description = fileCreateBody.description
            }

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: ByteArray) = apply { this.file = file }

            /** What the File will be used for in Increase's systems. */
            fun purpose(purpose: Purpose) = apply { this.purpose = purpose }

            /** The description you choose to give the File. */
            fun description(description: String) = apply { this.description = description }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FileCreateBody &&
                this.file == other.file &&
                this.purpose == other.purpose &&
                this.description == other.description
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        file,
                        purpose,
                        description,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FileCreateBody{file=$file, purpose=$purpose, description=$description}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileCreateParams &&
            this.file == other.file &&
            this.purpose == other.purpose &&
            this.description == other.description &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            file,
            purpose,
            description,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "FileCreateParams{file=$file, purpose=$purpose, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var file: MultipartFormValue<ByteArray>? = null
        private var purpose: MultipartFormValue<Purpose>? = null
        private var description: MultipartFormValue<String>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(fileCreateParams: FileCreateParams) = apply {
            this.file = fileCreateParams.file
            this.purpose = fileCreateParams.purpose
            this.description = fileCreateParams.description
            additionalQueryParams(fileCreateParams.additionalQueryParams)
            additionalHeaders(fileCreateParams.additionalHeaders)
        }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(
            content: ByteArray,
            filename: String? = null,
            contentType: ContentType = ContentTypes.DefaultBinary
        ) = apply {
            this.file = MultipartFormValue.fromByteArray("file", content, contentType, filename)
        }

        /** What the File will be used for in Increase's systems. */
        fun purpose(purpose: Purpose, contentType: ContentType = ContentTypes.DefaultText) = apply {
            this.purpose = MultipartFormValue.fromEnum("purpose", purpose, contentType)
        }

        /** The description you choose to give the File. */
        fun description(description: String, contentType: ContentType = ContentTypes.DefaultText) =
            apply {
                this.description =
                    MultipartFormValue.fromString("description", description, contentType)
            }

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

        fun build(): FileCreateParams =
            FileCreateParams(
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(purpose) { "`purpose` is required but was not set" },
                description,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
