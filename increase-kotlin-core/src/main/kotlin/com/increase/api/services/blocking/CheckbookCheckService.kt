// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbookchecks.CheckbookCheck
import com.increase.api.models.checkbookchecks.CheckbookCheckListPage
import com.increase.api.models.checkbookchecks.CheckbookCheckListParams
import com.increase.api.models.checkbookchecks.CheckbookCheckRetrieveParams
import com.increase.api.models.checkbookchecks.CheckbookCheckStopParams

interface CheckbookCheckService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckbookCheckService

    /** Retrieve a Checkbook Check */
    fun retrieve(
        checkbookCheckId: String,
        params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck =
        retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CheckbookCheckRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck

    /** @see retrieve */
    fun retrieve(checkbookCheckId: String, requestOptions: RequestOptions): CheckbookCheck =
        retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

    /** List Checkbook Checks */
    fun list(
        params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheckListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CheckbookCheckListPage =
        list(CheckbookCheckListParams.none(), requestOptions)

    /** Stop a Checkbook Check. A stopped check cannot be deposited. */
    fun stop(
        checkbookCheckId: String,
        params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck =
        stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see stop */
    fun stop(
        params: CheckbookCheckStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookCheck

    /** @see stop */
    fun stop(checkbookCheckId: String, requestOptions: RequestOptions): CheckbookCheck =
        stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)

    /**
     * A view of [CheckbookCheckService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckbookCheckService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /checkbook_checks/{checkbook_check_id}`, but is
         * otherwise the same as [CheckbookCheckService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            checkbookCheckId: String,
            params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck> =
            retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CheckbookCheckRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> =
            retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbook_checks`, but is otherwise the same as
         * [CheckbookCheckService.list].
         */
        @MustBeClosed
        fun list(
            params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheckListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckbookCheckListPage> =
            list(CheckbookCheckListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbook_checks/{checkbook_check_id}/stop`, but
         * is otherwise the same as [CheckbookCheckService.stop].
         */
        @MustBeClosed
        fun stop(
            checkbookCheckId: String,
            params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck> =
            stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: CheckbookCheckStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookCheck>

        /** @see stop */
        @MustBeClosed
        fun stop(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> =
            stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)
    }
}
