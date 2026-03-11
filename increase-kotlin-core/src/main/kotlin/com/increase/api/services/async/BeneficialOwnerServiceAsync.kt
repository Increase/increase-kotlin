// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner

interface BeneficialOwnerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BeneficialOwnerServiceAsync

    /** Retrieve a Beneficial Owner */
    suspend fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner =
        retrieve(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner

    /** @see retrieve */
    suspend fun retrieve(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update a Beneficial Owner */
    suspend fun update(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner =
        update(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see update */
    suspend fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner

    /** @see update */
    suspend fun update(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

    /** List Beneficial Owners */
    suspend fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPageAsync

    /**
     * A view of [BeneficialOwnerServiceAsync] that provides access to raw HTTP responses for each
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
        ): BeneficialOwnerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            update(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> =
            update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entity_beneficial_owners`, but is otherwise the
         * same as [BeneficialOwnerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPageAsync>
    }
}
