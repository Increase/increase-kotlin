// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountListParams
import com.increase.api.models.accounts.AccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .name("New Account!")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .informationalEntityId("informational_entity_id")
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .build()
            )

        account.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account = accountServiceAsync.retrieve("account_in71c4amph0vgo2qllky")

        account.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .creditLimit(0L)
                    .name("My renamed account")
                    .build()
            )

        account.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accounts =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .createdAt(
                        AccountListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .entityId("entity_id")
                    .idempotencyKey("x")
                    .informationalEntityId("informational_entity_id")
                    .limit(1L)
                    .programId("program_id")
                    .status(
                        AccountListParams.Status.builder()
                            .addIn(AccountListParams.Status.In.CLOSED)
                            .build()
                    )
                    .build()
            )

        accounts.validate()
    }

    @Test
    suspend fun balance() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val balanceLookup =
            accountServiceAsync.balance(
                AccountBalanceParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        balanceLookup.validate()
    }

    @Test
    suspend fun close() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account = accountServiceAsync.close("account_in71c4amph0vgo2qllky")

        account.validate()
    }
}
