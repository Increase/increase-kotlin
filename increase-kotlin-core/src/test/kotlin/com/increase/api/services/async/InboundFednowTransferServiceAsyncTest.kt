// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFednowTransferServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferServiceAsync = client.inboundFednowTransfers()

        val inboundFednowTransfer =
            inboundFednowTransferServiceAsync.retrieve(
                "inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20"
            )

        inboundFednowTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferServiceAsync = client.inboundFednowTransfers()

        val page = inboundFednowTransferServiceAsync.list()

        page.response().validate()
    }
}
