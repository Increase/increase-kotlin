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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Create an Account Number */
class AccountNumberCreateParams
private constructor(
    private val body: AccountNumberCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The Account the Account Number should belong to. */
    fun accountId(): String = body.accountId()

    /** The name you choose for the Account Number. */
    fun name(): String = body.name()

    /** Options related to how this Account Number should handle inbound ACH transfers. */
    fun inboundAch(): InboundAch? = body.inboundAch()

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    fun inboundChecks(): InboundChecks? = body.inboundChecks()

    /** The Account the Account Number should belong to. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The name you choose for the Account Number. */
    fun _name(): JsonField<String> = body._name()

    /** Options related to how this Account Number should handle inbound ACH transfers. */
    fun _inboundAch(): JsonField<InboundAch> = body._inboundAch()

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    fun _inboundChecks(): JsonField<InboundChecks> = body._inboundChecks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AccountNumberCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccountNumberCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbound_ach")
        @ExcludeMissing
        private val inboundAch: JsonField<InboundAch> = JsonMissing.of(),
        @JsonProperty("inbound_checks")
        @ExcludeMissing
        private val inboundChecks: JsonField<InboundChecks> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Account the Account Number should belong to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The name you choose for the Account Number. */
        fun name(): String = name.getRequired("name")

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        fun inboundAch(): InboundAch? = inboundAch.getNullable("inbound_ach")

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(): InboundChecks? = inboundChecks.getNullable("inbound_checks")

        /** The Account the Account Number should belong to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The name you choose for the Account Number. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        @JsonProperty("inbound_ach")
        @ExcludeMissing
        fun _inboundAch(): JsonField<InboundAch> = inboundAch

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        @JsonProperty("inbound_checks")
        @ExcludeMissing
        fun _inboundChecks(): JsonField<InboundChecks> = inboundChecks

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountNumberCreateBody = apply {
            if (validated) {
                return@apply
            }

            accountId()
            name()
            inboundAch()?.validate()
            inboundChecks()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [AccountNumberCreateBody]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var inboundAch: JsonField<InboundAch> = JsonMissing.of()
            private var inboundChecks: JsonField<InboundChecks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountNumberCreateBody: AccountNumberCreateBody) = apply {
                accountId = accountNumberCreateBody.accountId
                name = accountNumberCreateBody.name
                inboundAch = accountNumberCreateBody.inboundAch
                inboundChecks = accountNumberCreateBody.inboundChecks
                additionalProperties = accountNumberCreateBody.additionalProperties.toMutableMap()
            }

            /** The Account the Account Number should belong to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The Account the Account Number should belong to. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The name you choose for the Account Number. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name you choose for the Account Number. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Options related to how this Account Number should handle inbound ACH transfers. */
            fun inboundAch(inboundAch: InboundAch) = inboundAch(JsonField.of(inboundAch))

            /** Options related to how this Account Number should handle inbound ACH transfers. */
            fun inboundAch(inboundAch: JsonField<InboundAch>) = apply {
                this.inboundAch = inboundAch
            }

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            fun inboundChecks(inboundChecks: InboundChecks) =
                inboundChecks(JsonField.of(inboundChecks))

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
                this.inboundChecks = inboundChecks
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

            fun build(): AccountNumberCreateBody =
                AccountNumberCreateBody(
                    checkRequired("accountId", accountId),
                    checkRequired("name", name),
                    inboundAch,
                    inboundChecks,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountNumberCreateBody && accountId == other.accountId && name == other.name && inboundAch == other.inboundAch && inboundChecks == other.inboundChecks && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, name, inboundAch, inboundChecks, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountNumberCreateBody{accountId=$accountId, name=$name, inboundAch=$inboundAch, inboundChecks=$inboundChecks, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [AccountNumberCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: AccountNumberCreateBody.Builder = AccountNumberCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountNumberCreateParams: AccountNumberCreateParams) = apply {
            body = accountNumberCreateParams.body.toBuilder()
            additionalHeaders = accountNumberCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountNumberCreateParams.additionalQueryParams.toBuilder()
        }

        /** The Account the Account Number should belong to. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The Account the Account Number should belong to. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { body.name(name) }

        /** The name you choose for the Account Number. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { body.inboundAch(inboundAch) }

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        fun inboundAch(inboundAch: JsonField<InboundAch>) = apply { body.inboundAch(inboundAch) }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: InboundChecks) = apply {
            body.inboundChecks(inboundChecks)
        }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
            body.inboundChecks(inboundChecks)
        }

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

        fun build(): AccountNumberCreateParams =
            AccountNumberCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Options related to how this Account Number should handle inbound ACH transfers. */
    @NoAutoDetect
    class InboundAch
    @JsonCreator
    private constructor(
        @JsonProperty("debit_status")
        @ExcludeMissing
        private val debitStatus: JsonField<DebitStatus> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         */
        fun debitStatus(): DebitStatus = debitStatus.getRequired("debit_status")

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         */
        @JsonProperty("debit_status")
        @ExcludeMissing
        fun _debitStatus(): JsonField<DebitStatus> = debitStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundAch = apply {
            if (validated) {
                return@apply
            }

            debitStatus()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InboundAch]. */
        class Builder internal constructor() {

            private var debitStatus: JsonField<DebitStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundAch: InboundAch) = apply {
                debitStatus = inboundAch.debitStatus
                additionalProperties = inboundAch.additionalProperties.toMutableMap()
            }

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active. If you do not
             * specify this field, the default is `allowed`.
             */
            fun debitStatus(debitStatus: DebitStatus) = debitStatus(JsonField.of(debitStatus))

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active. If you do not
             * specify this field, the default is `allowed`.
             */
            fun debitStatus(debitStatus: JsonField<DebitStatus>) = apply {
                this.debitStatus = debitStatus
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

            fun build(): InboundAch =
                InboundAch(
                    checkRequired("debitStatus", debitStatus),
                    additionalProperties.toImmutable()
                )
        }

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         */
        class DebitStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                /** ACH Debits are allowed. */
                val ALLOWED = of("allowed")

                /** ACH Debits are blocked. */
                val BLOCKED = of("blocked")

                fun of(value: String) = DebitStatus(JsonField.of(value))
            }

            /** An enum containing [DebitStatus]'s known values. */
            enum class Known {
                /** ACH Debits are allowed. */
                ALLOWED,
                /** ACH Debits are blocked. */
                BLOCKED,
            }

            /**
             * An enum containing [DebitStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DebitStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** ACH Debits are allowed. */
                ALLOWED,
                /** ACH Debits are blocked. */
                BLOCKED,
                /**
                 * An enum member indicating that [DebitStatus] was instantiated with an unknown
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
                    ALLOWED -> Value.ALLOWED
                    BLOCKED -> Value.BLOCKED
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
                    ALLOWED -> Known.ALLOWED
                    BLOCKED -> Known.BLOCKED
                    else -> throw IncreaseInvalidDataException("Unknown DebitStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DebitStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAch && debitStatus == other.debitStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(debitStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"
    }

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    @NoAutoDetect
    class InboundChecks
    @JsonCreator
    private constructor(
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         */
        fun status(): Status = status.getRequired("status")

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundChecks = apply {
            if (validated) {
                return@apply
            }

            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InboundChecks]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundChecks: InboundChecks) = apply {
                status = inboundChecks.status
                additionalProperties = inboundChecks.additionalProperties.toMutableMap()
            }

            /**
             * How Increase should process checks with this account number printed on them. If you
             * do not specify this field, the default is `check_transfers_only`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * How Increase should process checks with this account number printed on them. If you
             * do not specify this field, the default is `check_transfers_only`.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): InboundChecks =
                InboundChecks(checkRequired("status", status), additionalProperties.toImmutable())
        }

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         */
        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                val ALLOWED = of("allowed")

                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                val CHECK_TRANSFERS_ONLY = of("check_transfers_only")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /**
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                ALLOWED,
                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                CHECK_TRANSFERS_ONLY,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                ALLOWED,
                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                CHECK_TRANSFERS_ONLY,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ALLOWED -> Value.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Value.CHECK_TRANSFERS_ONLY
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
                    ALLOWED -> Known.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Known.CHECK_TRANSFERS_ONLY
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundChecks && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundChecks{status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountNumberCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
