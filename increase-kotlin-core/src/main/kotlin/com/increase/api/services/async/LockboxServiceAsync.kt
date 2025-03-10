// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPageAsync
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

interface LockboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Lockbox */
    suspend fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Retrieve a Lockbox */
    suspend fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Update a Lockbox */
    suspend fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** List Lockboxes */
    suspend fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LockboxListPageAsync =
        list(LockboxListParams.none(), requestOptions)

    /**
     * A view of [LockboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxListPageAsync> =
            list(LockboxListParams.none(), requestOptions)
    }
}
