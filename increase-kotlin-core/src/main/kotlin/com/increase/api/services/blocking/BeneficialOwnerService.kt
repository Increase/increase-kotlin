// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.beneficialowners.BeneficialOwnerListPage
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner

interface BeneficialOwnerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BeneficialOwnerService

    /** Retrieve a Beneficial Owner */
    fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner =
        retrieve(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** List Beneficial Owners */
    fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPage

    /**
     * A view of [BeneficialOwnerService] that provides access to raw HTTP responses for each
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
        ): BeneficialOwnerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entity_beneficial_owners`, but is otherwise the
         * same as [BeneficialOwnerService.list].
         */
        @MustBeClosed
        fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPage>
    }
}
