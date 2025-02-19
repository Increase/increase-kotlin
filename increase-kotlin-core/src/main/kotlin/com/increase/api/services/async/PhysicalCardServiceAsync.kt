// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPageAsync
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams

interface PhysicalCardServiceAsync {

    /** Create a Physical Card */
    suspend fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Retrieve a Physical Card */
    suspend fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Update a Physical Card */
    suspend fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** List Physical Cards */
    suspend fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardListPageAsync
}
