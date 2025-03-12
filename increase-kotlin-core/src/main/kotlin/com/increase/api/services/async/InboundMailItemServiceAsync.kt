// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemListPageAsync
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Mail Item */
    suspend fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundMailItem

    /** List Inbound Mail Items */
    suspend fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundMailItemListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InboundMailItemListPageAsync = list(InboundMailItemListParams.none(), requestOptions)

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_mail_items/{inbound_mail_item_id}`, but is otherwise the same as
         * [InboundMailItemServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundMailItem>

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the
         * same as [InboundMailItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundMailItemListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<InboundMailItemListPageAsync> = list(InboundMailItemListParams.none(), requestOptions)
    }
}
