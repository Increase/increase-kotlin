@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Limit
import com.increase.api.models.LimitCreateParams
import com.increase.api.models.LimitListPageAsync
import com.increase.api.models.LimitListParams
import com.increase.api.models.LimitRetrieveParams
import com.increase.api.models.LimitUpdateParams

interface LimitServiceAsync {

    /** Create a Limit */
    suspend fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Limit

    /** Retrieve a Limit */
    suspend fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Limit

    /** Update a Limit */
    suspend fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Limit

    /** List Limits */
    suspend fun list(
        params: LimitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LimitListPageAsync
}
