// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

class ProofOfAuthorizationRequestSubmissionCreateParams
constructor(
    private val body: ProofOfAuthorizationRequestSubmissionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Terms of authorization. */
    fun authorizationTerms(): String = body.authorizationTerms()

    /** Time of authorization. */
    fun authorizedAt(): OffsetDateTime = body.authorizedAt()

    /** Email of the authorizer. */
    fun authorizerEmail(): String = body.authorizerEmail()

    /** Name of the authorizer. */
    fun authorizerName(): String = body.authorizerName()

    /** Whether the customer has been offboarded or suspended. */
    fun customerHasBeenOffboarded(): Boolean = body.customerHasBeenOffboarded()

    /** ID of the proof of authorization request. */
    fun proofOfAuthorizationRequestId(): String = body.proofOfAuthorizationRequestId()

    /** Whether the account ownership was validated via credential (e.g. Plaid). */
    fun validatedAccountOwnershipViaCredential(): Boolean =
        body.validatedAccountOwnershipViaCredential()

    /** Whether the account ownership was validated with an account statement. */
    fun validatedAccountOwnershipWithAccountStatement(): Boolean =
        body.validatedAccountOwnershipWithAccountStatement()

    /** Whether the account ownership was validated with a microdeposit. */
    fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
        body.validatedAccountOwnershipWithMicrodeposit()

    /** Company of the authorizer. */
    fun authorizerCompany(): String? = body.authorizerCompany()

    /** IP address of the authorizer. */
    fun authorizerIpAddress(): String? = body.authorizerIpAddress()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): ProofOfAuthorizationRequestSubmissionCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ProofOfAuthorizationRequestSubmissionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("authorization_terms") private val authorizationTerms: String,
        @JsonProperty("authorized_at") private val authorizedAt: OffsetDateTime,
        @JsonProperty("authorizer_email") private val authorizerEmail: String,
        @JsonProperty("authorizer_name") private val authorizerName: String,
        @JsonProperty("customer_has_been_offboarded")
        private val customerHasBeenOffboarded: Boolean,
        @JsonProperty("proof_of_authorization_request_id")
        private val proofOfAuthorizationRequestId: String,
        @JsonProperty("validated_account_ownership_via_credential")
        private val validatedAccountOwnershipViaCredential: Boolean,
        @JsonProperty("validated_account_ownership_with_account_statement")
        private val validatedAccountOwnershipWithAccountStatement: Boolean,
        @JsonProperty("validated_account_ownership_with_microdeposit")
        private val validatedAccountOwnershipWithMicrodeposit: Boolean,
        @JsonProperty("authorizer_company") private val authorizerCompany: String?,
        @JsonProperty("authorizer_ip_address") private val authorizerIpAddress: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Terms of authorization. */
        @JsonProperty("authorization_terms") fun authorizationTerms(): String = authorizationTerms

        /** Time of authorization. */
        @JsonProperty("authorized_at") fun authorizedAt(): OffsetDateTime = authorizedAt

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email") fun authorizerEmail(): String = authorizerEmail

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name") fun authorizerName(): String = authorizerName

        /** Whether the customer has been offboarded or suspended. */
        @JsonProperty("customer_has_been_offboarded")
        fun customerHasBeenOffboarded(): Boolean = customerHasBeenOffboarded

        /** ID of the proof of authorization request. */
        @JsonProperty("proof_of_authorization_request_id")
        fun proofOfAuthorizationRequestId(): String = proofOfAuthorizationRequestId

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        @JsonProperty("validated_account_ownership_via_credential")
        fun validatedAccountOwnershipViaCredential(): Boolean =
            validatedAccountOwnershipViaCredential

        /** Whether the account ownership was validated with an account statement. */
        @JsonProperty("validated_account_ownership_with_account_statement")
        fun validatedAccountOwnershipWithAccountStatement(): Boolean =
            validatedAccountOwnershipWithAccountStatement

        /** Whether the account ownership was validated with a microdeposit. */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
            validatedAccountOwnershipWithMicrodeposit

        /** Company of the authorizer. */
        @JsonProperty("authorizer_company") fun authorizerCompany(): String? = authorizerCompany

        /** IP address of the authorizer. */
        @JsonProperty("authorizer_ip_address")
        fun authorizerIpAddress(): String? = authorizerIpAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var authorizationTerms: String? = null
            private var authorizedAt: OffsetDateTime? = null
            private var authorizerEmail: String? = null
            private var authorizerName: String? = null
            private var customerHasBeenOffboarded: Boolean? = null
            private var proofOfAuthorizationRequestId: String? = null
            private var validatedAccountOwnershipViaCredential: Boolean? = null
            private var validatedAccountOwnershipWithAccountStatement: Boolean? = null
            private var validatedAccountOwnershipWithMicrodeposit: Boolean? = null
            private var authorizerCompany: String? = null
            private var authorizerIpAddress: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                proofOfAuthorizationRequestSubmissionCreateBody:
                    ProofOfAuthorizationRequestSubmissionCreateBody
            ) = apply {
                authorizationTerms =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizationTerms
                authorizedAt = proofOfAuthorizationRequestSubmissionCreateBody.authorizedAt
                authorizerEmail = proofOfAuthorizationRequestSubmissionCreateBody.authorizerEmail
                authorizerName = proofOfAuthorizationRequestSubmissionCreateBody.authorizerName
                customerHasBeenOffboarded =
                    proofOfAuthorizationRequestSubmissionCreateBody.customerHasBeenOffboarded
                proofOfAuthorizationRequestId =
                    proofOfAuthorizationRequestSubmissionCreateBody.proofOfAuthorizationRequestId
                validatedAccountOwnershipViaCredential =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipViaCredential
                validatedAccountOwnershipWithAccountStatement =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithAccountStatement
                validatedAccountOwnershipWithMicrodeposit =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithMicrodeposit
                authorizerCompany =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerCompany
                authorizerIpAddress =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerIpAddress
                additionalProperties =
                    proofOfAuthorizationRequestSubmissionCreateBody.additionalProperties
                        .toMutableMap()
            }

            /** Terms of authorization. */
            fun authorizationTerms(authorizationTerms: String) = apply {
                this.authorizationTerms = authorizationTerms
            }

            /** Time of authorization. */
            fun authorizedAt(authorizedAt: OffsetDateTime) = apply {
                this.authorizedAt = authorizedAt
            }

            /** Email of the authorizer. */
            fun authorizerEmail(authorizerEmail: String) = apply {
                this.authorizerEmail = authorizerEmail
            }

            /** Name of the authorizer. */
            fun authorizerName(authorizerName: String) = apply {
                this.authorizerName = authorizerName
            }

            /** Whether the customer has been offboarded or suspended. */
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
                this.customerHasBeenOffboarded = customerHasBeenOffboarded
            }

            /** ID of the proof of authorization request. */
            fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

            /** Whether the account ownership was validated via credential (e.g. Plaid). */
            fun validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential: Boolean
            ) = apply {
                this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
            }

            /** Whether the account ownership was validated with an account statement. */
            fun validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement: Boolean
            ) = apply {
                this.validatedAccountOwnershipWithAccountStatement =
                    validatedAccountOwnershipWithAccountStatement
            }

            /** Whether the account ownership was validated with a microdeposit. */
            fun validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit: Boolean
            ) = apply {
                this.validatedAccountOwnershipWithMicrodeposit =
                    validatedAccountOwnershipWithMicrodeposit
            }

            /** Company of the authorizer. */
            fun authorizerCompany(authorizerCompany: String) = apply {
                this.authorizerCompany = authorizerCompany
            }

            /** IP address of the authorizer. */
            fun authorizerIpAddress(authorizerIpAddress: String) = apply {
                this.authorizerIpAddress = authorizerIpAddress
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

            fun build(): ProofOfAuthorizationRequestSubmissionCreateBody =
                ProofOfAuthorizationRequestSubmissionCreateBody(
                    checkNotNull(authorizationTerms) {
                        "`authorizationTerms` is required but was not set"
                    },
                    checkNotNull(authorizedAt) { "`authorizedAt` is required but was not set" },
                    checkNotNull(authorizerEmail) {
                        "`authorizerEmail` is required but was not set"
                    },
                    checkNotNull(authorizerName) { "`authorizerName` is required but was not set" },
                    checkNotNull(customerHasBeenOffboarded) {
                        "`customerHasBeenOffboarded` is required but was not set"
                    },
                    checkNotNull(proofOfAuthorizationRequestId) {
                        "`proofOfAuthorizationRequestId` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipViaCredential) {
                        "`validatedAccountOwnershipViaCredential` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipWithAccountStatement) {
                        "`validatedAccountOwnershipWithAccountStatement` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipWithMicrodeposit) {
                        "`validatedAccountOwnershipWithMicrodeposit` is required but was not set"
                    },
                    authorizerCompany,
                    authorizerIpAddress,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionCreateBody && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerEmail == other.authorizerEmail && authorizerName == other.authorizerName && customerHasBeenOffboarded == other.customerHasBeenOffboarded && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && authorizerCompany == other.authorizerCompany && authorizerIpAddress == other.authorizerIpAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorizationTerms, authorizedAt, authorizerEmail, authorizerName, customerHasBeenOffboarded, proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, authorizerCompany, authorizerIpAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProofOfAuthorizationRequestSubmissionCreateBody{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ProofOfAuthorizationRequestSubmissionCreateBody.Builder =
            ProofOfAuthorizationRequestSubmissionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            proofOfAuthorizationRequestSubmissionCreateParams:
                ProofOfAuthorizationRequestSubmissionCreateParams
        ) = apply {
            body = proofOfAuthorizationRequestSubmissionCreateParams.body.toBuilder()
            additionalHeaders =
                proofOfAuthorizationRequestSubmissionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                proofOfAuthorizationRequestSubmissionCreateParams.additionalQueryParams.toBuilder()
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) = apply {
            body.authorizationTerms(authorizationTerms)
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = apply { body.authorizedAt(authorizedAt) }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = apply { body.authorizerName(authorizerName) }

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
            body.customerHasBeenOffboarded(customerHasBeenOffboarded)
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
            body.proofOfAuthorizationRequestId(proofOfAuthorizationRequestId)
        }

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) = apply {
            body.validatedAccountOwnershipViaCredential(validatedAccountOwnershipViaCredential)
        }

        /** Whether the account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) = apply {
            body.validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement
            )
        }

        /** Whether the account ownership was validated with a microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) = apply {
            body.validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit
            )
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) = apply {
            body.authorizerCompany(authorizerCompany)
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) = apply {
            body.authorizerIpAddress(authorizerIpAddress)
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

        fun build(): ProofOfAuthorizationRequestSubmissionCreateParams =
            ProofOfAuthorizationRequestSubmissionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
