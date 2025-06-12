// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckTransferServiceAsync

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    suspend fun mail(
        checkTransferId: String,
        params: CheckTransferMailParams = CheckTransferMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [mail] */
    suspend fun mail(
        params: CheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see [mail] */
    suspend fun mail(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_transfers/{check_transfer_id}/mail`, but is otherwise the same as
         * [CheckTransferServiceAsync.mail].
         */
        @MustBeClosed
        suspend fun mail(
            checkTransferId: String,
            params: CheckTransferMailParams = CheckTransferMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [mail] */
        @MustBeClosed
        suspend fun mail(
            params: CheckTransferMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see [mail] */
        @MustBeClosed
        suspend fun mail(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)
    }
}
