// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxaddresses.LockboxAddress
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressListPage
import com.increase.api.models.lockboxaddresses.LockboxAddressListParams
import com.increase.api.models.lockboxaddresses.LockboxAddressRetrieveParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams

interface LockboxAddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxAddressService

    /** Create a Lockbox Address */
    fun create(
        params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see create */
    fun create(requestOptions: RequestOptions): LockboxAddress =
        create(LockboxAddressCreateParams.none(), requestOptions)

    /** Retrieve a Lockbox Address */
    fun retrieve(
        lockboxAddressId: String,
        params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress =
        retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LockboxAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see retrieve */
    fun retrieve(lockboxAddressId: String, requestOptions: RequestOptions): LockboxAddress =
        retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Address */
    fun update(
        lockboxAddressId: String,
        params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress =
        update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see update */
    fun update(
        params: LockboxAddressUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddress

    /** @see update */
    fun update(lockboxAddressId: String, requestOptions: RequestOptions): LockboxAddress =
        update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

    /** List Lockbox Addresses */
    fun list(
        params: LockboxAddressListParams = LockboxAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxAddressListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): LockboxAddressListPage =
        list(LockboxAddressListParams.none(), requestOptions)

    /**
     * A view of [LockboxAddressService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LockboxAddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressService.create].
         */
        @MustBeClosed
        fun create(
            params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<LockboxAddress> =
            create(LockboxAddressCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            lockboxAddressId: String,
            params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress> =
            retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LockboxAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> =
            retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressService.update].
         */
        @MustBeClosed
        fun update(
            lockboxAddressId: String,
            params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress> =
            update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LockboxAddressUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddress>

        /** @see update */
        @MustBeClosed
        fun update(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> =
            update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressService.list].
         */
        @MustBeClosed
        fun list(
            params: LockboxAddressListParams = LockboxAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxAddressListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxAddressListPage> =
            list(LockboxAddressListParams.none(), requestOptions)
    }
}
