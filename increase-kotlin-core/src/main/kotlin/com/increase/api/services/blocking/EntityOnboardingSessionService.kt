// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionExpireParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPage
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionRetrieveParams

interface EntityOnboardingSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntityOnboardingSessionService

    /** Create an Entity Onboarding Session */
    fun create(
        params: EntityOnboardingSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** Retrieve an Entity Onboarding Session */
    fun retrieve(
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
    fun retrieve(
        params: EntityOnboardingSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see retrieve */
    fun retrieve(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        retrieve(
            entityOnboardingSessionId,
            EntityOnboardingSessionRetrieveParams.none(),
            requestOptions,
        )

    /** List Entity Onboarding Session */
    fun list(
        params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSessionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): EntityOnboardingSessionListPage =
        list(EntityOnboardingSessionListParams.none(), requestOptions)

    /** Expire an Entity Onboarding Session */
    fun expire(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionExpireParams = EntityOnboardingSessionExpireParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession =
        expire(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see expire */
    fun expire(
        params: EntityOnboardingSessionExpireParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see expire */
    fun expire(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        expire(
            entityOnboardingSessionId,
            EntityOnboardingSessionExpireParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntityOnboardingSessionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityOnboardingSessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entity_onboarding_sessions`, but is otherwise the
         * same as [EntityOnboardingSessionService.create].
         */
        @MustBeClosed
        fun create(
            params: EntityOnboardingSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /**
         * Returns a raw HTTP response for `get
         * /entity_onboarding_sessions/{entity_onboarding_session_id}`, but is otherwise the same as
         * [EntityOnboardingSessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: EntityOnboardingSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
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
         * same as [EntityOnboardingSessionService.list].
         */
        @MustBeClosed
        fun list(
            params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSessionListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityOnboardingSessionListPage> =
            list(EntityOnboardingSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /entity_onboarding_sessions/{entity_onboarding_session_id}/expire`, but is otherwise the
         * same as [EntityOnboardingSessionService.expire].
         */
        @MustBeClosed
        fun expire(
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
        fun expire(
            params: EntityOnboardingSessionExpireParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see expire */
        @MustBeClosed
        fun expire(
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
