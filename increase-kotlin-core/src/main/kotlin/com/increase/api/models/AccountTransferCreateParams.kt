// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects

class AccountTransferCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val description: String,
    private val destinationAccountId: String,
    private val requireApproval: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun description(): String = description

    fun destinationAccountId(): String = destinationAccountId

    fun requireApproval(): Boolean? = requireApproval

    internal fun getBody(): AccountTransferCreateBody {
        return AccountTransferCreateBody(
            accountId,
            amount,
            description,
            destinationAccountId,
            requireApproval,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AccountTransferCreateBody.Builder::class)
    @NoAutoDetect
    class AccountTransferCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val description: String?,
        private val destinationAccountId: String?,
        private val requireApproval: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The transfer amount in the minor unit of the account currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The description you choose to give the transfer. */
        @JsonProperty("description") fun description(): String? = description

        /** The identifier for the account that will receive the transfer. */
        @JsonProperty("destination_account_id")
        fun destinationAccountId(): String? = destinationAccountId

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var description: String? = null
            private var destinationAccountId: String? = null
            private var requireApproval: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountTransferCreateBody: AccountTransferCreateBody) = apply {
                this.accountId = accountTransferCreateBody.accountId
                this.amount = accountTransferCreateBody.amount
                this.description = accountTransferCreateBody.description
                this.destinationAccountId = accountTransferCreateBody.destinationAccountId
                this.requireApproval = accountTransferCreateBody.requireApproval
                additionalProperties(accountTransferCreateBody.additionalProperties)
            }

            /** The identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The transfer amount in the minor unit of the account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The description you choose to give the transfer. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The identifier for the account that will receive the transfer. */
            @JsonProperty("destination_account_id")
            fun destinationAccountId(destinationAccountId: String) = apply {
                this.destinationAccountId = destinationAccountId
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

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

            fun build(): AccountTransferCreateBody =
                AccountTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(destinationAccountId) {
                        "`destinationAccountId` is required but was not set"
                    },
                    requireApproval,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountTransferCreateBody && this.accountId == other.accountId && this.amount == other.amount && this.description == other.description && this.destinationAccountId == other.destinationAccountId && this.requireApproval == other.requireApproval && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, amount, description, destinationAccountId, requireApproval, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountTransferCreateBody{accountId=$accountId, amount=$amount, description=$description, destinationAccountId=$destinationAccountId, requireApproval=$requireApproval, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountTransferCreateParams && this.accountId == other.accountId && this.amount == other.amount && this.description == other.description && this.destinationAccountId == other.destinationAccountId && this.requireApproval == other.requireApproval && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, amount, description, destinationAccountId, requireApproval, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountTransferCreateParams{accountId=$accountId, amount=$amount, description=$description, destinationAccountId=$destinationAccountId, requireApproval=$requireApproval, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var description: String? = null
        private var destinationAccountId: String? = null
        private var requireApproval: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountTransferCreateParams: AccountTransferCreateParams) = apply {
            this.accountId = accountTransferCreateParams.accountId
            this.amount = accountTransferCreateParams.amount
            this.description = accountTransferCreateParams.description
            this.destinationAccountId = accountTransferCreateParams.destinationAccountId
            this.requireApproval = accountTransferCreateParams.requireApproval
            additionalQueryParams(accountTransferCreateParams.additionalQueryParams)
            additionalHeaders(accountTransferCreateParams.additionalHeaders)
            additionalBodyProperties(accountTransferCreateParams.additionalBodyProperties)
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * The transfer amount in the minor unit of the account currency. For dollars, for example,
         * this is cents.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The description you choose to give the transfer. */
        fun description(description: String) = apply { this.description = description }

        /** The identifier for the account that will receive the transfer. */
        fun destinationAccountId(destinationAccountId: String) = apply {
            this.destinationAccountId = destinationAccountId
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

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

        fun build(): AccountTransferCreateParams =
            AccountTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(destinationAccountId) {
                    "`destinationAccountId` is required but was not set"
                },
                requireApproval,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
