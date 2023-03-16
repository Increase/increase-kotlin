@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPage
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams

interface CardDisputeService {

    /** Create a Card Dispute */
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** Retrieve a Card Dispute */
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** List Card Disputes */
    fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDisputeListPage
}
