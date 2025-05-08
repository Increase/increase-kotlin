// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalCardProfileServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileServiceAsync = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileServiceAsync.create(
                DigitalCardProfileCreateParams.builder()
                    .appIconFileId("file_8zxqkwlh43wo144u8yec")
                    .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                    .cardDescription("MyBank Signature Card")
                    .description("My Card Profile")
                    .issuerName("MyBank")
                    .contactEmail("user@example.com")
                    .contactPhone("+18885551212")
                    .contactWebsite("https://example.com")
                    .textColor(
                        DigitalCardProfileCreateParams.TextColor.builder()
                            .blue(59L)
                            .green(43L)
                            .red(26L)
                            .build()
                    )
                    .build()
            )

        digitalCardProfile.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileServiceAsync = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileServiceAsync.retrieve("digital_card_profile_s3puplu90f04xhcwkiga")

        digitalCardProfile.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileServiceAsync = client.digitalCardProfiles()

        val page = digitalCardProfileServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun archive() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileServiceAsync = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileServiceAsync.archive("digital_card_profile_s3puplu90f04xhcwkiga")

        digitalCardProfile.validate()
    }

    @Test
    suspend fun clone() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileServiceAsync = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileServiceAsync.clone(
                DigitalCardProfileCloneParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .appIconFileId("app_icon_file_id")
                    .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                    .cardDescription("x")
                    .contactEmail("x")
                    .contactPhone("x")
                    .contactWebsite("contact_website")
                    .description("x")
                    .issuerName("x")
                    .textColor(
                        DigitalCardProfileCloneParams.TextColor.builder()
                            .blue(0L)
                            .green(0L)
                            .red(0L)
                            .build()
                    )
                    .build()
            )

        digitalCardProfile.validate()
    }
}
