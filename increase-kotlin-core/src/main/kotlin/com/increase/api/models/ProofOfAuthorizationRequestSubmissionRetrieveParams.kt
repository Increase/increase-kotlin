// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects

class ProofOfAuthorizationRequestSubmissionRetrieveParams
constructor(
    private val proofOfAuthorizationRequestSubmissionId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun proofOfAuthorizationRequestSubmissionId(): String = proofOfAuthorizationRequestSubmissionId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> proofOfAuthorizationRequestSubmissionId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var proofOfAuthorizationRequestSubmissionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            proofOfAuthorizationRequestSubmissionRetrieveParams:
                ProofOfAuthorizationRequestSubmissionRetrieveParams
        ) = apply {
            proofOfAuthorizationRequestSubmissionId =
                proofOfAuthorizationRequestSubmissionRetrieveParams
                    .proofOfAuthorizationRequestSubmissionId
            additionalHeaders =
                proofOfAuthorizationRequestSubmissionRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                proofOfAuthorizationRequestSubmissionRetrieveParams.additionalQueryParams
                    .toBuilder()
        }

        /** The identifier of the Proof of Authorization Request Submission. */
        fun proofOfAuthorizationRequestSubmissionId(
            proofOfAuthorizationRequestSubmissionId: String
        ) = apply {
            this.proofOfAuthorizationRequestSubmissionId = proofOfAuthorizationRequestSubmissionId
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

        fun build(): ProofOfAuthorizationRequestSubmissionRetrieveParams =
            ProofOfAuthorizationRequestSubmissionRetrieveParams(
                checkNotNull(proofOfAuthorizationRequestSubmissionId) {
                    "`proofOfAuthorizationRequestSubmissionId` is required but was not set"
                },
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionRetrieveParams && proofOfAuthorizationRequestSubmissionId == other.proofOfAuthorizationRequestSubmissionId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestSubmissionId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionRetrieveParams{proofOfAuthorizationRequestSubmissionId=$proofOfAuthorizationRequestSubmissionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
