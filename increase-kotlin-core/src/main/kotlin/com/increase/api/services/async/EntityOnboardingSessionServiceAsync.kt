// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionExpireParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPageAsync
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionRetrieveParams

interface EntityOnboardingSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntityOnboardingSessionServiceAsync

    /** Create an Entity Onboarding Session */
    suspend fun create(
        params: EntityOnboardingSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** Retrieve an Entity Onboarding Session */
    suspend fun retrieve(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionRetrieveParams =
            EntityOnboardingSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession =
        retrieve(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: EntityOnboardingSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see retrieve */
    suspend fun retrieve(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        retrieve(
            entityOnboardingSessionId,
            EntityOnboardingSessionRetrieveParams.none(),
            requestOptions,
        )

    /** List Entity Onboarding Session */
    suspend fun list(
        params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSessionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EntityOnboardingSessionListPageAsync =
        list(EntityOnboardingSessionListParams.none(), requestOptions)

    /** Expire an Entity Onboarding Session */
    suspend fun expire(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionExpireParams = EntityOnboardingSessionExpireParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession =
        expire(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see expire */
    suspend fun expire(
        params: EntityOnboardingSessionExpireParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see expire */
    suspend fun expire(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        expire(
            entityOnboardingSessionId,
            EntityOnboardingSessionExpireParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntityOnboardingSessionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityOnboardingSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entity_onboarding_sessions`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EntityOnboardingSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /**
         * Returns a raw HTTP response for `get
         * /entity_onboarding_sessions/{entity_onboarding_session_id}`, but is otherwise the same as
         * [EntityOnboardingSessionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionRetrieveParams =
                EntityOnboardingSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession> =
            retrieve(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EntityOnboardingSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> =
            retrieve(
                entityOnboardingSessionId,
                EntityOnboardingSessionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /entity_onboarding_sessions`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSessionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntityOnboardingSessionListPageAsync> =
            list(EntityOnboardingSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /entity_onboarding_sessions/{entity_onboarding_session_id}/expire`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.expire].
         */
        @MustBeClosed
        suspend fun expire(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionExpireParams =
                EntityOnboardingSessionExpireParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession> =
            expire(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see expire */
        @MustBeClosed
        suspend fun expire(
            params: EntityOnboardingSessionExpireParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see expire */
        @MustBeClosed
        suspend fun expire(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> =
            expire(
                entityOnboardingSessionId,
                EntityOnboardingSessionExpireParams.none(),
                requestOptions,
            )
    }
}
