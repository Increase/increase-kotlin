// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.simulations.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferCreateParams

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an
     * [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to
     * your account. Real-Time Payments are a beta feature.
     */
    suspend fun create(params: InboundRealTimePaymentsTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): InboundRealTimePaymentsTransfer

    /**
     * A view of [InboundRealTimePaymentsTransferServiceAsync] that provides access to
     * raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/inbound_real_time_payments_transfers`, but is otherwise the
         * same as [InboundRealTimePaymentsTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: InboundRealTimePaymentsTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundRealTimePaymentsTransfer>
    }
}
