// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.checkbooks.CheckbookCreateParams
import com.increase.api.models.checkbooks.CheckbookListPageAsync
import com.increase.api.models.checkbooks.CheckbookListParams
import com.increase.api.models.checkbooks.CheckbookRetrieveParams
import com.increase.api.models.checkbooks.CheckbookStopParams

interface CheckbookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckbookServiceAsync

    /** Create a Checkbook */
    suspend fun create(
        params: CheckbookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** Retrieve a Checkbook */
    suspend fun retrieve(
        checkbookId: String,
        params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CheckbookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see retrieve */
    suspend fun retrieve(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

    /** List Checkbooks */
    suspend fun list(
        params: CheckbookListParams = CheckbookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CheckbookListPageAsync =
        list(CheckbookListParams.none(), requestOptions)

    /**
     * Stop a Checkbook. Stopping a Checkbook stops all of its checks that have not yet been
     * deposited.
     */
    suspend fun stop(
        checkbookId: String,
        params: CheckbookStopParams = CheckbookStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see stop */
    suspend fun stop(
        params: CheckbookStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see stop */
    suspend fun stop(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        stop(checkbookId, CheckbookStopParams.none(), requestOptions)

    /**
     * A view of [CheckbookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckbookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkbooks`, but is otherwise the same as
         * [CheckbookServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CheckbookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /**
         * Returns a raw HTTP response for `get /checkbooks/{checkbook_id}`, but is otherwise the
         * same as [CheckbookServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            checkbookId: String,
            params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CheckbookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> =
            retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbooks`, but is otherwise the same as
         * [CheckbookServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CheckbookListParams = CheckbookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CheckbookListPageAsync> =
            list(CheckbookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbooks/{checkbook_id}/stop`, but is otherwise
         * the same as [CheckbookServiceAsync.stop].
         */
        @MustBeClosed
        suspend fun stop(
            checkbookId: String,
            params: CheckbookStopParams = CheckbookStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        suspend fun stop(
            params: CheckbookStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see stop */
        @MustBeClosed
        suspend fun stop(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> =
            stop(checkbookId, CheckbookStopParams.none(), requestOptions)
    }
}
