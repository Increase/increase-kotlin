// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityBeneficialOwnerCreateParamsTest {

    @Test
    fun createEntityBeneficialOwnerCreateParams() {
        EntityBeneficialOwnerCreateParams.builder()
            .beneficialOwner(
                EntityBeneficialOwnerCreateParams.BeneficialOwner.builder()
                    .individual(
                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                    .Identification
                                    .builder()
                                    .method(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("xxxx")
                                    .driversLicense(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .DriversLicense
                                            .builder()
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .state("x")
                                            .backFileId("back_file_id")
                                            .build()
                                    )
                                    .other(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .fileId("file_id")
                                            .backFileId("back_file_id")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .build()
                                    )
                                    .passport(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Passport
                                            .builder()
                                            .country("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("x")
                            .confirmedNoUsTaxId(true)
                            .build()
                    )
                    .prongs(
                        listOf(EntityBeneficialOwnerCreateParams.BeneficialOwner.Prong.OWNERSHIP)
                    )
                    .companyTitle("x")
                    .build()
            )
            .entityId("entity_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityBeneficialOwnerCreateParams.builder()
                .beneficialOwner(
                    EntityBeneficialOwnerCreateParams.BeneficialOwner.builder()
                        .individual(
                            EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.builder()
                                .address(
                                    EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                        .Address
                                        .builder()
                                        .city("x")
                                        .line1("x")
                                        .state("x")
                                        .zip("x")
                                        .line2("x")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                        .Identification
                                        .builder()
                                        .method(
                                            EntityBeneficialOwnerCreateParams.BeneficialOwner
                                                .Individual
                                                .Identification
                                                .Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .number("xxxx")
                                        .driversLicense(
                                            EntityBeneficialOwnerCreateParams.BeneficialOwner
                                                .Individual
                                                .Identification
                                                .DriversLicense
                                                .builder()
                                                .expirationDate(LocalDate.parse("2019-12-27"))
                                                .fileId("file_id")
                                                .state("x")
                                                .backFileId("back_file_id")
                                                .build()
                                        )
                                        .other(
                                            EntityBeneficialOwnerCreateParams.BeneficialOwner
                                                .Individual
                                                .Identification
                                                .Other
                                                .builder()
                                                .country("x")
                                                .description("x")
                                                .fileId("file_id")
                                                .backFileId("back_file_id")
                                                .expirationDate(LocalDate.parse("2019-12-27"))
                                                .build()
                                        )
                                        .passport(
                                            EntityBeneficialOwnerCreateParams.BeneficialOwner
                                                .Individual
                                                .Identification
                                                .Passport
                                                .builder()
                                                .country("x")
                                                .expirationDate(LocalDate.parse("2019-12-27"))
                                                .fileId("file_id")
                                                .build()
                                        )
                                        .build()
                                )
                                .name("x")
                                .confirmedNoUsTaxId(true)
                                .build()
                        )
                        .prongs(
                            listOf(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Prong.OWNERSHIP
                            )
                        )
                        .companyTitle("x")
                        .build()
                )
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwner())
            .isEqualTo(
                EntityBeneficialOwnerCreateParams.BeneficialOwner.builder()
                    .individual(
                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                    .Identification
                                    .builder()
                                    .method(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("xxxx")
                                    .driversLicense(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .DriversLicense
                                            .builder()
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .state("x")
                                            .backFileId("back_file_id")
                                            .build()
                                    )
                                    .other(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .fileId("file_id")
                                            .backFileId("back_file_id")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .build()
                                    )
                                    .passport(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Passport
                                            .builder()
                                            .country("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("x")
                            .confirmedNoUsTaxId(true)
                            .build()
                    )
                    .prongs(
                        listOf(EntityBeneficialOwnerCreateParams.BeneficialOwner.Prong.OWNERSHIP)
                    )
                    .companyTitle("x")
                    .build()
            )
        assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityBeneficialOwnerCreateParams.builder()
                .beneficialOwner(
                    EntityBeneficialOwnerCreateParams.BeneficialOwner.builder()
                        .individual(
                            EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.builder()
                                .address(
                                    EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                        .Address
                                        .builder()
                                        .city("x")
                                        .line1("x")
                                        .state("x")
                                        .zip("x")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                        .Identification
                                        .builder()
                                        .method(
                                            EntityBeneficialOwnerCreateParams.BeneficialOwner
                                                .Individual
                                                .Identification
                                                .Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .number("xxxx")
                                        .build()
                                )
                                .name("x")
                                .build()
                        )
                        .prongs(
                            listOf(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Prong.OWNERSHIP
                            )
                        )
                        .build()
                )
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwner())
            .isEqualTo(
                EntityBeneficialOwnerCreateParams.BeneficialOwner.builder()
                    .individual(
                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                    .Identification
                                    .builder()
                                    .method(
                                        EntityBeneficialOwnerCreateParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("xxxx")
                                    .build()
                            )
                            .name("x")
                            .build()
                    )
                    .prongs(
                        listOf(EntityBeneficialOwnerCreateParams.BeneficialOwner.Prong.OWNERSHIP)
                    )
                    .build()
            )
        assertThat(body.entityId()).isEqualTo("entity_id")
    }
}
