// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.LockboxCreateParams
import com.increase.api.models.LockboxRetrieveParams
import com.increase.api.models.LockboxUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LockboxServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox =
            lockboxService.create(
                LockboxCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .description("Rent payments")
                    .recipientName("x")
                    .build()
            )

        lockbox.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox =
            lockboxService.retrieve(
                LockboxRetrieveParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
            )

        lockbox.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox =
            lockboxService.update(
                LockboxUpdateParams.builder()
                    .lockboxId("lockbox_3xt21ok13q19advds4t5")
                    .description("x")
                    .recipientName("x")
                    .status(LockboxUpdateParams.Status.ACTIVE)
                    .build()
            )

        lockbox.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val page = lockboxService.list()

        page.response().validate()
    }
}
