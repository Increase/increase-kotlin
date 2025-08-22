// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** List Events */
class EventListParams
private constructor(
    private val associatedObjectId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter Events to those belonging to the object with the provided identifier. */
    fun associatedObjectId(): String? = associatedObjectId

    fun category(): Category? = category

    fun createdAt(): CreatedAt? = createdAt

    /** Return the page of entries after this one. */
    fun cursor(): String? = cursor

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Long? = limit

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): EventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var associatedObjectId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventListParams: EventListParams) = apply {
            associatedObjectId = eventListParams.associatedObjectId
            category = eventListParams.category
            createdAt = eventListParams.createdAt
            cursor = eventListParams.cursor
            limit = eventListParams.limit
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Events to those belonging to the object with the provided identifier. */
        fun associatedObjectId(associatedObjectId: String?) = apply {
            this.associatedObjectId = associatedObjectId
        }

        fun category(category: Category?) = apply { this.category = category }

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

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
         * Returns an immutable instance of [EventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListParams =
            EventListParams(
                associatedObjectId,
                category,
                createdAt,
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                associatedObjectId?.let { put("associated_object_id", it) }
                category?.let {
                    it.in_()?.let { put("category.in", it.joinToString(",") { it.toString() }) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("category.$key", value)
                        }
                    }
                }
                createdAt?.let {
                    it.after()?.let {
                        put("created_at.after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.before()?.let {
                        put("created_at.before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.onOrAfter()?.let {
                        put(
                            "created_at.on_or_after",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.onOrBefore()?.let {
                        put(
                            "created_at.on_or_before",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at.$key", value)
                        }
                    }
                }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Category
    private constructor(private val in_: List<In>?, private val additionalProperties: QueryParams) {

        /**
         * Filter Events for those with the specified category or categories. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Category]. */
            fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var in_: MutableList<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(category: Category) = apply {
                in_ = category.in_?.toMutableList()
                additionalProperties = category.additionalProperties.toBuilder()
            }

            /**
             * Filter Events for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Adds a single [In] to [Builder.in_].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIn(in_: In) = apply {
                this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Category].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Category = Category(in_?.toImmutable(), additionalProperties.build())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
                 * Increase may send webhooks with this category to see if a webhook endpoint is
                 * working properly.
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
                val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED =
                    of("inbound_wire_drawdown_request.created")

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

                /** Occurs whenever a Legacy Card Dispute is created. */
                val LEGACY_CARD_DISPUTE_CREATED = of("legacy_card_dispute.created")

                /** Occurs whenever a Legacy Card Dispute is updated. */
                val LEGACY_CARD_DISPUTE_UPDATED = of("legacy_card_dispute.updated")

                /** Occurs whenever a Lockbox is created. */
                val LOCKBOX_CREATED = of("lockbox.created")

                /** Occurs whenever a Lockbox is updated. */
                val LOCKBOX_UPDATED = of("lockbox.updated")

                /** Occurs whenever an OAuth Connection is created. */
                val OAUTH_CONNECTION_CREATED = of("oauth_connection.created")

                /** Occurs whenever an OAuth Connection is deactivated. */
                val OAUTH_CONNECTION_DEACTIVATED = of("oauth_connection.deactivated")

                /** Occurs whenever a Card Push Transfer is created. */
                val OUTBOUND_CARD_PUSH_TRANSFER_CREATED = of("outbound_card_push_transfer.created")

                /** Occurs whenever a Card Push Transfer is updated. */
                val OUTBOUND_CARD_PUSH_TRANSFER_UPDATED = of("outbound_card_push_transfer.updated")

                /** Occurs whenever a Card Validation is created. */
                val OUTBOUND_CARD_VALIDATION_CREATED = of("outbound_card_validation.created")

                /** Occurs whenever a Card Validation is updated. */
                val OUTBOUND_CARD_VALIDATION_UPDATED = of("outbound_card_validation.updated")

                /** Occurs whenever a Card Push Transfer is created. */
                val CARD_PUSH_TRANSFER_CREATED = of("card_push_transfer.created")

                /** Occurs whenever a Card Push Transfer is updated. */
                val CARD_PUSH_TRANSFER_UPDATED = of("card_push_transfer.updated")

                /** Occurs whenever a Card Validation is created. */
                val CARD_VALIDATION_CREATED = of("card_validation.created")

                /** Occurs whenever a Card Validation is updated. */
                val CARD_VALIDATION_UPDATED = of("card_validation.updated")

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

                /** Occurs whenever a Program is created. */
                val PROGRAM_CREATED = of("program.created")

                /** Occurs whenever a Program is updated. */
                val PROGRAM_UPDATED = of("program.updated")

                /** Occurs whenever a Proof of Authorization Request is created. */
                val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                    of("proof_of_authorization_request.created")

                /** Occurs whenever a Proof of Authorization Request is updated. */
                val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                    of("proof_of_authorization_request.updated")

                /**
                 * Occurs whenever a Real-Time Decision is created in response to a card
                 * authorization.
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
                 * Occurs whenever a Real-Time Decision is created in response to 3DS
                 * authentication.
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

                /** Occurs whenever a Swift Transfer is created. */
                val SWIFT_TRANSFER_CREATED = of("swift_transfer.created")

                /** Occurs whenever a Swift Transfer is updated. */
                val SWIFT_TRANSFER_UPDATED = of("swift_transfer.updated")

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

                fun of(value: String) = In(JsonField.of(value))
            }

            /** An enum containing [In]'s known values. */
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
                 * Increase may send webhooks with this category to see if a webhook endpoint is
                 * working properly.
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
                /** Occurs whenever a Legacy Card Dispute is created. */
                LEGACY_CARD_DISPUTE_CREATED,
                /** Occurs whenever a Legacy Card Dispute is updated. */
                LEGACY_CARD_DISPUTE_UPDATED,
                /** Occurs whenever a Lockbox is created. */
                LOCKBOX_CREATED,
                /** Occurs whenever a Lockbox is updated. */
                LOCKBOX_UPDATED,
                /** Occurs whenever an OAuth Connection is created. */
                OAUTH_CONNECTION_CREATED,
                /** Occurs whenever an OAuth Connection is deactivated. */
                OAUTH_CONNECTION_DEACTIVATED,
                /** Occurs whenever a Card Push Transfer is created. */
                OUTBOUND_CARD_PUSH_TRANSFER_CREATED,
                /** Occurs whenever a Card Push Transfer is updated. */
                OUTBOUND_CARD_PUSH_TRANSFER_UPDATED,
                /** Occurs whenever a Card Validation is created. */
                OUTBOUND_CARD_VALIDATION_CREATED,
                /** Occurs whenever a Card Validation is updated. */
                OUTBOUND_CARD_VALIDATION_UPDATED,
                /** Occurs whenever a Card Push Transfer is created. */
                CARD_PUSH_TRANSFER_CREATED,
                /** Occurs whenever a Card Push Transfer is updated. */
                CARD_PUSH_TRANSFER_UPDATED,
                /** Occurs whenever a Card Validation is created. */
                CARD_VALIDATION_CREATED,
                /** Occurs whenever a Card Validation is updated. */
                CARD_VALIDATION_UPDATED,
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
                /** Occurs whenever a Program is created. */
                PROGRAM_CREATED,
                /** Occurs whenever a Program is updated. */
                PROGRAM_UPDATED,
                /** Occurs whenever a Proof of Authorization Request is created. */
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
                /** Occurs whenever a Proof of Authorization Request is updated. */
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
                /**
                 * Occurs whenever a Real-Time Decision is created in response to a card
                 * authorization.
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
                 * Occurs whenever a Real-Time Decision is created in response to 3DS
                 * authentication.
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
                /** Occurs whenever a Swift Transfer is created. */
                SWIFT_TRANSFER_CREATED,
                /** Occurs whenever a Swift Transfer is updated. */
                SWIFT_TRANSFER_UPDATED,
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

            /**
             * An enum containing [In]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [In] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                 * Increase may send webhooks with this category to see if a webhook endpoint is
                 * working properly.
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
                /** Occurs whenever a Legacy Card Dispute is created. */
                LEGACY_CARD_DISPUTE_CREATED,
                /** Occurs whenever a Legacy Card Dispute is updated. */
                LEGACY_CARD_DISPUTE_UPDATED,
                /** Occurs whenever a Lockbox is created. */
                LOCKBOX_CREATED,
                /** Occurs whenever a Lockbox is updated. */
                LOCKBOX_UPDATED,
                /** Occurs whenever an OAuth Connection is created. */
                OAUTH_CONNECTION_CREATED,
                /** Occurs whenever an OAuth Connection is deactivated. */
                OAUTH_CONNECTION_DEACTIVATED,
                /** Occurs whenever a Card Push Transfer is created. */
                OUTBOUND_CARD_PUSH_TRANSFER_CREATED,
                /** Occurs whenever a Card Push Transfer is updated. */
                OUTBOUND_CARD_PUSH_TRANSFER_UPDATED,
                /** Occurs whenever a Card Validation is created. */
                OUTBOUND_CARD_VALIDATION_CREATED,
                /** Occurs whenever a Card Validation is updated. */
                OUTBOUND_CARD_VALIDATION_UPDATED,
                /** Occurs whenever a Card Push Transfer is created. */
                CARD_PUSH_TRANSFER_CREATED,
                /** Occurs whenever a Card Push Transfer is updated. */
                CARD_PUSH_TRANSFER_UPDATED,
                /** Occurs whenever a Card Validation is created. */
                CARD_VALIDATION_CREATED,
                /** Occurs whenever a Card Validation is updated. */
                CARD_VALIDATION_UPDATED,
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
                /** Occurs whenever a Program is created. */
                PROGRAM_CREATED,
                /** Occurs whenever a Program is updated. */
                PROGRAM_UPDATED,
                /** Occurs whenever a Proof of Authorization Request is created. */
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
                /** Occurs whenever a Proof of Authorization Request is updated. */
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
                /**
                 * Occurs whenever a Real-Time Decision is created in response to a card
                 * authorization.
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
                 * Occurs whenever a Real-Time Decision is created in response to 3DS
                 * authentication.
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
                /** Occurs whenever a Swift Transfer is created. */
                SWIFT_TRANSFER_CREATED,
                /** Occurs whenever a Swift Transfer is updated. */
                SWIFT_TRANSFER_UPDATED,
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
                /** An enum member indicating that [In] was instantiated with an unknown value. */
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
                    LEGACY_CARD_DISPUTE_CREATED -> Value.LEGACY_CARD_DISPUTE_CREATED
                    LEGACY_CARD_DISPUTE_UPDATED -> Value.LEGACY_CARD_DISPUTE_UPDATED
                    LOCKBOX_CREATED -> Value.LOCKBOX_CREATED
                    LOCKBOX_UPDATED -> Value.LOCKBOX_UPDATED
                    OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                    OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                    OUTBOUND_CARD_PUSH_TRANSFER_CREATED -> Value.OUTBOUND_CARD_PUSH_TRANSFER_CREATED
                    OUTBOUND_CARD_PUSH_TRANSFER_UPDATED -> Value.OUTBOUND_CARD_PUSH_TRANSFER_UPDATED
                    OUTBOUND_CARD_VALIDATION_CREATED -> Value.OUTBOUND_CARD_VALIDATION_CREATED
                    OUTBOUND_CARD_VALIDATION_UPDATED -> Value.OUTBOUND_CARD_VALIDATION_UPDATED
                    CARD_PUSH_TRANSFER_CREATED -> Value.CARD_PUSH_TRANSFER_CREATED
                    CARD_PUSH_TRANSFER_UPDATED -> Value.CARD_PUSH_TRANSFER_UPDATED
                    CARD_VALIDATION_CREATED -> Value.CARD_VALIDATION_CREATED
                    CARD_VALIDATION_UPDATED -> Value.CARD_VALIDATION_UPDATED
                    PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                    PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                    PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                    PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                    PHYSICAL_CARD_PROFILE_CREATED -> Value.PHYSICAL_CARD_PROFILE_CREATED
                    PHYSICAL_CARD_PROFILE_UPDATED -> Value.PHYSICAL_CARD_PROFILE_UPDATED
                    PROGRAM_CREATED -> Value.PROGRAM_CREATED
                    PROGRAM_UPDATED -> Value.PROGRAM_UPDATED
                    PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                        Value.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                    PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                        Value.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
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
                    SWIFT_TRANSFER_CREATED -> Value.SWIFT_TRANSFER_CREATED
                    SWIFT_TRANSFER_UPDATED -> Value.SWIFT_TRANSFER_UPDATED
                    TRANSACTION_CREATED -> Value.TRANSACTION_CREATED
                    WIRE_DRAWDOWN_REQUEST_CREATED -> Value.WIRE_DRAWDOWN_REQUEST_CREATED
                    WIRE_DRAWDOWN_REQUEST_UPDATED -> Value.WIRE_DRAWDOWN_REQUEST_UPDATED
                    WIRE_TRANSFER_CREATED -> Value.WIRE_TRANSFER_CREATED
                    WIRE_TRANSFER_UPDATED -> Value.WIRE_TRANSFER_UPDATED
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
                    LEGACY_CARD_DISPUTE_CREATED -> Known.LEGACY_CARD_DISPUTE_CREATED
                    LEGACY_CARD_DISPUTE_UPDATED -> Known.LEGACY_CARD_DISPUTE_UPDATED
                    LOCKBOX_CREATED -> Known.LOCKBOX_CREATED
                    LOCKBOX_UPDATED -> Known.LOCKBOX_UPDATED
                    OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                    OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                    OUTBOUND_CARD_PUSH_TRANSFER_CREATED -> Known.OUTBOUND_CARD_PUSH_TRANSFER_CREATED
                    OUTBOUND_CARD_PUSH_TRANSFER_UPDATED -> Known.OUTBOUND_CARD_PUSH_TRANSFER_UPDATED
                    OUTBOUND_CARD_VALIDATION_CREATED -> Known.OUTBOUND_CARD_VALIDATION_CREATED
                    OUTBOUND_CARD_VALIDATION_UPDATED -> Known.OUTBOUND_CARD_VALIDATION_UPDATED
                    CARD_PUSH_TRANSFER_CREATED -> Known.CARD_PUSH_TRANSFER_CREATED
                    CARD_PUSH_TRANSFER_UPDATED -> Known.CARD_PUSH_TRANSFER_UPDATED
                    CARD_VALIDATION_CREATED -> Known.CARD_VALIDATION_CREATED
                    CARD_VALIDATION_UPDATED -> Known.CARD_VALIDATION_UPDATED
                    PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                    PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                    PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                    PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                    PHYSICAL_CARD_PROFILE_CREATED -> Known.PHYSICAL_CARD_PROFILE_CREATED
                    PHYSICAL_CARD_PROFILE_UPDATED -> Known.PHYSICAL_CARD_PROFILE_UPDATED
                    PROGRAM_CREATED -> Known.PROGRAM_CREATED
                    PROGRAM_UPDATED -> Known.PROGRAM_UPDATED
                    PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                        Known.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                    PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                        Known.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
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
                    SWIFT_TRANSFER_CREATED -> Known.SWIFT_TRANSFER_CREATED
                    SWIFT_TRANSFER_UPDATED -> Known.SWIFT_TRANSFER_UPDATED
                    TRANSACTION_CREATED -> Known.TRANSACTION_CREATED
                    WIRE_DRAWDOWN_REQUEST_CREATED -> Known.WIRE_DRAWDOWN_REQUEST_CREATED
                    WIRE_DRAWDOWN_REQUEST_UPDATED -> Known.WIRE_DRAWDOWN_REQUEST_UPDATED
                    WIRE_TRANSFER_CREATED -> Known.WIRE_TRANSFER_CREATED
                    WIRE_TRANSFER_UPDATED -> Known.WIRE_TRANSFER_UPDATED
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
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

            fun validate(): In = apply {
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

                return other is In && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                in_ == other.in_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"
    }

    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,
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

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(createdAt: CreatedAt) = apply {
                after = createdAt.after
                before = createdAt.before
                onOrAfter = createdAt.onOrAfter
                onOrBefore = createdAt.onOrBefore
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime?) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt =
                CreatedAt(after, before, onOrAfter, onOrBefore, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                after == other.after &&
                before == other.before &&
                onOrAfter == other.onOrAfter &&
                onOrBefore == other.onOrBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            associatedObjectId == other.associatedObjectId &&
            category == other.category &&
            createdAt == other.createdAt &&
            cursor == other.cursor &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            associatedObjectId,
            category,
            createdAt,
            cursor,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventListParams{associatedObjectId=$associatedObjectId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
