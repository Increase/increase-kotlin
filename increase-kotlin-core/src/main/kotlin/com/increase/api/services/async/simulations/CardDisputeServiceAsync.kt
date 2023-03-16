@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardDispute
import com.increase.api.models.SimulationsCardDisputeActionParams

interface CardDisputeServiceAsync {

    /**
     * After a [Card Dispute](#card-disputes) is created in production, the dispute will be
     * reviewed. Since no review happens in sandbox, this endpoint simulates moving a Card Dispute
     * into a rejected or accepted state. A Card Dispute can only be actioned one time and must have
     * a status of `pending_reviewing`.
     */
    suspend fun action(
        params: SimulationsCardDisputeActionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute
}
