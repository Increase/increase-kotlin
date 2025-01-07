// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardTest {

    @Test
    fun createPhysicalCard() {
        val physicalCard =
            PhysicalCard.builder()
                .id("physical_card_ode8duyq5v2ynhjoharl")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .cardholder(
                    PhysicalCard.Cardholder.builder().firstName("Ian").lastName("Crease").build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .shipment(
                    PhysicalCard.Shipment.builder()
                        .address(
                            PhysicalCard.Shipment.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2("Unit 2")
                                .line3(null)
                                .name("Ian Crease")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .method(PhysicalCard.Shipment.Method.USPS)
                        .status(PhysicalCard.Shipment.Status.PENDING)
                        .tracking(
                            PhysicalCard.Shipment.Tracking.builder()
                                .number("number")
                                .returnNumber("return_number")
                                .returnReason("return_reason")
                                .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .status(PhysicalCard.Status.ACTIVE)
                .type(PhysicalCard.Type.PHYSICAL_CARD)
                .build()
        assertThat(physicalCard).isNotNull
        assertThat(physicalCard.id()).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        assertThat(physicalCard.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(physicalCard.cardholder())
            .isEqualTo(
                PhysicalCard.Cardholder.builder().firstName("Ian").lastName("Crease").build()
            )
        assertThat(physicalCard.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(physicalCard.idempotencyKey()).isNull()
        assertThat(physicalCard.physicalCardProfileId())
            .isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        assertThat(physicalCard.shipment())
            .isEqualTo(
                PhysicalCard.Shipment.builder()
                    .address(
                        PhysicalCard.Shipment.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2("Unit 2")
                            .line3(null)
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .method(PhysicalCard.Shipment.Method.USPS)
                    .status(PhysicalCard.Shipment.Status.PENDING)
                    .tracking(
                        PhysicalCard.Shipment.Tracking.builder()
                            .number("number")
                            .returnNumber("return_number")
                            .returnReason("return_reason")
                            .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(physicalCard.status()).isEqualTo(PhysicalCard.Status.ACTIVE)
        assertThat(physicalCard.type()).isEqualTo(PhysicalCard.Type.PHYSICAL_CARD)
    }
}
