// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPushTransferServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferServiceAsync.create(
                CardPushTransferCreateParams.builder()
                    .amount(100L)
                    .businessApplicationIdentifier(
                        CardPushTransferCreateParams.BusinessApplicationIdentifier
                            .FUNDS_DISBURSEMENT
                    )
                    .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                    .merchantCategoryCode("1234")
                    .merchantCityName("New York")
                    .merchantName("Acme Corp")
                    .merchantNamePrefix("Acme")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
                    .recipientName("Ian Crease")
                    .senderAddressCity("New York")
                    .senderAddressLine1("33 Liberty Street")
                    .senderAddressPostalCode("10045")
                    .senderAddressState("NY")
                    .senderName("Ian Crease")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .requireApproval(true)
                    .build()
            )

        cardPushTransfer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferServiceAsync.retrieve(
                "outbound_card_push_transfer_e0z9rdpamraczh4tvwye"
            )

        cardPushTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val page = cardPushTransferServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun approve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferServiceAsync.approve("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        cardPushTransfer.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferServiceAsync.cancel("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        cardPushTransfer.validate()
    }
}
