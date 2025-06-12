// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntrafiAccountEnrollmentServiceAsync

    /** Enroll an account in the IntraFi deposit sweep network */
    suspend fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    suspend fun retrieve(
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
    suspend fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** @see [retrieve] */
    suspend fun retrieve(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        retrieve(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentRetrieveParams.none(),
            requestOptions,
        )

    /** List IntraFi Account Enrollments */
    suspend fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollmentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): IntrafiAccountEnrollmentListPageAsync =
        list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    suspend fun unenroll(
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
    suspend fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** @see [unenroll] */
    suspend fun unenroll(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        unenroll(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentUnenrollParams.none(),
            requestOptions,
        )

    /**
     * A view of [IntrafiAccountEnrollmentServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IntrafiAccountEnrollmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is otherwise the same
         * as [IntrafiAccountEnrollmentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
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
        suspend fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
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
         * same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntrafiAccountEnrollmentListPageAsync> =
            list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`, but is otherwise
         * the same as [IntrafiAccountEnrollmentServiceAsync.unenroll].
         */
        @MustBeClosed
        suspend fun unenroll(
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
        suspend fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /** @see [unenroll] */
        @MustBeClosed
        suspend fun unenroll(
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
