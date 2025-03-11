// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPageAsync
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card */
    suspend fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Retrieve a Physical Card */
    suspend fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Update a Physical Card */
    suspend fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** List Physical Cards */
    suspend fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PhysicalCardListPageAsync =
        list(PhysicalCardListParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PhysicalCardListPageAsync> =
            list(PhysicalCardListParams.none(), requestOptions)
    }
}
