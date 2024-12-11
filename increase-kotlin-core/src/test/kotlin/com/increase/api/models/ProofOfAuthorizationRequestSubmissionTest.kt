// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestSubmissionTest {

    @Test
    fun createProofOfAuthorizationRequestSubmission() {
        val proofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission.builder()
                .id("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
                .authorizationTerms("I agree to the terms.")
                .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .authorizerCompany("National Phonograph Company")
                .authorizerEmail("user@example.com")
                .authorizerIpAddress("123.45.67.89")
                .authorizerName("Ian Crease")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .customerHasBeenOffboarded(false)
                .proofOfAuthorizationRequestId(
                    "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                )
                .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                .type(
                    ProofOfAuthorizationRequestSubmission.Type
                        .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                )
                .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .validatedAccountOwnershipViaCredential(false)
                .validatedAccountOwnershipWithAccountStatement(false)
                .validatedAccountOwnershipWithMicrodeposit(true)
                .build()
        assertThat(proofOfAuthorizationRequestSubmission).isNotNull
        assertThat(proofOfAuthorizationRequestSubmission.id())
            .isEqualTo("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
        assertThat(proofOfAuthorizationRequestSubmission.authorizationTerms())
            .isEqualTo("I agree to the terms.")
        assertThat(proofOfAuthorizationRequestSubmission.authorizedAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(proofOfAuthorizationRequestSubmission.authorizerCompany())
            .isEqualTo("National Phonograph Company")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerEmail())
            .isEqualTo("user@example.com")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerIpAddress())
            .isEqualTo("123.45.67.89")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerName()).isEqualTo("Ian Crease")
        assertThat(proofOfAuthorizationRequestSubmission.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded())
            .isEqualTo(false)
        assertThat(proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(proofOfAuthorizationRequestSubmission.status())
            .isEqualTo(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
        assertThat(proofOfAuthorizationRequestSubmission.type())
            .isEqualTo(
                ProofOfAuthorizationRequestSubmission.Type.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
            )
        assertThat(proofOfAuthorizationRequestSubmission.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential())
            .isEqualTo(false)
        assertThat(
                proofOfAuthorizationRequestSubmission
                    .validatedAccountOwnershipWithAccountStatement()
            )
            .isEqualTo(false)
        assertThat(
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit()
            )
            .isEqualTo(true)
    }
}
