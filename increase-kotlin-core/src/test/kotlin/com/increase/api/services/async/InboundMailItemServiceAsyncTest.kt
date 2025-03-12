// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemServiceAsync = client.inboundMailItems()

        val inboundMailItem =
            inboundMailItemServiceAsync.retrieve(
                InboundMailItemRetrieveParams.builder()
                    .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                    .build()
            )

        inboundMailItem.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemServiceAsync = client.inboundMailItems()

        val page = inboundMailItemServiceAsync.list()

        page.response().validate()
    }
}
