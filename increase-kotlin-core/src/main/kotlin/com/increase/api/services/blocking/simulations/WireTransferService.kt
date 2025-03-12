// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.wiretransfers.WireTransferReverseParams
import com.increase.api.models.simulations.wiretransfers.WireTransferSubmitParams
import com.increase.api.models.wiretransfers.WireTransfer

interface WireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal
     * Reserve due to error conditions. This will also create a
     * [Transaction](#transaction) to account for the returned funds. This Wire
     * Transfer must first have a `status` of `complete`.
     */
    fun reverse(params: WireTransferReverseParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_creating`.
     */
    fun submit(params: WireTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer

    /**
     * A view of [WireTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/wire_transfers/{wire_transfer_id}/reverse`, but is otherwise
         * the same as [WireTransferService.reverse].
         */
        @MustBeClosed
        fun reverse(params: WireTransferReverseParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for
         * `post /simulations/wire_transfers/{wire_transfer_id}/submit`, but is otherwise
         * the same as [WireTransferService.submit].
         */
        @MustBeClosed
        fun submit(params: WireTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WireTransfer>
    }
}
