// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateResponse

interface DigitalWalletTokenRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimulationDigitalWalletTokenRequestCreateResponse

    /**
     * A view of [DigitalWalletTokenRequestService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/digital_wallet_token_requests`, but is
         * otherwise the same as [DigitalWalletTokenRequestService.create].
         */
        @MustBeClosed
        fun create(
            params: SimulationDigitalWalletTokenRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimulationDigitalWalletTokenRequestCreateResponse>
    }
}
