// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class BookkeepingAccountBalanceParams
constructor(
    private val bookkeepingAccountId: String,
    private val atTime: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun bookkeepingAccountId(): String = bookkeepingAccountId

    fun atTime(): OffsetDateTime? = atTime

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.atTime?.let { params.put("at_time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> bookkeepingAccountId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingAccountBalanceParams &&
            this.bookkeepingAccountId == other.bookkeepingAccountId &&
            this.atTime == other.atTime &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bookkeepingAccountId,
            atTime,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "BookkeepingAccountBalanceParams{bookkeepingAccountId=$bookkeepingAccountId, atTime=$atTime, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bookkeepingAccountId: String? = null
        private var atTime: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(bookkeepingAccountBalanceParams: BookkeepingAccountBalanceParams) =
            apply {
                this.bookkeepingAccountId = bookkeepingAccountBalanceParams.bookkeepingAccountId
                this.atTime = bookkeepingAccountBalanceParams.atTime
                additionalQueryParams(bookkeepingAccountBalanceParams.additionalQueryParams)
                additionalHeaders(bookkeepingAccountBalanceParams.additionalHeaders)
            }

        /** The identifier of the Bookkeeping Account to retrieve. */
        fun bookkeepingAccountId(bookkeepingAccountId: String) = apply {
            this.bookkeepingAccountId = bookkeepingAccountId
        }

        /** The moment to query the balance at. If not set, returns the current balances. */
        fun atTime(atTime: OffsetDateTime) = apply { this.atTime = atTime }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): BookkeepingAccountBalanceParams =
            BookkeepingAccountBalanceParams(
                checkNotNull(bookkeepingAccountId) {
                    "`bookkeepingAccountId` is required but was not set"
                },
                atTime,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
