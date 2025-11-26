// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookkeepingEntrySetServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetServiceAsync = client.bookkeepingEntrySets()

        val bookkeepingEntrySet =
            bookkeepingEntrySetServiceAsync.create(
                BookkeepingEntrySetCreateParams.builder()
                    .addEntry(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
                            .amount(100L)
                            .build()
                    )
                    .addEntry(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
                            .amount(-100L)
                            .build()
                    )
                    .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )

        bookkeepingEntrySet.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetServiceAsync = client.bookkeepingEntrySets()

        val bookkeepingEntrySet =
            bookkeepingEntrySetServiceAsync.retrieve("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")

        bookkeepingEntrySet.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetServiceAsync = client.bookkeepingEntrySets()

        val page = bookkeepingEntrySetServiceAsync.list()

        page.response().validate()
    }
}
