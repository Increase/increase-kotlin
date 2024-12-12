// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntryRetrieveParamsTest {

    @Test
    fun createBookkeepingEntryRetrieveParams() {
        BookkeepingEntryRetrieveParams.builder().bookkeepingEntryId("bookkeeping_entry_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingEntryRetrieveParams.builder()
                .bookkeepingEntryId("bookkeeping_entry_id")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingEntryId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_entry_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
