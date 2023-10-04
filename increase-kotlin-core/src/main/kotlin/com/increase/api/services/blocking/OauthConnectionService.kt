// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.OauthConnection
import com.increase.api.models.OauthConnectionListPage
import com.increase.api.models.OauthConnectionListParams
import com.increase.api.models.OauthConnectionRetrieveParams

interface OauthConnectionService {

    /** Retrieve an OAuth Connection */
    fun retrieve(
        params: OauthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OauthConnection

    /** List OAuth Connections */
    fun list(
        params: OauthConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OauthConnectionListPage
}
