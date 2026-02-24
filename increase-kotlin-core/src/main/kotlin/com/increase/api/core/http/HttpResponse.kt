// File generated from our OpenAPI spec by Stainless.

package com.increase.api.core.http

import java.io.InputStream

interface HttpResponse : AutoCloseable {

    fun statusCode(): Int

    fun headers(): Headers

    /**
     * Returns the value of the `Idempotent-Replayed` header, or null if there's no such header in
     * the response.
     */
    fun idempotentReplayed(): String? = headers().values("Idempotent-Replayed").firstOrNull()

    fun body(): InputStream

    interface Handler<T> {

        fun handle(response: HttpResponse): T
    }
}
