// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchPrenotificationListPageResponseTest {

    @Test
    fun create() {
        val achPrenotificationListPageResponse =
            AchPrenotificationListPageResponse.builder()
                .addData(
                    AchPrenotification.builder()
                        .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                        .accountId(null)
                        .accountNumber("987654321")
                        .addendum(null)
                        .companyDescriptiveDate(null)
                        .companyDiscretionaryData(null)
                        .companyEntryDescription(null)
                        .companyName(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditDebitIndicator(null)
                        .effectiveDate(null)
                        .idempotencyKey(null)
                        .individualId(null)
                        .individualName(null)
                        .addNotificationsOfChange(
                            AchPrenotification.NotificationsOfChange.builder()
                                .changeCode(
                                    AchPrenotification.NotificationsOfChange.ChangeCode
                                        .INCORRECT_TRANSACTION_CODE
                                )
                                .correctedData("32")
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .prenotificationReturn(
                            AchPrenotification.PrenotificationReturn.builder()
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .returnReasonCode(
                                    AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                        .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                                )
                                .build()
                        )
                        .routingNumber("101050001")
                        .standardEntryClassCode(null)
                        .status(AchPrenotification.Status.SUBMITTED)
                        .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(achPrenotificationListPageResponse.data())
            .containsExactly(
                AchPrenotification.builder()
                    .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                    .accountId(null)
                    .accountNumber("987654321")
                    .addendum(null)
                    .companyDescriptiveDate(null)
                    .companyDiscretionaryData(null)
                    .companyEntryDescription(null)
                    .companyName(null)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .creditDebitIndicator(null)
                    .effectiveDate(null)
                    .idempotencyKey(null)
                    .individualId(null)
                    .individualName(null)
                    .addNotificationsOfChange(
                        AchPrenotification.NotificationsOfChange.builder()
                            .changeCode(
                                AchPrenotification.NotificationsOfChange.ChangeCode
                                    .INCORRECT_TRANSACTION_CODE
                            )
                            .correctedData("32")
                            .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .prenotificationReturn(
                        AchPrenotification.PrenotificationReturn.builder()
                            .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .returnReasonCode(
                                AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                    .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                            )
                            .build()
                    )
                    .routingNumber("101050001")
                    .standardEntryClassCode(null)
                    .status(AchPrenotification.Status.SUBMITTED)
                    .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                    .build()
            )
        assertThat(achPrenotificationListPageResponse.nextCursor()).isEqualTo("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achPrenotificationListPageResponse =
            AchPrenotificationListPageResponse.builder()
                .addData(
                    AchPrenotification.builder()
                        .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                        .accountId(null)
                        .accountNumber("987654321")
                        .addendum(null)
                        .companyDescriptiveDate(null)
                        .companyDiscretionaryData(null)
                        .companyEntryDescription(null)
                        .companyName(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditDebitIndicator(null)
                        .effectiveDate(null)
                        .idempotencyKey(null)
                        .individualId(null)
                        .individualName(null)
                        .addNotificationsOfChange(
                            AchPrenotification.NotificationsOfChange.builder()
                                .changeCode(
                                    AchPrenotification.NotificationsOfChange.ChangeCode
                                        .INCORRECT_TRANSACTION_CODE
                                )
                                .correctedData("32")
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .prenotificationReturn(
                            AchPrenotification.PrenotificationReturn.builder()
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .returnReasonCode(
                                    AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                        .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                                )
                                .build()
                        )
                        .routingNumber("101050001")
                        .standardEntryClassCode(null)
                        .status(AchPrenotification.Status.SUBMITTED)
                        .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAchPrenotificationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(achPrenotificationListPageResponse),
                jacksonTypeRef<AchPrenotificationListPageResponse>(),
            )

        assertThat(roundtrippedAchPrenotificationListPageResponse)
            .isEqualTo(achPrenotificationListPageResponse)
    }
}
