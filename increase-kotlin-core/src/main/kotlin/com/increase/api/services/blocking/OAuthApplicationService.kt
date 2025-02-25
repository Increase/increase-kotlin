// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPage
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams

interface OAuthApplicationService {

    /** Retrieve an OAuth Application */
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication

    /** List OAuth Applications */
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplicationListPage

    /** List OAuth Applications */
    fun list(requestOptions: RequestOptions): OAuthApplicationListPage =
        list(OAuthApplicationListParams.none(), requestOptions)
}
