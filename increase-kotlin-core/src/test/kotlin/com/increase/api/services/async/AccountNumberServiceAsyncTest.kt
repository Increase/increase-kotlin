// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountNumberServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountNumberServiceAsync = client.accountNumbers()

      val accountNumber = accountNumberServiceAsync.create(AccountNumberCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .name("Rent payments")
          .inboundAch(AccountNumberCreateParams.InboundAch.builder()
              .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberCreateParams.InboundChecks.builder()
              .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
              .build())
          .build())

      accountNumber.validate()
    }

    @Test
    suspend fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountNumberServiceAsync = client.accountNumbers()

      val accountNumber = accountNumberServiceAsync.retrieve(AccountNumberRetrieveParams.builder()
          .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
          .build())

      accountNumber.validate()
    }

    @Test
    suspend fun update() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountNumberServiceAsync = client.accountNumbers()

      val accountNumber = accountNumberServiceAsync.update(AccountNumberUpdateParams.builder()
          .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
          .inboundAch(AccountNumberUpdateParams.InboundAch.builder()
              .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberUpdateParams.InboundChecks.builder()
              .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
              .build())
          .name("x")
          .status(AccountNumberUpdateParams.Status.ACTIVE)
          .build())

      accountNumber.validate()
    }

    @Test
    suspend fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountNumberServiceAsync = client.accountNumbers()

      val page = accountNumberServiceAsync.list()

      page.response().validate()
    }
}
