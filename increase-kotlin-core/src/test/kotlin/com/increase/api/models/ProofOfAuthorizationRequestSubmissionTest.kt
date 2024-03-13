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
                .id("string")
                .authorizationTerms("string")
                .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorizerCompany("string")
                .authorizerEmail("string")
                .authorizerIpAddress("string")
                .authorizerName("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerHasBeenOffboarded(true)
                .idempotencyKey("string")
                .proofOfAuthorizationRequestId("string")
                .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                .type(
                    ProofOfAuthorizationRequestSubmission.Type
                        .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .validatedAccountOwnershipViaCredential(true)
                .validatedAccountOwnershipWithAccountStatement(true)
                .validatedAccountOwnershipWithMicrodeposit(true)
                .build()
        assertThat(proofOfAuthorizationRequestSubmission).isNotNull
        assertThat(proofOfAuthorizationRequestSubmission.id()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.authorizationTerms()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.authorizedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.authorizerCompany()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerEmail()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerIpAddress()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerName()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded())
            .isEqualTo(true)
        assertThat(proofOfAuthorizationRequestSubmission.idempotencyKey()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId())
            .isEqualTo("string")
        assertThat(proofOfAuthorizationRequestSubmission.status())
            .isEqualTo(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
        assertThat(proofOfAuthorizationRequestSubmission.type())
            .isEqualTo(
                ProofOfAuthorizationRequestSubmission.Type.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
            )
        assertThat(proofOfAuthorizationRequestSubmission.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential())
            .isEqualTo(true)
        assertThat(
                proofOfAuthorizationRequestSubmission
                    .validatedAccountOwnershipWithAccountStatement()
            )
            .isEqualTo(true)
        assertThat(
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit()
            )
            .isEqualTo(true)
    }
}
