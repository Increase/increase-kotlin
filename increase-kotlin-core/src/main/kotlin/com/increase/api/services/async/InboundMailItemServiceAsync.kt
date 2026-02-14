// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemActionParams
import com.increase.api.models.inboundmailitems.InboundMailItemListPageAsync
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundMailItemServiceAsync

    /** Retrieve an Inbound Mail Item */
    suspend fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem =
        retrieve(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /** @see retrieve */
    suspend fun retrieve(
        inboundMailItemId: String,
        requestOptions: RequestOptions,
    ): InboundMailItem =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

    /** List Inbound Mail Items */
    suspend fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItemListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): InboundMailItemListPageAsync =
        list(InboundMailItemListParams.none(), requestOptions)

    /** Action an Inbound Mail Item */
    suspend fun action(
        inboundMailItemId: String,
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem =
        action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see action */
    suspend fun action(
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP responses for each
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
        ): InboundMailItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items/{inbound_mail_item_id}`, but is
         * otherwise the same as [InboundMailItemServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem> =
            retrieve(
                params.toBuilder().inboundMailItemId(inboundMailItemId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            inboundMailItemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundMailItem> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the same as
         * [InboundMailItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItemListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundMailItemListPageAsync> =
            list(InboundMailItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /inbound_mail_items/{inbound_mail_item_id}/action`,
         * but is otherwise the same as [InboundMailItemServiceAsync.action].
         */
        @MustBeClosed
        suspend fun action(
            inboundMailItemId: String,
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem> =
            action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

        /** @see action */
        @MustBeClosed
        suspend fun action(
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem>
    }
}
