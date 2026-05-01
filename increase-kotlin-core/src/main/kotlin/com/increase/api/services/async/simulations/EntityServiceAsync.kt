// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.simulations.entities.EntityUpdateValidationParams

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

    /**
     * Simulate updates to an
     * [Entity's validation](/documentation/api/entities#entity-object.validation). In production,
     * Know Your Customer validations
     * [run automatically](/documentation/entity-validation#entity-validation) for eligible
     * programs. While developing, use this API to simulate issues with information submissions.
     */
    suspend fun updateValidation(
        entityId: String,
        params: EntityUpdateValidationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = updateValidation(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateValidation */
    suspend fun updateValidation(
        params: EntityUpdateValidationParams,
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
         * Returns a raw HTTP response for `post
         * /simulations/entities/{entity_id}/update_validation`, but is otherwise the same as
         * [EntityServiceAsync.updateValidation].
         */
        @MustBeClosed
        suspend fun updateValidation(
            entityId: String,
            params: EntityUpdateValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateValidation(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateValidation */
        @MustBeClosed
        suspend fun updateValidation(
            params: EntityUpdateValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>
    }
}
