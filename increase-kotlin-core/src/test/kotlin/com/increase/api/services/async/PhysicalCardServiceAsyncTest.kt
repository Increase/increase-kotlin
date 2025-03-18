// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCardServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardServiceAsync = client.physicalCards()

        val physicalCard =
            physicalCardServiceAsync.create(
                PhysicalCardCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .cardholder(
                        PhysicalCardCreateParams.Cardholder.builder()
                            .firstName("Ian")
                            .lastName("Crease")
                            .build()
                    )
                    .shipment(
                        PhysicalCardCreateParams.Shipment.builder()
                            .address(
                                PhysicalCardCreateParams.Shipment.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .name("Ian Crease")
                                    .postalCode("10045")
                                    .state("NY")
                                    .line2("Unit 2")
                                    .line3("x")
                                    .phoneNumber("x")
                                    .build()
                            )
                            .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                            .build()
                    )
                    .physicalCardProfileId("physical_card_profile_id")
                    .build()
            )

        physicalCard.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardServiceAsync = client.physicalCards()

        val physicalCard =
            physicalCardServiceAsync.retrieve(
                PhysicalCardRetrieveParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .build()
            )

        physicalCard.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardServiceAsync = client.physicalCards()

        val physicalCard =
            physicalCardServiceAsync.update(
                PhysicalCardUpdateParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .status(PhysicalCardUpdateParams.Status.ACTIVE)
                    .build()
            )

        physicalCard.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardServiceAsync = client.physicalCards()

        val page = physicalCardServiceAsync.list()

        page.response().validate()
    }
}
