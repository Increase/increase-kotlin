// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionTest {

    @Test
    fun createIntrafiExclusion() {
        val intrafiExclusion =
            IntrafiExclusion.builder()
                .id("string")
                .bankName("string")
                .entityId("string")
                .excludedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fdicCertificateNumber("string")
                .status(IntrafiExclusion.Status.PENDING)
                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                .build()
        assertThat(intrafiExclusion).isNotNull
        assertThat(intrafiExclusion.id()).isEqualTo("string")
        assertThat(intrafiExclusion.bankName()).isEqualTo("string")
        assertThat(intrafiExclusion.entityId()).isEqualTo("string")
        assertThat(intrafiExclusion.excludedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(intrafiExclusion.fdicCertificateNumber()).isEqualTo("string")
        assertThat(intrafiExclusion.status()).isEqualTo(IntrafiExclusion.Status.PENDING)
        assertThat(intrafiExclusion.submittedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(intrafiExclusion.type()).isEqualTo(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
    }
}
