package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class ExportCreateParams
constructor(
    private val category: Category,
    private val accountStatementOfx: AccountStatementOfx?,
    private val balanceCsv: BalanceCsv?,
    private val transactionCsv: TransactionCsv?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun category(): Category = category

    fun accountStatementOfx(): AccountStatementOfx? = accountStatementOfx

    fun balanceCsv(): BalanceCsv? = balanceCsv

    fun transactionCsv(): TransactionCsv? = transactionCsv

    internal fun getBody(): ExportCreateBody {
        return ExportCreateBody(
            category,
            accountStatementOfx,
            balanceCsv,
            transactionCsv,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExportCreateBody.Builder::class)
    @NoAutoDetect
    class ExportCreateBody
    internal constructor(
        private val category: Category?,
        private val accountStatementOfx: AccountStatementOfx?,
        private val balanceCsv: BalanceCsv?,
        private val transactionCsv: TransactionCsv?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The type of Export to create. */
        @JsonProperty("category") fun category(): Category? = category

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        @JsonProperty("account_statement_ofx")
        fun accountStatementOfx(): AccountStatementOfx? = accountStatementOfx

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        @JsonProperty("balance_csv") fun balanceCsv(): BalanceCsv? = balanceCsv

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        @JsonProperty("transaction_csv") fun transactionCsv(): TransactionCsv? = transactionCsv

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExportCreateBody &&
                this.category == other.category &&
                this.accountStatementOfx == other.accountStatementOfx &&
                this.balanceCsv == other.balanceCsv &&
                this.transactionCsv == other.transactionCsv &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        accountStatementOfx,
                        balanceCsv,
                        transactionCsv,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExportCreateBody{category=$category, accountStatementOfx=$accountStatementOfx, balanceCsv=$balanceCsv, transactionCsv=$transactionCsv, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var category: Category? = null
            private var accountStatementOfx: AccountStatementOfx? = null
            private var balanceCsv: BalanceCsv? = null
            private var transactionCsv: TransactionCsv? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(exportCreateBody: ExportCreateBody) = apply {
                this.category = exportCreateBody.category
                this.accountStatementOfx = exportCreateBody.accountStatementOfx
                this.balanceCsv = exportCreateBody.balanceCsv
                this.transactionCsv = exportCreateBody.transactionCsv
                additionalProperties(exportCreateBody.additionalProperties)
            }

            /** The type of Export to create. */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            @JsonProperty("account_statement_ofx")
            fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) = apply {
                this.accountStatementOfx = accountStatementOfx
            }

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            @JsonProperty("balance_csv")
            fun balanceCsv(balanceCsv: BalanceCsv) = apply { this.balanceCsv = balanceCsv }

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            @JsonProperty("transaction_csv")
            fun transactionCsv(transactionCsv: TransactionCsv) = apply {
                this.transactionCsv = transactionCsv
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

            fun build(): ExportCreateBody =
                ExportCreateBody(
                    checkNotNull(category) { "`category` is required but was not set" },
                    accountStatementOfx,
                    balanceCsv,
                    transactionCsv,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportCreateParams &&
            this.category == other.category &&
            this.accountStatementOfx == other.accountStatementOfx &&
            this.balanceCsv == other.balanceCsv &&
            this.transactionCsv == other.transactionCsv &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            category,
            accountStatementOfx,
            balanceCsv,
            transactionCsv,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExportCreateParams{category=$category, accountStatementOfx=$accountStatementOfx, balanceCsv=$balanceCsv, transactionCsv=$transactionCsv, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var category: Category? = null
        private var accountStatementOfx: AccountStatementOfx? = null
        private var balanceCsv: BalanceCsv? = null
        private var transactionCsv: TransactionCsv? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(exportCreateParams: ExportCreateParams) = apply {
            this.category = exportCreateParams.category
            this.accountStatementOfx = exportCreateParams.accountStatementOfx
            this.balanceCsv = exportCreateParams.balanceCsv
            this.transactionCsv = exportCreateParams.transactionCsv
            additionalQueryParams(exportCreateParams.additionalQueryParams)
            additionalHeaders(exportCreateParams.additionalHeaders)
            additionalBodyProperties(exportCreateParams.additionalBodyProperties)
        }

        /** The type of Export to create. */
        fun category(category: Category) = apply { this.category = category }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) = apply {
            this.accountStatementOfx = accountStatementOfx
        }

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: BalanceCsv) = apply { this.balanceCsv = balanceCsv }

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: TransactionCsv) = apply {
            this.transactionCsv = transactionCsv
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ExportCreateParams =
            ExportCreateParams(
                checkNotNull(category) { "`category` is required but was not set" },
                accountStatementOfx,
                balanceCsv,
                transactionCsv,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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

            val ACCOUNT_STATEMENT_OFX = Category(JsonField.of("account_statement_ofx"))

            val TRANSACTION_CSV = Category(JsonField.of("transaction_csv"))

            val BALANCE_CSV = Category(JsonField.of("balance_csv"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
        }

        enum class Value {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    @JsonDeserialize(builder = AccountStatementOfx.Builder::class)
    @NoAutoDetect
    class AccountStatementOfx
    private constructor(
        private val accountId: String?,
        private val createdAt: CreatedAt?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Account to create a statement for. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at") fun createdAt(): CreatedAt? = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountStatementOfx &&
                this.accountId == other.accountId &&
                this.createdAt == other.createdAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        createdAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountStatementOfx{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountStatementOfx: AccountStatementOfx) = apply {
                this.accountId = accountStatementOfx.accountId
                this.createdAt = accountStatementOfx.createdAt
                additionalProperties(accountStatementOfx.additionalProperties)
            }

            /** The Account to create a statement for. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            @JsonProperty("created_at")
            fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

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

            fun build(): AccountStatementOfx =
                AccountStatementOfx(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    createdAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @JsonDeserialize(builder = CreatedAt.Builder::class)
        @NoAutoDetect
        class CreatedAt
        private constructor(
            private val after: OffsetDateTime?,
            private val before: OffsetDateTime?,
            private val onOrAfter: OffsetDateTime?,
            private val onOrBefore: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") fun after(): OffsetDateTime? = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before") fun before(): OffsetDateTime? = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after") fun onOrAfter(): OffsetDateTime? = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before") fun onOrBefore(): OffsetDateTime? = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    this.after == other.after &&
                    this.before == other.before &&
                    this.onOrAfter == other.onOrAfter &&
                    this.onOrBefore == other.onOrBefore &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            after,
                            before,
                            onOrAfter,
                            onOrBefore,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(createdAt: CreatedAt) = apply {
                    this.after = createdAt.after
                    this.before = createdAt.before
                    this.onOrAfter = createdAt.onOrAfter
                    this.onOrBefore = createdAt.onOrBefore
                    additionalProperties(createdAt.additionalProperties)
                }

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("after")
                fun after(after: OffsetDateTime) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("before")
                fun before(before: OffsetDateTime) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_after")
                fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_before")
                fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

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

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    /** Options for the created export. Required if `category` is equal to `balance_csv`. */
    @JsonDeserialize(builder = BalanceCsv.Builder::class)
    @NoAutoDetect
    class BalanceCsv
    private constructor(
        private val accountId: String?,
        private val createdAt: CreatedAt?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at") fun createdAt(): CreatedAt? = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceCsv &&
                this.accountId == other.accountId &&
                this.createdAt == other.createdAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        createdAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BalanceCsv{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balanceCsv: BalanceCsv) = apply {
                this.accountId = balanceCsv.accountId
                this.createdAt = balanceCsv.createdAt
                additionalProperties(balanceCsv.additionalProperties)
            }

            /** Filter exported Transactions to the specified Account. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            @JsonProperty("created_at")
            fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

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

            fun build(): BalanceCsv =
                BalanceCsv(
                    accountId,
                    createdAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @JsonDeserialize(builder = CreatedAt.Builder::class)
        @NoAutoDetect
        class CreatedAt
        private constructor(
            private val after: OffsetDateTime?,
            private val before: OffsetDateTime?,
            private val onOrAfter: OffsetDateTime?,
            private val onOrBefore: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") fun after(): OffsetDateTime? = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before") fun before(): OffsetDateTime? = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after") fun onOrAfter(): OffsetDateTime? = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before") fun onOrBefore(): OffsetDateTime? = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    this.after == other.after &&
                    this.before == other.before &&
                    this.onOrAfter == other.onOrAfter &&
                    this.onOrBefore == other.onOrBefore &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            after,
                            before,
                            onOrAfter,
                            onOrBefore,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(createdAt: CreatedAt) = apply {
                    this.after = createdAt.after
                    this.before = createdAt.before
                    this.onOrAfter = createdAt.onOrAfter
                    this.onOrBefore = createdAt.onOrBefore
                    additionalProperties(createdAt.additionalProperties)
                }

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("after")
                fun after(after: OffsetDateTime) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("before")
                fun before(before: OffsetDateTime) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_after")
                fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_before")
                fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

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

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
    @JsonDeserialize(builder = TransactionCsv.Builder::class)
    @NoAutoDetect
    class TransactionCsv
    private constructor(
        private val accountId: String?,
        private val createdAt: CreatedAt?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at") fun createdAt(): CreatedAt? = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionCsv &&
                this.accountId == other.accountId &&
                this.createdAt == other.createdAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        createdAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionCsv{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transactionCsv: TransactionCsv) = apply {
                this.accountId = transactionCsv.accountId
                this.createdAt = transactionCsv.createdAt
                additionalProperties(transactionCsv.additionalProperties)
            }

            /** Filter exported Transactions to the specified Account. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            @JsonProperty("created_at")
            fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

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

            fun build(): TransactionCsv =
                TransactionCsv(
                    accountId,
                    createdAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @JsonDeserialize(builder = CreatedAt.Builder::class)
        @NoAutoDetect
        class CreatedAt
        private constructor(
            private val after: OffsetDateTime?,
            private val before: OffsetDateTime?,
            private val onOrAfter: OffsetDateTime?,
            private val onOrBefore: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") fun after(): OffsetDateTime? = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before") fun before(): OffsetDateTime? = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after") fun onOrAfter(): OffsetDateTime? = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before") fun onOrBefore(): OffsetDateTime? = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    this.after == other.after &&
                    this.before == other.before &&
                    this.onOrAfter == other.onOrAfter &&
                    this.onOrBefore == other.onOrBefore &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            after,
                            before,
                            onOrAfter,
                            onOrBefore,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(createdAt: CreatedAt) = apply {
                    this.after = createdAt.after
                    this.before = createdAt.before
                    this.onOrAfter = createdAt.onOrAfter
                    this.onOrBefore = createdAt.onOrBefore
                    additionalProperties(createdAt.additionalProperties)
                }

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("after")
                fun after(after: OffsetDateTime) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                @JsonProperty("before")
                fun before(before: OffsetDateTime) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_after")
                fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                @JsonProperty("on_or_before")
                fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

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

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
