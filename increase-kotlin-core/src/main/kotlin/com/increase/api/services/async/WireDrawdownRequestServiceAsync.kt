// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListPageAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams

interface WireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Drawdown Request */
    suspend fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** Retrieve a Wire Drawdown Request */
    suspend fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** List Wire Drawdown Requests */
    suspend fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequestListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): WireDrawdownRequestListPageAsync =
        list(WireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

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
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequestListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WireDrawdownRequestListPageAsync> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
