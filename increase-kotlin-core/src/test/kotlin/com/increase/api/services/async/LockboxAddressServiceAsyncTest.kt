// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxAddressServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressServiceAsync = client.lockboxAddresses()

        val lockboxAddress =
            lockboxAddressServiceAsync.create(
                LockboxAddressCreateParams.builder().description("Lockbox Address 1").build()
            )

        lockboxAddress.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressServiceAsync = client.lockboxAddresses()

        val lockboxAddress =
            lockboxAddressServiceAsync.retrieve("lockbox_address_lw6sbzl9ol5dfd8hdml6")

        lockboxAddress.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressServiceAsync = client.lockboxAddresses()

        val lockboxAddress =
            lockboxAddressServiceAsync.update(
                LockboxAddressUpdateParams.builder()
                    .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                    .description("x")
                    .status(LockboxAddressUpdateParams.Status.DISABLED)
                    .build()
            )

        lockboxAddress.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressServiceAsync = client.lockboxAddresses()

        val page = lockboxAddressServiceAsync.list()

        page.response().validate()
    }
}
