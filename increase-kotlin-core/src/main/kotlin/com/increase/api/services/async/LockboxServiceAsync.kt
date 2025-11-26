// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxListResponse
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

interface LockboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxServiceAsync

    /** Create a Lockbox */
    suspend fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Retrieve a Lockbox */
    suspend fun retrieve(
        lockboxId: String,
        params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox = retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** @see retrieve */
    suspend fun retrieve(lockboxId: String, requestOptions: RequestOptions): Lockbox =
        retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

    /** Update a Lockbox */
    suspend fun update(
        lockboxId: String,
        params: LockboxUpdateParams = LockboxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox = update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** @see update */
    suspend fun update(lockboxId: String, requestOptions: RequestOptions): Lockbox =
        update(lockboxId, LockboxUpdateParams.none(), requestOptions)

    /** List Lockboxes */
    suspend fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LockboxListResponse =
        list(LockboxListParams.none(), requestOptions)

    /**
     * A view of [LockboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LockboxServiceAsync.WithRawResponse

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
            lockboxId: String,
            params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox> =
            retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            lockboxId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> =
            retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            lockboxId: String,
            params: LockboxUpdateParams = LockboxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox> =
            update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            lockboxId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> = update(lockboxId, LockboxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxListResponse> =
            list(LockboxListParams.none(), requestOptions)
    }
}
