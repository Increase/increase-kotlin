// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.entities.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityConfirmParams
import com.increase.api.models.entities.EntityCreateBeneficialOwnerParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityListPageAsync
import com.increase.api.models.entities.EntityListParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateAddressParams
import com.increase.api.models.entities.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.entities.EntityUpdateIndustryCodeParams
import com.increase.api.models.entities.EntityUpdateParams

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntityServiceAsync

    /** Create an Entity */
    suspend fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Retrieve an Entity */
    suspend fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see retrieve */
    suspend fun retrieve(entityId: String, requestOptions: RequestOptions): Entity =
        retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

    /** Update an Entity */
    suspend fun update(
        entityId: String,
        params: EntityUpdateParams = EntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = update(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: EntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see update */
    suspend fun update(entityId: String, requestOptions: RequestOptions): Entity =
        update(entityId, EntityUpdateParams.none(), requestOptions)

    /** List Entities */
    suspend fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EntityListPageAsync =
        list(EntityListParams.none(), requestOptions)

    /** Archive an Entity */
    suspend fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = archive(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see archive */
    suspend fun archive(entityId: String, requestOptions: RequestOptions): Entity =
        archive(entityId, EntityArchiveParams.none(), requestOptions)

    /** Archive a beneficial owner for a corporate Entity */
    suspend fun archiveBeneficialOwner(
        entityId: String,
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity =
        archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see archiveBeneficialOwner */
    suspend fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    suspend fun confirm(
        entityId: String,
        params: EntityConfirmParams = EntityConfirmParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see confirm */
    suspend fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see confirm */
    suspend fun confirm(entityId: String, requestOptions: RequestOptions): Entity =
        confirm(entityId, EntityConfirmParams.none(), requestOptions)

    /** Create a beneficial owner for a corporate Entity */
    suspend fun createBeneficialOwner(
        entityId: String,
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see createBeneficialOwner */
    suspend fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update a Natural Person or Corporation's address */
    suspend fun updateAddress(
        entityId: String,
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateAddress */
    suspend fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    suspend fun updateBeneficialOwnerAddress(
        entityId: String,
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity =
        updateBeneficialOwnerAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateBeneficialOwnerAddress */
    suspend fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the industry code for a corporate Entity */
    suspend fun updateIndustryCode(
        entityId: String,
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateIndustryCode */
    suspend fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entities`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `get /entities/{entity_id}`, but is otherwise the same as
         * [EntityServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            entityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> = retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /entities/{entity_id}`, but is otherwise the same
         * as [EntityServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            entityId: String,
            params: EntityUpdateParams = EntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            update(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            entityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> = update(entityId, EntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<EntityListPageAsync> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive`, but is otherwise
         * the same as [EntityServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            archive(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            entityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> = archive(entityId, EntityArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive_beneficial_owner`,
         * but is otherwise the same as [EntityServiceAsync.archiveBeneficialOwner].
         */
        @MustBeClosed
        suspend fun archiveBeneficialOwner(
            entityId: String,
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see archiveBeneficialOwner */
        @MustBeClosed
        suspend fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/confirm`, but is otherwise
         * the same as [EntityServiceAsync.confirm].
         */
        @MustBeClosed
        suspend fun confirm(
            entityId: String,
            params: EntityConfirmParams = EntityConfirmParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        suspend fun confirm(
            params: EntityConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see confirm */
        @MustBeClosed
        suspend fun confirm(
            entityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> = confirm(entityId, EntityConfirmParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/create_beneficial_owner`, but
         * is otherwise the same as [EntityServiceAsync.createBeneficialOwner].
         */
        @MustBeClosed
        suspend fun createBeneficialOwner(
            entityId: String,
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see createBeneficialOwner */
        @MustBeClosed
        suspend fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_address`, but is
         * otherwise the same as [EntityServiceAsync.updateAddress].
         */
        @MustBeClosed
        suspend fun updateAddress(
            entityId: String,
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateAddress */
        @MustBeClosed
        suspend fun updateAddress(
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post
         * /entities/{entity_id}/update_beneficial_owner_address`, but is otherwise the same as
         * [EntityServiceAsync.updateBeneficialOwnerAddress].
         */
        @MustBeClosed
        suspend fun updateBeneficialOwnerAddress(
            entityId: String,
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateBeneficialOwnerAddress(
                params.toBuilder().entityId(entityId).build(),
                requestOptions,
            )

        /** @see updateBeneficialOwnerAddress */
        @MustBeClosed
        suspend fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_industry_code`, but is
         * otherwise the same as [EntityServiceAsync.updateIndustryCode].
         */
        @MustBeClosed
        suspend fun updateIndustryCode(
            entityId: String,
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateIndustryCode */
        @MustBeClosed
        suspend fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>
    }
}
