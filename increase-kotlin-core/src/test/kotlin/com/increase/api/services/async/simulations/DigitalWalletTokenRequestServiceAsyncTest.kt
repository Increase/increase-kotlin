// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenRequestServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestServiceAsync =
            client.simulations().digitalWalletTokenRequests()

        val digitalWalletTokenRequest =
            digitalWalletTokenRequestServiceAsync.create(
                SimulationDigitalWalletTokenRequestCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .build()
            )

        digitalWalletTokenRequest.validate()
    }
}
