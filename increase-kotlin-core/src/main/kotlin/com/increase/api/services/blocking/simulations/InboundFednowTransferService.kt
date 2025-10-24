// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.simulations.inboundfednowtransfers.InboundFednowTransferCreateParams

interface InboundFednowTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundFednowTransferService

    /** Simulates an [Inbound FedNow Transfer](#inbound-fednow-transfers) to your account. */
    fun create(
        params: InboundFednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransfer

    /**
     * A view of [InboundFednowTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundFednowTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_fednow_transfers`, but is
         * otherwise the same as [InboundFednowTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: InboundFednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransfer>
    }
}
