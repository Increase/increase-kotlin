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
    private val authorizationTerms: JsonField<String>,
    private val authorizedAt: JsonField<OffsetDateTime>,
    private val authorizerCompany: JsonField<String>,
    private val authorizerEmail: JsonField<String>,
    private val authorizerIpAddress: JsonField<String>,
    private val authorizerName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerHasBeenOffboarded: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val proofOfAuthorizationRequestId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val validatedAccountOwnershipViaCredential: JsonField<Boolean>,
    private val validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>,
    private val validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Terms of authorization. */
    fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

    /** Time of authorization. */
    fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

    /** Company of the authorizer. */
    fun authorizerCompany(): String? = authorizerCompany.getNullable("authorizer_company")

    /** Email of the authorizer. */
    fun authorizerEmail(): String? = authorizerEmail.getNullable("authorizer_email")

    /** IP address of the authorizer. */
    fun authorizerIpAddress(): String? = authorizerIpAddress.getNullable("authorizer_ip_address")

    /** Name of the authorizer. */
    fun authorizerName(): String? = authorizerName.getNullable("authorizer_name")

    /** The time the Proof of Authorization Request Submission was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Whether the customer has been offboarded. */
    fun customerHasBeenOffboarded(): Boolean? =
        customerHasBeenOffboarded.getNullable("customer_has_been_offboarded")

    /** The Proof of Authorization Request Submission identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

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

    /** The time the Proof of Authorization Request Submission was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** Whether account ownership was validated via credential (for instance, Plaid). */
    fun validatedAccountOwnershipViaCredential(): Boolean? =
        validatedAccountOwnershipViaCredential.getNullable(
            "validated_account_ownership_via_credential"
        )

    /** Whether account ownership was validated with an account statement. */
    fun validatedAccountOwnershipWithAccountStatement(): Boolean? =
        validatedAccountOwnershipWithAccountStatement.getNullable(
            "validated_account_ownership_with_account_statement"
        )

    /** Whether account ownership was validated with microdeposit. */
    fun validatedAccountOwnershipWithMicrodeposit(): Boolean? =
        validatedAccountOwnershipWithMicrodeposit.getNullable(
            "validated_account_ownership_with_microdeposit"
        )

    /** Terms of authorization. */
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    fun _authorizationTerms() = authorizationTerms

    /** Time of authorization. */
    @JsonProperty("authorized_at") @ExcludeMissing fun _authorizedAt() = authorizedAt

    /** Company of the authorizer. */
    @JsonProperty("authorizer_company") @ExcludeMissing fun _authorizerCompany() = authorizerCompany

    /** Email of the authorizer. */
    @JsonProperty("authorizer_email") @ExcludeMissing fun _authorizerEmail() = authorizerEmail

    /** IP address of the authorizer. */
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    fun _authorizerIpAddress() = authorizerIpAddress

    /** Name of the authorizer. */
    @JsonProperty("authorizer_name") @ExcludeMissing fun _authorizerName() = authorizerName

    /** The time the Proof of Authorization Request Submission was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Whether the customer has been offboarded. */
    @JsonProperty("customer_has_been_offboarded")
    @ExcludeMissing
    fun _customerHasBeenOffboarded() = customerHasBeenOffboarded

    /** The Proof of Authorization Request Submission identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

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

    /** The time the Proof of Authorization Request Submission was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Whether account ownership was validated via credential (for instance, Plaid). */
    @JsonProperty("validated_account_ownership_via_credential")
    @ExcludeMissing
    fun _validatedAccountOwnershipViaCredential() = validatedAccountOwnershipViaCredential

    /** Whether account ownership was validated with an account statement. */
    @JsonProperty("validated_account_ownership_with_account_statement")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithAccountStatement() =
        validatedAccountOwnershipWithAccountStatement

    /** Whether account ownership was validated with microdeposit. */
    @JsonProperty("validated_account_ownership_with_microdeposit")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithMicrodeposit() = validatedAccountOwnershipWithMicrodeposit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProofOfAuthorizationRequestSubmission = apply {
        if (!validated) {
            authorizationTerms()
            authorizedAt()
            authorizerCompany()
            authorizerEmail()
            authorizerIpAddress()
            authorizerName()
            createdAt()
            customerHasBeenOffboarded()
            id()
            idempotencyKey()
            proofOfAuthorizationRequestId()
            status()
            type()
            updatedAt()
            validatedAccountOwnershipViaCredential()
            validatedAccountOwnershipWithAccountStatement()
            validatedAccountOwnershipWithMicrodeposit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProofOfAuthorizationRequestSubmission &&
            this.authorizationTerms == other.authorizationTerms &&
            this.authorizedAt == other.authorizedAt &&
            this.authorizerCompany == other.authorizerCompany &&
            this.authorizerEmail == other.authorizerEmail &&
            this.authorizerIpAddress == other.authorizerIpAddress &&
            this.authorizerName == other.authorizerName &&
            this.createdAt == other.createdAt &&
            this.customerHasBeenOffboarded == other.customerHasBeenOffboarded &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId &&
            this.status == other.status &&
            this.type == other.type &&
            this.updatedAt == other.updatedAt &&
            this.validatedAccountOwnershipViaCredential ==
                other.validatedAccountOwnershipViaCredential &&
            this.validatedAccountOwnershipWithAccountStatement ==
                other.validatedAccountOwnershipWithAccountStatement &&
            this.validatedAccountOwnershipWithMicrodeposit ==
                other.validatedAccountOwnershipWithMicrodeposit &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    authorizationTerms,
                    authorizedAt,
                    authorizerCompany,
                    authorizerEmail,
                    authorizerIpAddress,
                    authorizerName,
                    createdAt,
                    customerHasBeenOffboarded,
                    id,
                    idempotencyKey,
                    proofOfAuthorizationRequestId,
                    status,
                    type,
                    updatedAt,
                    validatedAccountOwnershipViaCredential,
                    validatedAccountOwnershipWithAccountStatement,
                    validatedAccountOwnershipWithMicrodeposit,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ProofOfAuthorizationRequestSubmission{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerCompany=$authorizerCompany, authorizerEmail=$authorizerEmail, authorizerIpAddress=$authorizerIpAddress, authorizerName=$authorizerName, createdAt=$createdAt, customerHasBeenOffboarded=$customerHasBeenOffboarded, id=$id, idempotencyKey=$idempotencyKey, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, status=$status, type=$type, updatedAt=$updatedAt, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var authorizationTerms: JsonField<String> = JsonMissing.of()
        private var authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var authorizerCompany: JsonField<String> = JsonMissing.of()
        private var authorizerEmail: JsonField<String> = JsonMissing.of()
        private var authorizerIpAddress: JsonField<String> = JsonMissing.of()
        private var authorizerName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerHasBeenOffboarded: JsonField<Boolean> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var validatedAccountOwnershipViaCredential: JsonField<Boolean> = JsonMissing.of()
        private var validatedAccountOwnershipWithAccountStatement: JsonField<Boolean> =
            JsonMissing.of()
        private var validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            proofOfAuthorizationRequestSubmission: ProofOfAuthorizationRequestSubmission
        ) = apply {
            this.authorizationTerms = proofOfAuthorizationRequestSubmission.authorizationTerms
            this.authorizedAt = proofOfAuthorizationRequestSubmission.authorizedAt
            this.authorizerCompany = proofOfAuthorizationRequestSubmission.authorizerCompany
            this.authorizerEmail = proofOfAuthorizationRequestSubmission.authorizerEmail
            this.authorizerIpAddress = proofOfAuthorizationRequestSubmission.authorizerIpAddress
            this.authorizerName = proofOfAuthorizationRequestSubmission.authorizerName
            this.createdAt = proofOfAuthorizationRequestSubmission.createdAt
            this.customerHasBeenOffboarded =
                proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded
            this.id = proofOfAuthorizationRequestSubmission.id
            this.idempotencyKey = proofOfAuthorizationRequestSubmission.idempotencyKey
            this.proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId
            this.status = proofOfAuthorizationRequestSubmission.status
            this.type = proofOfAuthorizationRequestSubmission.type
            this.updatedAt = proofOfAuthorizationRequestSubmission.updatedAt
            this.validatedAccountOwnershipViaCredential =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential
            this.validatedAccountOwnershipWithAccountStatement =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithAccountStatement
            this.validatedAccountOwnershipWithMicrodeposit =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit
            additionalProperties(proofOfAuthorizationRequestSubmission.additionalProperties)
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

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /** Time of authorization. */
        @JsonProperty("authorized_at")
        @ExcludeMissing
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
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

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) =
            authorizerEmail(JsonField.of(authorizerEmail))

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
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

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = authorizerName(JsonField.of(authorizerName))

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request Submission was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
            customerHasBeenOffboarded(JsonField.of(customerHasBeenOffboarded))

        /** Whether the customer has been offboarded. */
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            this.customerHasBeenOffboarded = customerHasBeenOffboarded
        }

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request Submission identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
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

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request Submission was last updated. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) =
            validatedAccountOwnershipViaCredential(
                JsonField.of(validatedAccountOwnershipViaCredential)
            )

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
        }

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) =
            validatedAccountOwnershipWithAccountStatement(
                JsonField.of(validatedAccountOwnershipWithAccountStatement)
            )

        /** Whether account ownership was validated with an account statement. */
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithAccountStatement =
                validatedAccountOwnershipWithAccountStatement
        }

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                JsonField.of(validatedAccountOwnershipWithMicrodeposit)
            )

        /** Whether account ownership was validated with microdeposit. */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithMicrodeposit =
                validatedAccountOwnershipWithMicrodeposit
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

        fun build(): ProofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission(
                authorizationTerms,
                authorizedAt,
                authorizerCompany,
                authorizerEmail,
                authorizerIpAddress,
                authorizerName,
                createdAt,
                customerHasBeenOffboarded,
                id,
                idempotencyKey,
                proofOfAuthorizationRequestId,
                status,
                type,
                updatedAt,
                validatedAccountOwnershipViaCredential,
                validatedAccountOwnershipWithAccountStatement,
                validatedAccountOwnershipWithMicrodeposit,
                additionalProperties.toUnmodifiable(),
            )
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
