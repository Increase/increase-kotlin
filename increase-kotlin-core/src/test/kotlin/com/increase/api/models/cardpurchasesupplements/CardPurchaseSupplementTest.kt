// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPurchaseSupplementTest {

    @Test
    fun create() {
        val cardPurchaseSupplement =
            CardPurchaseSupplement.builder()
                .id("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .invoice(
                    CardPurchaseSupplement.Invoice.builder()
                        .discountAmount(100L)
                        .discountCurrency("USD")
                        .discountTreatmentCode(null)
                        .dutyTaxAmount(200L)
                        .dutyTaxCurrency("USD")
                        .orderDate(LocalDate.parse("2023-07-20"))
                        .shippingAmount(300L)
                        .shippingCurrency("USD")
                        .shippingDestinationCountryCode("US")
                        .shippingDestinationPostalCode("10045")
                        .shippingSourcePostalCode("10045")
                        .shippingTaxAmount(400L)
                        .shippingTaxCurrency("USD")
                        .shippingTaxRate("0.2")
                        .taxTreatments(null)
                        .uniqueValueAddedTaxInvoiceReference("12302")
                        .build()
                )
                .addLineItem(
                    CardPurchaseSupplement.LineItem.builder()
                        .id("card_purchase_supplement_invoice_line_item_nf9760lz0apqy5retmqh")
                        .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                        .discountAmount(null)
                        .discountCurrency(null)
                        .discountTreatmentCode(null)
                        .itemCommodityCode("001")
                        .itemDescriptor("Coffee")
                        .itemQuantity("1.0")
                        .productCode("101")
                        .salesTaxAmount(null)
                        .salesTaxCurrency(null)
                        .salesTaxRate(null)
                        .totalAmount(500L)
                        .totalAmountCurrency("USD")
                        .unitCost("5.0")
                        .unitCostCurrency("USD")
                        .unitOfMeasureCode("NMB")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
                .build()

        assertThat(cardPurchaseSupplement.id())
            .isEqualTo("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
        assertThat(cardPurchaseSupplement.cardPaymentId())
            .isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(cardPurchaseSupplement.invoice())
            .isEqualTo(
                CardPurchaseSupplement.Invoice.builder()
                    .discountAmount(100L)
                    .discountCurrency("USD")
                    .discountTreatmentCode(null)
                    .dutyTaxAmount(200L)
                    .dutyTaxCurrency("USD")
                    .orderDate(LocalDate.parse("2023-07-20"))
                    .shippingAmount(300L)
                    .shippingCurrency("USD")
                    .shippingDestinationCountryCode("US")
                    .shippingDestinationPostalCode("10045")
                    .shippingSourcePostalCode("10045")
                    .shippingTaxAmount(400L)
                    .shippingTaxCurrency("USD")
                    .shippingTaxRate("0.2")
                    .taxTreatments(null)
                    .uniqueValueAddedTaxInvoiceReference("12302")
                    .build()
            )
        assertThat(cardPurchaseSupplement.lineItems())
            .containsExactly(
                CardPurchaseSupplement.LineItem.builder()
                    .id("card_purchase_supplement_invoice_line_item_nf9760lz0apqy5retmqh")
                    .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                    .discountAmount(null)
                    .discountCurrency(null)
                    .discountTreatmentCode(null)
                    .itemCommodityCode("001")
                    .itemDescriptor("Coffee")
                    .itemQuantity("1.0")
                    .productCode("101")
                    .salesTaxAmount(null)
                    .salesTaxCurrency(null)
                    .salesTaxRate(null)
                    .totalAmount(500L)
                    .totalAmountCurrency("USD")
                    .unitCost("5.0")
                    .unitCostCurrency("USD")
                    .unitOfMeasureCode("NMB")
                    .build()
            )
        assertThat(cardPurchaseSupplement.transactionId())
            .isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(cardPurchaseSupplement.type())
            .isEqualTo(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPurchaseSupplement =
            CardPurchaseSupplement.builder()
                .id("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .invoice(
                    CardPurchaseSupplement.Invoice.builder()
                        .discountAmount(100L)
                        .discountCurrency("USD")
                        .discountTreatmentCode(null)
                        .dutyTaxAmount(200L)
                        .dutyTaxCurrency("USD")
                        .orderDate(LocalDate.parse("2023-07-20"))
                        .shippingAmount(300L)
                        .shippingCurrency("USD")
                        .shippingDestinationCountryCode("US")
                        .shippingDestinationPostalCode("10045")
                        .shippingSourcePostalCode("10045")
                        .shippingTaxAmount(400L)
                        .shippingTaxCurrency("USD")
                        .shippingTaxRate("0.2")
                        .taxTreatments(null)
                        .uniqueValueAddedTaxInvoiceReference("12302")
                        .build()
                )
                .addLineItem(
                    CardPurchaseSupplement.LineItem.builder()
                        .id("card_purchase_supplement_invoice_line_item_nf9760lz0apqy5retmqh")
                        .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                        .discountAmount(null)
                        .discountCurrency(null)
                        .discountTreatmentCode(null)
                        .itemCommodityCode("001")
                        .itemDescriptor("Coffee")
                        .itemQuantity("1.0")
                        .productCode("101")
                        .salesTaxAmount(null)
                        .salesTaxCurrency(null)
                        .salesTaxRate(null)
                        .totalAmount(500L)
                        .totalAmountCurrency("USD")
                        .unitCost("5.0")
                        .unitCostCurrency("USD")
                        .unitOfMeasureCode("NMB")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
                .build()

        val roundtrippedCardPurchaseSupplement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPurchaseSupplement),
                jacksonTypeRef<CardPurchaseSupplement>(),
            )

        assertThat(roundtrippedCardPurchaseSupplement).isEqualTo(cardPurchaseSupplement)
    }
}
