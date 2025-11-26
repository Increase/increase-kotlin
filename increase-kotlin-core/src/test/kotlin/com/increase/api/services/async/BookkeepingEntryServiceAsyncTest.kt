// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookkeepingEntryServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryServiceAsync = client.bookkeepingEntries()

        val bookkeepingEntry =
            bookkeepingEntryServiceAsync.retrieve("bookkeeping_entry_ctjpajsj3ks2blx10375")

        bookkeepingEntry.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryServiceAsync = client.bookkeepingEntries()

        val bookkeepingEntries =
            bookkeepingEntryServiceAsync.list(
                BookkeepingEntryListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        bookkeepingEntries.validate()
    }
}
