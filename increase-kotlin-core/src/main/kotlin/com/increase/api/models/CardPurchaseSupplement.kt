// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects

/**
 * Additional information about a card purchase (e.g., settlement or refund), such as level 3 line
 * item data.
 */
@NoAutoDetect
class CardPurchaseSupplement
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_payment_id")
    @ExcludeMissing
    private val cardPaymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice")
    @ExcludeMissing
    private val invoice: JsonField<Invoice> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Card Purchase Supplement identifier. */
    fun id(): String = id.getRequired("id")

    /** The ID of the Card Payment this transaction belongs to. */
    fun cardPaymentId(): String? = cardPaymentId.getNullable("card_payment_id")

    /** Invoice-level information about the payment. */
    fun invoice(): Invoice? = invoice.getNullable("invoice")

    /** Line item information, such as individual products purchased. */
    fun lineItems(): List<LineItem>? = lineItems.getNullable("line_items")

    /** The ID of the transaction. */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Card Purchase Supplement identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The ID of the Card Payment this transaction belongs to. */
    @JsonProperty("card_payment_id")
    @ExcludeMissing
    fun _cardPaymentId(): JsonField<String> = cardPaymentId

    /** Invoice-level information about the payment. */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<Invoice> = invoice

    /** Line item information, such as individual products purchased. */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /** The ID of the transaction. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardPurchaseSupplement = apply {
        if (validated) {
            return@apply
        }

        id()
        cardPaymentId()
        invoice()?.validate()
        lineItems()?.forEach { it.validate() }
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var cardPaymentId: JsonField<String>? = null
        private var invoice: JsonField<Invoice>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardPurchaseSupplement: CardPurchaseSupplement) = apply {
            id = cardPurchaseSupplement.id
            cardPaymentId = cardPurchaseSupplement.cardPaymentId
            invoice = cardPurchaseSupplement.invoice
            lineItems = cardPurchaseSupplement.lineItems.map { it.toMutableList() }
            transactionId = cardPurchaseSupplement.transactionId
            type = cardPurchaseSupplement.type
            additionalProperties = cardPurchaseSupplement.additionalProperties.toMutableMap()
        }

        /** The Card Purchase Supplement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Purchase Supplement identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the Card Payment this transaction belongs to. */
        fun cardPaymentId(cardPaymentId: String?) =
            cardPaymentId(JsonField.ofNullable(cardPaymentId))

        /** The ID of the Card Payment this transaction belongs to. */
        fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
            this.cardPaymentId = cardPaymentId
        }

        /** Invoice-level information about the payment. */
        fun invoice(invoice: Invoice?) = invoice(JsonField.ofNullable(invoice))

        /** Invoice-level information about the payment. */
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

        /** Line item information, such as individual products purchased. */
        fun lineItems(lineItems: List<LineItem>?) = lineItems(JsonField.ofNullable(lineItems))

        /** Line item information, such as individual products purchased. */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /** Line item information, such as individual products purchased. */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(lineItem)
                }
        }

        /** The ID of the transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the transaction. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_purchase_supplement`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_purchase_supplement`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): CardPurchaseSupplement =
            CardPurchaseSupplement(
                checkRequired("id", id),
                checkRequired("cardPaymentId", cardPaymentId),
                checkRequired("invoice", invoice),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Invoice-level information about the payment. */
    @NoAutoDetect
    class Invoice
    @JsonCreator
    private constructor(
        @JsonProperty("discount_amount")
        @ExcludeMissing
        private val discountAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_currency")
        @ExcludeMissing
        private val discountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of(),
        @JsonProperty("duty_tax_amount")
        @ExcludeMissing
        private val dutyTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duty_tax_currency")
        @ExcludeMissing
        private val dutyTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_date")
        @ExcludeMissing
        private val orderDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("shipping_amount")
        @ExcludeMissing
        private val shippingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping_currency")
        @ExcludeMissing
        private val shippingCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_destination_country_code")
        @ExcludeMissing
        private val shippingDestinationCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_destination_postal_code")
        @ExcludeMissing
        private val shippingDestinationPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_source_postal_code")
        @ExcludeMissing
        private val shippingSourcePostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_tax_amount")
        @ExcludeMissing
        private val shippingTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping_tax_currency")
        @ExcludeMissing
        private val shippingTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_tax_rate")
        @ExcludeMissing
        private val shippingTaxRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_treatments")
        @ExcludeMissing
        private val taxTreatments: JsonField<TaxTreatments> = JsonMissing.of(),
        @JsonProperty("unique_value_added_tax_invoice_reference")
        @ExcludeMissing
        private val uniqueValueAddedTaxInvoiceReference: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Discount given to cardholder. */
        fun discountAmount(): Long? = discountAmount.getNullable("discount_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        fun discountCurrency(): String? = discountCurrency.getNullable("discount_currency")

        /** Indicates how the merchant applied the discount. */
        fun discountTreatmentCode(): DiscountTreatmentCode? =
            discountTreatmentCode.getNullable("discount_treatment_code")

        /** Amount of duty taxes. */
        fun dutyTaxAmount(): Long? = dutyTaxAmount.getNullable("duty_tax_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
        fun dutyTaxCurrency(): String? = dutyTaxCurrency.getNullable("duty_tax_currency")

        /** Date the order was taken. */
        fun orderDate(): LocalDate? = orderDate.getNullable("order_date")

        /** The shipping cost. */
        fun shippingAmount(): Long? = shippingAmount.getNullable("shipping_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost. */
        fun shippingCurrency(): String? = shippingCurrency.getNullable("shipping_currency")

        /** Country code of the shipping destination. */
        fun shippingDestinationCountryCode(): String? =
            shippingDestinationCountryCode.getNullable("shipping_destination_country_code")

        /** Postal code of the shipping destination. */
        fun shippingDestinationPostalCode(): String? =
            shippingDestinationPostalCode.getNullable("shipping_destination_postal_code")

        /** Postal code of the location being shipped from. */
        fun shippingSourcePostalCode(): String? =
            shippingSourcePostalCode.getNullable("shipping_source_postal_code")

        /** Taxes paid for freight and shipping. */
        fun shippingTaxAmount(): Long? = shippingTaxAmount.getNullable("shipping_tax_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
        fun shippingTaxCurrency(): String? =
            shippingTaxCurrency.getNullable("shipping_tax_currency")

        /** Tax rate for freight and shipping. */
        fun shippingTaxRate(): String? = shippingTaxRate.getNullable("shipping_tax_rate")

        /** Indicates how the merchant applied taxes. */
        fun taxTreatments(): TaxTreatments? = taxTreatments.getNullable("tax_treatments")

        /** Value added tax invoice reference number. */
        fun uniqueValueAddedTaxInvoiceReference(): String? =
            uniqueValueAddedTaxInvoiceReference.getNullable(
                "unique_value_added_tax_invoice_reference"
            )

        /** Discount given to cardholder. */
        @JsonProperty("discount_amount")
        @ExcludeMissing
        fun _discountAmount(): JsonField<Long> = discountAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency(): JsonField<String> = discountCurrency

        /** Indicates how the merchant applied the discount. */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode(): JsonField<DiscountTreatmentCode> = discountTreatmentCode

        /** Amount of duty taxes. */
        @JsonProperty("duty_tax_amount")
        @ExcludeMissing
        fun _dutyTaxAmount(): JsonField<Long> = dutyTaxAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
        @JsonProperty("duty_tax_currency")
        @ExcludeMissing
        fun _dutyTaxCurrency(): JsonField<String> = dutyTaxCurrency

        /** Date the order was taken. */
        @JsonProperty("order_date")
        @ExcludeMissing
        fun _orderDate(): JsonField<LocalDate> = orderDate

        /** The shipping cost. */
        @JsonProperty("shipping_amount")
        @ExcludeMissing
        fun _shippingAmount(): JsonField<Long> = shippingAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost. */
        @JsonProperty("shipping_currency")
        @ExcludeMissing
        fun _shippingCurrency(): JsonField<String> = shippingCurrency

        /** Country code of the shipping destination. */
        @JsonProperty("shipping_destination_country_code")
        @ExcludeMissing
        fun _shippingDestinationCountryCode(): JsonField<String> = shippingDestinationCountryCode

        /** Postal code of the shipping destination. */
        @JsonProperty("shipping_destination_postal_code")
        @ExcludeMissing
        fun _shippingDestinationPostalCode(): JsonField<String> = shippingDestinationPostalCode

        /** Postal code of the location being shipped from. */
        @JsonProperty("shipping_source_postal_code")
        @ExcludeMissing
        fun _shippingSourcePostalCode(): JsonField<String> = shippingSourcePostalCode

        /** Taxes paid for freight and shipping. */
        @JsonProperty("shipping_tax_amount")
        @ExcludeMissing
        fun _shippingTaxAmount(): JsonField<Long> = shippingTaxAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
        @JsonProperty("shipping_tax_currency")
        @ExcludeMissing
        fun _shippingTaxCurrency(): JsonField<String> = shippingTaxCurrency

        /** Tax rate for freight and shipping. */
        @JsonProperty("shipping_tax_rate")
        @ExcludeMissing
        fun _shippingTaxRate(): JsonField<String> = shippingTaxRate

        /** Indicates how the merchant applied taxes. */
        @JsonProperty("tax_treatments")
        @ExcludeMissing
        fun _taxTreatments(): JsonField<TaxTreatments> = taxTreatments

        /** Value added tax invoice reference number. */
        @JsonProperty("unique_value_added_tax_invoice_reference")
        @ExcludeMissing
        fun _uniqueValueAddedTaxInvoiceReference(): JsonField<String> =
            uniqueValueAddedTaxInvoiceReference

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

            discountAmount()
            discountCurrency()
            discountTreatmentCode()
            dutyTaxAmount()
            dutyTaxCurrency()
            orderDate()
            shippingAmount()
            shippingCurrency()
            shippingDestinationCountryCode()
            shippingDestinationPostalCode()
            shippingSourcePostalCode()
            shippingTaxAmount()
            shippingTaxCurrency()
            shippingTaxRate()
            taxTreatments()
            uniqueValueAddedTaxInvoiceReference()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var discountAmount: JsonField<Long>? = null
            private var discountCurrency: JsonField<String>? = null
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode>? = null
            private var dutyTaxAmount: JsonField<Long>? = null
            private var dutyTaxCurrency: JsonField<String>? = null
            private var orderDate: JsonField<LocalDate>? = null
            private var shippingAmount: JsonField<Long>? = null
            private var shippingCurrency: JsonField<String>? = null
            private var shippingDestinationCountryCode: JsonField<String>? = null
            private var shippingDestinationPostalCode: JsonField<String>? = null
            private var shippingSourcePostalCode: JsonField<String>? = null
            private var shippingTaxAmount: JsonField<Long>? = null
            private var shippingTaxCurrency: JsonField<String>? = null
            private var shippingTaxRate: JsonField<String>? = null
            private var taxTreatments: JsonField<TaxTreatments>? = null
            private var uniqueValueAddedTaxInvoiceReference: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoice: Invoice) = apply {
                discountAmount = invoice.discountAmount
                discountCurrency = invoice.discountCurrency
                discountTreatmentCode = invoice.discountTreatmentCode
                dutyTaxAmount = invoice.dutyTaxAmount
                dutyTaxCurrency = invoice.dutyTaxCurrency
                orderDate = invoice.orderDate
                shippingAmount = invoice.shippingAmount
                shippingCurrency = invoice.shippingCurrency
                shippingDestinationCountryCode = invoice.shippingDestinationCountryCode
                shippingDestinationPostalCode = invoice.shippingDestinationPostalCode
                shippingSourcePostalCode = invoice.shippingSourcePostalCode
                shippingTaxAmount = invoice.shippingTaxAmount
                shippingTaxCurrency = invoice.shippingTaxCurrency
                shippingTaxRate = invoice.shippingTaxRate
                taxTreatments = invoice.taxTreatments
                uniqueValueAddedTaxInvoiceReference = invoice.uniqueValueAddedTaxInvoiceReference
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            /** Discount given to cardholder. */
            fun discountAmount(discountAmount: Long?) =
                discountAmount(JsonField.ofNullable(discountAmount))

            /** Discount given to cardholder. */
            fun discountAmount(discountAmount: Long) = discountAmount(discountAmount as Long?)

            /** Discount given to cardholder. */
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String?) =
                discountCurrency(JsonField.ofNullable(discountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode?) =
                discountTreatmentCode(JsonField.ofNullable(discountTreatmentCode))

            /** Indicates how the merchant applied the discount. */
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** Amount of duty taxes. */
            fun dutyTaxAmount(dutyTaxAmount: Long?) =
                dutyTaxAmount(JsonField.ofNullable(dutyTaxAmount))

            /** Amount of duty taxes. */
            fun dutyTaxAmount(dutyTaxAmount: Long) = dutyTaxAmount(dutyTaxAmount as Long?)

            /** Amount of duty taxes. */
            fun dutyTaxAmount(dutyTaxAmount: JsonField<Long>) = apply {
                this.dutyTaxAmount = dutyTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
            fun dutyTaxCurrency(dutyTaxCurrency: String?) =
                dutyTaxCurrency(JsonField.ofNullable(dutyTaxCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
            fun dutyTaxCurrency(dutyTaxCurrency: JsonField<String>) = apply {
                this.dutyTaxCurrency = dutyTaxCurrency
            }

            /** Date the order was taken. */
            fun orderDate(orderDate: LocalDate?) = orderDate(JsonField.ofNullable(orderDate))

            /** Date the order was taken. */
            fun orderDate(orderDate: JsonField<LocalDate>) = apply { this.orderDate = orderDate }

            /** The shipping cost. */
            fun shippingAmount(shippingAmount: Long?) =
                shippingAmount(JsonField.ofNullable(shippingAmount))

            /** The shipping cost. */
            fun shippingAmount(shippingAmount: Long) = shippingAmount(shippingAmount as Long?)

            /** The shipping cost. */
            fun shippingAmount(shippingAmount: JsonField<Long>) = apply {
                this.shippingAmount = shippingAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
             */
            fun shippingCurrency(shippingCurrency: String?) =
                shippingCurrency(JsonField.ofNullable(shippingCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
             */
            fun shippingCurrency(shippingCurrency: JsonField<String>) = apply {
                this.shippingCurrency = shippingCurrency
            }

            /** Country code of the shipping destination. */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: String?) =
                shippingDestinationCountryCode(JsonField.ofNullable(shippingDestinationCountryCode))

            /** Country code of the shipping destination. */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: JsonField<String>) =
                apply {
                    this.shippingDestinationCountryCode = shippingDestinationCountryCode
                }

            /** Postal code of the shipping destination. */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: String?) =
                shippingDestinationPostalCode(JsonField.ofNullable(shippingDestinationPostalCode))

            /** Postal code of the shipping destination. */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: JsonField<String>) =
                apply {
                    this.shippingDestinationPostalCode = shippingDestinationPostalCode
                }

            /** Postal code of the location being shipped from. */
            fun shippingSourcePostalCode(shippingSourcePostalCode: String?) =
                shippingSourcePostalCode(JsonField.ofNullable(shippingSourcePostalCode))

            /** Postal code of the location being shipped from. */
            fun shippingSourcePostalCode(shippingSourcePostalCode: JsonField<String>) = apply {
                this.shippingSourcePostalCode = shippingSourcePostalCode
            }

            /** Taxes paid for freight and shipping. */
            fun shippingTaxAmount(shippingTaxAmount: Long?) =
                shippingTaxAmount(JsonField.ofNullable(shippingTaxAmount))

            /** Taxes paid for freight and shipping. */
            fun shippingTaxAmount(shippingTaxAmount: Long) =
                shippingTaxAmount(shippingTaxAmount as Long?)

            /** Taxes paid for freight and shipping. */
            fun shippingTaxAmount(shippingTaxAmount: JsonField<Long>) = apply {
                this.shippingTaxAmount = shippingTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
            fun shippingTaxCurrency(shippingTaxCurrency: String?) =
                shippingTaxCurrency(JsonField.ofNullable(shippingTaxCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
            fun shippingTaxCurrency(shippingTaxCurrency: JsonField<String>) = apply {
                this.shippingTaxCurrency = shippingTaxCurrency
            }

            /** Tax rate for freight and shipping. */
            fun shippingTaxRate(shippingTaxRate: String?) =
                shippingTaxRate(JsonField.ofNullable(shippingTaxRate))

            /** Tax rate for freight and shipping. */
            fun shippingTaxRate(shippingTaxRate: JsonField<String>) = apply {
                this.shippingTaxRate = shippingTaxRate
            }

            /** Indicates how the merchant applied taxes. */
            fun taxTreatments(taxTreatments: TaxTreatments?) =
                taxTreatments(JsonField.ofNullable(taxTreatments))

            /** Indicates how the merchant applied taxes. */
            fun taxTreatments(taxTreatments: JsonField<TaxTreatments>) = apply {
                this.taxTreatments = taxTreatments
            }

            /** Value added tax invoice reference number. */
            fun uniqueValueAddedTaxInvoiceReference(uniqueValueAddedTaxInvoiceReference: String?) =
                uniqueValueAddedTaxInvoiceReference(
                    JsonField.ofNullable(uniqueValueAddedTaxInvoiceReference)
                )

            /** Value added tax invoice reference number. */
            fun uniqueValueAddedTaxInvoiceReference(
                uniqueValueAddedTaxInvoiceReference: JsonField<String>
            ) = apply {
                this.uniqueValueAddedTaxInvoiceReference = uniqueValueAddedTaxInvoiceReference
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Invoice =
                Invoice(
                    checkRequired("discountAmount", discountAmount),
                    checkRequired("discountCurrency", discountCurrency),
                    checkRequired("discountTreatmentCode", discountTreatmentCode),
                    checkRequired("dutyTaxAmount", dutyTaxAmount),
                    checkRequired("dutyTaxCurrency", dutyTaxCurrency),
                    checkRequired("orderDate", orderDate),
                    checkRequired("shippingAmount", shippingAmount),
                    checkRequired("shippingCurrency", shippingCurrency),
                    checkRequired("shippingDestinationCountryCode", shippingDestinationCountryCode),
                    checkRequired("shippingDestinationPostalCode", shippingDestinationPostalCode),
                    checkRequired("shippingSourcePostalCode", shippingSourcePostalCode),
                    checkRequired("shippingTaxAmount", shippingTaxAmount),
                    checkRequired("shippingTaxCurrency", shippingTaxCurrency),
                    checkRequired("shippingTaxRate", shippingTaxRate),
                    checkRequired("taxTreatments", taxTreatments),
                    checkRequired(
                        "uniqueValueAddedTaxInvoiceReference",
                        uniqueValueAddedTaxInvoiceReference
                    ),
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountTreatmentCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val NO_INVOICE_LEVEL_DISCOUNT_PROVIDED = of("no_invoice_level_discount_provided")

                val TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL =
                    of("tax_calculated_on_post_discount_invoice_total")

                val TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL =
                    of("tax_calculated_on_pre_discount_invoice_total")

                fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            enum class Known {
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
            }

            enum class Value {
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Value.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Known.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TaxTreatments
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val NO_TAX_APPLIES = of("no_tax_applies")

                val NET_PRICE_LINE_ITEM_LEVEL = of("net_price_line_item_level")

                val NET_PRICE_INVOICE_LEVEL = of("net_price_invoice_level")

                val GROSS_PRICE_LINE_ITEM_LEVEL = of("gross_price_line_item_level")

                val GROSS_PRICE_INVOICE_LEVEL = of("gross_price_invoice_level")

                fun of(value: String) = TaxTreatments(JsonField.of(value))
            }

            enum class Known {
                NO_TAX_APPLIES,
                NET_PRICE_LINE_ITEM_LEVEL,
                NET_PRICE_INVOICE_LEVEL,
                GROSS_PRICE_LINE_ITEM_LEVEL,
                GROSS_PRICE_INVOICE_LEVEL,
            }

            enum class Value {
                NO_TAX_APPLIES,
                NET_PRICE_LINE_ITEM_LEVEL,
                NET_PRICE_INVOICE_LEVEL,
                GROSS_PRICE_LINE_ITEM_LEVEL,
                GROSS_PRICE_INVOICE_LEVEL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_TAX_APPLIES -> Value.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Value.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Value.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Value.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Value.GROSS_PRICE_INVOICE_LEVEL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_TAX_APPLIES -> Known.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Known.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Known.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Known.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Known.GROSS_PRICE_INVOICE_LEVEL
                    else -> throw IncreaseInvalidDataException("Unknown TaxTreatments: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxTreatments && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Invoice && discountAmount == other.discountAmount && discountCurrency == other.discountCurrency && discountTreatmentCode == other.discountTreatmentCode && dutyTaxAmount == other.dutyTaxAmount && dutyTaxCurrency == other.dutyTaxCurrency && orderDate == other.orderDate && shippingAmount == other.shippingAmount && shippingCurrency == other.shippingCurrency && shippingDestinationCountryCode == other.shippingDestinationCountryCode && shippingDestinationPostalCode == other.shippingDestinationPostalCode && shippingSourcePostalCode == other.shippingSourcePostalCode && shippingTaxAmount == other.shippingTaxAmount && shippingTaxCurrency == other.shippingTaxCurrency && shippingTaxRate == other.shippingTaxRate && taxTreatments == other.taxTreatments && uniqueValueAddedTaxInvoiceReference == other.uniqueValueAddedTaxInvoiceReference && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discountAmount, discountCurrency, discountTreatmentCode, dutyTaxAmount, dutyTaxCurrency, orderDate, shippingAmount, shippingCurrency, shippingDestinationCountryCode, shippingDestinationPostalCode, shippingSourcePostalCode, shippingTaxAmount, shippingTaxCurrency, shippingTaxRate, taxTreatments, uniqueValueAddedTaxInvoiceReference, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{discountAmount=$discountAmount, discountCurrency=$discountCurrency, discountTreatmentCode=$discountTreatmentCode, dutyTaxAmount=$dutyTaxAmount, dutyTaxCurrency=$dutyTaxCurrency, orderDate=$orderDate, shippingAmount=$shippingAmount, shippingCurrency=$shippingCurrency, shippingDestinationCountryCode=$shippingDestinationCountryCode, shippingDestinationPostalCode=$shippingDestinationPostalCode, shippingSourcePostalCode=$shippingSourcePostalCode, shippingTaxAmount=$shippingTaxAmount, shippingTaxCurrency=$shippingTaxCurrency, shippingTaxRate=$shippingTaxRate, taxTreatments=$taxTreatments, uniqueValueAddedTaxInvoiceReference=$uniqueValueAddedTaxInvoiceReference, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detail_indicator")
        @ExcludeMissing
        private val detailIndicator: JsonField<DetailIndicator> = JsonMissing.of(),
        @JsonProperty("discount_amount")
        @ExcludeMissing
        private val discountAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_currency")
        @ExcludeMissing
        private val discountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of(),
        @JsonProperty("item_commodity_code")
        @ExcludeMissing
        private val itemCommodityCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_descriptor")
        @ExcludeMissing
        private val itemDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_quantity")
        @ExcludeMissing
        private val itemQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_code")
        @ExcludeMissing
        private val productCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sales_tax_amount")
        @ExcludeMissing
        private val salesTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sales_tax_currency")
        @ExcludeMissing
        private val salesTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sales_tax_rate")
        @ExcludeMissing
        private val salesTaxRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        private val totalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_amount_currency")
        @ExcludeMissing
        private val totalAmountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_cost")
        @ExcludeMissing
        private val unitCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_cost_currency")
        @ExcludeMissing
        private val unitCostCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_of_measure_code")
        @ExcludeMissing
        private val unitOfMeasureCode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Card Purchase Supplement Line Item identifier. */
        fun id(): String = id.getRequired("id")

        /** Indicates the type of line item. */
        fun detailIndicator(): DetailIndicator? = detailIndicator.getNullable("detail_indicator")

        /** Discount amount for this specific line item. */
        fun discountAmount(): Long? = discountAmount.getNullable("discount_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        fun discountCurrency(): String? = discountCurrency.getNullable("discount_currency")

        /** Indicates how the merchant applied the discount for this specific line item. */
        fun discountTreatmentCode(): DiscountTreatmentCode? =
            discountTreatmentCode.getNullable("discount_treatment_code")

        /** Code used to categorize the purchase item. */
        fun itemCommodityCode(): String? = itemCommodityCode.getNullable("item_commodity_code")

        /** Description of the purchase item. */
        fun itemDescriptor(): String? = itemDescriptor.getNullable("item_descriptor")

        /** The number of units of the product being purchased. */
        fun itemQuantity(): String? = itemQuantity.getNullable("item_quantity")

        /** Code used to categorize the product being purchased. */
        fun productCode(): String? = productCode.getNullable("product_code")

        /** Sales tax amount for this line item. */
        fun salesTaxAmount(): Long? = salesTaxAmount.getNullable("sales_tax_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax assessed.
         */
        fun salesTaxCurrency(): String? = salesTaxCurrency.getNullable("sales_tax_currency")

        /** Sales tax rate for this line item. */
        fun salesTaxRate(): String? = salesTaxRate.getNullable("sales_tax_rate")

        /** Total amount of all line items. */
        fun totalAmount(): Long? = totalAmount.getNullable("total_amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
        fun totalAmountCurrency(): String? =
            totalAmountCurrency.getNullable("total_amount_currency")

        /** Cost of line item per unit of measure, in major units. */
        fun unitCost(): String? = unitCost.getNullable("unit_cost")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
        fun unitCostCurrency(): String? = unitCostCurrency.getNullable("unit_cost_currency")

        /** Code indicating unit of measure (gallons, etc.). */
        fun unitOfMeasureCode(): String? = unitOfMeasureCode.getNullable("unit_of_measure_code")

        /** The Card Purchase Supplement Line Item identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Indicates the type of line item. */
        @JsonProperty("detail_indicator")
        @ExcludeMissing
        fun _detailIndicator(): JsonField<DetailIndicator> = detailIndicator

        /** Discount amount for this specific line item. */
        @JsonProperty("discount_amount")
        @ExcludeMissing
        fun _discountAmount(): JsonField<Long> = discountAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency(): JsonField<String> = discountCurrency

        /** Indicates how the merchant applied the discount for this specific line item. */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode(): JsonField<DiscountTreatmentCode> = discountTreatmentCode

        /** Code used to categorize the purchase item. */
        @JsonProperty("item_commodity_code")
        @ExcludeMissing
        fun _itemCommodityCode(): JsonField<String> = itemCommodityCode

        /** Description of the purchase item. */
        @JsonProperty("item_descriptor")
        @ExcludeMissing
        fun _itemDescriptor(): JsonField<String> = itemDescriptor

        /** The number of units of the product being purchased. */
        @JsonProperty("item_quantity")
        @ExcludeMissing
        fun _itemQuantity(): JsonField<String> = itemQuantity

        /** Code used to categorize the product being purchased. */
        @JsonProperty("product_code")
        @ExcludeMissing
        fun _productCode(): JsonField<String> = productCode

        /** Sales tax amount for this line item. */
        @JsonProperty("sales_tax_amount")
        @ExcludeMissing
        fun _salesTaxAmount(): JsonField<Long> = salesTaxAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax assessed.
         */
        @JsonProperty("sales_tax_currency")
        @ExcludeMissing
        fun _salesTaxCurrency(): JsonField<String> = salesTaxCurrency

        /** Sales tax rate for this line item. */
        @JsonProperty("sales_tax_rate")
        @ExcludeMissing
        fun _salesTaxRate(): JsonField<String> = salesTaxRate

        /** Total amount of all line items. */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun _totalAmount(): JsonField<Long> = totalAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
        @JsonProperty("total_amount_currency")
        @ExcludeMissing
        fun _totalAmountCurrency(): JsonField<String> = totalAmountCurrency

        /** Cost of line item per unit of measure, in major units. */
        @JsonProperty("unit_cost") @ExcludeMissing fun _unitCost(): JsonField<String> = unitCost

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
        @JsonProperty("unit_cost_currency")
        @ExcludeMissing
        fun _unitCostCurrency(): JsonField<String> = unitCostCurrency

        /** Code indicating unit of measure (gallons, etc.). */
        @JsonProperty("unit_of_measure_code")
        @ExcludeMissing
        fun _unitOfMeasureCode(): JsonField<String> = unitOfMeasureCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            id()
            detailIndicator()
            discountAmount()
            discountCurrency()
            discountTreatmentCode()
            itemCommodityCode()
            itemDescriptor()
            itemQuantity()
            productCode()
            salesTaxAmount()
            salesTaxCurrency()
            salesTaxRate()
            totalAmount()
            totalAmountCurrency()
            unitCost()
            unitCostCurrency()
            unitOfMeasureCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var detailIndicator: JsonField<DetailIndicator>? = null
            private var discountAmount: JsonField<Long>? = null
            private var discountCurrency: JsonField<String>? = null
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode>? = null
            private var itemCommodityCode: JsonField<String>? = null
            private var itemDescriptor: JsonField<String>? = null
            private var itemQuantity: JsonField<String>? = null
            private var productCode: JsonField<String>? = null
            private var salesTaxAmount: JsonField<Long>? = null
            private var salesTaxCurrency: JsonField<String>? = null
            private var salesTaxRate: JsonField<String>? = null
            private var totalAmount: JsonField<Long>? = null
            private var totalAmountCurrency: JsonField<String>? = null
            private var unitCost: JsonField<String>? = null
            private var unitCostCurrency: JsonField<String>? = null
            private var unitOfMeasureCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItem: LineItem) = apply {
                id = lineItem.id
                detailIndicator = lineItem.detailIndicator
                discountAmount = lineItem.discountAmount
                discountCurrency = lineItem.discountCurrency
                discountTreatmentCode = lineItem.discountTreatmentCode
                itemCommodityCode = lineItem.itemCommodityCode
                itemDescriptor = lineItem.itemDescriptor
                itemQuantity = lineItem.itemQuantity
                productCode = lineItem.productCode
                salesTaxAmount = lineItem.salesTaxAmount
                salesTaxCurrency = lineItem.salesTaxCurrency
                salesTaxRate = lineItem.salesTaxRate
                totalAmount = lineItem.totalAmount
                totalAmountCurrency = lineItem.totalAmountCurrency
                unitCost = lineItem.unitCost
                unitCostCurrency = lineItem.unitCostCurrency
                unitOfMeasureCode = lineItem.unitOfMeasureCode
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The Card Purchase Supplement Line Item identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Card Purchase Supplement Line Item identifier. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Indicates the type of line item. */
            fun detailIndicator(detailIndicator: DetailIndicator?) =
                detailIndicator(JsonField.ofNullable(detailIndicator))

            /** Indicates the type of line item. */
            fun detailIndicator(detailIndicator: JsonField<DetailIndicator>) = apply {
                this.detailIndicator = detailIndicator
            }

            /** Discount amount for this specific line item. */
            fun discountAmount(discountAmount: Long?) =
                discountAmount(JsonField.ofNullable(discountAmount))

            /** Discount amount for this specific line item. */
            fun discountAmount(discountAmount: Long) = discountAmount(discountAmount as Long?)

            /** Discount amount for this specific line item. */
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String?) =
                discountCurrency(JsonField.ofNullable(discountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount for this specific line item. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode?) =
                discountTreatmentCode(JsonField.ofNullable(discountTreatmentCode))

            /** Indicates how the merchant applied the discount for this specific line item. */
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** Code used to categorize the purchase item. */
            fun itemCommodityCode(itemCommodityCode: String?) =
                itemCommodityCode(JsonField.ofNullable(itemCommodityCode))

            /** Code used to categorize the purchase item. */
            fun itemCommodityCode(itemCommodityCode: JsonField<String>) = apply {
                this.itemCommodityCode = itemCommodityCode
            }

            /** Description of the purchase item. */
            fun itemDescriptor(itemDescriptor: String?) =
                itemDescriptor(JsonField.ofNullable(itemDescriptor))

            /** Description of the purchase item. */
            fun itemDescriptor(itemDescriptor: JsonField<String>) = apply {
                this.itemDescriptor = itemDescriptor
            }

            /** The number of units of the product being purchased. */
            fun itemQuantity(itemQuantity: String?) =
                itemQuantity(JsonField.ofNullable(itemQuantity))

            /** The number of units of the product being purchased. */
            fun itemQuantity(itemQuantity: JsonField<String>) = apply {
                this.itemQuantity = itemQuantity
            }

            /** Code used to categorize the product being purchased. */
            fun productCode(productCode: String?) = productCode(JsonField.ofNullable(productCode))

            /** Code used to categorize the product being purchased. */
            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /** Sales tax amount for this line item. */
            fun salesTaxAmount(salesTaxAmount: Long?) =
                salesTaxAmount(JsonField.ofNullable(salesTaxAmount))

            /** Sales tax amount for this line item. */
            fun salesTaxAmount(salesTaxAmount: Long) = salesTaxAmount(salesTaxAmount as Long?)

            /** Sales tax amount for this line item. */
            fun salesTaxAmount(salesTaxAmount: JsonField<Long>) = apply {
                this.salesTaxAmount = salesTaxAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax
             * assessed.
             */
            fun salesTaxCurrency(salesTaxCurrency: String?) =
                salesTaxCurrency(JsonField.ofNullable(salesTaxCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax
             * assessed.
             */
            fun salesTaxCurrency(salesTaxCurrency: JsonField<String>) = apply {
                this.salesTaxCurrency = salesTaxCurrency
            }

            /** Sales tax rate for this line item. */
            fun salesTaxRate(salesTaxRate: String?) =
                salesTaxRate(JsonField.ofNullable(salesTaxRate))

            /** Sales tax rate for this line item. */
            fun salesTaxRate(salesTaxRate: JsonField<String>) = apply {
                this.salesTaxRate = salesTaxRate
            }

            /** Total amount of all line items. */
            fun totalAmount(totalAmount: Long?) = totalAmount(JsonField.ofNullable(totalAmount))

            /** Total amount of all line items. */
            fun totalAmount(totalAmount: Long) = totalAmount(totalAmount as Long?)

            /** Total amount of all line items. */
            fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
            fun totalAmountCurrency(totalAmountCurrency: String?) =
                totalAmountCurrency(JsonField.ofNullable(totalAmountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
            fun totalAmountCurrency(totalAmountCurrency: JsonField<String>) = apply {
                this.totalAmountCurrency = totalAmountCurrency
            }

            /** Cost of line item per unit of measure, in major units. */
            fun unitCost(unitCost: String?) = unitCost(JsonField.ofNullable(unitCost))

            /** Cost of line item per unit of measure, in major units. */
            fun unitCost(unitCost: JsonField<String>) = apply { this.unitCost = unitCost }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
            fun unitCostCurrency(unitCostCurrency: String?) =
                unitCostCurrency(JsonField.ofNullable(unitCostCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
            fun unitCostCurrency(unitCostCurrency: JsonField<String>) = apply {
                this.unitCostCurrency = unitCostCurrency
            }

            /** Code indicating unit of measure (gallons, etc.). */
            fun unitOfMeasureCode(unitOfMeasureCode: String?) =
                unitOfMeasureCode(JsonField.ofNullable(unitOfMeasureCode))

            /** Code indicating unit of measure (gallons, etc.). */
            fun unitOfMeasureCode(unitOfMeasureCode: JsonField<String>) = apply {
                this.unitOfMeasureCode = unitOfMeasureCode
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): LineItem =
                LineItem(
                    checkRequired("id", id),
                    checkRequired("detailIndicator", detailIndicator),
                    checkRequired("discountAmount", discountAmount),
                    checkRequired("discountCurrency", discountCurrency),
                    checkRequired("discountTreatmentCode", discountTreatmentCode),
                    checkRequired("itemCommodityCode", itemCommodityCode),
                    checkRequired("itemDescriptor", itemDescriptor),
                    checkRequired("itemQuantity", itemQuantity),
                    checkRequired("productCode", productCode),
                    checkRequired("salesTaxAmount", salesTaxAmount),
                    checkRequired("salesTaxCurrency", salesTaxCurrency),
                    checkRequired("salesTaxRate", salesTaxRate),
                    checkRequired("totalAmount", totalAmount),
                    checkRequired("totalAmountCurrency", totalAmountCurrency),
                    checkRequired("unitCost", unitCost),
                    checkRequired("unitCostCurrency", unitCostCurrency),
                    checkRequired("unitOfMeasureCode", unitOfMeasureCode),
                    additionalProperties.toImmutable(),
                )
        }

        class DetailIndicator
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val NORMAL = of("normal")

                val CREDIT = of("credit")

                val PAYMENT = of("payment")

                fun of(value: String) = DetailIndicator(JsonField.of(value))
            }

            enum class Known {
                NORMAL,
                CREDIT,
                PAYMENT,
            }

            enum class Value {
                NORMAL,
                CREDIT,
                PAYMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NORMAL -> Value.NORMAL
                    CREDIT -> Value.CREDIT
                    PAYMENT -> Value.PAYMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NORMAL -> Known.NORMAL
                    CREDIT -> Known.CREDIT
                    PAYMENT -> Known.PAYMENT
                    else -> throw IncreaseInvalidDataException("Unknown DetailIndicator: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailIndicator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DiscountTreatmentCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED =
                    of("no_line_item_level_discount_provided")

                val TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL =
                    of("tax_calculated_on_post_discount_line_item_total")

                val TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL =
                    of("tax_calculated_on_pre_discount_line_item_total")

                fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            enum class Known {
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
            }

            enum class Value {
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Value.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Known.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && id == other.id && detailIndicator == other.detailIndicator && discountAmount == other.discountAmount && discountCurrency == other.discountCurrency && discountTreatmentCode == other.discountTreatmentCode && itemCommodityCode == other.itemCommodityCode && itemDescriptor == other.itemDescriptor && itemQuantity == other.itemQuantity && productCode == other.productCode && salesTaxAmount == other.salesTaxAmount && salesTaxCurrency == other.salesTaxCurrency && salesTaxRate == other.salesTaxRate && totalAmount == other.totalAmount && totalAmountCurrency == other.totalAmountCurrency && unitCost == other.unitCost && unitCostCurrency == other.unitCostCurrency && unitOfMeasureCode == other.unitOfMeasureCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, detailIndicator, discountAmount, discountCurrency, discountTreatmentCode, itemCommodityCode, itemDescriptor, itemQuantity, productCode, salesTaxAmount, salesTaxCurrency, salesTaxRate, totalAmount, totalAmountCurrency, unitCost, unitCostCurrency, unitOfMeasureCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, detailIndicator=$detailIndicator, discountAmount=$discountAmount, discountCurrency=$discountCurrency, discountTreatmentCode=$discountTreatmentCode, itemCommodityCode=$itemCommodityCode, itemDescriptor=$itemDescriptor, itemQuantity=$itemQuantity, productCode=$productCode, salesTaxAmount=$salesTaxAmount, salesTaxCurrency=$salesTaxCurrency, salesTaxRate=$salesTaxRate, totalAmount=$totalAmount, totalAmountCurrency=$totalAmountCurrency, unitCost=$unitCost, unitCostCurrency=$unitCostCurrency, unitOfMeasureCode=$unitOfMeasureCode, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CARD_PURCHASE_SUPPLEMENT = of("card_purchase_supplement")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_PURCHASE_SUPPLEMENT,
        }

        enum class Value {
            CARD_PURCHASE_SUPPLEMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_PURCHASE_SUPPLEMENT -> Value.CARD_PURCHASE_SUPPLEMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_PURCHASE_SUPPLEMENT -> Known.CARD_PURCHASE_SUPPLEMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPurchaseSupplement && id == other.id && cardPaymentId == other.cardPaymentId && invoice == other.invoice && lineItems == other.lineItems && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, cardPaymentId, invoice, lineItems, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPurchaseSupplement{id=$id, cardPaymentId=$cardPaymentId, invoice=$invoice, lineItems=$lineItems, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
