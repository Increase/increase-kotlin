// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchPrenotificationServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val achPrenotification =
            achPrenotificationServiceAsync.create(
                AchPrenotificationCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumber("987654321")
                    .routingNumber("101050001")
                    .addendum("x")
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .creditDebitIndicator(
                        AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .individualId("x")
                    .individualName("x")
                    .standardEntryClassCode(
                        AchPrenotificationCreateParams.StandardEntryClassCode
                            .CORPORATE_CREDIT_OR_DEBIT
                    )
                    .build()
            )

        achPrenotification.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val achPrenotification =
            achPrenotificationServiceAsync.retrieve(
                AchPrenotificationRetrieveParams.builder()
                    .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                    .build()
            )

        achPrenotification.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val page = achPrenotificationServiceAsync.list()

        page.response().validate()
    }
}
