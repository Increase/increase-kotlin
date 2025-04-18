// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTransferApproveParamsTest {

    @Test
    fun create() {
        AccountTransferApproveParams.builder()
            .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountTransferApproveParams.builder()
                .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_transfer_7k9qe1ysdgqztnt63l7n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
