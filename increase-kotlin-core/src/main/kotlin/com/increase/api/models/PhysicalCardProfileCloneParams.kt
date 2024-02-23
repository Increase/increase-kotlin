// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class PhysicalCardProfileCloneParams
constructor(
    private val physicalCardProfileId: String,
    private val carrierImageFileId: String?,
    private val contactPhone: String?,
    private val description: String?,
    private val frontImageFileId: String?,
    private val frontText: FrontText?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun physicalCardProfileId(): String = physicalCardProfileId

    fun carrierImageFileId(): String? = carrierImageFileId

    fun contactPhone(): String? = contactPhone

    fun description(): String? = description

    fun frontImageFileId(): String? = frontImageFileId

    fun frontText(): FrontText? = frontText

    internal fun getBody(): PhysicalCardProfileCloneBody {
        return PhysicalCardProfileCloneBody(
            carrierImageFileId,
            contactPhone,
            description,
            frontImageFileId,
            frontText,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> physicalCardProfileId
            else -> ""
        }
    }

    @JsonDeserialize(builder = PhysicalCardProfileCloneBody.Builder::class)
    @NoAutoDetect
    class PhysicalCardProfileCloneBody
    internal constructor(
        private val carrierImageFileId: String?,
        private val contactPhone: String?,
        private val description: String?,
        private val frontImageFileId: String?,
        private val frontText: FrontText?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the File containing the physical card's carrier image. */
        @JsonProperty("carrier_image_file_id")
        fun carrierImageFileId(): String? = carrierImageFileId

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone") fun contactPhone(): String? = contactPhone

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description") fun description(): String? = description

        /** The identifier of the File containing the physical card's front image. */
        @JsonProperty("front_image_file_id") fun frontImageFileId(): String? = frontImageFileId

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonProperty("front_text") fun frontText(): FrontText? = frontText

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCardProfileCloneBody &&
                this.carrierImageFileId == other.carrierImageFileId &&
                this.contactPhone == other.contactPhone &&
                this.description == other.description &&
                this.frontImageFileId == other.frontImageFileId &&
                this.frontText == other.frontText &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        carrierImageFileId,
                        contactPhone,
                        description,
                        frontImageFileId,
                        frontText,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCardProfileCloneBody{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, frontText=$frontText, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var carrierImageFileId: String? = null
            private var contactPhone: String? = null
            private var description: String? = null
            private var frontImageFileId: String? = null
            private var frontText: FrontText? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(physicalCardProfileCloneBody: PhysicalCardProfileCloneBody) = apply {
                this.carrierImageFileId = physicalCardProfileCloneBody.carrierImageFileId
                this.contactPhone = physicalCardProfileCloneBody.contactPhone
                this.description = physicalCardProfileCloneBody.description
                this.frontImageFileId = physicalCardProfileCloneBody.frontImageFileId
                this.frontText = physicalCardProfileCloneBody.frontText
                additionalProperties(physicalCardProfileCloneBody.additionalProperties)
            }

            /** The identifier of the File containing the physical card's carrier image. */
            @JsonProperty("carrier_image_file_id")
            fun carrierImageFileId(carrierImageFileId: String) = apply {
                this.carrierImageFileId = carrierImageFileId
            }

            /** A phone number the user can contact to receive support for their card. */
            @JsonProperty("contact_phone")
            fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

            /** A description you can use to identify the Card Profile. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The identifier of the File containing the physical card's front image. */
            @JsonProperty("front_image_file_id")
            fun frontImageFileId(frontImageFileId: String) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /**
             * Text printed on the front of the card. Reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            @JsonProperty("front_text")
            fun frontText(frontText: FrontText) = apply { this.frontText = frontText }

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

            fun build(): PhysicalCardProfileCloneBody =
                PhysicalCardProfileCloneBody(
                    carrierImageFileId,
                    contactPhone,
                    description,
                    frontImageFileId,
                    frontText,
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

        return other is PhysicalCardProfileCloneParams &&
            this.physicalCardProfileId == other.physicalCardProfileId &&
            this.carrierImageFileId == other.carrierImageFileId &&
            this.contactPhone == other.contactPhone &&
            this.description == other.description &&
            this.frontImageFileId == other.frontImageFileId &&
            this.frontText == other.frontText &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            physicalCardProfileId,
            carrierImageFileId,
            contactPhone,
            description,
            frontImageFileId,
            frontText,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PhysicalCardProfileCloneParams{physicalCardProfileId=$physicalCardProfileId, carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, frontText=$frontText, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var physicalCardProfileId: String? = null
        private var carrierImageFileId: String? = null
        private var contactPhone: String? = null
        private var description: String? = null
        private var frontImageFileId: String? = null
        private var frontText: FrontText? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(physicalCardProfileCloneParams: PhysicalCardProfileCloneParams) = apply {
            this.physicalCardProfileId = physicalCardProfileCloneParams.physicalCardProfileId
            this.carrierImageFileId = physicalCardProfileCloneParams.carrierImageFileId
            this.contactPhone = physicalCardProfileCloneParams.contactPhone
            this.description = physicalCardProfileCloneParams.description
            this.frontImageFileId = physicalCardProfileCloneParams.frontImageFileId
            this.frontText = physicalCardProfileCloneParams.frontText
            additionalQueryParams(physicalCardProfileCloneParams.additionalQueryParams)
            additionalHeaders(physicalCardProfileCloneParams.additionalHeaders)
            additionalBodyProperties(physicalCardProfileCloneParams.additionalBodyProperties)
        }

        /** The identifier of the Physical Card Profile to clone. */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            this.physicalCardProfileId = physicalCardProfileId
        }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) = apply {
            this.carrierImageFileId = carrierImageFileId
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { this.description = description }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        fun frontText(frontText: FrontText) = apply { this.frontText = frontText }

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

        fun build(): PhysicalCardProfileCloneParams =
            PhysicalCardProfileCloneParams(
                checkNotNull(physicalCardProfileId) {
                    "`physicalCardProfileId` is required but was not set"
                },
                carrierImageFileId,
                contactPhone,
                description,
                frontImageFileId,
                frontText,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Text printed on the front of the card. Reach out to
     * [support@increase.com](mailto:support@increase.com) for more information.
     */
    @JsonDeserialize(builder = FrontText.Builder::class)
    @NoAutoDetect
    class FrontText
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The first line of text on the front of the card. */
        @JsonProperty("line1") fun line1(): String? = line1

        /**
         * The second line of text on the front of the card. Providing a second line moves the first
         * line slightly higher and prints the second line in the spot where the first line would
         * have otherwise been printed.
         */
        @JsonProperty("line2") fun line2(): String? = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FrontText &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FrontText{line1=$line1, line2=$line2, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(frontText: FrontText) = apply {
                this.line1 = frontText.line1
                this.line2 = frontText.line2
                additionalProperties(frontText.additionalProperties)
            }

            /** The first line of text on the front of the card. */
            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            /**
             * The second line of text on the front of the card. Providing a second line moves the
             * first line slightly higher and prints the second line in the spot where the first
             * line would have otherwise been printed.
             */
            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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

            fun build(): FrontText =
                FrontText(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
