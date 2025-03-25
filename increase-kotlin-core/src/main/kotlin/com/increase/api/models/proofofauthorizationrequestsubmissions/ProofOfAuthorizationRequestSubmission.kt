// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Information submitted in response to a proof of authorization request. Per Nacha's guidance on
 * proof of authorization, the originator must ensure that the authorization complies with
 * applicable legal requirements, is readily identifiable as an authorization, and has clear and
 * readily understandable terms.
 */
class ProofOfAuthorizationRequestSubmission
private constructor(
    private val id: JsonField<String>,
    private val additionalEvidenceFileId: JsonField<String>,
    private val authorizationTerms: JsonField<String>,
    private val authorizedAt: JsonField<OffsetDateTime>,
    private val authorizerCompany: JsonField<String>,
    private val authorizerEmail: JsonField<String>,
    private val authorizerIpAddress: JsonField<String>,
    private val authorizerName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerHasBeenOffboarded: JsonField<Boolean>,
    private val idempotencyKey: JsonField<String>,
    private val proofOfAuthorizationRequestId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val validatedAccountOwnershipViaCredential: JsonField<Boolean>,
    private val validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>,
    private val validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_evidence_file_id")
        @ExcludeMissing
        additionalEvidenceFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        authorizationTerms: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorized_at")
        @ExcludeMissing
        authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        authorizerCompany: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        authorizerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        authorizerIpAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        authorizerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        customerHasBeenOffboarded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        validatedAccountOwnershipViaCredential: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        validatedAccountOwnershipWithAccountStatement: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
        validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        additionalEvidenceFileId,
        authorizationTerms,
        authorizedAt,
        authorizerCompany,
        authorizerEmail,
        authorizerIpAddress,
        authorizerName,
        createdAt,
        customerHasBeenOffboarded,
        idempotencyKey,
        proofOfAuthorizationRequestId,
        status,
        type,
        updatedAt,
        validatedAccountOwnershipViaCredential,
        validatedAccountOwnershipWithAccountStatement,
        validatedAccountOwnershipWithMicrodeposit,
        mutableMapOf(),
    )

    /**
     * The Proof of Authorization Request Submission identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * File containing additional evidence.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalEvidenceFileId(): String? =
        additionalEvidenceFileId.getNullable("additional_evidence_file_id")

    /**
     * Terms of authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

    /**
     * Time of authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

    /**
     * Company of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerCompany(): String? = authorizerCompany.getNullable("authorizer_company")

    /**
     * Email of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerEmail(): String? = authorizerEmail.getNullable("authorizer_email")

    /**
     * IP address of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerIpAddress(): String? = authorizerIpAddress.getNullable("authorizer_ip_address")

    /**
     * Name of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerName(): String? = authorizerName.getNullable("authorizer_name")

    /**
     * The time the Proof of Authorization Request Submission was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Whether the customer has been offboarded.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerHasBeenOffboarded(): Boolean? =
        customerHasBeenOffboarded.getNullable("customer_has_been_offboarded")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * ID of the proof of authorization request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun proofOfAuthorizationRequestId(): String =
        proofOfAuthorizationRequestId.getRequired("proof_of_authorization_request_id")

    /**
     * Status of the proof of authorization request submission.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The time the Proof of Authorization Request Submission was last updated.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Whether account ownership was validated via credential (for instance, Plaid).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validatedAccountOwnershipViaCredential(): Boolean? =
        validatedAccountOwnershipViaCredential.getNullable(
            "validated_account_ownership_via_credential"
        )

    /**
     * Whether account ownership was validated with an account statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validatedAccountOwnershipWithAccountStatement(): Boolean? =
        validatedAccountOwnershipWithAccountStatement.getNullable(
            "validated_account_ownership_with_account_statement"
        )

    /**
     * Whether account ownership was validated with microdeposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validatedAccountOwnershipWithMicrodeposit(): Boolean? =
        validatedAccountOwnershipWithMicrodeposit.getNullable(
            "validated_account_ownership_with_microdeposit"
        )

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [additionalEvidenceFileId].
     *
     * Unlike [additionalEvidenceFileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("additional_evidence_file_id")
    @ExcludeMissing
    fun _additionalEvidenceFileId(): JsonField<String> = additionalEvidenceFileId

    /**
     * Returns the raw JSON value of [authorizationTerms].
     *
     * Unlike [authorizationTerms], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    fun _authorizationTerms(): JsonField<String> = authorizationTerms

    /**
     * Returns the raw JSON value of [authorizedAt].
     *
     * Unlike [authorizedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized_at")
    @ExcludeMissing
    fun _authorizedAt(): JsonField<OffsetDateTime> = authorizedAt

    /**
     * Returns the raw JSON value of [authorizerCompany].
     *
     * Unlike [authorizerCompany], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorizer_company")
    @ExcludeMissing
    fun _authorizerCompany(): JsonField<String> = authorizerCompany

    /**
     * Returns the raw JSON value of [authorizerEmail].
     *
     * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorizer_email")
    @ExcludeMissing
    fun _authorizerEmail(): JsonField<String> = authorizerEmail

    /**
     * Returns the raw JSON value of [authorizerIpAddress].
     *
     * Unlike [authorizerIpAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    fun _authorizerIpAddress(): JsonField<String> = authorizerIpAddress

    /**
     * Returns the raw JSON value of [authorizerName].
     *
     * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorizer_name")
    @ExcludeMissing
    fun _authorizerName(): JsonField<String> = authorizerName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerHasBeenOffboarded].
     *
     * Unlike [customerHasBeenOffboarded], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_has_been_offboarded")
    @ExcludeMissing
    fun _customerHasBeenOffboarded(): JsonField<Boolean> = customerHasBeenOffboarded

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [proofOfAuthorizationRequestId].
     *
     * Unlike [proofOfAuthorizationRequestId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("proof_of_authorization_request_id")
    @ExcludeMissing
    fun _proofOfAuthorizationRequestId(): JsonField<String> = proofOfAuthorizationRequestId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipViaCredential].
     *
     * Unlike [validatedAccountOwnershipViaCredential], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("validated_account_ownership_via_credential")
    @ExcludeMissing
    fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
        validatedAccountOwnershipViaCredential

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipWithAccountStatement].
     *
     * Unlike [validatedAccountOwnershipWithAccountStatement], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("validated_account_ownership_with_account_statement")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
        validatedAccountOwnershipWithAccountStatement

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipWithMicrodeposit].
     *
     * Unlike [validatedAccountOwnershipWithMicrodeposit], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("validated_account_ownership_with_microdeposit")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
        validatedAccountOwnershipWithMicrodeposit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestSubmission].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .additionalEvidenceFileId()
         * .authorizationTerms()
         * .authorizedAt()
         * .authorizerCompany()
         * .authorizerEmail()
         * .authorizerIpAddress()
         * .authorizerName()
         * .createdAt()
         * .customerHasBeenOffboarded()
         * .idempotencyKey()
         * .proofOfAuthorizationRequestId()
         * .status()
         * .type()
         * .updatedAt()
         * .validatedAccountOwnershipViaCredential()
         * .validatedAccountOwnershipWithAccountStatement()
         * .validatedAccountOwnershipWithMicrodeposit()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProofOfAuthorizationRequestSubmission]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var additionalEvidenceFileId: JsonField<String>? = null
        private var authorizationTerms: JsonField<String>? = null
        private var authorizedAt: JsonField<OffsetDateTime>? = null
        private var authorizerCompany: JsonField<String>? = null
        private var authorizerEmail: JsonField<String>? = null
        private var authorizerIpAddress: JsonField<String>? = null
        private var authorizerName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerHasBeenOffboarded: JsonField<Boolean>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var proofOfAuthorizationRequestId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var validatedAccountOwnershipViaCredential: JsonField<Boolean>? = null
        private var validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>? = null
        private var validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            proofOfAuthorizationRequestSubmission: ProofOfAuthorizationRequestSubmission
        ) = apply {
            id = proofOfAuthorizationRequestSubmission.id
            additionalEvidenceFileId =
                proofOfAuthorizationRequestSubmission.additionalEvidenceFileId
            authorizationTerms = proofOfAuthorizationRequestSubmission.authorizationTerms
            authorizedAt = proofOfAuthorizationRequestSubmission.authorizedAt
            authorizerCompany = proofOfAuthorizationRequestSubmission.authorizerCompany
            authorizerEmail = proofOfAuthorizationRequestSubmission.authorizerEmail
            authorizerIpAddress = proofOfAuthorizationRequestSubmission.authorizerIpAddress
            authorizerName = proofOfAuthorizationRequestSubmission.authorizerName
            createdAt = proofOfAuthorizationRequestSubmission.createdAt
            customerHasBeenOffboarded =
                proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded
            idempotencyKey = proofOfAuthorizationRequestSubmission.idempotencyKey
            proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId
            status = proofOfAuthorizationRequestSubmission.status
            type = proofOfAuthorizationRequestSubmission.type
            updatedAt = proofOfAuthorizationRequestSubmission.updatedAt
            validatedAccountOwnershipViaCredential =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential
            validatedAccountOwnershipWithAccountStatement =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithAccountStatement
            validatedAccountOwnershipWithMicrodeposit =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit
            additionalProperties =
                proofOfAuthorizationRequestSubmission.additionalProperties.toMutableMap()
        }

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** File containing additional evidence. */
        fun additionalEvidenceFileId(additionalEvidenceFileId: String?) =
            additionalEvidenceFileId(JsonField.ofNullable(additionalEvidenceFileId))

        /**
         * Sets [Builder.additionalEvidenceFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalEvidenceFileId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalEvidenceFileId(additionalEvidenceFileId: JsonField<String>) = apply {
            this.additionalEvidenceFileId = additionalEvidenceFileId
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) =
            authorizationTerms(JsonField.of(authorizationTerms))

        /**
         * Sets [Builder.authorizationTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationTerms] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            this.authorizationTerms = authorizationTerms
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /**
         * Sets [Builder.authorizedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String?) =
            authorizerCompany(JsonField.ofNullable(authorizerCompany))

        /**
         * Sets [Builder.authorizerCompany] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerCompany] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            this.authorizerCompany = authorizerCompany
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String?) =
            authorizerEmail(JsonField.ofNullable(authorizerEmail))

        /**
         * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String?) =
            authorizerIpAddress(JsonField.ofNullable(authorizerIpAddress))

        /**
         * Sets [Builder.authorizerIpAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerIpAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
            this.authorizerIpAddress = authorizerIpAddress
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String?) =
            authorizerName(JsonField.ofNullable(authorizerName))

        /**
         * Sets [Builder.authorizerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean?) =
            customerHasBeenOffboarded(JsonField.ofNullable(customerHasBeenOffboarded))

        /**
         * Alias for [Builder.customerHasBeenOffboarded].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
            customerHasBeenOffboarded(customerHasBeenOffboarded as Boolean?)

        /**
         * Sets [Builder.customerHasBeenOffboarded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerHasBeenOffboarded] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            this.customerHasBeenOffboarded = customerHasBeenOffboarded
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
            proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

        /**
         * Sets [Builder.proofOfAuthorizationRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proofOfAuthorizationRequestId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
            apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

        /** Status of the proof of authorization request submission. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request_submission`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean?
        ) =
            validatedAccountOwnershipViaCredential(
                JsonField.ofNullable(validatedAccountOwnershipViaCredential)
            )

        /**
         * Alias for [Builder.validatedAccountOwnershipViaCredential].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) =
            validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential as Boolean?
            )

        /**
         * Sets [Builder.validatedAccountOwnershipViaCredential] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipViaCredential] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
        }

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean?
        ) =
            validatedAccountOwnershipWithAccountStatement(
                JsonField.ofNullable(validatedAccountOwnershipWithAccountStatement)
            )

        /**
         * Alias for [Builder.validatedAccountOwnershipWithAccountStatement].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) =
            validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement as Boolean?
            )

        /**
         * Sets [Builder.validatedAccountOwnershipWithAccountStatement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipWithAccountStatement] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithAccountStatement =
                validatedAccountOwnershipWithAccountStatement
        }

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean?
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                JsonField.ofNullable(validatedAccountOwnershipWithMicrodeposit)
            )

        /**
         * Alias for [Builder.validatedAccountOwnershipWithMicrodeposit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit as Boolean?
            )

        /**
         * Sets [Builder.validatedAccountOwnershipWithMicrodeposit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipWithMicrodeposit] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithMicrodeposit =
                validatedAccountOwnershipWithMicrodeposit
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

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestSubmission].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .additionalEvidenceFileId()
         * .authorizationTerms()
         * .authorizedAt()
         * .authorizerCompany()
         * .authorizerEmail()
         * .authorizerIpAddress()
         * .authorizerName()
         * .createdAt()
         * .customerHasBeenOffboarded()
         * .idempotencyKey()
         * .proofOfAuthorizationRequestId()
         * .status()
         * .type()
         * .updatedAt()
         * .validatedAccountOwnershipViaCredential()
         * .validatedAccountOwnershipWithAccountStatement()
         * .validatedAccountOwnershipWithMicrodeposit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission(
                checkRequired("id", id),
                checkRequired("additionalEvidenceFileId", additionalEvidenceFileId),
                checkRequired("authorizationTerms", authorizationTerms),
                checkRequired("authorizedAt", authorizedAt),
                checkRequired("authorizerCompany", authorizerCompany),
                checkRequired("authorizerEmail", authorizerEmail),
                checkRequired("authorizerIpAddress", authorizerIpAddress),
                checkRequired("authorizerName", authorizerName),
                checkRequired("createdAt", createdAt),
                checkRequired("customerHasBeenOffboarded", customerHasBeenOffboarded),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("proofOfAuthorizationRequestId", proofOfAuthorizationRequestId),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                checkRequired(
                    "validatedAccountOwnershipViaCredential",
                    validatedAccountOwnershipViaCredential,
                ),
                checkRequired(
                    "validatedAccountOwnershipWithAccountStatement",
                    validatedAccountOwnershipWithAccountStatement,
                ),
                checkRequired(
                    "validatedAccountOwnershipWithMicrodeposit",
                    validatedAccountOwnershipWithMicrodeposit,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProofOfAuthorizationRequestSubmission = apply {
        if (validated) {
            return@apply
        }

        id()
        additionalEvidenceFileId()
        authorizationTerms()
        authorizedAt()
        authorizerCompany()
        authorizerEmail()
        authorizerIpAddress()
        authorizerName()
        createdAt()
        customerHasBeenOffboarded()
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

    /** Status of the proof of authorization request submission. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The proof of authorization request submission is pending review. */
            val PENDING_REVIEW = of("pending_review")

            /** The proof of authorization request submission was rejected. */
            val REJECTED = of("rejected")

            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            val CANCELED = of("canceled")

            /** The proof of authorization request submission is pending sending. */
            val PENDING_SENDING = of("pending_sending")

            /** The proof of authorization request submission was sent. */
            val SENT = of("sent")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The proof of authorization request submission is pending review. */
            PENDING_REVIEW,
            /** The proof of authorization request submission was rejected. */
            REJECTED,
            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            CANCELED,
            /** The proof of authorization request submission is pending sending. */
            PENDING_SENDING,
            /** The proof of authorization request submission was sent. */
            SENT,
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
            /** The proof of authorization request submission is pending review. */
            PENDING_REVIEW,
            /** The proof of authorization request submission was rejected. */
            REJECTED,
            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            CANCELED,
            /** The proof of authorization request submission is pending sending. */
            PENDING_SENDING,
            /** The proof of authorization request submission was sent. */
            SENT,
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
                PENDING_REVIEW -> Value.PENDING_REVIEW
                REJECTED -> Value.REJECTED
                CANCELED -> Value.CANCELED
                PENDING_SENDING -> Value.PENDING_SENDING
                SENT -> Value.SENT
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
                PENDING_REVIEW -> Known.PENDING_REVIEW
                REJECTED -> Known.REJECTED
                CANCELED -> Known.CANCELED
                PENDING_SENDING -> Known.PENDING_SENDING
                SENT -> Known.SENT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION =
                of("proof_of_authorization_request_submission")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
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
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

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

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmission && id == other.id && additionalEvidenceFileId == other.additionalEvidenceFileId && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerCompany == other.authorizerCompany && authorizerEmail == other.authorizerEmail && authorizerIpAddress == other.authorizerIpAddress && authorizerName == other.authorizerName && createdAt == other.createdAt && customerHasBeenOffboarded == other.customerHasBeenOffboarded && idempotencyKey == other.idempotencyKey && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && status == other.status && type == other.type && updatedAt == other.updatedAt && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, additionalEvidenceFileId, authorizationTerms, authorizedAt, authorizerCompany, authorizerEmail, authorizerIpAddress, authorizerName, createdAt, customerHasBeenOffboarded, idempotencyKey, proofOfAuthorizationRequestId, status, type, updatedAt, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProofOfAuthorizationRequestSubmission{id=$id, additionalEvidenceFileId=$additionalEvidenceFileId, authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerCompany=$authorizerCompany, authorizerEmail=$authorizerEmail, authorizerIpAddress=$authorizerIpAddress, authorizerName=$authorizerName, createdAt=$createdAt, customerHasBeenOffboarded=$customerHasBeenOffboarded, idempotencyKey=$idempotencyKey, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, status=$status, type=$type, updatedAt=$updatedAt, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, additionalProperties=$additionalProperties}"
}
