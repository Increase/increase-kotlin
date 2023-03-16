@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPageAsync
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams

interface CardProfileServiceAsync {

    /** Create a Card Profile */
    suspend fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** Retrieve a Card Profile */
    suspend fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** List Card Profiles */
    suspend fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfileListPageAsync
}
