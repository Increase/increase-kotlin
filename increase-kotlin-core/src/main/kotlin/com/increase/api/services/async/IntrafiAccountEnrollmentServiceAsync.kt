// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollment
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams

interface IntrafiAccountEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll an account in the IntraFi deposit sweep network */
    suspend fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    suspend fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /** List IntraFi Account Enrollments */
    suspend fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollmentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): IntrafiAccountEnrollmentListPageAsync = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    suspend fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /**
     * A view of [IntrafiAccountEnrollmentServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for
         * `get /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<IntrafiAccountEnrollmentListPageAsync> = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`,
         * but is otherwise the same as [IntrafiAccountEnrollmentServiceAsync.unenroll].
         */
        @MustBeClosed
        suspend fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>
    }
}
