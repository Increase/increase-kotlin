// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthToken
import com.increase.api.models.OAuthTokenCreateParams

interface OAuthTokenServiceAsync {

    /** Create an OAuth Token */
    suspend fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthToken
}
