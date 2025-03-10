// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalAccountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                ExternalAccountCreateParams.builder()
                    .accountNumber("987654321")
                    .description("Landlord")
                    .routingNumber("101050001")
                    .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
                    .funding(ExternalAccountCreateParams.Funding.CHECKING)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.retrieve(
                ExternalAccountRetrieveParams.builder()
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.update(
                ExternalAccountUpdateParams.builder()
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
                    .description("New description")
                    .funding(ExternalAccountUpdateParams.Funding.CHECKING)
                    .status(ExternalAccountUpdateParams.Status.ACTIVE)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val page = externalAccountServiceAsync.list()

        page.response().validate()
    }
}
