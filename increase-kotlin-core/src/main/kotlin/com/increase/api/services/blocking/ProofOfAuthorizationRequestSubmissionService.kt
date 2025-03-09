// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPage
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams

interface ProofOfAuthorizationRequestSubmissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProofOfAuthorizationRequestSubmissionListPage =
        list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestSubmissionService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /proof_of_authorization_request_submissions`, but
         * is otherwise the same as [ProofOfAuthorizationRequestSubmissionService.create].
         */
        @MustBeClosed
        fun create(
            params: ProofOfAuthorizationRequestSubmissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission>

        /**
         * Returns a raw HTTP response for `get
         * /proof_of_authorization_request_submissions/{proof_of_authorization_request_submission_id}`,
         * but is otherwise the same as [ProofOfAuthorizationRequestSubmissionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_request_submissions`, but is
         * otherwise the same as [ProofOfAuthorizationRequestSubmissionService.list].
         */
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams =
                ProofOfAuthorizationRequestSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPage> =
            list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)
    }
}
