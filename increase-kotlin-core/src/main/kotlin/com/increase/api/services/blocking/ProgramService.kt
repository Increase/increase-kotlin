// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListPage
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramRetrieveParams

interface ProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Program */
    fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Program

    /** List Programs */
    fun list(params: ProgramListParams = ProgramListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ProgramListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProgramListPage = list(ProgramListParams.none(), requestOptions)

    /**
     * A view of [ProgramService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise
         * the same as [ProgramService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Program>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramService.list].
         */
        @MustBeClosed
        fun list(params: ProgramListParams = ProgramListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProgramListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProgramListPage> = list(ProgramListParams.none(), requestOptions)
    }
}
