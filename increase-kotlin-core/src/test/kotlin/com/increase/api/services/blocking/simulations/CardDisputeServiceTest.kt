// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDisputeServiceTest {

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.simulations().cardDisputes()

        val cardDispute =
            cardDisputeService.action(
                CardDisputeActionParams.builder()
                    .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                    .status(CardDisputeActionParams.Status.REJECTED)
                    .explanation("This was a valid recurring transaction")
                    .build()
            )

        cardDispute.validate()
    }
}
