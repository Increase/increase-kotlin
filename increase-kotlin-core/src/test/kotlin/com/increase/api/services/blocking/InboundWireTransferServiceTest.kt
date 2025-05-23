// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireTransferServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferService.retrieve("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")

        inboundWireTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.inboundWireTransfers()

        val page = inboundWireTransferService.list()

        page.response().validate()
    }

    @Test
    fun reverse() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferService.reverse(
                InboundWireTransferReverseParams.builder()
                    .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .reason(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
                    .build()
            )

        inboundWireTransfer.validate()
    }
}
