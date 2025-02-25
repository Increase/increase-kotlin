// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPage
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams

interface ProofOfAuthorizationRequestSubmissionService {

    /** Submit Proof of Authorization */
    fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmission

    /** Retrieve a Proof of Authorization Request Submission */
    fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmission

    /** List Proof of Authorization Request Submissions */
    fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmissionListPage

    /** List Proof of Authorization Request Submissions */
    fun list(requestOptions: RequestOptions): ProofOfAuthorizationRequestSubmissionListPage =
        list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)
}
