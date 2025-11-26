// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiExclusionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusion =
            intrafiExclusionServiceAsync.create(
                IntrafiExclusionCreateParams.builder()
                    .bankName("Example Bank")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .build()
            )

        intrafiExclusion.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusion = intrafiExclusionServiceAsync.retrieve("account_in71c4amph0vgo2qllky")

        intrafiExclusion.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusions =
            intrafiExclusionServiceAsync.list(
                IntrafiExclusionListParams.builder()
                    .cursor("cursor")
                    .entityId("entity_id")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        intrafiExclusions.validate()
    }

    @Test
    suspend fun archive() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusion =
            intrafiExclusionServiceAsync.archive("intrafi_exclusion_ygfqduuzpau3jqof6jyh")

        intrafiExclusion.validate()
    }
}
