// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpdateParamsTest {

    @Test
    fun create() {
        EntityUpdateParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .corporation(EntityUpdateParams.Corporation.builder().name("x").build())
            .governmentAuthority(EntityUpdateParams.GovernmentAuthority.builder().name("x").build())
            .naturalPerson(EntityUpdateParams.NaturalPerson.builder().name("x").build())
            .riskRating(
                EntityUpdateParams.RiskRating.builder()
                    .ratedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .rating(EntityUpdateParams.RiskRating.Rating.LOW)
                    .build()
            )
            .thirdPartyVerification(
                EntityUpdateParams.ThirdPartyVerification.builder()
                    .reference("x")
                    .vendor(EntityUpdateParams.ThirdPartyVerification.Vendor.ALLOY)
                    .build()
            )
            .trust(EntityUpdateParams.Trust.builder().name("x").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = EntityUpdateParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityUpdateParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .corporation(EntityUpdateParams.Corporation.builder().name("x").build())
                .governmentAuthority(
                    EntityUpdateParams.GovernmentAuthority.builder().name("x").build()
                )
                .naturalPerson(EntityUpdateParams.NaturalPerson.builder().name("x").build())
                .riskRating(
                    EntityUpdateParams.RiskRating.builder()
                        .ratedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .rating(EntityUpdateParams.RiskRating.Rating.LOW)
                        .build()
                )
                .thirdPartyVerification(
                    EntityUpdateParams.ThirdPartyVerification.builder()
                        .reference("x")
                        .vendor(EntityUpdateParams.ThirdPartyVerification.Vendor.ALLOY)
                        .build()
                )
                .trust(EntityUpdateParams.Trust.builder().name("x").build())
                .build()

        val body = params._body()

        assertThat(body.corporation())
            .isEqualTo(EntityUpdateParams.Corporation.builder().name("x").build())
        assertThat(body.governmentAuthority())
            .isEqualTo(EntityUpdateParams.GovernmentAuthority.builder().name("x").build())
        assertThat(body.naturalPerson())
            .isEqualTo(EntityUpdateParams.NaturalPerson.builder().name("x").build())
        assertThat(body.riskRating())
            .isEqualTo(
                EntityUpdateParams.RiskRating.builder()
                    .ratedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .rating(EntityUpdateParams.RiskRating.Rating.LOW)
                    .build()
            )
        assertThat(body.thirdPartyVerification())
            .isEqualTo(
                EntityUpdateParams.ThirdPartyVerification.builder()
                    .reference("x")
                    .vendor(EntityUpdateParams.ThirdPartyVerification.Vendor.ALLOY)
                    .build()
            )
        assertThat(body.trust()).isEqualTo(EntityUpdateParams.Trust.builder().name("x").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EntityUpdateParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()

        val body = params._body()
    }
}
