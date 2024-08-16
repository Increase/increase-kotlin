// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxTest {

    @Test
    fun createLockbox() {
        val lockbox =
            Lockbox.builder()
                .id("id")
                .accountId("account_id")
                .address(
                    Lockbox.Address.builder()
                        .city("city")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .recipient("recipient")
                        .state("state")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .idempotencyKey("idempotency_key")
                .recipientName("recipient_name")
                .status(Lockbox.Status.ACTIVE)
                .type(Lockbox.Type.LOCKBOX)
                .build()
        assertThat(lockbox).isNotNull
        assertThat(lockbox.id()).isEqualTo("id")
        assertThat(lockbox.accountId()).isEqualTo("account_id")
        assertThat(lockbox.address())
            .isEqualTo(
                Lockbox.Address.builder()
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .recipient("recipient")
                    .state("state")
                    .build()
            )
        assertThat(lockbox.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lockbox.description()).isEqualTo("description")
        assertThat(lockbox.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(lockbox.recipientName()).isEqualTo("recipient_name")
        assertThat(lockbox.status()).isEqualTo(Lockbox.Status.ACTIVE)
        assertThat(lockbox.type()).isEqualTo(Lockbox.Type.LOCKBOX)
    }
}
