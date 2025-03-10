// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.simulations.programs.ProgramCreateParams

interface ProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates a [Program](#programs) being created in your group. By default, your group has one
     * program called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    suspend fun create(
        params: ProgramCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /**
     * A view of [ProgramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/programs`, but is otherwise the same
         * as [ProgramServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ProgramCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>
    }
}
