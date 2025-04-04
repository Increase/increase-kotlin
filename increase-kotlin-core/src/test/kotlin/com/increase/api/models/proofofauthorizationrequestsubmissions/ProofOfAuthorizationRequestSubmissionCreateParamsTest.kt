// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestSubmissionCreateParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestSubmissionCreateParams.builder()
            .authorizationTerms("I agree to the terms of service.")
            .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
            .authorizerEmail("user@example.com")
            .authorizerName("Ian Crease")
            .customerHasBeenOffboarded(true)
            .proofOfAuthorizationRequestId("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
            .validatedAccountOwnershipViaCredential(true)
            .validatedAccountOwnershipWithAccountStatement(true)
            .validatedAccountOwnershipWithMicrodeposit(true)
            .additionalEvidenceFileId("file_makxrc67oh9l6sg7w9yc")
            .authorizerCompany("National Phonograph Company")
            .authorizerIpAddress("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                .authorizationTerms("I agree to the terms of service.")
                .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .authorizerEmail("user@example.com")
                .authorizerName("Ian Crease")
                .customerHasBeenOffboarded(true)
                .proofOfAuthorizationRequestId(
                    "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                )
                .validatedAccountOwnershipViaCredential(true)
                .validatedAccountOwnershipWithAccountStatement(true)
                .validatedAccountOwnershipWithMicrodeposit(true)
                .additionalEvidenceFileId("file_makxrc67oh9l6sg7w9yc")
                .authorizerCompany("National Phonograph Company")
                .authorizerIpAddress("x")
                .build()

        val body = params._body()

        assertThat(body.authorizationTerms()).isEqualTo("I agree to the terms of service.")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(body.authorizerEmail()).isEqualTo("user@example.com")
        assertThat(body.authorizerName()).isEqualTo("Ian Crease")
        assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
        assertThat(body.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
        assertThat(body.additionalEvidenceFileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(body.authorizerCompany()).isEqualTo("National Phonograph Company")
        assertThat(body.authorizerIpAddress()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                .authorizationTerms("I agree to the terms of service.")
                .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .authorizerEmail("user@example.com")
                .authorizerName("Ian Crease")
                .customerHasBeenOffboarded(true)
                .proofOfAuthorizationRequestId(
                    "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                )
                .validatedAccountOwnershipViaCredential(true)
                .validatedAccountOwnershipWithAccountStatement(true)
                .validatedAccountOwnershipWithMicrodeposit(true)
                .build()

        val body = params._body()

        assertThat(body.authorizationTerms()).isEqualTo("I agree to the terms of service.")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(body.authorizerEmail()).isEqualTo("user@example.com")
        assertThat(body.authorizerName()).isEqualTo("Ian Crease")
        assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
        assertThat(body.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
    }
}
