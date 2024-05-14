// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** The results of a Card Authorization simulation. */
@JsonDeserialize(builder = CardAuthorizationSimulation.Builder::class)
@NoAutoDetect
class CardAuthorizationSimulation
private constructor(
    private val declinedTransaction: JsonField<DeclinedTransaction>,
    private val pendingTransaction: JsonField<PendingTransaction>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    fun declinedTransaction(): DeclinedTransaction? =
        declinedTransaction.getNullable("declined_transaction")

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    fun pendingTransaction(): PendingTransaction? =
        pendingTransaction.getNullable("pending_transaction")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction() = declinedTransaction

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    fun _pendingTransaction() = pendingTransaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardAuthorizationSimulation = apply {
        if (!validated) {
            declinedTransaction()?.validate()
            pendingTransaction()?.validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardAuthorizationSimulation &&
            this.declinedTransaction == other.declinedTransaction &&
            this.pendingTransaction == other.pendingTransaction &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    declinedTransaction,
                    pendingTransaction,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardAuthorizationSimulation{declinedTransaction=$declinedTransaction, pendingTransaction=$pendingTransaction, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of()
        private var pendingTransaction: JsonField<PendingTransaction> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardAuthorizationSimulation: CardAuthorizationSimulation) = apply {
            this.declinedTransaction = cardAuthorizationSimulation.declinedTransaction
            this.pendingTransaction = cardAuthorizationSimulation.pendingTransaction
            this.type = cardAuthorizationSimulation.type
            additionalProperties(cardAuthorizationSimulation.additionalProperties)
        }

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction) =
            declinedTransaction(JsonField.of(declinedTransaction))

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: PendingTransaction) =
            pendingTransaction(JsonField.of(pendingTransaction))

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        @JsonProperty("pending_transaction")
        @ExcludeMissing
        fun pendingTransaction(pendingTransaction: JsonField<PendingTransaction>) = apply {
            this.pendingTransaction = pendingTransaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
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

        fun build(): CardAuthorizationSimulation =
            CardAuthorizationSimulation(
                declinedTransaction,
                pendingTransaction,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    @JsonDeserialize(builder = DeclinedTransaction.Builder::class)
    @NoAutoDetect
    class DeclinedTransaction
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
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
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** This is the description the vendor provides. */
        fun description(): String = description.getRequired("description")

        /** The Declined Transaction identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
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
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** This is the description the vendor provides. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The Declined Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
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
                createdAt()
                currency()
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
                this.createdAt == other.createdAt &&
                this.currency == other.currency &&
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
                        createdAt,
                        currency,
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
            "DeclinedTransaction{accountId=$accountId, amount=$amount, createdAt=$createdAt, currency=$currency, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
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
                this.createdAt = declinedTransaction.createdAt
                this.currency = declinedTransaction.currency
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            /** This is the description the vendor provides. */
            fun description(description: String) = description(JsonField.of(description))

            /** This is the description the vendor provides. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Declined Transaction identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Declined Transaction identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The identifier for the route this Declined Transaction came through. Routes are
             * things like cards and ACH details.
             */
            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            /**
             * The identifier for the route this Declined Transaction came through. Routes are
             * things like cards and ACH details.
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
             * This is an object giving more details on the network-level event that caused the
             * Declined Transaction. For example, for a card transaction this lists the merchant's
             * industry and location. Note that for backwards compatibility reasons, additional
             * undocumented keys may appear in this object. These should be treated as deprecated
             * and will be removed in the future.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * This is an object giving more details on the network-level event that caused the
             * Declined Transaction. For example, for a card transaction this lists the merchant's
             * industry and location. Note that for backwards compatibility reasons, additional
             * undocumented keys may appear in this object. These should be treated as deprecated
             * and will be removed in the future.
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
                    createdAt,
                    currency,
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
        ) : Enum {

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
        ) : Enum {

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
            private val achDecline: JsonField<AchDecline>,
            private val cardDecline: JsonField<CardDecline>,
            private val category: JsonField<Category>,
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
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(): Category = category.getRequired("category")

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(): CheckDecline? = checkDecline.getNullable("check_decline")

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            fun inboundRealTimePaymentsTransferDecline(): InboundRealTimePaymentsTransferDecline? =
                inboundRealTimePaymentsTransferDecline.getNullable(
                    "inbound_real_time_payments_transfer_decline"
                )

            /**
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            fun internationalAchDecline(): InternationalAchDecline? =
                internationalAchDecline.getNullable("international_ach_decline")

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(): WireDecline? = wireDecline.getNullable("wire_decline")

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
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_decline")
            @ExcludeMissing
            fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

            /**
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
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
                    achDecline()?.validate()
                    cardDecline()?.validate()
                    category()
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
                    this.achDecline == other.achDecline &&
                    this.cardDecline == other.cardDecline &&
                    this.category == other.category &&
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
                            achDecline,
                            cardDecline,
                            category,
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
                "Source{achDecline=$achDecline, cardDecline=$cardDecline, category=$category, checkDecline=$checkDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, internationalAchDecline=$internationalAchDecline, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var achDecline: JsonField<AchDecline> = JsonMissing.of()
                private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
                private var category: JsonField<Category> = JsonMissing.of()
                private var checkDecline: JsonField<CheckDecline> = JsonMissing.of()
                private var inboundRealTimePaymentsTransferDecline:
                    JsonField<InboundRealTimePaymentsTransferDecline> =
                    JsonMissing.of()
                private var internationalAchDecline: JsonField<InternationalAchDecline> =
                    JsonMissing.of()
                private var wireDecline: JsonField<WireDecline> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(source: Source) = apply {
                    this.achDecline = source.achDecline
                    this.cardDecline = source.cardDecline
                    this.category = source.category
                    this.checkDecline = source.checkDecline
                    this.inboundRealTimePaymentsTransferDecline =
                        source.inboundRealTimePaymentsTransferDecline
                    this.internationalAchDecline = source.internationalAchDecline
                    this.wireDecline = source.wireDecline
                    additionalProperties(source.additionalProperties)
                }

                /**
                 * An ACH Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `ach_decline`.
                 */
                fun achDecline(achDecline: AchDecline) = achDecline(JsonField.of(achDecline))

                /**
                 * An ACH Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `ach_decline`.
                 */
                @JsonProperty("ach_decline")
                @ExcludeMissing
                fun achDecline(achDecline: JsonField<AchDecline>) = apply {
                    this.achDecline = achDecline
                }

                /**
                 * A Card Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_decline`.
                 */
                fun cardDecline(cardDecline: CardDecline) = cardDecline(JsonField.of(cardDecline))

                /**
                 * A Card Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_decline`.
                 */
                @JsonProperty("card_decline")
                @ExcludeMissing
                fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                    this.cardDecline = cardDecline
                }

                /**
                 * The type of the resource. We may add additional possible values for this enum
                 * over time; your application should be able to handle such additions gracefully.
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of the resource. We may add additional possible values for this enum
                 * over time; your application should be able to handle such additions gracefully.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * A Check Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `check_decline`.
                 */
                fun checkDecline(checkDecline: CheckDecline) =
                    checkDecline(JsonField.of(checkDecline))

                /**
                 * A Check Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `check_decline`.
                 */
                @JsonProperty("check_decline")
                @ExcludeMissing
                fun checkDecline(checkDecline: JsonField<CheckDecline>) = apply {
                    this.checkDecline = checkDecline
                }

                /**
                 * An Inbound Real-Time Payments Transfer Decline object. This field will be present
                 * in the JSON response if and only if `category` is equal to
                 * `inbound_real_time_payments_transfer_decline`.
                 */
                fun inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
                ) =
                    inboundRealTimePaymentsTransferDecline(
                        JsonField.of(inboundRealTimePaymentsTransferDecline)
                    )

                /**
                 * An Inbound Real-Time Payments Transfer Decline object. This field will be present
                 * in the JSON response if and only if `category` is equal to
                 * `inbound_real_time_payments_transfer_decline`.
                 */
                @JsonProperty("inbound_real_time_payments_transfer_decline")
                @ExcludeMissing
                fun inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline:
                        JsonField<InboundRealTimePaymentsTransferDecline>
                ) = apply {
                    this.inboundRealTimePaymentsTransferDecline =
                        inboundRealTimePaymentsTransferDecline
                }

                /**
                 * An International ACH Decline object. This field will be present in the JSON
                 * response if and only if `category` is equal to `international_ach_decline`.
                 */
                fun internationalAchDecline(internationalAchDecline: InternationalAchDecline) =
                    internationalAchDecline(JsonField.of(internationalAchDecline))

                /**
                 * An International ACH Decline object. This field will be present in the JSON
                 * response if and only if `category` is equal to `international_ach_decline`.
                 */
                @JsonProperty("international_ach_decline")
                @ExcludeMissing
                fun internationalAchDecline(
                    internationalAchDecline: JsonField<InternationalAchDecline>
                ) = apply { this.internationalAchDecline = internationalAchDecline }

                /**
                 * A Wire Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `wire_decline`.
                 */
                fun wireDecline(wireDecline: WireDecline) = wireDecline(JsonField.of(wireDecline))

                /**
                 * A Wire Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `wire_decline`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Source =
                    Source(
                        achDecline,
                        cardDecline,
                        category,
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
                private val amount: JsonField<Long>,
                private val id: JsonField<String>,
                private val inboundAchTransferId: JsonField<String>,
                private val originatorCompanyDescriptiveDate: JsonField<String>,
                private val originatorCompanyDiscretionaryData: JsonField<String>,
                private val originatorCompanyId: JsonField<String>,
                private val originatorCompanyName: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val receiverIdNumber: JsonField<String>,
                private val receiverName: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The ACH Decline's identifier. */
                fun id(): String = id.getRequired("id")

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                fun inboundAchTransferId(): String =
                    inboundAchTransferId.getRequired("inbound_ach_transfer_id")

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(): String? =
                    originatorCompanyDescriptiveDate.getNullable(
                        "originator_company_descriptive_date"
                    )

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(): String? =
                    originatorCompanyDiscretionaryData.getNullable(
                        "originator_company_discretionary_data"
                    )

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(): String =
                    originatorCompanyId.getRequired("originator_company_id")

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(): String =
                    originatorCompanyName.getRequired("originator_company_name")

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

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The ACH Decline's identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                @JsonProperty("inbound_ach_transfer_id")
                @ExcludeMissing
                fun _inboundAchTransferId() = inboundAchTransferId

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

                /** The name of the company that initiated the transfer. */
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun _originatorCompanyName() = originatorCompanyName

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
                        amount()
                        id()
                        inboundAchTransferId()
                        originatorCompanyDescriptiveDate()
                        originatorCompanyDiscretionaryData()
                        originatorCompanyId()
                        originatorCompanyName()
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
                        this.amount == other.amount &&
                        this.id == other.id &&
                        this.inboundAchTransferId == other.inboundAchTransferId &&
                        this.originatorCompanyDescriptiveDate ==
                            other.originatorCompanyDescriptiveDate &&
                        this.originatorCompanyDiscretionaryData ==
                            other.originatorCompanyDiscretionaryData &&
                        this.originatorCompanyId == other.originatorCompanyId &&
                        this.originatorCompanyName == other.originatorCompanyName &&
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
                                amount,
                                id,
                                inboundAchTransferId,
                                originatorCompanyDescriptiveDate,
                                originatorCompanyDiscretionaryData,
                                originatorCompanyId,
                                originatorCompanyName,
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
                    "AchDecline{amount=$amount, id=$id, inboundAchTransferId=$inboundAchTransferId, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var inboundAchTransferId: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyDescriptiveDate: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyDiscretionaryData: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                    private var receiverName: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(achDecline: AchDecline) = apply {
                        this.amount = achDecline.amount
                        this.id = achDecline.id
                        this.inboundAchTransferId = achDecline.inboundAchTransferId
                        this.originatorCompanyDescriptiveDate =
                            achDecline.originatorCompanyDescriptiveDate
                        this.originatorCompanyDiscretionaryData =
                            achDecline.originatorCompanyDiscretionaryData
                        this.originatorCompanyId = achDecline.originatorCompanyId
                        this.originatorCompanyName = achDecline.originatorCompanyName
                        this.reason = achDecline.reason
                        this.receiverIdNumber = achDecline.receiverIdNumber
                        this.receiverName = achDecline.receiverName
                        this.traceNumber = achDecline.traceNumber
                        this.type = achDecline.type
                        additionalProperties(achDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The ACH Decline's identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The ACH Decline's identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * The identifier of the Inbound ACH Transfer object associated with this
                     * decline.
                     */
                    fun inboundAchTransferId(inboundAchTransferId: String) =
                        inboundAchTransferId(JsonField.of(inboundAchTransferId))

                    /**
                     * The identifier of the Inbound ACH Transfer object associated with this
                     * decline.
                     */
                    @JsonProperty("inbound_ach_transfer_id")
                    @ExcludeMissing
                    fun inboundAchTransferId(inboundAchTransferId: JsonField<String>) = apply {
                        this.inboundAchTransferId = inboundAchTransferId
                    }

                    /** The descriptive date of the transfer. */
                    fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                        originatorCompanyDescriptiveDate(
                            JsonField.of(originatorCompanyDescriptiveDate)
                        )

                    /** The descriptive date of the transfer. */
                    @JsonProperty("originator_company_descriptive_date")
                    @ExcludeMissing
                    fun originatorCompanyDescriptiveDate(
                        originatorCompanyDescriptiveDate: JsonField<String>
                    ) = apply {
                        this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                    }

                    /** The additional information included with the transfer. */
                    fun originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData: String
                    ) =
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

                    /** The name of the company that initiated the transfer. */
                    fun originatorCompanyName(originatorCompanyName: String) =
                        originatorCompanyName(JsonField.of(originatorCompanyName))

                    /** The name of the company that initiated the transfer. */
                    @JsonProperty("originator_company_name")
                    @ExcludeMissing
                    fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                        this.originatorCompanyName = originatorCompanyName
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
                    fun receiverName(receiverName: String) =
                        receiverName(JsonField.of(receiverName))

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
                     * A constant representing the object's type. For this resource it will always
                     * be `ach_decline`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `ach_decline`.
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
                            amount,
                            id,
                            inboundAchTransferId,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyId,
                            originatorCompanyName,
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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

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
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
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
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                private val actioner: JsonField<Actioner>,
                private val amount: JsonField<Long>,
                private val cardPaymentId: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val digitalWalletTokenId: JsonField<String>,
                private val id: JsonField<String>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val networkDetails: JsonField<NetworkDetails>,
                private val networkIdentifiers: JsonField<NetworkIdentifiers>,
                private val networkRiskScore: JsonField<Long>,
                private val physicalCardId: JsonField<String>,
                private val presentmentAmount: JsonField<Long>,
                private val presentmentCurrency: JsonField<String>,
                private val processingCategory: JsonField<ProcessingCategory>,
                private val realTimeDecisionId: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val verification: JsonField<Verification>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(): Actioner = actioner.getRequired("actioner")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(): String? = cardPaymentId.getNullable("card_payment_id")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(): String? =
                    digitalWalletTokenId.getNullable("digital_wallet_token_id")

                /** The Card Decline identifier. */
                fun id(): String = id.getRequired("id")

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(): String? =
                    merchantCategoryCode.getNullable("merchant_category_code")

                /** The city the merchant resides in. */
                fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

                /** The country the merchant resides in. */
                fun merchantCountry(): String? = merchantCountry.getNullable("merchant_country")

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                /** The state the merchant resides in. */
                fun merchantState(): String? = merchantState.getNullable("merchant_state")

                /** Fields specific to the `network`. */
                fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(): NetworkIdentifiers =
                    networkIdentifiers.getRequired("network_identifiers")

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

                /**
                 * The declined amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(): String =
                    presentmentCurrency.getRequired("presentment_currency")

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                fun processingCategory(): ProcessingCategory =
                    processingCategory.getRequired("processing_category")

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(): String? =
                    realTimeDecisionId.getNullable("real_time_decision_id")

                /** Why the transaction was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /** Fields related to verification of cardholder-provided values. */
                fun verification(): Verification = verification.getRequired("verification")

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun _cardPaymentId() = cardPaymentId

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                fun _digitalWalletTokenId() = digitalWalletTokenId

                /** The Card Decline identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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

                /** The merchant descriptor of the merchant the card is transacting with. */
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                /** Fields specific to the `network`. */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun _networkDetails() = networkDetails

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun _networkIdentifiers() = networkIdentifiers

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun _networkRiskScore() = networkRiskScore

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun _physicalCardId() = physicalCardId

                /**
                 * The declined amount in the minor unit of the transaction's presentment currency.
                 */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun _presentmentAmount() = presentmentAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun _presentmentCurrency() = presentmentCurrency

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                @JsonProperty("processing_category")
                @ExcludeMissing
                fun _processingCategory() = processingCategory

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun _realTimeDecisionId() = realTimeDecisionId

                /** Why the transaction was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardDecline = apply {
                    if (!validated) {
                        actioner()
                        amount()
                        cardPaymentId()
                        currency()
                        digitalWalletTokenId()
                        id()
                        merchantAcceptorId()
                        merchantCategoryCode()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        merchantState()
                        networkDetails().validate()
                        networkIdentifiers().validate()
                        networkRiskScore()
                        physicalCardId()
                        presentmentAmount()
                        presentmentCurrency()
                        processingCategory()
                        realTimeDecisionId()
                        reason()
                        verification().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardDecline &&
                        this.actioner == other.actioner &&
                        this.amount == other.amount &&
                        this.cardPaymentId == other.cardPaymentId &&
                        this.currency == other.currency &&
                        this.digitalWalletTokenId == other.digitalWalletTokenId &&
                        this.id == other.id &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantState == other.merchantState &&
                        this.networkDetails == other.networkDetails &&
                        this.networkIdentifiers == other.networkIdentifiers &&
                        this.networkRiskScore == other.networkRiskScore &&
                        this.physicalCardId == other.physicalCardId &&
                        this.presentmentAmount == other.presentmentAmount &&
                        this.presentmentCurrency == other.presentmentCurrency &&
                        this.processingCategory == other.processingCategory &&
                        this.realTimeDecisionId == other.realTimeDecisionId &&
                        this.reason == other.reason &&
                        this.verification == other.verification &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                actioner,
                                amount,
                                cardPaymentId,
                                currency,
                                digitalWalletTokenId,
                                id,
                                merchantAcceptorId,
                                merchantCategoryCode,
                                merchantCity,
                                merchantCountry,
                                merchantDescriptor,
                                merchantState,
                                networkDetails,
                                networkIdentifiers,
                                networkRiskScore,
                                physicalCardId,
                                presentmentAmount,
                                presentmentCurrency,
                                processingCategory,
                                realTimeDecisionId,
                                reason,
                                verification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardDecline{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, reason=$reason, verification=$verification, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var actioner: JsonField<Actioner> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var cardPaymentId: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                    private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                    private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                    private var physicalCardId: JsonField<String> = JsonMissing.of()
                    private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                    private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                    private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                    private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var verification: JsonField<Verification> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cardDecline: CardDecline) = apply {
                        this.actioner = cardDecline.actioner
                        this.amount = cardDecline.amount
                        this.cardPaymentId = cardDecline.cardPaymentId
                        this.currency = cardDecline.currency
                        this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                        this.id = cardDecline.id
                        this.merchantAcceptorId = cardDecline.merchantAcceptorId
                        this.merchantCategoryCode = cardDecline.merchantCategoryCode
                        this.merchantCity = cardDecline.merchantCity
                        this.merchantCountry = cardDecline.merchantCountry
                        this.merchantDescriptor = cardDecline.merchantDescriptor
                        this.merchantState = cardDecline.merchantState
                        this.networkDetails = cardDecline.networkDetails
                        this.networkIdentifiers = cardDecline.networkIdentifiers
                        this.networkRiskScore = cardDecline.networkRiskScore
                        this.physicalCardId = cardDecline.physicalCardId
                        this.presentmentAmount = cardDecline.presentmentAmount
                        this.presentmentCurrency = cardDecline.presentmentCurrency
                        this.processingCategory = cardDecline.processingCategory
                        this.realTimeDecisionId = cardDecline.realTimeDecisionId
                        this.reason = cardDecline.reason
                        this.verification = cardDecline.verification
                        additionalProperties(cardDecline.additionalProperties)
                    }

                    /**
                     * Whether this authorization was approved by Increase, the card network through
                     * stand-in processing, or the user through a real-time decision.
                     */
                    fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                    /**
                     * Whether this authorization was approved by Increase, the card network through
                     * stand-in processing, or the user through a real-time decision.
                     */
                    @JsonProperty("actioner")
                    @ExcludeMissing
                    fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The ID of the Card Payment this transaction belongs to. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /** The ID of the Card Payment this transaction belongs to. */
                    @JsonProperty("card_payment_id")
                    @ExcludeMissing
                    fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                        this.cardPaymentId = cardPaymentId
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    fun digitalWalletTokenId(digitalWalletTokenId: String) =
                        digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                    /**
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    @JsonProperty("digital_wallet_token_id")
                    @ExcludeMissing
                    fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                        this.digitalWalletTokenId = digitalWalletTokenId
                    }

                    /** The Card Decline identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Card Decline identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    /**
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    /**
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
                    }

                    /** The city the merchant resides in. */
                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

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

                    /** The merchant descriptor of the merchant the card is transacting with. */
                    fun merchantDescriptor(merchantDescriptor: String) =
                        merchantDescriptor(JsonField.of(merchantDescriptor))

                    /** The merchant descriptor of the merchant the card is transacting with. */
                    @JsonProperty("merchant_descriptor")
                    @ExcludeMissing
                    fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                        this.merchantDescriptor = merchantDescriptor
                    }

                    /** The state the merchant resides in. */
                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    /** The state the merchant resides in. */
                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
                    }

                    /** Fields specific to the `network`. */
                    fun networkDetails(networkDetails: NetworkDetails) =
                        networkDetails(JsonField.of(networkDetails))

                    /** Fields specific to the `network`. */
                    @JsonProperty("network_details")
                    @ExcludeMissing
                    fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                        this.networkDetails = networkDetails
                    }

                    /** Network-specific identifiers for a specific request or transaction. */
                    fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                        networkIdentifiers(JsonField.of(networkIdentifiers))

                    /** Network-specific identifiers for a specific request or transaction. */
                    @JsonProperty("network_identifiers")
                    @ExcludeMissing
                    fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) =
                        apply {
                            this.networkIdentifiers = networkIdentifiers
                        }

                    /**
                     * The risk score generated by the card network. For Visa this is the Visa
                     * Advanced Authorization risk score, from 0 to 99, where 99 is the riskiest.
                     */
                    fun networkRiskScore(networkRiskScore: Long) =
                        networkRiskScore(JsonField.of(networkRiskScore))

                    /**
                     * The risk score generated by the card network. For Visa this is the Visa
                     * Advanced Authorization risk score, from 0 to 99, where 99 is the riskiest.
                     */
                    @JsonProperty("network_risk_score")
                    @ExcludeMissing
                    fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                        this.networkRiskScore = networkRiskScore
                    }

                    /**
                     * If the authorization was made in-person with a physical card, the Physical
                     * Card that was used.
                     */
                    fun physicalCardId(physicalCardId: String) =
                        physicalCardId(JsonField.of(physicalCardId))

                    /**
                     * If the authorization was made in-person with a physical card, the Physical
                     * Card that was used.
                     */
                    @JsonProperty("physical_card_id")
                    @ExcludeMissing
                    fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                        this.physicalCardId = physicalCardId
                    }

                    /**
                     * The declined amount in the minor unit of the transaction's presentment
                     * currency.
                     */
                    fun presentmentAmount(presentmentAmount: Long) =
                        presentmentAmount(JsonField.of(presentmentAmount))

                    /**
                     * The declined amount in the minor unit of the transaction's presentment
                     * currency.
                     */
                    @JsonProperty("presentment_amount")
                    @ExcludeMissing
                    fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                        this.presentmentAmount = presentmentAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    fun presentmentCurrency(presentmentCurrency: String) =
                        presentmentCurrency(JsonField.of(presentmentCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    @JsonProperty("presentment_currency")
                    @ExcludeMissing
                    fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                        this.presentmentCurrency = presentmentCurrency
                    }

                    /**
                     * The processing category describes the intent behind the authorization, such
                     * as whether it was used for bill payments or an automatic fuel dispenser.
                     */
                    fun processingCategory(processingCategory: ProcessingCategory) =
                        processingCategory(JsonField.of(processingCategory))

                    /**
                     * The processing category describes the intent behind the authorization, such
                     * as whether it was used for bill payments or an automatic fuel dispenser.
                     */
                    @JsonProperty("processing_category")
                    @ExcludeMissing
                    fun processingCategory(processingCategory: JsonField<ProcessingCategory>) =
                        apply {
                            this.processingCategory = processingCategory
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

                    /** Why the transaction was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the transaction was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    /** Fields related to verification of cardholder-provided values. */
                    fun verification(verification: Verification) =
                        verification(JsonField.of(verification))

                    /** Fields related to verification of cardholder-provided values. */
                    @JsonProperty("verification")
                    @ExcludeMissing
                    fun verification(verification: JsonField<Verification>) = apply {
                        this.verification = verification
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
                            actioner,
                            amount,
                            cardPaymentId,
                            currency,
                            digitalWalletTokenId,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantState,
                            networkDetails,
                            networkIdentifiers,
                            networkRiskScore,
                            physicalCardId,
                            presentmentAmount,
                            presentmentCurrency,
                            processingCategory,
                            realTimeDecisionId,
                            reason,
                            verification,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Actioner
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Actioner && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val USER = Actioner(JsonField.of("user"))

                        val INCREASE = Actioner(JsonField.of("increase"))

                        val NETWORK = Actioner(JsonField.of("network"))

                        fun of(value: String) = Actioner(JsonField.of(value))
                    }

                    enum class Known {
                        USER,
                        INCREASE,
                        NETWORK,
                    }

                    enum class Value {
                        USER,
                        INCREASE,
                        NETWORK,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            USER -> Value.USER
                            INCREASE -> Value.INCREASE
                            NETWORK -> Value.NETWORK
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            USER -> Known.USER
                            INCREASE -> Known.INCREASE
                            NETWORK -> Known.NETWORK
                            else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                /** Fields specific to the `network`. */
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

                    /** The payment network used to process this card authorization. */
                    fun category(): Category = category.getRequired("category")

                    /** Fields specific to the `visa` network. */
                    fun visa(): Visa? = visa.getNullable("visa")

                    /** The payment network used to process this card authorization. */
                    @JsonProperty("category") @ExcludeMissing fun _category() = category

                    /** Fields specific to the `visa` network. */
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(networkDetails: NetworkDetails) = apply {
                            this.category = networkDetails.category
                            this.visa = networkDetails.visa
                            additionalProperties(networkDetails.additionalProperties)
                        }

                        /** The payment network used to process this card authorization. */
                        fun category(category: Category) = category(JsonField.of(category))

                        /** The payment network used to process this card authorization. */
                        @JsonProperty("category")
                        @ExcludeMissing
                        fun category(category: JsonField<Category>) = apply {
                            this.category = category
                        }

                        /** Fields specific to the `visa` network. */
                        fun visa(visa: Visa) = visa(JsonField.of(visa))

                        /** Fields specific to the `visa` network. */
                        @JsonProperty("visa")
                        @ExcludeMissing
                        fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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
                    ) : Enum {

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
                                else ->
                                    throw IncreaseInvalidDataException("Unknown Category: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    /** Fields specific to the `visa` network. */
                    @JsonDeserialize(builder = Visa.Builder::class)
                    @NoAutoDetect
                    class Visa
                    private constructor(
                        private val electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator>,
                        private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(): ElectronicCommerceIndicator? =
                            electronicCommerceIndicator.getNullable("electronic_commerce_indicator")

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(): PointOfServiceEntryMode? =
                            pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        fun _electronicCommerceIndicator() = electronicCommerceIndicator

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
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
                                this.electronicCommerceIndicator ==
                                    other.electronicCommerceIndicator &&
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
                            private var pointOfServiceEntryMode:
                                JsonField<PointOfServiceEntryMode> =
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
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: ElectronicCommerceIndicator
                            ) =
                                electronicCommerceIndicator(
                                    JsonField.of(electronicCommerceIndicator)
                                )

                            /**
                             * For electronic commerce transactions, this identifies the level of
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            @JsonProperty("electronic_commerce_indicator")
                            @ExcludeMissing
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                            ) = apply {
                                this.electronicCommerceIndicator = electronicCommerceIndicator
                            }

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date.
                             */
                            fun pointOfServiceEntryMode(
                                pointOfServiceEntryMode: PointOfServiceEntryMode
                            ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date.
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
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ElectronicCommerceIndicator &&
                                    this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val MAIL_PHONE_ORDER =
                                    ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                                val RECURRING =
                                    ElectronicCommerceIndicator(JsonField.of("recurring"))

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
                                    ElectronicCommerceIndicator(
                                        JsonField.of("non_secure_transaction")
                                    )

                                fun of(value: String) =
                                    ElectronicCommerceIndicator(JsonField.of(value))
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
                        ) : Enum {

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

                                val OPTICAL_CODE =
                                    PointOfServiceEntryMode(JsonField.of("optical_code"))

                                val INTEGRATED_CIRCUIT_CARD =
                                    PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

                                val CONTACTLESS =
                                    PointOfServiceEntryMode(JsonField.of("contactless"))

                                val CREDENTIAL_ON_FILE =
                                    PointOfServiceEntryMode(JsonField.of("credential_on_file"))

                                val MAGNETIC_STRIPE =
                                    PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

                                val CONTACTLESS_MAGNETIC_STRIPE =
                                    PointOfServiceEntryMode(
                                        JsonField.of("contactless_magnetic_stripe")
                                    )

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

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
                @NoAutoDetect
                class NetworkIdentifiers
                private constructor(
                    private val retrievalReferenceNumber: JsonField<String>,
                    private val traceNumber: JsonField<String>,
                    private val transactionId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(): String? =
                        retrievalReferenceNumber.getNullable("retrieval_reference_number")

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(): String? = transactionId.getNullable("transaction_id")

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    fun _retrievalReferenceNumber() = retrievalReferenceNumber

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    fun _transactionId() = transactionId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): NetworkIdentifiers = apply {
                        if (!validated) {
                            retrievalReferenceNumber()
                            traceNumber()
                            transactionId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is NetworkIdentifiers &&
                            this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                            this.traceNumber == other.traceNumber &&
                            this.transactionId == other.transactionId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    retrievalReferenceNumber,
                                    traceNumber,
                                    transactionId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                        private var traceNumber: JsonField<String> = JsonMissing.of()
                        private var transactionId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                            this.retrievalReferenceNumber =
                                networkIdentifiers.retrievalReferenceNumber
                            this.traceNumber = networkIdentifiers.traceNumber
                            this.transactionId = networkIdentifiers.transactionId
                            additionalProperties(networkIdentifiers.additionalProperties)
                        }

                        /**
                         * A life-cycle identifier used across e.g., an authorization and a
                         * reversal. Expected to be unique per acquirer within a window of time. For
                         * some card networks the retrieval reference number includes the trace
                         * counter.
                         */
                        fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                            retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

                        /**
                         * A life-cycle identifier used across e.g., an authorization and a
                         * reversal. Expected to be unique per acquirer within a window of time. For
                         * some card networks the retrieval reference number includes the trace
                         * counter.
                         */
                        @JsonProperty("retrieval_reference_number")
                        @ExcludeMissing
                        fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                            apply {
                                this.retrievalReferenceNumber = retrievalReferenceNumber
                            }

                        /**
                         * A counter used to verify an individual authorization. Expected to be
                         * unique per acquirer within a window of time.
                         */
                        fun traceNumber(traceNumber: String) =
                            traceNumber(JsonField.of(traceNumber))

                        /**
                         * A counter used to verify an individual authorization. Expected to be
                         * unique per acquirer within a window of time.
                         */
                        @JsonProperty("trace_number")
                        @ExcludeMissing
                        fun traceNumber(traceNumber: JsonField<String>) = apply {
                            this.traceNumber = traceNumber
                        }

                        /**
                         * A globally unique transaction identifier provided by the card network,
                         * used across multiple life-cycle requests.
                         */
                        fun transactionId(transactionId: String) =
                            transactionId(JsonField.of(transactionId))

                        /**
                         * A globally unique transaction identifier provided by the card network,
                         * used across multiple life-cycle requests.
                         */
                        @JsonProperty("transaction_id")
                        @ExcludeMissing
                        fun transactionId(transactionId: JsonField<String>) = apply {
                            this.transactionId = transactionId
                        }

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

                        fun build(): NetworkIdentifiers =
                            NetworkIdentifiers(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class ProcessingCategory
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProcessingCategory && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ACCOUNT_FUNDING = ProcessingCategory(JsonField.of("account_funding"))

                        val AUTOMATIC_FUEL_DISPENSER =
                            ProcessingCategory(JsonField.of("automatic_fuel_dispenser"))

                        val BILL_PAYMENT = ProcessingCategory(JsonField.of("bill_payment"))

                        val PURCHASE = ProcessingCategory(JsonField.of("purchase"))

                        val QUASI_CASH = ProcessingCategory(JsonField.of("quasi_cash"))

                        val REFUND = ProcessingCategory(JsonField.of("refund"))

                        fun of(value: String) = ProcessingCategory(JsonField.of(value))
                    }

                    enum class Known {
                        ACCOUNT_FUNDING,
                        AUTOMATIC_FUEL_DISPENSER,
                        BILL_PAYMENT,
                        PURCHASE,
                        QUASI_CASH,
                        REFUND,
                    }

                    enum class Value {
                        ACCOUNT_FUNDING,
                        AUTOMATIC_FUEL_DISPENSER,
                        BILL_PAYMENT,
                        PURCHASE,
                        QUASI_CASH,
                        REFUND,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                            AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                            BILL_PAYMENT -> Value.BILL_PAYMENT
                            PURCHASE -> Value.PURCHASE
                            QUASI_CASH -> Value.QUASI_CASH
                            REFUND -> Value.REFUND
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                            AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                            BILL_PAYMENT -> Known.BILL_PAYMENT
                            PURCHASE -> Known.PURCHASE
                            QUASI_CASH -> Known.QUASI_CASH
                            REFUND -> Known.REFUND
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ProcessingCategory: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        val PHYSICAL_CARD_NOT_ACTIVE =
                            Reason(JsonField.of("physical_card_not_active"))

                        val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                        val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

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

                /** Fields related to verification of cardholder-provided values. */
                @JsonDeserialize(builder = Verification.Builder::class)
                @NoAutoDetect
                class Verification
                private constructor(
                    private val cardVerificationCode: JsonField<CardVerificationCode>,
                    private val cardholderAddress: JsonField<CardholderAddress>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(): CardVerificationCode =
                        cardVerificationCode.getRequired("card_verification_code")

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(): CardholderAddress =
                        cardholderAddress.getRequired("cardholder_address")

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    fun _cardVerificationCode() = cardVerificationCode

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun _cardholderAddress() = cardholderAddress

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Verification = apply {
                        if (!validated) {
                            cardVerificationCode().validate()
                            cardholderAddress().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Verification &&
                            this.cardVerificationCode == other.cardVerificationCode &&
                            this.cardholderAddress == other.cardholderAddress &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    cardVerificationCode,
                                    cardholderAddress,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var cardVerificationCode: JsonField<CardVerificationCode> =
                            JsonMissing.of()
                        private var cardholderAddress: JsonField<CardholderAddress> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(verification: Verification) = apply {
                            this.cardVerificationCode = verification.cardVerificationCode
                            this.cardholderAddress = verification.cardholderAddress
                            additionalProperties(verification.additionalProperties)
                        }

                        /**
                         * Fields related to verification of the Card Verification Code, a 3-digit
                         * code on the back of the card.
                         */
                        fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                            cardVerificationCode(JsonField.of(cardVerificationCode))

                        /**
                         * Fields related to verification of the Card Verification Code, a 3-digit
                         * code on the back of the card.
                         */
                        @JsonProperty("card_verification_code")
                        @ExcludeMissing
                        fun cardVerificationCode(
                            cardVerificationCode: JsonField<CardVerificationCode>
                        ) = apply { this.cardVerificationCode = cardVerificationCode }

                        /**
                         * Cardholder address provided in the authorization request and the address
                         * on file we verified it against.
                         */
                        fun cardholderAddress(cardholderAddress: CardholderAddress) =
                            cardholderAddress(JsonField.of(cardholderAddress))

                        /**
                         * Cardholder address provided in the authorization request and the address
                         * on file we verified it against.
                         */
                        @JsonProperty("cardholder_address")
                        @ExcludeMissing
                        fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) =
                            apply {
                                this.cardholderAddress = cardholderAddress
                            }

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

                        fun build(): Verification =
                            Verification(
                                cardVerificationCode,
                                cardholderAddress,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonDeserialize(builder = CardVerificationCode.Builder::class)
                    @NoAutoDetect
                    class CardVerificationCode
                    private constructor(
                        private val result: JsonField<Result>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** The result of verifying the Card Verification Code. */
                        fun result(): Result = result.getRequired("result")

                        /** The result of verifying the Card Verification Code. */
                        @JsonProperty("result") @ExcludeMissing fun _result() = result

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): CardVerificationCode = apply {
                            if (!validated) {
                                result()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CardVerificationCode &&
                                this.result == other.result &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(result, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var result: JsonField<Result> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                                this.result = cardVerificationCode.result
                                additionalProperties(cardVerificationCode.additionalProperties)
                            }

                            /** The result of verifying the Card Verification Code. */
                            fun result(result: Result) = result(JsonField.of(result))

                            /** The result of verifying the Card Verification Code. */
                            @JsonProperty("result")
                            @ExcludeMissing
                            fun result(result: JsonField<Result>) = apply { this.result = result }

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

                            fun build(): CardVerificationCode =
                                CardVerificationCode(result, additionalProperties.toUnmodifiable())
                        }

                        class Result
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Result && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NOT_CHECKED = Result(JsonField.of("not_checked"))

                                val MATCH = Result(JsonField.of("match"))

                                val NO_MATCH = Result(JsonField.of("no_match"))

                                fun of(value: String) = Result(JsonField.of(value))
                            }

                            enum class Known {
                                NOT_CHECKED,
                                MATCH,
                                NO_MATCH,
                            }

                            enum class Value {
                                NOT_CHECKED,
                                MATCH,
                                NO_MATCH,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NOT_CHECKED -> Value.NOT_CHECKED
                                    MATCH -> Value.MATCH
                                    NO_MATCH -> Value.NO_MATCH
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NOT_CHECKED -> Known.NOT_CHECKED
                                    MATCH -> Known.MATCH
                                    NO_MATCH -> Known.NO_MATCH
                                    else ->
                                        throw IncreaseInvalidDataException("Unknown Result: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonDeserialize(builder = CardholderAddress.Builder::class)
                    @NoAutoDetect
                    class CardholderAddress
                    private constructor(
                        private val actualLine1: JsonField<String>,
                        private val actualPostalCode: JsonField<String>,
                        private val providedLine1: JsonField<String>,
                        private val providedPostalCode: JsonField<String>,
                        private val result: JsonField<Result>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(): String? =
                            actualPostalCode.getNullable("actual_postal_code")

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(): String? =
                            providedPostalCode.getNullable("provided_postal_code")

                        /** The address verification result returned to the card network. */
                        fun result(): Result = result.getRequired("result")

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun _actualLine1() = actualLine1

                        /** The postal code of the address on file for the cardholder. */
                        @JsonProperty("actual_postal_code")
                        @ExcludeMissing
                        fun _actualPostalCode() = actualPostalCode

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun _providedLine1() = providedLine1

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun _providedPostalCode() = providedPostalCode

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result") @ExcludeMissing fun _result() = result

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): CardholderAddress = apply {
                            if (!validated) {
                                actualLine1()
                                actualPostalCode()
                                providedLine1()
                                providedPostalCode()
                                result()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CardholderAddress &&
                                this.actualLine1 == other.actualLine1 &&
                                this.actualPostalCode == other.actualPostalCode &&
                                this.providedLine1 == other.providedLine1 &&
                                this.providedPostalCode == other.providedPostalCode &&
                                this.result == other.result &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        actualLine1,
                                        actualPostalCode,
                                        providedLine1,
                                        providedPostalCode,
                                        result,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var actualLine1: JsonField<String> = JsonMissing.of()
                            private var actualPostalCode: JsonField<String> = JsonMissing.of()
                            private var providedLine1: JsonField<String> = JsonMissing.of()
                            private var providedPostalCode: JsonField<String> = JsonMissing.of()
                            private var result: JsonField<Result> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cardholderAddress: CardholderAddress) = apply {
                                this.actualLine1 = cardholderAddress.actualLine1
                                this.actualPostalCode = cardholderAddress.actualPostalCode
                                this.providedLine1 = cardholderAddress.providedLine1
                                this.providedPostalCode = cardholderAddress.providedPostalCode
                                this.result = cardholderAddress.result
                                additionalProperties(cardholderAddress.additionalProperties)
                            }

                            /** Line 1 of the address on file for the cardholder. */
                            fun actualLine1(actualLine1: String) =
                                actualLine1(JsonField.of(actualLine1))

                            /** Line 1 of the address on file for the cardholder. */
                            @JsonProperty("actual_line1")
                            @ExcludeMissing
                            fun actualLine1(actualLine1: JsonField<String>) = apply {
                                this.actualLine1 = actualLine1
                            }

                            /** The postal code of the address on file for the cardholder. */
                            fun actualPostalCode(actualPostalCode: String) =
                                actualPostalCode(JsonField.of(actualPostalCode))

                            /** The postal code of the address on file for the cardholder. */
                            @JsonProperty("actual_postal_code")
                            @ExcludeMissing
                            fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                                this.actualPostalCode = actualPostalCode
                            }

                            /**
                             * The cardholder address line 1 provided for verification in the
                             * authorization request.
                             */
                            fun providedLine1(providedLine1: String) =
                                providedLine1(JsonField.of(providedLine1))

                            /**
                             * The cardholder address line 1 provided for verification in the
                             * authorization request.
                             */
                            @JsonProperty("provided_line1")
                            @ExcludeMissing
                            fun providedLine1(providedLine1: JsonField<String>) = apply {
                                this.providedLine1 = providedLine1
                            }

                            /**
                             * The postal code provided for verification in the authorization
                             * request.
                             */
                            fun providedPostalCode(providedPostalCode: String) =
                                providedPostalCode(JsonField.of(providedPostalCode))

                            /**
                             * The postal code provided for verification in the authorization
                             * request.
                             */
                            @JsonProperty("provided_postal_code")
                            @ExcludeMissing
                            fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                                this.providedPostalCode = providedPostalCode
                            }

                            /** The address verification result returned to the card network. */
                            fun result(result: Result) = result(JsonField.of(result))

                            /** The address verification result returned to the card network. */
                            @JsonProperty("result")
                            @ExcludeMissing
                            fun result(result: JsonField<Result>) = apply { this.result = result }

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

                            fun build(): CardholderAddress =
                                CardholderAddress(
                                    actualLine1,
                                    actualPostalCode,
                                    providedLine1,
                                    providedPostalCode,
                                    result,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Result
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Result && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NOT_CHECKED = Result(JsonField.of("not_checked"))

                                val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                    Result(JsonField.of("postal_code_match_address_not_checked"))

                                val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                    Result(JsonField.of("postal_code_match_address_no_match"))

                                val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                    Result(JsonField.of("postal_code_no_match_address_match"))

                                val MATCH = Result(JsonField.of("match"))

                                val NO_MATCH = Result(JsonField.of("no_match"))

                                fun of(value: String) = Result(JsonField.of(value))
                            }

                            enum class Known {
                                NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                                MATCH,
                                NO_MATCH,
                            }

                            enum class Value {
                                NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                                MATCH,
                                NO_MATCH,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NOT_CHECKED -> Value.NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                        Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                        Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                    POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                        Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                    MATCH -> Value.MATCH
                                    NO_MATCH -> Value.NO_MATCH
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NOT_CHECKED -> Known.NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                        Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                        Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                    POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                        Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                    MATCH -> Known.MATCH
                                    NO_MATCH -> Known.NO_MATCH
                                    else ->
                                        throw IncreaseInvalidDataException("Unknown Result: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val INTERNATIONAL_ACH_DECLINE =
                        Category(JsonField.of("international_ach_decline"))

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
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonDeserialize(builder = CheckDecline.Builder::class)
            @NoAutoDetect
            class CheckDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val auxiliaryOnUs: JsonField<String>,
                private val backImageFileId: JsonField<String>,
                private val checkTransferId: JsonField<String>,
                private val frontImageFileId: JsonField<String>,
                private val inboundCheckDepositId: JsonField<String>,
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

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                fun auxiliaryOnUs(): String? = auxiliaryOnUs.getNullable("auxiliary_on_us")

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

                /** The identifier of the Check Transfer object associated with this decline. */
                fun checkTransferId(): String? = checkTransferId.getNullable("check_transfer_id")

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                fun frontImageFileId(): String? =
                    frontImageFileId.getNullable("front_image_file_id")

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                fun inboundCheckDepositId(): String? =
                    inboundCheckDepositId.getNullable("inbound_check_deposit_id")

                /** Why the check was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun _auxiliaryOnUs() = auxiliaryOnUs

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun _backImageFileId() = backImageFileId

                /** The identifier of the Check Transfer object associated with this decline. */
                @JsonProperty("check_transfer_id")
                @ExcludeMissing
                fun _checkTransferId() = checkTransferId

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun _frontImageFileId() = frontImageFileId

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                @JsonProperty("inbound_check_deposit_id")
                @ExcludeMissing
                fun _inboundCheckDepositId() = inboundCheckDepositId

                /** Why the check was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CheckDecline = apply {
                    if (!validated) {
                        amount()
                        auxiliaryOnUs()
                        backImageFileId()
                        checkTransferId()
                        frontImageFileId()
                        inboundCheckDepositId()
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
                        this.backImageFileId == other.backImageFileId &&
                        this.checkTransferId == other.checkTransferId &&
                        this.frontImageFileId == other.frontImageFileId &&
                        this.inboundCheckDepositId == other.inboundCheckDepositId &&
                        this.reason == other.reason &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                auxiliaryOnUs,
                                backImageFileId,
                                checkTransferId,
                                frontImageFileId,
                                inboundCheckDepositId,
                                reason,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, backImageFileId=$backImageFileId, checkTransferId=$checkTransferId, frontImageFileId=$frontImageFileId, inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                    private var backImageFileId: JsonField<String> = JsonMissing.of()
                    private var checkTransferId: JsonField<String> = JsonMissing.of()
                    private var frontImageFileId: JsonField<String> = JsonMissing.of()
                    private var inboundCheckDepositId: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(checkDecline: CheckDecline) = apply {
                        this.amount = checkDecline.amount
                        this.auxiliaryOnUs = checkDecline.auxiliaryOnUs
                        this.backImageFileId = checkDecline.backImageFileId
                        this.checkTransferId = checkDecline.checkTransferId
                        this.frontImageFileId = checkDecline.frontImageFileId
                        this.inboundCheckDepositId = checkDecline.inboundCheckDepositId
                        this.reason = checkDecline.reason
                        additionalProperties(checkDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * A computer-readable number printed on the MICR line of business checks,
                     * usually the check number. This is useful for positive pay checks, but can be
                     * unreliably transmitted by the bank of first deposit.
                     */
                    fun auxiliaryOnUs(auxiliaryOnUs: String) =
                        auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                    /**
                     * A computer-readable number printed on the MICR line of business checks,
                     * usually the check number. This is useful for positive pay checks, but can be
                     * unreliably transmitted by the bank of first deposit.
                     */
                    @JsonProperty("auxiliary_on_us")
                    @ExcludeMissing
                    fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                        this.auxiliaryOnUs = auxiliaryOnUs
                    }

                    /**
                     * The identifier of the API File object containing an image of the back of the
                     * declined check.
                     */
                    fun backImageFileId(backImageFileId: String) =
                        backImageFileId(JsonField.of(backImageFileId))

                    /**
                     * The identifier of the API File object containing an image of the back of the
                     * declined check.
                     */
                    @JsonProperty("back_image_file_id")
                    @ExcludeMissing
                    fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                        this.backImageFileId = backImageFileId
                    }

                    /** The identifier of the Check Transfer object associated with this decline. */
                    fun checkTransferId(checkTransferId: String) =
                        checkTransferId(JsonField.of(checkTransferId))

                    /** The identifier of the Check Transfer object associated with this decline. */
                    @JsonProperty("check_transfer_id")
                    @ExcludeMissing
                    fun checkTransferId(checkTransferId: JsonField<String>) = apply {
                        this.checkTransferId = checkTransferId
                    }

                    /**
                     * The identifier of the API File object containing an image of the front of the
                     * declined check.
                     */
                    fun frontImageFileId(frontImageFileId: String) =
                        frontImageFileId(JsonField.of(frontImageFileId))

                    /**
                     * The identifier of the API File object containing an image of the front of the
                     * declined check.
                     */
                    @JsonProperty("front_image_file_id")
                    @ExcludeMissing
                    fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                        this.frontImageFileId = frontImageFileId
                    }

                    /**
                     * The identifier of the Inbound Check Deposit object associated with this
                     * decline.
                     */
                    fun inboundCheckDepositId(inboundCheckDepositId: String) =
                        inboundCheckDepositId(JsonField.of(inboundCheckDepositId))

                    /**
                     * The identifier of the Inbound Check Deposit object associated with this
                     * decline.
                     */
                    @JsonProperty("inbound_check_deposit_id")
                    @ExcludeMissing
                    fun inboundCheckDepositId(inboundCheckDepositId: JsonField<String>) = apply {
                        this.inboundCheckDepositId = inboundCheckDepositId
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
                            backImageFileId,
                            checkTransferId,
                            frontImageFileId,
                            inboundCheckDepositId,
                            reason,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                        val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                        val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

                        val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                        val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                        val STOP_PAYMENT_REQUESTED = Reason(JsonField.of("stop_payment_requested"))

                        val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                        val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                        val AMOUNT_MISMATCH = Reason(JsonField.of("amount_mismatch"))

                        val NOT_OUR_ITEM = Reason(JsonField.of("not_our_item"))

                        val NO_ACCOUNT_NUMBER_FOUND =
                            Reason(JsonField.of("no_account_number_found"))

                        val REFER_TO_IMAGE = Reason(JsonField.of("refer_to_image"))

                        val UNABLE_TO_PROCESS = Reason(JsonField.of("unable_to_process"))

                        val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                        fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        ACH_ROUTE_DISABLED,
                        ACH_ROUTE_CANCELED,
                        ALTERED_OR_FICTITIOUS,
                        BREACHES_LIMIT,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        STOP_PAYMENT_REQUESTED,
                        DUPLICATE_PRESENTMENT,
                        NOT_AUTHORIZED,
                        AMOUNT_MISMATCH,
                        NOT_OUR_ITEM,
                        NO_ACCOUNT_NUMBER_FOUND,
                        REFER_TO_IMAGE,
                        UNABLE_TO_PROCESS,
                        USER_INITIATED,
                    }

                    enum class Value {
                        ACH_ROUTE_DISABLED,
                        ACH_ROUTE_CANCELED,
                        ALTERED_OR_FICTITIOUS,
                        BREACHES_LIMIT,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        STOP_PAYMENT_REQUESTED,
                        DUPLICATE_PRESENTMENT,
                        NOT_AUTHORIZED,
                        AMOUNT_MISMATCH,
                        NOT_OUR_ITEM,
                        NO_ACCOUNT_NUMBER_FOUND,
                        REFER_TO_IMAGE,
                        UNABLE_TO_PROCESS,
                        USER_INITIATED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                            ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                            ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                            BREACHES_LIMIT -> Value.BREACHES_LIMIT
                            ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Value.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                            STOP_PAYMENT_REQUESTED -> Value.STOP_PAYMENT_REQUESTED
                            DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                            NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                            AMOUNT_MISMATCH -> Value.AMOUNT_MISMATCH
                            NOT_OUR_ITEM -> Value.NOT_OUR_ITEM
                            NO_ACCOUNT_NUMBER_FOUND -> Value.NO_ACCOUNT_NUMBER_FOUND
                            REFER_TO_IMAGE -> Value.REFER_TO_IMAGE
                            UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                            USER_INITIATED -> Value.USER_INITIATED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                            ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                            ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                            BREACHES_LIMIT -> Known.BREACHES_LIMIT
                            ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Known.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                            STOP_PAYMENT_REQUESTED -> Known.STOP_PAYMENT_REQUESTED
                            DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                            NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                            AMOUNT_MISMATCH -> Known.AMOUNT_MISMATCH
                            NOT_OUR_ITEM -> Known.NOT_OUR_ITEM
                            NO_ACCOUNT_NUMBER_FOUND -> Known.NO_ACCOUNT_NUMBER_FOUND
                            REFER_TO_IMAGE -> Known.REFER_TO_IMAGE
                            UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                            USER_INITIATED -> Known.USER_INITIATED
                            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonDeserialize(builder = InboundRealTimePaymentsTransferDecline.Builder::class)
            @NoAutoDetect
            class InboundRealTimePaymentsTransferDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val creditorName: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val debtorAccountNumber: JsonField<String>,
                private val debtorName: JsonField<String>,
                private val debtorRoutingNumber: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val remittanceInformation: JsonField<String>,
                private val transactionIdentification: JsonField<String>,
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
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(): String = creditorName.getRequired("creditor_name")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(): String =
                    debtorAccountNumber.getRequired("debtor_account_number")

                /** The name provided by the sender of the transfer. */
                fun debtorName(): String = debtorName.getRequired("debtor_name")

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(): String =
                    debtorRoutingNumber.getRequired("debtor_routing_number")

                /** Why the transfer was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /** Additional information included with the transfer. */
                fun remittanceInformation(): String? =
                    remittanceInformation.getNullable("remittance_information")

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(): String =
                    transactionIdentification.getRequired("transaction_identification")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun _debtorAccountNumber() = debtorAccountNumber

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun _debtorRoutingNumber() = debtorRoutingNumber

                /** Why the transfer was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun _remittanceInformation() = remittanceInformation

                /** The Real-Time Payments network identification of the declined transfer. */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                fun _transactionIdentification() = transactionIdentification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InboundRealTimePaymentsTransferDecline = apply {
                    if (!validated) {
                        amount()
                        creditorName()
                        currency()
                        debtorAccountNumber()
                        debtorName()
                        debtorRoutingNumber()
                        reason()
                        remittanceInformation()
                        transactionIdentification()
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
                        this.creditorName == other.creditorName &&
                        this.currency == other.currency &&
                        this.debtorAccountNumber == other.debtorAccountNumber &&
                        this.debtorName == other.debtorName &&
                        this.debtorRoutingNumber == other.debtorRoutingNumber &&
                        this.reason == other.reason &&
                        this.remittanceInformation == other.remittanceInformation &&
                        this.transactionIdentification == other.transactionIdentification &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                creditorName,
                                currency,
                                debtorAccountNumber,
                                debtorName,
                                debtorRoutingNumber,
                                reason,
                                remittanceInformation,
                                transactionIdentification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundRealTimePaymentsTransferDecline{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, reason=$reason, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var creditorName: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                    private var debtorName: JsonField<String> = JsonMissing.of()
                    private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var remittanceInformation: JsonField<String> = JsonMissing.of()
                    private var transactionIdentification: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        inboundRealTimePaymentsTransferDecline:
                            InboundRealTimePaymentsTransferDecline
                    ) = apply {
                        this.amount = inboundRealTimePaymentsTransferDecline.amount
                        this.creditorName = inboundRealTimePaymentsTransferDecline.creditorName
                        this.currency = inboundRealTimePaymentsTransferDecline.currency
                        this.debtorAccountNumber =
                            inboundRealTimePaymentsTransferDecline.debtorAccountNumber
                        this.debtorName = inboundRealTimePaymentsTransferDecline.debtorName
                        this.debtorRoutingNumber =
                            inboundRealTimePaymentsTransferDecline.debtorRoutingNumber
                        this.reason = inboundRealTimePaymentsTransferDecline.reason
                        this.remittanceInformation =
                            inboundRealTimePaymentsTransferDecline.remittanceInformation
                        this.transactionIdentification =
                            inboundRealTimePaymentsTransferDecline.transactionIdentification
                        additionalProperties(
                            inboundRealTimePaymentsTransferDecline.additionalProperties
                        )
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    fun creditorName(creditorName: String) =
                        creditorName(JsonField.of(creditorName))

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    @JsonProperty("creditor_name")
                    @ExcludeMissing
                    fun creditorName(creditorName: JsonField<String>) = apply {
                        this.creditorName = creditorName
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                     * transfer's currency. This will always be "USD" for a Real-Time Payments
                     * transfer.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                     * transfer's currency. This will always be "USD" for a Real-Time Payments
                     * transfer.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The account number of the account that sent the transfer. */
                    fun debtorAccountNumber(debtorAccountNumber: String) =
                        debtorAccountNumber(JsonField.of(debtorAccountNumber))

                    /** The account number of the account that sent the transfer. */
                    @JsonProperty("debtor_account_number")
                    @ExcludeMissing
                    fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                        this.debtorAccountNumber = debtorAccountNumber
                    }

                    /** The name provided by the sender of the transfer. */
                    fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                    /** The name provided by the sender of the transfer. */
                    @JsonProperty("debtor_name")
                    @ExcludeMissing
                    fun debtorName(debtorName: JsonField<String>) = apply {
                        this.debtorName = debtorName
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

                    /** Why the transfer was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the transfer was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    /** Additional information included with the transfer. */
                    fun remittanceInformation(remittanceInformation: String) =
                        remittanceInformation(JsonField.of(remittanceInformation))

                    /** Additional information included with the transfer. */
                    @JsonProperty("remittance_information")
                    @ExcludeMissing
                    fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                        this.remittanceInformation = remittanceInformation
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
                            creditorName,
                            currency,
                            debtorAccountNumber,
                            debtorName,
                            debtorRoutingNumber,
                            reason,
                            remittanceInformation,
                            transactionIdentification,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ACCOUNT_NUMBER_CANCELED =
                            Reason(JsonField.of("account_number_canceled"))

                        val ACCOUNT_NUMBER_DISABLED =
                            Reason(JsonField.of("account_number_disabled"))

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
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonDeserialize(builder = InternationalAchDecline.Builder::class)
            @NoAutoDetect
            class InternationalAchDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val destinationCountryCode: JsonField<String>,
                private val destinationCurrencyCode: JsonField<String>,
                private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
                private val foreignExchangeReference: JsonField<String>,
                private val foreignExchangeReferenceIndicator:
                    JsonField<ForeignExchangeReferenceIndicator>,
                private val foreignPaymentAmount: JsonField<Long>,
                private val foreignTraceNumber: JsonField<String>,
                private val internationalTransactionTypeCode:
                    JsonField<InternationalTransactionTypeCode>,
                private val originatingCurrencyCode: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String>,
                private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>,
                private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
                private val originatorCity: JsonField<String>,
                private val originatorCompanyEntryDescription: JsonField<String>,
                private val originatorCountry: JsonField<String>,
                private val originatorIdentification: JsonField<String>,
                private val originatorName: JsonField<String>,
                private val originatorPostalCode: JsonField<String>,
                private val originatorStateOrProvince: JsonField<String>,
                private val originatorStreetAddress: JsonField<String>,
                private val paymentRelatedInformation: JsonField<String>,
                private val paymentRelatedInformation2: JsonField<String>,
                private val receiverCity: JsonField<String>,
                private val receiverCountry: JsonField<String>,
                private val receiverIdentificationNumber: JsonField<String>,
                private val receiverPostalCode: JsonField<String>,
                private val receiverStateOrProvince: JsonField<String>,
                private val receiverStreetAddress: JsonField<String>,
                private val receivingCompanyOrIndividualName: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>,
                private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
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

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the destination country.
                 */
                fun destinationCountryCode(): String =
                    destinationCountryCode.getRequired("destination_country_code")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * destination bank account.
                 */
                fun destinationCurrencyCode(): String =
                    destinationCurrencyCode.getRequired("destination_currency_code")

                /** A description of how the foreign exchange rate was calculated. */
                fun foreignExchangeIndicator(): ForeignExchangeIndicator =
                    foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

                /**
                 * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
                 * reference to a well-known rate.
                 */
                fun foreignExchangeReference(): String? =
                    foreignExchangeReference.getNullable("foreign_exchange_reference")

                /**
                 * An instruction of how to interpret the `foreign_exchange_reference` field for
                 * this Transaction.
                 */
                fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator =
                    foreignExchangeReferenceIndicator.getRequired(
                        "foreign_exchange_reference_indicator"
                    )

                /**
                 * The amount in the minor unit of the foreign payment currency. For dollars, for
                 * example, this is cents.
                 */
                fun foreignPaymentAmount(): Long =
                    foreignPaymentAmount.getRequired("foreign_payment_amount")

                /** A reference number in the foreign banking infrastructure. */
                fun foreignTraceNumber(): String? =
                    foreignTraceNumber.getNullable("foreign_trace_number")

                /** The type of transfer. Set by the originator. */
                fun internationalTransactionTypeCode(): InternationalTransactionTypeCode =
                    internationalTransactionTypeCode.getRequired(
                        "international_transaction_type_code"
                    )

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * originating bank account.
                 */
                fun originatingCurrencyCode(): String =
                    originatingCurrencyCode.getRequired("originating_currency_code")

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originating branch country.
                 */
                fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                    originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                        "originating_depository_financial_institution_branch_country"
                    )

                /**
                 * An identifier for the originating bank. One of an International Bank Account
                 * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                 * domestic identifier like a US Routing Number.
                 */
                fun originatingDepositoryFinancialInstitutionId(): String =
                    originatingDepositoryFinancialInstitutionId.getRequired(
                        "originating_depository_financial_institution_id"
                    )

                /**
                 * An instruction of how to interpret the
                 * `originating_depository_financial_institution_id` field for this Transaction.
                 */
                fun originatingDepositoryFinancialInstitutionIdQualifier():
                    OriginatingDepositoryFinancialInstitutionIdQualifier =
                    originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "originating_depository_financial_institution_id_qualifier"
                    )

                /**
                 * The name of the originating bank. Sometimes this will refer to an American bank
                 * and obscure the correspondent foreign bank.
                 */
                fun originatingDepositoryFinancialInstitutionName(): String =
                    originatingDepositoryFinancialInstitutionName.getRequired(
                        "originating_depository_financial_institution_name"
                    )

                /** A portion of the originator address. This may be incomplete. */
                fun originatorCity(): String = originatorCity.getRequired("originator_city")

                /** A description field set by the originator. */
                fun originatorCompanyEntryDescription(): String =
                    originatorCompanyEntryDescription.getRequired(
                        "originator_company_entry_description"
                    )

                /**
                 * A portion of the originator address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originator country.
                 */
                fun originatorCountry(): String =
                    originatorCountry.getRequired("originator_country")

                /**
                 * An identifier for the originating company. This is generally stable across
                 * multiple ACH transfers.
                 */
                fun originatorIdentification(): String =
                    originatorIdentification.getRequired("originator_identification")

                /** Either the name of the originator or an intermediary money transmitter. */
                fun originatorName(): String = originatorName.getRequired("originator_name")

                /** A portion of the originator address. This may be incomplete. */
                fun originatorPostalCode(): String? =
                    originatorPostalCode.getNullable("originator_postal_code")

                /** A portion of the originator address. This may be incomplete. */
                fun originatorStateOrProvince(): String? =
                    originatorStateOrProvince.getNullable("originator_state_or_province")

                /** A portion of the originator address. This may be incomplete. */
                fun originatorStreetAddress(): String =
                    originatorStreetAddress.getRequired("originator_street_address")

                /** A description field set by the originator. */
                fun paymentRelatedInformation(): String? =
                    paymentRelatedInformation.getNullable("payment_related_information")

                /** A description field set by the originator. */
                fun paymentRelatedInformation2(): String? =
                    paymentRelatedInformation2.getNullable("payment_related_information2")

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverCity(): String = receiverCity.getRequired("receiver_city")

                /**
                 * A portion of the receiver address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiver country.
                 */
                fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

                /** An identification number the originator uses for the receiver. */
                fun receiverIdentificationNumber(): String? =
                    receiverIdentificationNumber.getNullable("receiver_identification_number")

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverPostalCode(): String? =
                    receiverPostalCode.getNullable("receiver_postal_code")

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverStateOrProvince(): String? =
                    receiverStateOrProvince.getNullable("receiver_state_or_province")

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverStreetAddress(): String =
                    receiverStreetAddress.getRequired("receiver_street_address")

                /** The name of the receiver of the transfer. This is not verified by Increase. */
                fun receivingCompanyOrIndividualName(): String =
                    receivingCompanyOrIndividualName.getRequired(
                        "receiving_company_or_individual_name"
                    )

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiving bank country.
                 */
                fun receivingDepositoryFinancialInstitutionCountry(): String =
                    receivingDepositoryFinancialInstitutionCountry.getRequired(
                        "receiving_depository_financial_institution_country"
                    )

                /**
                 * An identifier for the receiving bank. One of an International Bank Account Number
                 * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
                 * identifier like a US Routing Number.
                 */
                fun receivingDepositoryFinancialInstitutionId(): String =
                    receivingDepositoryFinancialInstitutionId.getRequired(
                        "receiving_depository_financial_institution_id"
                    )

                /**
                 * An instruction of how to interpret the
                 * `receiving_depository_financial_institution_id` field for this Transaction.
                 */
                fun receivingDepositoryFinancialInstitutionIdQualifier():
                    ReceivingDepositoryFinancialInstitutionIdQualifier =
                    receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "receiving_depository_financial_institution_id_qualifier"
                    )

                /** The name of the receiving bank, as set by the sending financial institution. */
                fun receivingDepositoryFinancialInstitutionName(): String =
                    receivingDepositoryFinancialInstitutionName.getRequired(
                        "receiving_depository_financial_institution_name"
                    )

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                 */
                fun traceNumber(): String = traceNumber.getRequired("trace_number")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the destination country.
                 */
                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun _destinationCountryCode() = destinationCountryCode

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * destination bank account.
                 */
                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun _destinationCurrencyCode() = destinationCurrencyCode

                /** A description of how the foreign exchange rate was calculated. */
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun _foreignExchangeIndicator() = foreignExchangeIndicator

                /**
                 * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
                 * reference to a well-known rate.
                 */
                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun _foreignExchangeReference() = foreignExchangeReference

                /**
                 * An instruction of how to interpret the `foreign_exchange_reference` field for
                 * this Transaction.
                 */
                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

                /**
                 * The amount in the minor unit of the foreign payment currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun _foreignPaymentAmount() = foreignPaymentAmount

                /** A reference number in the foreign banking infrastructure. */
                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun _foreignTraceNumber() = foreignTraceNumber

                /** The type of transfer. Set by the originator. */
                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * originating bank account.
                 */
                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun _originatingCurrencyCode() = originatingCurrencyCode

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originating branch country.
                 */
                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                    originatingDepositoryFinancialInstitutionBranchCountry

                /**
                 * An identifier for the originating bank. One of an International Bank Account
                 * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                 * domestic identifier like a US Routing Number.
                 */
                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionId() =
                    originatingDepositoryFinancialInstitutionId

                /**
                 * An instruction of how to interpret the
                 * `originating_depository_financial_institution_id` field for this Transaction.
                 */
                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                    originatingDepositoryFinancialInstitutionIdQualifier

                /**
                 * The name of the originating bank. Sometimes this will refer to an American bank
                 * and obscure the correspondent foreign bank.
                 */
                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionName() =
                    originatingDepositoryFinancialInstitutionName

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_city")
                @ExcludeMissing
                fun _originatorCity() = originatorCity

                /** A description field set by the originator. */
                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

                /**
                 * A portion of the originator address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originator country.
                 */
                @JsonProperty("originator_country")
                @ExcludeMissing
                fun _originatorCountry() = originatorCountry

                /**
                 * An identifier for the originating company. This is generally stable across
                 * multiple ACH transfers.
                 */
                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun _originatorIdentification() = originatorIdentification

                /** Either the name of the originator or an intermediary money transmitter. */
                @JsonProperty("originator_name")
                @ExcludeMissing
                fun _originatorName() = originatorName

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun _originatorPostalCode() = originatorPostalCode

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun _originatorStateOrProvince() = originatorStateOrProvince

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun _originatorStreetAddress() = originatorStreetAddress

                /** A description field set by the originator. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                /** A description field set by the originator. */
                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun _paymentRelatedInformation2() = paymentRelatedInformation2

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

                /**
                 * A portion of the receiver address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiver country.
                 */
                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun _receiverCountry() = receiverCountry

                /** An identification number the originator uses for the receiver. */
                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun _receiverIdentificationNumber() = receiverIdentificationNumber

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun _receiverPostalCode() = receiverPostalCode

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun _receiverStateOrProvince() = receiverStateOrProvince

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun _receiverStreetAddress() = receiverStreetAddress

                /** The name of the receiver of the transfer. This is not verified by Increase. */
                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiving bank country.
                 */
                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionCountry() =
                    receivingDepositoryFinancialInstitutionCountry

                /**
                 * An identifier for the receiving bank. One of an International Bank Account Number
                 * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
                 * identifier like a US Routing Number.
                 */
                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionId() =
                    receivingDepositoryFinancialInstitutionId

                /**
                 * An instruction of how to interpret the
                 * `receiving_depository_financial_institution_id` field for this Transaction.
                 */
                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                    receivingDepositoryFinancialInstitutionIdQualifier

                /** The name of the receiving bank, as set by the sending financial institution. */
                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionName() =
                    receivingDepositoryFinancialInstitutionName

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InternationalAchDecline = apply {
                    if (!validated) {
                        amount()
                        destinationCountryCode()
                        destinationCurrencyCode()
                        foreignExchangeIndicator()
                        foreignExchangeReference()
                        foreignExchangeReferenceIndicator()
                        foreignPaymentAmount()
                        foreignTraceNumber()
                        internationalTransactionTypeCode()
                        originatingCurrencyCode()
                        originatingDepositoryFinancialInstitutionBranchCountry()
                        originatingDepositoryFinancialInstitutionId()
                        originatingDepositoryFinancialInstitutionIdQualifier()
                        originatingDepositoryFinancialInstitutionName()
                        originatorCity()
                        originatorCompanyEntryDescription()
                        originatorCountry()
                        originatorIdentification()
                        originatorName()
                        originatorPostalCode()
                        originatorStateOrProvince()
                        originatorStreetAddress()
                        paymentRelatedInformation()
                        paymentRelatedInformation2()
                        receiverCity()
                        receiverCountry()
                        receiverIdentificationNumber()
                        receiverPostalCode()
                        receiverStateOrProvince()
                        receiverStreetAddress()
                        receivingCompanyOrIndividualName()
                        receivingDepositoryFinancialInstitutionCountry()
                        receivingDepositoryFinancialInstitutionId()
                        receivingDepositoryFinancialInstitutionIdQualifier()
                        receivingDepositoryFinancialInstitutionName()
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
                        this.destinationCountryCode == other.destinationCountryCode &&
                        this.destinationCurrencyCode == other.destinationCurrencyCode &&
                        this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                        this.foreignExchangeReference == other.foreignExchangeReference &&
                        this.foreignExchangeReferenceIndicator ==
                            other.foreignExchangeReferenceIndicator &&
                        this.foreignPaymentAmount == other.foreignPaymentAmount &&
                        this.foreignTraceNumber == other.foreignTraceNumber &&
                        this.internationalTransactionTypeCode ==
                            other.internationalTransactionTypeCode &&
                        this.originatingCurrencyCode == other.originatingCurrencyCode &&
                        this.originatingDepositoryFinancialInstitutionBranchCountry ==
                            other.originatingDepositoryFinancialInstitutionBranchCountry &&
                        this.originatingDepositoryFinancialInstitutionId ==
                            other.originatingDepositoryFinancialInstitutionId &&
                        this.originatingDepositoryFinancialInstitutionIdQualifier ==
                            other.originatingDepositoryFinancialInstitutionIdQualifier &&
                        this.originatingDepositoryFinancialInstitutionName ==
                            other.originatingDepositoryFinancialInstitutionName &&
                        this.originatorCity == other.originatorCity &&
                        this.originatorCompanyEntryDescription ==
                            other.originatorCompanyEntryDescription &&
                        this.originatorCountry == other.originatorCountry &&
                        this.originatorIdentification == other.originatorIdentification &&
                        this.originatorName == other.originatorName &&
                        this.originatorPostalCode == other.originatorPostalCode &&
                        this.originatorStateOrProvince == other.originatorStateOrProvince &&
                        this.originatorStreetAddress == other.originatorStreetAddress &&
                        this.paymentRelatedInformation == other.paymentRelatedInformation &&
                        this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                        this.receiverCity == other.receiverCity &&
                        this.receiverCountry == other.receiverCountry &&
                        this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
                        this.receiverPostalCode == other.receiverPostalCode &&
                        this.receiverStateOrProvince == other.receiverStateOrProvince &&
                        this.receiverStreetAddress == other.receiverStreetAddress &&
                        this.receivingCompanyOrIndividualName ==
                            other.receivingCompanyOrIndividualName &&
                        this.receivingDepositoryFinancialInstitutionCountry ==
                            other.receivingDepositoryFinancialInstitutionCountry &&
                        this.receivingDepositoryFinancialInstitutionId ==
                            other.receivingDepositoryFinancialInstitutionId &&
                        this.receivingDepositoryFinancialInstitutionIdQualifier ==
                            other.receivingDepositoryFinancialInstitutionIdQualifier &&
                        this.receivingDepositoryFinancialInstitutionName ==
                            other.receivingDepositoryFinancialInstitutionName &&
                        this.traceNumber == other.traceNumber &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                destinationCountryCode,
                                destinationCurrencyCode,
                                foreignExchangeIndicator,
                                foreignExchangeReference,
                                foreignExchangeReferenceIndicator,
                                foreignPaymentAmount,
                                foreignTraceNumber,
                                internationalTransactionTypeCode,
                                originatingCurrencyCode,
                                originatingDepositoryFinancialInstitutionBranchCountry,
                                originatingDepositoryFinancialInstitutionId,
                                originatingDepositoryFinancialInstitutionIdQualifier,
                                originatingDepositoryFinancialInstitutionName,
                                originatorCity,
                                originatorCompanyEntryDescription,
                                originatorCountry,
                                originatorIdentification,
                                originatorName,
                                originatorPostalCode,
                                originatorStateOrProvince,
                                originatorStreetAddress,
                                paymentRelatedInformation,
                                paymentRelatedInformation2,
                                receiverCity,
                                receiverCountry,
                                receiverIdentificationNumber,
                                receiverPostalCode,
                                receiverStateOrProvince,
                                receiverStreetAddress,
                                receivingCompanyOrIndividualName,
                                receivingDepositoryFinancialInstitutionCountry,
                                receivingDepositoryFinancialInstitutionId,
                                receivingDepositoryFinancialInstitutionIdQualifier,
                                receivingDepositoryFinancialInstitutionName,
                                traceNumber,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InternationalAchDecline{amount=$amount, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReference=$foreignExchangeReference, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStateOrProvince=$originatorStateOrProvince, originatorStreetAddress=$originatorStreetAddress, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverCity=$receiverCity, receiverCountry=$receiverCountry, receiverIdentificationNumber=$receiverIdentificationNumber, receiverPostalCode=$receiverPostalCode, receiverStateOrProvince=$receiverStateOrProvince, receiverStreetAddress=$receiverStreetAddress, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                    private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                        JsonMissing.of()
                    private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                    private var foreignExchangeReferenceIndicator:
                        JsonField<ForeignExchangeReferenceIndicator> =
                        JsonMissing.of()
                    private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                    private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                    private var internationalTransactionTypeCode:
                        JsonField<InternationalTransactionTypeCode> =
                        JsonMissing.of()
                    private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionBranchCountry:
                        JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCity: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyEntryDescription: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCountry: JsonField<String> = JsonMissing.of()
                    private var originatorIdentification: JsonField<String> = JsonMissing.of()
                    private var originatorName: JsonField<String> = JsonMissing.of()
                    private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                    private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                    private var receiverCity: JsonField<String> = JsonMissing.of()
                    private var receiverCountry: JsonField<String> = JsonMissing.of()
                    private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                    private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                    private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                    private var receivingCompanyOrIndividualName: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(internationalAchDecline: InternationalAchDecline) = apply {
                        this.amount = internationalAchDecline.amount
                        this.destinationCountryCode = internationalAchDecline.destinationCountryCode
                        this.destinationCurrencyCode =
                            internationalAchDecline.destinationCurrencyCode
                        this.foreignExchangeIndicator =
                            internationalAchDecline.foreignExchangeIndicator
                        this.foreignExchangeReference =
                            internationalAchDecline.foreignExchangeReference
                        this.foreignExchangeReferenceIndicator =
                            internationalAchDecline.foreignExchangeReferenceIndicator
                        this.foreignPaymentAmount = internationalAchDecline.foreignPaymentAmount
                        this.foreignTraceNumber = internationalAchDecline.foreignTraceNumber
                        this.internationalTransactionTypeCode =
                            internationalAchDecline.internationalTransactionTypeCode
                        this.originatingCurrencyCode =
                            internationalAchDecline.originatingCurrencyCode
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            internationalAchDecline
                                .originatingDepositoryFinancialInstitutionBranchCountry
                        this.originatingDepositoryFinancialInstitutionId =
                            internationalAchDecline.originatingDepositoryFinancialInstitutionId
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            internationalAchDecline
                                .originatingDepositoryFinancialInstitutionIdQualifier
                        this.originatingDepositoryFinancialInstitutionName =
                            internationalAchDecline.originatingDepositoryFinancialInstitutionName
                        this.originatorCity = internationalAchDecline.originatorCity
                        this.originatorCompanyEntryDescription =
                            internationalAchDecline.originatorCompanyEntryDescription
                        this.originatorCountry = internationalAchDecline.originatorCountry
                        this.originatorIdentification =
                            internationalAchDecline.originatorIdentification
                        this.originatorName = internationalAchDecline.originatorName
                        this.originatorPostalCode = internationalAchDecline.originatorPostalCode
                        this.originatorStateOrProvince =
                            internationalAchDecline.originatorStateOrProvince
                        this.originatorStreetAddress =
                            internationalAchDecline.originatorStreetAddress
                        this.paymentRelatedInformation =
                            internationalAchDecline.paymentRelatedInformation
                        this.paymentRelatedInformation2 =
                            internationalAchDecline.paymentRelatedInformation2
                        this.receiverCity = internationalAchDecline.receiverCity
                        this.receiverCountry = internationalAchDecline.receiverCountry
                        this.receiverIdentificationNumber =
                            internationalAchDecline.receiverIdentificationNumber
                        this.receiverPostalCode = internationalAchDecline.receiverPostalCode
                        this.receiverStateOrProvince =
                            internationalAchDecline.receiverStateOrProvince
                        this.receiverStreetAddress = internationalAchDecline.receiverStreetAddress
                        this.receivingCompanyOrIndividualName =
                            internationalAchDecline.receivingCompanyOrIndividualName
                        this.receivingDepositoryFinancialInstitutionCountry =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionCountry
                        this.receivingDepositoryFinancialInstitutionId =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionId
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            internationalAchDecline
                                .receivingDepositoryFinancialInstitutionIdQualifier
                        this.receivingDepositoryFinancialInstitutionName =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionName
                        this.traceNumber = internationalAchDecline.traceNumber
                        additionalProperties(internationalAchDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the destination country.
                     */
                    fun destinationCountryCode(destinationCountryCode: String) =
                        destinationCountryCode(JsonField.of(destinationCountryCode))

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the destination country.
                     */
                    @JsonProperty("destination_country_code")
                    @ExcludeMissing
                    fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                        this.destinationCountryCode = destinationCountryCode
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                     * destination bank account.
                     */
                    fun destinationCurrencyCode(destinationCurrencyCode: String) =
                        destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                     * destination bank account.
                     */
                    @JsonProperty("destination_currency_code")
                    @ExcludeMissing
                    fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) =
                        apply {
                            this.destinationCurrencyCode = destinationCurrencyCode
                        }

                    /** A description of how the foreign exchange rate was calculated. */
                    fun foreignExchangeIndicator(
                        foreignExchangeIndicator: ForeignExchangeIndicator
                    ) = foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                    /** A description of how the foreign exchange rate was calculated. */
                    @JsonProperty("foreign_exchange_indicator")
                    @ExcludeMissing
                    fun foreignExchangeIndicator(
                        foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                    ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                    /**
                     * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or
                     * a reference to a well-known rate.
                     */
                    fun foreignExchangeReference(foreignExchangeReference: String) =
                        foreignExchangeReference(JsonField.of(foreignExchangeReference))

                    /**
                     * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or
                     * a reference to a well-known rate.
                     */
                    @JsonProperty("foreign_exchange_reference")
                    @ExcludeMissing
                    fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) =
                        apply {
                            this.foreignExchangeReference = foreignExchangeReference
                        }

                    /**
                     * An instruction of how to interpret the `foreign_exchange_reference` field for
                     * this Transaction.
                     */
                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator: ForeignExchangeReferenceIndicator
                    ) =
                        foreignExchangeReferenceIndicator(
                            JsonField.of(foreignExchangeReferenceIndicator)
                        )

                    /**
                     * An instruction of how to interpret the `foreign_exchange_reference` field for
                     * this Transaction.
                     */
                    @JsonProperty("foreign_exchange_reference_indicator")
                    @ExcludeMissing
                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator:
                            JsonField<ForeignExchangeReferenceIndicator>
                    ) = apply {
                        this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                    }

                    /**
                     * The amount in the minor unit of the foreign payment currency. For dollars,
                     * for example, this is cents.
                     */
                    fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                        foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                    /**
                     * The amount in the minor unit of the foreign payment currency. For dollars,
                     * for example, this is cents.
                     */
                    @JsonProperty("foreign_payment_amount")
                    @ExcludeMissing
                    fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                        this.foreignPaymentAmount = foreignPaymentAmount
                    }

                    /** A reference number in the foreign banking infrastructure. */
                    fun foreignTraceNumber(foreignTraceNumber: String) =
                        foreignTraceNumber(JsonField.of(foreignTraceNumber))

                    /** A reference number in the foreign banking infrastructure. */
                    @JsonProperty("foreign_trace_number")
                    @ExcludeMissing
                    fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                        this.foreignTraceNumber = foreignTraceNumber
                    }

                    /** The type of transfer. Set by the originator. */
                    fun internationalTransactionTypeCode(
                        internationalTransactionTypeCode: InternationalTransactionTypeCode
                    ) =
                        internationalTransactionTypeCode(
                            JsonField.of(internationalTransactionTypeCode)
                        )

                    /** The type of transfer. Set by the originator. */
                    @JsonProperty("international_transaction_type_code")
                    @ExcludeMissing
                    fun internationalTransactionTypeCode(
                        internationalTransactionTypeCode:
                            JsonField<InternationalTransactionTypeCode>
                    ) = apply {
                        this.internationalTransactionTypeCode = internationalTransactionTypeCode
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                     * originating bank account.
                     */
                    fun originatingCurrencyCode(originatingCurrencyCode: String) =
                        originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                     * originating bank account.
                     */
                    @JsonProperty("originating_currency_code")
                    @ExcludeMissing
                    fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) =
                        apply {
                            this.originatingCurrencyCode = originatingCurrencyCode
                        }

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the originating branch country.
                     */
                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: String
                    ) =
                        originatingDepositoryFinancialInstitutionBranchCountry(
                            JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                        )

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the originating branch country.
                     */
                    @JsonProperty("originating_depository_financial_institution_branch_country")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            originatingDepositoryFinancialInstitutionBranchCountry
                    }

                    /**
                     * An identifier for the originating bank. One of an International Bank Account
                     * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                     * domestic identifier like a US Routing Number.
                     */
                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: String
                    ) =
                        originatingDepositoryFinancialInstitutionId(
                            JsonField.of(originatingDepositoryFinancialInstitutionId)
                        )

                    /**
                     * An identifier for the originating bank. One of an International Bank Account
                     * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                     * domestic identifier like a US Routing Number.
                     */
                    @JsonProperty("originating_depository_financial_institution_id")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionId =
                            originatingDepositoryFinancialInstitutionId
                    }

                    /**
                     * An instruction of how to interpret the
                     * `originating_depository_financial_institution_id` field for this Transaction.
                     */
                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier:
                            OriginatingDepositoryFinancialInstitutionIdQualifier
                    ) =
                        originatingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                        )

                    /**
                     * An instruction of how to interpret the
                     * `originating_depository_financial_institution_id` field for this Transaction.
                     */
                    @JsonProperty("originating_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier:
                            JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            originatingDepositoryFinancialInstitutionIdQualifier
                    }

                    /**
                     * The name of the originating bank. Sometimes this will refer to an American
                     * bank and obscure the correspondent foreign bank.
                     */
                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: String
                    ) =
                        originatingDepositoryFinancialInstitutionName(
                            JsonField.of(originatingDepositoryFinancialInstitutionName)
                        )

                    /**
                     * The name of the originating bank. Sometimes this will refer to an American
                     * bank and obscure the correspondent foreign bank.
                     */
                    @JsonProperty("originating_depository_financial_institution_name")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionName =
                            originatingDepositoryFinancialInstitutionName
                    }

                    /** A portion of the originator address. This may be incomplete. */
                    fun originatorCity(originatorCity: String) =
                        originatorCity(JsonField.of(originatorCity))

                    /** A portion of the originator address. This may be incomplete. */
                    @JsonProperty("originator_city")
                    @ExcludeMissing
                    fun originatorCity(originatorCity: JsonField<String>) = apply {
                        this.originatorCity = originatorCity
                    }

                    /** A description field set by the originator. */
                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: String
                    ) =
                        originatorCompanyEntryDescription(
                            JsonField.of(originatorCompanyEntryDescription)
                        )

                    /** A description field set by the originator. */
                    @JsonProperty("originator_company_entry_description")
                    @ExcludeMissing
                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: JsonField<String>
                    ) = apply {
                        this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                    }

                    /**
                     * A portion of the originator address. The
                     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                     * code of the originator country.
                     */
                    fun originatorCountry(originatorCountry: String) =
                        originatorCountry(JsonField.of(originatorCountry))

                    /**
                     * A portion of the originator address. The
                     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                     * code of the originator country.
                     */
                    @JsonProperty("originator_country")
                    @ExcludeMissing
                    fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                        this.originatorCountry = originatorCountry
                    }

                    /**
                     * An identifier for the originating company. This is generally stable across
                     * multiple ACH transfers.
                     */
                    fun originatorIdentification(originatorIdentification: String) =
                        originatorIdentification(JsonField.of(originatorIdentification))

                    /**
                     * An identifier for the originating company. This is generally stable across
                     * multiple ACH transfers.
                     */
                    @JsonProperty("originator_identification")
                    @ExcludeMissing
                    fun originatorIdentification(originatorIdentification: JsonField<String>) =
                        apply {
                            this.originatorIdentification = originatorIdentification
                        }

                    /** Either the name of the originator or an intermediary money transmitter. */
                    fun originatorName(originatorName: String) =
                        originatorName(JsonField.of(originatorName))

                    /** Either the name of the originator or an intermediary money transmitter. */
                    @JsonProperty("originator_name")
                    @ExcludeMissing
                    fun originatorName(originatorName: JsonField<String>) = apply {
                        this.originatorName = originatorName
                    }

                    /** A portion of the originator address. This may be incomplete. */
                    fun originatorPostalCode(originatorPostalCode: String) =
                        originatorPostalCode(JsonField.of(originatorPostalCode))

                    /** A portion of the originator address. This may be incomplete. */
                    @JsonProperty("originator_postal_code")
                    @ExcludeMissing
                    fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                        this.originatorPostalCode = originatorPostalCode
                    }

                    /** A portion of the originator address. This may be incomplete. */
                    fun originatorStateOrProvince(originatorStateOrProvince: String) =
                        originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                    /** A portion of the originator address. This may be incomplete. */
                    @JsonProperty("originator_state_or_province")
                    @ExcludeMissing
                    fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                        apply {
                            this.originatorStateOrProvince = originatorStateOrProvince
                        }

                    /** A portion of the originator address. This may be incomplete. */
                    fun originatorStreetAddress(originatorStreetAddress: String) =
                        originatorStreetAddress(JsonField.of(originatorStreetAddress))

                    /** A portion of the originator address. This may be incomplete. */
                    @JsonProperty("originator_street_address")
                    @ExcludeMissing
                    fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) =
                        apply {
                            this.originatorStreetAddress = originatorStreetAddress
                        }

                    /** A description field set by the originator. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** A description field set by the originator. */
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    /** A description field set by the originator. */
                    fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                        paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                    /** A description field set by the originator. */
                    @JsonProperty("payment_related_information2")
                    @ExcludeMissing
                    fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation2 = paymentRelatedInformation2
                        }

                    /** A portion of the receiver address. This may be incomplete. */
                    fun receiverCity(receiverCity: String) =
                        receiverCity(JsonField.of(receiverCity))

                    /** A portion of the receiver address. This may be incomplete. */
                    @JsonProperty("receiver_city")
                    @ExcludeMissing
                    fun receiverCity(receiverCity: JsonField<String>) = apply {
                        this.receiverCity = receiverCity
                    }

                    /**
                     * A portion of the receiver address. The
                     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                     * code of the receiver country.
                     */
                    fun receiverCountry(receiverCountry: String) =
                        receiverCountry(JsonField.of(receiverCountry))

                    /**
                     * A portion of the receiver address. The
                     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                     * code of the receiver country.
                     */
                    @JsonProperty("receiver_country")
                    @ExcludeMissing
                    fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                        this.receiverCountry = receiverCountry
                    }

                    /** An identification number the originator uses for the receiver. */
                    fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                        receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                    /** An identification number the originator uses for the receiver. */
                    @JsonProperty("receiver_identification_number")
                    @ExcludeMissing
                    fun receiverIdentificationNumber(
                        receiverIdentificationNumber: JsonField<String>
                    ) = apply { this.receiverIdentificationNumber = receiverIdentificationNumber }

                    /** A portion of the receiver address. This may be incomplete. */
                    fun receiverPostalCode(receiverPostalCode: String) =
                        receiverPostalCode(JsonField.of(receiverPostalCode))

                    /** A portion of the receiver address. This may be incomplete. */
                    @JsonProperty("receiver_postal_code")
                    @ExcludeMissing
                    fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                        this.receiverPostalCode = receiverPostalCode
                    }

                    /** A portion of the receiver address. This may be incomplete. */
                    fun receiverStateOrProvince(receiverStateOrProvince: String) =
                        receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                    /** A portion of the receiver address. This may be incomplete. */
                    @JsonProperty("receiver_state_or_province")
                    @ExcludeMissing
                    fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) =
                        apply {
                            this.receiverStateOrProvince = receiverStateOrProvince
                        }

                    /** A portion of the receiver address. This may be incomplete. */
                    fun receiverStreetAddress(receiverStreetAddress: String) =
                        receiverStreetAddress(JsonField.of(receiverStreetAddress))

                    /** A portion of the receiver address. This may be incomplete. */
                    @JsonProperty("receiver_street_address")
                    @ExcludeMissing
                    fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                        this.receiverStreetAddress = receiverStreetAddress
                    }

                    /**
                     * The name of the receiver of the transfer. This is not verified by Increase.
                     */
                    fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                        receivingCompanyOrIndividualName(
                            JsonField.of(receivingCompanyOrIndividualName)
                        )

                    /**
                     * The name of the receiver of the transfer. This is not verified by Increase.
                     */
                    @JsonProperty("receiving_company_or_individual_name")
                    @ExcludeMissing
                    fun receivingCompanyOrIndividualName(
                        receivingCompanyOrIndividualName: JsonField<String>
                    ) = apply {
                        this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                    }

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the receiving bank country.
                     */
                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: String
                    ) =
                        receivingDepositoryFinancialInstitutionCountry(
                            JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                        )

                    /**
                     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
                     * country code of the receiving bank country.
                     */
                    @JsonProperty("receiving_depository_financial_institution_country")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionCountry =
                            receivingDepositoryFinancialInstitutionCountry
                    }

                    /**
                     * An identifier for the receiving bank. One of an International Bank Account
                     * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                     * domestic identifier like a US Routing Number.
                     */
                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: String
                    ) =
                        receivingDepositoryFinancialInstitutionId(
                            JsonField.of(receivingDepositoryFinancialInstitutionId)
                        )

                    /**
                     * An identifier for the receiving bank. One of an International Bank Account
                     * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                     * domestic identifier like a US Routing Number.
                     */
                    @JsonProperty("receiving_depository_financial_institution_id")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionId =
                            receivingDepositoryFinancialInstitutionId
                    }

                    /**
                     * An instruction of how to interpret the
                     * `receiving_depository_financial_institution_id` field for this Transaction.
                     */
                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier:
                            ReceivingDepositoryFinancialInstitutionIdQualifier
                    ) =
                        receivingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                        )

                    /**
                     * An instruction of how to interpret the
                     * `receiving_depository_financial_institution_id` field for this Transaction.
                     */
                    @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier:
                            JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            receivingDepositoryFinancialInstitutionIdQualifier
                    }

                    /**
                     * The name of the receiving bank, as set by the sending financial institution.
                     */
                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: String
                    ) =
                        receivingDepositoryFinancialInstitutionName(
                            JsonField.of(receivingDepositoryFinancialInstitutionName)
                        )

                    /**
                     * The name of the receiving bank, as set by the sending financial institution.
                     */
                    @JsonProperty("receiving_depository_financial_institution_name")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionName =
                            receivingDepositoryFinancialInstitutionName
                    }

                    /**
                     * A 15 digit number recorded in the Nacha file and available to both the
                     * originating and receiving bank. Along with the amount, date, and originating
                     * routing number, this can be used to identify the ACH transfer at either bank.
                     * ACH trace numbers are not unique, but are
                     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A 15 digit number recorded in the Nacha file and available to both the
                     * originating and receiving bank. Along with the amount, date, and originating
                     * routing number, this can be used to identify the ACH transfer at either bank.
                     * ACH trace numbers are not unique, but are
                     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                     */
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
                            destinationCountryCode,
                            destinationCurrencyCode,
                            foreignExchangeIndicator,
                            foreignExchangeReference,
                            foreignExchangeReferenceIndicator,
                            foreignPaymentAmount,
                            foreignTraceNumber,
                            internationalTransactionTypeCode,
                            originatingCurrencyCode,
                            originatingDepositoryFinancialInstitutionBranchCountry,
                            originatingDepositoryFinancialInstitutionId,
                            originatingDepositoryFinancialInstitutionIdQualifier,
                            originatingDepositoryFinancialInstitutionName,
                            originatorCity,
                            originatorCompanyEntryDescription,
                            originatorCountry,
                            originatorIdentification,
                            originatorName,
                            originatorPostalCode,
                            originatorStateOrProvince,
                            originatorStreetAddress,
                            paymentRelatedInformation,
                            paymentRelatedInformation2,
                            receiverCity,
                            receiverCountry,
                            receiverIdentificationNumber,
                            receiverPostalCode,
                            receiverStateOrProvince,
                            receiverStreetAddress,
                            receivingCompanyOrIndividualName,
                            receivingDepositoryFinancialInstitutionCountry,
                            receivingDepositoryFinancialInstitutionId,
                            receivingDepositoryFinancialInstitutionIdQualifier,
                            receivingDepositoryFinancialInstitutionName,
                            traceNumber,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class ForeignExchangeIndicator
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ForeignExchangeIndicator && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FIXED_TO_VARIABLE =
                            ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

                        val VARIABLE_TO_FIXED =
                            ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

                        val FIXED_TO_FIXED =
                            ForeignExchangeIndicator(JsonField.of("fixed_to_fixed"))

                        fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                    }

                    enum class Known {
                        FIXED_TO_VARIABLE,
                        VARIABLE_TO_FIXED,
                        FIXED_TO_FIXED,
                    }

                    enum class Value {
                        FIXED_TO_VARIABLE,
                        VARIABLE_TO_FIXED,
                        FIXED_TO_FIXED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                            VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                            FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                            VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                            FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ForeignExchangeIndicator: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ForeignExchangeReferenceIndicator
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ForeignExchangeReferenceIndicator &&
                            this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FOREIGN_EXCHANGE_RATE =
                            ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_rate"))

                        val FOREIGN_EXCHANGE_REFERENCE_NUMBER =
                            ForeignExchangeReferenceIndicator(
                                JsonField.of("foreign_exchange_reference_number")
                            )

                        val BLANK = ForeignExchangeReferenceIndicator(JsonField.of("blank"))

                        fun of(value: String) =
                            ForeignExchangeReferenceIndicator(JsonField.of(value))
                    }

                    enum class Known {
                        FOREIGN_EXCHANGE_RATE,
                        FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                        BLANK,
                    }

                    enum class Value {
                        FOREIGN_EXCHANGE_RATE,
                        FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                        BLANK,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                            FOREIGN_EXCHANGE_REFERENCE_NUMBER ->
                                Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                            BLANK -> Value.BLANK
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                            FOREIGN_EXCHANGE_REFERENCE_NUMBER ->
                                Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                            BLANK -> Known.BLANK
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ForeignExchangeReferenceIndicator: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class InternationalTransactionTypeCode
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InternationalTransactionTypeCode &&
                            this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUITY = InternationalTransactionTypeCode(JsonField.of("annuity"))

                        val BUSINESS_OR_COMMERCIAL =
                            InternationalTransactionTypeCode(JsonField.of("business_or_commercial"))

                        val DEPOSIT = InternationalTransactionTypeCode(JsonField.of("deposit"))

                        val LOAN = InternationalTransactionTypeCode(JsonField.of("loan"))

                        val MISCELLANEOUS =
                            InternationalTransactionTypeCode(JsonField.of("miscellaneous"))

                        val MORTGAGE = InternationalTransactionTypeCode(JsonField.of("mortgage"))

                        val PENSION = InternationalTransactionTypeCode(JsonField.of("pension"))

                        val REMITTANCE =
                            InternationalTransactionTypeCode(JsonField.of("remittance"))

                        val RENT_OR_LEASE =
                            InternationalTransactionTypeCode(JsonField.of("rent_or_lease"))

                        val SALARY_OR_PAYROLL =
                            InternationalTransactionTypeCode(JsonField.of("salary_or_payroll"))

                        val TAX = InternationalTransactionTypeCode(JsonField.of("tax"))

                        val ACCOUNTS_RECEIVABLE =
                            InternationalTransactionTypeCode(JsonField.of("accounts_receivable"))

                        val BACK_OFFICE_CONVERSION =
                            InternationalTransactionTypeCode(JsonField.of("back_office_conversion"))

                        val MACHINE_TRANSFER =
                            InternationalTransactionTypeCode(JsonField.of("machine_transfer"))

                        val POINT_OF_PURCHASE =
                            InternationalTransactionTypeCode(JsonField.of("point_of_purchase"))

                        val POINT_OF_SALE =
                            InternationalTransactionTypeCode(JsonField.of("point_of_sale"))

                        val REPRESENTED_CHECK =
                            InternationalTransactionTypeCode(JsonField.of("represented_check"))

                        val SHARED_NETWORK_TRANSACTION =
                            InternationalTransactionTypeCode(
                                JsonField.of("shared_network_transaction")
                            )

                        val TELPHONE_INITIATED =
                            InternationalTransactionTypeCode(JsonField.of("telphone_initiated"))

                        val INTERNET_INITIATED =
                            InternationalTransactionTypeCode(JsonField.of("internet_initiated"))

                        fun of(value: String) =
                            InternationalTransactionTypeCode(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUITY,
                        BUSINESS_OR_COMMERCIAL,
                        DEPOSIT,
                        LOAN,
                        MISCELLANEOUS,
                        MORTGAGE,
                        PENSION,
                        REMITTANCE,
                        RENT_OR_LEASE,
                        SALARY_OR_PAYROLL,
                        TAX,
                        ACCOUNTS_RECEIVABLE,
                        BACK_OFFICE_CONVERSION,
                        MACHINE_TRANSFER,
                        POINT_OF_PURCHASE,
                        POINT_OF_SALE,
                        REPRESENTED_CHECK,
                        SHARED_NETWORK_TRANSACTION,
                        TELPHONE_INITIATED,
                        INTERNET_INITIATED,
                    }

                    enum class Value {
                        ANNUITY,
                        BUSINESS_OR_COMMERCIAL,
                        DEPOSIT,
                        LOAN,
                        MISCELLANEOUS,
                        MORTGAGE,
                        PENSION,
                        REMITTANCE,
                        RENT_OR_LEASE,
                        SALARY_OR_PAYROLL,
                        TAX,
                        ACCOUNTS_RECEIVABLE,
                        BACK_OFFICE_CONVERSION,
                        MACHINE_TRANSFER,
                        POINT_OF_PURCHASE,
                        POINT_OF_SALE,
                        REPRESENTED_CHECK,
                        SHARED_NETWORK_TRANSACTION,
                        TELPHONE_INITIATED,
                        INTERNET_INITIATED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUITY -> Value.ANNUITY
                            BUSINESS_OR_COMMERCIAL -> Value.BUSINESS_OR_COMMERCIAL
                            DEPOSIT -> Value.DEPOSIT
                            LOAN -> Value.LOAN
                            MISCELLANEOUS -> Value.MISCELLANEOUS
                            MORTGAGE -> Value.MORTGAGE
                            PENSION -> Value.PENSION
                            REMITTANCE -> Value.REMITTANCE
                            RENT_OR_LEASE -> Value.RENT_OR_LEASE
                            SALARY_OR_PAYROLL -> Value.SALARY_OR_PAYROLL
                            TAX -> Value.TAX
                            ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                            BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                            MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                            POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                            POINT_OF_SALE -> Value.POINT_OF_SALE
                            REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                            SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                            TELPHONE_INITIATED -> Value.TELPHONE_INITIATED
                            INTERNET_INITIATED -> Value.INTERNET_INITIATED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUITY -> Known.ANNUITY
                            BUSINESS_OR_COMMERCIAL -> Known.BUSINESS_OR_COMMERCIAL
                            DEPOSIT -> Known.DEPOSIT
                            LOAN -> Known.LOAN
                            MISCELLANEOUS -> Known.MISCELLANEOUS
                            MORTGAGE -> Known.MORTGAGE
                            PENSION -> Known.PENSION
                            REMITTANCE -> Known.REMITTANCE
                            RENT_OR_LEASE -> Known.RENT_OR_LEASE
                            SALARY_OR_PAYROLL -> Known.SALARY_OR_PAYROLL
                            TAX -> Known.TAX
                            ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                            BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                            MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                            POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                            POINT_OF_SALE -> Known.POINT_OF_SALE
                            REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                            SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                            TELPHONE_INITIATED -> Known.TELPHONE_INITIATED
                            INTERNET_INITIATED -> Known.INTERNET_INITIATED
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown InternationalTransactionTypeCode: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class OriginatingDepositoryFinancialInstitutionIdQualifier
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is OriginatingDepositoryFinancialInstitutionIdQualifier &&
                            this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val NATIONAL_CLEARING_SYSTEM_NUMBER =
                            OriginatingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of("national_clearing_system_number")
                            )

                        val BIC_CODE =
                            OriginatingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of("bic_code")
                            )

                        val IBAN =
                            OriginatingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of("iban")
                            )

                        fun of(value: String) =
                            OriginatingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of(value)
                            )
                    }

                    enum class Known {
                        NATIONAL_CLEARING_SYSTEM_NUMBER,
                        BIC_CODE,
                        IBAN,
                    }

                    enum class Value {
                        NATIONAL_CLEARING_SYSTEM_NUMBER,
                        BIC_CODE,
                        IBAN,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                            BIC_CODE -> Value.BIC_CODE
                            IBAN -> Value.IBAN
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                            BIC_CODE -> Known.BIC_CODE
                            IBAN -> Known.IBAN
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ReceivingDepositoryFinancialInstitutionIdQualifier
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ReceivingDepositoryFinancialInstitutionIdQualifier &&
                            this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val NATIONAL_CLEARING_SYSTEM_NUMBER =
                            ReceivingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of("national_clearing_system_number")
                            )

                        val BIC_CODE =
                            ReceivingDepositoryFinancialInstitutionIdQualifier(
                                JsonField.of("bic_code")
                            )

                        val IBAN =
                            ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

                        fun of(value: String) =
                            ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
                    }

                    enum class Known {
                        NATIONAL_CLEARING_SYSTEM_NUMBER,
                        BIC_CODE,
                        IBAN,
                    }

                    enum class Value {
                        NATIONAL_CLEARING_SYSTEM_NUMBER,
                        BIC_CODE,
                        IBAN,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                            BIC_CODE -> Value.BIC_CODE
                            IBAN -> Value.IBAN
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                            BIC_CODE -> Known.BIC_CODE
                            IBAN -> Known.IBAN
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
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
                private val inboundWireTransferId: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The identifier of the Inbound Wire Transfer that was declined. */
                fun inboundWireTransferId(): String =
                    inboundWireTransferId.getRequired("inbound_wire_transfer_id")

                /** Why the wire transfer was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /** The identifier of the Inbound Wire Transfer that was declined. */
                @JsonProperty("inbound_wire_transfer_id")
                @ExcludeMissing
                fun _inboundWireTransferId() = inboundWireTransferId

                /** Why the wire transfer was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): WireDecline = apply {
                    if (!validated) {
                        inboundWireTransferId()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireDecline &&
                        this.inboundWireTransferId == other.inboundWireTransferId &&
                        this.reason == other.reason &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                inboundWireTransferId,
                                reason,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireDecline{inboundWireTransferId=$inboundWireTransferId, reason=$reason, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var inboundWireTransferId: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(wireDecline: WireDecline) = apply {
                        this.inboundWireTransferId = wireDecline.inboundWireTransferId
                        this.reason = wireDecline.reason
                        additionalProperties(wireDecline.additionalProperties)
                    }

                    /** The identifier of the Inbound Wire Transfer that was declined. */
                    fun inboundWireTransferId(inboundWireTransferId: String) =
                        inboundWireTransferId(JsonField.of(inboundWireTransferId))

                    /** The identifier of the Inbound Wire Transfer that was declined. */
                    @JsonProperty("inbound_wire_transfer_id")
                    @ExcludeMissing
                    fun inboundWireTransferId(inboundWireTransferId: JsonField<String>) = apply {
                        this.inboundWireTransferId = inboundWireTransferId
                    }

                    /** Why the wire transfer was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the wire transfer was declined. */
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

                    fun build(): WireDecline =
                        WireDecline(
                            inboundWireTransferId,
                            reason,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ACCOUNT_NUMBER_CANCELED =
                            Reason(JsonField.of("account_number_canceled"))

                        val ACCOUNT_NUMBER_DISABLED =
                            Reason(JsonField.of("account_number_disabled"))

                        val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        val NO_ACCOUNT_NUMBER = Reason(JsonField.of("no_account_number"))

                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

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
        ) : Enum {

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

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonDeserialize(builder = PendingTransaction.Builder::class)
    @NoAutoDetect
    class PendingTransaction
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val description: JsonField<String>,
        private val id: JsonField<String>,
        private val routeId: JsonField<String>,
        private val routeType: JsonField<RouteType>,
        private val source: JsonField<Source>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The identifier for the account this Pending Transaction belongs to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(): String = description.getRequired("description")

        /** The Pending Transaction identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(): String? = routeId.getNullable("route_id")

        /** The type of the route this Pending Transaction came through. */
        fun routeType(): RouteType? = routeType.getNullable("route_type")

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        fun source(): Source = source.getRequired("source")

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        fun status(): Status = status.getRequired("status")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
         */
        fun type(): Type = type.getRequired("type")

        /** The identifier for the account this Pending Transaction belongs to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The Pending Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

        /** The type of the route this Pending Transaction came through. */
        @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        @JsonProperty("source") @ExcludeMissing fun _source() = source

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PendingTransaction = apply {
            if (!validated) {
                accountId()
                amount()
                completedAt()
                createdAt()
                currency()
                description()
                id()
                routeId()
                routeType()
                source().validate()
                status()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PendingTransaction &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.completedAt == other.completedAt &&
                this.createdAt == other.createdAt &&
                this.currency == other.currency &&
                this.description == other.description &&
                this.id == other.id &&
                this.routeId == other.routeId &&
                this.routeType == other.routeType &&
                this.source == other.source &&
                this.status == other.status &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        amount,
                        completedAt,
                        createdAt,
                        currency,
                        description,
                        id,
                        routeId,
                        routeType,
                        source,
                        status,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PendingTransaction{accountId=$accountId, amount=$amount, completedAt=$completedAt, createdAt=$createdAt, currency=$currency, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var routeId: JsonField<String> = JsonMissing.of()
            private var routeType: JsonField<RouteType> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pendingTransaction: PendingTransaction) = apply {
                this.accountId = pendingTransaction.accountId
                this.amount = pendingTransaction.amount
                this.completedAt = pendingTransaction.completedAt
                this.createdAt = pendingTransaction.createdAt
                this.currency = pendingTransaction.currency
                this.description = pendingTransaction.description
                this.id = pendingTransaction.id
                this.routeId = pendingTransaction.routeId
                this.routeType = pendingTransaction.routeType
                this.source = pendingTransaction.source
                this.status = pendingTransaction.status
                this.type = pendingTransaction.type
                additionalProperties(pendingTransaction.additionalProperties)
            }

            /** The identifier for the account this Pending Transaction belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the account this Pending Transaction belongs to. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The Pending Transaction amount in the minor unit of its currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The Pending Transaction amount in the minor unit of its currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
             * Transaction was completed.
             */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
             * Transaction was completed.
             */
            @JsonProperty("completed_at")
            @ExcludeMissing
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
             * Transaction occurred.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
             * Transaction occurred.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending
             * Transaction's currency. This will match the currency on the Pending Transaction's
             * Account.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending
             * Transaction's currency. This will match the currency on the Pending Transaction's
             * Account.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * For a Pending Transaction related to a transfer, this is the description you provide.
             * For a Pending Transaction related to a payment, this is the description the vendor
             * provides.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * For a Pending Transaction related to a transfer, this is the description you provide.
             * For a Pending Transaction related to a payment, this is the description the vendor
             * provides.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Pending Transaction identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Pending Transaction identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The identifier for the route this Pending Transaction came through. Routes are things
             * like cards and ACH details.
             */
            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            /**
             * The identifier for the route this Pending Transaction came through. Routes are things
             * like cards and ACH details.
             */
            @JsonProperty("route_id")
            @ExcludeMissing
            fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

            /** The type of the route this Pending Transaction came through. */
            fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

            /** The type of the route this Pending Transaction came through. */
            @JsonProperty("route_type")
            @ExcludeMissing
            fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

            /**
             * This is an object giving more details on the network-level event that caused the
             * Pending Transaction. For example, for a card transaction this lists the merchant's
             * industry and location.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * This is an object giving more details on the network-level event that caused the
             * Pending Transaction. For example, for a card transaction this lists the merchant's
             * industry and location.
             */
            @JsonProperty("source")
            @ExcludeMissing
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /**
             * Whether the Pending Transaction has been confirmed and has an associated Transaction.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Whether the Pending Transaction has been confirmed and has an associated Transaction.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `pending_transaction`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `pending_transaction`.
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

            fun build(): PendingTransaction =
                PendingTransaction(
                    accountId,
                    amount,
                    completedAt,
                    createdAt,
                    currency,
                    description,
                    id,
                    routeId,
                    routeType,
                    source,
                    status,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
        ) : Enum {

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
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        @JsonDeserialize(builder = Source.Builder::class)
        @NoAutoDetect
        class Source
        private constructor(
            private val accountTransferInstruction: JsonField<AccountTransferInstruction>,
            private val achTransferInstruction: JsonField<AchTransferInstruction>,
            private val cardAuthorization: JsonField<CardAuthorization>,
            private val category: JsonField<Category>,
            private val checkDepositInstruction: JsonField<CheckDepositInstruction>,
            private val checkTransferInstruction: JsonField<CheckTransferInstruction>,
            private val inboundFundsHold: JsonField<InboundFundsHold>,
            private val realTimePaymentsTransferInstruction:
                JsonField<RealTimePaymentsTransferInstruction>,
            private val wireTransferInstruction: JsonField<WireTransferInstruction>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(): AccountTransferInstruction? =
                accountTransferInstruction.getNullable("account_transfer_instruction")

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(): AchTransferInstruction? =
                achTransferInstruction.getNullable("ach_transfer_instruction")

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(): CardAuthorization? =
                cardAuthorization.getNullable("card_authorization")

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(): Category = category.getRequired("category")

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(): CheckDepositInstruction? =
                checkDepositInstruction.getNullable("check_deposit_instruction")

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(): CheckTransferInstruction? =
                checkTransferInstruction.getNullable("check_transfer_instruction")

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            fun inboundFundsHold(): InboundFundsHold? =
                inboundFundsHold.getNullable("inbound_funds_hold")

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction(): RealTimePaymentsTransferInstruction? =
                realTimePaymentsTransferInstruction.getNullable(
                    "real_time_payments_transfer_instruction"
                )

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(): WireTransferInstruction? =
                wireTransferInstruction.getNullable("wire_transfer_instruction")

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            @JsonProperty("account_transfer_instruction")
            @ExcludeMissing
            fun _accountTransferInstruction() = accountTransferInstruction

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            @JsonProperty("ach_transfer_instruction")
            @ExcludeMissing
            fun _achTransferInstruction() = achTransferInstruction

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            @JsonProperty("check_deposit_instruction")
            @ExcludeMissing
            fun _checkDepositInstruction() = checkDepositInstruction

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            @JsonProperty("check_transfer_instruction")
            @ExcludeMissing
            fun _checkTransferInstruction() = checkTransferInstruction

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            @JsonProperty("inbound_funds_hold")
            @ExcludeMissing
            fun _inboundFundsHold() = inboundFundsHold

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            @JsonProperty("real_time_payments_transfer_instruction")
            @ExcludeMissing
            fun _realTimePaymentsTransferInstruction() = realTimePaymentsTransferInstruction

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            @JsonProperty("wire_transfer_instruction")
            @ExcludeMissing
            fun _wireTransferInstruction() = wireTransferInstruction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Source = apply {
                if (!validated) {
                    accountTransferInstruction()?.validate()
                    achTransferInstruction()?.validate()
                    cardAuthorization()?.validate()
                    category()
                    checkDepositInstruction()?.validate()
                    checkTransferInstruction()?.validate()
                    inboundFundsHold()?.validate()
                    realTimePaymentsTransferInstruction()?.validate()
                    wireTransferInstruction()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Source &&
                    this.accountTransferInstruction == other.accountTransferInstruction &&
                    this.achTransferInstruction == other.achTransferInstruction &&
                    this.cardAuthorization == other.cardAuthorization &&
                    this.category == other.category &&
                    this.checkDepositInstruction == other.checkDepositInstruction &&
                    this.checkTransferInstruction == other.checkTransferInstruction &&
                    this.inboundFundsHold == other.inboundFundsHold &&
                    this.realTimePaymentsTransferInstruction ==
                        other.realTimePaymentsTransferInstruction &&
                    this.wireTransferInstruction == other.wireTransferInstruction &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountTransferInstruction,
                            achTransferInstruction,
                            cardAuthorization,
                            category,
                            checkDepositInstruction,
                            checkTransferInstruction,
                            inboundFundsHold,
                            realTimePaymentsTransferInstruction,
                            wireTransferInstruction,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Source{accountTransferInstruction=$accountTransferInstruction, achTransferInstruction=$achTransferInstruction, cardAuthorization=$cardAuthorization, category=$category, checkDepositInstruction=$checkDepositInstruction, checkTransferInstruction=$checkTransferInstruction, inboundFundsHold=$inboundFundsHold, realTimePaymentsTransferInstruction=$realTimePaymentsTransferInstruction, wireTransferInstruction=$wireTransferInstruction, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountTransferInstruction: JsonField<AccountTransferInstruction> =
                    JsonMissing.of()
                private var achTransferInstruction: JsonField<AchTransferInstruction> =
                    JsonMissing.of()
                private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
                private var category: JsonField<Category> = JsonMissing.of()
                private var checkDepositInstruction: JsonField<CheckDepositInstruction> =
                    JsonMissing.of()
                private var checkTransferInstruction: JsonField<CheckTransferInstruction> =
                    JsonMissing.of()
                private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
                private var realTimePaymentsTransferInstruction:
                    JsonField<RealTimePaymentsTransferInstruction> =
                    JsonMissing.of()
                private var wireTransferInstruction: JsonField<WireTransferInstruction> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(source: Source) = apply {
                    this.accountTransferInstruction = source.accountTransferInstruction
                    this.achTransferInstruction = source.achTransferInstruction
                    this.cardAuthorization = source.cardAuthorization
                    this.category = source.category
                    this.checkDepositInstruction = source.checkDepositInstruction
                    this.checkTransferInstruction = source.checkTransferInstruction
                    this.inboundFundsHold = source.inboundFundsHold
                    this.realTimePaymentsTransferInstruction =
                        source.realTimePaymentsTransferInstruction
                    this.wireTransferInstruction = source.wireTransferInstruction
                    additionalProperties(source.additionalProperties)
                }

                /**
                 * An Account Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_instruction`.
                 */
                fun accountTransferInstruction(
                    accountTransferInstruction: AccountTransferInstruction
                ) = accountTransferInstruction(JsonField.of(accountTransferInstruction))

                /**
                 * An Account Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_instruction`.
                 */
                @JsonProperty("account_transfer_instruction")
                @ExcludeMissing
                fun accountTransferInstruction(
                    accountTransferInstruction: JsonField<AccountTransferInstruction>
                ) = apply { this.accountTransferInstruction = accountTransferInstruction }

                /**
                 * An ACH Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_transfer_instruction`.
                 */
                fun achTransferInstruction(achTransferInstruction: AchTransferInstruction) =
                    achTransferInstruction(JsonField.of(achTransferInstruction))

                /**
                 * An ACH Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_transfer_instruction`.
                 */
                @JsonProperty("ach_transfer_instruction")
                @ExcludeMissing
                fun achTransferInstruction(
                    achTransferInstruction: JsonField<AchTransferInstruction>
                ) = apply { this.achTransferInstruction = achTransferInstruction }

                /**
                 * A Card Authorization object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_authorization`.
                 */
                fun cardAuthorization(cardAuthorization: CardAuthorization) =
                    cardAuthorization(JsonField.of(cardAuthorization))

                /**
                 * A Card Authorization object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_authorization`.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                    this.cardAuthorization = cardAuthorization
                }

                /**
                 * The type of the resource. We may add additional possible values for this enum
                 * over time; your application should be able to handle such additions gracefully.
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of the resource. We may add additional possible values for this enum
                 * over time; your application should be able to handle such additions gracefully.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * A Check Deposit Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_instruction`.
                 */
                fun checkDepositInstruction(checkDepositInstruction: CheckDepositInstruction) =
                    checkDepositInstruction(JsonField.of(checkDepositInstruction))

                /**
                 * A Check Deposit Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_instruction`.
                 */
                @JsonProperty("check_deposit_instruction")
                @ExcludeMissing
                fun checkDepositInstruction(
                    checkDepositInstruction: JsonField<CheckDepositInstruction>
                ) = apply { this.checkDepositInstruction = checkDepositInstruction }

                /**
                 * A Check Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_instruction`.
                 */
                fun checkTransferInstruction(checkTransferInstruction: CheckTransferInstruction) =
                    checkTransferInstruction(JsonField.of(checkTransferInstruction))

                /**
                 * A Check Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_instruction`.
                 */
                @JsonProperty("check_transfer_instruction")
                @ExcludeMissing
                fun checkTransferInstruction(
                    checkTransferInstruction: JsonField<CheckTransferInstruction>
                ) = apply { this.checkTransferInstruction = checkTransferInstruction }

                /**
                 * An Inbound Funds Hold object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_funds_hold`.
                 */
                fun inboundFundsHold(inboundFundsHold: InboundFundsHold) =
                    inboundFundsHold(JsonField.of(inboundFundsHold))

                /**
                 * An Inbound Funds Hold object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_funds_hold`.
                 */
                @JsonProperty("inbound_funds_hold")
                @ExcludeMissing
                fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
                    this.inboundFundsHold = inboundFundsHold
                }

                /**
                 * A Real-Time Payments Transfer Instruction object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `real_time_payments_transfer_instruction`.
                 */
                fun realTimePaymentsTransferInstruction(
                    realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                ) =
                    realTimePaymentsTransferInstruction(
                        JsonField.of(realTimePaymentsTransferInstruction)
                    )

                /**
                 * A Real-Time Payments Transfer Instruction object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `real_time_payments_transfer_instruction`.
                 */
                @JsonProperty("real_time_payments_transfer_instruction")
                @ExcludeMissing
                fun realTimePaymentsTransferInstruction(
                    realTimePaymentsTransferInstruction:
                        JsonField<RealTimePaymentsTransferInstruction>
                ) = apply {
                    this.realTimePaymentsTransferInstruction = realTimePaymentsTransferInstruction
                }

                /**
                 * A Wire Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_transfer_instruction`.
                 */
                fun wireTransferInstruction(wireTransferInstruction: WireTransferInstruction) =
                    wireTransferInstruction(JsonField.of(wireTransferInstruction))

                /**
                 * A Wire Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_transfer_instruction`.
                 */
                @JsonProperty("wire_transfer_instruction")
                @ExcludeMissing
                fun wireTransferInstruction(
                    wireTransferInstruction: JsonField<WireTransferInstruction>
                ) = apply { this.wireTransferInstruction = wireTransferInstruction }

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

                fun build(): Source =
                    Source(
                        accountTransferInstruction,
                        achTransferInstruction,
                        cardAuthorization,
                        category,
                        checkDepositInstruction,
                        checkTransferInstruction,
                        inboundFundsHold,
                        realTimePaymentsTransferInstruction,
                        wireTransferInstruction,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            @JsonDeserialize(builder = AccountTransferInstruction.Builder::class)
            @NoAutoDetect
            class AccountTransferInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): AccountTransferInstruction = apply {
                    if (!validated) {
                        amount()
                        currency()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountTransferInstruction &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AccountTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accountTransferInstruction: AccountTransferInstruction) =
                        apply {
                            this.amount = accountTransferInstruction.amount
                            this.currency = accountTransferInstruction.currency
                            this.transferId = accountTransferInstruction.transferId
                            additionalProperties(accountTransferInstruction.additionalProperties)
                        }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * The identifier of the Account Transfer that led to this Pending Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Account Transfer that led to this Pending Transaction.
                     */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
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

                    fun build(): AccountTransferInstruction =
                        AccountTransferInstruction(
                            amount,
                            currency,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
            }

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            @JsonDeserialize(builder = AchTransferInstruction.Builder::class)
            @NoAutoDetect
            class AchTransferInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): AchTransferInstruction = apply {
                    if (!validated) {
                        amount()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchTransferInstruction &&
                        this.amount == other.amount &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(achTransferInstruction: AchTransferInstruction) = apply {
                        this.amount = achTransferInstruction.amount
                        this.transferId = achTransferInstruction.transferId
                        additionalProperties(achTransferInstruction.additionalProperties)
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
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

                    fun build(): AchTransferInstruction =
                        AchTransferInstruction(
                            amount,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonDeserialize(builder = CardAuthorization.Builder::class)
            @NoAutoDetect
            class CardAuthorization
            private constructor(
                private val actioner: JsonField<Actioner>,
                private val amount: JsonField<Long>,
                private val cardPaymentId: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val digitalWalletTokenId: JsonField<String>,
                private val direction: JsonField<Direction>,
                private val expiresAt: JsonField<OffsetDateTime>,
                private val id: JsonField<String>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val networkDetails: JsonField<NetworkDetails>,
                private val networkIdentifiers: JsonField<NetworkIdentifiers>,
                private val networkRiskScore: JsonField<Long>,
                private val pendingTransactionId: JsonField<String>,
                private val physicalCardId: JsonField<String>,
                private val presentmentAmount: JsonField<Long>,
                private val presentmentCurrency: JsonField<String>,
                private val processingCategory: JsonField<ProcessingCategory>,
                private val realTimeDecisionId: JsonField<String>,
                private val type: JsonField<Type>,
                private val verification: JsonField<Verification>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(): Actioner = actioner.getRequired("actioner")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(): String? = cardPaymentId.getNullable("card_payment_id")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(): String? =
                    digitalWalletTokenId.getNullable("digital_wallet_token_id")

                /**
                 * The direction descibes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(): Direction = direction.getRequired("direction")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

                /** The Card Authorization identifier. */
                fun id(): String = id.getRequired("id")

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(): String? =
                    merchantCategoryCode.getNullable("merchant_category_code")

                /** The city the merchant resides in. */
                fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

                /** The country the merchant resides in. */
                fun merchantCountry(): String? = merchantCountry.getNullable("merchant_country")

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                /** Fields specific to the `network`. */
                fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(): NetworkIdentifiers =
                    networkIdentifiers.getRequired("network_identifiers")

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(): String? =
                    pendingTransactionId.getNullable("pending_transaction_id")

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(): String =
                    presentmentCurrency.getRequired("presentment_currency")

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                fun processingCategory(): ProcessingCategory =
                    processingCategory.getRequired("processing_category")

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(): String? =
                    realTimeDecisionId.getNullable("real_time_decision_id")

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(): Type = type.getRequired("type")

                /** Fields related to verification of cardholder-provided values. */
                fun verification(): Verification = verification.getRequired("verification")

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun _cardPaymentId() = cardPaymentId

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                fun _digitalWalletTokenId() = digitalWalletTokenId

                /**
                 * The direction descibes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

                /** The Card Authorization identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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

                /** The merchant descriptor of the merchant the card is transacting with. */
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                /** Fields specific to the `network`. */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun _networkDetails() = networkDetails

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun _networkIdentifiers() = networkIdentifiers

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun _networkRiskScore() = networkRiskScore

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun _pendingTransactionId() = pendingTransactionId

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                fun _physicalCardId() = physicalCardId

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                fun _presentmentAmount() = presentmentAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun _presentmentCurrency() = presentmentCurrency

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                @JsonProperty("processing_category")
                @ExcludeMissing
                fun _processingCategory() = processingCategory

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun _realTimeDecisionId() = realTimeDecisionId

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardAuthorization = apply {
                    if (!validated) {
                        actioner()
                        amount()
                        cardPaymentId()
                        currency()
                        digitalWalletTokenId()
                        direction()
                        expiresAt()
                        id()
                        merchantAcceptorId()
                        merchantCategoryCode()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        networkDetails().validate()
                        networkIdentifiers().validate()
                        networkRiskScore()
                        pendingTransactionId()
                        physicalCardId()
                        presentmentAmount()
                        presentmentCurrency()
                        processingCategory()
                        realTimeDecisionId()
                        type()
                        verification().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardAuthorization &&
                        this.actioner == other.actioner &&
                        this.amount == other.amount &&
                        this.cardPaymentId == other.cardPaymentId &&
                        this.currency == other.currency &&
                        this.digitalWalletTokenId == other.digitalWalletTokenId &&
                        this.direction == other.direction &&
                        this.expiresAt == other.expiresAt &&
                        this.id == other.id &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.networkDetails == other.networkDetails &&
                        this.networkIdentifiers == other.networkIdentifiers &&
                        this.networkRiskScore == other.networkRiskScore &&
                        this.pendingTransactionId == other.pendingTransactionId &&
                        this.physicalCardId == other.physicalCardId &&
                        this.presentmentAmount == other.presentmentAmount &&
                        this.presentmentCurrency == other.presentmentCurrency &&
                        this.processingCategory == other.processingCategory &&
                        this.realTimeDecisionId == other.realTimeDecisionId &&
                        this.type == other.type &&
                        this.verification == other.verification &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                actioner,
                                amount,
                                cardPaymentId,
                                currency,
                                digitalWalletTokenId,
                                direction,
                                expiresAt,
                                id,
                                merchantAcceptorId,
                                merchantCategoryCode,
                                merchantCity,
                                merchantCountry,
                                merchantDescriptor,
                                networkDetails,
                                networkIdentifiers,
                                networkRiskScore,
                                pendingTransactionId,
                                physicalCardId,
                                presentmentAmount,
                                presentmentCurrency,
                                processingCategory,
                                realTimeDecisionId,
                                type,
                                verification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardAuthorization{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, expiresAt=$expiresAt, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var actioner: JsonField<Actioner> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var cardPaymentId: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                    private var direction: JsonField<Direction> = JsonMissing.of()
                    private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                    private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                    private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                    private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                    private var physicalCardId: JsonField<String> = JsonMissing.of()
                    private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                    private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                    private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                    private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var verification: JsonField<Verification> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cardAuthorization: CardAuthorization) = apply {
                        this.actioner = cardAuthorization.actioner
                        this.amount = cardAuthorization.amount
                        this.cardPaymentId = cardAuthorization.cardPaymentId
                        this.currency = cardAuthorization.currency
                        this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                        this.direction = cardAuthorization.direction
                        this.expiresAt = cardAuthorization.expiresAt
                        this.id = cardAuthorization.id
                        this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                        this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                        this.merchantCity = cardAuthorization.merchantCity
                        this.merchantCountry = cardAuthorization.merchantCountry
                        this.merchantDescriptor = cardAuthorization.merchantDescriptor
                        this.networkDetails = cardAuthorization.networkDetails
                        this.networkIdentifiers = cardAuthorization.networkIdentifiers
                        this.networkRiskScore = cardAuthorization.networkRiskScore
                        this.pendingTransactionId = cardAuthorization.pendingTransactionId
                        this.physicalCardId = cardAuthorization.physicalCardId
                        this.presentmentAmount = cardAuthorization.presentmentAmount
                        this.presentmentCurrency = cardAuthorization.presentmentCurrency
                        this.processingCategory = cardAuthorization.processingCategory
                        this.realTimeDecisionId = cardAuthorization.realTimeDecisionId
                        this.type = cardAuthorization.type
                        this.verification = cardAuthorization.verification
                        additionalProperties(cardAuthorization.additionalProperties)
                    }

                    /**
                     * Whether this authorization was approved by Increase, the card network through
                     * stand-in processing, or the user through a real-time decision.
                     */
                    fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                    /**
                     * Whether this authorization was approved by Increase, the card network through
                     * stand-in processing, or the user through a real-time decision.
                     */
                    @JsonProperty("actioner")
                    @ExcludeMissing
                    fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The ID of the Card Payment this transaction belongs to. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /** The ID of the Card Payment this transaction belongs to. */
                    @JsonProperty("card_payment_id")
                    @ExcludeMissing
                    fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                        this.cardPaymentId = cardPaymentId
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    fun digitalWalletTokenId(digitalWalletTokenId: String) =
                        digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                    /**
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    @JsonProperty("digital_wallet_token_id")
                    @ExcludeMissing
                    fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                        this.digitalWalletTokenId = digitalWalletTokenId
                    }

                    /**
                     * The direction descibes the direction the funds will move, either from the
                     * cardholder to the merchant or from the merchant to the cardholder.
                     */
                    fun direction(direction: Direction) = direction(JsonField.of(direction))

                    /**
                     * The direction descibes the direction the funds will move, either from the
                     * cardholder to the merchant or from the merchant to the cardholder.
                     */
                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun direction(direction: JsonField<Direction>) = apply {
                        this.direction = direction
                    }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this
                     * authorization will expire and the pending transaction will be released.
                     */
                    fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this
                     * authorization will expire and the pending transaction will be released.
                     */
                    @JsonProperty("expires_at")
                    @ExcludeMissing
                    fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                        this.expiresAt = expiresAt
                    }

                    /** The Card Authorization identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Card Authorization identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    /**
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    /**
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
                    }

                    /** The city the merchant resides in. */
                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

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

                    /** The merchant descriptor of the merchant the card is transacting with. */
                    fun merchantDescriptor(merchantDescriptor: String) =
                        merchantDescriptor(JsonField.of(merchantDescriptor))

                    /** The merchant descriptor of the merchant the card is transacting with. */
                    @JsonProperty("merchant_descriptor")
                    @ExcludeMissing
                    fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                        this.merchantDescriptor = merchantDescriptor
                    }

                    /** Fields specific to the `network`. */
                    fun networkDetails(networkDetails: NetworkDetails) =
                        networkDetails(JsonField.of(networkDetails))

                    /** Fields specific to the `network`. */
                    @JsonProperty("network_details")
                    @ExcludeMissing
                    fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                        this.networkDetails = networkDetails
                    }

                    /** Network-specific identifiers for a specific request or transaction. */
                    fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                        networkIdentifiers(JsonField.of(networkIdentifiers))

                    /** Network-specific identifiers for a specific request or transaction. */
                    @JsonProperty("network_identifiers")
                    @ExcludeMissing
                    fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) =
                        apply {
                            this.networkIdentifiers = networkIdentifiers
                        }

                    /**
                     * The risk score generated by the card network. For Visa this is the Visa
                     * Advanced Authorization risk score, from 0 to 99, where 99 is the riskiest.
                     */
                    fun networkRiskScore(networkRiskScore: Long) =
                        networkRiskScore(JsonField.of(networkRiskScore))

                    /**
                     * The risk score generated by the card network. For Visa this is the Visa
                     * Advanced Authorization risk score, from 0 to 99, where 99 is the riskiest.
                     */
                    @JsonProperty("network_risk_score")
                    @ExcludeMissing
                    fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                        this.networkRiskScore = networkRiskScore
                    }

                    /**
                     * The identifier of the Pending Transaction associated with this Transaction.
                     */
                    fun pendingTransactionId(pendingTransactionId: String) =
                        pendingTransactionId(JsonField.of(pendingTransactionId))

                    /**
                     * The identifier of the Pending Transaction associated with this Transaction.
                     */
                    @JsonProperty("pending_transaction_id")
                    @ExcludeMissing
                    fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                        this.pendingTransactionId = pendingTransactionId
                    }

                    /**
                     * If the authorization was made in-person with a physical card, the Physical
                     * Card that was used.
                     */
                    fun physicalCardId(physicalCardId: String) =
                        physicalCardId(JsonField.of(physicalCardId))

                    /**
                     * If the authorization was made in-person with a physical card, the Physical
                     * Card that was used.
                     */
                    @JsonProperty("physical_card_id")
                    @ExcludeMissing
                    fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                        this.physicalCardId = physicalCardId
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's presentment
                     * currency.
                     */
                    fun presentmentAmount(presentmentAmount: Long) =
                        presentmentAmount(JsonField.of(presentmentAmount))

                    /**
                     * The pending amount in the minor unit of the transaction's presentment
                     * currency.
                     */
                    @JsonProperty("presentment_amount")
                    @ExcludeMissing
                    fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                        this.presentmentAmount = presentmentAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    fun presentmentCurrency(presentmentCurrency: String) =
                        presentmentCurrency(JsonField.of(presentmentCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    @JsonProperty("presentment_currency")
                    @ExcludeMissing
                    fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                        this.presentmentCurrency = presentmentCurrency
                    }

                    /**
                     * The processing category describes the intent behind the authorization, such
                     * as whether it was used for bill payments or an automatic fuel dispenser.
                     */
                    fun processingCategory(processingCategory: ProcessingCategory) =
                        processingCategory(JsonField.of(processingCategory))

                    /**
                     * The processing category describes the intent behind the authorization, such
                     * as whether it was used for bill payments or an automatic fuel dispenser.
                     */
                    @JsonProperty("processing_category")
                    @ExcludeMissing
                    fun processingCategory(processingCategory: JsonField<ProcessingCategory>) =
                        apply {
                            this.processingCategory = processingCategory
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

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_authorization`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_authorization`.
                     */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** Fields related to verification of cardholder-provided values. */
                    fun verification(verification: Verification) =
                        verification(JsonField.of(verification))

                    /** Fields related to verification of cardholder-provided values. */
                    @JsonProperty("verification")
                    @ExcludeMissing
                    fun verification(verification: JsonField<Verification>) = apply {
                        this.verification = verification
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

                    fun build(): CardAuthorization =
                        CardAuthorization(
                            actioner,
                            amount,
                            cardPaymentId,
                            currency,
                            digitalWalletTokenId,
                            direction,
                            expiresAt,
                            id,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            networkDetails,
                            networkIdentifiers,
                            networkRiskScore,
                            pendingTransactionId,
                            physicalCardId,
                            presentmentAmount,
                            presentmentCurrency,
                            processingCategory,
                            realTimeDecisionId,
                            type,
                            verification,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Actioner
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Actioner && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val USER = Actioner(JsonField.of("user"))

                        val INCREASE = Actioner(JsonField.of("increase"))

                        val NETWORK = Actioner(JsonField.of("network"))

                        fun of(value: String) = Actioner(JsonField.of(value))
                    }

                    enum class Known {
                        USER,
                        INCREASE,
                        NETWORK,
                    }

                    enum class Value {
                        USER,
                        INCREASE,
                        NETWORK,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            USER -> Value.USER
                            INCREASE -> Value.INCREASE
                            NETWORK -> Value.NETWORK
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            USER -> Known.USER
                            INCREASE -> Known.INCREASE
                            NETWORK -> Known.NETWORK
                            else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                class Direction
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Direction && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val SETTLEMENT = Direction(JsonField.of("settlement"))

                        val REFUND = Direction(JsonField.of("refund"))

                        fun of(value: String) = Direction(JsonField.of(value))
                    }

                    enum class Known {
                        SETTLEMENT,
                        REFUND,
                    }

                    enum class Value {
                        SETTLEMENT,
                        REFUND,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            SETTLEMENT -> Value.SETTLEMENT
                            REFUND -> Value.REFUND
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            SETTLEMENT -> Known.SETTLEMENT
                            REFUND -> Known.REFUND
                            else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to the `network`. */
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

                    /** The payment network used to process this card authorization. */
                    fun category(): Category = category.getRequired("category")

                    /** Fields specific to the `visa` network. */
                    fun visa(): Visa? = visa.getNullable("visa")

                    /** The payment network used to process this card authorization. */
                    @JsonProperty("category") @ExcludeMissing fun _category() = category

                    /** Fields specific to the `visa` network. */
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(networkDetails: NetworkDetails) = apply {
                            this.category = networkDetails.category
                            this.visa = networkDetails.visa
                            additionalProperties(networkDetails.additionalProperties)
                        }

                        /** The payment network used to process this card authorization. */
                        fun category(category: Category) = category(JsonField.of(category))

                        /** The payment network used to process this card authorization. */
                        @JsonProperty("category")
                        @ExcludeMissing
                        fun category(category: JsonField<Category>) = apply {
                            this.category = category
                        }

                        /** Fields specific to the `visa` network. */
                        fun visa(visa: Visa) = visa(JsonField.of(visa))

                        /** Fields specific to the `visa` network. */
                        @JsonProperty("visa")
                        @ExcludeMissing
                        fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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
                    ) : Enum {

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
                                else ->
                                    throw IncreaseInvalidDataException("Unknown Category: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    /** Fields specific to the `visa` network. */
                    @JsonDeserialize(builder = Visa.Builder::class)
                    @NoAutoDetect
                    class Visa
                    private constructor(
                        private val electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator>,
                        private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(): ElectronicCommerceIndicator? =
                            electronicCommerceIndicator.getNullable("electronic_commerce_indicator")

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(): PointOfServiceEntryMode? =
                            pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        fun _electronicCommerceIndicator() = electronicCommerceIndicator

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
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
                                this.electronicCommerceIndicator ==
                                    other.electronicCommerceIndicator &&
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
                            private var pointOfServiceEntryMode:
                                JsonField<PointOfServiceEntryMode> =
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
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: ElectronicCommerceIndicator
                            ) =
                                electronicCommerceIndicator(
                                    JsonField.of(electronicCommerceIndicator)
                                )

                            /**
                             * For electronic commerce transactions, this identifies the level of
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            @JsonProperty("electronic_commerce_indicator")
                            @ExcludeMissing
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                            ) = apply {
                                this.electronicCommerceIndicator = electronicCommerceIndicator
                            }

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date.
                             */
                            fun pointOfServiceEntryMode(
                                pointOfServiceEntryMode: PointOfServiceEntryMode
                            ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date.
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
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ElectronicCommerceIndicator &&
                                    this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val MAIL_PHONE_ORDER =
                                    ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                                val RECURRING =
                                    ElectronicCommerceIndicator(JsonField.of("recurring"))

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
                                    ElectronicCommerceIndicator(
                                        JsonField.of("non_secure_transaction")
                                    )

                                fun of(value: String) =
                                    ElectronicCommerceIndicator(JsonField.of(value))
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
                        ) : Enum {

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

                                val OPTICAL_CODE =
                                    PointOfServiceEntryMode(JsonField.of("optical_code"))

                                val INTEGRATED_CIRCUIT_CARD =
                                    PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

                                val CONTACTLESS =
                                    PointOfServiceEntryMode(JsonField.of("contactless"))

                                val CREDENTIAL_ON_FILE =
                                    PointOfServiceEntryMode(JsonField.of("credential_on_file"))

                                val MAGNETIC_STRIPE =
                                    PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

                                val CONTACTLESS_MAGNETIC_STRIPE =
                                    PointOfServiceEntryMode(
                                        JsonField.of("contactless_magnetic_stripe")
                                    )

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

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
                @NoAutoDetect
                class NetworkIdentifiers
                private constructor(
                    private val retrievalReferenceNumber: JsonField<String>,
                    private val traceNumber: JsonField<String>,
                    private val transactionId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(): String? =
                        retrievalReferenceNumber.getNullable("retrieval_reference_number")

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(): String? = transactionId.getNullable("transaction_id")

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    fun _retrievalReferenceNumber() = retrievalReferenceNumber

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    fun _transactionId() = transactionId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): NetworkIdentifiers = apply {
                        if (!validated) {
                            retrievalReferenceNumber()
                            traceNumber()
                            transactionId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is NetworkIdentifiers &&
                            this.retrievalReferenceNumber == other.retrievalReferenceNumber &&
                            this.traceNumber == other.traceNumber &&
                            this.transactionId == other.transactionId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    retrievalReferenceNumber,
                                    traceNumber,
                                    transactionId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                        private var traceNumber: JsonField<String> = JsonMissing.of()
                        private var transactionId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                            this.retrievalReferenceNumber =
                                networkIdentifiers.retrievalReferenceNumber
                            this.traceNumber = networkIdentifiers.traceNumber
                            this.transactionId = networkIdentifiers.transactionId
                            additionalProperties(networkIdentifiers.additionalProperties)
                        }

                        /**
                         * A life-cycle identifier used across e.g., an authorization and a
                         * reversal. Expected to be unique per acquirer within a window of time. For
                         * some card networks the retrieval reference number includes the trace
                         * counter.
                         */
                        fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                            retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

                        /**
                         * A life-cycle identifier used across e.g., an authorization and a
                         * reversal. Expected to be unique per acquirer within a window of time. For
                         * some card networks the retrieval reference number includes the trace
                         * counter.
                         */
                        @JsonProperty("retrieval_reference_number")
                        @ExcludeMissing
                        fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                            apply {
                                this.retrievalReferenceNumber = retrievalReferenceNumber
                            }

                        /**
                         * A counter used to verify an individual authorization. Expected to be
                         * unique per acquirer within a window of time.
                         */
                        fun traceNumber(traceNumber: String) =
                            traceNumber(JsonField.of(traceNumber))

                        /**
                         * A counter used to verify an individual authorization. Expected to be
                         * unique per acquirer within a window of time.
                         */
                        @JsonProperty("trace_number")
                        @ExcludeMissing
                        fun traceNumber(traceNumber: JsonField<String>) = apply {
                            this.traceNumber = traceNumber
                        }

                        /**
                         * A globally unique transaction identifier provided by the card network,
                         * used across multiple life-cycle requests.
                         */
                        fun transactionId(transactionId: String) =
                            transactionId(JsonField.of(transactionId))

                        /**
                         * A globally unique transaction identifier provided by the card network,
                         * used across multiple life-cycle requests.
                         */
                        @JsonProperty("transaction_id")
                        @ExcludeMissing
                        fun transactionId(transactionId: JsonField<String>) = apply {
                            this.transactionId = transactionId
                        }

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

                        fun build(): NetworkIdentifiers =
                            NetworkIdentifiers(
                                retrievalReferenceNumber,
                                traceNumber,
                                transactionId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class ProcessingCategory
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProcessingCategory && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ACCOUNT_FUNDING = ProcessingCategory(JsonField.of("account_funding"))

                        val AUTOMATIC_FUEL_DISPENSER =
                            ProcessingCategory(JsonField.of("automatic_fuel_dispenser"))

                        val BILL_PAYMENT = ProcessingCategory(JsonField.of("bill_payment"))

                        val PURCHASE = ProcessingCategory(JsonField.of("purchase"))

                        val QUASI_CASH = ProcessingCategory(JsonField.of("quasi_cash"))

                        val REFUND = ProcessingCategory(JsonField.of("refund"))

                        fun of(value: String) = ProcessingCategory(JsonField.of(value))
                    }

                    enum class Known {
                        ACCOUNT_FUNDING,
                        AUTOMATIC_FUEL_DISPENSER,
                        BILL_PAYMENT,
                        PURCHASE,
                        QUASI_CASH,
                        REFUND,
                    }

                    enum class Value {
                        ACCOUNT_FUNDING,
                        AUTOMATIC_FUEL_DISPENSER,
                        BILL_PAYMENT,
                        PURCHASE,
                        QUASI_CASH,
                        REFUND,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                            AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                            BILL_PAYMENT -> Value.BILL_PAYMENT
                            PURCHASE -> Value.PURCHASE
                            QUASI_CASH -> Value.QUASI_CASH
                            REFUND -> Value.REFUND
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                            AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                            BILL_PAYMENT -> Known.BILL_PAYMENT
                            PURCHASE -> Known.PURCHASE
                            QUASI_CASH -> Known.QUASI_CASH
                            REFUND -> Known.REFUND
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ProcessingCategory: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val CARD_AUTHORIZATION = Type(JsonField.of("card_authorization"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CARD_AUTHORIZATION,
                    }

                    enum class Value {
                        CARD_AUTHORIZATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields related to verification of cardholder-provided values. */
                @JsonDeserialize(builder = Verification.Builder::class)
                @NoAutoDetect
                class Verification
                private constructor(
                    private val cardVerificationCode: JsonField<CardVerificationCode>,
                    private val cardholderAddress: JsonField<CardholderAddress>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(): CardVerificationCode =
                        cardVerificationCode.getRequired("card_verification_code")

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(): CardholderAddress =
                        cardholderAddress.getRequired("cardholder_address")

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    fun _cardVerificationCode() = cardVerificationCode

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun _cardholderAddress() = cardholderAddress

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Verification = apply {
                        if (!validated) {
                            cardVerificationCode().validate()
                            cardholderAddress().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Verification &&
                            this.cardVerificationCode == other.cardVerificationCode &&
                            this.cardholderAddress == other.cardholderAddress &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    cardVerificationCode,
                                    cardholderAddress,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var cardVerificationCode: JsonField<CardVerificationCode> =
                            JsonMissing.of()
                        private var cardholderAddress: JsonField<CardholderAddress> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(verification: Verification) = apply {
                            this.cardVerificationCode = verification.cardVerificationCode
                            this.cardholderAddress = verification.cardholderAddress
                            additionalProperties(verification.additionalProperties)
                        }

                        /**
                         * Fields related to verification of the Card Verification Code, a 3-digit
                         * code on the back of the card.
                         */
                        fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                            cardVerificationCode(JsonField.of(cardVerificationCode))

                        /**
                         * Fields related to verification of the Card Verification Code, a 3-digit
                         * code on the back of the card.
                         */
                        @JsonProperty("card_verification_code")
                        @ExcludeMissing
                        fun cardVerificationCode(
                            cardVerificationCode: JsonField<CardVerificationCode>
                        ) = apply { this.cardVerificationCode = cardVerificationCode }

                        /**
                         * Cardholder address provided in the authorization request and the address
                         * on file we verified it against.
                         */
                        fun cardholderAddress(cardholderAddress: CardholderAddress) =
                            cardholderAddress(JsonField.of(cardholderAddress))

                        /**
                         * Cardholder address provided in the authorization request and the address
                         * on file we verified it against.
                         */
                        @JsonProperty("cardholder_address")
                        @ExcludeMissing
                        fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) =
                            apply {
                                this.cardholderAddress = cardholderAddress
                            }

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

                        fun build(): Verification =
                            Verification(
                                cardVerificationCode,
                                cardholderAddress,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    @JsonDeserialize(builder = CardVerificationCode.Builder::class)
                    @NoAutoDetect
                    class CardVerificationCode
                    private constructor(
                        private val result: JsonField<Result>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** The result of verifying the Card Verification Code. */
                        fun result(): Result = result.getRequired("result")

                        /** The result of verifying the Card Verification Code. */
                        @JsonProperty("result") @ExcludeMissing fun _result() = result

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): CardVerificationCode = apply {
                            if (!validated) {
                                result()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CardVerificationCode &&
                                this.result == other.result &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(result, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var result: JsonField<Result> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                                this.result = cardVerificationCode.result
                                additionalProperties(cardVerificationCode.additionalProperties)
                            }

                            /** The result of verifying the Card Verification Code. */
                            fun result(result: Result) = result(JsonField.of(result))

                            /** The result of verifying the Card Verification Code. */
                            @JsonProperty("result")
                            @ExcludeMissing
                            fun result(result: JsonField<Result>) = apply { this.result = result }

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

                            fun build(): CardVerificationCode =
                                CardVerificationCode(result, additionalProperties.toUnmodifiable())
                        }

                        class Result
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Result && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NOT_CHECKED = Result(JsonField.of("not_checked"))

                                val MATCH = Result(JsonField.of("match"))

                                val NO_MATCH = Result(JsonField.of("no_match"))

                                fun of(value: String) = Result(JsonField.of(value))
                            }

                            enum class Known {
                                NOT_CHECKED,
                                MATCH,
                                NO_MATCH,
                            }

                            enum class Value {
                                NOT_CHECKED,
                                MATCH,
                                NO_MATCH,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NOT_CHECKED -> Value.NOT_CHECKED
                                    MATCH -> Value.MATCH
                                    NO_MATCH -> Value.NO_MATCH
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NOT_CHECKED -> Known.NOT_CHECKED
                                    MATCH -> Known.MATCH
                                    NO_MATCH -> Known.NO_MATCH
                                    else ->
                                        throw IncreaseInvalidDataException("Unknown Result: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    @JsonDeserialize(builder = CardholderAddress.Builder::class)
                    @NoAutoDetect
                    class CardholderAddress
                    private constructor(
                        private val actualLine1: JsonField<String>,
                        private val actualPostalCode: JsonField<String>,
                        private val providedLine1: JsonField<String>,
                        private val providedPostalCode: JsonField<String>,
                        private val result: JsonField<Result>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(): String? =
                            actualPostalCode.getNullable("actual_postal_code")

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(): String? =
                            providedPostalCode.getNullable("provided_postal_code")

                        /** The address verification result returned to the card network. */
                        fun result(): Result = result.getRequired("result")

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun _actualLine1() = actualLine1

                        /** The postal code of the address on file for the cardholder. */
                        @JsonProperty("actual_postal_code")
                        @ExcludeMissing
                        fun _actualPostalCode() = actualPostalCode

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun _providedLine1() = providedLine1

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun _providedPostalCode() = providedPostalCode

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result") @ExcludeMissing fun _result() = result

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): CardholderAddress = apply {
                            if (!validated) {
                                actualLine1()
                                actualPostalCode()
                                providedLine1()
                                providedPostalCode()
                                result()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CardholderAddress &&
                                this.actualLine1 == other.actualLine1 &&
                                this.actualPostalCode == other.actualPostalCode &&
                                this.providedLine1 == other.providedLine1 &&
                                this.providedPostalCode == other.providedPostalCode &&
                                this.result == other.result &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        actualLine1,
                                        actualPostalCode,
                                        providedLine1,
                                        providedPostalCode,
                                        result,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var actualLine1: JsonField<String> = JsonMissing.of()
                            private var actualPostalCode: JsonField<String> = JsonMissing.of()
                            private var providedLine1: JsonField<String> = JsonMissing.of()
                            private var providedPostalCode: JsonField<String> = JsonMissing.of()
                            private var result: JsonField<Result> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cardholderAddress: CardholderAddress) = apply {
                                this.actualLine1 = cardholderAddress.actualLine1
                                this.actualPostalCode = cardholderAddress.actualPostalCode
                                this.providedLine1 = cardholderAddress.providedLine1
                                this.providedPostalCode = cardholderAddress.providedPostalCode
                                this.result = cardholderAddress.result
                                additionalProperties(cardholderAddress.additionalProperties)
                            }

                            /** Line 1 of the address on file for the cardholder. */
                            fun actualLine1(actualLine1: String) =
                                actualLine1(JsonField.of(actualLine1))

                            /** Line 1 of the address on file for the cardholder. */
                            @JsonProperty("actual_line1")
                            @ExcludeMissing
                            fun actualLine1(actualLine1: JsonField<String>) = apply {
                                this.actualLine1 = actualLine1
                            }

                            /** The postal code of the address on file for the cardholder. */
                            fun actualPostalCode(actualPostalCode: String) =
                                actualPostalCode(JsonField.of(actualPostalCode))

                            /** The postal code of the address on file for the cardholder. */
                            @JsonProperty("actual_postal_code")
                            @ExcludeMissing
                            fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                                this.actualPostalCode = actualPostalCode
                            }

                            /**
                             * The cardholder address line 1 provided for verification in the
                             * authorization request.
                             */
                            fun providedLine1(providedLine1: String) =
                                providedLine1(JsonField.of(providedLine1))

                            /**
                             * The cardholder address line 1 provided for verification in the
                             * authorization request.
                             */
                            @JsonProperty("provided_line1")
                            @ExcludeMissing
                            fun providedLine1(providedLine1: JsonField<String>) = apply {
                                this.providedLine1 = providedLine1
                            }

                            /**
                             * The postal code provided for verification in the authorization
                             * request.
                             */
                            fun providedPostalCode(providedPostalCode: String) =
                                providedPostalCode(JsonField.of(providedPostalCode))

                            /**
                             * The postal code provided for verification in the authorization
                             * request.
                             */
                            @JsonProperty("provided_postal_code")
                            @ExcludeMissing
                            fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                                this.providedPostalCode = providedPostalCode
                            }

                            /** The address verification result returned to the card network. */
                            fun result(result: Result) = result(JsonField.of(result))

                            /** The address verification result returned to the card network. */
                            @JsonProperty("result")
                            @ExcludeMissing
                            fun result(result: JsonField<Result>) = apply { this.result = result }

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

                            fun build(): CardholderAddress =
                                CardholderAddress(
                                    actualLine1,
                                    actualPostalCode,
                                    providedLine1,
                                    providedPostalCode,
                                    result,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Result
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Result && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NOT_CHECKED = Result(JsonField.of("not_checked"))

                                val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                    Result(JsonField.of("postal_code_match_address_not_checked"))

                                val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                    Result(JsonField.of("postal_code_match_address_no_match"))

                                val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                    Result(JsonField.of("postal_code_no_match_address_match"))

                                val MATCH = Result(JsonField.of("match"))

                                val NO_MATCH = Result(JsonField.of("no_match"))

                                fun of(value: String) = Result(JsonField.of(value))
                            }

                            enum class Known {
                                NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                                MATCH,
                                NO_MATCH,
                            }

                            enum class Value {
                                NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                                MATCH,
                                NO_MATCH,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NOT_CHECKED -> Value.NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                        Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                        Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                    POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                        Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                    MATCH -> Value.MATCH
                                    NO_MATCH -> Value.NO_MATCH
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NOT_CHECKED -> Known.NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                        Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                    POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                        Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                    POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                        Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                    MATCH -> Known.MATCH
                                    NO_MATCH -> Known.NO_MATCH
                                    else ->
                                        throw IncreaseInvalidDataException("Unknown Result: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val ACCOUNT_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("account_transfer_instruction"))

                    val ACH_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("ach_transfer_instruction"))

                    val CARD_AUTHORIZATION = Category(JsonField.of("card_authorization"))

                    val CHECK_DEPOSIT_INSTRUCTION =
                        Category(JsonField.of("check_deposit_instruction"))

                    val CHECK_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("check_transfer_instruction"))

                    val INBOUND_FUNDS_HOLD = Category(JsonField.of("inbound_funds_hold"))

                    val REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("real_time_payments_transfer_instruction"))

                    val WIRE_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("wire_transfer_instruction"))

                    val OTHER = Category(JsonField.of("other"))

                    fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_TRANSFER_INSTRUCTION,
                    ACH_TRANSFER_INSTRUCTION,
                    CARD_AUTHORIZATION,
                    CHECK_DEPOSIT_INSTRUCTION,
                    CHECK_TRANSFER_INSTRUCTION,
                    INBOUND_FUNDS_HOLD,
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                    WIRE_TRANSFER_INSTRUCTION,
                    OTHER,
                }

                enum class Value {
                    ACCOUNT_TRANSFER_INSTRUCTION,
                    ACH_TRANSFER_INSTRUCTION,
                    CARD_AUTHORIZATION,
                    CHECK_DEPOSIT_INSTRUCTION,
                    CHECK_TRANSFER_INSTRUCTION,
                    INBOUND_FUNDS_HOLD,
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                    WIRE_TRANSFER_INSTRUCTION,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_TRANSFER_INSTRUCTION -> Value.ACCOUNT_TRANSFER_INSTRUCTION
                        ACH_TRANSFER_INSTRUCTION -> Value.ACH_TRANSFER_INSTRUCTION
                        CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                        CHECK_DEPOSIT_INSTRUCTION -> Value.CHECK_DEPOSIT_INSTRUCTION
                        CHECK_TRANSFER_INSTRUCTION -> Value.CHECK_TRANSFER_INSTRUCTION
                        INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                        REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                            Value.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                        WIRE_TRANSFER_INSTRUCTION -> Value.WIRE_TRANSFER_INSTRUCTION
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_TRANSFER_INSTRUCTION -> Known.ACCOUNT_TRANSFER_INSTRUCTION
                        ACH_TRANSFER_INSTRUCTION -> Known.ACH_TRANSFER_INSTRUCTION
                        CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                        CHECK_DEPOSIT_INSTRUCTION -> Known.CHECK_DEPOSIT_INSTRUCTION
                        CHECK_TRANSFER_INSTRUCTION -> Known.CHECK_TRANSFER_INSTRUCTION
                        INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                        REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                            Known.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                        WIRE_TRANSFER_INSTRUCTION -> Known.WIRE_TRANSFER_INSTRUCTION
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            @JsonDeserialize(builder = CheckDepositInstruction.Builder::class)
            @NoAutoDetect
            class CheckDepositInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val backImageFileId: JsonField<String>,
                private val checkDepositId: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val frontImageFileId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

                /** The identifier of the Check Deposit. */
                fun checkDepositId(): String? = checkDepositId.getNullable("check_deposit_id")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun _backImageFileId() = backImageFileId

                /** The identifier of the Check Deposit. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun _checkDepositId() = checkDepositId

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun _frontImageFileId() = frontImageFileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CheckDepositInstruction = apply {
                    if (!validated) {
                        amount()
                        backImageFileId()
                        checkDepositId()
                        currency()
                        frontImageFileId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckDepositInstruction &&
                        this.amount == other.amount &&
                        this.backImageFileId == other.backImageFileId &&
                        this.checkDepositId == other.checkDepositId &&
                        this.currency == other.currency &&
                        this.frontImageFileId == other.frontImageFileId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                backImageFileId,
                                checkDepositId,
                                currency,
                                frontImageFileId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDepositInstruction{amount=$amount, backImageFileId=$backImageFileId, checkDepositId=$checkDepositId, currency=$currency, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var backImageFileId: JsonField<String> = JsonMissing.of()
                    private var checkDepositId: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var frontImageFileId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(checkDepositInstruction: CheckDepositInstruction) = apply {
                        this.amount = checkDepositInstruction.amount
                        this.backImageFileId = checkDepositInstruction.backImageFileId
                        this.checkDepositId = checkDepositInstruction.checkDepositId
                        this.currency = checkDepositInstruction.currency
                        this.frontImageFileId = checkDepositInstruction.frontImageFileId
                        additionalProperties(checkDepositInstruction.additionalProperties)
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The identifier of the File containing the image of the back of the check that
                     * was deposited.
                     */
                    fun backImageFileId(backImageFileId: String) =
                        backImageFileId(JsonField.of(backImageFileId))

                    /**
                     * The identifier of the File containing the image of the back of the check that
                     * was deposited.
                     */
                    @JsonProperty("back_image_file_id")
                    @ExcludeMissing
                    fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                        this.backImageFileId = backImageFileId
                    }

                    /** The identifier of the Check Deposit. */
                    fun checkDepositId(checkDepositId: String) =
                        checkDepositId(JsonField.of(checkDepositId))

                    /** The identifier of the Check Deposit. */
                    @JsonProperty("check_deposit_id")
                    @ExcludeMissing
                    fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                        this.checkDepositId = checkDepositId
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * The identifier of the File containing the image of the front of the check
                     * that was deposited.
                     */
                    fun frontImageFileId(frontImageFileId: String) =
                        frontImageFileId(JsonField.of(frontImageFileId))

                    /**
                     * The identifier of the File containing the image of the front of the check
                     * that was deposited.
                     */
                    @JsonProperty("front_image_file_id")
                    @ExcludeMissing
                    fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                        this.frontImageFileId = frontImageFileId
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

                    fun build(): CheckDepositInstruction =
                        CheckDepositInstruction(
                            amount,
                            backImageFileId,
                            checkDepositId,
                            currency,
                            frontImageFileId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
            }

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            @JsonDeserialize(builder = CheckTransferInstruction.Builder::class)
            @NoAutoDetect
            class CheckTransferInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CheckTransferInstruction = apply {
                    if (!validated) {
                        amount()
                        currency()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckTransferInstruction &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(checkTransferInstruction: CheckTransferInstruction) = apply {
                        this.amount = checkTransferInstruction.amount
                        this.currency = checkTransferInstruction.currency
                        this.transferId = checkTransferInstruction.transferId
                        additionalProperties(checkTransferInstruction.additionalProperties)
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                     * currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                     * currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * The identifier of the Check Transfer that led to this Pending Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Check Transfer that led to this Pending Transaction.
                     */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
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

                    fun build(): CheckTransferInstruction =
                        CheckTransferInstruction(
                            amount,
                            currency,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
            }

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            @JsonDeserialize(builder = InboundFundsHold.Builder::class)
            @NoAutoDetect
            class InboundFundsHold
            private constructor(
                private val amount: JsonField<Long>,
                private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val currency: JsonField<Currency>,
                private val heldTransactionId: JsonField<String>,
                private val id: JsonField<String>,
                private val pendingTransactionId: JsonField<String>,
                private val releasedAt: JsonField<OffsetDateTime>,
                private val status: JsonField<Status>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(): OffsetDateTime =
                    automaticallyReleasesAt.getRequired("automatically_releases_at")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(): String? =
                    heldTransactionId.getNullable("held_transaction_id")

                /** The Inbound Funds Hold identifier. */
                fun id(): String = id.getRequired("id")

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(): String? =
                    pendingTransactionId.getNullable("pending_transaction_id")

                /** When the hold was released (if it has been released). */
                fun releasedAt(): OffsetDateTime? = releasedAt.getNullable("released_at")

                /** The status of the hold. */
                fun status(): Status = status.getRequired("status")

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                @JsonProperty("automatically_releases_at")
                @ExcludeMissing
                fun _automaticallyReleasesAt() = automaticallyReleasesAt

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The ID of the Transaction for which funds were held. */
                @JsonProperty("held_transaction_id")
                @ExcludeMissing
                fun _heldTransactionId() = heldTransactionId

                /** The Inbound Funds Hold identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /** The ID of the Pending Transaction representing the held funds. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun _pendingTransactionId() = pendingTransactionId

                /** When the hold was released (if it has been released). */
                @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

                /** The status of the hold. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InboundFundsHold = apply {
                    if (!validated) {
                        amount()
                        automaticallyReleasesAt()
                        createdAt()
                        currency()
                        heldTransactionId()
                        id()
                        pendingTransactionId()
                        releasedAt()
                        status()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundFundsHold &&
                        this.amount == other.amount &&
                        this.automaticallyReleasesAt == other.automaticallyReleasesAt &&
                        this.createdAt == other.createdAt &&
                        this.currency == other.currency &&
                        this.heldTransactionId == other.heldTransactionId &&
                        this.id == other.id &&
                        this.pendingTransactionId == other.pendingTransactionId &&
                        this.releasedAt == other.releasedAt &&
                        this.status == other.status &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                automaticallyReleasesAt,
                                createdAt,
                                currency,
                                heldTransactionId,
                                id,
                                pendingTransactionId,
                                releasedAt,
                                status,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundFundsHold{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var automaticallyReleasesAt: JsonField<OffsetDateTime> =
                        JsonMissing.of()
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var heldTransactionId: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                    private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                        this.amount = inboundFundsHold.amount
                        this.automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                        this.createdAt = inboundFundsHold.createdAt
                        this.currency = inboundFundsHold.currency
                        this.heldTransactionId = inboundFundsHold.heldTransactionId
                        this.id = inboundFundsHold.id
                        this.pendingTransactionId = inboundFundsHold.pendingTransactionId
                        this.releasedAt = inboundFundsHold.releasedAt
                        this.status = inboundFundsHold.status
                        this.type = inboundFundsHold.type
                        additionalProperties(inboundFundsHold.additionalProperties)
                    }

                    /**
                     * The held amount in the minor unit of the account's currency. For dollars, for
                     * example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The held amount in the minor unit of the account's currency. For dollars, for
                     * example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * When the hold will be released automatically. Certain conditions may cause it
                     * to be released before this time.
                     */
                    fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                        automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

                    /**
                     * When the hold will be released automatically. Certain conditions may cause it
                     * to be released before this time.
                     */
                    @JsonProperty("automatically_releases_at")
                    @ExcludeMissing
                    fun automaticallyReleasesAt(
                        automaticallyReleasesAt: JsonField<OffsetDateTime>
                    ) = apply { this.automaticallyReleasesAt = automaticallyReleasesAt }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
                     * was created.
                     */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
                     * was created.
                     */
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                     * currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                     * currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The ID of the Transaction for which funds were held. */
                    fun heldTransactionId(heldTransactionId: String) =
                        heldTransactionId(JsonField.of(heldTransactionId))

                    /** The ID of the Transaction for which funds were held. */
                    @JsonProperty("held_transaction_id")
                    @ExcludeMissing
                    fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                        this.heldTransactionId = heldTransactionId
                    }

                    /** The Inbound Funds Hold identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Inbound Funds Hold identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The ID of the Pending Transaction representing the held funds. */
                    fun pendingTransactionId(pendingTransactionId: String) =
                        pendingTransactionId(JsonField.of(pendingTransactionId))

                    /** The ID of the Pending Transaction representing the held funds. */
                    @JsonProperty("pending_transaction_id")
                    @ExcludeMissing
                    fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                        this.pendingTransactionId = pendingTransactionId
                    }

                    /** When the hold was released (if it has been released). */
                    fun releasedAt(releasedAt: OffsetDateTime) =
                        releasedAt(JsonField.of(releasedAt))

                    /** When the hold was released (if it has been released). */
                    @JsonProperty("released_at")
                    @ExcludeMissing
                    fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                        this.releasedAt = releasedAt
                    }

                    /** The status of the hold. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /** The status of the hold. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `inbound_funds_hold`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `inbound_funds_hold`.
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

                    fun build(): InboundFundsHold =
                        InboundFundsHold(
                            amount,
                            automaticallyReleasesAt,
                            createdAt,
                            currency,
                            heldTransactionId,
                            id,
                            pendingTransactionId,
                            releasedAt,
                            status,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                class Status
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Status && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val HELD = Status(JsonField.of("held"))

                        val COMPLETE = Status(JsonField.of("complete"))

                        fun of(value: String) = Status(JsonField.of(value))
                    }

                    enum class Known {
                        HELD,
                        COMPLETE,
                    }

                    enum class Value {
                        HELD,
                        COMPLETE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            HELD -> Value.HELD
                            COMPLETE -> Value.COMPLETE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            HELD -> Known.HELD
                            COMPLETE -> Known.COMPLETE
                            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val INBOUND_FUNDS_HOLD = Type(JsonField.of("inbound_funds_hold"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        INBOUND_FUNDS_HOLD,
                    }

                    enum class Value {
                        INBOUND_FUNDS_HOLD,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            @JsonDeserialize(builder = RealTimePaymentsTransferInstruction.Builder::class)
            @NoAutoDetect
            class RealTimePaymentsTransferInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): RealTimePaymentsTransferInstruction = apply {
                    if (!validated) {
                        amount()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RealTimePaymentsTransferInstruction &&
                        this.amount == other.amount &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "RealTimePaymentsTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                    ) = apply {
                        this.amount = realTimePaymentsTransferInstruction.amount
                        this.transferId = realTimePaymentsTransferInstruction.transferId
                        additionalProperties(
                            realTimePaymentsTransferInstruction.additionalProperties
                        )
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The identifier of the Real-Time Payments Transfer that led to this Pending
                     * Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Real-Time Payments Transfer that led to this Pending
                     * Transaction.
                     */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
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

                    fun build(): RealTimePaymentsTransferInstruction =
                        RealTimePaymentsTransferInstruction(
                            amount,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            @JsonDeserialize(builder = WireTransferInstruction.Builder::class)
            @NoAutoDetect
            class WireTransferInstruction
            private constructor(
                private val accountNumber: JsonField<String>,
                private val amount: JsonField<Long>,
                private val messageToRecipient: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The account number for the destination account. */
                fun accountNumber(): String = accountNumber.getRequired("account_number")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(): String =
                    messageToRecipient.getRequired("message_to_recipient")

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The account number for the destination account. */
                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The message that will show on the recipient's bank statement. */
                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                fun _messageToRecipient() = messageToRecipient

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): WireTransferInstruction = apply {
                    if (!validated) {
                        accountNumber()
                        amount()
                        messageToRecipient()
                        routingNumber()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireTransferInstruction &&
                        this.accountNumber == other.accountNumber &&
                        this.amount == other.amount &&
                        this.messageToRecipient == other.messageToRecipient &&
                        this.routingNumber == other.routingNumber &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                accountNumber,
                                amount,
                                messageToRecipient,
                                routingNumber,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireTransferInstruction{accountNumber=$accountNumber, amount=$amount, messageToRecipient=$messageToRecipient, routingNumber=$routingNumber, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var messageToRecipient: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(wireTransferInstruction: WireTransferInstruction) = apply {
                        this.accountNumber = wireTransferInstruction.accountNumber
                        this.amount = wireTransferInstruction.amount
                        this.messageToRecipient = wireTransferInstruction.messageToRecipient
                        this.routingNumber = wireTransferInstruction.routingNumber
                        this.transferId = wireTransferInstruction.transferId
                        additionalProperties(wireTransferInstruction.additionalProperties)
                    }

                    /** The account number for the destination account. */
                    fun accountNumber(accountNumber: String) =
                        accountNumber(JsonField.of(accountNumber))

                    /** The account number for the destination account. */
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun accountNumber(accountNumber: JsonField<String>) = apply {
                        this.accountNumber = accountNumber
                    }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The message that will show on the recipient's bank statement. */
                    fun messageToRecipient(messageToRecipient: String) =
                        messageToRecipient(JsonField.of(messageToRecipient))

                    /** The message that will show on the recipient's bank statement. */
                    @JsonProperty("message_to_recipient")
                    @ExcludeMissing
                    fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                        this.messageToRecipient = messageToRecipient
                    }

                    /**
                     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                     * destination account.
                     */
                    fun routingNumber(routingNumber: String) =
                        routingNumber(JsonField.of(routingNumber))

                    /**
                     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                     * destination account.
                     */
                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun routingNumber(routingNumber: JsonField<String>) = apply {
                        this.routingNumber = routingNumber
                    }

                    /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
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

                    fun build(): WireTransferInstruction =
                        WireTransferInstruction(
                            accountNumber,
                            amount,
                            messageToRecipient,
                            routingNumber,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PENDING = Status(JsonField.of("pending"))

                val COMPLETE = Status(JsonField.of("complete"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                PENDING,
                COMPLETE,
            }

            enum class Value {
                PENDING,
                COMPLETE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    COMPLETE -> Value.COMPLETE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    COMPLETE -> Known.COMPLETE
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                val PENDING_TRANSACTION = Type(JsonField.of("pending_transaction"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                PENDING_TRANSACTION,
            }

            enum class Value {
                PENDING_TRANSACTION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PENDING_TRANSACTION -> Value.PENDING_TRANSACTION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PENDING_TRANSACTION -> Known.PENDING_TRANSACTION
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT =
                Type(JsonField.of("inbound_card_authorization_simulation_result"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Value.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Known.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
