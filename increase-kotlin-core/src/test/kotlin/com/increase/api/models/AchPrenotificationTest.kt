package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationTest {

    @Test
    fun createAchPrenotification() {
        val achPrenotification =
            AchPrenotification.builder()
                .id("string")
                .accountNumber("string")
                .addendum("string")
                .companyDescriptiveDate("string")
                .companyDiscretionaryData("string")
                .companyEntryDescription("string")
                .companyName("string")
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .routingNumber("string")
                .prenotificationReturn(
                    AchPrenotification.PrenotificationReturn.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .returnReasonCode("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(AchPrenotification.Status.PENDING_SUBMITTING)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()
        assertThat(achPrenotification).isNotNull
        assertThat(achPrenotification.id()).isEqualTo("string")
        assertThat(achPrenotification.accountNumber()).isEqualTo("string")
        assertThat(achPrenotification.addendum()).isEqualTo("string")
        assertThat(achPrenotification.companyDescriptiveDate()).isEqualTo("string")
        assertThat(achPrenotification.companyDiscretionaryData()).isEqualTo("string")
        assertThat(achPrenotification.companyEntryDescription()).isEqualTo("string")
        assertThat(achPrenotification.companyName()).isEqualTo("string")
        assertThat(achPrenotification.creditDebitIndicator())
            .isEqualTo(AchPrenotification.CreditDebitIndicator.CREDIT)
        assertThat(achPrenotification.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.routingNumber()).isEqualTo("string")
        assertThat(achPrenotification.prenotificationReturn())
            .isEqualTo(
                AchPrenotification.PrenotificationReturn.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .returnReasonCode("string")
                    .build()
            )
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.status())
            .isEqualTo(AchPrenotification.Status.PENDING_SUBMITTING)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }
}
