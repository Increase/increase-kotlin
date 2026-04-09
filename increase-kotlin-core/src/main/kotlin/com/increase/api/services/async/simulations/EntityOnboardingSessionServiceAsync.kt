// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.simulations.entityonboardingsessions.EntityOnboardingSessionSubmitParams

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

    /**
     * Simulates the submission of an [Entity Onboarding Session](#entity-onboarding-sessions). This
     * session must have a `status` of `active`. After submission, the session will transition to
     * `expired` and a new Entity will be created.
     */
    suspend fun submit(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession =
        submit(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see submit */
    suspend fun submit(
        params: EntityOnboardingSessionSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see submit */
    suspend fun submit(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        submit(
            entityOnboardingSessionId,
            EntityOnboardingSessionSubmitParams.none(),
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
         * Returns a raw HTTP response for `post
         * /simulations/entity_onboarding_sessions/{entity_onboarding_session_id}/submit`, but is
         * otherwise the same as [EntityOnboardingSessionServiceAsync.submit].
         */
        @MustBeClosed
        suspend fun submit(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionSubmitParams =
                EntityOnboardingSessionSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession> =
            submit(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see submit */
        @MustBeClosed
        suspend fun submit(
            params: EntityOnboardingSessionSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see submit */
        @MustBeClosed
        suspend fun submit(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> =
            submit(
                entityOnboardingSessionId,
                EntityOnboardingSessionSubmitParams.none(),
                requestOptions,
            )
    }
}
