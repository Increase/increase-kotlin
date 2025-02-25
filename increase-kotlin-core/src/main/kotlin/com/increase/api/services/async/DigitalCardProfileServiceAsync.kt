// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPageAsync
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams

interface DigitalCardProfileServiceAsync {

    /** Create a Digital Card Profile */
    suspend fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    suspend fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** List Card Profiles */
    suspend fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfileListPageAsync

    /** List Card Profiles */
    suspend fun list(requestOptions: RequestOptions): DigitalCardProfileListPageAsync =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    suspend fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Clones a Digital Card Profile */
    suspend fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile
}
