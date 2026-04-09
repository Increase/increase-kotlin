// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityOnboardingSessionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionServiceAsync = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionServiceAsync.create(
                EntityOnboardingSessionCreateParams.builder()
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .redirectUrl("https://example.com/onboarding/session")
                    .entityId("entity_id")
                    .build()
            )

        entityOnboardingSession.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionServiceAsync = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionServiceAsync.retrieve(
                "entity_onboarding_session_wid2ug11fsmvh3k9hymd"
            )

        entityOnboardingSession.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionServiceAsync = client.entityOnboardingSessions()

        val page = entityOnboardingSessionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun expire() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionServiceAsync = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionServiceAsync.expire(
                "entity_onboarding_session_wid2ug11fsmvh3k9hymd"
            )

        entityOnboardingSession.validate()
    }
}
