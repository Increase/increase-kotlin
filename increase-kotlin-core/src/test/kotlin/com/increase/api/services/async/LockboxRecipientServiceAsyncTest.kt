// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxRecipientServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientServiceAsync = client.lockboxRecipients()

        val lockboxRecipient =
            lockboxRecipientServiceAsync.create(
                LockboxRecipientCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                    .description("x")
                    .recipientName("Ian Crease")
                    .build()
            )

        lockboxRecipient.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientServiceAsync = client.lockboxRecipients()

        val lockboxRecipient = lockboxRecipientServiceAsync.retrieve("lockbox_3xt21ok13q19advds4t5")

        lockboxRecipient.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientServiceAsync = client.lockboxRecipients()

        val lockboxRecipient =
            lockboxRecipientServiceAsync.update(
                LockboxRecipientUpdateParams.builder()
                    .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
                    .description("x")
                    .recipientName("x")
                    .status(LockboxRecipientUpdateParams.Status.ACTIVE)
                    .build()
            )

        lockboxRecipient.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientServiceAsync = client.lockboxRecipients()

        val page = lockboxRecipientServiceAsync.list()

        page.response().validate()
    }
}
