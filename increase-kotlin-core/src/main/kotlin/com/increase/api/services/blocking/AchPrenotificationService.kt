// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationListResponse
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams

interface AchPrenotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AchPrenotificationService

    /** Create an ACH Prenotification */
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification =
        retrieve(
            params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** @see retrieve */
    fun retrieve(achPrenotificationId: String, requestOptions: RequestOptions): AchPrenotification =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

    /** List ACH Prenotifications */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotificationListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): AchPrenotificationListResponse =
        list(AchPrenotificationListParams.none(), requestOptions)

    /**
     * A view of [AchPrenotificationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AchPrenotificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ach_prenotifications`, but is otherwise the same
         * as [AchPrenotificationService.create].
         */
        @MustBeClosed
        fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification> =
            retrieve(
                params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            achPrenotificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationService.list].
         */
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotificationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AchPrenotificationListResponse> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
