// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerCreateParams
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeneficialOwnerServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerServiceAsync.create(
                BeneficialOwnerCreateParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .individual(
                        BeneficialOwnerCreateParams.Individual.builder()
                            .address(
                                BeneficialOwnerCreateParams.Individual.Address.builder()
                                    .city("New York")
                                    .country("US")
                                    .line1("33 Liberty Street")
                                    .line2("x")
                                    .state("NY")
                                    .zip("10045")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("1970-01-31"))
                            .identification(
                                BeneficialOwnerCreateParams.Individual.Identification.builder()
                                    .method(
                                        BeneficialOwnerCreateParams.Individual.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("078051120")
                                    .driversLicense(
                                        BeneficialOwnerCreateParams.Individual.Identification
                                            .DriversLicense
                                            .builder()
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .state("xx")
                                            .backFileId("back_file_id")
                                            .build()
                                    )
                                    .other(
                                        BeneficialOwnerCreateParams.Individual.Identification.Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .fileId("file_id")
                                            .backFileId("back_file_id")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .build()
                                    )
                                    .passport(
                                        BeneficialOwnerCreateParams.Individual.Identification
                                            .Passport
                                            .builder()
                                            .country("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("Ian Crease")
                            .confirmedNoUsTaxId(true)
                            .build()
                    )
                    .addProng(BeneficialOwnerCreateParams.Prong.CONTROL)
                    .companyTitle("CEO")
                    .build()
            )

        entityBeneficialOwner.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerServiceAsync.retrieve("entity_beneficial_owner_vozma8szzu1sxezp5zq6")

        entityBeneficialOwner.validate()
    }

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerServiceAsync.update(
                BeneficialOwnerUpdateParams.builder()
                    .entityBeneficialOwnerId("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
                    .address(
                        BeneficialOwnerUpdateParams.Address.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("Unit 2")
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .confirmedNoUsTaxId(true)
                    .identification(
                        BeneficialOwnerUpdateParams.Identification.builder()
                            .method(
                                BeneficialOwnerUpdateParams.Identification.Method
                                    .SOCIAL_SECURITY_NUMBER
                            )
                            .number("xxxx")
                            .driversLicense(
                                BeneficialOwnerUpdateParams.Identification.DriversLicense.builder()
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .state("xx")
                                    .backFileId("back_file_id")
                                    .build()
                            )
                            .other(
                                BeneficialOwnerUpdateParams.Identification.Other.builder()
                                    .country("x")
                                    .description("x")
                                    .fileId("file_id")
                                    .backFileId("back_file_id")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .build()
                            )
                            .passport(
                                BeneficialOwnerUpdateParams.Identification.Passport.builder()
                                    .country("x")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .build()
                            )
                            .build()
                    )
                    .name("x")
                    .addProng(BeneficialOwnerUpdateParams.Prong.OWNERSHIP)
                    .build()
            )

        entityBeneficialOwner.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val page =
            beneficialOwnerServiceAsync.list(
                BeneficialOwnerListParams.builder().entityId("entity_id").build()
            )

        page.response().validate()
    }

    @Test
    suspend fun archive() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerServiceAsync.archive("entity_beneficial_owner_vozma8szzu1sxezp5zq6")

        entityBeneficialOwner.validate()
    }
}
