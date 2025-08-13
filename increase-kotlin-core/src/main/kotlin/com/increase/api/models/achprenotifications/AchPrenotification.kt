// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * ACH Prenotifications are one way you can verify account and routing numbers by Automated Clearing
 * House (ACH).
 */
class AchPrenotification
private constructor(
    private val id: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val addendum: JsonField<String>,
    private val companyDescriptiveDate: JsonField<String>,
    private val companyDiscretionaryData: JsonField<String>,
    private val companyEntryDescription: JsonField<String>,
    private val companyName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditDebitIndicator: JsonField<CreditDebitIndicator>,
    private val effectiveDate: JsonField<OffsetDateTime>,
    private val idempotencyKey: JsonField<String>,
    private val notificationsOfChange: JsonField<List<NotificationsOfChange>>,
    private val prenotificationReturn: JsonField<PrenotificationReturn>,
    private val routingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addendum") @ExcludeMissing addendum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        companyEntryDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_name")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_debit_indicator")
        @ExcludeMissing
        creditDebitIndicator: JsonField<CreditDebitIndicator> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notifications_of_change")
        @ExcludeMissing
        notificationsOfChange: JsonField<List<NotificationsOfChange>> = JsonMissing.of(),
        @JsonProperty("prenotification_return")
        @ExcludeMissing
        prenotificationReturn: JsonField<PrenotificationReturn> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountNumber,
        addendum,
        companyDescriptiveDate,
        companyDiscretionaryData,
        companyEntryDescription,
        companyName,
        createdAt,
        creditDebitIndicator,
        effectiveDate,
        idempotencyKey,
        notificationsOfChange,
        prenotificationReturn,
        routingNumber,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The ACH Prenotification's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The destination account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * Additional information for the recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addendum(): String? = addendum.getNullable("addendum")

    /**
     * The description of the date of the notification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDescriptiveDate(): String? =
        companyDescriptiveDate.getNullable("company_descriptive_date")

    /**
     * Optional data associated with the notification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDiscretionaryData(): String? =
        companyDiscretionaryData.getNullable("company_discretionary_data")

    /**
     * The description of the notification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEntryDescription(): String? =
        companyEntryDescription.getNullable("company_entry_description")

    /**
     * The name by which you know the company.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): String? = companyName.getNullable("company_name")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
     * prenotification was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If the notification is for a future credit or debit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditDebitIndicator(): CreditDebitIndicator? =
        creditDebitIndicator.getNullable("credit_debit_indicator")

    /**
     * The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveDate(): OffsetDateTime? = effectiveDate.getNullable("effective_date")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * If the receiving bank notifies that future transfers should use different details, this will
     * contain those details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notificationsOfChange(): List<NotificationsOfChange> =
        notificationsOfChange.getRequired("notifications_of_change")

    /**
     * If your prenotification is returned, this will contain details of the return.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prenotificationReturn(): PrenotificationReturn? =
        prenotificationReturn.getNullable("prenotification_return")

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The lifecycle status of the ACH Prenotification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [addendum].
     *
     * Unlike [addendum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addendum") @ExcludeMissing fun _addendum(): JsonField<String> = addendum

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
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditDebitIndicator].
     *
     * Unlike [creditDebitIndicator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_debit_indicator")
    @ExcludeMissing
    fun _creditDebitIndicator(): JsonField<CreditDebitIndicator> = creditDebitIndicator

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [notificationsOfChange].
     *
     * Unlike [notificationsOfChange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    fun _notificationsOfChange(): JsonField<List<NotificationsOfChange>> = notificationsOfChange

    /**
     * Returns the raw JSON value of [prenotificationReturn].
     *
     * Unlike [prenotificationReturn], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prenotification_return")
    @ExcludeMissing
    fun _prenotificationReturn(): JsonField<PrenotificationReturn> = prenotificationReturn

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [AchPrenotification].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountNumber()
         * .addendum()
         * .companyDescriptiveDate()
         * .companyDiscretionaryData()
         * .companyEntryDescription()
         * .companyName()
         * .createdAt()
         * .creditDebitIndicator()
         * .effectiveDate()
         * .idempotencyKey()
         * .notificationsOfChange()
         * .prenotificationReturn()
         * .routingNumber()
         * .status()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AchPrenotification]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var addendum: JsonField<String>? = null
        private var companyDescriptiveDate: JsonField<String>? = null
        private var companyDiscretionaryData: JsonField<String>? = null
        private var companyEntryDescription: JsonField<String>? = null
        private var companyName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditDebitIndicator: JsonField<CreditDebitIndicator>? = null
        private var effectiveDate: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var notificationsOfChange: JsonField<MutableList<NotificationsOfChange>>? = null
        private var prenotificationReturn: JsonField<PrenotificationReturn>? = null
        private var routingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(achPrenotification: AchPrenotification) = apply {
            id = achPrenotification.id
            accountNumber = achPrenotification.accountNumber
            addendum = achPrenotification.addendum
            companyDescriptiveDate = achPrenotification.companyDescriptiveDate
            companyDiscretionaryData = achPrenotification.companyDiscretionaryData
            companyEntryDescription = achPrenotification.companyEntryDescription
            companyName = achPrenotification.companyName
            createdAt = achPrenotification.createdAt
            creditDebitIndicator = achPrenotification.creditDebitIndicator
            effectiveDate = achPrenotification.effectiveDate
            idempotencyKey = achPrenotification.idempotencyKey
            notificationsOfChange =
                achPrenotification.notificationsOfChange.map { it.toMutableList() }
            prenotificationReturn = achPrenotification.prenotificationReturn
            routingNumber = achPrenotification.routingNumber
            status = achPrenotification.status
            type = achPrenotification.type
            additionalProperties = achPrenotification.additionalProperties.toMutableMap()
        }

        /** The ACH Prenotification's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Additional information for the recipient. */
        fun addendum(addendum: String?) = addendum(JsonField.ofNullable(addendum))

        /**
         * Sets [Builder.addendum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addendum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addendum(addendum: JsonField<String>) = apply { this.addendum = addendum }

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: String?) =
            companyDescriptiveDate(JsonField.ofNullable(companyDescriptiveDate))

        /**
         * Sets [Builder.companyDescriptiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDescriptiveDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: String?) =
            companyDiscretionaryData(JsonField.ofNullable(companyDiscretionaryData))

        /**
         * Sets [Builder.companyDiscretionaryData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDiscretionaryData] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: String?) =
            companyEntryDescription(JsonField.ofNullable(companyEntryDescription))

        /**
         * Sets [Builder.companyEntryDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyEntryDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which you know the company. */
        fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * prenotification was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator?) =
            creditDebitIndicator(JsonField.ofNullable(creditDebitIndicator))

        /**
         * Sets [Builder.creditDebitIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditDebitIndicator] with a well-typed
         * [CreditDebitIndicator] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) = apply {
            this.creditDebitIndicator = creditDebitIndicator
        }

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: OffsetDateTime?) =
            effectiveDate(JsonField.ofNullable(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If the receiving bank notifies that future transfers should use different details, this
         * will contain those details.
         */
        fun notificationsOfChange(notificationsOfChange: List<NotificationsOfChange>) =
            notificationsOfChange(JsonField.of(notificationsOfChange))

        /**
         * Sets [Builder.notificationsOfChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationsOfChange] with a well-typed
         * `List<NotificationsOfChange>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun notificationsOfChange(notificationsOfChange: JsonField<List<NotificationsOfChange>>) =
            apply {
                this.notificationsOfChange = notificationsOfChange.map { it.toMutableList() }
            }

        /**
         * Adds a single [NotificationsOfChange] to [Builder.notificationsOfChange].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotificationsOfChange(notificationsOfChange: NotificationsOfChange) = apply {
            this.notificationsOfChange =
                (this.notificationsOfChange ?: JsonField.of(mutableListOf())).also {
                    checkKnown("notificationsOfChange", it).add(notificationsOfChange)
                }
        }

        /** If your prenotification is returned, this will contain details of the return. */
        fun prenotificationReturn(prenotificationReturn: PrenotificationReturn?) =
            prenotificationReturn(JsonField.ofNullable(prenotificationReturn))

        /**
         * Sets [Builder.prenotificationReturn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prenotificationReturn] with a well-typed
         * [PrenotificationReturn] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun prenotificationReturn(prenotificationReturn: JsonField<PrenotificationReturn>) = apply {
            this.prenotificationReturn = prenotificationReturn
        }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The lifecycle status of the ACH Prenotification. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_prenotification`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [AchPrenotification].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountNumber()
         * .addendum()
         * .companyDescriptiveDate()
         * .companyDiscretionaryData()
         * .companyEntryDescription()
         * .companyName()
         * .createdAt()
         * .creditDebitIndicator()
         * .effectiveDate()
         * .idempotencyKey()
         * .notificationsOfChange()
         * .prenotificationReturn()
         * .routingNumber()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AchPrenotification =
            AchPrenotification(
                checkRequired("id", id),
                checkRequired("accountNumber", accountNumber),
                checkRequired("addendum", addendum),
                checkRequired("companyDescriptiveDate", companyDescriptiveDate),
                checkRequired("companyDiscretionaryData", companyDiscretionaryData),
                checkRequired("companyEntryDescription", companyEntryDescription),
                checkRequired("companyName", companyName),
                checkRequired("createdAt", createdAt),
                checkRequired("creditDebitIndicator", creditDebitIndicator),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("notificationsOfChange", notificationsOfChange).map {
                    it.toImmutable()
                },
                checkRequired("prenotificationReturn", prenotificationReturn),
                checkRequired("routingNumber", routingNumber),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AchPrenotification = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumber()
        addendum()
        companyDescriptiveDate()
        companyDiscretionaryData()
        companyEntryDescription()
        companyName()
        createdAt()
        creditDebitIndicator()?.validate()
        effectiveDate()
        idempotencyKey()
        notificationsOfChange().forEach { it.validate() }
        prenotificationReturn()?.validate()
        routingNumber()
        status().validate()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (accountNumber.asKnown() == null) 0 else 1) +
            (if (addendum.asKnown() == null) 0 else 1) +
            (if (companyDescriptiveDate.asKnown() == null) 0 else 1) +
            (if (companyDiscretionaryData.asKnown() == null) 0 else 1) +
            (if (companyEntryDescription.asKnown() == null) 0 else 1) +
            (if (companyName.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (creditDebitIndicator.asKnown()?.validity() ?: 0) +
            (if (effectiveDate.asKnown() == null) 0 else 1) +
            (if (idempotencyKey.asKnown() == null) 0 else 1) +
            (notificationsOfChange.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (prenotificationReturn.asKnown()?.validity() ?: 0) +
            (if (routingNumber.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    /** If the notification is for a future credit or debit. */
    class CreditDebitIndicator
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

            /** The Prenotification is for an anticipated credit. */
            val CREDIT = of("credit")

            /** The Prenotification is for an anticipated debit. */
            val DEBIT = of("debit")

            fun of(value: String) = CreditDebitIndicator(JsonField.of(value))
        }

        /** An enum containing [CreditDebitIndicator]'s known values. */
        enum class Known {
            /** The Prenotification is for an anticipated credit. */
            CREDIT,
            /** The Prenotification is for an anticipated debit. */
            DEBIT,
        }

        /**
         * An enum containing [CreditDebitIndicator]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CreditDebitIndicator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The Prenotification is for an anticipated credit. */
            CREDIT,
            /** The Prenotification is for an anticipated debit. */
            DEBIT,
            /**
             * An enum member indicating that [CreditDebitIndicator] was instantiated with an
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown CreditDebitIndicator: $value")
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

        fun validate(): CreditDebitIndicator = apply {
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

            return other is CreditDebitIndicator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class NotificationsOfChange
    private constructor(
        private val changeCode: JsonField<ChangeCode>,
        private val correctedData: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("change_code")
            @ExcludeMissing
            changeCode: JsonField<ChangeCode> = JsonMissing.of(),
            @JsonProperty("corrected_data")
            @ExcludeMissing
            correctedData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(changeCode, correctedData, createdAt, mutableMapOf())

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun changeCode(): ChangeCode = changeCode.getRequired("change_code")

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun correctedData(): String = correctedData.getRequired("corrected_data")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Returns the raw JSON value of [changeCode].
         *
         * Unlike [changeCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change_code")
        @ExcludeMissing
        fun _changeCode(): JsonField<ChangeCode> = changeCode

        /**
         * Returns the raw JSON value of [correctedData].
         *
         * Unlike [correctedData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("corrected_data")
        @ExcludeMissing
        fun _correctedData(): JsonField<String> = correctedData

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
             * Returns a mutable builder for constructing an instance of [NotificationsOfChange].
             *
             * The following fields are required:
             * ```kotlin
             * .changeCode()
             * .correctedData()
             * .createdAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NotificationsOfChange]. */
        class Builder internal constructor() {

            private var changeCode: JsonField<ChangeCode>? = null
            private var correctedData: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(notificationsOfChange: NotificationsOfChange) = apply {
                changeCode = notificationsOfChange.changeCode
                correctedData = notificationsOfChange.correctedData
                createdAt = notificationsOfChange.createdAt
                additionalProperties = notificationsOfChange.additionalProperties.toMutableMap()
            }

            /**
             * The required type of change that is being signaled by the receiving financial
             * institution.
             */
            fun changeCode(changeCode: ChangeCode) = changeCode(JsonField.of(changeCode))

            /**
             * Sets [Builder.changeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeCode] with a well-typed [ChangeCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeCode(changeCode: JsonField<ChangeCode>) = apply {
                this.changeCode = changeCode
            }

            /**
             * The corrected data that should be used in future ACHs to this account. This may
             * contain the suggested new account number or routing number. When the `change_code` is
             * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a
             * 2 encourage changing the `funding` parameter to checking; numbers starting with a 3
             * encourage changing to savings.
             */
            fun correctedData(correctedData: String) = correctedData(JsonField.of(correctedData))

            /**
             * Sets [Builder.correctedData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedData] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correctedData(correctedData: JsonField<String>) = apply {
                this.correctedData = correctedData
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * notification occurred.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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
             * Returns an immutable instance of [NotificationsOfChange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .changeCode()
             * .correctedData()
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NotificationsOfChange =
                NotificationsOfChange(
                    checkRequired("changeCode", changeCode),
                    checkRequired("correctedData", correctedData),
                    checkRequired("createdAt", createdAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): NotificationsOfChange = apply {
            if (validated) {
                return@apply
            }

            changeCode().validate()
            correctedData()
            createdAt()
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
            (changeCode.asKnown()?.validity() ?: 0) +
                (if (correctedData.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1)

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        class ChangeCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** The account number was incorrect. */
                val INCORRECT_ACCOUNT_NUMBER = of("incorrect_account_number")

                /** The routing number was incorrect. */
                val INCORRECT_ROUTING_NUMBER = of("incorrect_routing_number")

                /** Both the routing number and the account number were incorrect. */
                val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                    of("incorrect_routing_number_and_account_number")

                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                val INCORRECT_TRANSACTION_CODE = of("incorrect_transaction_code")

                /** The account number and the transaction code were incorrect. */
                val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_account_number_and_transaction_code")

                /** The routing number, account number, and transaction code were incorrect. */
                val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_routing_number_account_number_and_transaction_code")

                /** The receiving depository financial institution identification was incorrect. */
                val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                    of("incorrect_receiving_depository_financial_institution_identification")

                /** The individual identification number was incorrect. */
                val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                    of("incorrect_individual_identification_number")

                /** The addenda had an incorrect format. */
                val ADDENDA_FORMAT_ERROR = of("addenda_format_error")

                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrect_standard_entry_class_code_for_outbound_international_payment")

                /** The notification of change was misrouted. */
                val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

                /** The trace number was incorrect. */
                val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

                /** The company identification number was incorrect. */
                val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                    of("incorrect_company_identification_number")

                /** The individual identification number or identification number was incorrect. */
                val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

                /** The corrected data was incorrectly formatted. */
                val INCORRECTLY_FORMATTED_CORRECTED_DATA =
                    of("incorrectly_formatted_corrected_data")

                /** The discretionary data was incorrect. */
                val INCORRECT_DISCRETIONARY_DATA = of("incorrect_discretionary_data")

                /** The routing number was not from the original entry detail record. */
                val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of("routing_number_not_from_original_entry_detail_record")

                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of(
                        "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                    )

                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                    of("incorrect_transaction_code_by_originating_depository_financial_institution")

                fun of(value: String) = ChangeCode(JsonField.of(value))
            }

            /** An enum containing [ChangeCode]'s known values. */
            enum class Known {
                /** The account number was incorrect. */
                INCORRECT_ACCOUNT_NUMBER,
                /** The routing number was incorrect. */
                INCORRECT_ROUTING_NUMBER,
                /** Both the routing number and the account number were incorrect. */
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                INCORRECT_TRANSACTION_CODE,
                /** The account number and the transaction code were incorrect. */
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The routing number, account number, and transaction code were incorrect. */
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The receiving depository financial institution identification was incorrect. */
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                /** The individual identification number was incorrect. */
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                /** The addenda had an incorrect format. */
                ADDENDA_FORMAT_ERROR,
                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** The notification of change was misrouted. */
                MISROUTED_NOTIFICATION_OF_CHANGE,
                /** The trace number was incorrect. */
                INCORRECT_TRACE_NUMBER,
                /** The company identification number was incorrect. */
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                /** The individual identification number or identification number was incorrect. */
                INCORRECT_IDENTIFICATION_NUMBER,
                /** The corrected data was incorrectly formatted. */
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                /** The discretionary data was incorrect. */
                INCORRECT_DISCRETIONARY_DATA,
                /** The routing number was not from the original entry detail record. */
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
            }

            /**
             * An enum containing [ChangeCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChangeCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The account number was incorrect. */
                INCORRECT_ACCOUNT_NUMBER,
                /** The routing number was incorrect. */
                INCORRECT_ROUTING_NUMBER,
                /** Both the routing number and the account number were incorrect. */
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                INCORRECT_TRANSACTION_CODE,
                /** The account number and the transaction code were incorrect. */
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The routing number, account number, and transaction code were incorrect. */
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The receiving depository financial institution identification was incorrect. */
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                /** The individual identification number was incorrect. */
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                /** The addenda had an incorrect format. */
                ADDENDA_FORMAT_ERROR,
                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** The notification of change was misrouted. */
                MISROUTED_NOTIFICATION_OF_CHANGE,
                /** The trace number was incorrect. */
                INCORRECT_TRACE_NUMBER,
                /** The company identification number was incorrect. */
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                /** The individual identification number or identification number was incorrect. */
                INCORRECT_IDENTIFICATION_NUMBER,
                /** The corrected data was incorrectly formatted. */
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                /** The discretionary data was incorrect. */
                INCORRECT_DISCRETIONARY_DATA,
                /** The routing number was not from the original entry detail record. */
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
                /**
                 * An enum member indicating that [ChangeCode] was instantiated with an unknown
                 * value.
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
                    INCORRECT_ACCOUNT_NUMBER -> Value.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Value.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Value.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Value.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Value.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Value.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Value.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Value.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Value.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Value.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Value.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Value.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Value
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
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
                    INCORRECT_ACCOUNT_NUMBER -> Known.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Known.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Known.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Known.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Known.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Known.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Known.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Known.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Known.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Known.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Known.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Known.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Known
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
                    else -> throw IncreaseInvalidDataException("Unknown ChangeCode: $value")
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

            fun validate(): ChangeCode = apply {
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

                return other is ChangeCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NotificationsOfChange &&
                changeCode == other.changeCode &&
                correctedData == other.correctedData &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(changeCode, correctedData, createdAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NotificationsOfChange{changeCode=$changeCode, correctedData=$correctedData, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** If your prenotification is returned, this will contain details of the return. */
    class PrenotificationReturn
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val returnReasonCode: JsonField<ReturnReasonCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of(),
        ) : this(createdAt, returnReasonCode, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Prenotification was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Why the Prenotification was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnReasonCode(): ReturnReasonCode =
            returnReasonCode.getRequired("return_reason_code")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [returnReasonCode].
         *
         * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<ReturnReasonCode> = returnReasonCode

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
             * Returns a mutable builder for constructing an instance of [PrenotificationReturn].
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .returnReasonCode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PrenotificationReturn]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var returnReasonCode: JsonField<ReturnReasonCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(prenotificationReturn: PrenotificationReturn) = apply {
                createdAt = prenotificationReturn.createdAt
                returnReasonCode = prenotificationReturn.returnReasonCode
                additionalProperties = prenotificationReturn.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Prenotification was returned.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Why the Prenotification was returned. */
            fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /**
             * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCode] with a well-typed
             * [ReturnReasonCode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                this.returnReasonCode = returnReasonCode
            }

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
             * Returns an immutable instance of [PrenotificationReturn].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .returnReasonCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PrenotificationReturn =
                PrenotificationReturn(
                    checkRequired("createdAt", createdAt),
                    checkRequired("returnReasonCode", returnReasonCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PrenotificationReturn = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            returnReasonCode().validate()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
                (returnReasonCode.asKnown()?.validity() ?: 0)

        /** Why the Prenotification was returned. */
        class ReturnReasonCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                val INSUFFICIENT_FUND = of("insufficient_fund")

                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                val NO_ACCOUNT = of("no_account")

                /** Code R02. The account is closed at the receiving bank. */
                val ACCOUNT_CLOSED = of("account_closed")

                /** Code R04. The account number is invalid at the receiving bank. */
                val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                    of("account_frozen_entry_returned_per_ofac_instruction")

                /** Code R23. The receiving bank account refused a credit transfer. */
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                    of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                /** Code R08. The receiving bank stopped payment on this transfer. */
                val PAYMENT_STOPPED = of("payment_stopped")

                /** Code R20. The receiving bank account does not perform transfers. */
                val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                val UNCOLLECTED_FUNDS = of("uncollected_funds")

                /** Code R28. The routing number is incorrect. */
                val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

                /** Code R10. The customer at the receiving bank reversed the transfer. */
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** Code R19. The amount field is incorrect or too large. */
                val AMOUNT_FIELD_ERROR = of("amount_field_error")

                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /** Code R13. The routing number is invalid. */
                val INVALID_ACH_ROUTING_NUMBER = of("invalid_ach_routing_number")

                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                val FILE_RECORD_EDIT_CRITERIA = of("file_record_edit_criteria")

                /** Code R45. The individual name field was invalid. */
                val ENR_INVALID_INDIVIDUAL_NAME = of("enr_invalid_individual_name")

                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                val LIMITED_PARTICIPATION_DFI = of("limited_participation_dfi")

                /** Code R85. The outbound international ACH transfer was incorrect. */
                val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrectly_coded_outbound_international_payment")

                /** Code R12. A rare return reason. The account was sold to another bank. */
                val ACCOUNT_SOLD_TO_ANOTHER_DFI = of("account_sold_to_another_dfi")

                /** Code R25. The addenda record is incorrect or missing. */
                val ADDENDA_ERROR = of("addenda_error")

                /** Code R15. A rare return reason. The account holder is deceased. */
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                    of("customer_advised_not_within_authorization_terms")

                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                val CORRECTED_RETURN = of("corrected_return")

                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                val DUPLICATE_ENTRY = of("duplicate_entry")

                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                val DUPLICATE_RETURN = of("duplicate_return")

                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_DUPLICATE_ENROLLMENT = of("enr_duplicate_enrollment")

                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_DFI_ACCOUNT_NUMBER = of("enr_invalid_dfi_account_number")

                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                    of("enr_invalid_representative_payee_indicator")

                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    of("enr_routing_number_check_digit_error")

                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                val ENTRY_NOT_PROCESSED_BY_GATEWAY = of("entry_not_processed_by_gateway")

                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                val FIELD_ERROR = of("field_error")

                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                    of("foreign_receiving_dfi_unable_to_settle")

                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                val IAT_ENTRY_CODING_ERROR = of("iat_entry_coding_error")

                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                val IMPROPER_EFFECTIVE_ENTRY_DATE = of("improper_effective_entry_date")

                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                    of("improper_source_document_source_document_presented")

                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                val INVALID_COMPANY_ID = of("invalid_company_id")

                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                    of("invalid_foreign_receiving_dfi_identification")

                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                val INVALID_INDIVIDUAL_ID_NUMBER = of("invalid_individual_id_number")

                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                    of("item_and_rck_entry_presented_for_payment")

                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                    of("item_related_to_rck_entry_is_ineligible")

                /** Code R26. A rare return reason. The ACH is missing a required field. */
                val MANDATORY_FIELD_ERROR = of("mandatory_field_error")

                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                val MISROUTED_DISHONORED_RETURN = of("misrouted_dishonored_return")

                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                val MISROUTED_RETURN = of("misrouted_return")

                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                val NO_ERRORS_FOUND = of("no_errors_found")

                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                    of("non_acceptance_of_r62_dishonored_return")

                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                val NON_PARTICIPANT_IN_IAT_PROGRAM = of("non_participant_in_iat_program")

                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                val PERMISSIBLE_RETURN_ENTRY = of("permissible_return_entry")

                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                    of("permissible_return_entry_not_accepted")

                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                val RDFI_NON_SETTLEMENT = of("rdfi_non_settlement")

                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                    of("rdfi_participant_in_check_truncation_program")

                /** Code R14. A rare return reason. The payee is deceased. */
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                val RETURN_NOT_A_DUPLICATE = of("return_not_a_duplicate")

                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    of("return_of_erroneous_or_reversing_debit")

                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                    of("source_document_presented_for_payment")

                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                    of("stop_payment_on_item_related_to_rck_entry")

                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                val TRACE_NUMBER_ERROR = of("trace_number_error")

                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

                /** Code R68. A rare return reason. The return was sent too late. */
                val UNTIMELY_RETURN = of("untimely_return")

                fun of(value: String) = ReturnReasonCode(JsonField.of(value))
            }

            /** An enum containing [ReturnReasonCode]'s known values. */
            enum class Known {
                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                INSUFFICIENT_FUND,
                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                NO_ACCOUNT,
                /** Code R02. The account is closed at the receiving bank. */
                ACCOUNT_CLOSED,
                /** Code R04. The account number is invalid at the receiving bank. */
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                /** Code R23. The receiving bank account refused a credit transfer. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** Code R08. The receiving bank stopped payment on this transfer. */
                PAYMENT_STOPPED,
                /** Code R20. The receiving bank account does not perform transfers. */
                NON_TRANSACTION_ACCOUNT,
                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                UNCOLLECTED_FUNDS,
                /** Code R28. The routing number is incorrect. */
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /** Code R10. The customer at the receiving bank reversed the transfer. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** Code R19. The amount field is incorrect or too large. */
                AMOUNT_FIELD_ERROR,
                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** Code R13. The routing number is invalid. */
                INVALID_ACH_ROUTING_NUMBER,
                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                FILE_RECORD_EDIT_CRITERIA,
                /** Code R45. The individual name field was invalid. */
                ENR_INVALID_INDIVIDUAL_NAME,
                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                LIMITED_PARTICIPATION_DFI,
                /** Code R85. The outbound international ACH transfer was incorrect. */
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** Code R12. A rare return reason. The account was sold to another bank. */
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                /** Code R25. The addenda record is incorrect or missing. */
                ADDENDA_ERROR,
                /** Code R15. A rare return reason. The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                CORRECTED_RETURN,
                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                DUPLICATE_ENTRY,
                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                DUPLICATE_RETURN,
                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_DUPLICATE_ENROLLMENT,
                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_TRANSACTION_CODE,
                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_RETURN_OF_ENR_ENTRY,
                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                FIELD_ERROR,
                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                IAT_ENTRY_CODING_ERROR,
                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                INVALID_COMPANY_ID,
                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                /** Code R26. A rare return reason. The ACH is missing a required field. */
                MANDATORY_FIELD_ERROR,
                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                MISROUTED_DISHONORED_RETURN,
                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                MISROUTED_RETURN,
                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                NO_ERRORS_FOUND,
                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                PERMISSIBLE_RETURN_ENTRY,
                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                RDFI_NON_SETTLEMENT,
                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                /** Code R14. A rare return reason. The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                RETURN_NOT_A_DUPLICATE,
                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                RETURN_OF_XCK_ENTRY,
                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                TIMELY_ORIGINAL_RETURN,
                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                TRACE_NUMBER_ERROR,
                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                UNTIMELY_DISHONORED_RETURN,
                /** Code R68. A rare return reason. The return was sent too late. */
                UNTIMELY_RETURN,
            }

            /**
             * An enum containing [ReturnReasonCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ReturnReasonCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                INSUFFICIENT_FUND,
                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                NO_ACCOUNT,
                /** Code R02. The account is closed at the receiving bank. */
                ACCOUNT_CLOSED,
                /** Code R04. The account number is invalid at the receiving bank. */
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                /** Code R23. The receiving bank account refused a credit transfer. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** Code R08. The receiving bank stopped payment on this transfer. */
                PAYMENT_STOPPED,
                /** Code R20. The receiving bank account does not perform transfers. */
                NON_TRANSACTION_ACCOUNT,
                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                UNCOLLECTED_FUNDS,
                /** Code R28. The routing number is incorrect. */
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /** Code R10. The customer at the receiving bank reversed the transfer. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** Code R19. The amount field is incorrect or too large. */
                AMOUNT_FIELD_ERROR,
                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** Code R13. The routing number is invalid. */
                INVALID_ACH_ROUTING_NUMBER,
                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                FILE_RECORD_EDIT_CRITERIA,
                /** Code R45. The individual name field was invalid. */
                ENR_INVALID_INDIVIDUAL_NAME,
                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                LIMITED_PARTICIPATION_DFI,
                /** Code R85. The outbound international ACH transfer was incorrect. */
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** Code R12. A rare return reason. The account was sold to another bank. */
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                /** Code R25. The addenda record is incorrect or missing. */
                ADDENDA_ERROR,
                /** Code R15. A rare return reason. The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                CORRECTED_RETURN,
                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                DUPLICATE_ENTRY,
                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                DUPLICATE_RETURN,
                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_DUPLICATE_ENROLLMENT,
                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_TRANSACTION_CODE,
                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_RETURN_OF_ENR_ENTRY,
                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                FIELD_ERROR,
                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                IAT_ENTRY_CODING_ERROR,
                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                INVALID_COMPANY_ID,
                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                /** Code R26. A rare return reason. The ACH is missing a required field. */
                MANDATORY_FIELD_ERROR,
                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                MISROUTED_DISHONORED_RETURN,
                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                MISROUTED_RETURN,
                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                NO_ERRORS_FOUND,
                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                PERMISSIBLE_RETURN_ENTRY,
                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                RDFI_NON_SETTLEMENT,
                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                /** Code R14. A rare return reason. The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                RETURN_NOT_A_DUPLICATE,
                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                RETURN_OF_XCK_ENTRY,
                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                TIMELY_ORIGINAL_RETURN,
                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                TRACE_NUMBER_ERROR,
                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                UNTIMELY_DISHONORED_RETURN,
                /** Code R68. A rare return reason. The return was sent too late. */
                UNTIMELY_RETURN,
                /**
                 * An enum member indicating that [ReturnReasonCode] was instantiated with an
                 * unknown value.
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
                    INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                    NO_ACCOUNT -> Value.NO_ACCOUNT
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                        Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                        Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                    UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                    FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                    ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                    ACCOUNT_SOLD_TO_ANOTHER_DFI -> Value.ACCOUNT_SOLD_TO_ANOTHER_DFI
                    ADDENDA_ERROR -> Value.ADDENDA_ERROR
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                        Value.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                    CORRECTED_RETURN -> Value.CORRECTED_RETURN
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                    ENR_DUPLICATE_ENROLLMENT -> Value.ENR_DUPLICATE_ENROLLMENT
                    ENR_INVALID_DFI_ACCOUNT_NUMBER -> Value.ENR_INVALID_DFI_ACCOUNT_NUMBER
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Value.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                        Value.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                    ENR_INVALID_TRANSACTION_CODE -> Value.ENR_INVALID_TRANSACTION_CODE
                    ENR_RETURN_OF_ENR_ENTRY -> Value.ENR_RETURN_OF_ENR_ENTRY
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                        Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    ENTRY_NOT_PROCESSED_BY_GATEWAY -> Value.ENTRY_NOT_PROCESSED_BY_GATEWAY
                    FIELD_ERROR -> Value.FIELD_ERROR
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                        Value.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                    IAT_ENTRY_CODING_ERROR -> Value.IAT_ENTRY_CODING_ERROR
                    IMPROPER_EFFECTIVE_ENTRY_DATE -> Value.IMPROPER_EFFECTIVE_ENTRY_DATE
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                        Value.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                    INVALID_COMPANY_ID -> Value.INVALID_COMPANY_ID
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                        Value.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                    INVALID_INDIVIDUAL_ID_NUMBER -> Value.INVALID_INDIVIDUAL_ID_NUMBER
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                        Value.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                        Value.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                    MANDATORY_FIELD_ERROR -> Value.MANDATORY_FIELD_ERROR
                    MISROUTED_DISHONORED_RETURN -> Value.MISROUTED_DISHONORED_RETURN
                    MISROUTED_RETURN -> Value.MISROUTED_RETURN
                    NO_ERRORS_FOUND -> Value.NO_ERRORS_FOUND
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                        Value.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                    NON_PARTICIPANT_IN_IAT_PROGRAM -> Value.NON_PARTICIPANT_IN_IAT_PROGRAM
                    PERMISSIBLE_RETURN_ENTRY -> Value.PERMISSIBLE_RETURN_ENTRY
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                        Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                    RDFI_NON_SETTLEMENT -> Value.RDFI_NON_SETTLEMENT
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                        Value.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Value.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Value.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Value.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Value.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Value.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Value.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Value.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Value.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Value.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Value.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Value.UNTIMELY_RETURN
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
                    INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                    NO_ACCOUNT -> Known.NO_ACCOUNT
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                        Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                        Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                    UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                    FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                    ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                    ACCOUNT_SOLD_TO_ANOTHER_DFI -> Known.ACCOUNT_SOLD_TO_ANOTHER_DFI
                    ADDENDA_ERROR -> Known.ADDENDA_ERROR
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                        Known.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                    CORRECTED_RETURN -> Known.CORRECTED_RETURN
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                    ENR_DUPLICATE_ENROLLMENT -> Known.ENR_DUPLICATE_ENROLLMENT
                    ENR_INVALID_DFI_ACCOUNT_NUMBER -> Known.ENR_INVALID_DFI_ACCOUNT_NUMBER
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Known.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                        Known.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                    ENR_INVALID_TRANSACTION_CODE -> Known.ENR_INVALID_TRANSACTION_CODE
                    ENR_RETURN_OF_ENR_ENTRY -> Known.ENR_RETURN_OF_ENR_ENTRY
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                        Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    ENTRY_NOT_PROCESSED_BY_GATEWAY -> Known.ENTRY_NOT_PROCESSED_BY_GATEWAY
                    FIELD_ERROR -> Known.FIELD_ERROR
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                        Known.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                    IAT_ENTRY_CODING_ERROR -> Known.IAT_ENTRY_CODING_ERROR
                    IMPROPER_EFFECTIVE_ENTRY_DATE -> Known.IMPROPER_EFFECTIVE_ENTRY_DATE
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                        Known.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                    INVALID_COMPANY_ID -> Known.INVALID_COMPANY_ID
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                        Known.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                    INVALID_INDIVIDUAL_ID_NUMBER -> Known.INVALID_INDIVIDUAL_ID_NUMBER
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                        Known.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                        Known.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                    MANDATORY_FIELD_ERROR -> Known.MANDATORY_FIELD_ERROR
                    MISROUTED_DISHONORED_RETURN -> Known.MISROUTED_DISHONORED_RETURN
                    MISROUTED_RETURN -> Known.MISROUTED_RETURN
                    NO_ERRORS_FOUND -> Known.NO_ERRORS_FOUND
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                        Known.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                    NON_PARTICIPANT_IN_IAT_PROGRAM -> Known.NON_PARTICIPANT_IN_IAT_PROGRAM
                    PERMISSIBLE_RETURN_ENTRY -> Known.PERMISSIBLE_RETURN_ENTRY
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                        Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                    RDFI_NON_SETTLEMENT -> Known.RDFI_NON_SETTLEMENT
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                        Known.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Known.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Known.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Known.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Known.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
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

            fun validate(): ReturnReasonCode = apply {
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

                return other is ReturnReasonCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PrenotificationReturn &&
                createdAt == other.createdAt &&
                returnReasonCode == other.returnReasonCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, returnReasonCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrenotificationReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the ACH Prenotification. */
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

            /** The Prenotification is pending submission. */
            val PENDING_SUBMITTING = of("pending_submitting")

            /** The Prenotification requires attention. */
            val REQUIRES_ATTENTION = of("requires_attention")

            /** The Prenotification has been returned. */
            val RETURNED = of("returned")

            /** The Prenotification is complete. */
            val SUBMITTED = of("submitted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Prenotification is pending submission. */
            PENDING_SUBMITTING,
            /** The Prenotification requires attention. */
            REQUIRES_ATTENTION,
            /** The Prenotification has been returned. */
            RETURNED,
            /** The Prenotification is complete. */
            SUBMITTED,
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
            /** The Prenotification is pending submission. */
            PENDING_SUBMITTING,
            /** The Prenotification requires attention. */
            REQUIRES_ATTENTION,
            /** The Prenotification has been returned. */
            RETURNED,
            /** The Prenotification is complete. */
            SUBMITTED,
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
                PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                RETURNED -> Value.RETURNED
                SUBMITTED -> Value.SUBMITTED
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
                PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                RETURNED -> Known.RETURNED
                SUBMITTED -> Known.SUBMITTED
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
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

            val ACH_PRENOTIFICATION = of("ach_prenotification")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH_PRENOTIFICATION
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
            ACH_PRENOTIFICATION,
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
                ACH_PRENOTIFICATION -> Value.ACH_PRENOTIFICATION
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
                ACH_PRENOTIFICATION -> Known.ACH_PRENOTIFICATION
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchPrenotification &&
            id == other.id &&
            accountNumber == other.accountNumber &&
            addendum == other.addendum &&
            companyDescriptiveDate == other.companyDescriptiveDate &&
            companyDiscretionaryData == other.companyDiscretionaryData &&
            companyEntryDescription == other.companyEntryDescription &&
            companyName == other.companyName &&
            createdAt == other.createdAt &&
            creditDebitIndicator == other.creditDebitIndicator &&
            effectiveDate == other.effectiveDate &&
            idempotencyKey == other.idempotencyKey &&
            notificationsOfChange == other.notificationsOfChange &&
            prenotificationReturn == other.prenotificationReturn &&
            routingNumber == other.routingNumber &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            createdAt,
            creditDebitIndicator,
            effectiveDate,
            idempotencyKey,
            notificationsOfChange,
            prenotificationReturn,
            routingNumber,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AchPrenotification{id=$id, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, createdAt=$createdAt, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, idempotencyKey=$idempotencyKey, notificationsOfChange=$notificationsOfChange, prenotificationReturn=$prenotificationReturn, routingNumber=$routingNumber, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
