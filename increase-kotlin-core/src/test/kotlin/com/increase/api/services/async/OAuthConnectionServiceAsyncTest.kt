// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams
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
            oauthConnectionServiceAsync.retrieve(
                OAuthConnectionRetrieveParams.builder()
                    .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
                    .build()
            )

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

        val page = oauthConnectionServiceAsync.list()

        page.response().validate()
    }
}
