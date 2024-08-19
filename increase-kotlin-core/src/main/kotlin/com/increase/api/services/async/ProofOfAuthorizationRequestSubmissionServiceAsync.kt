// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams

interface ProofOfAuthorizationRequestSubmissionServiceAsync {

    /** Submit Proof of Authorization */
    suspend fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProofOfAuthorizationRequestSubmission

    /** Retrieve a Proof of Authorization Request Submission */
    suspend fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProofOfAuthorizationRequestSubmission

    /** List Proof of Authorization Request Submissions */
    suspend fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProofOfAuthorizationRequestSubmissionListPageAsync
}
