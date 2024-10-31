// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthToken
import com.increase.api.models.OAuthTokenCreateParams

interface OAuthTokenService {

    /** Create an OAuth Token */
    fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthToken
}
