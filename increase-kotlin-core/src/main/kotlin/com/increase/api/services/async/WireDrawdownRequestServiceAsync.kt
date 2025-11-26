// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListResponse
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams

interface WireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WireDrawdownRequestServiceAsync

    /** Create a Wire Drawdown Request */
    suspend fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** Retrieve a Wire Drawdown Request */
    suspend fun retrieve(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest =
        retrieve(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** @see retrieve */
    suspend fun retrieve(
        wireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none(), requestOptions)

    /** List Wire Drawdown Requests */
    suspend fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequestListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): WireDrawdownRequestListResponse =
        list(WireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WireDrawdownRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests/{wire_drawdown_request_id}`,
         * but is otherwise the same as [WireDrawdownRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest> =
            retrieve(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> =
            retrieve(
                wireDrawdownRequestId,
                WireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequestListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WireDrawdownRequestListResponse> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
