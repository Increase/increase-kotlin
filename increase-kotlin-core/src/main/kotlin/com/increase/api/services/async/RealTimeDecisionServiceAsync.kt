// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams

interface RealTimeDecisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Real-Time Decision */
    suspend fun retrieve(
        realTimeDecisionId: String,
        params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision =
        retrieve(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** @see [retrieve] */
    suspend fun retrieve(
        realTimeDecisionId: String,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

    /** Action a Real-Time Decision */
    suspend fun action(
        realTimeDecisionId: String,
        params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision =
        action(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [action] */
    suspend fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** @see [action] */
    suspend fun action(
        realTimeDecisionId: String,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)

    /**
     * A view of [RealTimeDecisionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /real_time_decisions/{real_time_decision_id}`, but
         * is otherwise the same as [RealTimeDecisionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            realTimeDecisionId: String,
            params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision> =
            retrieve(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> =
            retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_decisions/{real_time_decision_id}/action`, but is otherwise the same as
         * [RealTimeDecisionServiceAsync.action].
         */
        @MustBeClosed
        suspend fun action(
            realTimeDecisionId: String,
            params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision> =
            action(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [action] */
        @MustBeClosed
        suspend fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>

        /** @see [action] */
        @MustBeClosed
        suspend fun action(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> =
            action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)
    }
}
