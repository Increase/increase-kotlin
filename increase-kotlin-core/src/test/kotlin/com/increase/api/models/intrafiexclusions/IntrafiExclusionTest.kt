// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionTest {

    @Test
    fun createIntrafiExclusion() {
      val intrafiExclusion = IntrafiExclusion.builder()
          .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
          .bankName("Example Bank")
          .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
          .fdicCertificateNumber("314159")
          .idempotencyKey(null)
          .status(IntrafiExclusion.Status.PENDING)
          .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
          .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
          .build()
      assertThat(intrafiExclusion).isNotNull
      assertThat(intrafiExclusion.id()).isEqualTo("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
      assertThat(intrafiExclusion.bankName()).isEqualTo("Example Bank")
      assertThat(intrafiExclusion.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
      assertThat(intrafiExclusion.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
      assertThat(intrafiExclusion.excludedAt()).isEqualTo(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
      assertThat(intrafiExclusion.fdicCertificateNumber()).isEqualTo("314159")
      assertThat(intrafiExclusion.idempotencyKey()).isNull()
      assertThat(intrafiExclusion.status()).isEqualTo(IntrafiExclusion.Status.PENDING)
      assertThat(intrafiExclusion.submittedAt()).isEqualTo(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
      assertThat(intrafiExclusion.type()).isEqualTo(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
    }
}
