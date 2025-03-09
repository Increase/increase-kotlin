// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.JsonValue
import com.increase.api.core.http.Headers

interface WebhookServiceAsync {

    suspend fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue

    suspend fun verifySignature(payload: String, headers: Headers, secret: String?)
}
