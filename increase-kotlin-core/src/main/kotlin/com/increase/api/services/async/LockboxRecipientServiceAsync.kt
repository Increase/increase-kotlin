// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxrecipients.LockboxRecipient
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientListPageAsync
import com.increase.api.models.lockboxrecipients.LockboxRecipientListParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientRetrieveParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams

interface LockboxRecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxRecipientServiceAsync

    /** Create a Lockbox Recipient */
    suspend fun create(
        params: LockboxRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** Retrieve a Lockbox Recipient */
    suspend fun retrieve(
        lockboxRecipientId: String,
        params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient =
        retrieve(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LockboxRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** @see retrieve */
    suspend fun retrieve(
        lockboxRecipientId: String,
        requestOptions: RequestOptions,
    ): LockboxRecipient =
        retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Recipient */
    suspend fun update(
        lockboxRecipientId: String,
        params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient =
        update(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LockboxRecipientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** @see update */
    suspend fun update(
        lockboxRecipientId: String,
        requestOptions: RequestOptions,
    ): LockboxRecipient =
        update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

    /** List Lockbox Recipients */
    suspend fun list(
        params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipientListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LockboxRecipientListPageAsync =
        list(LockboxRecipientListParams.none(), requestOptions)

    /**
     * A view of [LockboxRecipientServiceAsync] that provides access to raw HTTP responses for each
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
        ): LockboxRecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LockboxRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients/{lockbox_recipient_id}`, but is
         * otherwise the same as [LockboxRecipientServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            lockboxRecipientId: String,
            params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient> =
            retrieve(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LockboxRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> =
            retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_recipients/{lockbox_recipient_id}`, but
         * is otherwise the same as [LockboxRecipientServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            lockboxRecipientId: String,
            params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient> =
            update(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LockboxRecipientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> =
            update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipientListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LockboxRecipientListPageAsync> =
            list(LockboxRecipientListParams.none(), requestOptions)
    }
}
