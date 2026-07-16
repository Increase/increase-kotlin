// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.files.FileCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class FileServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.create(
                FileCreateParams.builder()
                    .file("Example data".byteInputStream())
                    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                    .description("x")
                    .build()
            )

        file.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file = fileServiceAsync.retrieve("file_makxrc67oh9l6sg7w9yc")

        file.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val page = fileServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun contents(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = fileServiceAsync.contents("file_makxrc67oh9l6sg7w9yc")

        assertThat(response.body()).hasContent("abc")
    }
}
