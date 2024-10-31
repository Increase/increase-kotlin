// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPageAsync
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams

interface AchPrenotificationServiceAsync {

    /** Create an ACH Prenotification */
    suspend fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    suspend fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotification

    /** List ACH Prenotifications */
    suspend fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchPrenotificationListPageAsync
}
