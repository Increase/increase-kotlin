// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

class SimulationInterestPaymentCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val periodEnd: OffsetDateTime?,
    private val periodStart: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun periodEnd(): OffsetDateTime? = periodEnd

    fun periodStart(): OffsetDateTime? = periodStart

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): SimulationInterestPaymentCreateBody {
        return SimulationInterestPaymentCreateBody(
            accountId,
            amount,
            periodEnd,
            periodStart,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInterestPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id") private val accountId: String,
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("period_end") private val periodEnd: OffsetDateTime?,
        @JsonProperty("period_start") private val periodStart: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the Interest Payment is for. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** The interest amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The end of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_end") fun periodEnd(): OffsetDateTime? = periodEnd

        /** The start of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_start") fun periodStart(): OffsetDateTime? = periodStart

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
            private var periodEnd: OffsetDateTime? = null
            private var periodStart: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationInterestPaymentCreateBody: SimulationInterestPaymentCreateBody
            ) = apply {
                accountId = simulationInterestPaymentCreateBody.accountId
                amount = simulationInterestPaymentCreateBody.amount
                periodEnd = simulationInterestPaymentCreateBody.periodEnd
                periodStart = simulationInterestPaymentCreateBody.periodStart
                additionalProperties =
                    simulationInterestPaymentCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the Interest Payment is for. */
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The interest amount in cents. Must be positive. */
            fun amount(amount: Long) = apply { this.amount = amount }

            /** The end of the interest period. If not provided, defaults to the current time. */
            fun periodEnd(periodEnd: OffsetDateTime?) = apply { this.periodEnd = periodEnd }

            /** The start of the interest period. If not provided, defaults to the current time. */
            fun periodStart(periodStart: OffsetDateTime?) = apply { this.periodStart = periodStart }

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

            fun build(): SimulationInterestPaymentCreateBody =
                SimulationInterestPaymentCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    periodEnd,
                    periodStart,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInterestPaymentCreateBody && accountId == other.accountId && amount == other.amount && periodEnd == other.periodEnd && periodStart == other.periodStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, periodEnd, periodStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInterestPaymentCreateBody{accountId=$accountId, amount=$amount, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var periodEnd: OffsetDateTime? = null
        private var periodStart: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationInterestPaymentCreateParams: SimulationInterestPaymentCreateParams
        ) = apply {
            accountId = simulationInterestPaymentCreateParams.accountId
            amount = simulationInterestPaymentCreateParams.amount
            periodEnd = simulationInterestPaymentCreateParams.periodEnd
            periodStart = simulationInterestPaymentCreateParams.periodStart
            additionalHeaders = simulationInterestPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInterestPaymentCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                simulationInterestPaymentCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: OffsetDateTime) = apply { this.periodEnd = periodEnd }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: OffsetDateTime) = apply { this.periodStart = periodStart }

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

        fun build(): SimulationInterestPaymentCreateParams =
            SimulationInterestPaymentCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                periodEnd,
                periodStart,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInterestPaymentCreateParams && accountId == other.accountId && amount == other.amount && periodEnd == other.periodEnd && periodStart == other.periodStart && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, amount, periodEnd, periodStart, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationInterestPaymentCreateParams{accountId=$accountId, amount=$amount, periodEnd=$periodEnd, periodStart=$periodStart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
