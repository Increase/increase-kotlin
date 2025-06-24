// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.documents.DocumentCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.create(
                DocumentCreateParams.builder()
                    .category(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
                    .accountVerificationLetter(
                        DocumentCreateParams.AccountVerificationLetter.builder()
                            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                            .balanceDate(LocalDate.parse("2024-12-31"))
                            .build()
                    )
                    .fundingInstructions(
                        DocumentCreateParams.FundingInstructions.builder()
                            .accountNumberId("account_number_id")
                            .build()
                    )
                    .build()
            )

        document.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val document = documentServiceAsync.retrieve("document_qjtqc6s4c14ve2q89izm")

        document.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val page = documentServiceAsync.list()

        page.response().validate()
    }
}
