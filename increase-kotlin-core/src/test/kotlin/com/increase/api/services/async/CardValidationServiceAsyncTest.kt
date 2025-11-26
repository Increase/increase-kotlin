// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardValidationServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val cardValidation =
            cardValidationServiceAsync.create(
                CardValidationCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                    .merchantCategoryCode("1234")
                    .merchantCityName("New York")
                    .merchantName("Acme Corp")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
                    .cardholderFirstName("Dee")
                    .cardholderLastName("Hock")
                    .cardholderMiddleName("Ward")
                    .cardholderPostalCode("10045")
                    .cardholderStreetAddress("33 Liberty Street")
                    .build()
            )

        cardValidation.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val cardValidation =
            cardValidationServiceAsync.retrieve("outbound_card_validation_qqlzagpc6v1x2gcdhe24")

        cardValidation.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val page = cardValidationServiceAsync.list()

        page.response().validate()
    }
}
