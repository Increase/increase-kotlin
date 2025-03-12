// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestServiceAsync = client.proofOfAuthorizationRequests()

        val proofOfAuthorizationRequest =
            proofOfAuthorizationRequestServiceAsync.retrieve(
                ProofOfAuthorizationRequestRetrieveParams.builder()
                    .proofOfAuthorizationRequestId(
                        "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                    )
                    .build()
            )

        proofOfAuthorizationRequest.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestServiceAsync = client.proofOfAuthorizationRequests()

        val page = proofOfAuthorizationRequestServiceAsync.list()

        page.response().validate()
    }
}
