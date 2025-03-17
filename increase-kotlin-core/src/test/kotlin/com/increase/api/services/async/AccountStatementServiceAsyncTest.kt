// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountStatementServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementServiceAsync = client.accountStatements()

        val accountStatement =
            accountStatementServiceAsync.retrieve(
                AccountStatementRetrieveParams.builder()
                    .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
                    .build()
            )

        accountStatement.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementServiceAsync = client.accountStatements()

        val page = accountStatementServiceAsync.list()

        page.response().validate()
    }
}
