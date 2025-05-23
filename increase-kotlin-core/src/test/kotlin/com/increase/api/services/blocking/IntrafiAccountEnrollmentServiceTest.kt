// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiAccountEnrollmentServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.create(
                IntrafiAccountEnrollmentCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .emailAddress("user@example.com")
                    .build()
            )

        intrafiAccountEnrollment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.retrieve(
                "intrafi_account_enrollment_w8l97znzreopkwf2tg75"
            )

        intrafiAccountEnrollment.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()

        val page = intrafiAccountEnrollmentService.list()

        page.response().validate()
    }

    @Test
    fun unenroll() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.unenroll(
                "intrafi_account_enrollment_w8l97znzreopkwf2tg75"
            )

        intrafiAccountEnrollment.validate()
    }
}
