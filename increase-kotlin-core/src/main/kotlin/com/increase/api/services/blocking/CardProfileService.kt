@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPage
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams

interface CardProfileService {

    /** Create a Card Profile */
    fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** Retrieve a Card Profile */
    fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** List Card Profiles */
    fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfileListPage
}
