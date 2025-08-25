// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceAsyncTest {

    @Test
    suspend fun refuse() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.simulations().wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestServiceAsync.refuse("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }

    @Test
    suspend fun submit() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.simulations().wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestServiceAsync.submit("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }
}
