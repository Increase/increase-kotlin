// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams

interface RealTimeDecisionService {

    /** Retrieve a Real-Time Decision */
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** Action a Real-Time Decision */
    fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision
}
