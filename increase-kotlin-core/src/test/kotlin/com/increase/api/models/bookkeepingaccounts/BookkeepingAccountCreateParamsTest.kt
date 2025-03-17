// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountCreateParamsTest {

    @Test
    fun create() {
        BookkeepingAccountCreateParams.builder()
            .name("New Account!")
            .accountId("account_id")
            .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
            .entityId("entity_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            BookkeepingAccountCreateParams.builder()
                .name("New Account!")
                .accountId("account_id")
                .complianceCategory(
                    BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                )
                .entityId("entity_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("New Account!")
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.complianceCategory())
            .isEqualTo(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
        assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BookkeepingAccountCreateParams.builder().name("New Account!").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("New Account!")
    }
}
