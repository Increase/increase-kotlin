package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferCreateParamsTest {

    @Test
    fun createCheckTransferCreateParams() {
        CheckTransferCreateParams.builder()
            .accountId("string")
            .sourceAccountNumberId("string")
            .addressLine1("x")
            .addressLine2("x")
            .addressCity("x")
            .addressState("x")
            .addressZip("x")
            .returnAddress(
                CheckTransferCreateParams.ReturnAddress.builder()
                    .name("x")
                    .line1("x")
                    .line2("x")
                    .city("x")
                    .state("x")
                    .zip("x")
                    .build()
            )
            .amount(123L)
            .message("x")
            .note("x")
            .recipientName("x")
            .requireApproval(true)
            .uniqueIdentifier("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("string")
                .sourceAccountNumberId("string")
                .addressLine1("x")
                .addressLine2("x")
                .addressCity("x")
                .addressState("x")
                .addressZip("x")
                .returnAddress(
                    CheckTransferCreateParams.ReturnAddress.builder()
                        .name("x")
                        .line1("x")
                        .line2("x")
                        .city("x")
                        .state("x")
                        .zip("x")
                        .build()
                )
                .amount(123L)
                .message("x")
                .note("x")
                .recipientName("x")
                .requireApproval(true)
                .uniqueIdentifier("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
        assertThat(body.addressLine1()).isEqualTo("x")
        assertThat(body.addressLine2()).isEqualTo("x")
        assertThat(body.addressCity()).isEqualTo("x")
        assertThat(body.addressState()).isEqualTo("x")
        assertThat(body.addressZip()).isEqualTo("x")
        assertThat(body.returnAddress())
            .isEqualTo(
                CheckTransferCreateParams.ReturnAddress.builder()
                    .name("x")
                    .line1("x")
                    .line2("x")
                    .city("x")
                    .state("x")
                    .zip("x")
                    .build()
            )
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.message()).isEqualTo("x")
        assertThat(body.note()).isEqualTo("x")
        assertThat(body.recipientName()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.uniqueIdentifier()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("string")
                .addressLine1("x")
                .addressCity("x")
                .addressState("x")
                .addressZip("x")
                .amount(123L)
                .message("x")
                .recipientName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.addressLine1()).isEqualTo("x")
        assertThat(body.addressCity()).isEqualTo("x")
        assertThat(body.addressState()).isEqualTo("x")
        assertThat(body.addressZip()).isEqualTo("x")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.message()).isEqualTo("x")
        assertThat(body.recipientName()).isEqualTo("x")
    }
}
