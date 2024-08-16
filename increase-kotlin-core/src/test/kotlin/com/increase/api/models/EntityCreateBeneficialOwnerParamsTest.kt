// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.EntityCreateBeneficialOwnerParams
import com.increase.api.models.EntityCreateBeneficialOwnerParams.EntityCreateBeneficialOwnerBody

class EntityCreateBeneficialOwnerParamsTest {

    @Test
    fun createEntityCreateBeneficialOwnerParams() {
      EntityCreateBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwner(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
              .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                  .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                      .city("x")
                      .line1("x")
                      .state("x")
                      .zip("x")
                      .line2("x")
                      .build())
                  .dateOfBirth(LocalDate.parse("2019-12-27"))
                  .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                      .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                      .number("xxxx")
                      .driversLicense(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.DriversLicense.builder()
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .fileId("file_id")
                          .state("x")
                          .backFileId("back_file_id")
                          .build())
                      .other(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Other.builder()
                          .country("x")
                          .description("x")
                          .fileId("file_id")
                          .backFileId("back_file_id")
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .build())
                      .passport(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Passport.builder()
                          .country("x")
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .fileId("file_id")
                          .build())
                      .build())
                  .name("x")
                  .confirmedNoUsTaxId(true)
                  .build())
              .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
              .companyTitle("x")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = EntityCreateBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwner(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
              .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                  .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                      .city("x")
                      .line1("x")
                      .state("x")
                      .zip("x")
                      .line2("x")
                      .build())
                  .dateOfBirth(LocalDate.parse("2019-12-27"))
                  .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                      .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                      .number("xxxx")
                      .driversLicense(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.DriversLicense.builder()
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .fileId("file_id")
                          .state("x")
                          .backFileId("back_file_id")
                          .build())
                      .other(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Other.builder()
                          .country("x")
                          .description("x")
                          .fileId("file_id")
                          .backFileId("back_file_id")
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .build())
                      .passport(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Passport.builder()
                          .country("x")
                          .expirationDate(LocalDate.parse("2019-12-27"))
                          .fileId("file_id")
                          .build())
                      .build())
                  .name("x")
                  .confirmedNoUsTaxId(true)
                  .build())
              .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
              .companyTitle("x")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.beneficialOwner()).isEqualTo(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
          .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
              .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                  .city("x")
                  .line1("x")
                  .state("x")
                  .zip("x")
                  .line2("x")
                  .build())
              .dateOfBirth(LocalDate.parse("2019-12-27"))
              .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                  .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                  .number("xxxx")
                  .driversLicense(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.DriversLicense.builder()
                      .expirationDate(LocalDate.parse("2019-12-27"))
                      .fileId("file_id")
                      .state("x")
                      .backFileId("back_file_id")
                      .build())
                  .other(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Other.builder()
                      .country("x")
                      .description("x")
                      .fileId("file_id")
                      .backFileId("back_file_id")
                      .expirationDate(LocalDate.parse("2019-12-27"))
                      .build())
                  .passport(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Passport.builder()
                      .country("x")
                      .expirationDate(LocalDate.parse("2019-12-27"))
                      .fileId("file_id")
                      .build())
                  .build())
              .name("x")
              .confirmedNoUsTaxId(true)
              .build())
          .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
          .companyTitle("x")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EntityCreateBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwner(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
              .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                  .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                      .city("x")
                      .line1("x")
                      .state("x")
                      .zip("x")
                      .build())
                  .dateOfBirth(LocalDate.parse("2019-12-27"))
                  .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                      .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                      .number("xxxx")
                      .build())
                  .name("x")
                  .build())
              .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.beneficialOwner()).isEqualTo(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
          .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
              .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                  .city("x")
                  .line1("x")
                  .state("x")
                  .zip("x")
                  .build())
              .dateOfBirth(LocalDate.parse("2019-12-27"))
              .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                  .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                  .number("xxxx")
                  .build())
              .name("x")
              .build())
          .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
          .build())
    }

    @Test
    fun getPathParam() {
      val params = EntityCreateBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwner(EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
              .individual(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                  .address(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address.builder()
                      .city("x")
                      .line1("x")
                      .state("x")
                      .zip("x")
                      .build())
                  .dateOfBirth(LocalDate.parse("2019-12-27"))
                  .identification(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.builder()
                      .method(EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Identification.Method.SOCIAL_SECURITY_NUMBER)
                      .number("xxxx")
                      .build())
                  .name("x")
                  .build())
              .prongs(listOf(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP))
              .build())
          .build()
      assertThat(params).isNotNull
      // path param "entityId"
      assertThat(params.getPathParam(0)).isEqualTo("entity_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
