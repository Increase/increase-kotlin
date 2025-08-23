// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundachtransfers

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Simulates an inbound ACH transfer to your account. This imitates initiating a transfer to an
 * Increase account from a different financial institution. The transfer may be either a credit or a
 * debit depending on if the `amount` is positive or negative. The result of calling this API will
 * contain the created transfer. You can pass a `resolve_at` parameter to allow for a window to
 * [action on the Inbound ACH Transfer](https://increase.com/documentation/receiving-ach-transfers).
 * Alternatively, if you don't pass the `resolve_at` parameter the result will contain either a
 * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions) depending on
 * whether or not the transfer is allowed.
 */
class InboundAchTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account Number the inbound ACH Transfer is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The transfer amount in cents. A positive amount originates a credit transfer pushing funds to
     * the receiving account. A negative amount originates a debit transfer pulling funds from the
     * receiving account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Additional information to include in the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addenda(): Addenda? = body.addenda()

    /**
     * The description of the date of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDescriptiveDate(): String? = body.companyDescriptiveDate()

    /**
     * Data associated with the transfer set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDiscretionaryData(): String? = body.companyDiscretionaryData()

    /**
     * The description of the transfer set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEntryDescription(): String? = body.companyEntryDescription()

    /**
     * The sender's company ID.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyId(): String? = body.companyId()

    /**
     * The name of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): String? = body.companyName()

    /**
     * The ID of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverIdNumber(): String? = body.receiverIdNumber()

    /**
     * The name of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverName(): String? = body.receiverName()

    /**
     * The time at which the transfer should be resolved. If not provided will resolve immediately.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolveAt(): OffsetDateTime? = body.resolveAt()

    /**
     * The standard entry class code for the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standardEntryClassCode(): StandardEntryClassCode? = body.standardEntryClassCode()

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [addenda].
     *
     * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addenda(): JsonField<Addenda> = body._addenda()

    /**
     * Returns the raw JSON value of [companyDescriptiveDate].
     *
     * Unlike [companyDescriptiveDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyDescriptiveDate(): JsonField<String> = body._companyDescriptiveDate()

    /**
     * Returns the raw JSON value of [companyDiscretionaryData].
     *
     * Unlike [companyDiscretionaryData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyDiscretionaryData(): JsonField<String> = body._companyDiscretionaryData()

    /**
     * Returns the raw JSON value of [companyEntryDescription].
     *
     * Unlike [companyEntryDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyEntryDescription(): JsonField<String> = body._companyEntryDescription()

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyId(): JsonField<String> = body._companyId()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [receiverIdNumber].
     *
     * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _receiverIdNumber(): JsonField<String> = body._receiverIdNumber()

    /**
     * Returns the raw JSON value of [receiverName].
     *
     * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _receiverName(): JsonField<String> = body._receiverName()

    /**
     * Returns the raw JSON value of [resolveAt].
     *
     * Unlike [resolveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resolveAt(): JsonField<OffsetDateTime> = body._resolveAt()

    /**
     * Returns the raw JSON value of [standardEntryClassCode].
     *
     * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumberId()
         * .amount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inboundAchTransferCreateParams: InboundAchTransferCreateParams) = apply {
            body = inboundAchTransferCreateParams.body.toBuilder()
            additionalHeaders = inboundAchTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboundAchTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountNumberId]
         * - [amount]
         * - [addenda]
         * - [companyDescriptiveDate]
         * - [companyDiscretionaryData]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Additional information to include in the transfer. */
        fun addenda(addenda: Addenda) = apply { body.addenda(addenda) }

        /**
         * Sets [Builder.addenda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addenda] with a well-typed [Addenda] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addenda(addenda: JsonField<Addenda>) = apply { body.addenda(addenda) }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /**
         * Sets [Builder.companyDescriptiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDescriptiveDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /**
         * Sets [Builder.companyDiscretionaryData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDiscretionaryData] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /**
         * Sets [Builder.companyEntryDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyEntryDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /** The sender's company ID. */
        fun companyId(companyId: String) = apply { body.companyId(companyId) }

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { body.companyId(companyId) }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /**
         * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverIdNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = apply { body.receiverName(receiverName) }

        /**
         * Sets [Builder.receiverName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receiverName(receiverName: JsonField<String>) = apply {
            body.receiverName(receiverName)
        }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: OffsetDateTime) = apply { body.resolveAt(resolveAt) }

        /**
         * Sets [Builder.resolveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply { body.resolveAt(resolveAt) }

        /** The standard entry class code for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            body.standardEntryClassCode(standardEntryClassCode)
        }

        /**
         * Sets [Builder.standardEntryClassCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standardEntryClassCode] with a well-typed
         * [StandardEntryClassCode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                body.standardEntryClassCode(standardEntryClassCode)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InboundAchTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumberId()
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundAchTransferCreateParams =
            InboundAchTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val addenda: JsonField<Addenda>,
        private val companyDescriptiveDate: JsonField<String>,
        private val companyDiscretionaryData: JsonField<String>,
        private val companyEntryDescription: JsonField<String>,
        private val companyId: JsonField<String>,
        private val companyName: JsonField<String>,
        private val receiverIdNumber: JsonField<String>,
        private val receiverName: JsonField<String>,
        private val resolveAt: JsonField<OffsetDateTime>,
        private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("addenda") @ExcludeMissing addenda: JsonField<Addenda> = JsonMissing.of(),
            @JsonProperty("company_descriptive_date")
            @ExcludeMissing
            companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_discretionary_data")
            @ExcludeMissing
            companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_entry_description")
            @ExcludeMissing
            companyEntryDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_id")
            @ExcludeMissing
            companyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            receiverIdNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_name")
            @ExcludeMissing
            receiverName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resolve_at")
            @ExcludeMissing
            resolveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("standard_entry_class_code")
            @ExcludeMissing
            standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        ) : this(
            accountNumberId,
            amount,
            addenda,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyId,
            companyName,
            receiverIdNumber,
            receiverName,
            resolveAt,
            standardEntryClassCode,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account Number the inbound ACH Transfer is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Additional information to include in the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addenda(): Addenda? = addenda.getNullable("addenda")

        /**
         * The description of the date of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDescriptiveDate(): String? =
            companyDescriptiveDate.getNullable("company_descriptive_date")

        /**
         * Data associated with the transfer set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDiscretionaryData(): String? =
            companyDiscretionaryData.getNullable("company_discretionary_data")

        /**
         * The description of the transfer set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyEntryDescription(): String? =
            companyEntryDescription.getNullable("company_entry_description")

        /**
         * The sender's company ID.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyId(): String? = companyId.getNullable("company_id")

        /**
         * The name of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): String? = companyName.getNullable("company_name")

        /**
         * The ID of the receiver of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverIdNumber(): String? = receiverIdNumber.getNullable("receiver_id_number")

        /**
         * The name of the receiver of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverName(): String? = receiverName.getNullable("receiver_name")

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resolveAt(): OffsetDateTime? = resolveAt.getNullable("resolve_at")

        /**
         * The standard entry class code for the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun standardEntryClassCode(): StandardEntryClassCode? =
            standardEntryClassCode.getNullable("standard_entry_class_code")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [addenda].
         *
         * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<Addenda> = addenda

        /**
         * Returns the raw JSON value of [companyDescriptiveDate].
         *
         * Unlike [companyDescriptiveDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

        /**
         * Returns the raw JSON value of [companyDiscretionaryData].
         *
         * Unlike [companyDiscretionaryData], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

        /**
         * Returns the raw JSON value of [companyEntryDescription].
         *
         * Unlike [companyEntryDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

        /**
         * Returns the raw JSON value of [companyId].
         *
         * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [receiverIdNumber].
         *
         * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

        /**
         * Returns the raw JSON value of [receiverName].
         *
         * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun _receiverName(): JsonField<String> = receiverName

        /**
         * Returns the raw JSON value of [resolveAt].
         *
         * Unlike [resolveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resolve_at")
        @ExcludeMissing
        fun _resolveAt(): JsonField<OffsetDateTime> = resolveAt

        /**
         * Returns the raw JSON value of [standardEntryClassCode].
         *
         * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

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
             * .accountNumberId()
             * .amount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var addenda: JsonField<Addenda> = JsonMissing.of()
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var receiverIdNumber: JsonField<String> = JsonMissing.of()
            private var receiverName: JsonField<String> = JsonMissing.of()
            private var resolveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                addenda = body.addenda
                companyDescriptiveDate = body.companyDescriptiveDate
                companyDiscretionaryData = body.companyDiscretionaryData
                companyEntryDescription = body.companyEntryDescription
                companyId = body.companyId
                companyName = body.companyName
                receiverIdNumber = body.receiverIdNumber
                receiverName = body.receiverName
                resolveAt = body.resolveAt
                standardEntryClassCode = body.standardEntryClassCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Additional information to include in the transfer. */
            fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

            /**
             * Sets [Builder.addenda] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addenda] with a well-typed [Addenda] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

            /** The description of the date of the transfer. */
            fun companyDescriptiveDate(companyDescriptiveDate: String) =
                companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

            /**
             * Sets [Builder.companyDescriptiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyDescriptiveDate] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** Data associated with the transfer set by the sender. */
            fun companyDiscretionaryData(companyDiscretionaryData: String) =
                companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

            /**
             * Sets [Builder.companyDiscretionaryData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyDiscretionaryData] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer set by the sender. */
            fun companyEntryDescription(companyEntryDescription: String) =
                companyEntryDescription(JsonField.of(companyEntryDescription))

            /**
             * Sets [Builder.companyEntryDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyEntryDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The sender's company ID. */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /**
             * Sets [Builder.companyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** The name of the sender. */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /** The ID of the receiver of the transfer. */
            fun receiverIdNumber(receiverIdNumber: String) =
                receiverIdNumber(JsonField.of(receiverIdNumber))

            /**
             * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverIdNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                this.receiverIdNumber = receiverIdNumber
            }

            /** The name of the receiver of the transfer. */
            fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

            /**
             * Sets [Builder.receiverName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverName(receiverName: JsonField<String>) = apply {
                this.receiverName = receiverName
            }

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            fun resolveAt(resolveAt: OffsetDateTime) = resolveAt(JsonField.of(resolveAt))

            /**
             * Sets [Builder.resolveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolveAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply {
                this.resolveAt = resolveAt
            }

            /** The standard entry class code for the transfer. */
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
                standardEntryClassCode(JsonField.of(standardEntryClassCode))

            /**
             * Sets [Builder.standardEntryClassCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standardEntryClassCode] with a well-typed
             * [StandardEntryClassCode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
                apply {
                    this.standardEntryClassCode = standardEntryClassCode
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumberId()
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    addenda,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyId,
                    companyName,
                    receiverIdNumber,
                    receiverName,
                    resolveAt,
                    standardEntryClassCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            addenda()?.validate()
            companyDescriptiveDate()
            companyDiscretionaryData()
            companyEntryDescription()
            companyId()
            companyName()
            receiverIdNumber()
            receiverName()
            resolveAt()
            standardEntryClassCode()?.validate()
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
            (if (accountNumberId.asKnown() == null) 0 else 1) +
                (if (amount.asKnown() == null) 0 else 1) +
                (addenda.asKnown()?.validity() ?: 0) +
                (if (companyDescriptiveDate.asKnown() == null) 0 else 1) +
                (if (companyDiscretionaryData.asKnown() == null) 0 else 1) +
                (if (companyEntryDescription.asKnown() == null) 0 else 1) +
                (if (companyId.asKnown() == null) 0 else 1) +
                (if (companyName.asKnown() == null) 0 else 1) +
                (if (receiverIdNumber.asKnown() == null) 0 else 1) +
                (if (receiverName.asKnown() == null) 0 else 1) +
                (if (resolveAt.asKnown() == null) 0 else 1) +
                (standardEntryClassCode.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountNumberId == other.accountNumberId &&
                amount == other.amount &&
                addenda == other.addenda &&
                companyDescriptiveDate == other.companyDescriptiveDate &&
                companyDiscretionaryData == other.companyDiscretionaryData &&
                companyEntryDescription == other.companyEntryDescription &&
                companyId == other.companyId &&
                companyName == other.companyName &&
                receiverIdNumber == other.receiverIdNumber &&
                receiverName == other.receiverName &&
                resolveAt == other.resolveAt &&
                standardEntryClassCode == other.standardEntryClassCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumberId,
                amount,
                addenda,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyId,
                companyName,
                receiverIdNumber,
                receiverName,
                resolveAt,
                standardEntryClassCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, resolveAt=$resolveAt, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    /** Additional information to include in the transfer. */
    class Addenda
    private constructor(
        private val category: JsonField<Category>,
        private val freeform: JsonField<Freeform>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("freeform")
            @ExcludeMissing
            freeform: JsonField<Freeform> = JsonMissing.of(),
        ) : this(category, freeform, mutableMapOf())

        /**
         * The type of addenda to simulate being sent with the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Unstructured `payment_related_information` passed through with the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun freeform(): Freeform? = freeform.getNullable("freeform")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [freeform].
         *
         * Unlike [freeform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform(): JsonField<Freeform> = freeform

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
             * Returns a mutable builder for constructing an instance of [Addenda].
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                additionalProperties = addenda.additionalProperties.toMutableMap()
            }

            /** The type of addenda to simulate being sent with the transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through with the transfer. */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /**
             * Sets [Builder.freeform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeform] with a well-typed [Freeform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Addenda].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Addenda =
                Addenda(
                    checkRequired("category", category),
                    freeform,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Addenda = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            freeform()?.validate()
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
            (category.asKnown()?.validity() ?: 0) + (freeform.asKnown()?.validity() ?: 0)

        /** The type of addenda to simulate being sent with the transfer. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Unstructured `payment_related_information` passed through with the transfer. */
                val FREEFORM = of("freeform")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Unstructured `payment_related_information` passed through with the transfer. */
        class Freeform
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("entries")
                @ExcludeMissing
                entries: JsonField<List<Entry>> = JsonMissing.of()
            ) : this(entries, mutableMapOf())

            /**
             * Each entry represents an addendum sent with the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /**
             * Returns the raw JSON value of [entries].
             *
             * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

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
                 * Returns a mutable builder for constructing an instance of [Freeform].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .entries()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Freeform]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(freeform: Freeform) = apply {
                    entries = freeform.entries.map { it.toMutableList() }
                    additionalProperties = freeform.additionalProperties.toMutableMap()
                }

                /** Each entry represents an addendum sent with the transfer. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /**
                 * Sets [Builder.entries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Entry] to [entries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Freeform].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .entries()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Freeform =
                    Freeform(
                        checkRequired("entries", entries).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Freeform = apply {
                if (validated) {
                    return@apply
                }

                entries().forEach { it.validate() }
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
            internal fun validity(): Int = (entries.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            class Entry
            private constructor(
                private val paymentRelatedInformation: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                ) : this(paymentRelatedInformation, mutableMapOf())

                /**
                 * The payment related information passed in the addendum.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /**
                 * Returns the raw JSON value of [paymentRelatedInformation].
                 *
                 * Unlike [paymentRelatedInformation], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

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
                     * Returns a mutable builder for constructing an instance of [Entry].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .paymentRelatedInformation()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var paymentRelatedInformation: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(entry: Entry) = apply {
                        paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /**
                     * Sets [Builder.paymentRelatedInformation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentRelatedInformation] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAlladditional_properties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAlladditional_properties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Entry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .paymentRelatedInformation()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Entry =
                        Entry(
                            checkRequired("paymentRelatedInformation", paymentRelatedInformation),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Entry = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentRelatedInformation()
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
                    (if (paymentRelatedInformation.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        paymentRelatedInformation == other.paymentRelatedInformation &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(paymentRelatedInformation, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Freeform &&
                    entries == other.entries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addenda &&
                category == other.category &&
                freeform == other.freeform &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(category, freeform, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"
    }

    /** The standard entry class code for the transfer. */
    class StandardEntryClassCode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** Corporate Credit and Debit (CCD). */
            val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /** Corporate Trade Exchange (CTX). */
            val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /** Prearranged Payments and Deposits (PPD). */
            val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /** Internet Initiated (WEB). */
            val INTERNET_INITIATED = of("internet_initiated")

            /** Point of Sale (POS). */
            val POINT_OF_SALE = of("point_of_sale")

            /** Telephone Initiated (TEL). */
            val TELEPHONE_INITIATED = of("telephone_initiated")

            /** Customer Initiated (CIE). */
            val CUSTOMER_INITIATED = of("customer_initiated")

            /** Accounts Receivable (ARC). */
            val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

            /** Machine Transfer (MTE). */
            val MACHINE_TRANSFER = of("machine_transfer")

            /** Shared Network Transaction (SHR). */
            val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

            /** Represented Check (RCK). */
            val REPRESENTED_CHECK = of("represented_check")

            /** Back Office Conversion (BOC). */
            val BACK_OFFICE_CONVERSION = of("back_office_conversion")

            /** Point of Purchase (POP). */
            val POINT_OF_PURCHASE = of("point_of_purchase")

            /** Check Truncation (TRC). */
            val CHECK_TRUNCATION = of("check_truncation")

            /** Destroyed Check (XCK). */
            val DESTROYED_CHECK = of("destroyed_check")

            /** International ACH Transaction (IAT). */
            val INTERNATIONAL_ACH_TRANSACTION = of("international_ach_transaction")

            fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
        }

        /**
         * An enum containing [StandardEntryClassCode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StandardEntryClassCode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
            /**
             * An enum member indicating that [StandardEntryClassCode] was instantiated with an
             * unknown value.
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
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                POINT_OF_SALE -> Value.POINT_OF_SALE
                TELEPHONE_INITIATED -> Value.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Value.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Value.CHECK_TRUNCATION
                DESTROYED_CHECK -> Value.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Value.INTERNATIONAL_ACH_TRANSACTION
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
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                POINT_OF_SALE -> Known.POINT_OF_SALE
                TELEPHONE_INITIATED -> Known.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Known.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Known.CHECK_TRUNCATION
                DESTROYED_CHECK -> Known.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Known.INTERNATIONAL_ACH_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
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

        fun validate(): StandardEntryClassCode = apply {
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

            return other is StandardEntryClassCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundAchTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
