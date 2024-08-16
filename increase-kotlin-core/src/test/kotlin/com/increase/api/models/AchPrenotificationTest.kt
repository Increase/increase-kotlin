// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationTest {

    @Test
    fun createAchPrenotification() {
        val achPrenotification =
            AchPrenotification.builder()
                .id("id")
                .accountNumber("account_number")
                .addendum("addendum")
                .companyDescriptiveDate("company_descriptive_date")
                .companyDiscretionaryData("company_discretionary_data")
                .companyEntryDescription("company_entry_description")
                .companyName("company_name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idempotencyKey("idempotency_key")
                .notificationsOfChange(
                    listOf(
                        AchPrenotification.NotificationsOfChange.builder()
                            .changeCode(
                                AchPrenotification.NotificationsOfChange.ChangeCode
                                    .INCORRECT_ACCOUNT_NUMBER
                            )
                            .correctedData("corrected_data")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .prenotificationReturn(
                    AchPrenotification.PrenotificationReturn.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .returnReasonCode(
                            AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                .INSUFFICIENT_FUND
                        )
                        .build()
                )
                .routingNumber("routing_number")
                .status(AchPrenotification.Status.PENDING_SUBMITTING)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()
        assertThat(achPrenotification).isNotNull
        assertThat(achPrenotification.id()).isEqualTo("id")
        assertThat(achPrenotification.accountNumber()).isEqualTo("account_number")
        assertThat(achPrenotification.addendum()).isEqualTo("addendum")
        assertThat(achPrenotification.companyDescriptiveDate())
            .isEqualTo("company_descriptive_date")
        assertThat(achPrenotification.companyDiscretionaryData())
            .isEqualTo("company_discretionary_data")
        assertThat(achPrenotification.companyEntryDescription())
            .isEqualTo("company_entry_description")
        assertThat(achPrenotification.companyName()).isEqualTo("company_name")
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.creditDebitIndicator())
            .isEqualTo(AchPrenotification.CreditDebitIndicator.CREDIT)
        assertThat(achPrenotification.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(achPrenotification.notificationsOfChange())
            .containsExactly(
                AchPrenotification.NotificationsOfChange.builder()
                    .changeCode(
                        AchPrenotification.NotificationsOfChange.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("corrected_data")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achPrenotification.prenotificationReturn())
            .isEqualTo(
                AchPrenotification.PrenotificationReturn.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .returnReasonCode(
                        AchPrenotification.PrenotificationReturn.ReturnReasonCode.INSUFFICIENT_FUND
                    )
                    .build()
            )
        assertThat(achPrenotification.routingNumber()).isEqualTo("routing_number")
        assertThat(achPrenotification.status())
            .isEqualTo(AchPrenotification.Status.PENDING_SUBMITTING)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }
}
