// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPage
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

interface LockboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxService

    /** Create a Lockbox */
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Retrieve a Lockbox */
    fun retrieve(
        lockboxId: String,
        params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox = retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** @see retrieve */
    fun retrieve(lockboxId: String, requestOptions: RequestOptions): Lockbox =
        retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

    /** Update a Lockbox */
    fun update(
        lockboxId: String,
        params: LockboxUpdateParams = LockboxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox = update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see update */
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** @see update */
    fun update(lockboxId: String, requestOptions: RequestOptions): Lockbox =
        update(lockboxId, LockboxUpdateParams.none(), requestOptions)

    /** List Lockboxes */
    fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): LockboxListPage =
        list(LockboxListParams.none(), requestOptions)

    /** A view of [LockboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxService.create].
         */
        @MustBeClosed
        fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            lockboxId: String,
            params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox> =
            retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(lockboxId: String, requestOptions: RequestOptions): HttpResponseFor<Lockbox> =
            retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxService.update].
         */
        @MustBeClosed
        fun update(
            lockboxId: String,
            params: LockboxUpdateParams = LockboxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox> =
            update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /** @see update */
        @MustBeClosed
        fun update(lockboxId: String, requestOptions: RequestOptions): HttpResponseFor<Lockbox> =
            update(lockboxId, LockboxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxService.list].
         */
        @MustBeClosed
        fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxListPage> =
            list(LockboxListParams.none(), requestOptions)
    }
}
