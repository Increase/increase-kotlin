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
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Update a Lockbox */
class LockboxUpdateParams
private constructor(
    private val lockboxId: String,
    private val body: LockboxUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Lockbox. */
    fun lockboxId(): String = lockboxId

    /** The description you choose for the Lockbox. */
    fun description(): String? = body.description()

    /** The recipient name you choose for the Lockbox. */
    fun recipientName(): String? = body.recipientName()

    /** This indicates if checks can be sent to the Lockbox. */
    fun status(): Status? = body.status()

    /** The description you choose for the Lockbox. */
    fun _description(): JsonField<String> = body._description()

    /** The recipient name you choose for the Lockbox. */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /** This indicates if checks can be sent to the Lockbox. */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): LockboxUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> lockboxId
            else -> ""
        }
    }

    @NoAutoDetect
    class LockboxUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        private val recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The description you choose for the Lockbox. */
        fun description(): String? = description.getNullable("description")

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(): String? = recipientName.getNullable("recipient_name")

        /** This indicates if checks can be sent to the Lockbox. */
        fun status(): Status? = status.getNullable("status")

        /** The description you choose for the Lockbox. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The recipient name you choose for the Lockbox. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /** This indicates if checks can be sent to the Lockbox. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LockboxUpdateBody = apply {
            if (validated) {
                return@apply
            }

            description()
            recipientName()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LockboxUpdateBody]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lockboxUpdateBody: LockboxUpdateBody) = apply {
                description = lockboxUpdateBody.description
                recipientName = lockboxUpdateBody.recipientName
                status = lockboxUpdateBody.status
                additionalProperties = lockboxUpdateBody.additionalProperties.toMutableMap()
            }

            /** The description you choose for the Lockbox. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description you choose for the Lockbox. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The recipient name you choose for the Lockbox. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /** The recipient name you choose for the Lockbox. */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** This indicates if checks can be sent to the Lockbox. */
            fun status(status: Status) = status(JsonField.of(status))

            /** This indicates if checks can be sent to the Lockbox. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): LockboxUpdateBody =
                LockboxUpdateBody(
                    description,
                    recipientName,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LockboxUpdateBody && description == other.description && recipientName == other.recipientName && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, recipientName, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LockboxUpdateBody{description=$description, recipientName=$recipientName, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LockboxUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var lockboxId: String? = null
        private var body: LockboxUpdateBody.Builder = LockboxUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(lockboxUpdateParams: LockboxUpdateParams) = apply {
            lockboxId = lockboxUpdateParams.lockboxId
            body = lockboxUpdateParams.body.toBuilder()
            additionalHeaders = lockboxUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = lockboxUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Lockbox. */
        fun lockboxId(lockboxId: String) = apply { this.lockboxId = lockboxId }

        /** The description you choose for the Lockbox. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose for the Lockbox. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: String) = apply { body.recipientName(recipientName) }

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

        /** This indicates if checks can be sent to the Lockbox. */
        fun status(status: Status) = apply { body.status(status) }

        /** This indicates if checks can be sent to the Lockbox. */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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

        fun build(): LockboxUpdateParams =
            LockboxUpdateParams(
                checkRequired("lockboxId", lockboxId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** This indicates if checks can be sent to the Lockbox. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** This Lockbox is active. Checks mailed to it will be deposited automatically. */
            val ACTIVE = of("active")

            /** This Lockbox is inactive. Checks mailed to it will not be deposited. */
            val INACTIVE = of("inactive")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** This Lockbox is active. Checks mailed to it will be deposited automatically. */
            ACTIVE,
            /** This Lockbox is inactive. Checks mailed to it will not be deposited. */
            INACTIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** This Lockbox is active. Checks mailed to it will be deposited automatically. */
            ACTIVE,
            /** This Lockbox is inactive. Checks mailed to it will not be deposited. */
            INACTIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LockboxUpdateParams && lockboxId == other.lockboxId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lockboxId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LockboxUpdateParams{lockboxId=$lockboxId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
