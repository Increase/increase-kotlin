// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiAccountEnrollmentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentServiceAsync.create(
                IntrafiAccountEnrollmentCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .emailAddress("user@example.com")
                    .build()
            )

        intrafiAccountEnrollment.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentServiceAsync.retrieve(
                "intrafi_account_enrollment_w8l97znzreopkwf2tg75"
            )

        intrafiAccountEnrollment.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val page = intrafiAccountEnrollmentServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun unenroll() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentServiceAsync.unenroll(
                "intrafi_account_enrollment_w8l97znzreopkwf2tg75"
            )

        intrafiAccountEnrollment.validate()
    }
}
