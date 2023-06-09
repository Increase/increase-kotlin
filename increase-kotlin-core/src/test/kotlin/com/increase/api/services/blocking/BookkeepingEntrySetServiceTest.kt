package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingEntrySetServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val bookkeepingEntrySetService = client.bookkeepingEntrySets()
        val bookkeepingEntrySet =
            bookkeepingEntrySetService.create(
                BookkeepingEntrySetCreateParams.builder()
                    .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("string")
                    .entries(
                        listOf(
                            BookkeepingEntrySetCreateParams.Entry.builder()
                                .accountId("string")
                                .amount(123L)
                                .build()
                        )
                    )
                    .build()
            )
        println(bookkeepingEntrySet)
        bookkeepingEntrySet.validate()
    }
}
