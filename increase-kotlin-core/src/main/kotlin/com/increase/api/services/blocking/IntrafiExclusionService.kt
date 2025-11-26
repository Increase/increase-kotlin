// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiexclusions.IntrafiExclusion
import com.increase.api.models.intrafiexclusions.IntrafiExclusionArchiveParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListResponse
import com.increase.api.models.intrafiexclusions.IntrafiExclusionRetrieveParams

interface IntrafiExclusionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntrafiExclusionService

    /** Create an IntraFi Exclusion */
    fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    fun retrieve(
        intrafiExclusionId: String,
        params: IntrafiExclusionRetrieveParams = IntrafiExclusionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion =
        retrieve(params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** @see retrieve */
    fun retrieve(intrafiExclusionId: String, requestOptions: RequestOptions): IntrafiExclusion =
        retrieve(intrafiExclusionId, IntrafiExclusionRetrieveParams.none(), requestOptions)

    /** List IntraFi Exclusions */
    fun list(
        params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusionListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): IntrafiExclusionListResponse =
        list(IntrafiExclusionListParams.none(), requestOptions)

    /** Archive an IntraFi Exclusion */
    fun archive(
        intrafiExclusionId: String,
        params: IntrafiExclusionArchiveParams = IntrafiExclusionArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion =
        archive(params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(), requestOptions)

    /** @see archive */
    fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** @see archive */
    fun archive(intrafiExclusionId: String, requestOptions: RequestOptions): IntrafiExclusion =
        archive(intrafiExclusionId, IntrafiExclusionArchiveParams.none(), requestOptions)

    /**
     * A view of [IntrafiExclusionService] that provides access to raw HTTP responses for each
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
        ): IntrafiExclusionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionService.create].
         */
        @MustBeClosed
        fun create(
            params: IntrafiExclusionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions/{intrafi_exclusion_id}`, but is
         * otherwise the same as [IntrafiExclusionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            intrafiExclusionId: String,
            params: IntrafiExclusionRetrieveParams = IntrafiExclusionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion> =
            retrieve(
                params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            intrafiExclusionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> =
            retrieve(intrafiExclusionId, IntrafiExclusionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionService.list].
         */
        @MustBeClosed
        fun list(
            params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntrafiExclusionListResponse> =
            list(IntrafiExclusionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_exclusions/{intrafi_exclusion_id}/archive`, but is otherwise the same as
         * [IntrafiExclusionService.archive].
         */
        @MustBeClosed
        fun archive(
            intrafiExclusionId: String,
            params: IntrafiExclusionArchiveParams = IntrafiExclusionArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion> =
            archive(
                params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(),
                requestOptions,
            )

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /** @see archive */
        @MustBeClosed
        fun archive(
            intrafiExclusionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> =
            archive(intrafiExclusionId, IntrafiExclusionArchiveParams.none(), requestOptions)
    }
}
