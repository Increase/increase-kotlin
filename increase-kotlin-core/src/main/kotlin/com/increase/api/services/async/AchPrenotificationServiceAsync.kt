// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPageAsync
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams

interface AchPrenotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an ACH Prenotification */
    suspend fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    suspend fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** List ACH Prenotifications */
    suspend fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotificationListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AchPrenotificationListPageAsync =
        list(AchPrenotificationListParams.none(), requestOptions)

    /**
     * A view of [AchPrenotificationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /ach_prenotifications`, but is otherwise the same
         * as [AchPrenotificationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotificationListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AchPrenotificationListPageAsync> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
