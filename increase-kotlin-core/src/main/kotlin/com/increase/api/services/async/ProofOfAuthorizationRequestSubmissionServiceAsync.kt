// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListPageAsync
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionRetrieveParams

interface ProofOfAuthorizationRequestSubmissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit Proof of Authorization */
    suspend fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmission

    /** Retrieve a Proof of Authorization Request Submission */
    suspend fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmission

    /** List Proof of Authorization Request Submissions */
    suspend fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestSubmissionListPageAsync

    /** @see [list] */
    suspend fun list(
        requestOptions: RequestOptions
    ): ProofOfAuthorizationRequestSubmissionListPageAsync =
        list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestSubmissionServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /proof_of_authorization_request_submissions`, but
         * is otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ProofOfAuthorizationRequestSubmissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission>

        /**
         * Returns a raw HTTP response for `get
         * /proof_of_authorization_request_submissions/{proof_of_authorization_request_submission_id}`,
         * but is otherwise the same as
         * [ProofOfAuthorizationRequestSubmissionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_request_submissions`, but is
         * otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams =
                ProofOfAuthorizationRequestSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync> =
            list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)
    }
}
