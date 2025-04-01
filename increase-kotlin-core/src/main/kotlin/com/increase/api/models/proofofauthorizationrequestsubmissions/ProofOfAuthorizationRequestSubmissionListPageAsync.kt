// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsync
import java.util.Collections
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Proof of Authorization Request Submissions */
class ProofOfAuthorizationRequestSubmissionListPageAsync
private constructor(
    private val proofOfAuthorizationRequestSubmissionsService:
        ProofOfAuthorizationRequestSubmissionServiceAsync,
    private val params: ProofOfAuthorizationRequestSubmissionListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<ProofOfAuthorizationRequestSubmission> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPageAsync && proofOfAuthorizationRequestSubmissionsService == other.proofOfAuthorizationRequestSubmissionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestSubmissionsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPageAsync{proofOfAuthorizationRequestSubmissionsService=$proofOfAuthorizationRequestSubmissionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): ProofOfAuthorizationRequestSubmissionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return ProofOfAuthorizationRequestSubmissionListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): ProofOfAuthorizationRequestSubmissionListPageAsync? {
        return getNextPageParams()?.let { proofOfAuthorizationRequestSubmissionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            proofOfAuthorizationRequestSubmissionsService:
                ProofOfAuthorizationRequestSubmissionServiceAsync,
            params: ProofOfAuthorizationRequestSubmissionListParams,
            response: Response,
        ) =
            ProofOfAuthorizationRequestSubmissionListPageAsync(
                proofOfAuthorizationRequestSubmissionsService,
                params,
                response,
            )
    }

    class Response(
        private val data: JsonField<List<ProofOfAuthorizationRequestSubmission>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<ProofOfAuthorizationRequestSubmission>> = JsonMissing.of(),
            @JsonProperty("next_cursor") nextCursor: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextCursor, mutableMapOf())

        fun data(): List<ProofOfAuthorizationRequestSubmission> =
            data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data")
        fun _data(): JsonField<List<ProofOfAuthorizationRequestSubmission>>? = data

        @JsonProperty("next_cursor") fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            nextCursor()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ProofOfAuthorizationRequestSubmissionListPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<ProofOfAuthorizationRequestSubmission>> =
                JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<ProofOfAuthorizationRequestSubmission>) = data(JsonField.of(data))

            fun data(data: JsonField<List<ProofOfAuthorizationRequestSubmission>>) = apply {
                this.data = data
            }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, nextCursor, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestSubmissionListPageAsync) :
        Flow<ProofOfAuthorizationRequestSubmission> {

        override suspend fun collect(
            collector: FlowCollector<ProofOfAuthorizationRequestSubmission>
        ) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
