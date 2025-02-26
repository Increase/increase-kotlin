// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.OAuthApplicationRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OAuthApplicationServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationServiceAsync = client.oauthApplications()

        val oauthApplication =
            oauthApplicationServiceAsync.retrieve(
                OAuthApplicationRetrieveParams.builder()
                    .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                    .build()
            )

        oauthApplication.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationServiceAsync = client.oauthApplications()

        val page = oauthApplicationServiceAsync.list()

        page.response().validate()
    }
}
