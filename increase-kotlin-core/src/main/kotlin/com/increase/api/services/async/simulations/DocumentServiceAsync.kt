// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.SimulationDocumentCreateParams

interface DocumentServiceAsync {

    /** Simulates an tax document being created for an account. */
    suspend fun create(
        params: SimulationDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document
}
