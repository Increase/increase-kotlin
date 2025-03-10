// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListPageAsync
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramRetrieveParams

interface ProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Program */
    suspend fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** List Programs */
    suspend fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ProgramListPageAsync =
        list(ProgramListParams.none(), requestOptions)

    /**
     * A view of [ProgramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ProgramListPageAsync> =
            list(ProgramListParams.none(), requestOptions)
    }
}
