// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementTest {

    @Test
    fun createCardPurchaseSupplement() {
        val cardPurchaseSupplement =
            CardPurchaseSupplement.builder()
                .id("string")
                .cardPaymentId("string")
                .invoice(
                    CardPurchaseSupplement.Invoice.builder()
                        .discountAmount(123L)
                        .discountCurrency("string")
                        .discountTreatmentCode(
                            CardPurchaseSupplement.Invoice.DiscountTreatmentCode
                                .NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                        )
                        .dutyTaxAmount(123L)
                        .dutyTaxCurrency("string")
                        .orderDate(LocalDate.parse("2019-12-27"))
                        .shippingAmount(123L)
                        .shippingCurrency("string")
                        .shippingDestinationCountryCode("string")
                        .shippingDestinationPostalCode("string")
                        .shippingSourcePostalCode("string")
                        .shippingTaxAmount(123L)
                        .shippingTaxCurrency("string")
                        .shippingTaxRate("string")
                        .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
                        .uniqueValueAddedTaxInvoiceReference("string")
                        .build()
                )
                .lineItems(
                    listOf(
                        CardPurchaseSupplement.LineItem.builder()
                            .id("string")
                            .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                            .discountAmount(123L)
                            .discountCurrency("string")
                            .discountTreatmentCode(
                                CardPurchaseSupplement.LineItem.DiscountTreatmentCode
                                    .NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                            )
                            .itemCommodityCode("string")
                            .itemDescriptor("string")
                            .itemQuantity("string")
                            .productCode("string")
                            .salesTaxAmount(123L)
                            .salesTaxCurrency("string")
                            .salesTaxRate("string")
                            .totalAmount(123L)
                            .totalAmountCurrency("string")
                            .unitCost("string")
                            .unitCostCurrency("string")
                            .unitOfMeasureCode("string")
                            .build()
                    )
                )
                .transactionId("string")
                .type(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
                .build()
        assertThat(cardPurchaseSupplement).isNotNull
        assertThat(cardPurchaseSupplement.id()).isEqualTo("string")
        assertThat(cardPurchaseSupplement.cardPaymentId()).isEqualTo("string")
        assertThat(cardPurchaseSupplement.invoice())
            .isEqualTo(
                CardPurchaseSupplement.Invoice.builder()
                    .discountAmount(123L)
                    .discountCurrency("string")
                    .discountTreatmentCode(
                        CardPurchaseSupplement.Invoice.DiscountTreatmentCode
                            .NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    )
                    .dutyTaxAmount(123L)
                    .dutyTaxCurrency("string")
                    .orderDate(LocalDate.parse("2019-12-27"))
                    .shippingAmount(123L)
                    .shippingCurrency("string")
                    .shippingDestinationCountryCode("string")
                    .shippingDestinationPostalCode("string")
                    .shippingSourcePostalCode("string")
                    .shippingTaxAmount(123L)
                    .shippingTaxCurrency("string")
                    .shippingTaxRate("string")
                    .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
                    .uniqueValueAddedTaxInvoiceReference("string")
                    .build()
            )
        assertThat(cardPurchaseSupplement.lineItems())
            .containsExactly(
                CardPurchaseSupplement.LineItem.builder()
                    .id("string")
                    .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                    .discountAmount(123L)
                    .discountCurrency("string")
                    .discountTreatmentCode(
                        CardPurchaseSupplement.LineItem.DiscountTreatmentCode
                            .NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    )
                    .itemCommodityCode("string")
                    .itemDescriptor("string")
                    .itemQuantity("string")
                    .productCode("string")
                    .salesTaxAmount(123L)
                    .salesTaxCurrency("string")
                    .salesTaxRate("string")
                    .totalAmount(123L)
                    .totalAmountCurrency("string")
                    .unitCost("string")
                    .unitCostCurrency("string")
                    .unitOfMeasureCode("string")
                    .build()
            )
        assertThat(cardPurchaseSupplement.transactionId()).isEqualTo("string")
        assertThat(cardPurchaseSupplement.type())
            .isEqualTo(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
    }
}
