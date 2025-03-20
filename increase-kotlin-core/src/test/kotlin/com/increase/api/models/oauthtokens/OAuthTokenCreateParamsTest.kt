// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthtokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthTokenCreateParamsTest {

    @Test
    fun create() {
        OAuthTokenCreateParams.builder()
            .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
            .clientId("12345")
            .clientSecret("supersecret")
            .code("123")
            .productionToken("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            OAuthTokenCreateParams.builder()
                .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                .clientId("12345")
                .clientSecret("supersecret")
                .code("123")
                .productionToken("x")
                .build()

        val body = params._body()

        assertThat(body.grantType()).isEqualTo(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.clientId()).isEqualTo("12345")
        assertThat(body.clientSecret()).isEqualTo("supersecret")
        assertThat(body.code()).isEqualTo("123")
        assertThat(body.productionToken()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OAuthTokenCreateParams.builder()
                .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                .build()

        val body = params._body()

        assertThat(body.grantType()).isEqualTo(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
    }
}
