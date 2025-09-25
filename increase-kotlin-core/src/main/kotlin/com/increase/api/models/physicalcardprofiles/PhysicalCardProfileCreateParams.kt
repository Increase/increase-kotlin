// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a Physical Card Profile */
class PhysicalCardProfileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the File containing the physical card's carrier image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun carrierImageFileId(): String = body.carrierImageFileId()

    /**
     * A phone number the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactPhone(): String = body.contactPhone()

    /**
     * A description you can use to identify the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * The identifier of the File containing the physical card's front image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frontImageFileId(): String = body.frontImageFileId()

    /**
     * The identifier for the Program that this Physical Card Profile falls under.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programId(): String = body.programId()

    /**
     * The color of the text on the back of the card. Defaults to "black".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backColor(): BackColor? = body.backColor()

    /**
     * A reference ID provided by the fulfillment provider for the card stock used. Only used if
     * you've ordered card stock separately.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardStockReference(): String? = body.cardStockReference()

    /**
     * A reference ID provided by the fulfillment provider for the carrier stock used. Only used if
     * you've ordered carrier stock separately.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrierStockReference(): String? = body.carrierStockReference()

    /**
     * The color of the design on the front of the card. Defaults to "black".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontColor(): FrontColor? = body.frontColor()

    /**
     * Text printed on the front of the card. Reach out to
     * [support@increase.com](mailto:support@increase.com) for more information.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontText(): FrontText? = body.frontText()

    /**
     * Returns the raw JSON value of [carrierImageFileId].
     *
     * Unlike [carrierImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _carrierImageFileId(): JsonField<String> = body._carrierImageFileId()

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactPhone(): JsonField<String> = body._contactPhone()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [frontImageFileId].
     *
     * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frontImageFileId(): JsonField<String> = body._frontImageFileId()

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _programId(): JsonField<String> = body._programId()

    /**
     * Returns the raw JSON value of [backColor].
     *
     * Unlike [backColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _backColor(): JsonField<BackColor> = body._backColor()

    /**
     * Returns the raw JSON value of [cardStockReference].
     *
     * Unlike [cardStockReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardStockReference(): JsonField<String> = body._cardStockReference()

    /**
     * Returns the raw JSON value of [carrierStockReference].
     *
     * Unlike [carrierStockReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _carrierStockReference(): JsonField<String> = body._carrierStockReference()

    /**
     * Returns the raw JSON value of [frontColor].
     *
     * Unlike [frontColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frontColor(): JsonField<FrontColor> = body._frontColor()

    /**
     * Returns the raw JSON value of [frontText].
     *
     * Unlike [frontText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frontText(): JsonField<FrontText> = body._frontText()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardProfileCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .carrierImageFileId()
         * .contactPhone()
         * .description()
         * .frontImageFileId()
         * .programId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PhysicalCardProfileCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(physicalCardProfileCreateParams: PhysicalCardProfileCreateParams) =
            apply {
                body = physicalCardProfileCreateParams.body.toBuilder()
                additionalHeaders = physicalCardProfileCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    physicalCardProfileCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [carrierImageFileId]
         * - [contactPhone]
         * - [description]
         * - [frontImageFileId]
         * - [programId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /**
         * Sets [Builder.carrierImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { body.contactPhone(contactPhone) }

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            body.contactPhone(contactPhone)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /**
         * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /** The identifier for the Program that this Physical Card Profile falls under. */
        fun programId(programId: String) = apply { body.programId(programId) }

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { body.programId(programId) }

        /** The color of the text on the back of the card. Defaults to "black". */
        fun backColor(backColor: BackColor) = apply { body.backColor(backColor) }

        /**
         * Sets [Builder.backColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backColor] with a well-typed [BackColor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backColor(backColor: JsonField<BackColor>) = apply { body.backColor(backColor) }

        /**
         * A reference ID provided by the fulfillment provider for the card stock used. Only used if
         * you've ordered card stock separately.
         */
        fun cardStockReference(cardStockReference: String) = apply {
            body.cardStockReference(cardStockReference)
        }

        /**
         * Sets [Builder.cardStockReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardStockReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardStockReference(cardStockReference: JsonField<String>) = apply {
            body.cardStockReference(cardStockReference)
        }

        /**
         * A reference ID provided by the fulfillment provider for the carrier stock used. Only used
         * if you've ordered carrier stock separately.
         */
        fun carrierStockReference(carrierStockReference: String) = apply {
            body.carrierStockReference(carrierStockReference)
        }

        /**
         * Sets [Builder.carrierStockReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierStockReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun carrierStockReference(carrierStockReference: JsonField<String>) = apply {
            body.carrierStockReference(carrierStockReference)
        }

        /** The color of the design on the front of the card. Defaults to "black". */
        fun frontColor(frontColor: FrontColor) = apply { body.frontColor(frontColor) }

        /**
         * Sets [Builder.frontColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontColor] with a well-typed [FrontColor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frontColor(frontColor: JsonField<FrontColor>) = apply { body.frontColor(frontColor) }

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        fun frontText(frontText: FrontText) = apply { body.frontText(frontText) }

        /**
         * Sets [Builder.frontText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontText] with a well-typed [FrontText] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frontText(frontText: JsonField<FrontText>) = apply { body.frontText(frontText) }

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

        /**
         * Returns an immutable instance of [PhysicalCardProfileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .carrierImageFileId()
         * .contactPhone()
         * .description()
         * .frontImageFileId()
         * .programId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardProfileCreateParams =
            PhysicalCardProfileCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrierImageFileId: JsonField<String>,
        private val contactPhone: JsonField<String>,
        private val description: JsonField<String>,
        private val frontImageFileId: JsonField<String>,
        private val programId: JsonField<String>,
        private val backColor: JsonField<BackColor>,
        private val cardStockReference: JsonField<String>,
        private val carrierStockReference: JsonField<String>,
        private val frontColor: JsonField<FrontColor>,
        private val frontText: JsonField<FrontText>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier_image_file_id")
            @ExcludeMissing
            carrierImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_phone")
            @ExcludeMissing
            contactPhone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            frontImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("back_color")
            @ExcludeMissing
            backColor: JsonField<BackColor> = JsonMissing.of(),
            @JsonProperty("card_stock_reference")
            @ExcludeMissing
            cardStockReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("carrier_stock_reference")
            @ExcludeMissing
            carrierStockReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_color")
            @ExcludeMissing
            frontColor: JsonField<FrontColor> = JsonMissing.of(),
            @JsonProperty("front_text")
            @ExcludeMissing
            frontText: JsonField<FrontText> = JsonMissing.of(),
        ) : this(
            carrierImageFileId,
            contactPhone,
            description,
            frontImageFileId,
            programId,
            backColor,
            cardStockReference,
            carrierStockReference,
            frontColor,
            frontText,
            mutableMapOf(),
        )

        /**
         * The identifier of the File containing the physical card's carrier image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun carrierImageFileId(): String = carrierImageFileId.getRequired("carrier_image_file_id")

        /**
         * A phone number the user can contact to receive support for their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactPhone(): String = contactPhone.getRequired("contact_phone")

        /**
         * A description you can use to identify the Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The identifier of the File containing the physical card's front image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

        /**
         * The identifier for the Program that this Physical Card Profile falls under.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun programId(): String = programId.getRequired("program_id")

        /**
         * The color of the text on the back of the card. Defaults to "black".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun backColor(): BackColor? = backColor.getNullable("back_color")

        /**
         * A reference ID provided by the fulfillment provider for the card stock used. Only used if
         * you've ordered card stock separately.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardStockReference(): String? = cardStockReference.getNullable("card_stock_reference")

        /**
         * A reference ID provided by the fulfillment provider for the carrier stock used. Only used
         * if you've ordered carrier stock separately.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun carrierStockReference(): String? =
            carrierStockReference.getNullable("carrier_stock_reference")

        /**
         * The color of the design on the front of the card. Defaults to "black".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontColor(): FrontColor? = frontColor.getNullable("front_color")

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontText(): FrontText? = frontText.getNullable("front_text")

        /**
         * Returns the raw JSON value of [carrierImageFileId].
         *
         * Unlike [carrierImageFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("carrier_image_file_id")
        @ExcludeMissing
        fun _carrierImageFileId(): JsonField<String> = carrierImageFileId

        /**
         * Returns the raw JSON value of [contactPhone].
         *
         * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [frontImageFileId].
         *
         * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId(): JsonField<String> = frontImageFileId

        /**
         * Returns the raw JSON value of [programId].
         *
         * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

        /**
         * Returns the raw JSON value of [backColor].
         *
         * Unlike [backColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("back_color")
        @ExcludeMissing
        fun _backColor(): JsonField<BackColor> = backColor

        /**
         * Returns the raw JSON value of [cardStockReference].
         *
         * Unlike [cardStockReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_stock_reference")
        @ExcludeMissing
        fun _cardStockReference(): JsonField<String> = cardStockReference

        /**
         * Returns the raw JSON value of [carrierStockReference].
         *
         * Unlike [carrierStockReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("carrier_stock_reference")
        @ExcludeMissing
        fun _carrierStockReference(): JsonField<String> = carrierStockReference

        /**
         * Returns the raw JSON value of [frontColor].
         *
         * Unlike [frontColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("front_color")
        @ExcludeMissing
        fun _frontColor(): JsonField<FrontColor> = frontColor

        /**
         * Returns the raw JSON value of [frontText].
         *
         * Unlike [frontText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("front_text")
        @ExcludeMissing
        fun _frontText(): JsonField<FrontText> = frontText

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .carrierImageFileId()
             * .contactPhone()
             * .description()
             * .frontImageFileId()
             * .programId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var carrierImageFileId: JsonField<String>? = null
            private var contactPhone: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var frontImageFileId: JsonField<String>? = null
            private var programId: JsonField<String>? = null
            private var backColor: JsonField<BackColor> = JsonMissing.of()
            private var cardStockReference: JsonField<String> = JsonMissing.of()
            private var carrierStockReference: JsonField<String> = JsonMissing.of()
            private var frontColor: JsonField<FrontColor> = JsonMissing.of()
            private var frontText: JsonField<FrontText> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                carrierImageFileId = body.carrierImageFileId
                contactPhone = body.contactPhone
                description = body.description
                frontImageFileId = body.frontImageFileId
                programId = body.programId
                backColor = body.backColor
                cardStockReference = body.cardStockReference
                carrierStockReference = body.carrierStockReference
                frontColor = body.frontColor
                frontText = body.frontText
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the physical card's carrier image. */
            fun carrierImageFileId(carrierImageFileId: String) =
                carrierImageFileId(JsonField.of(carrierImageFileId))

            /**
             * Sets [Builder.carrierImageFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierImageFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
                this.carrierImageFileId = carrierImageFileId
            }

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

            /**
             * Sets [Builder.contactPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactPhone] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactPhone(contactPhone: JsonField<String>) = apply {
                this.contactPhone = contactPhone
            }

            /** A description you can use to identify the Card Profile. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The identifier of the File containing the physical card's front image. */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /**
             * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The identifier for the Program that this Physical Card Profile falls under. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * Sets [Builder.programId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

            /** The color of the text on the back of the card. Defaults to "black". */
            fun backColor(backColor: BackColor) = backColor(JsonField.of(backColor))

            /**
             * Sets [Builder.backColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backColor] with a well-typed [BackColor] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun backColor(backColor: JsonField<BackColor>) = apply { this.backColor = backColor }

            /**
             * A reference ID provided by the fulfillment provider for the card stock used. Only
             * used if you've ordered card stock separately.
             */
            fun cardStockReference(cardStockReference: String) =
                cardStockReference(JsonField.of(cardStockReference))

            /**
             * Sets [Builder.cardStockReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardStockReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardStockReference(cardStockReference: JsonField<String>) = apply {
                this.cardStockReference = cardStockReference
            }

            /**
             * A reference ID provided by the fulfillment provider for the carrier stock used. Only
             * used if you've ordered carrier stock separately.
             */
            fun carrierStockReference(carrierStockReference: String) =
                carrierStockReference(JsonField.of(carrierStockReference))

            /**
             * Sets [Builder.carrierStockReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierStockReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun carrierStockReference(carrierStockReference: JsonField<String>) = apply {
                this.carrierStockReference = carrierStockReference
            }

            /** The color of the design on the front of the card. Defaults to "black". */
            fun frontColor(frontColor: FrontColor) = frontColor(JsonField.of(frontColor))

            /**
             * Sets [Builder.frontColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontColor] with a well-typed [FrontColor] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontColor(frontColor: JsonField<FrontColor>) = apply {
                this.frontColor = frontColor
            }

            /**
             * Text printed on the front of the card. Reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            fun frontText(frontText: FrontText) = frontText(JsonField.of(frontText))

            /**
             * Sets [Builder.frontText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontText] with a well-typed [FrontText] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontText(frontText: JsonField<FrontText>) = apply { this.frontText = frontText }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .carrierImageFileId()
             * .contactPhone()
             * .description()
             * .frontImageFileId()
             * .programId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("carrierImageFileId", carrierImageFileId),
                    checkRequired("contactPhone", contactPhone),
                    checkRequired("description", description),
                    checkRequired("frontImageFileId", frontImageFileId),
                    checkRequired("programId", programId),
                    backColor,
                    cardStockReference,
                    carrierStockReference,
                    frontColor,
                    frontText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            carrierImageFileId()
            contactPhone()
            description()
            frontImageFileId()
            programId()
            backColor()?.validate()
            cardStockReference()
            carrierStockReference()
            frontColor()?.validate()
            frontText()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (carrierImageFileId.asKnown() == null) 0 else 1) +
                (if (contactPhone.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (frontImageFileId.asKnown() == null) 0 else 1) +
                (if (programId.asKnown() == null) 0 else 1) +
                (backColor.asKnown()?.validity() ?: 0) +
                (if (cardStockReference.asKnown() == null) 0 else 1) +
                (if (carrierStockReference.asKnown() == null) 0 else 1) +
                (frontColor.asKnown()?.validity() ?: 0) +
                (frontText.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                carrierImageFileId == other.carrierImageFileId &&
                contactPhone == other.contactPhone &&
                description == other.description &&
                frontImageFileId == other.frontImageFileId &&
                programId == other.programId &&
                backColor == other.backColor &&
                cardStockReference == other.cardStockReference &&
                carrierStockReference == other.carrierStockReference &&
                frontColor == other.frontColor &&
                frontText == other.frontText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                carrierImageFileId,
                contactPhone,
                description,
                frontImageFileId,
                programId,
                backColor,
                cardStockReference,
                carrierStockReference,
                frontColor,
                frontText,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, programId=$programId, backColor=$backColor, cardStockReference=$cardStockReference, carrierStockReference=$carrierStockReference, frontColor=$frontColor, frontText=$frontText, additionalProperties=$additionalProperties}"
    }

    /** The color of the text on the back of the card. Defaults to "black". */
    class BackColor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Black personalization color. */
            val BLACK = of("black")

            /** White personalization color. */
            val WHITE = of("white")

            fun of(value: String) = BackColor(JsonField.of(value))
        }

        /** An enum containing [BackColor]'s known values. */
        enum class Known {
            /** Black personalization color. */
            BLACK,
            /** White personalization color. */
            WHITE,
        }

        /**
         * An enum containing [BackColor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BackColor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Black personalization color. */
            BLACK,
            /** White personalization color. */
            WHITE,
            /**
             * An enum member indicating that [BackColor] was instantiated with an unknown value.
             */
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
                BLACK -> Value.BLACK
                WHITE -> Value.WHITE
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
                BLACK -> Known.BLACK
                WHITE -> Known.WHITE
                else -> throw IncreaseInvalidDataException("Unknown BackColor: $value")
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

        private var validated: Boolean = false

        fun validate(): BackColor = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BackColor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The color of the design on the front of the card. Defaults to "black". */
    class FrontColor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Black personalization color. */
            val BLACK = of("black")

            /** White personalization color. */
            val WHITE = of("white")

            fun of(value: String) = FrontColor(JsonField.of(value))
        }

        /** An enum containing [FrontColor]'s known values. */
        enum class Known {
            /** Black personalization color. */
            BLACK,
            /** White personalization color. */
            WHITE,
        }

        /**
         * An enum containing [FrontColor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FrontColor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Black personalization color. */
            BLACK,
            /** White personalization color. */
            WHITE,
            /**
             * An enum member indicating that [FrontColor] was instantiated with an unknown value.
             */
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
                BLACK -> Value.BLACK
                WHITE -> Value.WHITE
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
                BLACK -> Known.BLACK
                WHITE -> Known.WHITE
                else -> throw IncreaseInvalidDataException("Unknown FrontColor: $value")
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

        private var validated: Boolean = false

        fun validate(): FrontColor = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FrontColor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Text printed on the front of the card. Reach out to
     * [support@increase.com](mailto:support@increase.com) for more information.
     */
    class FrontText
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(line1, line2, mutableMapOf())

        /**
         * The first line of text on the front of the card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of text on the front of the card. Providing a second line moves the first
         * line slightly higher and prints the second line in the spot where the first line would
         * have otherwise been printed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [FrontText].
             *
             * The following fields are required:
             * ```kotlin
             * .line1()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [FrontText]. */
        class Builder internal constructor() {

            private var line1: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(frontText: FrontText) = apply {
                line1 = frontText.line1
                line2 = frontText.line2
                additionalProperties = frontText.additionalProperties.toMutableMap()
            }

            /** The first line of text on the front of the card. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /**
             * The second line of text on the front of the card. Providing a second line moves the
             * first line slightly higher and prints the second line in the spot where the first
             * line would have otherwise been printed.
             */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            /**
             * Returns an immutable instance of [FrontText].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .line1()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FrontText =
                FrontText(checkRequired("line1", line1), line2, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FrontText = apply {
            if (validated) {
                return@apply
            }

            line1()
            line2()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (line1.asKnown() == null) 0 else 1) + (if (line2.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FrontText &&
                line1 == other.line1 &&
                line2 == other.line2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(line1, line2, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FrontText{line1=$line1, line2=$line2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalCardProfileCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhysicalCardProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
