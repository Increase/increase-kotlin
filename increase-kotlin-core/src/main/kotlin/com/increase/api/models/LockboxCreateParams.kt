// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class LockboxCreateParams
constructor(
    private val accountId: String,
    private val description: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun description(): String? = description

    internal fun getBody(): LockboxCreateBody {
        return LockboxCreateBody(
            accountId,
            description,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LockboxCreateBody.Builder::class)
    @NoAutoDetect
    class LockboxCreateBody
    internal constructor(
        private val accountId: String?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Account checks sent to this Lockbox should be deposited into. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The description you choose for the Lockbox, for display purposes. */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LockboxCreateBody &&
                this.accountId == other.accountId &&
                this.description == other.description &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        description,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LockboxCreateBody{accountId=$accountId, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lockboxCreateBody: LockboxCreateBody) = apply {
                this.accountId = lockboxCreateBody.accountId
                this.description = lockboxCreateBody.description
                additionalProperties(lockboxCreateBody.additionalProperties)
            }

            /** The Account checks sent to this Lockbox should be deposited into. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The description you choose for the Lockbox, for display purposes. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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

            fun build(): LockboxCreateBody =
                LockboxCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    description,
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

        return other is LockboxCreateParams &&
            this.accountId == other.accountId &&
            this.description == other.description &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            description,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LockboxCreateParams{accountId=$accountId, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(lockboxCreateParams: LockboxCreateParams) = apply {
            this.accountId = lockboxCreateParams.accountId
            this.description = lockboxCreateParams.description
            additionalQueryParams(lockboxCreateParams.additionalQueryParams)
            additionalHeaders(lockboxCreateParams.additionalHeaders)
            additionalBodyProperties(lockboxCreateParams.additionalBodyProperties)
        }

        /** The Account checks sent to this Lockbox should be deposited into. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The description you choose for the Lockbox, for display purposes. */
        fun description(description: String) = apply { this.description = description }

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

        fun build(): LockboxCreateParams =
            LockboxCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                description,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
