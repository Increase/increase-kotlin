// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireTransferServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferServiceAsync.retrieve("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")

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

    @Test
    suspend fun reverse() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferServiceAsync.reverse(
                InboundWireTransferReverseParams.builder()
                    .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .reason(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
                    .build()
            )

        inboundWireTransfer.validate()
    }
}
