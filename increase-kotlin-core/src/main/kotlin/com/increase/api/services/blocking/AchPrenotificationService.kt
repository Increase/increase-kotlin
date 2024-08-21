// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPage
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams

interface AchPrenotificationService {

    /** Create an ACH Prenotification */
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotification

    /** List ACH Prenotifications */
    fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotificationListPage
}
