// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class EventListParams
constructor(
    private val associatedObjectId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun associatedObjectId(): String? = associatedObjectId

    fun category(): Category? = category

    fun createdAt(): CreatedAt? = createdAt

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.associatedObjectId?.let { params.put("associated_object_id", listOf(it.toString())) }
        this.category?.forEachQueryParam { key, values -> params.put("category.$key", values) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at.$key", values) }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListParams && this.associatedObjectId == other.associatedObjectId && this.category == other.category && this.createdAt == other.createdAt && this.cursor == other.cursor && this.limit == other.limit && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(associatedObjectId, category, createdAt, cursor, limit, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "EventListParams{associatedObjectId=$associatedObjectId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var associatedObjectId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(eventListParams: EventListParams) = apply {
            this.associatedObjectId = eventListParams.associatedObjectId
            this.category = eventListParams.category
            this.createdAt = eventListParams.createdAt
            this.cursor = eventListParams.cursor
            this.limit = eventListParams.limit
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
        }

        /** Filter Events to those belonging to the object with the provided identifier. */
        fun associatedObjectId(associatedObjectId: String) = apply {
            this.associatedObjectId = associatedObjectId
        }

        fun category(category: Category) = apply { this.category = category }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

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

        fun build(): EventListParams =
            EventListParams(
                associatedObjectId,
                category,
                createdAt,
                cursor,
                limit,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        /**
         * Filter Events for those with the specified category or categories. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(category: Category) = apply {
                this.in_ = category.in_
                additionalProperties(category.additionalProperties)
            }

            /**
             * Filter Events for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Category =
                Category(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is In && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_CREATED = In(JsonField.of("account.created"))

                val ACCOUNT_UPDATED = In(JsonField.of("account.updated"))

                val ACCOUNT_NUMBER_CREATED = In(JsonField.of("account_number.created"))

                val ACCOUNT_NUMBER_UPDATED = In(JsonField.of("account_number.updated"))

                val ACCOUNT_STATEMENT_CREATED = In(JsonField.of("account_statement.created"))

                val ACCOUNT_TRANSFER_CREATED = In(JsonField.of("account_transfer.created"))

                val ACCOUNT_TRANSFER_UPDATED = In(JsonField.of("account_transfer.updated"))

                val ACH_PRENOTIFICATION_CREATED = In(JsonField.of("ach_prenotification.created"))

                val ACH_PRENOTIFICATION_UPDATED = In(JsonField.of("ach_prenotification.updated"))

                val ACH_TRANSFER_CREATED = In(JsonField.of("ach_transfer.created"))

                val ACH_TRANSFER_UPDATED = In(JsonField.of("ach_transfer.updated"))

                val BOOKKEEPING_ACCOUNT_CREATED = In(JsonField.of("bookkeeping_account.created"))

                val BOOKKEEPING_ACCOUNT_UPDATED = In(JsonField.of("bookkeeping_account.updated"))

                val BOOKKEEPING_ENTRY_SET_UPDATED =
                    In(JsonField.of("bookkeeping_entry_set.updated"))

                val CARD_CREATED = In(JsonField.of("card.created"))

                val CARD_UPDATED = In(JsonField.of("card.updated"))

                val CARD_PAYMENT_CREATED = In(JsonField.of("card_payment.created"))

                val CARD_PAYMENT_UPDATED = In(JsonField.of("card_payment.updated"))

                val CARD_PROFILE_CREATED = In(JsonField.of("card_profile.created"))

                val CARD_PROFILE_UPDATED = In(JsonField.of("card_profile.updated"))

                val CARD_DISPUTE_CREATED = In(JsonField.of("card_dispute.created"))

                val CARD_DISPUTE_UPDATED = In(JsonField.of("card_dispute.updated"))

                val CHECK_DEPOSIT_CREATED = In(JsonField.of("check_deposit.created"))

                val CHECK_DEPOSIT_UPDATED = In(JsonField.of("check_deposit.updated"))

                val CHECK_TRANSFER_CREATED = In(JsonField.of("check_transfer.created"))

                val CHECK_TRANSFER_UPDATED = In(JsonField.of("check_transfer.updated"))

                val DECLINED_TRANSACTION_CREATED = In(JsonField.of("declined_transaction.created"))

                val DIGITAL_CARD_PROFILE_CREATED = In(JsonField.of("digital_card_profile.created"))

                val DIGITAL_CARD_PROFILE_UPDATED = In(JsonField.of("digital_card_profile.updated"))

                val DIGITAL_WALLET_TOKEN_CREATED = In(JsonField.of("digital_wallet_token.created"))

                val DIGITAL_WALLET_TOKEN_UPDATED = In(JsonField.of("digital_wallet_token.updated"))

                val DOCUMENT_CREATED = In(JsonField.of("document.created"))

                val ENTITY_CREATED = In(JsonField.of("entity.created"))

                val ENTITY_UPDATED = In(JsonField.of("entity.updated"))

                val EVENT_SUBSCRIPTION_CREATED = In(JsonField.of("event_subscription.created"))

                val EVENT_SUBSCRIPTION_UPDATED = In(JsonField.of("event_subscription.updated"))

                val EXPORT_CREATED = In(JsonField.of("export.created"))

                val EXPORT_UPDATED = In(JsonField.of("export.updated"))

                val EXTERNAL_ACCOUNT_CREATED = In(JsonField.of("external_account.created"))

                val EXTERNAL_ACCOUNT_UPDATED = In(JsonField.of("external_account.updated"))

                val FILE_CREATED = In(JsonField.of("file.created"))

                val GROUP_UPDATED = In(JsonField.of("group.updated"))

                val GROUP_HEARTBEAT = In(JsonField.of("group.heartbeat"))

                val INBOUND_ACH_TRANSFER_CREATED = In(JsonField.of("inbound_ach_transfer.created"))

                val INBOUND_ACH_TRANSFER_UPDATED = In(JsonField.of("inbound_ach_transfer.updated"))

                val INBOUND_ACH_TRANSFER_RETURN_CREATED =
                    In(JsonField.of("inbound_ach_transfer_return.created"))

                val INBOUND_ACH_TRANSFER_RETURN_UPDATED =
                    In(JsonField.of("inbound_ach_transfer_return.updated"))

                val INBOUND_CHECK_DEPOSIT_CREATED =
                    In(JsonField.of("inbound_check_deposit.created"))

                val INBOUND_CHECK_DEPOSIT_UPDATED =
                    In(JsonField.of("inbound_check_deposit.updated"))

                val INBOUND_MAIL_ITEM_CREATED = In(JsonField.of("inbound_mail_item.created"))

                val INBOUND_MAIL_ITEM_UPDATED = In(JsonField.of("inbound_mail_item.updated"))

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                    In(JsonField.of("inbound_real_time_payments_transfer.created"))

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                    In(JsonField.of("inbound_real_time_payments_transfer.updated"))

                val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED =
                    In(JsonField.of("inbound_wire_drawdown_request.created"))

                val INBOUND_WIRE_TRANSFER_CREATED =
                    In(JsonField.of("inbound_wire_transfer.created"))

                val INBOUND_WIRE_TRANSFER_UPDATED =
                    In(JsonField.of("inbound_wire_transfer.updated"))

                val INTRAFI_ACCOUNT_ENROLLMENT_CREATED =
                    In(JsonField.of("intrafi_account_enrollment.created"))

                val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED =
                    In(JsonField.of("intrafi_account_enrollment.updated"))

                val INTRAFI_EXCLUSION_CREATED = In(JsonField.of("intrafi_exclusion.created"))

                val INTRAFI_EXCLUSION_UPDATED = In(JsonField.of("intrafi_exclusion.updated"))

                val LOCKBOX_CREATED = In(JsonField.of("lockbox.created"))

                val LOCKBOX_UPDATED = In(JsonField.of("lockbox.updated"))

                val OAUTH_CONNECTION_CREATED = In(JsonField.of("oauth_connection.created"))

                val OAUTH_CONNECTION_DEACTIVATED = In(JsonField.of("oauth_connection.deactivated"))

                val PENDING_TRANSACTION_CREATED = In(JsonField.of("pending_transaction.created"))

                val PENDING_TRANSACTION_UPDATED = In(JsonField.of("pending_transaction.updated"))

                val PHYSICAL_CARD_CREATED = In(JsonField.of("physical_card.created"))

                val PHYSICAL_CARD_UPDATED = In(JsonField.of("physical_card.updated"))

                val PHYSICAL_CARD_PROFILE_CREATED =
                    In(JsonField.of("physical_card_profile.created"))

                val PHYSICAL_CARD_PROFILE_UPDATED =
                    In(JsonField.of("physical_card_profile.updated"))

                val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                    In(JsonField.of("proof_of_authorization_request.created"))

                val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                    In(JsonField.of("proof_of_authorization_request.updated"))

                val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED =
                    In(JsonField.of("proof_of_authorization_request_submission.created"))

                val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED =
                    In(JsonField.of("proof_of_authorization_request_submission.updated"))

                val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                    In(JsonField.of("real_time_decision.card_authorization_requested"))

                val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                    In(JsonField.of("real_time_decision.digital_wallet_token_requested"))

                val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                    In(JsonField.of("real_time_decision.digital_wallet_authentication_requested"))

                val REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED =
                    In(JsonField.of("real_time_decision.card_authentication_requested"))

                val REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                    In(JsonField.of("real_time_decision.card_authentication_challenge_requested"))

                val REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                    In(JsonField.of("real_time_payments_transfer.created"))

                val REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                    In(JsonField.of("real_time_payments_transfer.updated"))

                val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                    In(JsonField.of("real_time_payments_request_for_payment.created"))

                val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                    In(JsonField.of("real_time_payments_request_for_payment.updated"))

                val TRANSACTION_CREATED = In(JsonField.of("transaction.created"))

                val WIRE_DRAWDOWN_REQUEST_CREATED =
                    In(JsonField.of("wire_drawdown_request.created"))

                val WIRE_DRAWDOWN_REQUEST_UPDATED =
                    In(JsonField.of("wire_drawdown_request.updated"))

                val WIRE_TRANSFER_CREATED = In(JsonField.of("wire_transfer.created"))

                val WIRE_TRANSFER_UPDATED = In(JsonField.of("wire_transfer.updated"))

                fun of(value: String) = In(JsonField.of(value))
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
                    INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED ->
                        Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
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
                    INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED ->
                        Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
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
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && this.in_ == other.in_ && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(in_, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let {
                putParam("after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.before?.let {
                putParam("before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrAfter?.let {
                putParam("on_or_after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrBefore?.let {
                putParam("on_or_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(createdAt: CreatedAt) = apply {
                this.after = createdAt.after
                this.before = createdAt.before
                this.onOrAfter = createdAt.onOrAfter
                this.onOrBefore = createdAt.onOrBefore
                additionalProperties(createdAt.additionalProperties)
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && this.after == other.after && this.before == other.before && this.onOrAfter == other.onOrAfter && this.onOrBefore == other.onOrBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }
}
