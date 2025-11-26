// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthConnectionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionServiceAsync = client.oauthConnections()

        val oauthConnection =
            oauthConnectionServiceAsync.retrieve("connection_dauknoksyr4wilz4e6my")

        oauthConnection.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionServiceAsync = client.oauthConnections()

        val oauthConnections =
            oauthConnectionServiceAsync.list(
                OAuthConnectionListParams.builder()
                    .cursor("cursor")
                    .limit(1L)
                    .oauthApplicationId("oauth_application_id")
                    .status(
                        OAuthConnectionListParams.Status.builder()
                            .addIn(OAuthConnectionListParams.Status.In.ACTIVE)
                            .build()
                    )
                    .build()
            )

        oauthConnections.validate()
    }
}
