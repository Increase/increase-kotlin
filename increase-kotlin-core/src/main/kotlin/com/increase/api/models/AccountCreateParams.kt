// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import java.util.Objects

/** Create an Account */
class AccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The name you choose for the Account. */
    fun name(): String = body.name()

    /** The identifier for the Entity that will own the Account. */
    fun entityId(): String? = body.entityId()

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity. Its relationship to your group must be `informational`.
     */
    fun informationalEntityId(): String? = body.informationalEntityId()

    /**
     * The identifier for the Program that this Account falls under. Required if you operate more
     * than one Program.
     */
    fun programId(): String? = body.programId()

    /** The name you choose for the Account. */
    fun _name(): JsonField<String> = body._name()

    /** The identifier for the Entity that will own the Account. */
    fun _entityId(): JsonField<String> = body._entityId()

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity. Its relationship to your group must be `informational`.
     */
    fun _informationalEntityId(): JsonField<String> = body._informationalEntityId()

    /**
     * The identifier for the Program that this Account falls under. Required if you operate more
     * than one Program.
     */
    fun _programId(): JsonField<String> = body._programId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_id")
        @ExcludeMissing
        private val entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        private val informationalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("program_id")
        @ExcludeMissing
        private val programId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name you choose for the Account. */
        fun name(): String = name.getRequired("name")

        /** The identifier for the Entity that will own the Account. */
        fun entityId(): String? = entityId.getNullable("entity_id")

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(): String? =
            informationalEntityId.getNullable("informational_entity_id")

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(): String? = programId.getNullable("program_id")

        /** The name you choose for the Account. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The identifier for the Entity that will own the Account. */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        fun _informationalEntityId(): JsonField<String> = informationalEntityId

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            entityId()
            informationalEntityId()
            programId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var entityId: JsonField<String> = JsonMissing.of()
            private var informationalEntityId: JsonField<String> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                entityId = body.entityId
                informationalEntityId = body.informationalEntityId
                programId = body.programId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name you choose for the Account. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name you choose for the Account. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The identifier for the Entity that will own the Account. */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /** The identifier for the Entity that will own the Account. */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            fun informationalEntityId(informationalEntityId: String) =
                informationalEntityId(JsonField.of(informationalEntityId))

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
                this.informationalEntityId = informationalEntityId
            }

            /**
             * The identifier for the Program that this Account falls under. Required if you operate
             * more than one Program.
             */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * The identifier for the Program that this Account falls under. Required if you operate
             * more than one Program.
             */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

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

            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    entityId,
                    informationalEntityId,
                    programId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && entityId == other.entityId && informationalEntityId == other.informationalEntityId && programId == other.programId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, entityId, informationalEntityId, programId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, entityId=$entityId, informationalEntityId=$informationalEntityId, programId=$programId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [AccountCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            body = accountCreateParams.body.toBuilder()
            additionalHeaders = accountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountCreateParams.additionalQueryParams.toBuilder()
        }

        /** The name you choose for the Account. */
        fun name(name: String) = apply { body.name(name) }

        /** The name you choose for the Account. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: String) = apply {
            body.informationalEntityId(informationalEntityId)
        }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            body.informationalEntityId(informationalEntityId)
        }

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(programId: String) = apply { body.programId(programId) }

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(programId: JsonField<String>) = apply { body.programId(programId) }

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

        fun build(): AccountCreateParams =
            AccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
