// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequest
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListParams
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams

interface ProofOfAuthorizationRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Proof of Authorization Request */
    suspend fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ProofOfAuthorizationRequest

    /** List Proof of Authorization Requests */
    suspend fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ProofOfAuthorizationRequestListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ProofOfAuthorizationRequestListPageAsync = list(ProofOfAuthorizationRequestListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /proof_of_authorization_requests/{proof_of_authorization_request_id}`, but
         * is otherwise the same as [ProofOfAuthorizationRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProofOfAuthorizationRequest>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_requests`, but is
         * otherwise the same as [ProofOfAuthorizationRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ProofOfAuthorizationRequestListPageAsync> = list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
    }
}
