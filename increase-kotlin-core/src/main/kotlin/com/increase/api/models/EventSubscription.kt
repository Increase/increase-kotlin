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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Webhooks are event notifications we send to you by HTTPS POST requests. Event Subscriptions are
 * how you configure your application to listen for them. You can create an Event Subscription
 * through your [developer dashboard](https://dashboard.increase.com/developers/webhooks) or the
 * API. For more information, see our [webhooks guide](https://increase.com/documentation/webhooks).
 */
@NoAutoDetect
class EventSubscription
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("oauth_connection_id")
    @ExcludeMissing
    private val oauthConnectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("selected_event_category")
    @ExcludeMissing
    private val selectedEventCategory: JsonField<SelectedEventCategory> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The event subscription identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the event subscription was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * If specified, this subscription will only receive webhooks for Events associated with this
     * OAuth Connection.
     */
    fun oauthConnectionId(): String? = oauthConnectionId.getNullable("oauth_connection_id")

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    fun selectedEventCategory(): SelectedEventCategory? =
        selectedEventCategory.getNullable("selected_event_category")

    /** This indicates if we'll send notifications to this subscription. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    fun type(): Type = type.getRequired("type")

    /** The webhook url where we'll send notifications. */
    fun url(): String = url.getRequired("url")

    /** The event subscription identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The time the event subscription was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * If specified, this subscription will only receive webhooks for Events associated with this
     * OAuth Connection.
     */
    @JsonProperty("oauth_connection_id")
    @ExcludeMissing
    fun _oauthConnectionId(): JsonField<String> = oauthConnectionId

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    @JsonProperty("selected_event_category")
    @ExcludeMissing
    fun _selectedEventCategory(): JsonField<SelectedEventCategory> = selectedEventCategory

    /** This indicates if we'll send notifications to this subscription. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The webhook url where we'll send notifications. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventSubscription = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        idempotencyKey()
        oauthConnectionId()
        selectedEventCategory()
        status()
        type()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var oauthConnectionId: JsonField<String>? = null
        private var selectedEventCategory: JsonField<SelectedEventCategory>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventSubscription: EventSubscription) = apply {
            id = eventSubscription.id
            createdAt = eventSubscription.createdAt
            idempotencyKey = eventSubscription.idempotencyKey
            oauthConnectionId = eventSubscription.oauthConnectionId
            selectedEventCategory = eventSubscription.selectedEventCategory
            status = eventSubscription.status
            type = eventSubscription.type
            url = eventSubscription.url
            additionalProperties = eventSubscription.additionalProperties.toMutableMap()
        }

        /** The event subscription identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The event subscription identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the event subscription was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the event subscription was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If specified, this subscription will only receive webhooks for Events associated with
         * this OAuth Connection.
         */
        fun oauthConnectionId(oauthConnectionId: String?) =
            oauthConnectionId(JsonField.ofNullable(oauthConnectionId))

        /**
         * If specified, this subscription will only receive webhooks for Events associated with
         * this OAuth Connection.
         */
        fun oauthConnectionId(oauthConnectionId: JsonField<String>) = apply {
            this.oauthConnectionId = oauthConnectionId
        }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: SelectedEventCategory?) =
            selectedEventCategory(JsonField.ofNullable(selectedEventCategory))

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: JsonField<SelectedEventCategory>) = apply {
            this.selectedEventCategory = selectedEventCategory
        }

        /** This indicates if we'll send notifications to this subscription. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if we'll send notifications to this subscription. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `event_subscription`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `event_subscription`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The webhook url where we'll send notifications. */
        fun url(url: String) = url(JsonField.of(url))

        /** The webhook url where we'll send notifications. */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): EventSubscription =
            EventSubscription(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("oauthConnectionId", oauthConnectionId),
                checkRequired("selectedEventCategory", selectedEventCategory),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("url", url),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    class SelectedEventCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** Occurs whenever an Account is created. */
            val ACCOUNT_CREATED = of("account.created")

            /** Occurs whenever an Account is updated. */
            val ACCOUNT_UPDATED = of("account.updated")

            /** Occurs whenever an Account Number is created. */
            val ACCOUNT_NUMBER_CREATED = of("account_number.created")

            /** Occurs whenever an Account Number is updated. */
            val ACCOUNT_NUMBER_UPDATED = of("account_number.updated")

            /** Occurs whenever an Account Statement is created. */
            val ACCOUNT_STATEMENT_CREATED = of("account_statement.created")

            /** Occurs whenever an Account Transfer is created. */
            val ACCOUNT_TRANSFER_CREATED = of("account_transfer.created")

            /** Occurs whenever an Account Transfer is updated. */
            val ACCOUNT_TRANSFER_UPDATED = of("account_transfer.updated")

            /** Occurs whenever an ACH Prenotification is created. */
            val ACH_PRENOTIFICATION_CREATED = of("ach_prenotification.created")

            /** Occurs whenever an ACH Prenotification is updated. */
            val ACH_PRENOTIFICATION_UPDATED = of("ach_prenotification.updated")

            /** Occurs whenever an ACH Transfer is created. */
            val ACH_TRANSFER_CREATED = of("ach_transfer.created")

            /** Occurs whenever an ACH Transfer is updated. */
            val ACH_TRANSFER_UPDATED = of("ach_transfer.updated")

            /** Occurs whenever a Bookkeeping Account is created. */
            val BOOKKEEPING_ACCOUNT_CREATED = of("bookkeeping_account.created")

            /** Occurs whenever a Bookkeeping Account is updated. */
            val BOOKKEEPING_ACCOUNT_UPDATED = of("bookkeeping_account.updated")

            /** Occurs whenever a Bookkeeping Entry Set is created. */
            val BOOKKEEPING_ENTRY_SET_UPDATED = of("bookkeeping_entry_set.updated")

            /** Occurs whenever a Card is created. */
            val CARD_CREATED = of("card.created")

            /** Occurs whenever a Card is updated. */
            val CARD_UPDATED = of("card.updated")

            /** Occurs whenever a Card Payment is created. */
            val CARD_PAYMENT_CREATED = of("card_payment.created")

            /** Occurs whenever a Card Payment is updated. */
            val CARD_PAYMENT_UPDATED = of("card_payment.updated")

            /** Occurs whenever a Card Profile is created. */
            val CARD_PROFILE_CREATED = of("card_profile.created")

            /** Occurs whenever a Card Profile is updated. */
            val CARD_PROFILE_UPDATED = of("card_profile.updated")

            /** Occurs whenever a Card Dispute is created. */
            val CARD_DISPUTE_CREATED = of("card_dispute.created")

            /** Occurs whenever a Card Dispute is updated. */
            val CARD_DISPUTE_UPDATED = of("card_dispute.updated")

            /** Occurs whenever a Check Deposit is created. */
            val CHECK_DEPOSIT_CREATED = of("check_deposit.created")

            /** Occurs whenever a Check Deposit is updated. */
            val CHECK_DEPOSIT_UPDATED = of("check_deposit.updated")

            /** Occurs whenever a Check Transfer is created. */
            val CHECK_TRANSFER_CREATED = of("check_transfer.created")

            /** Occurs whenever a Check Transfer is updated. */
            val CHECK_TRANSFER_UPDATED = of("check_transfer.updated")

            /** Occurs whenever a Declined Transaction is created. */
            val DECLINED_TRANSACTION_CREATED = of("declined_transaction.created")

            /** Occurs whenever a Digital Card Profile is created. */
            val DIGITAL_CARD_PROFILE_CREATED = of("digital_card_profile.created")

            /** Occurs whenever a Digital Card Profile is updated. */
            val DIGITAL_CARD_PROFILE_UPDATED = of("digital_card_profile.updated")

            /** Occurs whenever a Digital Wallet Token is created. */
            val DIGITAL_WALLET_TOKEN_CREATED = of("digital_wallet_token.created")

            /** Occurs whenever a Digital Wallet Token is updated. */
            val DIGITAL_WALLET_TOKEN_UPDATED = of("digital_wallet_token.updated")

            /** Occurs whenever a Document is created. */
            val DOCUMENT_CREATED = of("document.created")

            /** Occurs whenever an Entity is created. */
            val ENTITY_CREATED = of("entity.created")

            /** Occurs whenever an Entity is updated. */
            val ENTITY_UPDATED = of("entity.updated")

            /** Occurs whenever an Event Subscription is created. */
            val EVENT_SUBSCRIPTION_CREATED = of("event_subscription.created")

            /** Occurs whenever an Event Subscription is updated. */
            val EVENT_SUBSCRIPTION_UPDATED = of("event_subscription.updated")

            /** Occurs whenever an Export is created. */
            val EXPORT_CREATED = of("export.created")

            /** Occurs whenever an Export is updated. */
            val EXPORT_UPDATED = of("export.updated")

            /** Occurs whenever an External Account is created. */
            val EXTERNAL_ACCOUNT_CREATED = of("external_account.created")

            /** Occurs whenever an External Account is updated. */
            val EXTERNAL_ACCOUNT_UPDATED = of("external_account.updated")

            /** Occurs whenever a File is created. */
            val FILE_CREATED = of("file.created")

            /** Occurs whenever a Group is updated. */
            val GROUP_UPDATED = of("group.updated")

            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            val GROUP_HEARTBEAT = of("group.heartbeat")

            /** Occurs whenever an Inbound ACH Transfer is created. */
            val INBOUND_ACH_TRANSFER_CREATED = of("inbound_ach_transfer.created")

            /** Occurs whenever an Inbound ACH Transfer is updated. */
            val INBOUND_ACH_TRANSFER_UPDATED = of("inbound_ach_transfer.updated")

            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            val INBOUND_ACH_TRANSFER_RETURN_CREATED = of("inbound_ach_transfer_return.created")

            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            val INBOUND_ACH_TRANSFER_RETURN_UPDATED = of("inbound_ach_transfer_return.updated")

            /** Occurs whenever an Inbound Check Deposit is created. */
            val INBOUND_CHECK_DEPOSIT_CREATED = of("inbound_check_deposit.created")

            /** Occurs whenever an Inbound Check Deposit is updated. */
            val INBOUND_CHECK_DEPOSIT_UPDATED = of("inbound_check_deposit.updated")

            /** Occurs whenever an Inbound Mail Item is created. */
            val INBOUND_MAIL_ITEM_CREATED = of("inbound_mail_item.created")

            /** Occurs whenever an Inbound Mail Item is updated. */
            val INBOUND_MAIL_ITEM_UPDATED = of("inbound_mail_item.updated")

            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                of("inbound_real_time_payments_transfer.created")

            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                of("inbound_real_time_payments_transfer.updated")

            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED = of("inbound_wire_drawdown_request.created")

            /** Occurs whenever an Inbound Wire Transfer is created. */
            val INBOUND_WIRE_TRANSFER_CREATED = of("inbound_wire_transfer.created")

            /** Occurs whenever an Inbound Wire Transfer is updated. */
            val INBOUND_WIRE_TRANSFER_UPDATED = of("inbound_wire_transfer.updated")

            /** Occurs whenever an IntraFi Account Enrollment is created. */
            val INTRAFI_ACCOUNT_ENROLLMENT_CREATED = of("intrafi_account_enrollment.created")

            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED = of("intrafi_account_enrollment.updated")

            /** Occurs whenever an IntraFi Exclusion is created. */
            val INTRAFI_EXCLUSION_CREATED = of("intrafi_exclusion.created")

            /** Occurs whenever an IntraFi Exclusion is updated. */
            val INTRAFI_EXCLUSION_UPDATED = of("intrafi_exclusion.updated")

            /** Occurs whenever a Lockbox is created. */
            val LOCKBOX_CREATED = of("lockbox.created")

            /** Occurs whenever a Lockbox is updated. */
            val LOCKBOX_UPDATED = of("lockbox.updated")

            /** Occurs whenever an OAuth Connection is created. */
            val OAUTH_CONNECTION_CREATED = of("oauth_connection.created")

            /** Occurs whenever an OAuth Connection is deactivated. */
            val OAUTH_CONNECTION_DEACTIVATED = of("oauth_connection.deactivated")

            /** Occurs whenever a Pending Transaction is created. */
            val PENDING_TRANSACTION_CREATED = of("pending_transaction.created")

            /** Occurs whenever a Pending Transaction is updated. */
            val PENDING_TRANSACTION_UPDATED = of("pending_transaction.updated")

            /** Occurs whenever a Physical Card is created. */
            val PHYSICAL_CARD_CREATED = of("physical_card.created")

            /** Occurs whenever a Physical Card is updated. */
            val PHYSICAL_CARD_UPDATED = of("physical_card.updated")

            /** Occurs whenever a Physical Card Profile is created. */
            val PHYSICAL_CARD_PROFILE_CREATED = of("physical_card_profile.created")

            /** Occurs whenever a Physical Card Profile is updated. */
            val PHYSICAL_CARD_PROFILE_UPDATED = of("physical_card_profile.updated")

            /** Occurs whenever a Proof of Authorization Request is created. */
            val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                of("proof_of_authorization_request.created")

            /** Occurs whenever a Proof of Authorization Request is updated. */
            val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                of("proof_of_authorization_request.updated")

            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED =
                of("proof_of_authorization_request_submission.created")

            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED =
                of("proof_of_authorization_request_submission.updated")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                of("real_time_decision.card_authorization_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                of("real_time_decision.digital_wallet_token_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                of("real_time_decision.digital_wallet_authentication_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            val REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED =
                of("real_time_decision.card_authentication_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            val REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                of("real_time_decision.card_authentication_challenge_requested")

            /** Occurs whenever a Real-Time Payments Transfer is created. */
            val REAL_TIME_PAYMENTS_TRANSFER_CREATED = of("real_time_payments_transfer.created")

            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            val REAL_TIME_PAYMENTS_TRANSFER_UPDATED = of("real_time_payments_transfer.updated")

            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                of("real_time_payments_request_for_payment.created")

            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                of("real_time_payments_request_for_payment.updated")

            /** Occurs whenever a Transaction is created. */
            val TRANSACTION_CREATED = of("transaction.created")

            /** Occurs whenever a Wire Drawdown Request is created. */
            val WIRE_DRAWDOWN_REQUEST_CREATED = of("wire_drawdown_request.created")

            /** Occurs whenever a Wire Drawdown Request is updated. */
            val WIRE_DRAWDOWN_REQUEST_UPDATED = of("wire_drawdown_request.updated")

            /** Occurs whenever a Wire Transfer is created. */
            val WIRE_TRANSFER_CREATED = of("wire_transfer.created")

            /** Occurs whenever a Wire Transfer is updated. */
            val WIRE_TRANSFER_UPDATED = of("wire_transfer.updated")

            fun of(value: String) = SelectedEventCategory(JsonField.of(value))
        }

        enum class Known {
            /** Occurs whenever an Account is created. */
            ACCOUNT_CREATED,
            /** Occurs whenever an Account is updated. */
            ACCOUNT_UPDATED,
            /** Occurs whenever an Account Number is created. */
            ACCOUNT_NUMBER_CREATED,
            /** Occurs whenever an Account Number is updated. */
            ACCOUNT_NUMBER_UPDATED,
            /** Occurs whenever an Account Statement is created. */
            ACCOUNT_STATEMENT_CREATED,
            /** Occurs whenever an Account Transfer is created. */
            ACCOUNT_TRANSFER_CREATED,
            /** Occurs whenever an Account Transfer is updated. */
            ACCOUNT_TRANSFER_UPDATED,
            /** Occurs whenever an ACH Prenotification is created. */
            ACH_PRENOTIFICATION_CREATED,
            /** Occurs whenever an ACH Prenotification is updated. */
            ACH_PRENOTIFICATION_UPDATED,
            /** Occurs whenever an ACH Transfer is created. */
            ACH_TRANSFER_CREATED,
            /** Occurs whenever an ACH Transfer is updated. */
            ACH_TRANSFER_UPDATED,
            /** Occurs whenever a Bookkeeping Account is created. */
            BOOKKEEPING_ACCOUNT_CREATED,
            /** Occurs whenever a Bookkeeping Account is updated. */
            BOOKKEEPING_ACCOUNT_UPDATED,
            /** Occurs whenever a Bookkeeping Entry Set is created. */
            BOOKKEEPING_ENTRY_SET_UPDATED,
            /** Occurs whenever a Card is created. */
            CARD_CREATED,
            /** Occurs whenever a Card is updated. */
            CARD_UPDATED,
            /** Occurs whenever a Card Payment is created. */
            CARD_PAYMENT_CREATED,
            /** Occurs whenever a Card Payment is updated. */
            CARD_PAYMENT_UPDATED,
            /** Occurs whenever a Card Profile is created. */
            CARD_PROFILE_CREATED,
            /** Occurs whenever a Card Profile is updated. */
            CARD_PROFILE_UPDATED,
            /** Occurs whenever a Card Dispute is created. */
            CARD_DISPUTE_CREATED,
            /** Occurs whenever a Card Dispute is updated. */
            CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Check Deposit is created. */
            CHECK_DEPOSIT_CREATED,
            /** Occurs whenever a Check Deposit is updated. */
            CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever a Check Transfer is created. */
            CHECK_TRANSFER_CREATED,
            /** Occurs whenever a Check Transfer is updated. */
            CHECK_TRANSFER_UPDATED,
            /** Occurs whenever a Declined Transaction is created. */
            DECLINED_TRANSACTION_CREATED,
            /** Occurs whenever a Digital Card Profile is created. */
            DIGITAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Digital Card Profile is updated. */
            DIGITAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Digital Wallet Token is created. */
            DIGITAL_WALLET_TOKEN_CREATED,
            /** Occurs whenever a Digital Wallet Token is updated. */
            DIGITAL_WALLET_TOKEN_UPDATED,
            /** Occurs whenever a Document is created. */
            DOCUMENT_CREATED,
            /** Occurs whenever an Entity is created. */
            ENTITY_CREATED,
            /** Occurs whenever an Entity is updated. */
            ENTITY_UPDATED,
            /** Occurs whenever an Event Subscription is created. */
            EVENT_SUBSCRIPTION_CREATED,
            /** Occurs whenever an Event Subscription is updated. */
            EVENT_SUBSCRIPTION_UPDATED,
            /** Occurs whenever an Export is created. */
            EXPORT_CREATED,
            /** Occurs whenever an Export is updated. */
            EXPORT_UPDATED,
            /** Occurs whenever an External Account is created. */
            EXTERNAL_ACCOUNT_CREATED,
            /** Occurs whenever an External Account is updated. */
            EXTERNAL_ACCOUNT_UPDATED,
            /** Occurs whenever a File is created. */
            FILE_CREATED,
            /** Occurs whenever a Group is updated. */
            GROUP_UPDATED,
            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            GROUP_HEARTBEAT,
            /** Occurs whenever an Inbound ACH Transfer is created. */
            INBOUND_ACH_TRANSFER_CREATED,
            /** Occurs whenever an Inbound ACH Transfer is updated. */
            INBOUND_ACH_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            /** Occurs whenever an Inbound Check Deposit is created. */
            INBOUND_CHECK_DEPOSIT_CREATED,
            /** Occurs whenever an Inbound Check Deposit is updated. */
            INBOUND_CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever an Inbound Mail Item is created. */
            INBOUND_MAIL_ITEM_CREATED,
            /** Occurs whenever an Inbound Mail Item is updated. */
            INBOUND_MAIL_ITEM_UPDATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is created. */
            INBOUND_WIRE_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is updated. */
            INBOUND_WIRE_TRANSFER_UPDATED,
            /** Occurs whenever an IntraFi Account Enrollment is created. */
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            /** Occurs whenever an IntraFi Exclusion is created. */
            INTRAFI_EXCLUSION_CREATED,
            /** Occurs whenever an IntraFi Exclusion is updated. */
            INTRAFI_EXCLUSION_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Pending Transaction is created. */
            PENDING_TRANSACTION_CREATED,
            /** Occurs whenever a Pending Transaction is updated. */
            PENDING_TRANSACTION_UPDATED,
            /** Occurs whenever a Physical Card is created. */
            PHYSICAL_CARD_CREATED,
            /** Occurs whenever a Physical Card is updated. */
            PHYSICAL_CARD_UPDATED,
            /** Occurs whenever a Physical Card Profile is created. */
            PHYSICAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Physical Card Profile is updated. */
            PHYSICAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** Occurs whenever a Real-Time Payments Transfer is created. */
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            /** Occurs whenever a Transaction is created. */
            TRANSACTION_CREATED,
            /** Occurs whenever a Wire Drawdown Request is created. */
            WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever a Wire Drawdown Request is updated. */
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            /** Occurs whenever a Wire Transfer is created. */
            WIRE_TRANSFER_CREATED,
            /** Occurs whenever a Wire Transfer is updated. */
            WIRE_TRANSFER_UPDATED,
        }

        enum class Value {
            /** Occurs whenever an Account is created. */
            ACCOUNT_CREATED,
            /** Occurs whenever an Account is updated. */
            ACCOUNT_UPDATED,
            /** Occurs whenever an Account Number is created. */
            ACCOUNT_NUMBER_CREATED,
            /** Occurs whenever an Account Number is updated. */
            ACCOUNT_NUMBER_UPDATED,
            /** Occurs whenever an Account Statement is created. */
            ACCOUNT_STATEMENT_CREATED,
            /** Occurs whenever an Account Transfer is created. */
            ACCOUNT_TRANSFER_CREATED,
            /** Occurs whenever an Account Transfer is updated. */
            ACCOUNT_TRANSFER_UPDATED,
            /** Occurs whenever an ACH Prenotification is created. */
            ACH_PRENOTIFICATION_CREATED,
            /** Occurs whenever an ACH Prenotification is updated. */
            ACH_PRENOTIFICATION_UPDATED,
            /** Occurs whenever an ACH Transfer is created. */
            ACH_TRANSFER_CREATED,
            /** Occurs whenever an ACH Transfer is updated. */
            ACH_TRANSFER_UPDATED,
            /** Occurs whenever a Bookkeeping Account is created. */
            BOOKKEEPING_ACCOUNT_CREATED,
            /** Occurs whenever a Bookkeeping Account is updated. */
            BOOKKEEPING_ACCOUNT_UPDATED,
            /** Occurs whenever a Bookkeeping Entry Set is created. */
            BOOKKEEPING_ENTRY_SET_UPDATED,
            /** Occurs whenever a Card is created. */
            CARD_CREATED,
            /** Occurs whenever a Card is updated. */
            CARD_UPDATED,
            /** Occurs whenever a Card Payment is created. */
            CARD_PAYMENT_CREATED,
            /** Occurs whenever a Card Payment is updated. */
            CARD_PAYMENT_UPDATED,
            /** Occurs whenever a Card Profile is created. */
            CARD_PROFILE_CREATED,
            /** Occurs whenever a Card Profile is updated. */
            CARD_PROFILE_UPDATED,
            /** Occurs whenever a Card Dispute is created. */
            CARD_DISPUTE_CREATED,
            /** Occurs whenever a Card Dispute is updated. */
            CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Check Deposit is created. */
            CHECK_DEPOSIT_CREATED,
            /** Occurs whenever a Check Deposit is updated. */
            CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever a Check Transfer is created. */
            CHECK_TRANSFER_CREATED,
            /** Occurs whenever a Check Transfer is updated. */
            CHECK_TRANSFER_UPDATED,
            /** Occurs whenever a Declined Transaction is created. */
            DECLINED_TRANSACTION_CREATED,
            /** Occurs whenever a Digital Card Profile is created. */
            DIGITAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Digital Card Profile is updated. */
            DIGITAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Digital Wallet Token is created. */
            DIGITAL_WALLET_TOKEN_CREATED,
            /** Occurs whenever a Digital Wallet Token is updated. */
            DIGITAL_WALLET_TOKEN_UPDATED,
            /** Occurs whenever a Document is created. */
            DOCUMENT_CREATED,
            /** Occurs whenever an Entity is created. */
            ENTITY_CREATED,
            /** Occurs whenever an Entity is updated. */
            ENTITY_UPDATED,
            /** Occurs whenever an Event Subscription is created. */
            EVENT_SUBSCRIPTION_CREATED,
            /** Occurs whenever an Event Subscription is updated. */
            EVENT_SUBSCRIPTION_UPDATED,
            /** Occurs whenever an Export is created. */
            EXPORT_CREATED,
            /** Occurs whenever an Export is updated. */
            EXPORT_UPDATED,
            /** Occurs whenever an External Account is created. */
            EXTERNAL_ACCOUNT_CREATED,
            /** Occurs whenever an External Account is updated. */
            EXTERNAL_ACCOUNT_UPDATED,
            /** Occurs whenever a File is created. */
            FILE_CREATED,
            /** Occurs whenever a Group is updated. */
            GROUP_UPDATED,
            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            GROUP_HEARTBEAT,
            /** Occurs whenever an Inbound ACH Transfer is created. */
            INBOUND_ACH_TRANSFER_CREATED,
            /** Occurs whenever an Inbound ACH Transfer is updated. */
            INBOUND_ACH_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            /** Occurs whenever an Inbound Check Deposit is created. */
            INBOUND_CHECK_DEPOSIT_CREATED,
            /** Occurs whenever an Inbound Check Deposit is updated. */
            INBOUND_CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever an Inbound Mail Item is created. */
            INBOUND_MAIL_ITEM_CREATED,
            /** Occurs whenever an Inbound Mail Item is updated. */
            INBOUND_MAIL_ITEM_UPDATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is created. */
            INBOUND_WIRE_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is updated. */
            INBOUND_WIRE_TRANSFER_UPDATED,
            /** Occurs whenever an IntraFi Account Enrollment is created. */
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            /** Occurs whenever an IntraFi Exclusion is created. */
            INTRAFI_EXCLUSION_CREATED,
            /** Occurs whenever an IntraFi Exclusion is updated. */
            INTRAFI_EXCLUSION_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Pending Transaction is created. */
            PENDING_TRANSACTION_CREATED,
            /** Occurs whenever a Pending Transaction is updated. */
            PENDING_TRANSACTION_UPDATED,
            /** Occurs whenever a Physical Card is created. */
            PHYSICAL_CARD_CREATED,
            /** Occurs whenever a Physical Card is updated. */
            PHYSICAL_CARD_UPDATED,
            /** Occurs whenever a Physical Card Profile is created. */
            PHYSICAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Physical Card Profile is updated. */
            PHYSICAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** Occurs whenever a Real-Time Payments Transfer is created. */
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            /** Occurs whenever a Transaction is created. */
            TRANSACTION_CREATED,
            /** Occurs whenever a Wire Drawdown Request is created. */
            WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever a Wire Drawdown Request is updated. */
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            /** Occurs whenever a Wire Transfer is created. */
            WIRE_TRANSFER_CREATED,
            /** Occurs whenever a Wire Transfer is updated. */
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
                else -> throw IncreaseInvalidDataException("Unknown SelectedEventCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SelectedEventCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** This indicates if we'll send notifications to this subscription. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The subscription is active and Events will be delivered normally. */
            val ACTIVE = of("active")

            /** The subscription is temporarily disabled and Events will not be delivered. */
            val DISABLED = of("disabled")

            /** The subscription is permanently disabled and Events will not be delivered. */
            val DELETED = of("deleted")

            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            val REQUIRES_ATTENTION = of("requires_attention")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** The subscription is active and Events will be delivered normally. */
            ACTIVE,
            /** The subscription is temporarily disabled and Events will not be delivered. */
            DISABLED,
            /** The subscription is permanently disabled and Events will not be delivered. */
            DELETED,
            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            REQUIRES_ATTENTION,
        }

        enum class Value {
            /** The subscription is active and Events will be delivered normally. */
            ACTIVE,
            /** The subscription is temporarily disabled and Events will not be delivered. */
            DISABLED,
            /** The subscription is permanently disabled and Events will not be delivered. */
            DELETED,
            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                DELETED -> Value.DELETED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                DELETED -> Known.DELETED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
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

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EVENT_SUBSCRIPTION = of("event_subscription")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EVENT_SUBSCRIPTION,
        }

        enum class Value {
            EVENT_SUBSCRIPTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EVENT_SUBSCRIPTION -> Value.EVENT_SUBSCRIPTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EVENT_SUBSCRIPTION -> Known.EVENT_SUBSCRIPTION
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

        return /* spotless:off */ other is EventSubscription && id == other.id && createdAt == other.createdAt && idempotencyKey == other.idempotencyKey && oauthConnectionId == other.oauthConnectionId && selectedEventCategory == other.selectedEventCategory && status == other.status && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, idempotencyKey, oauthConnectionId, selectedEventCategory, status, type, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventSubscription{id=$id, createdAt=$createdAt, idempotencyKey=$idempotencyKey, oauthConnectionId=$oauthConnectionId, selectedEventCategory=$selectedEventCategory, status=$status, type=$type, url=$url, additionalProperties=$additionalProperties}"
}
