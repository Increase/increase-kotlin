package com.increase.api.core.http

import java.io.Closeable

interface HttpClient : Closeable {

    fun execute(
        request: HttpRequest,
    ): HttpResponse

    suspend fun executeAsync(
        request: HttpRequest,
    ): HttpResponse
}
