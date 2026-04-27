// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxaddresses.LockboxAddress
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressListPageAsync
import com.increase.api.models.lockboxaddresses.LockboxAddressListParams
import com.increase.api.models.lockboxaddresses.LockboxAddressRetrieveParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams

interface LockboxAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxAddressServiceAsync

    /** Create a Lockbox Address */
    suspend fun create(
        params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): LockboxAddress =
        create(LockboxAddressCreateParams.none(), requestOptions)

    /** Retrieve a Lockbox Address */
    suspend fun retrieve(
        lockboxAddressId: String,
        params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress =
        retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LockboxAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see retrieve */
    suspend fun retrieve(lockboxAddressId: String, requestOptions: RequestOptions): LockboxAddress =
        retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Address */
    suspend fun update(
        lockboxAddressId: String,
        params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress =
        update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LockboxAddressUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see update */
    suspend fun update(lockboxAddressId: String, requestOptions: RequestOptions): LockboxAddress =
        update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

    /** List Lockbox Addresses */
    suspend fun list(
        params: LockboxAddressListParams = LockboxAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddressListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LockboxAddressListPageAsync =
        list(LockboxAddressListParams.none(), requestOptions)

    /**
     * A view of [LockboxAddressServiceAsync] that provides access to raw HTTP responses for each
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
        ): LockboxAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<LockboxAddress> =
            create(LockboxAddressCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            lockboxAddressId: String,
            params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress> =
            retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LockboxAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> =
            retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            lockboxAddressId: String,
            params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress> =
            update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LockboxAddressUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> =
            update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LockboxAddressListParams = LockboxAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddressListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LockboxAddressListPageAsync> =
            list(LockboxAddressListParams.none(), requestOptions)
    }
}
