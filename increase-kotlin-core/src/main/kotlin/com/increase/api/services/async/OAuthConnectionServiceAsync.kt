// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPageAsync
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams

interface OAuthConnectionServiceAsync {

    /** Retrieve an OAuth Connection */
    suspend fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection

    /** List OAuth Connections */
    suspend fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnectionListPageAsync
}
