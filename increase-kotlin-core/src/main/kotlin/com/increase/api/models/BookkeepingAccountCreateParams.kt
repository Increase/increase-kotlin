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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Create a Bookkeeping Account */
class BookkeepingAccountCreateParams
private constructor(
    private val body: BookkeepingAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The name you choose for the account. */
    fun name(): String = body.name()

    /** The entity, if `compliance_category` is `commingled_cash`. */
    fun accountId(): String? = body.accountId()

    /** The account compliance category. */
    fun complianceCategory(): ComplianceCategory? = body.complianceCategory()

    /** The entity, if `compliance_category` is `customer_balance`. */
    fun entityId(): String? = body.entityId()

    /** The name you choose for the account. */
    fun _name(): JsonField<String> = body._name()

    /** The entity, if `compliance_category` is `commingled_cash`. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The account compliance category. */
    fun _complianceCategory(): JsonField<ComplianceCategory> = body._complianceCategory()

    /** The entity, if `compliance_category` is `customer_balance`. */
    fun _entityId(): JsonField<String> = body._entityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): BookkeepingAccountCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BookkeepingAccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compliance_category")
        @ExcludeMissing
        private val complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of(),
        @JsonProperty("entity_id")
        @ExcludeMissing
        private val entityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name you choose for the account. */
        fun name(): String = name.getRequired("name")

        /** The entity, if `compliance_category` is `commingled_cash`. */
        fun accountId(): String? = accountId.getNullable("account_id")

        /** The account compliance category. */
        fun complianceCategory(): ComplianceCategory? =
            complianceCategory.getNullable("compliance_category")

        /** The entity, if `compliance_category` is `customer_balance`. */
        fun entityId(): String? = entityId.getNullable("entity_id")

        /** The name you choose for the account. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The entity, if `compliance_category` is `commingled_cash`. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The account compliance category. */
        @JsonProperty("compliance_category")
        @ExcludeMissing
        fun _complianceCategory(): JsonField<ComplianceCategory> = complianceCategory

        /** The entity, if `compliance_category` is `customer_balance`. */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BookkeepingAccountCreateBody = apply {
            if (validated) {
                return@apply
            }

            name()
            accountId()
            complianceCategory()
            entityId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var accountId: JsonField<String> = JsonMissing.of()
            private var complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of()
            private var entityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bookkeepingAccountCreateBody: BookkeepingAccountCreateBody) = apply {
                name = bookkeepingAccountCreateBody.name
                accountId = bookkeepingAccountCreateBody.accountId
                complianceCategory = bookkeepingAccountCreateBody.complianceCategory
                entityId = bookkeepingAccountCreateBody.entityId
                additionalProperties =
                    bookkeepingAccountCreateBody.additionalProperties.toMutableMap()
            }

            /** The name you choose for the account. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name you choose for the account. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The entity, if `compliance_category` is `commingled_cash`. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The entity, if `compliance_category` is `commingled_cash`. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The account compliance category. */
            fun complianceCategory(complianceCategory: ComplianceCategory) =
                complianceCategory(JsonField.of(complianceCategory))

            /** The account compliance category. */
            fun complianceCategory(complianceCategory: JsonField<ComplianceCategory>) = apply {
                this.complianceCategory = complianceCategory
            }

            /** The entity, if `compliance_category` is `customer_balance`. */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /** The entity, if `compliance_category` is `customer_balance`. */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

            fun build(): BookkeepingAccountCreateBody =
                BookkeepingAccountCreateBody(
                    checkRequired("name", name),
                    accountId,
                    complianceCategory,
                    entityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookkeepingAccountCreateBody && name == other.name && accountId == other.accountId && complianceCategory == other.complianceCategory && entityId == other.entityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, accountId, complianceCategory, entityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingAccountCreateBody{name=$name, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: BookkeepingAccountCreateBody.Builder =
            BookkeepingAccountCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(bookkeepingAccountCreateParams: BookkeepingAccountCreateParams) = apply {
            body = bookkeepingAccountCreateParams.body.toBuilder()
            additionalHeaders = bookkeepingAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookkeepingAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /** The name you choose for the account. */
        fun name(name: String) = apply { body.name(name) }

        /** The name you choose for the account. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The entity, if `compliance_category` is `commingled_cash`. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The entity, if `compliance_category` is `commingled_cash`. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The account compliance category. */
        fun complianceCategory(complianceCategory: ComplianceCategory) = apply {
            body.complianceCategory(complianceCategory)
        }

        /** The account compliance category. */
        fun complianceCategory(complianceCategory: JsonField<ComplianceCategory>) = apply {
            body.complianceCategory(complianceCategory)
        }

        /** The entity, if `compliance_category` is `customer_balance`. */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /** The entity, if `compliance_category` is `customer_balance`. */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): BookkeepingAccountCreateParams =
            BookkeepingAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The account compliance category. */
    class ComplianceCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** A cash in an commingled Increase Account. */
            val COMMINGLED_CASH = of("commingled_cash")

            /** A customer balance. */
            val CUSTOMER_BALANCE = of("customer_balance")

            fun of(value: String) = ComplianceCategory(JsonField.of(value))
        }

        enum class Known {
            /** A cash in an commingled Increase Account. */
            COMMINGLED_CASH,
            /** A customer balance. */
            CUSTOMER_BALANCE,
        }

        enum class Value {
            /** A cash in an commingled Increase Account. */
            COMMINGLED_CASH,
            /** A customer balance. */
            CUSTOMER_BALANCE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMINGLED_CASH -> Value.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Value.CUSTOMER_BALANCE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMINGLED_CASH -> Known.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Known.CUSTOMER_BALANCE
                else -> throw IncreaseInvalidDataException("Unknown ComplianceCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ComplianceCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookkeepingAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
