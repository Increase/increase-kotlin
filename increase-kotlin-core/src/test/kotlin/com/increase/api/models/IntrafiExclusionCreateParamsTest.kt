// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionCreateParamsTest {

    @Test
    fun createIntrafiExclusionCreateParams() {
        IntrafiExclusionCreateParams.builder()
            .bankName("Example Bank")
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .build()
    }

    @Test
    fun body() {
        val params =
            IntrafiExclusionCreateParams.builder()
                .bankName("Example Bank")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.bankName()).isEqualTo("Example Bank")
        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntrafiExclusionCreateParams.builder()
                .bankName("Example Bank")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.bankName()).isEqualTo("Example Bank")
        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
    }
}
