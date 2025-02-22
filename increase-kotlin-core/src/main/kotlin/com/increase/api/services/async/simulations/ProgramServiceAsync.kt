// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Program
import com.increase.api.models.SimulationProgramCreateParams

interface ProgramServiceAsync {

    /**
     * Simulates a [Program](#programs) being created in your group. By default, your group has one
     * program called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    suspend fun create(
        params: SimulationProgramCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program
}
