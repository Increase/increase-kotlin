// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiexclusions.IntrafiExclusion
import com.increase.api.models.intrafiexclusions.IntrafiExclusionArchiveParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListPageAsync
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionRetrieveParams

interface IntrafiExclusionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntrafiExclusionServiceAsync

    /** Create an IntraFi Exclusion */
    suspend fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    suspend fun retrieve(
        intrafiExclusionId: String,
        params: IntrafiExclusionRetrieveParams = IntrafiExclusionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion =
        retrieve(params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** @see [retrieve] */
    suspend fun retrieve(
        intrafiExclusionId: String,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        retrieve(intrafiExclusionId, IntrafiExclusionRetrieveParams.none(), requestOptions)

    /** List IntraFi Exclusions */
    suspend fun list(
        params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): IntrafiExclusionListPageAsync =
        list(IntrafiExclusionListParams.none(), requestOptions)

    /** Archive an IntraFi Exclusion */
    suspend fun archive(
        intrafiExclusionId: String,
        params: IntrafiExclusionArchiveParams = IntrafiExclusionArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion =
        archive(params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(), requestOptions)

    /** @see [archive] */
    suspend fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** @see [archive] */
    suspend fun archive(
        intrafiExclusionId: String,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        archive(intrafiExclusionId, IntrafiExclusionArchiveParams.none(), requestOptions)

    /**
     * A view of [IntrafiExclusionServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntrafiExclusionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: IntrafiExclusionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions/{intrafi_exclusion_id}`, but is
         * otherwise the same as [IntrafiExclusionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            intrafiExclusionId: String,
            params: IntrafiExclusionRetrieveParams = IntrafiExclusionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion> =
            retrieve(
                params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            intrafiExclusionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> =
            retrieve(intrafiExclusionId, IntrafiExclusionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntrafiExclusionListPageAsync> =
            list(IntrafiExclusionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_exclusions/{intrafi_exclusion_id}/archive`, but is otherwise the same as
         * [IntrafiExclusionServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            intrafiExclusionId: String,
            params: IntrafiExclusionArchiveParams = IntrafiExclusionArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion> =
            archive(
                params.toBuilder().intrafiExclusionId(intrafiExclusionId).build(),
                requestOptions,
            )

        /** @see [archive] */
        @MustBeClosed
        suspend fun archive(
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /** @see [archive] */
        @MustBeClosed
        suspend fun archive(
            intrafiExclusionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> =
            archive(intrafiExclusionId, IntrafiExclusionArchiveParams.none(), requestOptions)
    }
}
