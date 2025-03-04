// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPage
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams

interface PhysicalCardProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card Profile */
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** Retrieve a Card Profile */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** List Physical Card Profiles */
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfileListPage

    /** List Physical Card Profiles */
    fun list(requestOptions: RequestOptions): PhysicalCardProfileListPage =
        list(PhysicalCardProfileListParams.none(), requestOptions)

    /** Archive a Physical Card Profile */
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** Clone a Physical Card Profile */
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /**
     * A view of [PhysicalCardProfileService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileService.create].
         */
        @MustBeClosed
        fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileService.list].
         */
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfileListPage>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhysicalCardProfileListPage> =
            list(PhysicalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/archive`, but is otherwise the same as
         * [PhysicalCardProfileService.archive].
         */
        @MustBeClosed
        fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/clone`, but is otherwise the same as
         * [PhysicalCardProfileService.clone].
         */
        @MustBeClosed
        fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>
    }
}
