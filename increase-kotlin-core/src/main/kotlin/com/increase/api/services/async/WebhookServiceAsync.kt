// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.common.collect.ListMultimap
import com.increase.api.core.JsonValue

interface WebhookServiceAsync {

    suspend fun unwrap(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ): JsonValue

    suspend fun verifySignature(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    )
}
