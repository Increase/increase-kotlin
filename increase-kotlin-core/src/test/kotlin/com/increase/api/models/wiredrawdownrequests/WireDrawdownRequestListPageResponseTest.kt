// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestListPageResponseTest {

    @Test
    fun create() {
        val wireDrawdownRequestListPageResponse =
            WireDrawdownRequestListPageResponse.builder()
                .addData(
                    WireDrawdownRequest.builder()
                        .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(10000L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorAddress(
                            WireDrawdownRequest.CreditorAddress.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .creditorName("Ian Crease")
                        .currency("USD")
                        .debtorAccountNumber("987654321")
                        .debtorAddress(
                            WireDrawdownRequest.DebtorAddress.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .debtorName("Ian Crease")
                        .debtorRoutingNumber("101050001")
                        .fulfillmentInboundWireTransferId(
                            "inbound_wire_transfer_f228m6bmhtcxjco9pwp0"
                        )
                        .idempotencyKey(null)
                        .status(WireDrawdownRequest.Status.FULFILLED)
                        .submission(
                            WireDrawdownRequest.Submission.builder()
                                .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                                .build()
                        )
                        .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(wireDrawdownRequestListPageResponse.data())
            .containsExactly(
                WireDrawdownRequest.builder()
                    .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(10000L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .creditorAddress(
                        WireDrawdownRequest.CreditorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .creditorName("Ian Crease")
                    .currency("USD")
                    .debtorAccountNumber("987654321")
                    .debtorAddress(
                        WireDrawdownRequest.DebtorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .debtorName("Ian Crease")
                    .debtorRoutingNumber("101050001")
                    .fulfillmentInboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .idempotencyKey(null)
                    .status(WireDrawdownRequest.Status.FULFILLED)
                    .submission(
                        WireDrawdownRequest.Submission.builder()
                            .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                            .build()
                    )
                    .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .build()
            )
        assertThat(wireDrawdownRequestListPageResponse.nextCursor()).isEqualTo("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireDrawdownRequestListPageResponse =
            WireDrawdownRequestListPageResponse.builder()
                .addData(
                    WireDrawdownRequest.builder()
                        .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(10000L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorAddress(
                            WireDrawdownRequest.CreditorAddress.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .creditorName("Ian Crease")
                        .currency("USD")
                        .debtorAccountNumber("987654321")
                        .debtorAddress(
                            WireDrawdownRequest.DebtorAddress.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .debtorName("Ian Crease")
                        .debtorRoutingNumber("101050001")
                        .fulfillmentInboundWireTransferId(
                            "inbound_wire_transfer_f228m6bmhtcxjco9pwp0"
                        )
                        .idempotencyKey(null)
                        .status(WireDrawdownRequest.Status.FULFILLED)
                        .submission(
                            WireDrawdownRequest.Submission.builder()
                                .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                                .build()
                        )
                        .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedWireDrawdownRequestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireDrawdownRequestListPageResponse),
                jacksonTypeRef<WireDrawdownRequestListPageResponse>(),
            )

        assertThat(roundtrippedWireDrawdownRequestListPageResponse)
            .isEqualTo(wireDrawdownRequestListPageResponse)
    }
}
