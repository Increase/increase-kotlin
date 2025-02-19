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
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Return an Inbound ACH Transfer */
class InboundAchTransferTransferReturnParams
private constructor(
    private val inboundAchTransferId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Inbound ACH Transfer to return to the originating financial
     * institution.
     */
    fun inboundAchTransferId(): String = inboundAchTransferId

    /**
     * The reason why this transfer will be returned. The most usual return codes are
     * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
     */
    fun reason(): Reason = body.reason()

    /**
     * The reason why this transfer will be returned. The most usual return codes are
     * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
     */
    fun _reason(): JsonField<Reason> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundAchTransferId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                reason = body.reason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The reason why this transfer will be returned. The most usual return codes are
             * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
             */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * The reason why this transfer will be returned. The most usual return codes are
             * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            fun build(): Body =
                Body(checkRequired("reason", reason), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferTransferReturnParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var inboundAchTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            inboundAchTransferTransferReturnParams: InboundAchTransferTransferReturnParams
        ) = apply {
            inboundAchTransferId = inboundAchTransferTransferReturnParams.inboundAchTransferId
            body = inboundAchTransferTransferReturnParams.body.toBuilder()
            additionalHeaders = inboundAchTransferTransferReturnParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inboundAchTransferTransferReturnParams.additionalQueryParams.toBuilder()
        }

        /**
         * The identifier of the Inbound ACH Transfer to return to the originating financial
         * institution.
         */
        fun inboundAchTransferId(inboundAchTransferId: String) = apply {
            this.inboundAchTransferId = inboundAchTransferId
        }

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

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

        fun build(): InboundAchTransferTransferReturnParams =
            InboundAchTransferTransferReturnParams(
                checkRequired("inboundAchTransferId", inboundAchTransferId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The reason why this transfer will be returned. The most usual return codes are
     * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
     */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /**
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            val INSUFFICIENT_FUNDS = of("insufficient_funds")

            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            val PAYMENT_STOPPED = of("payment_stopped")

            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

            /** The payee is deceased. The Nacha return code is R14. */
            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

            /** The account holder is deceased. The Nacha return code is R15. */
            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                of("beneficiary_or_account_holder_deceased")

            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            val DUPLICATE_ENTRY = of("duplicate_entry")

            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                of("corporate_customer_advised_not_authorized")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            /**
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            INSUFFICIENT_FUNDS,
            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            RETURNED_PER_ODFI_REQUEST,
            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            PAYMENT_STOPPED,
            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** The payee is deceased. The Nacha return code is R14. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /** The account holder is deceased. The Nacha return code is R15. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            DUPLICATE_ENTRY,
            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            INSUFFICIENT_FUNDS,
            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            RETURNED_PER_ODFI_REQUEST,
            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            PAYMENT_STOPPED,
            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** The payee is deceased. The Nacha return code is R14. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /** The account holder is deceased. The Nacha return code is R15. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            DUPLICATE_ENTRY,
            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferTransferReturnParams && inboundAchTransferId == other.inboundAchTransferId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransferId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundAchTransferTransferReturnParams{inboundAchTransferId=$inboundAchTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
