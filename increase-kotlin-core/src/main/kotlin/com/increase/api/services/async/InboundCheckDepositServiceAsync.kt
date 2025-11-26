// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPageAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundCheckDepositServiceAsync

    /** Retrieve an Inbound Check Deposit */
    suspend fun retrieve(
        inboundCheckDepositId: String,
        params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        retrieve(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** @see retrieve */
    suspend fun retrieve(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none(), requestOptions)

    /** List Inbound Check Deposits */
    suspend fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDepositListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): InboundCheckDepositListPageAsync =
        list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    suspend fun decline(
        inboundCheckDepositId: String,
        params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        decline(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see decline */
    suspend fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** @see decline */
    suspend fun decline(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

    /** Return an Inbound Check Deposit */
    suspend fun return_(
        inboundCheckDepositId: String,
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        return_(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see return_ */
    suspend fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /**
     * A view of [InboundCheckDepositServiceAsync] that provides access to raw HTTP responses for
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
        ): InboundCheckDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits/{inbound_check_deposit_id}`,
         * but is otherwise the same as [InboundCheckDepositServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundCheckDepositId: String,
            params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            retrieve(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> =
            retrieve(
                inboundCheckDepositId,
                InboundCheckDepositRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDepositListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundCheckDepositListPageAsync> =
            list(InboundCheckDepositListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/decline`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.decline].
         */
        @MustBeClosed
        suspend fun decline(
            inboundCheckDepositId: String,
            params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            decline(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see decline */
        @MustBeClosed
        suspend fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /** @see decline */
        @MustBeClosed
        suspend fun decline(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> =
            decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/return`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.return_].
         */
        @MustBeClosed
        suspend fun return_(
            inboundCheckDepositId: String,
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            return_(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see return_ */
        @MustBeClosed
        suspend fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>
    }
}
