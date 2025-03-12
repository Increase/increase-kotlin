// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPage
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams

interface DigitalCardProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Digital Card Profile */
    fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** List Card Profiles */
    fun list(params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfileListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DigitalCardProfileListPage = list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Clones a Digital Card Profile */
    fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /**
     * A view of [DigitalCardProfileService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise
         * the same as [DigitalCardProfileService.create].
         */
        @MustBeClosed
        fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for
         * `get /digital_card_profiles/{digital_card_profile_id}`, but is otherwise the
         * same as [DigitalCardProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise
         * the same as [DigitalCardProfileService.list].
         */
        @MustBeClosed
        fun list(params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfileListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfileListPage> = list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /digital_card_profiles/{digital_card_profile_id}/archive`, but is
         * otherwise the same as [DigitalCardProfileService.archive].
         */
        @MustBeClosed
        fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for
         * `post /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise
         * the same as [DigitalCardProfileService.clone].
         */
        @MustBeClosed
        fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DigitalCardProfile>
    }
}
