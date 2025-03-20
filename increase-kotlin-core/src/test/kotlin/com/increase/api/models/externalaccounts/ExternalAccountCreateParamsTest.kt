// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .accountNumber("987654321")
            .description("Landlord")
            .routingNumber("101050001")
            .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
            .funding(ExternalAccountCreateParams.Funding.CHECKING)
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("987654321")
                .description("Landlord")
                .routingNumber("101050001")
                .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
                .funding(ExternalAccountCreateParams.Funding.CHECKING)
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.description()).isEqualTo("Landlord")
        assertThat(body.routingNumber()).isEqualTo("101050001")
        assertThat(body.accountHolder())
            .isEqualTo(ExternalAccountCreateParams.AccountHolder.BUSINESS)
        assertThat(body.funding()).isEqualTo(ExternalAccountCreateParams.Funding.CHECKING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("987654321")
                .description("Landlord")
                .routingNumber("101050001")
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.description()).isEqualTo("Landlord")
        assertThat(body.routingNumber()).isEqualTo("101050001")
    }
}
