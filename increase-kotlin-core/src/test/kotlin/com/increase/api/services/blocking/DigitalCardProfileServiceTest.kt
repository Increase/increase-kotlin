// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalCardProfileServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()
        val digitalCardProfile =
            digitalCardProfileService.create(
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
        println(digitalCardProfile)
        digitalCardProfile.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()
        val digitalCardProfile =
            digitalCardProfileService.retrieve(
                DigitalCardProfileRetrieveParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .build()
            )
        println(digitalCardProfile)
        digitalCardProfile.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()
        val digitalCardProfileList = digitalCardProfileService.list()
        println(digitalCardProfileList)
        digitalCardProfileList.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()
        val digitalCardProfile =
            digitalCardProfileService.archive(
                DigitalCardProfileArchiveParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .build()
            )
        println(digitalCardProfile)
        digitalCardProfile.validate()
    }

    @Test
    fun callClone() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()
        val digitalCardProfile =
            digitalCardProfileService.clone(
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
        println(digitalCardProfile)
        digitalCardProfile.validate()
    }
}
