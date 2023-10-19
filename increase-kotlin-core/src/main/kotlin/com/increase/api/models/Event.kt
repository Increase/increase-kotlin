// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Events are records of things that happened to objects at Increase. Events are accessible via the
 * List Events endpoint and can be delivered to your application via webhooks. For more information,
 * see our [webhooks guide](https://increase.com/documentation/webhooks).
 */
@JsonDeserialize(builder = Event.Builder::class)
@NoAutoDetect
class Event
private constructor(
    private val associatedObjectId: JsonField<String>,
    private val associatedObjectType: JsonField<String>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier of the object that generated this Event. */
    fun associatedObjectId(): String = associatedObjectId.getRequired("associated_object_id")

    /** The type of the object that generated this Event. */
    fun associatedObjectType(): String = associatedObjectType.getRequired("associated_object_type")

    /**
     * The category of the Event. We may add additional possible values for this enum over time;
     * your application should be able to handle such additions gracefully.
     */
    fun category(): Category = category.getRequired("category")

    /** The time the Event was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Event identifier. */
    fun id(): String = id.getRequired("id")

    /** A constant representing the object's type. For this resource it will always be `event`. */
    fun type(): Type = type.getRequired("type")

    /** The identifier of the object that generated this Event. */
    @JsonProperty("associated_object_id")
    @ExcludeMissing
    fun _associatedObjectId() = associatedObjectId

    /** The type of the object that generated this Event. */
    @JsonProperty("associated_object_type")
    @ExcludeMissing
    fun _associatedObjectType() = associatedObjectType

    /**
     * The category of the Event. We may add additional possible values for this enum over time;
     * your application should be able to handle such additions gracefully.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** The time the Event was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The Event identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** A constant representing the object's type. For this resource it will always be `event`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Event = apply {
        if (!validated) {
            associatedObjectId()
            associatedObjectType()
            category()
            createdAt()
            id()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Event &&
            this.associatedObjectId == other.associatedObjectId &&
            this.associatedObjectType == other.associatedObjectType &&
            this.category == other.category &&
            this.createdAt == other.createdAt &&
            this.id == other.id &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    associatedObjectId,
                    associatedObjectType,
                    category,
                    createdAt,
                    id,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Event{associatedObjectId=$associatedObjectId, associatedObjectType=$associatedObjectType, category=$category, createdAt=$createdAt, id=$id, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var associatedObjectId: JsonField<String> = JsonMissing.of()
        private var associatedObjectType: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(event: Event) = apply {
            this.associatedObjectId = event.associatedObjectId
            this.associatedObjectType = event.associatedObjectType
            this.category = event.category
            this.createdAt = event.createdAt
            this.id = event.id
            this.type = event.type
            additionalProperties(event.additionalProperties)
        }

        /** The identifier of the object that generated this Event. */
        fun associatedObjectId(associatedObjectId: String) =
            associatedObjectId(JsonField.of(associatedObjectId))

        /** The identifier of the object that generated this Event. */
        @JsonProperty("associated_object_id")
        @ExcludeMissing
        fun associatedObjectId(associatedObjectId: JsonField<String>) = apply {
            this.associatedObjectId = associatedObjectId
        }

        /** The type of the object that generated this Event. */
        fun associatedObjectType(associatedObjectType: String) =
            associatedObjectType(JsonField.of(associatedObjectType))

        /** The type of the object that generated this Event. */
        @JsonProperty("associated_object_type")
        @ExcludeMissing
        fun associatedObjectType(associatedObjectType: JsonField<String>) = apply {
            this.associatedObjectType = associatedObjectType
        }

        /**
         * The category of the Event. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * The category of the Event. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** The time the Event was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Event was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The Event identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Event identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A constant representing the object's type. For this resource it will always be `event`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `event`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): Event =
            Event(
                associatedObjectId,
                associatedObjectType,
                category,
                createdAt,
                id,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_CREATED = Category(JsonField.of("account.created"))

            val ACCOUNT_UPDATED = Category(JsonField.of("account.updated"))

            val ACCOUNT_NUMBER_CREATED = Category(JsonField.of("account_number.created"))

            val ACCOUNT_NUMBER_UPDATED = Category(JsonField.of("account_number.updated"))

            val ACCOUNT_STATEMENT_CREATED = Category(JsonField.of("account_statement.created"))

            val ACCOUNT_TRANSFER_CREATED = Category(JsonField.of("account_transfer.created"))

            val ACCOUNT_TRANSFER_UPDATED = Category(JsonField.of("account_transfer.updated"))

            val ACH_PRENOTIFICATION_CREATED = Category(JsonField.of("ach_prenotification.created"))

            val ACH_PRENOTIFICATION_UPDATED = Category(JsonField.of("ach_prenotification.updated"))

            val ACH_TRANSFER_CREATED = Category(JsonField.of("ach_transfer.created"))

            val ACH_TRANSFER_UPDATED = Category(JsonField.of("ach_transfer.updated"))

            val BOOKKEEPING_ACCOUNT_CREATED = Category(JsonField.of("bookkeeping_account.created"))

            val BOOKKEEPING_ACCOUNT_UPDATED = Category(JsonField.of("bookkeeping_account.updated"))

            val BOOKKEEPING_ENTRY_SET_UPDATED =
                Category(JsonField.of("bookkeeping_entry_set.updated"))

            val CARD_CREATED = Category(JsonField.of("card.created"))

            val CARD_UPDATED = Category(JsonField.of("card.updated"))

            val CARD_PAYMENT_CREATED = Category(JsonField.of("card_payment.created"))

            val CARD_PAYMENT_UPDATED = Category(JsonField.of("card_payment.updated"))

            val CARD_PROFILE_CREATED = Category(JsonField.of("card_profile.created"))

            val CARD_PROFILE_UPDATED = Category(JsonField.of("card_profile.updated"))

            val CARD_DISPUTE_CREATED = Category(JsonField.of("card_dispute.created"))

            val CARD_DISPUTE_UPDATED = Category(JsonField.of("card_dispute.updated"))

            val CHECK_DEPOSIT_CREATED = Category(JsonField.of("check_deposit.created"))

            val CHECK_DEPOSIT_UPDATED = Category(JsonField.of("check_deposit.updated"))

            val CHECK_TRANSFER_CREATED = Category(JsonField.of("check_transfer.created"))

            val CHECK_TRANSFER_UPDATED = Category(JsonField.of("check_transfer.updated"))

            val DECLINED_TRANSACTION_CREATED =
                Category(JsonField.of("declined_transaction.created"))

            val DIGITAL_WALLET_TOKEN_CREATED =
                Category(JsonField.of("digital_wallet_token.created"))

            val DIGITAL_WALLET_TOKEN_UPDATED =
                Category(JsonField.of("digital_wallet_token.updated"))

            val DOCUMENT_CREATED = Category(JsonField.of("document.created"))

            val ENTITY_CREATED = Category(JsonField.of("entity.created"))

            val ENTITY_UPDATED = Category(JsonField.of("entity.updated"))

            val EVENT_SUBSCRIPTION_CREATED = Category(JsonField.of("event_subscription.created"))

            val EVENT_SUBSCRIPTION_UPDATED = Category(JsonField.of("event_subscription.updated"))

            val EXPORT_CREATED = Category(JsonField.of("export.created"))

            val EXPORT_UPDATED = Category(JsonField.of("export.updated"))

            val EXTERNAL_ACCOUNT_CREATED = Category(JsonField.of("external_account.created"))

            val EXTERNAL_ACCOUNT_UPDATED = Category(JsonField.of("external_account.updated"))

            val FILE_CREATED = Category(JsonField.of("file.created"))

            val GROUP_UPDATED = Category(JsonField.of("group.updated"))

            val GROUP_HEARTBEAT = Category(JsonField.of("group.heartbeat"))

            val INBOUND_ACH_TRANSFER_CREATED =
                Category(JsonField.of("inbound_ach_transfer.created"))

            val INBOUND_ACH_TRANSFER_UPDATED =
                Category(JsonField.of("inbound_ach_transfer.updated"))

            val INBOUND_ACH_TRANSFER_RETURN_CREATED =
                Category(JsonField.of("inbound_ach_transfer_return.created"))

            val INBOUND_ACH_TRANSFER_RETURN_UPDATED =
                Category(JsonField.of("inbound_ach_transfer_return.updated"))

            val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED =
                Category(JsonField.of("inbound_wire_drawdown_request.created"))

            val INTRAFI_ACCOUNT_ENROLLMENT_CREATED =
                Category(JsonField.of("intrafi_account_enrollment.created"))

            val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED =
                Category(JsonField.of("intrafi_account_enrollment.updated"))

            val INTRAFI_EXCLUSION_CREATED = Category(JsonField.of("intrafi_exclusion.created"))

            val INTRAFI_EXCLUSION_UPDATED = Category(JsonField.of("intrafi_exclusion.updated"))

            val OAUTH_CONNECTION_CREATED = Category(JsonField.of("oauth_connection.created"))

            val OAUTH_CONNECTION_DEACTIVATED =
                Category(JsonField.of("oauth_connection.deactivated"))

            val PENDING_TRANSACTION_CREATED = Category(JsonField.of("pending_transaction.created"))

            val PENDING_TRANSACTION_UPDATED = Category(JsonField.of("pending_transaction.updated"))

            val PHYSICAL_CARD_CREATED = Category(JsonField.of("physical_card.created"))

            val PHYSICAL_CARD_UPDATED = Category(JsonField.of("physical_card.updated"))

            val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                Category(JsonField.of("real_time_decision.card_authorization_requested"))

            val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                Category(JsonField.of("real_time_decision.digital_wallet_token_requested"))

            val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                Category(JsonField.of("real_time_decision.digital_wallet_authentication_requested"))

            val REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                Category(JsonField.of("real_time_payments_transfer.created"))

            val REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                Category(JsonField.of("real_time_payments_transfer.updated"))

            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                Category(JsonField.of("real_time_payments_request_for_payment.created"))

            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                Category(JsonField.of("real_time_payments_request_for_payment.updated"))

            val TRANSACTION_CREATED = Category(JsonField.of("transaction.created"))

            val WIRE_DRAWDOWN_REQUEST_CREATED =
                Category(JsonField.of("wire_drawdown_request.created"))

            val WIRE_DRAWDOWN_REQUEST_UPDATED =
                Category(JsonField.of("wire_drawdown_request.updated"))

            val WIRE_TRANSFER_CREATED = Category(JsonField.of("wire_transfer.created"))

            val WIRE_TRANSFER_UPDATED = Category(JsonField.of("wire_transfer.updated"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_CREATED,
            ACCOUNT_UPDATED,
            ACCOUNT_NUMBER_CREATED,
            ACCOUNT_NUMBER_UPDATED,
            ACCOUNT_STATEMENT_CREATED,
            ACCOUNT_TRANSFER_CREATED,
            ACCOUNT_TRANSFER_UPDATED,
            ACH_PRENOTIFICATION_CREATED,
            ACH_PRENOTIFICATION_UPDATED,
            ACH_TRANSFER_CREATED,
            ACH_TRANSFER_UPDATED,
            BOOKKEEPING_ACCOUNT_CREATED,
            BOOKKEEPING_ACCOUNT_UPDATED,
            BOOKKEEPING_ENTRY_SET_UPDATED,
            CARD_CREATED,
            CARD_UPDATED,
            CARD_PAYMENT_CREATED,
            CARD_PAYMENT_UPDATED,
            CARD_PROFILE_CREATED,
            CARD_PROFILE_UPDATED,
            CARD_DISPUTE_CREATED,
            CARD_DISPUTE_UPDATED,
            CHECK_DEPOSIT_CREATED,
            CHECK_DEPOSIT_UPDATED,
            CHECK_TRANSFER_CREATED,
            CHECK_TRANSFER_UPDATED,
            DECLINED_TRANSACTION_CREATED,
            DIGITAL_WALLET_TOKEN_CREATED,
            DIGITAL_WALLET_TOKEN_UPDATED,
            DOCUMENT_CREATED,
            ENTITY_CREATED,
            ENTITY_UPDATED,
            EVENT_SUBSCRIPTION_CREATED,
            EVENT_SUBSCRIPTION_UPDATED,
            EXPORT_CREATED,
            EXPORT_UPDATED,
            EXTERNAL_ACCOUNT_CREATED,
            EXTERNAL_ACCOUNT_UPDATED,
            FILE_CREATED,
            GROUP_UPDATED,
            GROUP_HEARTBEAT,
            INBOUND_ACH_TRANSFER_CREATED,
            INBOUND_ACH_TRANSFER_UPDATED,
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            INTRAFI_EXCLUSION_CREATED,
            INTRAFI_EXCLUSION_UPDATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
            PHYSICAL_CARD_CREATED,
            PHYSICAL_CARD_UPDATED,
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            TRANSACTION_CREATED,
            WIRE_DRAWDOWN_REQUEST_CREATED,
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            WIRE_TRANSFER_CREATED,
            WIRE_TRANSFER_UPDATED,
        }

        enum class Value {
            ACCOUNT_CREATED,
            ACCOUNT_UPDATED,
            ACCOUNT_NUMBER_CREATED,
            ACCOUNT_NUMBER_UPDATED,
            ACCOUNT_STATEMENT_CREATED,
            ACCOUNT_TRANSFER_CREATED,
            ACCOUNT_TRANSFER_UPDATED,
            ACH_PRENOTIFICATION_CREATED,
            ACH_PRENOTIFICATION_UPDATED,
            ACH_TRANSFER_CREATED,
            ACH_TRANSFER_UPDATED,
            BOOKKEEPING_ACCOUNT_CREATED,
            BOOKKEEPING_ACCOUNT_UPDATED,
            BOOKKEEPING_ENTRY_SET_UPDATED,
            CARD_CREATED,
            CARD_UPDATED,
            CARD_PAYMENT_CREATED,
            CARD_PAYMENT_UPDATED,
            CARD_PROFILE_CREATED,
            CARD_PROFILE_UPDATED,
            CARD_DISPUTE_CREATED,
            CARD_DISPUTE_UPDATED,
            CHECK_DEPOSIT_CREATED,
            CHECK_DEPOSIT_UPDATED,
            CHECK_TRANSFER_CREATED,
            CHECK_TRANSFER_UPDATED,
            DECLINED_TRANSACTION_CREATED,
            DIGITAL_WALLET_TOKEN_CREATED,
            DIGITAL_WALLET_TOKEN_UPDATED,
            DOCUMENT_CREATED,
            ENTITY_CREATED,
            ENTITY_UPDATED,
            EVENT_SUBSCRIPTION_CREATED,
            EVENT_SUBSCRIPTION_UPDATED,
            EXPORT_CREATED,
            EXPORT_UPDATED,
            EXTERNAL_ACCOUNT_CREATED,
            EXTERNAL_ACCOUNT_UPDATED,
            FILE_CREATED,
            GROUP_UPDATED,
            GROUP_HEARTBEAT,
            INBOUND_ACH_TRANSFER_CREATED,
            INBOUND_ACH_TRANSFER_UPDATED,
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            INTRAFI_EXCLUSION_CREATED,
            INTRAFI_EXCLUSION_UPDATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
            PHYSICAL_CARD_CREATED,
            PHYSICAL_CARD_UPDATED,
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            TRANSACTION_CREATED,
            WIRE_DRAWDOWN_REQUEST_CREATED,
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            WIRE_TRANSFER_CREATED,
            WIRE_TRANSFER_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_CREATED -> Value.ACCOUNT_CREATED
                ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
                ACCOUNT_NUMBER_CREATED -> Value.ACCOUNT_NUMBER_CREATED
                ACCOUNT_NUMBER_UPDATED -> Value.ACCOUNT_NUMBER_UPDATED
                ACCOUNT_STATEMENT_CREATED -> Value.ACCOUNT_STATEMENT_CREATED
                ACCOUNT_TRANSFER_CREATED -> Value.ACCOUNT_TRANSFER_CREATED
                ACCOUNT_TRANSFER_UPDATED -> Value.ACCOUNT_TRANSFER_UPDATED
                ACH_PRENOTIFICATION_CREATED -> Value.ACH_PRENOTIFICATION_CREATED
                ACH_PRENOTIFICATION_UPDATED -> Value.ACH_PRENOTIFICATION_UPDATED
                ACH_TRANSFER_CREATED -> Value.ACH_TRANSFER_CREATED
                ACH_TRANSFER_UPDATED -> Value.ACH_TRANSFER_UPDATED
                BOOKKEEPING_ACCOUNT_CREATED -> Value.BOOKKEEPING_ACCOUNT_CREATED
                BOOKKEEPING_ACCOUNT_UPDATED -> Value.BOOKKEEPING_ACCOUNT_UPDATED
                BOOKKEEPING_ENTRY_SET_UPDATED -> Value.BOOKKEEPING_ENTRY_SET_UPDATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_UPDATED -> Value.CARD_UPDATED
                CARD_PAYMENT_CREATED -> Value.CARD_PAYMENT_CREATED
                CARD_PAYMENT_UPDATED -> Value.CARD_PAYMENT_UPDATED
                CARD_PROFILE_CREATED -> Value.CARD_PROFILE_CREATED
                CARD_PROFILE_UPDATED -> Value.CARD_PROFILE_UPDATED
                CARD_DISPUTE_CREATED -> Value.CARD_DISPUTE_CREATED
                CARD_DISPUTE_UPDATED -> Value.CARD_DISPUTE_UPDATED
                CHECK_DEPOSIT_CREATED -> Value.CHECK_DEPOSIT_CREATED
                CHECK_DEPOSIT_UPDATED -> Value.CHECK_DEPOSIT_UPDATED
                CHECK_TRANSFER_CREATED -> Value.CHECK_TRANSFER_CREATED
                CHECK_TRANSFER_UPDATED -> Value.CHECK_TRANSFER_UPDATED
                DECLINED_TRANSACTION_CREATED -> Value.DECLINED_TRANSACTION_CREATED
                DIGITAL_WALLET_TOKEN_CREATED -> Value.DIGITAL_WALLET_TOKEN_CREATED
                DIGITAL_WALLET_TOKEN_UPDATED -> Value.DIGITAL_WALLET_TOKEN_UPDATED
                DOCUMENT_CREATED -> Value.DOCUMENT_CREATED
                ENTITY_CREATED -> Value.ENTITY_CREATED
                ENTITY_UPDATED -> Value.ENTITY_UPDATED
                EVENT_SUBSCRIPTION_CREATED -> Value.EVENT_SUBSCRIPTION_CREATED
                EVENT_SUBSCRIPTION_UPDATED -> Value.EVENT_SUBSCRIPTION_UPDATED
                EXPORT_CREATED -> Value.EXPORT_CREATED
                EXPORT_UPDATED -> Value.EXPORT_UPDATED
                EXTERNAL_ACCOUNT_CREATED -> Value.EXTERNAL_ACCOUNT_CREATED
                EXTERNAL_ACCOUNT_UPDATED -> Value.EXTERNAL_ACCOUNT_UPDATED
                FILE_CREATED -> Value.FILE_CREATED
                GROUP_UPDATED -> Value.GROUP_UPDATED
                GROUP_HEARTBEAT -> Value.GROUP_HEARTBEAT
                INBOUND_ACH_TRANSFER_CREATED -> Value.INBOUND_ACH_TRANSFER_CREATED
                INBOUND_ACH_TRANSFER_UPDATED -> Value.INBOUND_ACH_TRANSFER_UPDATED
                INBOUND_ACH_TRANSFER_RETURN_CREATED -> Value.INBOUND_ACH_TRANSFER_RETURN_CREATED
                INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Value.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Value.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Value.INTRAFI_EXCLUSION_UPDATED
                OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_PAYMENTS_TRANSFER_CREATED -> Value.REAL_TIME_PAYMENTS_TRANSFER_CREATED
                REAL_TIME_PAYMENTS_TRANSFER_UPDATED -> Value.REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED ->
                    Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED ->
                    Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED
                TRANSACTION_CREATED -> Value.TRANSACTION_CREATED
                WIRE_DRAWDOWN_REQUEST_CREATED -> Value.WIRE_DRAWDOWN_REQUEST_CREATED
                WIRE_DRAWDOWN_REQUEST_UPDATED -> Value.WIRE_DRAWDOWN_REQUEST_UPDATED
                WIRE_TRANSFER_CREATED -> Value.WIRE_TRANSFER_CREATED
                WIRE_TRANSFER_UPDATED -> Value.WIRE_TRANSFER_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_CREATED -> Known.ACCOUNT_CREATED
                ACCOUNT_UPDATED -> Known.ACCOUNT_UPDATED
                ACCOUNT_NUMBER_CREATED -> Known.ACCOUNT_NUMBER_CREATED
                ACCOUNT_NUMBER_UPDATED -> Known.ACCOUNT_NUMBER_UPDATED
                ACCOUNT_STATEMENT_CREATED -> Known.ACCOUNT_STATEMENT_CREATED
                ACCOUNT_TRANSFER_CREATED -> Known.ACCOUNT_TRANSFER_CREATED
                ACCOUNT_TRANSFER_UPDATED -> Known.ACCOUNT_TRANSFER_UPDATED
                ACH_PRENOTIFICATION_CREATED -> Known.ACH_PRENOTIFICATION_CREATED
                ACH_PRENOTIFICATION_UPDATED -> Known.ACH_PRENOTIFICATION_UPDATED
                ACH_TRANSFER_CREATED -> Known.ACH_TRANSFER_CREATED
                ACH_TRANSFER_UPDATED -> Known.ACH_TRANSFER_UPDATED
                BOOKKEEPING_ACCOUNT_CREATED -> Known.BOOKKEEPING_ACCOUNT_CREATED
                BOOKKEEPING_ACCOUNT_UPDATED -> Known.BOOKKEEPING_ACCOUNT_UPDATED
                BOOKKEEPING_ENTRY_SET_UPDATED -> Known.BOOKKEEPING_ENTRY_SET_UPDATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_UPDATED -> Known.CARD_UPDATED
                CARD_PAYMENT_CREATED -> Known.CARD_PAYMENT_CREATED
                CARD_PAYMENT_UPDATED -> Known.CARD_PAYMENT_UPDATED
                CARD_PROFILE_CREATED -> Known.CARD_PROFILE_CREATED
                CARD_PROFILE_UPDATED -> Known.CARD_PROFILE_UPDATED
                CARD_DISPUTE_CREATED -> Known.CARD_DISPUTE_CREATED
                CARD_DISPUTE_UPDATED -> Known.CARD_DISPUTE_UPDATED
                CHECK_DEPOSIT_CREATED -> Known.CHECK_DEPOSIT_CREATED
                CHECK_DEPOSIT_UPDATED -> Known.CHECK_DEPOSIT_UPDATED
                CHECK_TRANSFER_CREATED -> Known.CHECK_TRANSFER_CREATED
                CHECK_TRANSFER_UPDATED -> Known.CHECK_TRANSFER_UPDATED
                DECLINED_TRANSACTION_CREATED -> Known.DECLINED_TRANSACTION_CREATED
                DIGITAL_WALLET_TOKEN_CREATED -> Known.DIGITAL_WALLET_TOKEN_CREATED
                DIGITAL_WALLET_TOKEN_UPDATED -> Known.DIGITAL_WALLET_TOKEN_UPDATED
                DOCUMENT_CREATED -> Known.DOCUMENT_CREATED
                ENTITY_CREATED -> Known.ENTITY_CREATED
                ENTITY_UPDATED -> Known.ENTITY_UPDATED
                EVENT_SUBSCRIPTION_CREATED -> Known.EVENT_SUBSCRIPTION_CREATED
                EVENT_SUBSCRIPTION_UPDATED -> Known.EVENT_SUBSCRIPTION_UPDATED
                EXPORT_CREATED -> Known.EXPORT_CREATED
                EXPORT_UPDATED -> Known.EXPORT_UPDATED
                EXTERNAL_ACCOUNT_CREATED -> Known.EXTERNAL_ACCOUNT_CREATED
                EXTERNAL_ACCOUNT_UPDATED -> Known.EXTERNAL_ACCOUNT_UPDATED
                FILE_CREATED -> Known.FILE_CREATED
                GROUP_UPDATED -> Known.GROUP_UPDATED
                GROUP_HEARTBEAT -> Known.GROUP_HEARTBEAT
                INBOUND_ACH_TRANSFER_CREATED -> Known.INBOUND_ACH_TRANSFER_CREATED
                INBOUND_ACH_TRANSFER_UPDATED -> Known.INBOUND_ACH_TRANSFER_UPDATED
                INBOUND_ACH_TRANSFER_RETURN_CREATED -> Known.INBOUND_ACH_TRANSFER_RETURN_CREATED
                INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Known.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Known.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Known.INTRAFI_EXCLUSION_UPDATED
                OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_PAYMENTS_TRANSFER_CREATED -> Known.REAL_TIME_PAYMENTS_TRANSFER_CREATED
                REAL_TIME_PAYMENTS_TRANSFER_UPDATED -> Known.REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED ->
                    Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED ->
                    Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED
                TRANSACTION_CREATED -> Known.TRANSACTION_CREATED
                WIRE_DRAWDOWN_REQUEST_CREATED -> Known.WIRE_DRAWDOWN_REQUEST_CREATED
                WIRE_DRAWDOWN_REQUEST_UPDATED -> Known.WIRE_DRAWDOWN_REQUEST_UPDATED
                WIRE_TRANSFER_CREATED -> Known.WIRE_TRANSFER_CREATED
                WIRE_TRANSFER_UPDATED -> Known.WIRE_TRANSFER_UPDATED
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EVENT = Type(JsonField.of("event"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EVENT,
        }

        enum class Value {
            EVENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EVENT -> Value.EVENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EVENT -> Known.EVENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
