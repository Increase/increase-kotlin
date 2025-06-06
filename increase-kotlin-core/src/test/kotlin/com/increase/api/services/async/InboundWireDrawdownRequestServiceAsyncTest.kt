// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireDrawdownRequestServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestServiceAsync = client.inboundWireDrawdownRequests()

        val inboundWireDrawdownRequest =
            inboundWireDrawdownRequestServiceAsync.retrieve(
                "inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e"
            )

        inboundWireDrawdownRequest.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestServiceAsync = client.inboundWireDrawdownRequests()

        val page = inboundWireDrawdownRequestServiceAsync.list()

        page.response().validate()
    }
}
