package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Declined Transactions are refused additions and removals of money from your bank account. For
 * example, Declined Transactions are caused when your Account has an insufficient balance or your
 * Limits are triggered.
 */
@JsonDeserialize(builder = DeclinedTransaction.Builder::class)
@NoAutoDetect
class DeclinedTransaction
private constructor(
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the Account the Declined Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** This is the description the vendor provides. */
    fun description(): String = description.getRequired("description")

    /** The Declined Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     */
    fun routeId(): String? = routeId.getNullable("route_id")

    /** The type of the route this Declined Transaction came through. */
    fun routeType(): RouteType? = routeType.getNullable("route_type")

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Declined Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** This is the description the vendor provides. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Declined Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

    /** The type of the route this Declined Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DeclinedTransaction = apply {
        if (!validated) {
            accountId()
            amount()
            currency()
            createdAt()
            description()
            id()
            routeId()
            routeType()
            source().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeclinedTransaction &&
            this.accountId == other.accountId &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.id == other.id &&
            this.routeId == other.routeId &&
            this.routeType == other.routeType &&
            this.source == other.source &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    amount,
                    currency,
                    createdAt,
                    description,
                    id,
                    routeId,
                    routeType,
                    source,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DeclinedTransaction{accountId=$accountId, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var routeId: JsonField<String> = JsonMissing.of()
        private var routeType: JsonField<RouteType> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(declinedTransaction: DeclinedTransaction) = apply {
            this.accountId = declinedTransaction.accountId
            this.amount = declinedTransaction.amount
            this.currency = declinedTransaction.currency
            this.createdAt = declinedTransaction.createdAt
            this.description = declinedTransaction.description
            this.id = declinedTransaction.id
            this.routeId = declinedTransaction.routeId
            this.routeType = declinedTransaction.routeType
            this.source = declinedTransaction.source
            this.type = declinedTransaction.type
            additionalProperties(declinedTransaction.additionalProperties)
        }

        /** The identifier for the Account the Declined Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Declined Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** This is the description the vendor provides. */
        fun description(description: String) = description(JsonField.of(description))

        /** This is the description the vendor provides. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Declined Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Declined Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        @JsonProperty("route_id")
        @ExcludeMissing
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Declined Transaction came through. */
        fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

        /** The type of the route this Declined Transaction came through. */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the Declined
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location. Note that for backwards compatibility reasons, additional undocumented keys may
         * appear in this object. These should be treated as deprecated and will be removed in the
         * future.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * This is an object giving more details on the network-level event that caused the Declined
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location. Note that for backwards compatibility reasons, additional undocumented keys may
         * appear in this object. These should be treated as deprecated and will be removed in the
         * future.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `declined_transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `declined_transaction`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): DeclinedTransaction =
            DeclinedTransaction(
                accountId,
                amount,
                currency,
                createdAt,
                description,
                id,
                routeId,
                routeType,
                source,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CAD = Currency(JsonField.of("CAD"))

            val CHF = Currency(JsonField.of("CHF"))

            val EUR = Currency(JsonField.of("EUR"))

            val GBP = Currency(JsonField.of("GBP"))

            val JPY = Currency(JsonField.of("JPY"))

            val USD = Currency(JsonField.of("USD"))

            fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class RouteType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RouteType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_NUMBER = RouteType(JsonField.of("account_number"))

            val CARD = RouteType(JsonField.of("card"))

            fun of(value: String) = RouteType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_NUMBER,
            CARD,
        }

        enum class Value {
            ACCOUNT_NUMBER,
            CARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                CARD -> Value.CARD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                CARD -> Known.CARD
                else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @JsonDeserialize(builder = Source.Builder::class)
    @NoAutoDetect
    class Source
    private constructor(
        private val category: JsonField<Category>,
        private val achDecline: JsonField<AchDecline>,
        private val cardDecline: JsonField<CardDecline>,
        private val checkDecline: JsonField<CheckDecline>,
        private val inboundRealTimePaymentsTransferDecline:
            JsonField<InboundRealTimePaymentsTransferDecline>,
        private val internationalAchDecline: JsonField<InternationalAchDecline>,
        private val wireDecline: JsonField<WireDecline>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        fun achDecline(): AchDecline? = achDecline.getNullable("ach_decline")

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        fun cardDecline(): CardDecline? = cardDecline.getNullable("card_decline")

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        fun checkDecline(): CheckDecline? = checkDecline.getNullable("check_decline")

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        fun inboundRealTimePaymentsTransferDecline(): InboundRealTimePaymentsTransferDecline? =
            inboundRealTimePaymentsTransferDecline.getNullable(
                "inbound_real_time_payments_transfer_decline"
            )

        /**
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        fun internationalAchDecline(): InternationalAchDecline? =
            internationalAchDecline.getNullable("international_ach_decline")

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        fun wireDecline(): WireDecline? = wireDecline.getNullable("wire_decline")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @JsonProperty("ach_decline") @ExcludeMissing fun _achDecline() = achDecline

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonProperty("card_decline") @ExcludeMissing fun _cardDecline() = cardDecline

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

        /**
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        @JsonProperty("international_ach_decline")
        @ExcludeMissing
        fun _internationalAchDecline() = internationalAchDecline

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @JsonProperty("wire_decline") @ExcludeMissing fun _wireDecline() = wireDecline

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Source = apply {
            if (!validated) {
                category()
                achDecline()?.validate()
                cardDecline()?.validate()
                checkDecline()?.validate()
                inboundRealTimePaymentsTransferDecline()?.validate()
                internationalAchDecline()?.validate()
                wireDecline()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                this.category == other.category &&
                this.achDecline == other.achDecline &&
                this.cardDecline == other.cardDecline &&
                this.checkDecline == other.checkDecline &&
                this.inboundRealTimePaymentsTransferDecline ==
                    other.inboundRealTimePaymentsTransferDecline &&
                this.internationalAchDecline == other.internationalAchDecline &&
                this.wireDecline == other.wireDecline &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        achDecline,
                        cardDecline,
                        checkDecline,
                        inboundRealTimePaymentsTransferDecline,
                        internationalAchDecline,
                        wireDecline,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Source{category=$category, achDecline=$achDecline, cardDecline=$cardDecline, checkDecline=$checkDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, internationalAchDecline=$internationalAchDecline, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var achDecline: JsonField<AchDecline> = JsonMissing.of()
            private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
            private var checkDecline: JsonField<CheckDecline> = JsonMissing.of()
            private var inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline> =
                JsonMissing.of()
            private var internationalAchDecline: JsonField<InternationalAchDecline> =
                JsonMissing.of()
            private var wireDecline: JsonField<WireDecline> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(source: Source) = apply {
                this.category = source.category
                this.achDecline = source.achDecline
                this.cardDecline = source.cardDecline
                this.checkDecline = source.checkDecline
                this.inboundRealTimePaymentsTransferDecline =
                    source.inboundRealTimePaymentsTransferDecline
                this.internationalAchDecline = source.internationalAchDecline
                this.wireDecline = source.wireDecline
                additionalProperties(source.additionalProperties)
            }

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: AchDecline) = achDecline(JsonField.of(achDecline))

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            @JsonProperty("ach_decline")
            @ExcludeMissing
            fun achDecline(achDecline: JsonField<AchDecline>) = apply {
                this.achDecline = achDecline
            }

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: CardDecline) = cardDecline(JsonField.of(cardDecline))

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            @JsonProperty("card_decline")
            @ExcludeMissing
            fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                this.cardDecline = cardDecline
            }

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(checkDecline: CheckDecline) = checkDecline(JsonField.of(checkDecline))

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonProperty("check_decline")
            @ExcludeMissing
            fun checkDecline(checkDecline: JsonField<CheckDecline>) = apply {
                this.checkDecline = checkDecline
            }

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
            ) =
                inboundRealTimePaymentsTransferDecline(
                    JsonField.of(inboundRealTimePaymentsTransferDecline)
                )

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_decline")
            @ExcludeMissing
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline:
                    JsonField<InboundRealTimePaymentsTransferDecline>
            ) = apply {
                this.inboundRealTimePaymentsTransferDecline = inboundRealTimePaymentsTransferDecline
            }

            /**
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            fun internationalAchDecline(internationalAchDecline: InternationalAchDecline) =
                internationalAchDecline(JsonField.of(internationalAchDecline))

            /**
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonProperty("international_ach_decline")
            @ExcludeMissing
            fun internationalAchDecline(
                internationalAchDecline: JsonField<InternationalAchDecline>
            ) = apply { this.internationalAchDecline = internationalAchDecline }

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(wireDecline: WireDecline) = wireDecline(JsonField.of(wireDecline))

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            @JsonProperty("wire_decline")
            @ExcludeMissing
            fun wireDecline(wireDecline: JsonField<WireDecline>) = apply {
                this.wireDecline = wireDecline
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Source =
                Source(
                    category,
                    achDecline,
                    cardDecline,
                    checkDecline,
                    inboundRealTimePaymentsTransferDecline,
                    internationalAchDecline,
                    wireDecline,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @JsonDeserialize(builder = AchDecline.Builder::class)
        @NoAutoDetect
        class AchDecline
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val originatorCompanyName: JsonField<String>,
            private val originatorCompanyDescriptiveDate: JsonField<String>,
            private val originatorCompanyDiscretionaryData: JsonField<String>,
            private val originatorCompanyId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val receiverIdNumber: JsonField<String>,
            private val receiverName: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The ACH Decline's identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The name of the company that initiated the transfer. */
            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

            /** The descriptive date of the transfer. */
            fun originatorCompanyDescriptiveDate(): String? =
                originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date")

            /** The additional information included with the transfer. */
            fun originatorCompanyDiscretionaryData(): String? =
                originatorCompanyDiscretionaryData.getNullable(
                    "originator_company_discretionary_data"
                )

            /** The identifier of the company that initiated the transfer. */
            fun originatorCompanyId(): String =
                originatorCompanyId.getRequired("originator_company_id")

            /** Why the ACH transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The id of the receiver of the transfer. */
            fun receiverIdNumber(): String? = receiverIdNumber.getNullable("receiver_id_number")

            /** The name of the receiver of the transfer. */
            fun receiverName(): String? = receiverName.getNullable("receiver_name")

            /** The trace number of the transfer. */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
             */
            fun type(): Type = type.getRequired("type")

            /** The ACH Decline's identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The name of the company that initiated the transfer. */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName() = originatorCompanyName

            /** The descriptive date of the transfer. */
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

            /** The additional information included with the transfer. */
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

            /** The identifier of the company that initiated the transfer. */
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId() = originatorCompanyId

            /** Why the ACH transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The id of the receiver of the transfer. */
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber() = receiverIdNumber

            /** The name of the receiver of the transfer. */
            @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

            /** The trace number of the transfer. */
            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchDecline = apply {
                if (!validated) {
                    id()
                    amount()
                    originatorCompanyName()
                    originatorCompanyDescriptiveDate()
                    originatorCompanyDiscretionaryData()
                    originatorCompanyId()
                    reason()
                    receiverIdNumber()
                    receiverName()
                    traceNumber()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchDecline &&
                    this.id == other.id &&
                    this.amount == other.amount &&
                    this.originatorCompanyName == other.originatorCompanyName &&
                    this.originatorCompanyDescriptiveDate ==
                        other.originatorCompanyDescriptiveDate &&
                    this.originatorCompanyDiscretionaryData ==
                        other.originatorCompanyDiscretionaryData &&
                    this.originatorCompanyId == other.originatorCompanyId &&
                    this.reason == other.reason &&
                    this.receiverIdNumber == other.receiverIdNumber &&
                    this.receiverName == other.receiverName &&
                    this.traceNumber == other.traceNumber &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            amount,
                            originatorCompanyName,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyId,
                            reason,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchDecline{id=$id, amount=$amount, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
                private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                private var receiverName: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(achDecline: AchDecline) = apply {
                    this.id = achDecline.id
                    this.amount = achDecline.amount
                    this.originatorCompanyName = achDecline.originatorCompanyName
                    this.originatorCompanyDescriptiveDate =
                        achDecline.originatorCompanyDescriptiveDate
                    this.originatorCompanyDiscretionaryData =
                        achDecline.originatorCompanyDiscretionaryData
                    this.originatorCompanyId = achDecline.originatorCompanyId
                    this.reason = achDecline.reason
                    this.receiverIdNumber = achDecline.receiverIdNumber
                    this.receiverName = achDecline.receiverName
                    this.traceNumber = achDecline.traceNumber
                    this.type = achDecline.type
                    additionalProperties(achDecline.additionalProperties)
                }

                /** The ACH Decline's identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The ACH Decline's identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /** The name of the company that initiated the transfer. */
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                    originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

                /** The descriptive date of the transfer. */
                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
                    originatorCompanyDiscretionaryData(
                        JsonField.of(originatorCompanyDiscretionaryData)
                    )

                /** The additional information included with the transfer. */
                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                /** The identifier of the company that initiated the transfer. */
                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                /** Why the ACH transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the ACH transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: String) =
                    receiverIdNumber(JsonField.of(receiverIdNumber))

                /** The id of the receiver of the transfer. */
                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

                /** The name of the receiver of the transfer. */
                @JsonProperty("receiver_name")
                @ExcludeMissing
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                /** The trace number of the transfer. */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /** The trace number of the transfer. */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `ach_decline`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `ach_decline`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AchDecline =
                    AchDecline(
                        id,
                        amount,
                        originatorCompanyName,
                        originatorCompanyDescriptiveDate,
                        originatorCompanyDiscretionaryData,
                        originatorCompanyId,
                        reason,
                        receiverIdNumber,
                        receiverName,
                        traceNumber,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                        Reason(JsonField.of("credit_entry_refused_by_receiver"))

                    val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                    val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                        Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

                    val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                    val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    DUPLICATE_RETURN,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    MISROUTED_RETURN,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    NO_ACH_ROUTE,
                    ORIGINATOR_REQUEST,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
                }

                enum class Value {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    DUPLICATE_RETURN,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    MISROUTED_RETURN,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    NO_ACH_ROUTE,
                    ORIGINATOR_REQUEST,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        MISROUTED_RETURN -> Value.MISROUTED_RETURN
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                        ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Value.USER_INITIATED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        MISROUTED_RETURN -> Known.MISROUTED_RETURN
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                        ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Known.USER_INITIATED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH_DECLINE = Type(JsonField.of("ach_decline"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    ACH_DECLINE,
                }

                enum class Value {
                    ACH_DECLINE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_DECLINE -> Value.ACH_DECLINE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_DECLINE -> Known.ACH_DECLINE
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonDeserialize(builder = CardDecline.Builder::class)
        @NoAutoDetect
        class CardDecline
        private constructor(
            private val merchantAcceptorId: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<Reason>,
            private val merchantState: JsonField<String>,
            private val realTimeDecisionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(): String? =
                merchantCategoryCode.getNullable("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The country the merchant resides in. */
            fun merchantCountry(): String? = merchantCountry.getNullable("merchant_country")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): String? =
                digitalWalletTokenId.getNullable("digital_wallet_token_id")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

            /** Fields specific to the `network` */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** Why the transaction was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /** Fields specific to the `network` */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** Why the transaction was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDecline = apply {
                if (!validated) {
                    merchantAcceptorId()
                    merchantDescriptor()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    digitalWalletTokenId()
                    physicalCardId()
                    networkDetails().validate()
                    amount()
                    currency()
                    reason()
                    merchantState()
                    realTimeDecisionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDecline &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.physicalCardId == other.physicalCardId &&
                    this.networkDetails == other.networkDetails &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.reason == other.reason &&
                    this.merchantState == other.merchantState &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            merchantAcceptorId,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            digitalWalletTokenId,
                            physicalCardId,
                            networkDetails,
                            amount,
                            currency,
                            reason,
                            merchantState,
                            realTimeDecisionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDecline{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, networkDetails=$networkDetails, amount=$amount, currency=$currency, reason=$reason, merchantState=$merchantState, realTimeDecisionId=$realTimeDecisionId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardDecline: CardDecline) = apply {
                    this.merchantAcceptorId = cardDecline.merchantAcceptorId
                    this.merchantDescriptor = cardDecline.merchantDescriptor
                    this.merchantCategoryCode = cardDecline.merchantCategoryCode
                    this.merchantCity = cardDecline.merchantCity
                    this.merchantCountry = cardDecline.merchantCountry
                    this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    this.physicalCardId = cardDecline.physicalCardId
                    this.networkDetails = cardDecline.networkDetails
                    this.amount = cardDecline.amount
                    this.currency = cardDecline.currency
                    this.reason = cardDecline.reason
                    this.merchantState = cardDecline.merchantState
                    this.realTimeDecisionId = cardDecline.realTimeDecisionId
                    additionalProperties(cardDecline.additionalProperties)
                }

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(merchantAcceptorId: String) =
                    merchantAcceptorId(JsonField.of(merchantAcceptorId))

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: String) =
                    merchantDescriptor(JsonField.of(merchantDescriptor))

                /** The merchant descriptor of the merchant the card is transacting with. */
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                    this.merchantDescriptor = merchantDescriptor
                }

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city")
                @ExcludeMissing
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: String) =
                    digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                    this.digitalWalletTokenId = digitalWalletTokenId
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String) =
                    physicalCardId(JsonField.of(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /** Fields specific to the `network` */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network` */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Why the transaction was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transaction was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardDecline =
                    CardDecline(
                        merchantAcceptorId,
                        merchantDescriptor,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        digitalWalletTokenId,
                        physicalCardId,
                        networkDetails,
                        amount,
                        currency,
                        reason,
                        merchantState,
                        realTimeDecisionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields specific to the `network` */
            @JsonDeserialize(builder = NetworkDetails.Builder::class)
            @NoAutoDetect
            class NetworkDetails
            private constructor(
                private val category: JsonField<Category>,
                private val visa: JsonField<Visa>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The payment network used to process this card authorization */
                fun category(): Category = category.getRequired("category")

                /** Fields specific to the `visa` network */
                fun visa(): Visa? = visa.getNullable("visa")

                /** The payment network used to process this card authorization */
                @JsonProperty("category") @ExcludeMissing fun _category() = category

                /** Fields specific to the `visa` network */
                @JsonProperty("visa") @ExcludeMissing fun _visa() = visa

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkDetails = apply {
                    if (!validated) {
                        category()
                        visa()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkDetails &&
                        this.category == other.category &&
                        this.visa == other.visa &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                category,
                                visa,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var category: JsonField<Category> = JsonMissing.of()
                    private var visa: JsonField<Visa> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkDetails: NetworkDetails) = apply {
                        this.category = networkDetails.category
                        this.visa = networkDetails.visa
                        additionalProperties(networkDetails.additionalProperties)
                    }

                    /** The payment network used to process this card authorization */
                    fun category(category: Category) = category(JsonField.of(category))

                    /** The payment network used to process this card authorization */
                    @JsonProperty("category")
                    @ExcludeMissing
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** Fields specific to the `visa` network */
                    fun visa(visa: Visa) = visa(JsonField.of(visa))

                    /** Fields specific to the `visa` network */
                    @JsonProperty("visa")
                    @ExcludeMissing
                    fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NetworkDetails =
                        NetworkDetails(
                            category,
                            visa,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Category
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Category && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val VISA = Category(JsonField.of("visa"))

                        fun of(value: String) = Category(JsonField.of(value))
                    }

                    enum class Known {
                        VISA,
                    }

                    enum class Value {
                        VISA,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to the `visa` network */
                @JsonDeserialize(builder = Visa.Builder::class)
                @NoAutoDetect
                class Visa
                private constructor(
                    private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>,
                    private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(): ElectronicCommerceIndicator? =
                        electronicCommerceIndicator.getNullable("electronic_commerce_indicator")

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date
                     */
                    fun pointOfServiceEntryMode(): PointOfServiceEntryMode? =
                        pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    fun _electronicCommerceIndicator() = electronicCommerceIndicator

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun _pointOfServiceEntryMode() = pointOfServiceEntryMode

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Visa = apply {
                        if (!validated) {
                            electronicCommerceIndicator()
                            pointOfServiceEntryMode()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Visa &&
                            this.electronicCommerceIndicator == other.electronicCommerceIndicator &&
                            this.pointOfServiceEntryMode == other.pointOfServiceEntryMode &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    electronicCommerceIndicator,
                                    pointOfServiceEntryMode,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator> =
                            JsonMissing.of()
                        private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            additionalProperties(visa.additionalProperties)
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator
                        ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                        ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Visa =
                            Visa(
                                electronicCommerceIndicator,
                                pointOfServiceEntryMode,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ElectronicCommerceIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ElectronicCommerceIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                            val RECURRING = ElectronicCommerceIndicator(JsonField.of("recurring"))

                            val INSTALLMENT =
                                ElectronicCommerceIndicator(JsonField.of("installment"))

                            val UNKNOWN_MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(
                                    JsonField.of("unknown_mail_phone_order")
                                )

                            val SECURE_ELECTRONIC_COMMERCE =
                                ElectronicCommerceIndicator(
                                    JsonField.of("secure_electronic_commerce")
                                )

                            val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                                ElectronicCommerceIndicator(
                                    JsonField.of(
                                        "non_authenticated_security_transaction_at_3ds_capable_merchant"
                                    )
                                )

                            val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                                ElectronicCommerceIndicator(
                                    JsonField.of("non_authenticated_security_transaction")
                                )

                            val NON_SECURE_TRANSACTION =
                                ElectronicCommerceIndicator(JsonField.of("non_secure_transaction"))

                            fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                        }

                        enum class Value {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MAIL_PHONE_ORDER -> Value.MAIL_PHONE_ORDER
                                RECURRING -> Value.RECURRING
                                INSTALLMENT -> Value.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Value.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Value.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Value.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Value.NON_SECURE_TRANSACTION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MAIL_PHONE_ORDER -> Known.MAIL_PHONE_ORDER
                                RECURRING -> Known.RECURRING
                                INSTALLMENT -> Known.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Known.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Known.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Known.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Known.NON_SECURE_TRANSACTION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ElectronicCommerceIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class PointOfServiceEntryMode
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PointOfServiceEntryMode && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val UNKNOWN = PointOfServiceEntryMode(JsonField.of("unknown"))

                            val MANUAL = PointOfServiceEntryMode(JsonField.of("manual"))

                            val MAGNETIC_STRIPE_NO_CVV =
                                PointOfServiceEntryMode(JsonField.of("magnetic_stripe_no_cvv"))

                            val OPTICAL_CODE = PointOfServiceEntryMode(JsonField.of("optical_code"))

                            val INTEGRATED_CIRCUIT_CARD =
                                PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

                            val CONTACTLESS = PointOfServiceEntryMode(JsonField.of("contactless"))

                            val CREDENTIAL_ON_FILE =
                                PointOfServiceEntryMode(JsonField.of("credential_on_file"))

                            val MAGNETIC_STRIPE =
                                PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

                            val CONTACTLESS_MAGNETIC_STRIPE =
                                PointOfServiceEntryMode(JsonField.of("contactless_magnetic_stripe"))

                            val INTEGRATED_CIRCUIT_CARD_NO_CVV =
                                PointOfServiceEntryMode(
                                    JsonField.of("integrated_circuit_card_no_cvv")
                                )

                            fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                        }

                        enum class Known {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        }

                        enum class Value {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                UNKNOWN -> Value.UNKNOWN
                                MANUAL -> Value.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Value.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Value.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                UNKNOWN -> Known.UNKNOWN
                                MANUAL -> Known.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Known.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Known.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown PointOfServiceEntryMode: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CARD_NOT_ACTIVE = Reason(JsonField.of("card_not_active"))

                    val PHYSICAL_CARD_NOT_ACTIVE = Reason(JsonField.of("physical_card_not_active"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    val WEBHOOK_DECLINED = Reason(JsonField.of("webhook_declined"))

                    val WEBHOOK_TIMED_OUT = Reason(JsonField.of("webhook_timed_out"))

                    val DECLINED_BY_STAND_IN_PROCESSING =
                        Reason(JsonField.of("declined_by_stand_in_processing"))

                    val INVALID_PHYSICAL_CARD = Reason(JsonField.of("invalid_physical_card"))

                    val MISSING_ORIGINAL_AUTHORIZATION =
                        Reason(JsonField.of("missing_original_authorization"))

                    val SUSPECTED_FRAUD = Reason(JsonField.of("suspected_fraud"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                }

                enum class Value {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Value.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Value.CVV2_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Value.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Value.MISSING_ORIGINAL_AUTHORIZATION
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Known.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Known.CVV2_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACH_DECLINE = Category(JsonField.of("ach_decline"))

                val CARD_DECLINE = Category(JsonField.of("card_decline"))

                val CHECK_DECLINE = Category(JsonField.of("check_decline"))

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    Category(JsonField.of("inbound_real_time_payments_transfer_decline"))

                val INTERNATIONAL_ACH_DECLINE = Category(JsonField.of("international_ach_decline"))

                val WIRE_DECLINE = Category(JsonField.of("wire_decline"))

                val OTHER = Category(JsonField.of("other"))

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACH_DECLINE,
                CARD_DECLINE,
                CHECK_DECLINE,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INTERNATIONAL_ACH_DECLINE,
                WIRE_DECLINE,
                OTHER,
            }

            enum class Value {
                ACH_DECLINE,
                CARD_DECLINE,
                CHECK_DECLINE,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INTERNATIONAL_ACH_DECLINE,
                WIRE_DECLINE,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_DECLINE -> Value.ACH_DECLINE
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CHECK_DECLINE -> Value.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INTERNATIONAL_ACH_DECLINE -> Value.INTERNATIONAL_ACH_DECLINE
                    WIRE_DECLINE -> Value.WIRE_DECLINE
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_DECLINE -> Known.ACH_DECLINE
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CHECK_DECLINE -> Known.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INTERNATIONAL_ACH_DECLINE -> Known.INTERNATIONAL_ACH_DECLINE
                    WIRE_DECLINE -> Known.WIRE_DECLINE
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonDeserialize(builder = CheckDecline.Builder::class)
        @NoAutoDetect
        class CheckDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val auxiliaryOnUs: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun auxiliaryOnUs(): String? = auxiliaryOnUs.getNullable("auxiliary_on_us")

            /** Why the check was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

            /** Why the check was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDecline = apply {
                if (!validated) {
                    amount()
                    auxiliaryOnUs()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDecline &&
                    this.amount == other.amount &&
                    this.auxiliaryOnUs == other.auxiliaryOnUs &&
                    this.reason == other.reason &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            auxiliaryOnUs,
                            reason,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, reason=$reason, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkDecline: CheckDecline) = apply {
                    this.amount = checkDecline.amount
                    this.auxiliaryOnUs = checkDecline.auxiliaryOnUs
                    this.reason = checkDecline.reason
                    additionalProperties(checkDecline.additionalProperties)
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun auxiliaryOnUs(auxiliaryOnUs: String) =
                    auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                    this.auxiliaryOnUs = auxiliaryOnUs
                }

                /** Why the check was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the check was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckDecline =
                    CheckDecline(
                        amount,
                        auxiliaryOnUs,
                        reason,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    val UNABLE_TO_LOCATE_ACCOUNT = Reason(JsonField.of("unable_to_locate_account"))

                    val NOT_OUR_ITEM = Reason(JsonField.of("not_our_item"))

                    val UNABLE_TO_PROCESS = Reason(JsonField.of("unable_to_process"))

                    val REFER_TO_IMAGE = Reason(JsonField.of("refer_to_image"))

                    val STOP_PAYMENT_REQUESTED = Reason(JsonField.of("stop_payment_requested"))

                    val RETURNED = Reason(JsonField.of("returned"))

                    val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                    val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                    val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    UNABLE_TO_LOCATE_ACCOUNT,
                    NOT_OUR_ITEM,
                    UNABLE_TO_PROCESS,
                    REFER_TO_IMAGE,
                    STOP_PAYMENT_REQUESTED,
                    RETURNED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    ALTERED_OR_FICTITIOUS,
                }

                enum class Value {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    UNABLE_TO_LOCATE_ACCOUNT,
                    NOT_OUR_ITEM,
                    UNABLE_TO_PROCESS,
                    REFER_TO_IMAGE,
                    STOP_PAYMENT_REQUESTED,
                    RETURNED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    ALTERED_OR_FICTITIOUS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        UNABLE_TO_LOCATE_ACCOUNT -> Value.UNABLE_TO_LOCATE_ACCOUNT
                        NOT_OUR_ITEM -> Value.NOT_OUR_ITEM
                        UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                        REFER_TO_IMAGE -> Value.REFER_TO_IMAGE
                        STOP_PAYMENT_REQUESTED -> Value.STOP_PAYMENT_REQUESTED
                        RETURNED -> Value.RETURNED
                        DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                        ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        UNABLE_TO_LOCATE_ACCOUNT -> Known.UNABLE_TO_LOCATE_ACCOUNT
                        NOT_OUR_ITEM -> Known.NOT_OUR_ITEM
                        UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                        REFER_TO_IMAGE -> Known.REFER_TO_IMAGE
                        STOP_PAYMENT_REQUESTED -> Known.STOP_PAYMENT_REQUESTED
                        RETURNED -> Known.RETURNED
                        DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                        ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonDeserialize(builder = InboundRealTimePaymentsTransferDecline.Builder::class)
        @NoAutoDetect
        class InboundRealTimePaymentsTransferDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<Reason>,
            private val creditorName: JsonField<String>,
            private val debtorName: JsonField<String>,
            private val debtorAccountNumber: JsonField<String>,
            private val debtorRoutingNumber: JsonField<String>,
            private val transactionIdentification: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** Why the transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /** The name provided by the sender of the transfer. */
            fun debtorName(): String = debtorName.getRequired("debtor_name")

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(): String =
                debtorAccountNumber.getRequired("debtor_account_number")

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(): String =
                debtorRoutingNumber.getRequired("debtor_routing_number")

            /** The Real-Time Payments network identification of the declined transfer. */
            fun transactionIdentification(): String =
                transactionIdentification.getRequired("transaction_identification")

            /** Additional information included with the transfer. */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** Why the transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

            /** The name provided by the sender of the transfer. */
            @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

            /** The account number of the account that sent the transfer. */
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            fun _debtorAccountNumber() = debtorAccountNumber

            /** The routing number of the account that sent the transfer. */
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            fun _debtorRoutingNumber() = debtorRoutingNumber

            /** The Real-Time Payments network identification of the declined transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification() = transactionIdentification

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundRealTimePaymentsTransferDecline = apply {
                if (!validated) {
                    amount()
                    currency()
                    reason()
                    creditorName()
                    debtorName()
                    debtorAccountNumber()
                    debtorRoutingNumber()
                    transactionIdentification()
                    remittanceInformation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundRealTimePaymentsTransferDecline &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.reason == other.reason &&
                    this.creditorName == other.creditorName &&
                    this.debtorName == other.debtorName &&
                    this.debtorAccountNumber == other.debtorAccountNumber &&
                    this.debtorRoutingNumber == other.debtorRoutingNumber &&
                    this.transactionIdentification == other.transactionIdentification &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            reason,
                            creditorName,
                            debtorName,
                            debtorAccountNumber,
                            debtorRoutingNumber,
                            transactionIdentification,
                            remittanceInformation,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundRealTimePaymentsTransferDecline{amount=$amount, currency=$currency, reason=$reason, creditorName=$creditorName, debtorName=$debtorName, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, transactionIdentification=$transactionIdentification, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var creditorName: JsonField<String> = JsonMissing.of()
                private var debtorName: JsonField<String> = JsonMissing.of()
                private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                private var transactionIdentification: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
                ) = apply {
                    this.amount = inboundRealTimePaymentsTransferDecline.amount
                    this.currency = inboundRealTimePaymentsTransferDecline.currency
                    this.reason = inboundRealTimePaymentsTransferDecline.reason
                    this.creditorName = inboundRealTimePaymentsTransferDecline.creditorName
                    this.debtorName = inboundRealTimePaymentsTransferDecline.debtorName
                    this.debtorAccountNumber =
                        inboundRealTimePaymentsTransferDecline.debtorAccountNumber
                    this.debtorRoutingNumber =
                        inboundRealTimePaymentsTransferDecline.debtorRoutingNumber
                    this.transactionIdentification =
                        inboundRealTimePaymentsTransferDecline.transactionIdentification
                    this.remittanceInformation =
                        inboundRealTimePaymentsTransferDecline.remittanceInformation
                    additionalProperties(
                        inboundRealTimePaymentsTransferDecline.additionalProperties
                    )
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name")
                @ExcludeMissing
                fun creditorName(creditorName: JsonField<String>) = apply {
                    this.creditorName = creditorName
                }

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name")
                @ExcludeMissing
                fun debtorName(debtorName: JsonField<String>) = apply {
                    this.debtorName = debtorName
                }

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: String) =
                    debtorAccountNumber(JsonField.of(debtorAccountNumber))

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                    this.debtorAccountNumber = debtorAccountNumber
                }

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: String) =
                    debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                    this.debtorRoutingNumber = debtorRoutingNumber
                }

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /** The Real-Time Payments network identification of the declined transfer. */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                fun transactionIdentification(transactionIdentification: JsonField<String>) =
                    apply {
                        this.transactionIdentification = transactionIdentification
                    }

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundRealTimePaymentsTransferDecline =
                    InboundRealTimePaymentsTransferDecline(
                        amount,
                        currency,
                        reason,
                        creditorName,
                        debtorName,
                        debtorAccountNumber,
                        debtorRoutingNumber,
                        transactionIdentification,
                        remittanceInformation,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Currency && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CAD = Currency(JsonField.of("CAD"))

                    val CHF = Currency(JsonField.of("CHF"))

                    val EUR = Currency(JsonField.of("EUR"))

                    val GBP = Currency(JsonField.of("GBP"))

                    val JPY = Currency(JsonField.of("JPY"))

                    val USD = Currency(JsonField.of("USD"))

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        EUR -> Value.EUR
                        GBP -> Value.GBP
                        JPY -> Value.JPY
                        USD -> Value.USD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        EUR -> Known.EUR
                        GBP -> Known.GBP
                        JPY -> Known.JPY
                        USD -> Known.USD
                        else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACCOUNT_NUMBER_CANCELED = Reason(JsonField.of("account_number_canceled"))

                    val ACCOUNT_NUMBER_DISABLED = Reason(JsonField.of("account_number_disabled"))

                    val ACCOUNT_RESTRICTED = Reason(JsonField.of("account_restricted"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val REAL_TIME_PAYMENTS_NOT_ENABLED =
                        Reason(JsonField.of("real_time_payments_not_enabled"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ACCOUNT_RESTRICTED,
                    GROUP_LOCKED,
                    ENTITY_NOT_ACTIVE,
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                }

                enum class Value {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ACCOUNT_RESTRICTED,
                    GROUP_LOCKED,
                    ENTITY_NOT_ACTIVE,
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        REAL_TIME_PAYMENTS_NOT_ENABLED -> Value.REAL_TIME_PAYMENTS_NOT_ENABLED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        REAL_TIME_PAYMENTS_NOT_ENABLED -> Known.REAL_TIME_PAYMENTS_NOT_ENABLED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        @JsonDeserialize(builder = InternationalAchDecline.Builder::class)
        @NoAutoDetect
        class InternationalAchDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val foreignExchangeIndicator: JsonField<String>,
            private val foreignExchangeReferenceIndicator: JsonField<String>,
            private val foreignExchangeReference: JsonField<String>,
            private val destinationCountryCode: JsonField<String>,
            private val destinationCurrencyCode: JsonField<String>,
            private val foreignPaymentAmount: JsonField<Long>,
            private val foreignTraceNumber: JsonField<String>,
            private val internationalTransactionTypeCode: JsonField<String>,
            private val originatingCurrencyCode: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>,
            private val originatorCity: JsonField<String>,
            private val originatorCompanyEntryDescription: JsonField<String>,
            private val originatorCountry: JsonField<String>,
            private val originatorIdentification: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorPostalCode: JsonField<String>,
            private val originatorStreetAddress: JsonField<String>,
            private val originatorStateOrProvince: JsonField<String>,
            private val paymentRelatedInformation: JsonField<String>,
            private val paymentRelatedInformation2: JsonField<String>,
            private val receiverIdentificationNumber: JsonField<String>,
            private val receiverStreetAddress: JsonField<String>,
            private val receiverCity: JsonField<String>,
            private val receiverStateOrProvince: JsonField<String>,
            private val receiverCountry: JsonField<String>,
            private val receiverPostalCode: JsonField<String>,
            private val receivingCompanyOrIndividualName: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun foreignExchangeIndicator(): String =
                foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

            fun foreignExchangeReferenceIndicator(): String =
                foreignExchangeReferenceIndicator.getRequired(
                    "foreign_exchange_reference_indicator"
                )

            fun foreignExchangeReference(): String? =
                foreignExchangeReference.getNullable("foreign_exchange_reference")

            fun destinationCountryCode(): String =
                destinationCountryCode.getRequired("destination_country_code")

            fun destinationCurrencyCode(): String =
                destinationCurrencyCode.getRequired("destination_currency_code")

            fun foreignPaymentAmount(): Long =
                foreignPaymentAmount.getRequired("foreign_payment_amount")

            fun foreignTraceNumber(): String? =
                foreignTraceNumber.getNullable("foreign_trace_number")

            fun internationalTransactionTypeCode(): String =
                internationalTransactionTypeCode.getRequired("international_transaction_type_code")

            fun originatingCurrencyCode(): String =
                originatingCurrencyCode.getRequired("originating_currency_code")

            fun originatingDepositoryFinancialInstitutionName(): String =
                originatingDepositoryFinancialInstitutionName.getRequired(
                    "originating_depository_financial_institution_name"
                )

            fun originatingDepositoryFinancialInstitutionIdQualifier(): String =
                originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "originating_depository_financial_institution_id_qualifier"
                )

            fun originatingDepositoryFinancialInstitutionId(): String =
                originatingDepositoryFinancialInstitutionId.getRequired(
                    "originating_depository_financial_institution_id"
                )

            fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                    "originating_depository_financial_institution_branch_country"
                )

            fun originatorCity(): String = originatorCity.getRequired("originator_city")

            fun originatorCompanyEntryDescription(): String =
                originatorCompanyEntryDescription.getRequired(
                    "originator_company_entry_description"
                )

            fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

            fun originatorIdentification(): String =
                originatorIdentification.getRequired("originator_identification")

            fun originatorName(): String = originatorName.getRequired("originator_name")

            fun originatorPostalCode(): String? =
                originatorPostalCode.getNullable("originator_postal_code")

            fun originatorStreetAddress(): String =
                originatorStreetAddress.getRequired("originator_street_address")

            fun originatorStateOrProvince(): String? =
                originatorStateOrProvince.getNullable("originator_state_or_province")

            fun paymentRelatedInformation(): String? =
                paymentRelatedInformation.getNullable("payment_related_information")

            fun paymentRelatedInformation2(): String? =
                paymentRelatedInformation2.getNullable("payment_related_information2")

            fun receiverIdentificationNumber(): String? =
                receiverIdentificationNumber.getNullable("receiver_identification_number")

            fun receiverStreetAddress(): String =
                receiverStreetAddress.getRequired("receiver_street_address")

            fun receiverCity(): String = receiverCity.getRequired("receiver_city")

            fun receiverStateOrProvince(): String? =
                receiverStateOrProvince.getNullable("receiver_state_or_province")

            fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

            fun receiverPostalCode(): String? =
                receiverPostalCode.getNullable("receiver_postal_code")

            fun receivingCompanyOrIndividualName(): String =
                receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

            fun receivingDepositoryFinancialInstitutionName(): String =
                receivingDepositoryFinancialInstitutionName.getRequired(
                    "receiving_depository_financial_institution_name"
                )

            fun receivingDepositoryFinancialInstitutionIdQualifier(): String =
                receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "receiving_depository_financial_institution_id_qualifier"
                )

            fun receivingDepositoryFinancialInstitutionId(): String =
                receivingDepositoryFinancialInstitutionId.getRequired(
                    "receiving_depository_financial_institution_id"
                )

            fun receivingDepositoryFinancialInstitutionCountry(): String =
                receivingDepositoryFinancialInstitutionCountry.getRequired(
                    "receiving_depository_financial_institution_country"
                )

            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator() = foreignExchangeIndicator

            @JsonProperty("foreign_exchange_reference_indicator")
            @ExcludeMissing
            fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

            @JsonProperty("foreign_exchange_reference")
            @ExcludeMissing
            fun _foreignExchangeReference() = foreignExchangeReference

            @JsonProperty("destination_country_code")
            @ExcludeMissing
            fun _destinationCountryCode() = destinationCountryCode

            @JsonProperty("destination_currency_code")
            @ExcludeMissing
            fun _destinationCurrencyCode() = destinationCurrencyCode

            @JsonProperty("foreign_payment_amount")
            @ExcludeMissing
            fun _foreignPaymentAmount() = foreignPaymentAmount

            @JsonProperty("foreign_trace_number")
            @ExcludeMissing
            fun _foreignTraceNumber() = foreignTraceNumber

            @JsonProperty("international_transaction_type_code")
            @ExcludeMissing
            fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

            @JsonProperty("originating_currency_code")
            @ExcludeMissing
            fun _originatingCurrencyCode() = originatingCurrencyCode

            @JsonProperty("originating_depository_financial_institution_name")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionName() =
                originatingDepositoryFinancialInstitutionName

            @JsonProperty("originating_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                originatingDepositoryFinancialInstitutionIdQualifier

            @JsonProperty("originating_depository_financial_institution_id")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionId() =
                originatingDepositoryFinancialInstitutionId

            @JsonProperty("originating_depository_financial_institution_branch_country")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                originatingDepositoryFinancialInstitutionBranchCountry

            @JsonProperty("originator_city") @ExcludeMissing fun _originatorCity() = originatorCity

            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            @JsonProperty("originator_country")
            @ExcludeMissing
            fun _originatorCountry() = originatorCountry

            @JsonProperty("originator_identification")
            @ExcludeMissing
            fun _originatorIdentification() = originatorIdentification

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            @JsonProperty("originator_postal_code")
            @ExcludeMissing
            fun _originatorPostalCode() = originatorPostalCode

            @JsonProperty("originator_street_address")
            @ExcludeMissing
            fun _originatorStreetAddress() = originatorStreetAddress

            @JsonProperty("originator_state_or_province")
            @ExcludeMissing
            fun _originatorStateOrProvince() = originatorStateOrProvince

            @JsonProperty("payment_related_information")
            @ExcludeMissing
            fun _paymentRelatedInformation() = paymentRelatedInformation

            @JsonProperty("payment_related_information2")
            @ExcludeMissing
            fun _paymentRelatedInformation2() = paymentRelatedInformation2

            @JsonProperty("receiver_identification_number")
            @ExcludeMissing
            fun _receiverIdentificationNumber() = receiverIdentificationNumber

            @JsonProperty("receiver_street_address")
            @ExcludeMissing
            fun _receiverStreetAddress() = receiverStreetAddress

            @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

            @JsonProperty("receiver_state_or_province")
            @ExcludeMissing
            fun _receiverStateOrProvince() = receiverStateOrProvince

            @JsonProperty("receiver_country")
            @ExcludeMissing
            fun _receiverCountry() = receiverCountry

            @JsonProperty("receiver_postal_code")
            @ExcludeMissing
            fun _receiverPostalCode() = receiverPostalCode

            @JsonProperty("receiving_company_or_individual_name")
            @ExcludeMissing
            fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

            @JsonProperty("receiving_depository_financial_institution_name")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionName() =
                receivingDepositoryFinancialInstitutionName

            @JsonProperty("receiving_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                receivingDepositoryFinancialInstitutionIdQualifier

            @JsonProperty("receiving_depository_financial_institution_id")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionId() =
                receivingDepositoryFinancialInstitutionId

            @JsonProperty("receiving_depository_financial_institution_country")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionCountry() =
                receivingDepositoryFinancialInstitutionCountry

            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InternationalAchDecline = apply {
                if (!validated) {
                    amount()
                    foreignExchangeIndicator()
                    foreignExchangeReferenceIndicator()
                    foreignExchangeReference()
                    destinationCountryCode()
                    destinationCurrencyCode()
                    foreignPaymentAmount()
                    foreignTraceNumber()
                    internationalTransactionTypeCode()
                    originatingCurrencyCode()
                    originatingDepositoryFinancialInstitutionName()
                    originatingDepositoryFinancialInstitutionIdQualifier()
                    originatingDepositoryFinancialInstitutionId()
                    originatingDepositoryFinancialInstitutionBranchCountry()
                    originatorCity()
                    originatorCompanyEntryDescription()
                    originatorCountry()
                    originatorIdentification()
                    originatorName()
                    originatorPostalCode()
                    originatorStreetAddress()
                    originatorStateOrProvince()
                    paymentRelatedInformation()
                    paymentRelatedInformation2()
                    receiverIdentificationNumber()
                    receiverStreetAddress()
                    receiverCity()
                    receiverStateOrProvince()
                    receiverCountry()
                    receiverPostalCode()
                    receivingCompanyOrIndividualName()
                    receivingDepositoryFinancialInstitutionName()
                    receivingDepositoryFinancialInstitutionIdQualifier()
                    receivingDepositoryFinancialInstitutionId()
                    receivingDepositoryFinancialInstitutionCountry()
                    traceNumber()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InternationalAchDecline &&
                    this.amount == other.amount &&
                    this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                    this.foreignExchangeReferenceIndicator ==
                        other.foreignExchangeReferenceIndicator &&
                    this.foreignExchangeReference == other.foreignExchangeReference &&
                    this.destinationCountryCode == other.destinationCountryCode &&
                    this.destinationCurrencyCode == other.destinationCurrencyCode &&
                    this.foreignPaymentAmount == other.foreignPaymentAmount &&
                    this.foreignTraceNumber == other.foreignTraceNumber &&
                    this.internationalTransactionTypeCode ==
                        other.internationalTransactionTypeCode &&
                    this.originatingCurrencyCode == other.originatingCurrencyCode &&
                    this.originatingDepositoryFinancialInstitutionName ==
                        other.originatingDepositoryFinancialInstitutionName &&
                    this.originatingDepositoryFinancialInstitutionIdQualifier ==
                        other.originatingDepositoryFinancialInstitutionIdQualifier &&
                    this.originatingDepositoryFinancialInstitutionId ==
                        other.originatingDepositoryFinancialInstitutionId &&
                    this.originatingDepositoryFinancialInstitutionBranchCountry ==
                        other.originatingDepositoryFinancialInstitutionBranchCountry &&
                    this.originatorCity == other.originatorCity &&
                    this.originatorCompanyEntryDescription ==
                        other.originatorCompanyEntryDescription &&
                    this.originatorCountry == other.originatorCountry &&
                    this.originatorIdentification == other.originatorIdentification &&
                    this.originatorName == other.originatorName &&
                    this.originatorPostalCode == other.originatorPostalCode &&
                    this.originatorStreetAddress == other.originatorStreetAddress &&
                    this.originatorStateOrProvince == other.originatorStateOrProvince &&
                    this.paymentRelatedInformation == other.paymentRelatedInformation &&
                    this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                    this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
                    this.receiverStreetAddress == other.receiverStreetAddress &&
                    this.receiverCity == other.receiverCity &&
                    this.receiverStateOrProvince == other.receiverStateOrProvince &&
                    this.receiverCountry == other.receiverCountry &&
                    this.receiverPostalCode == other.receiverPostalCode &&
                    this.receivingCompanyOrIndividualName ==
                        other.receivingCompanyOrIndividualName &&
                    this.receivingDepositoryFinancialInstitutionName ==
                        other.receivingDepositoryFinancialInstitutionName &&
                    this.receivingDepositoryFinancialInstitutionIdQualifier ==
                        other.receivingDepositoryFinancialInstitutionIdQualifier &&
                    this.receivingDepositoryFinancialInstitutionId ==
                        other.receivingDepositoryFinancialInstitutionId &&
                    this.receivingDepositoryFinancialInstitutionCountry ==
                        other.receivingDepositoryFinancialInstitutionCountry &&
                    this.traceNumber == other.traceNumber &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            foreignExchangeIndicator,
                            foreignExchangeReferenceIndicator,
                            foreignExchangeReference,
                            destinationCountryCode,
                            destinationCurrencyCode,
                            foreignPaymentAmount,
                            foreignTraceNumber,
                            internationalTransactionTypeCode,
                            originatingCurrencyCode,
                            originatingDepositoryFinancialInstitutionName,
                            originatingDepositoryFinancialInstitutionIdQualifier,
                            originatingDepositoryFinancialInstitutionId,
                            originatingDepositoryFinancialInstitutionBranchCountry,
                            originatorCity,
                            originatorCompanyEntryDescription,
                            originatorCountry,
                            originatorIdentification,
                            originatorName,
                            originatorPostalCode,
                            originatorStreetAddress,
                            originatorStateOrProvince,
                            paymentRelatedInformation,
                            paymentRelatedInformation2,
                            receiverIdentificationNumber,
                            receiverStreetAddress,
                            receiverCity,
                            receiverStateOrProvince,
                            receiverCountry,
                            receiverPostalCode,
                            receivingCompanyOrIndividualName,
                            receivingDepositoryFinancialInstitutionName,
                            receivingDepositoryFinancialInstitutionIdQualifier,
                            receivingDepositoryFinancialInstitutionId,
                            receivingDepositoryFinancialInstitutionCountry,
                            traceNumber,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InternationalAchDecline{amount=$amount, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignExchangeReference=$foreignExchangeReference, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStreetAddress=$originatorStreetAddress, originatorStateOrProvince=$originatorStateOrProvince, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverIdentificationNumber=$receiverIdentificationNumber, receiverStreetAddress=$receiverStreetAddress, receiverCity=$receiverCity, receiverStateOrProvince=$receiverStateOrProvince, receiverCountry=$receiverCountry, receiverPostalCode=$receiverPostalCode, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<String> = JsonMissing.of()
                private var foreignExchangeReferenceIndicator: JsonField<String> = JsonMissing.of()
                private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                private var internationalTransactionTypeCode: JsonField<String> = JsonMissing.of()
                private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String> =
                    JsonMissing.of()
                private var originatorCity: JsonField<String> = JsonMissing.of()
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
                private var originatorCountry: JsonField<String> = JsonMissing.of()
                private var originatorIdentification: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                private var receiverCity: JsonField<String> = JsonMissing.of()
                private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                private var receiverCountry: JsonField<String> = JsonMissing.of()
                private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                private var receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionId: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
                    JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(internationalAchDecline: InternationalAchDecline) = apply {
                    this.amount = internationalAchDecline.amount
                    this.foreignExchangeIndicator = internationalAchDecline.foreignExchangeIndicator
                    this.foreignExchangeReferenceIndicator =
                        internationalAchDecline.foreignExchangeReferenceIndicator
                    this.foreignExchangeReference = internationalAchDecline.foreignExchangeReference
                    this.destinationCountryCode = internationalAchDecline.destinationCountryCode
                    this.destinationCurrencyCode = internationalAchDecline.destinationCurrencyCode
                    this.foreignPaymentAmount = internationalAchDecline.foreignPaymentAmount
                    this.foreignTraceNumber = internationalAchDecline.foreignTraceNumber
                    this.internationalTransactionTypeCode =
                        internationalAchDecline.internationalTransactionTypeCode
                    this.originatingCurrencyCode = internationalAchDecline.originatingCurrencyCode
                    this.originatingDepositoryFinancialInstitutionName =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionName
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionIdQualifier
                    this.originatingDepositoryFinancialInstitutionId =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionId
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        internationalAchDecline
                            .originatingDepositoryFinancialInstitutionBranchCountry
                    this.originatorCity = internationalAchDecline.originatorCity
                    this.originatorCompanyEntryDescription =
                        internationalAchDecline.originatorCompanyEntryDescription
                    this.originatorCountry = internationalAchDecline.originatorCountry
                    this.originatorIdentification = internationalAchDecline.originatorIdentification
                    this.originatorName = internationalAchDecline.originatorName
                    this.originatorPostalCode = internationalAchDecline.originatorPostalCode
                    this.originatorStreetAddress = internationalAchDecline.originatorStreetAddress
                    this.originatorStateOrProvince =
                        internationalAchDecline.originatorStateOrProvince
                    this.paymentRelatedInformation =
                        internationalAchDecline.paymentRelatedInformation
                    this.paymentRelatedInformation2 =
                        internationalAchDecline.paymentRelatedInformation2
                    this.receiverIdentificationNumber =
                        internationalAchDecline.receiverIdentificationNumber
                    this.receiverStreetAddress = internationalAchDecline.receiverStreetAddress
                    this.receiverCity = internationalAchDecline.receiverCity
                    this.receiverStateOrProvince = internationalAchDecline.receiverStateOrProvince
                    this.receiverCountry = internationalAchDecline.receiverCountry
                    this.receiverPostalCode = internationalAchDecline.receiverPostalCode
                    this.receivingCompanyOrIndividualName =
                        internationalAchDecline.receivingCompanyOrIndividualName
                    this.receivingDepositoryFinancialInstitutionName =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionName
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionIdQualifier
                    this.receivingDepositoryFinancialInstitutionId =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionId
                    this.receivingDepositoryFinancialInstitutionCountry =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionCountry
                    this.traceNumber = internationalAchDecline.traceNumber
                    additionalProperties(internationalAchDecline.additionalProperties)
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

                fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: String) =
                    foreignExchangeReferenceIndicator(
                        JsonField.of(foreignExchangeReferenceIndicator)
                    )

                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun foreignExchangeReferenceIndicator(
                    foreignExchangeReferenceIndicator: JsonField<String>
                ) = apply {
                    this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                }

                fun foreignExchangeReference(foreignExchangeReference: String) =
                    foreignExchangeReference(JsonField.of(foreignExchangeReference))

                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
                    this.foreignExchangeReference = foreignExchangeReference
                }

                fun destinationCountryCode(destinationCountryCode: String) =
                    destinationCountryCode(JsonField.of(destinationCountryCode))

                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                    this.destinationCountryCode = destinationCountryCode
                }

                fun destinationCurrencyCode(destinationCurrencyCode: String) =
                    destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
                    this.destinationCurrencyCode = destinationCurrencyCode
                }

                fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                    foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                    this.foreignPaymentAmount = foreignPaymentAmount
                }

                fun foreignTraceNumber(foreignTraceNumber: String) =
                    foreignTraceNumber(JsonField.of(foreignTraceNumber))

                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                    this.foreignTraceNumber = foreignTraceNumber
                }

                fun internationalTransactionTypeCode(internationalTransactionTypeCode: String) =
                    internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun internationalTransactionTypeCode(
                    internationalTransactionTypeCode: JsonField<String>
                ) = apply {
                    this.internationalTransactionTypeCode = internationalTransactionTypeCode
                }

                fun originatingCurrencyCode(originatingCurrencyCode: String) =
                    originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
                    this.originatingCurrencyCode = originatingCurrencyCode
                }

                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: String
                ) =
                    originatingDepositoryFinancialInstitutionName(
                        JsonField.of(originatingDepositoryFinancialInstitutionName)
                    )

                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionName =
                        originatingDepositoryFinancialInstitutionName
                }

                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier: String
                ) =
                    originatingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                    )

                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        originatingDepositoryFinancialInstitutionIdQualifier
                }

                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: String
                ) =
                    originatingDepositoryFinancialInstitutionId(
                        JsonField.of(originatingDepositoryFinancialInstitutionId)
                    )

                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionId =
                        originatingDepositoryFinancialInstitutionId
                }

                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: String
                ) =
                    originatingDepositoryFinancialInstitutionBranchCountry(
                        JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                    )

                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        originatingDepositoryFinancialInstitutionBranchCountry
                }

                fun originatorCity(originatorCity: String) =
                    originatorCity(JsonField.of(originatorCity))

                @JsonProperty("originator_city")
                @ExcludeMissing
                fun originatorCity(originatorCity: JsonField<String>) = apply {
                    this.originatorCity = originatorCity
                }

                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                    originatorCompanyEntryDescription(
                        JsonField.of(originatorCompanyEntryDescription)
                    )

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun originatorCompanyEntryDescription(
                    originatorCompanyEntryDescription: JsonField<String>
                ) = apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

                fun originatorCountry(originatorCountry: String) =
                    originatorCountry(JsonField.of(originatorCountry))

                @JsonProperty("originator_country")
                @ExcludeMissing
                fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                    this.originatorCountry = originatorCountry
                }

                fun originatorIdentification(originatorIdentification: String) =
                    originatorIdentification(JsonField.of(originatorIdentification))

                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
                    this.originatorIdentification = originatorIdentification
                }

                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                fun originatorPostalCode(originatorPostalCode: String) =
                    originatorPostalCode(JsonField.of(originatorPostalCode))

                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                    this.originatorPostalCode = originatorPostalCode
                }

                fun originatorStreetAddress(originatorStreetAddress: String) =
                    originatorStreetAddress(JsonField.of(originatorStreetAddress))

                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
                    this.originatorStreetAddress = originatorStreetAddress
                }

                fun originatorStateOrProvince(originatorStateOrProvince: String) =
                    originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                    apply {
                        this.originatorStateOrProvince = originatorStateOrProvince
                    }

                fun paymentRelatedInformation(paymentRelatedInformation: String) =
                    paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
                    }

                fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                    paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation2 = paymentRelatedInformation2
                    }

                fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                    receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                    apply {
                        this.receiverIdentificationNumber = receiverIdentificationNumber
                    }

                fun receiverStreetAddress(receiverStreetAddress: String) =
                    receiverStreetAddress(JsonField.of(receiverStreetAddress))

                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                    this.receiverStreetAddress = receiverStreetAddress
                }

                fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

                @JsonProperty("receiver_city")
                @ExcludeMissing
                fun receiverCity(receiverCity: JsonField<String>) = apply {
                    this.receiverCity = receiverCity
                }

                fun receiverStateOrProvince(receiverStateOrProvince: String) =
                    receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
                    this.receiverStateOrProvince = receiverStateOrProvince
                }

                fun receiverCountry(receiverCountry: String) =
                    receiverCountry(JsonField.of(receiverCountry))

                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                    this.receiverCountry = receiverCountry
                }

                fun receiverPostalCode(receiverPostalCode: String) =
                    receiverPostalCode(JsonField.of(receiverPostalCode))

                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                    this.receiverPostalCode = receiverPostalCode
                }

                fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                    receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun receivingCompanyOrIndividualName(
                    receivingCompanyOrIndividualName: JsonField<String>
                ) = apply {
                    this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                }

                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: String
                ) =
                    receivingDepositoryFinancialInstitutionName(
                        JsonField.of(receivingDepositoryFinancialInstitutionName)
                    )

                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionName =
                        receivingDepositoryFinancialInstitutionName
                }

                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier: String
                ) =
                    receivingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                    )

                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        receivingDepositoryFinancialInstitutionIdQualifier
                }

                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: String
                ) =
                    receivingDepositoryFinancialInstitutionId(
                        JsonField.of(receivingDepositoryFinancialInstitutionId)
                    )

                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionId =
                        receivingDepositoryFinancialInstitutionId
                }

                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: String
                ) =
                    receivingDepositoryFinancialInstitutionCountry(
                        JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                    )

                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionCountry =
                        receivingDepositoryFinancialInstitutionCountry
                }

                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InternationalAchDecline =
                    InternationalAchDecline(
                        amount,
                        foreignExchangeIndicator,
                        foreignExchangeReferenceIndicator,
                        foreignExchangeReference,
                        destinationCountryCode,
                        destinationCurrencyCode,
                        foreignPaymentAmount,
                        foreignTraceNumber,
                        internationalTransactionTypeCode,
                        originatingCurrencyCode,
                        originatingDepositoryFinancialInstitutionName,
                        originatingDepositoryFinancialInstitutionIdQualifier,
                        originatingDepositoryFinancialInstitutionId,
                        originatingDepositoryFinancialInstitutionBranchCountry,
                        originatorCity,
                        originatorCompanyEntryDescription,
                        originatorCountry,
                        originatorIdentification,
                        originatorName,
                        originatorPostalCode,
                        originatorStreetAddress,
                        originatorStateOrProvince,
                        paymentRelatedInformation,
                        paymentRelatedInformation2,
                        receiverIdentificationNumber,
                        receiverStreetAddress,
                        receiverCity,
                        receiverStateOrProvince,
                        receiverCountry,
                        receiverPostalCode,
                        receivingCompanyOrIndividualName,
                        receivingDepositoryFinancialInstitutionName,
                        receivingDepositoryFinancialInstitutionIdQualifier,
                        receivingDepositoryFinancialInstitutionId,
                        receivingDepositoryFinancialInstitutionCountry,
                        traceNumber,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @JsonDeserialize(builder = WireDecline.Builder::class)
        @NoAutoDetect
        class WireDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val reason: JsonField<Reason>,
            private val description: JsonField<String>,
            private val beneficiaryAddressLine1: JsonField<String>,
            private val beneficiaryAddressLine2: JsonField<String>,
            private val beneficiaryAddressLine3: JsonField<String>,
            private val beneficiaryName: JsonField<String>,
            private val beneficiaryReference: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val originatorAddressLine1: JsonField<String>,
            private val originatorAddressLine2: JsonField<String>,
            private val originatorAddressLine3: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorToBeneficiaryInformationLine1: JsonField<String>,
            private val originatorToBeneficiaryInformationLine2: JsonField<String>,
            private val originatorToBeneficiaryInformationLine3: JsonField<String>,
            private val originatorToBeneficiaryInformationLine4: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** Why the wire transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            fun description(): String = description.getRequired("description")

            fun beneficiaryAddressLine1(): String? =
                beneficiaryAddressLine1.getNullable("beneficiary_address_line1")

            fun beneficiaryAddressLine2(): String? =
                beneficiaryAddressLine2.getNullable("beneficiary_address_line2")

            fun beneficiaryAddressLine3(): String? =
                beneficiaryAddressLine3.getNullable("beneficiary_address_line3")

            fun beneficiaryName(): String? = beneficiaryName.getNullable("beneficiary_name")

            fun beneficiaryReference(): String? =
                beneficiaryReference.getNullable("beneficiary_reference")

            fun inputMessageAccountabilityData(): String? =
                inputMessageAccountabilityData.getNullable("input_message_accountability_data")

            fun originatorAddressLine1(): String? =
                originatorAddressLine1.getNullable("originator_address_line1")

            fun originatorAddressLine2(): String? =
                originatorAddressLine2.getNullable("originator_address_line2")

            fun originatorAddressLine3(): String? =
                originatorAddressLine3.getNullable("originator_address_line3")

            fun originatorName(): String? = originatorName.getNullable("originator_name")

            fun originatorToBeneficiaryInformationLine1(): String? =
                originatorToBeneficiaryInformationLine1.getNullable(
                    "originator_to_beneficiary_information_line1"
                )

            fun originatorToBeneficiaryInformationLine2(): String? =
                originatorToBeneficiaryInformationLine2.getNullable(
                    "originator_to_beneficiary_information_line2"
                )

            fun originatorToBeneficiaryInformationLine3(): String? =
                originatorToBeneficiaryInformationLine3.getNullable(
                    "originator_to_beneficiary_information_line3"
                )

            fun originatorToBeneficiaryInformationLine4(): String? =
                originatorToBeneficiaryInformationLine4.getNullable(
                    "originator_to_beneficiary_information_line4"
                )

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** Why the wire transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonProperty("beneficiary_address_line1")
            @ExcludeMissing
            fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

            @JsonProperty("beneficiary_address_line2")
            @ExcludeMissing
            fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

            @JsonProperty("beneficiary_address_line3")
            @ExcludeMissing
            fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

            @JsonProperty("beneficiary_name")
            @ExcludeMissing
            fun _beneficiaryName() = beneficiaryName

            @JsonProperty("beneficiary_reference")
            @ExcludeMissing
            fun _beneficiaryReference() = beneficiaryReference

            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            @JsonProperty("originator_address_line1")
            @ExcludeMissing
            fun _originatorAddressLine1() = originatorAddressLine1

            @JsonProperty("originator_address_line2")
            @ExcludeMissing
            fun _originatorAddressLine2() = originatorAddressLine2

            @JsonProperty("originator_address_line3")
            @ExcludeMissing
            fun _originatorAddressLine3() = originatorAddressLine3

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            @JsonProperty("originator_to_beneficiary_information_line1")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine1() = originatorToBeneficiaryInformationLine1

            @JsonProperty("originator_to_beneficiary_information_line2")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine2() = originatorToBeneficiaryInformationLine2

            @JsonProperty("originator_to_beneficiary_information_line3")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine3() = originatorToBeneficiaryInformationLine3

            @JsonProperty("originator_to_beneficiary_information_line4")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine4() = originatorToBeneficiaryInformationLine4

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireDecline = apply {
                if (!validated) {
                    amount()
                    reason()
                    description()
                    beneficiaryAddressLine1()
                    beneficiaryAddressLine2()
                    beneficiaryAddressLine3()
                    beneficiaryName()
                    beneficiaryReference()
                    inputMessageAccountabilityData()
                    originatorAddressLine1()
                    originatorAddressLine2()
                    originatorAddressLine3()
                    originatorName()
                    originatorToBeneficiaryInformationLine1()
                    originatorToBeneficiaryInformationLine2()
                    originatorToBeneficiaryInformationLine3()
                    originatorToBeneficiaryInformationLine4()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireDecline &&
                    this.amount == other.amount &&
                    this.reason == other.reason &&
                    this.description == other.description &&
                    this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                    this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                    this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                    this.beneficiaryName == other.beneficiaryName &&
                    this.beneficiaryReference == other.beneficiaryReference &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.originatorAddressLine1 == other.originatorAddressLine1 &&
                    this.originatorAddressLine2 == other.originatorAddressLine2 &&
                    this.originatorAddressLine3 == other.originatorAddressLine3 &&
                    this.originatorName == other.originatorName &&
                    this.originatorToBeneficiaryInformationLine1 ==
                        other.originatorToBeneficiaryInformationLine1 &&
                    this.originatorToBeneficiaryInformationLine2 ==
                        other.originatorToBeneficiaryInformationLine2 &&
                    this.originatorToBeneficiaryInformationLine3 ==
                        other.originatorToBeneficiaryInformationLine3 &&
                    this.originatorToBeneficiaryInformationLine4 ==
                        other.originatorToBeneficiaryInformationLine4 &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            reason,
                            description,
                            beneficiaryAddressLine1,
                            beneficiaryAddressLine2,
                            beneficiaryAddressLine3,
                            beneficiaryName,
                            beneficiaryReference,
                            inputMessageAccountabilityData,
                            originatorAddressLine1,
                            originatorAddressLine2,
                            originatorAddressLine3,
                            originatorName,
                            originatorToBeneficiaryInformationLine1,
                            originatorToBeneficiaryInformationLine2,
                            originatorToBeneficiaryInformationLine3,
                            originatorToBeneficiaryInformationLine4,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "WireDecline{amount=$amount, reason=$reason, description=$description, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
                private var beneficiaryName: JsonField<String> = JsonMissing.of()
                private var beneficiaryReference: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(wireDecline: WireDecline) = apply {
                    this.amount = wireDecline.amount
                    this.reason = wireDecline.reason
                    this.description = wireDecline.description
                    this.beneficiaryAddressLine1 = wireDecline.beneficiaryAddressLine1
                    this.beneficiaryAddressLine2 = wireDecline.beneficiaryAddressLine2
                    this.beneficiaryAddressLine3 = wireDecline.beneficiaryAddressLine3
                    this.beneficiaryName = wireDecline.beneficiaryName
                    this.beneficiaryReference = wireDecline.beneficiaryReference
                    this.inputMessageAccountabilityData = wireDecline.inputMessageAccountabilityData
                    this.originatorAddressLine1 = wireDecline.originatorAddressLine1
                    this.originatorAddressLine2 = wireDecline.originatorAddressLine2
                    this.originatorAddressLine3 = wireDecline.originatorAddressLine3
                    this.originatorName = wireDecline.originatorName
                    this.originatorToBeneficiaryInformationLine1 =
                        wireDecline.originatorToBeneficiaryInformationLine1
                    this.originatorToBeneficiaryInformationLine2 =
                        wireDecline.originatorToBeneficiaryInformationLine2
                    this.originatorToBeneficiaryInformationLine3 =
                        wireDecline.originatorToBeneficiaryInformationLine3
                    this.originatorToBeneficiaryInformationLine4 =
                        wireDecline.originatorToBeneficiaryInformationLine4
                    additionalProperties(wireDecline.additionalProperties)
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** Why the wire transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the wire transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun description(description: String) = description(JsonField.of(description))

                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                    beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                    this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                }

                fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                    beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                    this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                }

                fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                    beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                    this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                }

                fun beneficiaryName(beneficiaryName: String) =
                    beneficiaryName(JsonField.of(beneficiaryName))

                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                    this.beneficiaryName = beneficiaryName
                }

                fun beneficiaryReference(beneficiaryReference: String) =
                    beneficiaryReference(JsonField.of(beneficiaryReference))

                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                    this.beneficiaryReference = beneficiaryReference
                }

                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                fun originatorAddressLine1(originatorAddressLine1: String) =
                    originatorAddressLine1(JsonField.of(originatorAddressLine1))

                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                    this.originatorAddressLine1 = originatorAddressLine1
                }

                fun originatorAddressLine2(originatorAddressLine2: String) =
                    originatorAddressLine2(JsonField.of(originatorAddressLine2))

                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                    this.originatorAddressLine2 = originatorAddressLine2
                }

                fun originatorAddressLine3(originatorAddressLine3: String) =
                    originatorAddressLine3(JsonField.of(originatorAddressLine3))

                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                    this.originatorAddressLine3 = originatorAddressLine3
                }

                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: String
                ) =
                    originatorToBeneficiaryInformationLine1(
                        JsonField.of(originatorToBeneficiaryInformationLine1)
                    )

                @JsonProperty("originator_to_beneficiary_information_line1")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine1 =
                        originatorToBeneficiaryInformationLine1
                }

                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: String
                ) =
                    originatorToBeneficiaryInformationLine2(
                        JsonField.of(originatorToBeneficiaryInformationLine2)
                    )

                @JsonProperty("originator_to_beneficiary_information_line2")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine2 =
                        originatorToBeneficiaryInformationLine2
                }

                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: String
                ) =
                    originatorToBeneficiaryInformationLine3(
                        JsonField.of(originatorToBeneficiaryInformationLine3)
                    )

                @JsonProperty("originator_to_beneficiary_information_line3")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine3 =
                        originatorToBeneficiaryInformationLine3
                }

                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: String
                ) =
                    originatorToBeneficiaryInformationLine4(
                        JsonField.of(originatorToBeneficiaryInformationLine4)
                    )

                @JsonProperty("originator_to_beneficiary_information_line4")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine4 =
                        originatorToBeneficiaryInformationLine4
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): WireDecline =
                    WireDecline(
                        amount,
                        reason,
                        description,
                        beneficiaryAddressLine1,
                        beneficiaryAddressLine2,
                        beneficiaryAddressLine3,
                        beneficiaryName,
                        beneficiaryReference,
                        inputMessageAccountabilityData,
                        originatorAddressLine1,
                        originatorAddressLine2,
                        originatorAddressLine3,
                        originatorName,
                        originatorToBeneficiaryInformationLine1,
                        originatorToBeneficiaryInformationLine2,
                        originatorToBeneficiaryInformationLine3,
                        originatorToBeneficiaryInformationLine4,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACCOUNT_NUMBER_CANCELED = Reason(JsonField.of("account_number_canceled"))

                    val ACCOUNT_NUMBER_DISABLED = Reason(JsonField.of("account_number_disabled"))

                    val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    val NO_ACCOUNT_NUMBER = Reason(JsonField.of("no_account_number"))

                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    NO_ACCOUNT_NUMBER,
                    TRANSACTION_NOT_ALLOWED,
                }

                enum class Value {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    NO_ACCOUNT_NUMBER,
                    TRANSACTION_NOT_ALLOWED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        NO_ACCOUNT_NUMBER -> Value.NO_ACCOUNT_NUMBER
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        NO_ACCOUNT_NUMBER -> Known.NO_ACCOUNT_NUMBER
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DECLINED_TRANSACTION = Type(JsonField.of("declined_transaction"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DECLINED_TRANSACTION,
        }

        enum class Value {
            DECLINED_TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED_TRANSACTION -> Value.DECLINED_TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED_TRANSACTION -> Known.DECLINED_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
