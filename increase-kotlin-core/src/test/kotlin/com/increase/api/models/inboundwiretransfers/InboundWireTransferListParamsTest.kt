// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferListParamsTest {

    @Test
    fun create() {
        InboundWireTransferListParams.builder()
            .accountId("account_id")
            .accountNumberId("account_number_id")
            .createdAt(
                InboundWireTransferListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(1L)
            .status(
                InboundWireTransferListParams.Status.builder()
                    .addIn(InboundWireTransferListParams.Status.In.PENDING)
                    .build()
            )
            .wireDrawdownRequestId("wire_drawdown_request_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InboundWireTransferListParams.builder()
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .createdAt(
                    InboundWireTransferListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(1L)
                .status(
                    InboundWireTransferListParams.Status.builder()
                        .addIn(InboundWireTransferListParams.Status.In.PENDING)
                        .build()
                )
                .wireDrawdownRequestId("wire_drawdown_request_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("account_number_id", "account_number_id")
                    .put("created_at.after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.before", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("status.in", listOf("pending").joinToString(","))
                    .put("wire_drawdown_request_id", "wire_drawdown_request_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboundWireTransferListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
