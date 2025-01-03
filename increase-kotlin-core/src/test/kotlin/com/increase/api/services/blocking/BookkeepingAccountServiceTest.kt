// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.BookkeepingAccountBalanceParams
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.BookkeepingAccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingAccount =
            bookkeepingAccountService.create(
                BookkeepingAccountCreateParams.builder()
                    .name("New Account!")
                    .accountId("account_id")
                    .complianceCategory(
                        BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                    )
                    .entityId("entity_id")
                    .build()
            )
        println(bookkeepingAccount)
        bookkeepingAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingAccount =
            bookkeepingAccountService.update(
                BookkeepingAccountUpdateParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .name("Deprecated Account")
                    .build()
            )
        println(bookkeepingAccount)
        bookkeepingAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingAccountList =
            bookkeepingAccountService.list(BookkeepingAccountListParams.builder().build())
        println(bookkeepingAccountList)
        bookkeepingAccountList.data().forEach { it.validate() }
    }

    @Test
    fun callBalance() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingBalanceLookup =
            bookkeepingAccountService.balance(
                BookkeepingAccountBalanceParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(bookkeepingBalanceLookup)
        bookkeepingBalanceLookup.validate()
    }
}
