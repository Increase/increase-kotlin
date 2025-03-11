// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Wire Drawdown Requests */
class WireDrawdownRequestListPageAsync private constructor(
    private val wireDrawdownRequestsService: WireDrawdownRequestServiceAsync,
    private val params: WireDrawdownRequestListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun data(): List<WireDrawdownRequest> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is WireDrawdownRequestListPageAsync && wireDrawdownRequestsService == other.wireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() = "WireDrawdownRequestListPageAsync{wireDrawdownRequestsService=$wireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor() != null
    }

    fun getNextPageParams(): WireDrawdownRequestListParams? {
      if (!hasNextPage()) {
        return null
      }

      return WireDrawdownRequestListParams.builder().from(params).apply {nextCursor()?.let{ this.cursor(it) } }.build()
    }

    suspend fun getNextPage(): WireDrawdownRequestListPageAsync? {
      return getNextPageParams()?.let {
          wireDrawdownRequestsService.list(it)
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(wireDrawdownRequestsService: WireDrawdownRequestServiceAsync, params: WireDrawdownRequestListParams, response: Response) =
            WireDrawdownRequestListPageAsync(
              wireDrawdownRequestsService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("data") private val data: JsonField<List<WireDrawdownRequest>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun data(): List<WireDrawdownRequest> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data")
        fun _data(): JsonField<List<WireDrawdownRequest>>? = data

        @JsonProperty("next_cursor")
        fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response =
            apply {
                if (validated) {
                  return@apply
                }

                data().map { it.validate() }
                nextCursor()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Response && data == other.data && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */

        override fun toString() = "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [WireDrawdownRequestListPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<WireDrawdownRequest>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) =
                apply {
                    this.data = page.data
                    this.nextCursor = page.nextCursor
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun data(data: List<WireDrawdownRequest>) = data(JsonField.of(data))

            fun data(data: JsonField<List<WireDrawdownRequest>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    this.additionalProperties.put(key, value)
                }

            fun build() =
                Response(
                  data,
                  nextCursor,
                  additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager(
        private val firstPage: WireDrawdownRequestListPageAsync,

    ) : Flow<WireDrawdownRequest> {

        override suspend fun collect(collector: FlowCollector<WireDrawdownRequest>) {
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
