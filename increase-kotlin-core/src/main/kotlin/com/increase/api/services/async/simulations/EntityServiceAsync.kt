// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.simulations.entities.EntityValidationParams

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
     * Simulates setting an [Entity](#entities)'s validation under the managed compliance regime.
     * Any existing managed compliance validation on the Entity will be marked as no longer current.
     */
    suspend fun validation(
        entityId: String,
        params: EntityValidationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = validation(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see validation */
    suspend fun validation(
        params: EntityValidationParams,
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
         * Returns a raw HTTP response for `post /simulations/entities/{entity_id}/validation`, but
         * is otherwise the same as [EntityServiceAsync.validation].
         */
        @MustBeClosed
        suspend fun validation(
            entityId: String,
            params: EntityValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            validation(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see validation */
        @MustBeClosed
        suspend fun validation(
            params: EntityValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>
    }
}
