// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams

interface InboundWireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundWireDrawdownRequestServiceAsync

    /** Retrieve an Inbound Wire Drawdown Request */
    suspend fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest =
        retrieve(
            params.toBuilder().inboundWireDrawdownRequestId(inboundWireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest

    /** @see retrieve */
    suspend fun retrieve(
        inboundWireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequest =
        retrieve(
            inboundWireDrawdownRequestId,
            InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Wire Drawdown Requests */
    suspend fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequestListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): InboundWireDrawdownRequestListPageAsync =
        list(InboundWireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [InboundWireDrawdownRequestServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundWireDrawdownRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}`, but is otherwise the
         * same as [InboundWireDrawdownRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(
                params
                    .toBuilder()
                    .inboundWireDrawdownRequestId(inboundWireDrawdownRequestId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            inboundWireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(
                inboundWireDrawdownRequestId,
                InboundWireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_wire_drawdown_requests`, but is otherwise
         * the same as [InboundWireDrawdownRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequestListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundWireDrawdownRequestListPageAsync> =
            list(InboundWireDrawdownRequestListParams.none(), requestOptions)
    }
}
