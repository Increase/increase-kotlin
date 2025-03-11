// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollment
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListPage
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams

interface IntrafiAccountEnrollmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll an account in the IntraFi deposit sweep network */
    fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /** List IntraFi Account Enrollments */
    fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollmentListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): IntrafiAccountEnrollmentListPage = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiAccountEnrollment

    /**
     * A view of [IntrafiAccountEnrollmentService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentService.create].
         */
        @MustBeClosed
        fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for
         * `get /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is
         * otherwise the same as [IntrafiAccountEnrollmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentService.list].
         */
        @MustBeClosed
        fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollmentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntrafiAccountEnrollmentListPage> = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`,
         * but is otherwise the same as [IntrafiAccountEnrollmentService.unenroll].
         */
        @MustBeClosed
        fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiAccountEnrollment>
    }
}
