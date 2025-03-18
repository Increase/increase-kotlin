// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockbox =
            lockboxServiceAsync.create(
                LockboxCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .description("Rent payments")
                    .recipientName("x")
                    .build()
            )

        lockbox.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockbox =
            lockboxServiceAsync.retrieve(
                LockboxRetrieveParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
            )

        lockbox.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockbox =
            lockboxServiceAsync.update(
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
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val page = lockboxServiceAsync.list()

        page.response().validate()
    }
}
