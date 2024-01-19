// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
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
                InboundWireTransferRetrieveParams.builder().inboundWireTransferId("string").build()
            )
        println(inboundWireTransfer)
        inboundWireTransfer.validate()
    }
}
