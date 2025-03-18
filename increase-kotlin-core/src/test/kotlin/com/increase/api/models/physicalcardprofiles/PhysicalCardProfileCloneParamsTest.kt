// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileCloneParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileCloneParams.builder()
            .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
            .carrierImageFileId("carrier_image_file_id")
            .contactPhone("x")
            .description("x")
            .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
            .frontText(
                PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .carrierImageFileId("carrier_image_file_id")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                .frontText(
                    PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.carrierImageFileId()).isEqualTo("carrier_image_file_id")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("file_o6aex13wm1jcc36sgcj1")
        assertThat(body.frontText())
            .isEqualTo(
                PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
