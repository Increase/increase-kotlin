// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntrafiAccountEnrollmentService

    /** Enroll an account in the IntraFi deposit sweep network */
    fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    fun retrieve(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentRetrieveParams =
            IntrafiAccountEnrollmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment =
        retrieve(
            params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** @see [retrieve] */
    fun retrieve(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        retrieve(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentRetrieveParams.none(),
            requestOptions,
        )

    /** List IntraFi Account Enrollments */
    fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollmentListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): IntrafiAccountEnrollmentListPage =
        list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    fun unenroll(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentUnenrollParams =
            IntrafiAccountEnrollmentUnenrollParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment =
        unenroll(
            params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
            requestOptions,
        )

    /** @see [unenroll] */
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** @see [unenroll] */
    fun unenroll(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        unenroll(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentUnenrollParams.none(),
            requestOptions,
        )

    /**
     * A view of [IntrafiAccountEnrollmentService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IntrafiAccountEnrollmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentService.create].
         */
        @MustBeClosed
        fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is otherwise the same
         * as [IntrafiAccountEnrollmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentRetrieveParams =
                IntrafiAccountEnrollmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment> =
            retrieve(
                params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            intrafiAccountEnrollmentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> =
            retrieve(
                intrafiAccountEnrollmentId,
                IntrafiAccountEnrollmentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentService.list].
         */
        @MustBeClosed
        fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollmentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntrafiAccountEnrollmentListPage> =
            list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`, but is otherwise
         * the same as [IntrafiAccountEnrollmentService.unenroll].
         */
        @MustBeClosed
        fun unenroll(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentUnenrollParams =
                IntrafiAccountEnrollmentUnenrollParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment> =
            unenroll(
                params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
                requestOptions,
            )

        /** @see [unenroll] */
        @MustBeClosed
        fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /** @see [unenroll] */
        @MustBeClosed
        fun unenroll(
            intrafiAccountEnrollmentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> =
            unenroll(
                intrafiAccountEnrollmentId,
                IntrafiAccountEnrollmentUnenrollParams.none(),
                requestOptions,
            )
    }
}
