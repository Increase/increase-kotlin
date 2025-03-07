// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPageAsync
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams

interface IntrafiExclusionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an IntraFi Exclusion */
    suspend fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    suspend fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

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
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /**
     * A view of [IntrafiExclusionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

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
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

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
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>
    }
}
