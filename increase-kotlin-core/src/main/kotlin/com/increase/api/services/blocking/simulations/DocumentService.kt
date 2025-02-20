// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.SimulationDocumentCreateParams

interface DocumentService {

    /** Simulates an tax document being created for an account. */
    fun create(
        params: SimulationDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document
}
