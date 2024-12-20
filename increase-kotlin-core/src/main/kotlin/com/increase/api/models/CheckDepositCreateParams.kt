// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import java.util.Objects

class CheckDepositCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val backImageFileId: String,
    private val frontImageFileId: String,
    private val description: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun backImageFileId(): String = backImageFileId

    fun frontImageFileId(): String = frontImageFileId

    fun description(): String? = description

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): CheckDepositCreateBody {
        return CheckDepositCreateBody(
            accountId,
            amount,
            backImageFileId,
            frontImageFileId,
            description,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = CheckDepositCreateBody.Builder::class)
    @NoAutoDetect
    class CheckDepositCreateBody
    internal constructor(
        private val accountId: String,
        private val amount: Long,
        private val backImageFileId: String,
        private val frontImageFileId: String,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the Account to deposit the check in. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** The deposit amount in USD cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The File containing the check's back image. */
        @JsonProperty("back_image_file_id") fun backImageFileId(): String = backImageFileId

        /** The File containing the check's front image. */
        @JsonProperty("front_image_file_id") fun frontImageFileId(): String = frontImageFileId

        /** The description you choose to give the Check Deposit, for display purposes only. */
        @JsonProperty("description") fun description(): String? = description

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
            private var backImageFileId: String? = null
            private var frontImageFileId: String? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(checkDepositCreateBody: CheckDepositCreateBody) = apply {
                accountId = checkDepositCreateBody.accountId
                amount = checkDepositCreateBody.amount
                backImageFileId = checkDepositCreateBody.backImageFileId
                frontImageFileId = checkDepositCreateBody.frontImageFileId
                description = checkDepositCreateBody.description
                additionalProperties = checkDepositCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier for the Account to deposit the check in. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The deposit amount in USD cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The File containing the check's back image. */
            @JsonProperty("back_image_file_id")
            fun backImageFileId(backImageFileId: String) = apply {
                this.backImageFileId = backImageFileId
            }

            /** The File containing the check's front image. */
            @JsonProperty("front_image_file_id")
            fun frontImageFileId(frontImageFileId: String) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The description you choose to give the Check Deposit, for display purposes only. */
            @JsonProperty("description")
            fun description(description: String?) = apply { this.description = description }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CheckDepositCreateBody =
                CheckDepositCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(backImageFileId) {
                        "`backImageFileId` is required but was not set"
                    },
                    checkNotNull(frontImageFileId) {
                        "`frontImageFileId` is required but was not set"
                    },
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CheckDepositCreateBody && accountId == other.accountId && amount == other.amount && backImageFileId == other.backImageFileId && frontImageFileId == other.frontImageFileId && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, backImageFileId, frontImageFileId, description, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CheckDepositCreateBody{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var backImageFileId: String? = null
        private var frontImageFileId: String? = null
        private var description: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkDepositCreateParams: CheckDepositCreateParams) = apply {
            accountId = checkDepositCreateParams.accountId
            amount = checkDepositCreateParams.amount
            backImageFileId = checkDepositCreateParams.backImageFileId
            frontImageFileId = checkDepositCreateParams.frontImageFileId
            description = checkDepositCreateParams.description
            additionalHeaders = checkDepositCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkDepositCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                checkDepositCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The identifier for the Account to deposit the check in. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The deposit amount in USD cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The File containing the check's back image. */
        fun backImageFileId(backImageFileId: String) = apply {
            this.backImageFileId = backImageFileId
        }

        /** The File containing the check's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(description: String) = apply { this.description = description }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CheckDepositCreateParams =
            CheckDepositCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(backImageFileId) { "`backImageFileId` is required but was not set" },
                checkNotNull(frontImageFileId) { "`frontImageFileId` is required but was not set" },
                description,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositCreateParams && accountId == other.accountId && amount == other.amount && backImageFileId == other.backImageFileId && frontImageFileId == other.frontImageFileId && description == other.description && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, amount, backImageFileId, frontImageFileId, description, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CheckDepositCreateParams{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
