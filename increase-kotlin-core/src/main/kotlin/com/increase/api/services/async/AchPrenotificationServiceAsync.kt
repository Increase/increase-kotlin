// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPageAsync
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams

interface AchPrenotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AchPrenotificationServiceAsync

    /** Create an ACH Prenotification */
    suspend fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    suspend fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification =
        retrieve(
            params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** @see [retrieve] */
    suspend fun retrieve(
        achPrenotificationId: String,
        requestOptions: RequestOptions,
    ): AchPrenotification =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AchPrenotificationServiceAsync.WithRawResponse

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
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification> =
            retrieve(
                params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            achPrenotificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

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
