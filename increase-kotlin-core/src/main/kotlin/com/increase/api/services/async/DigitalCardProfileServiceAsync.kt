// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPageAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams

interface DigitalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Digital Card Profile */
    suspend fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    suspend fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** List Card Profiles */
    suspend fun list(params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfileListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DigitalCardProfileListPageAsync = list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    suspend fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Clones a Digital Card Profile */
    suspend fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /**
     * A view of [DigitalCardProfileServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise
         * the same as [DigitalCardProfileServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for
         * `get /digital_card_profiles/{digital_card_profile_id}`, but is otherwise the
         * same as [DigitalCardProfileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise
         * the same as [DigitalCardProfileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfileListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfileListPageAsync> = list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /digital_card_profiles/{digital_card_profile_id}/archive`, but is
         * otherwise the same as [DigitalCardProfileServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for
         * `post /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise
         * the same as [DigitalCardProfileServiceAsync.clone].
         */
        @MustBeClosed
        suspend fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>
    }
}
