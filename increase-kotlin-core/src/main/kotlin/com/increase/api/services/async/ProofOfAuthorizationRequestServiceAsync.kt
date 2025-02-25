// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams

interface ProofOfAuthorizationRequestServiceAsync {

    /** Retrieve a Proof of Authorization Request */
    suspend fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequest

    /** List Proof of Authorization Requests */
    suspend fun list(
        params: ProofOfAuthorizationRequestListParams =
            ProofOfAuthorizationRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestListPageAsync

    /** List Proof of Authorization Requests */
    suspend fun list(requestOptions: RequestOptions): ProofOfAuthorizationRequestListPageAsync =
        list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
}
