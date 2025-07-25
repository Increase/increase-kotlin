// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.programs.ProgramCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProgramServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val programServiceAsync = client.simulations().programs()

        val program =
            programServiceAsync.create(
                ProgramCreateParams.builder()
                    .name("For Benefit Of")
                    .bank(ProgramCreateParams.Bank.BLUE_RIDGE_BANK)
                    .reserveAccountId("reserve_account_id")
                    .build()
            )

        program.validate()
    }
}
