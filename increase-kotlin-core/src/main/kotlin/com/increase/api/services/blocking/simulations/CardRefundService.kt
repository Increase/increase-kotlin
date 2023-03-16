@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationsCardRefundCreateParams
import com.increase.api.models.Transaction

interface CardRefundService {

    /**
     * Simulates refunding a card transaction. The full value of the original sandbox transaction is
     * refunded.
     */
    fun create(
        params: SimulationsCardRefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction
}
