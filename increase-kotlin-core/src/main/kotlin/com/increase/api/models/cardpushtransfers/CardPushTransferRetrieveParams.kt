// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects

/** Retrieve a Card Push Transfer */
class CardPushTransferRetrieveParams
private constructor(
    private val cardPushTransferId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Card Push Transfer. */
    fun cardPushTransferId(): String? = cardPushTransferId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CardPushTransferRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardPushTransferRetrieveParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CardPushTransferRetrieveParams]. */
    class Builder internal constructor() {

        private var cardPushTransferId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardPushTransferRetrieveParams: CardPushTransferRetrieveParams) = apply {
            cardPushTransferId = cardPushTransferRetrieveParams.cardPushTransferId
            additionalHeaders = cardPushTransferRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardPushTransferRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Card Push Transfer. */
        fun cardPushTransferId(cardPushTransferId: String?) = apply {
            this.cardPushTransferId = cardPushTransferId
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

        /**
         * Returns an immutable instance of [CardPushTransferRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardPushTransferRetrieveParams =
            CardPushTransferRetrieveParams(
                cardPushTransferId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardPushTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPushTransferRetrieveParams &&
            cardPushTransferId == other.cardPushTransferId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cardPushTransferId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardPushTransferRetrieveParams{cardPushTransferId=$cardPushTransferId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
