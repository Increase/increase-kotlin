// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CardPurchaseSupplementListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPurchaseSupplementServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.cardPurchaseSupplements()
        val cardPurchaseSupplement =
            cardPurchaseSupplementService.retrieve(
                CardPurchaseSupplementRetrieveParams.builder()
                    .cardPurchaseSupplementId("card_purchase_supplement_id")
                    .build()
            )
        println(cardPurchaseSupplement)
        cardPurchaseSupplement.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.cardPurchaseSupplements()
        val cardPurchaseSupplementList =
            cardPurchaseSupplementService.list(CardPurchaseSupplementListParams.builder().build())
        println(cardPurchaseSupplementList)
        cardPurchaseSupplementList.data().forEach { it.validate() }
    }
}
