// File generated from our OpenAPI spec by Stainless.

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
 * Information submitted in response to a proof of authorization request. Per Nacha's guidance on
 * proof of authorization, the originator must ensure that the authorization complies with
 * applicable legal requirements, is readily identifiable as an authorization, and has clear and
 * readily understandable terms.
 */
@JsonDeserialize(builder = ProofOfAuthorizationRequestSubmission.Builder::class)
@NoAutoDetect
class ProofOfAuthorizationRequestSubmission
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val authorizerName: JsonField<String>,
    private val authorizerEmail: JsonField<String>,
    private val authorizerCompany: JsonField<String>,
    private val authorizerIpAddress: JsonField<String>,
    private val authorizedAt: JsonField<OffsetDateTime>,
    private val authorizationTerms: JsonField<String>,
    private val proofOfAuthorizationRequestId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Proof of Authorization Request Submission identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the Proof of Authorization Request Submission was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time the Proof of Authorization Request Submission was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** Name of the authorizer. */
    fun authorizerName(): String? = authorizerName.getNullable("authorizer_name")

    /** Email of the authorizer. */
    fun authorizerEmail(): String? = authorizerEmail.getNullable("authorizer_email")

    /** Company of the authorizer. */
    fun authorizerCompany(): String? = authorizerCompany.getNullable("authorizer_company")

    /** IP address of the authorizer. */
    fun authorizerIpAddress(): String? = authorizerIpAddress.getNullable("authorizer_ip_address")

    /** Time of authorization. */
    fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

    /** Terms of authorization. */
    fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

    /** ID of the proof of authorization request. */
    fun proofOfAuthorizationRequestId(): String =
        proofOfAuthorizationRequestId.getRequired("proof_of_authorization_request_id")

    /** Status of the proof of authorization request submission. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Proof of Authorization Request Submission identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The time the Proof of Authorization Request Submission was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The time the Proof of Authorization Request Submission was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Name of the authorizer. */
    @JsonProperty("authorizer_name") @ExcludeMissing fun _authorizerName() = authorizerName

    /** Email of the authorizer. */
    @JsonProperty("authorizer_email") @ExcludeMissing fun _authorizerEmail() = authorizerEmail

    /** Company of the authorizer. */
    @JsonProperty("authorizer_company") @ExcludeMissing fun _authorizerCompany() = authorizerCompany

    /** IP address of the authorizer. */
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    fun _authorizerIpAddress() = authorizerIpAddress

    /** Time of authorization. */
    @JsonProperty("authorized_at") @ExcludeMissing fun _authorizedAt() = authorizedAt

    /** Terms of authorization. */
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    fun _authorizationTerms() = authorizationTerms

    /** ID of the proof of authorization request. */
    @JsonProperty("proof_of_authorization_request_id")
    @ExcludeMissing
    fun _proofOfAuthorizationRequestId() = proofOfAuthorizationRequestId

    /** Status of the proof of authorization request submission. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProofOfAuthorizationRequestSubmission = apply {
        if (!validated) {
            id()
            createdAt()
            updatedAt()
            authorizerName()
            authorizerEmail()
            authorizerCompany()
            authorizerIpAddress()
            authorizedAt()
            authorizationTerms()
            proofOfAuthorizationRequestId()
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

        return other is ProofOfAuthorizationRequestSubmission &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.authorizerName == other.authorizerName &&
            this.authorizerEmail == other.authorizerEmail &&
            this.authorizerCompany == other.authorizerCompany &&
            this.authorizerIpAddress == other.authorizerIpAddress &&
            this.authorizedAt == other.authorizedAt &&
            this.authorizationTerms == other.authorizationTerms &&
            this.proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId &&
            this.status == other.status &&
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
                    authorizerName,
                    authorizerEmail,
                    authorizerCompany,
                    authorizerIpAddress,
                    authorizedAt,
                    authorizationTerms,
                    proofOfAuthorizationRequestId,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ProofOfAuthorizationRequestSubmission{id=$id, createdAt=$createdAt, updatedAt=$updatedAt, authorizerName=$authorizerName, authorizerEmail=$authorizerEmail, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, authorizedAt=$authorizedAt, authorizationTerms=$authorizationTerms, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var authorizerName: JsonField<String> = JsonMissing.of()
        private var authorizerEmail: JsonField<String> = JsonMissing.of()
        private var authorizerCompany: JsonField<String> = JsonMissing.of()
        private var authorizerIpAddress: JsonField<String> = JsonMissing.of()
        private var authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var authorizationTerms: JsonField<String> = JsonMissing.of()
        private var proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            proofOfAuthorizationRequestSubmission: ProofOfAuthorizationRequestSubmission
        ) = apply {
            this.id = proofOfAuthorizationRequestSubmission.id
            this.createdAt = proofOfAuthorizationRequestSubmission.createdAt
            this.updatedAt = proofOfAuthorizationRequestSubmission.updatedAt
            this.authorizerName = proofOfAuthorizationRequestSubmission.authorizerName
            this.authorizerEmail = proofOfAuthorizationRequestSubmission.authorizerEmail
            this.authorizerCompany = proofOfAuthorizationRequestSubmission.authorizerCompany
            this.authorizerIpAddress = proofOfAuthorizationRequestSubmission.authorizerIpAddress
            this.authorizedAt = proofOfAuthorizationRequestSubmission.authorizedAt
            this.authorizationTerms = proofOfAuthorizationRequestSubmission.authorizationTerms
            this.proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId
            this.status = proofOfAuthorizationRequestSubmission.status
            this.type = proofOfAuthorizationRequestSubmission.type
            additionalProperties(proofOfAuthorizationRequestSubmission.additionalProperties)
        }

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request Submission identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request Submission was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request Submission was last updated. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = authorizerName(JsonField.of(authorizerName))

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) =
            authorizerEmail(JsonField.of(authorizerEmail))

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) =
            authorizerCompany(JsonField.of(authorizerCompany))

        /** Company of the authorizer. */
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            this.authorizerCompany = authorizerCompany
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) =
            authorizerIpAddress(JsonField.of(authorizerIpAddress))

        /** IP address of the authorizer. */
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
            this.authorizerIpAddress = authorizerIpAddress
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /** Time of authorization. */
        @JsonProperty("authorized_at")
        @ExcludeMissing
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) =
            authorizationTerms(JsonField.of(authorizationTerms))

        /** Terms of authorization. */
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            this.authorizationTerms = authorizationTerms
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
            proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

        /** ID of the proof of authorization request. */
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
            apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

        /** Status of the proof of authorization request submission. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Status of the proof of authorization request submission. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request_submission`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request_submission`.
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

        fun build(): ProofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission(
                id,
                createdAt,
                updatedAt,
                authorizerName,
                authorizerEmail,
                authorizerCompany,
                authorizerIpAddress,
                authorizedAt,
                authorizationTerms,
                proofOfAuthorizationRequestId,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            val PENDING_REVIEW = Status(JsonField.of("pending_review"))

            val REJECTED = Status(JsonField.of("rejected"))

            val PENDING_SENDING = Status(JsonField.of("pending_sending"))

            val SENT = Status(JsonField.of("sent"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_REVIEW,
            REJECTED,
            PENDING_SENDING,
            SENT,
        }

        enum class Value {
            PENDING_REVIEW,
            REJECTED,
            PENDING_SENDING,
            SENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_REVIEW -> Value.PENDING_REVIEW
                REJECTED -> Value.REJECTED
                PENDING_SENDING -> Value.PENDING_SENDING
                SENT -> Value.SENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_REVIEW -> Known.PENDING_REVIEW
                REJECTED -> Known.REJECTED
                PENDING_SENDING -> Known.PENDING_SENDING
                SENT -> Known.SENT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION =
                Type(JsonField.of("proof_of_authorization_request_submission"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION,
        }

        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
