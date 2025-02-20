// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPageAsync
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams

interface OAuthApplicationServiceAsync {

    /** Retrieve an OAuth Application */
    suspend fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication

    /** List OAuth Applications */
    suspend fun list(
        params: OAuthApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplicationListPageAsync
}
