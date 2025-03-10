// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

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
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import java.util.Objects

/** List Real-Time Payments Transfers */
class RealTimePaymentsTransferListPage
private constructor(
    private val realTimePaymentsTransfersService: RealTimePaymentsTransferService,
    private val params: RealTimePaymentsTransferListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<RealTimePaymentsTransfer> = response().data()

    fun nextCursor(): String? = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferListPage && realTimePaymentsTransfersService == other.realTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferListPage{realTimePaymentsTransfersService=$realTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor() != null
    }

    fun getNextPageParams(): RealTimePaymentsTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return RealTimePaymentsTransferListParams.builder()
            .from(params)
            .apply { nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    fun getNextPage(): RealTimePaymentsTransferListPage? {
        return getNextPageParams()?.let { realTimePaymentsTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            realTimePaymentsTransfersService: RealTimePaymentsTransferService,
            params: RealTimePaymentsTransferListParams,
            response: Response,
        ) = RealTimePaymentsTransferListPage(realTimePaymentsTransfersService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<RealTimePaymentsTransfer>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<RealTimePaymentsTransfer> = data.getNullable("data") ?: listOf()

        fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

        @JsonProperty("data") fun _data(): JsonField<List<RealTimePaymentsTransfer>>? = data

        @JsonProperty("next_cursor") fun _nextCursor(): JsonField<String>? = nextCursor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
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

        override fun toString() =
            "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [RealTimePaymentsTransferListPage].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<RealTimePaymentsTransfer>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<RealTimePaymentsTransfer>) = data(JsonField.of(data))

            fun data(data: JsonField<List<RealTimePaymentsTransfer>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, nextCursor, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: RealTimePaymentsTransferListPage) :
        Sequence<RealTimePaymentsTransfer> {

        override fun iterator(): Iterator<RealTimePaymentsTransfer> = iterator {
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
