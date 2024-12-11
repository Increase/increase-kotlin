// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
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
                additionalProperties.toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACCOUNT_CREATED = of("account.created")

            val ACCOUNT_UPDATED = of("account.updated")

            val ACCOUNT_NUMBER_CREATED = of("account_number.created")

            val ACCOUNT_NUMBER_UPDATED = of("account_number.updated")

            val ACCOUNT_STATEMENT_CREATED = of("account_statement.created")

            val ACCOUNT_TRANSFER_CREATED = of("account_transfer.created")

            val ACCOUNT_TRANSFER_UPDATED = of("account_transfer.updated")

            val ACH_PRENOTIFICATION_CREATED = of("ach_prenotification.created")

            val ACH_PRENOTIFICATION_UPDATED = of("ach_prenotification.updated")

            val ACH_TRANSFER_CREATED = of("ach_transfer.created")

            val ACH_TRANSFER_UPDATED = of("ach_transfer.updated")

            val BOOKKEEPING_ACCOUNT_CREATED = of("bookkeeping_account.created")

            val BOOKKEEPING_ACCOUNT_UPDATED = of("bookkeeping_account.updated")

            val BOOKKEEPING_ENTRY_SET_UPDATED = of("bookkeeping_entry_set.updated")

            val CARD_CREATED = of("card.created")

            val CARD_UPDATED = of("card.updated")

            val CARD_PAYMENT_CREATED = of("card_payment.created")

            val CARD_PAYMENT_UPDATED = of("card_payment.updated")

            val CARD_PROFILE_CREATED = of("card_profile.created")

            val CARD_PROFILE_UPDATED = of("card_profile.updated")

            val CARD_DISPUTE_CREATED = of("card_dispute.created")

            val CARD_DISPUTE_UPDATED = of("card_dispute.updated")

            val CHECK_DEPOSIT_CREATED = of("check_deposit.created")

            val CHECK_DEPOSIT_UPDATED = of("check_deposit.updated")

            val CHECK_TRANSFER_CREATED = of("check_transfer.created")

            val CHECK_TRANSFER_UPDATED = of("check_transfer.updated")

            val DECLINED_TRANSACTION_CREATED = of("declined_transaction.created")

            val DIGITAL_CARD_PROFILE_CREATED = of("digital_card_profile.created")

            val DIGITAL_CARD_PROFILE_UPDATED = of("digital_card_profile.updated")

            val DIGITAL_WALLET_TOKEN_CREATED = of("digital_wallet_token.created")

            val DIGITAL_WALLET_TOKEN_UPDATED = of("digital_wallet_token.updated")

            val DOCUMENT_CREATED = of("document.created")

            val ENTITY_CREATED = of("entity.created")

            val ENTITY_UPDATED = of("entity.updated")

            val EVENT_SUBSCRIPTION_CREATED = of("event_subscription.created")

            val EVENT_SUBSCRIPTION_UPDATED = of("event_subscription.updated")

            val EXPORT_CREATED = of("export.created")

            val EXPORT_UPDATED = of("export.updated")

            val EXTERNAL_ACCOUNT_CREATED = of("external_account.created")

            val EXTERNAL_ACCOUNT_UPDATED = of("external_account.updated")

            val FILE_CREATED = of("file.created")

            val GROUP_UPDATED = of("group.updated")

            val GROUP_HEARTBEAT = of("group.heartbeat")

            val INBOUND_ACH_TRANSFER_CREATED = of("inbound_ach_transfer.created")

            val INBOUND_ACH_TRANSFER_UPDATED = of("inbound_ach_transfer.updated")

            val INBOUND_ACH_TRANSFER_RETURN_CREATED = of("inbound_ach_transfer_return.created")

            val INBOUND_ACH_TRANSFER_RETURN_UPDATED = of("inbound_ach_transfer_return.updated")

            val INBOUND_CHECK_DEPOSIT_CREATED = of("inbound_check_deposit.created")

            val INBOUND_CHECK_DEPOSIT_UPDATED = of("inbound_check_deposit.updated")

            val INBOUND_MAIL_ITEM_CREATED = of("inbound_mail_item.created")

            val INBOUND_MAIL_ITEM_UPDATED = of("inbound_mail_item.updated")

            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                of("inbound_real_time_payments_transfer.created")

            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                of("inbound_real_time_payments_transfer.updated")

            val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED = of("inbound_wire_drawdown_request.created")

            val INBOUND_WIRE_TRANSFER_CREATED = of("inbound_wire_transfer.created")

            val INBOUND_WIRE_TRANSFER_UPDATED = of("inbound_wire_transfer.updated")

            val INTRAFI_ACCOUNT_ENROLLMENT_CREATED = of("intrafi_account_enrollment.created")

            val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED = of("intrafi_account_enrollment.updated")

            val INTRAFI_EXCLUSION_CREATED = of("intrafi_exclusion.created")

            val INTRAFI_EXCLUSION_UPDATED = of("intrafi_exclusion.updated")

            val LOCKBOX_CREATED = of("lockbox.created")

            val LOCKBOX_UPDATED = of("lockbox.updated")

            val OAUTH_CONNECTION_CREATED = of("oauth_connection.created")

            val OAUTH_CONNECTION_DEACTIVATED = of("oauth_connection.deactivated")

            val PENDING_TRANSACTION_CREATED = of("pending_transaction.created")

            val PENDING_TRANSACTION_UPDATED = of("pending_transaction.updated")

            val PHYSICAL_CARD_CREATED = of("physical_card.created")

            val PHYSICAL_CARD_UPDATED = of("physical_card.updated")

            val PHYSICAL_CARD_PROFILE_CREATED = of("physical_card_profile.created")

            val PHYSICAL_CARD_PROFILE_UPDATED = of("physical_card_profile.updated")

            val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                of("proof_of_authorization_request.created")

            val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                of("proof_of_authorization_request.updated")

            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED =
                of("proof_of_authorization_request_submission.created")

            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED =
                of("proof_of_authorization_request_submission.updated")

            val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                of("real_time_decision.card_authorization_requested")

            val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                of("real_time_decision.digital_wallet_token_requested")

            val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                of("real_time_decision.digital_wallet_authentication_requested")

            val REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED =
                of("real_time_decision.card_authentication_requested")

            val REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                of("real_time_decision.card_authentication_challenge_requested")

            val REAL_TIME_PAYMENTS_TRANSFER_CREATED = of("real_time_payments_transfer.created")

            val REAL_TIME_PAYMENTS_TRANSFER_UPDATED = of("real_time_payments_transfer.updated")

            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                of("real_time_payments_request_for_payment.created")

            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                of("real_time_payments_request_for_payment.updated")

            val TRANSACTION_CREATED = of("transaction.created")

            val WIRE_DRAWDOWN_REQUEST_CREATED = of("wire_drawdown_request.created")

            val WIRE_DRAWDOWN_REQUEST_UPDATED = of("wire_drawdown_request.updated")

            val WIRE_TRANSFER_CREATED = of("wire_transfer.created")

            val WIRE_TRANSFER_UPDATED = of("wire_transfer.updated")

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
            DIGITAL_CARD_PROFILE_CREATED,
            DIGITAL_CARD_PROFILE_UPDATED,
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
            INBOUND_CHECK_DEPOSIT_CREATED,
            INBOUND_CHECK_DEPOSIT_UPDATED,
            INBOUND_MAIL_ITEM_CREATED,
            INBOUND_MAIL_ITEM_UPDATED,
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            INBOUND_WIRE_TRANSFER_CREATED,
            INBOUND_WIRE_TRANSFER_UPDATED,
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            INTRAFI_EXCLUSION_CREATED,
            INTRAFI_EXCLUSION_UPDATED,
            LOCKBOX_CREATED,
            LOCKBOX_UPDATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
            PHYSICAL_CARD_CREATED,
            PHYSICAL_CARD_UPDATED,
            PHYSICAL_CARD_PROFILE_CREATED,
            PHYSICAL_CARD_PROFILE_UPDATED,
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
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
            DIGITAL_CARD_PROFILE_CREATED,
            DIGITAL_CARD_PROFILE_UPDATED,
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
            INBOUND_CHECK_DEPOSIT_CREATED,
            INBOUND_CHECK_DEPOSIT_UPDATED,
            INBOUND_MAIL_ITEM_CREATED,
            INBOUND_MAIL_ITEM_UPDATED,
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            INBOUND_WIRE_TRANSFER_CREATED,
            INBOUND_WIRE_TRANSFER_UPDATED,
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            INTRAFI_EXCLUSION_CREATED,
            INTRAFI_EXCLUSION_UPDATED,
            LOCKBOX_CREATED,
            LOCKBOX_UPDATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
            PHYSICAL_CARD_CREATED,
            PHYSICAL_CARD_UPDATED,
            PHYSICAL_CARD_PROFILE_CREATED,
            PHYSICAL_CARD_PROFILE_UPDATED,
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
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
                DIGITAL_CARD_PROFILE_CREATED -> Value.DIGITAL_CARD_PROFILE_CREATED
                DIGITAL_CARD_PROFILE_UPDATED -> Value.DIGITAL_CARD_PROFILE_UPDATED
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
                INBOUND_CHECK_DEPOSIT_CREATED -> Value.INBOUND_CHECK_DEPOSIT_CREATED
                INBOUND_CHECK_DEPOSIT_UPDATED -> Value.INBOUND_CHECK_DEPOSIT_UPDATED
                INBOUND_MAIL_ITEM_CREATED -> Value.INBOUND_MAIL_ITEM_CREATED
                INBOUND_MAIL_ITEM_UPDATED -> Value.INBOUND_MAIL_ITEM_UPDATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INBOUND_WIRE_TRANSFER_CREATED -> Value.INBOUND_WIRE_TRANSFER_CREATED
                INBOUND_WIRE_TRANSFER_UPDATED -> Value.INBOUND_WIRE_TRANSFER_UPDATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Value.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Value.INTRAFI_EXCLUSION_UPDATED
                LOCKBOX_CREATED -> Value.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Value.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Value.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Value.PHYSICAL_CARD_PROFILE_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED
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
                DIGITAL_CARD_PROFILE_CREATED -> Known.DIGITAL_CARD_PROFILE_CREATED
                DIGITAL_CARD_PROFILE_UPDATED -> Known.DIGITAL_CARD_PROFILE_UPDATED
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
                INBOUND_CHECK_DEPOSIT_CREATED -> Known.INBOUND_CHECK_DEPOSIT_CREATED
                INBOUND_CHECK_DEPOSIT_UPDATED -> Known.INBOUND_CHECK_DEPOSIT_UPDATED
                INBOUND_MAIL_ITEM_CREATED -> Known.INBOUND_MAIL_ITEM_CREATED
                INBOUND_MAIL_ITEM_UPDATED -> Known.INBOUND_MAIL_ITEM_UPDATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INBOUND_WIRE_TRANSFER_CREATED -> Known.INBOUND_WIRE_TRANSFER_CREATED
                INBOUND_WIRE_TRANSFER_UPDATED -> Known.INBOUND_WIRE_TRANSFER_UPDATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Known.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Known.INTRAFI_EXCLUSION_UPDATED
                LOCKBOX_CREATED -> Known.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Known.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Known.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Known.PHYSICAL_CARD_PROFILE_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
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

            val EVENT = of("event")

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

        return /* spotless:off */ other is Event && associatedObjectId == other.associatedObjectId && associatedObjectType == other.associatedObjectType && category == other.category && createdAt == other.createdAt && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(associatedObjectId, associatedObjectType, category, createdAt, id, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{associatedObjectId=$associatedObjectId, associatedObjectType=$associatedObjectType, category=$category, createdAt=$createdAt, id=$id, type=$type, additionalProperties=$additionalProperties}"
}
