// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams

interface IntrafiAccountEnrollmentServiceAsync {

    /** Enroll an account in the IntraFi deposit sweep network */
    suspend fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    suspend fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiAccountEnrollment

    /** List IntraFi Account Enrollments */
    suspend fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiAccountEnrollmentListPageAsync

    /** Unenroll an account from IntraFi */
    suspend fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiAccountEnrollment
}
