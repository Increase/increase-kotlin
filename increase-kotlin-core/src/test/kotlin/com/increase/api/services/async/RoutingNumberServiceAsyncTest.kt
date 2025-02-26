// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.RoutingNumberListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingNumberServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routingNumberServiceAsync = client.routingNumbers()

        val page =
            routingNumberServiceAsync.list(
                RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
            )

        page.response().validate()
    }
}
