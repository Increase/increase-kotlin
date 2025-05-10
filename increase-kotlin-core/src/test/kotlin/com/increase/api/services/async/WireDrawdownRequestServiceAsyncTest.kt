// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestServiceAsync.create(
                WireDrawdownRequestCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(10000L)
                    .messageToRecipient("Invoice 29582")
                    .recipientAccountNumber("987654321")
                    .recipientName("Ian Crease")
                    .recipientRoutingNumber("101050001")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .recipientAddressLine1("33 Liberty Street")
                    .recipientAddressLine2("New York, NY, 10045")
                    .recipientAddressLine3("x")
                    .build()
            )

        wireDrawdownRequest.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestServiceAsync.retrieve("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val page = wireDrawdownRequestServiceAsync.list()

        page.response().validate()
    }
}
