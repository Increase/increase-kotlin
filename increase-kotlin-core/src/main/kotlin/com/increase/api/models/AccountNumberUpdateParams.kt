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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class AccountNumberUpdateParams
constructor(
    private val accountNumberId: String,
    private val inboundAch: InboundAch?,
    private val inboundChecks: InboundChecks?,
    private val name: String?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun inboundAch(): InboundAch? = inboundAch

    fun inboundChecks(): InboundChecks? = inboundChecks

    fun name(): String? = name

    fun status(): Status? = status

    internal fun getBody(): AccountNumberUpdateBody {
        return AccountNumberUpdateBody(
            inboundAch,
            inboundChecks,
            name,
            status,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountNumberId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountNumberUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountNumberUpdateBody
    internal constructor(
        private val inboundAch: InboundAch?,
        private val inboundChecks: InboundChecks?,
        private val name: String?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Options related to how this Account Number handles inbound ACH transfers. */
        @JsonProperty("inbound_ach") fun inboundAch(): InboundAch? = inboundAch

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        @JsonProperty("inbound_checks") fun inboundChecks(): InboundChecks? = inboundChecks

        /** The name you choose for the Account Number. */
        @JsonProperty("name") fun name(): String? = name

        /** This indicates if transfers can be made to the Account Number. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountNumberUpdateBody &&
                this.inboundAch == other.inboundAch &&
                this.inboundChecks == other.inboundChecks &&
                this.name == other.name &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        inboundAch,
                        inboundChecks,
                        name,
                        status,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountNumberUpdateBody{inboundAch=$inboundAch, inboundChecks=$inboundChecks, name=$name, status=$status, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var inboundAch: InboundAch? = null
            private var inboundChecks: InboundChecks? = null
            private var name: String? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountNumberUpdateBody: AccountNumberUpdateBody) = apply {
                this.inboundAch = accountNumberUpdateBody.inboundAch
                this.inboundChecks = accountNumberUpdateBody.inboundChecks
                this.name = accountNumberUpdateBody.name
                this.status = accountNumberUpdateBody.status
                additionalProperties(accountNumberUpdateBody.additionalProperties)
            }

            /** Options related to how this Account Number handles inbound ACH transfers. */
            @JsonProperty("inbound_ach")
            fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            @JsonProperty("inbound_checks")
            fun inboundChecks(inboundChecks: InboundChecks) = apply {
                this.inboundChecks = inboundChecks
            }

            /** The name you choose for the Account Number. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** This indicates if transfers can be made to the Account Number. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): AccountNumberUpdateBody =
                AccountNumberUpdateBody(
                    inboundAch,
                    inboundChecks,
                    name,
                    status,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountNumberUpdateParams &&
            this.accountNumberId == other.accountNumberId &&
            this.inboundAch == other.inboundAch &&
            this.inboundChecks == other.inboundChecks &&
            this.name == other.name &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            inboundAch,
            inboundChecks,
            name,
            status,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountNumberUpdateParams{accountNumberId=$accountNumberId, inboundAch=$inboundAch, inboundChecks=$inboundChecks, name=$name, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var inboundAch: InboundAch? = null
        private var inboundChecks: InboundChecks? = null
        private var name: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountNumberUpdateParams: AccountNumberUpdateParams) = apply {
            this.accountNumberId = accountNumberUpdateParams.accountNumberId
            this.inboundAch = accountNumberUpdateParams.inboundAch
            this.inboundChecks = accountNumberUpdateParams.inboundChecks
            this.name = accountNumberUpdateParams.name
            this.status = accountNumberUpdateParams.status
            additionalQueryParams(accountNumberUpdateParams.additionalQueryParams)
            additionalHeaders(accountNumberUpdateParams.additionalHeaders)
            additionalBodyProperties(accountNumberUpdateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Options related to how this Account Number handles inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: InboundChecks) = apply {
            this.inboundChecks = inboundChecks
        }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { this.name = name }

        /** This indicates if transfers can be made to the Account Number. */
        fun status(status: Status) = apply { this.status = status }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountNumberUpdateParams =
            AccountNumberUpdateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                inboundAch,
                inboundChecks,
                name,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Options related to how this Account Number handles inbound ACH transfers. */
    @JsonDeserialize(builder = InboundAch.Builder::class)
    @NoAutoDetect
    class InboundAch
    private constructor(
        private val debitStatus: DebitStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active.
         */
        @JsonProperty("debit_status") fun debitStatus(): DebitStatus? = debitStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InboundAch &&
                this.debitStatus == other.debitStatus &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(debitStatus, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var debitStatus: DebitStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundAch: InboundAch) = apply {
                this.debitStatus = inboundAch.debitStatus
                additionalProperties(inboundAch.additionalProperties)
            }

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active.
             */
            @JsonProperty("debit_status")
            fun debitStatus(debitStatus: DebitStatus) = apply { this.debitStatus = debitStatus }

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

            fun build(): InboundAch = InboundAch(debitStatus, additionalProperties.toUnmodifiable())
        }

        class DebitStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DebitStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ALLOWED = DebitStatus(JsonField.of("allowed"))

                val BLOCKED = DebitStatus(JsonField.of("blocked"))

                fun of(value: String) = DebitStatus(JsonField.of(value))
            }

            enum class Known {
                ALLOWED,
                BLOCKED,
            }

            enum class Value {
                ALLOWED,
                BLOCKED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALLOWED -> Value.ALLOWED
                    BLOCKED -> Value.BLOCKED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALLOWED -> Known.ALLOWED
                    BLOCKED -> Known.BLOCKED
                    else -> throw IncreaseInvalidDataException("Unknown DebitStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    @JsonDeserialize(builder = InboundChecks.Builder::class)
    @NoAutoDetect
    class InboundChecks
    private constructor(
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** How Increase should process checks with this account number printed on them. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InboundChecks &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(status, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "InboundChecks{status=$status, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundChecks: InboundChecks) = apply {
                this.status = inboundChecks.status
                additionalProperties(inboundChecks.additionalProperties)
            }

            /** How Increase should process checks with this account number printed on them. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): InboundChecks =
                InboundChecks(
                    checkNotNull(status) { "`status` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ALLOWED = Status(JsonField.of("allowed"))

                val CHECK_TRANSFERS_ONLY = Status(JsonField.of("check_transfers_only"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ALLOWED,
                CHECK_TRANSFERS_ONLY,
            }

            enum class Value {
                ALLOWED,
                CHECK_TRANSFERS_ONLY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALLOWED -> Value.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Value.CHECK_TRANSFERS_ONLY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALLOWED -> Known.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Known.CHECK_TRANSFERS_ONLY
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val DISABLED = Status(JsonField.of("disabled"))

            val CANCELED = Status(JsonField.of("canceled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            CANCELED,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            CANCELED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
