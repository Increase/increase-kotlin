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

/** A request for proof of authorization for one or more ACH debit transfers. */
@JsonDeserialize(builder = ProofOfAuthorizationRequest.Builder::class)
@NoAutoDetect
class ProofOfAuthorizationRequest
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val dueOn: JsonField<OffsetDateTime>,
    private val achTransfers: JsonField<List<AchTransfer>>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Proof of Authorization Request identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the Proof of Authorization Request was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time the Proof of Authorization Request was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The time the Proof of Authorization Request is due. */
    fun dueOn(): OffsetDateTime = dueOn.getRequired("due_on")

    /** The ACH Transfers associated with the request. */
    fun achTransfers(): List<AchTransfer> = achTransfers.getRequired("ach_transfers")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Proof of Authorization Request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The time the Proof of Authorization Request was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The time the Proof of Authorization Request was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The time the Proof of Authorization Request is due. */
    @JsonProperty("due_on") @ExcludeMissing fun _dueOn() = dueOn

    /** The ACH Transfers associated with the request. */
    @JsonProperty("ach_transfers") @ExcludeMissing fun _achTransfers() = achTransfers

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProofOfAuthorizationRequest = apply {
        if (!validated) {
            id()
            createdAt()
            updatedAt()
            dueOn()
            achTransfers().forEach { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProofOfAuthorizationRequest &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.dueOn == other.dueOn &&
            this.achTransfers == other.achTransfers &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    updatedAt,
                    dueOn,
                    achTransfers,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ProofOfAuthorizationRequest{id=$id, createdAt=$createdAt, updatedAt=$updatedAt, dueOn=$dueOn, achTransfers=$achTransfers, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dueOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var achTransfers: JsonField<List<AchTransfer>> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(proofOfAuthorizationRequest: ProofOfAuthorizationRequest) = apply {
            this.id = proofOfAuthorizationRequest.id
            this.createdAt = proofOfAuthorizationRequest.createdAt
            this.updatedAt = proofOfAuthorizationRequest.updatedAt
            this.dueOn = proofOfAuthorizationRequest.dueOn
            this.achTransfers = proofOfAuthorizationRequest.achTransfers
            this.type = proofOfAuthorizationRequest.type
            additionalProperties(proofOfAuthorizationRequest.additionalProperties)
        }

        /** The Proof of Authorization Request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the Proof of Authorization Request was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time the Proof of Authorization Request was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request was last updated. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The time the Proof of Authorization Request is due. */
        fun dueOn(dueOn: OffsetDateTime) = dueOn(JsonField.of(dueOn))

        /** The time the Proof of Authorization Request is due. */
        @JsonProperty("due_on")
        @ExcludeMissing
        fun dueOn(dueOn: JsonField<OffsetDateTime>) = apply { this.dueOn = dueOn }

        /** The ACH Transfers associated with the request. */
        fun achTransfers(achTransfers: List<AchTransfer>) = achTransfers(JsonField.of(achTransfers))

        /** The ACH Transfers associated with the request. */
        @JsonProperty("ach_transfers")
        @ExcludeMissing
        fun achTransfers(achTransfers: JsonField<List<AchTransfer>>) = apply {
            this.achTransfers = achTransfers
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request`.
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

        fun build(): ProofOfAuthorizationRequest =
            ProofOfAuthorizationRequest(
                id,
                createdAt,
                updatedAt,
                dueOn,
                achTransfers.map { it.toUnmodifiable() },
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AchTransfer.Builder::class)
    @NoAutoDetect
    class AchTransfer
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The ACH Transfer identifier. */
        fun id(): String = id.getRequired("id")

        /** The ACH Transfer identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AchTransfer = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchTransfer &&
                this.id == other.id &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(id, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "AchTransfer{id=$id, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(achTransfer: AchTransfer) = apply {
                this.id = achTransfer.id
                additionalProperties(achTransfer.additionalProperties)
            }

            /** The ACH Transfer identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The ACH Transfer identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): AchTransfer = AchTransfer(id, additionalProperties.toUnmodifiable())
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

            val PROOF_OF_AUTHORIZATION_REQUEST =
                Type(JsonField.of("proof_of_authorization_request"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST,
        }

        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST -> Value.PROOF_OF_AUTHORIZATION_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST -> Known.PROOF_OF_AUTHORIZATION_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
