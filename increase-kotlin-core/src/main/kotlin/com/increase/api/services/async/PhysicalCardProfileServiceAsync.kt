// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfile
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileArchiveParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListResponse
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileRetrieveParams

interface PhysicalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PhysicalCardProfileServiceAsync

    /** Create a Physical Card Profile */
    suspend fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** Retrieve a Card Profile */
    suspend fun retrieve(
        physicalCardProfileId: String,
        params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        retrieve(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see retrieve */
    suspend fun retrieve(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none(), requestOptions)

    /** List Physical Card Profiles */
    suspend fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfileListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PhysicalCardProfileListResponse =
        list(PhysicalCardProfileListParams.none(), requestOptions)

    /** Archive a Physical Card Profile */
    suspend fun archive(
        physicalCardProfileId: String,
        params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        archive(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see archive */
    suspend fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see archive */
    suspend fun archive(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

    /** Clone a Physical Card Profile */
    suspend fun clone(
        physicalCardProfileId: String,
        params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        clone(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see clone */
    suspend fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see clone */
    suspend fun clone(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): PhysicalCardProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            physicalCardProfileId: String,
            params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            retrieve(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            retrieve(
                physicalCardProfileId,
                PhysicalCardProfileRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfileListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PhysicalCardProfileListResponse> =
            list(PhysicalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/archive`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            physicalCardProfileId: String,
            params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            archive(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/clone`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.clone].
         */
        @MustBeClosed
        suspend fun clone(
            physicalCardProfileId: String,
            params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            clone(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        suspend fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see clone */
        @MustBeClosed
        suspend fun clone(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)
    }
}
