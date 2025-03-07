// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPage
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams

interface WireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Drawdown Request */
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** Retrieve a Wire Drawdown Request */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** List Wire Drawdown Requests */
    fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequestListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): WireDrawdownRequestListPage =
        list(WireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestService.create].
         */
        @MustBeClosed
        fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests/{wire_drawdown_request_id}`,
         * but is otherwise the same as [WireDrawdownRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestService.list].
         */
        @MustBeClosed
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequestListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireDrawdownRequestListPage> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
