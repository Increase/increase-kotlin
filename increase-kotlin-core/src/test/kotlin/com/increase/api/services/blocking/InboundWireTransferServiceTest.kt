// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundWireTransferServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.inboundWireTransfers()
        val inboundWireTransfer =
            inboundWireTransferService.retrieve(
                InboundWireTransferRetrieveParams.builder()
                    .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .build()
            )
        println(inboundWireTransfer)
        inboundWireTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.inboundWireTransfers()
        val inboundWireTransferList =
            inboundWireTransferService.list(InboundWireTransferListParams.builder().build())
        println(inboundWireTransferList)
        inboundWireTransferList.data().forEach { it.validate() }
    }
}
