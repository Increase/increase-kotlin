// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.services.blocking.SupplementalDocumentService

class SupplementalDocumentListPage private constructor(private val supplementalDocumentsService: SupplementalDocumentService, private val params: SupplementalDocumentListParams, private val response: Response, ) {

    fun response(): Response = response

    fun data(): List<EntitySupplementalDocument> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SupplementalDocumentListPage &&
          this.supplementalDocumentsService == other.supplementalDocumentsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          supplementalDocumentsService,
          params,
          response,
      )
    }

    override fun toString() = "SupplementalDocumentListPage{supplementalDocumentsService=$supplementalDocumentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor() != null
    }

    fun getNextPageParams(): SupplementalDocumentListParams? {
      if (!hasNextPage()) {
        return null
      }

      return SupplementalDocumentListParams.builder().from(params).apply {nextCursor()?.let{ this.cursor(it) } }.build()
    }

    fun getNextPage(): SupplementalDocumentListPage? {
      return getNextPageParams()?.let {
          supplementalDocumentsService.list(it)
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(supplementalDocumentsService: SupplementalDocumentService, params: SupplementalDocumentListParams, response: Response) = SupplementalDocumentListPage(
            supplementalDocumentsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<EntitySupplementalDocument>>, private val nextCursor: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun data(): List<EntitySupplementalDocument> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data")
        fun _data(): JsonField<List<EntitySupplementalDocument>>? = data

        @JsonProperty("next_cursor")
        fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
              data().map { it.validate() }
              nextCursor()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Response &&
              this.data == other.data &&
              this.nextCursor == other.nextCursor &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          return Objects.hash(
              data,
              nextCursor,
              additionalProperties,
          )
        }

        override fun toString() = "SupplementalDocumentListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<EntitySupplementalDocument>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<EntitySupplementalDocument>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<EntitySupplementalDocument>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(
                data,
                nextCursor,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: SupplementalDocumentListPage, ) : Sequence<EntitySupplementalDocument> {

        override fun iterator(): Iterator<EntitySupplementalDocument> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
              while (index < page.data().size) {
                yield(page.data()[index++])
              }
              page = page.getNextPage() ?: break
              index = 0
            }
        }
    }
}
