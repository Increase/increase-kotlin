// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPageAsync
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams

interface CardDisputeServiceAsync {

    /** Create a Card Dispute */
    suspend fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** Retrieve a Card Dispute */
    suspend fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** List Card Disputes */
    suspend fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDisputeListPageAsync
}
