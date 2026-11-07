// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbookchecks.CheckbookCheck
import com.increase.api.models.checkbookchecks.CheckbookCheckListPageAsync
import com.increase.api.models.checkbookchecks.CheckbookCheckListParams
import com.increase.api.models.checkbookchecks.CheckbookCheckRetrieveParams
import com.increase.api.models.checkbookchecks.CheckbookCheckStopParams

interface CheckbookCheckServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckbookCheckServiceAsync

    /** Retrieve a Checkbook Check */
    suspend fun retrieve(
        checkbookCheckId: String,
        params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck =
        retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CheckbookCheckRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck

    /** @see retrieve */
    suspend fun retrieve(checkbookCheckId: String, requestOptions: RequestOptions): CheckbookCheck =
        retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

    /** List Checkbook Checks */
    suspend fun list(
        params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheckListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CheckbookCheckListPageAsync =
        list(CheckbookCheckListParams.none(), requestOptions)

    /** Stop a Checkbook Check. A stopped check cannot be deposited. */
    suspend fun stop(
        checkbookCheckId: String,
        params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck =
        stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see stop */
    suspend fun stop(
        params: CheckbookCheckStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck

    /** @see stop */
    suspend fun stop(checkbookCheckId: String, requestOptions: RequestOptions): CheckbookCheck =
        stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)

    /**
     * A view of [CheckbookCheckServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckbookCheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /checkbook_checks/{checkbook_check_id}`, but is
         * otherwise the same as [CheckbookCheckServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            checkbookCheckId: String,
            params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck> =
            retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CheckbookCheckRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> =
            retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbook_checks`, but is otherwise the same as
         * [CheckbookCheckServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheckListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CheckbookCheckListPageAsync> =
            list(CheckbookCheckListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbook_checks/{checkbook_check_id}/stop`, but
         * is otherwise the same as [CheckbookCheckServiceAsync.stop].
         */
        @MustBeClosed
        suspend fun stop(
            checkbookCheckId: String,
            params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck> =
            stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        suspend fun stop(
            params: CheckbookCheckStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck>

        /** @see stop */
        @MustBeClosed
        suspend fun stop(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> =
            stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)
    }
}
