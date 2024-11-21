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
import com.increase.api.models.*
import java.util.Objects

class SimulationInboundMailItemCreateParams
constructor(
    private val amount: Long,
    private val lockboxId: String,
    private val contentsFileId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun lockboxId(): String = lockboxId

    fun contentsFileId(): String? = contentsFileId

    internal fun getBody(): SimulationInboundMailItemCreateBody {
        return SimulationInboundMailItemCreateBody(
            amount,
            lockboxId,
            contentsFileId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationInboundMailItemCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundMailItemCreateBody
    internal constructor(
        private val amount: Long?,
        private val lockboxId: String?,
        private val contentsFileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The amount of the check to be simulated, in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The identifier of the Lockbox to simulate inbound mail to. */
        @JsonProperty("lockbox_id") fun lockboxId(): String? = lockboxId

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        @JsonProperty("contents_file_id") fun contentsFileId(): String? = contentsFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var lockboxId: String? = null
            private var contentsFileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationInboundMailItemCreateBody: SimulationInboundMailItemCreateBody
            ) = apply {
                this.amount = simulationInboundMailItemCreateBody.amount
                this.lockboxId = simulationInboundMailItemCreateBody.lockboxId
                this.contentsFileId = simulationInboundMailItemCreateBody.contentsFileId
                additionalProperties(simulationInboundMailItemCreateBody.additionalProperties)
            }

            /** The amount of the check to be simulated, in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The identifier of the Lockbox to simulate inbound mail to. */
            @JsonProperty("lockbox_id")
            fun lockboxId(lockboxId: String) = apply { this.lockboxId = lockboxId }

            /**
             * The file containing the PDF contents. If not present, a default check image file will
             * be used.
             */
            @JsonProperty("contents_file_id")
            fun contentsFileId(contentsFileId: String) = apply {
                this.contentsFileId = contentsFileId
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

            fun build(): SimulationInboundMailItemCreateBody =
                SimulationInboundMailItemCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(lockboxId) { "`lockboxId` is required but was not set" },
                    contentsFileId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundMailItemCreateBody && amount == other.amount && lockboxId == other.lockboxId && contentsFileId == other.contentsFileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, lockboxId, contentsFileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundMailItemCreateBody{amount=$amount, lockboxId=$lockboxId, contentsFileId=$contentsFileId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundMailItemCreateParams && amount == other.amount && lockboxId == other.lockboxId && contentsFileId == other.contentsFileId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, lockboxId, contentsFileId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationInboundMailItemCreateParams{amount=$amount, lockboxId=$lockboxId, contentsFileId=$contentsFileId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var lockboxId: String? = null
        private var contentsFileId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationInboundMailItemCreateParams: SimulationInboundMailItemCreateParams
        ) = apply {
            this.amount = simulationInboundMailItemCreateParams.amount
            this.lockboxId = simulationInboundMailItemCreateParams.lockboxId
            this.contentsFileId = simulationInboundMailItemCreateParams.contentsFileId
            additionalHeaders(simulationInboundMailItemCreateParams.additionalHeaders)
            additionalQueryParams(simulationInboundMailItemCreateParams.additionalQueryParams)
            additionalBodyProperties(simulationInboundMailItemCreateParams.additionalBodyProperties)
        }

        /** The amount of the check to be simulated, in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The identifier of the Lockbox to simulate inbound mail to. */
        fun lockboxId(lockboxId: String) = apply { this.lockboxId = lockboxId }

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(contentsFileId: String) = apply { this.contentsFileId = contentsFileId }

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

        fun build(): SimulationInboundMailItemCreateParams =
            SimulationInboundMailItemCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(lockboxId) { "`lockboxId` is required but was not set" },
                contentsFileId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
