// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.InboundWireTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundWireTransferServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferServiceAsync.retrieve(
                InboundWireTransferRetrieveParams.builder()
                    .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .build()
            )

        inboundWireTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val page = inboundWireTransferServiceAsync.list()

        page.response().validate()
    }
}
