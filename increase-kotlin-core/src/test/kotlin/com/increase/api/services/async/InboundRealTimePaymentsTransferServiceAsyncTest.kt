// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransfer =
            inboundRealTimePaymentsTransferServiceAsync.retrieve(
                InboundRealTimePaymentsTransferRetrieveParams.builder()
                    .inboundRealTimePaymentsTransferId(
                        "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                    )
                    .build()
            )

        inboundRealTimePaymentsTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val page = inboundRealTimePaymentsTransferServiceAsync.list()

        page.response().validate()
    }
}
