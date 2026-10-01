// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatch
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCancelParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCompleteParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams

interface PhysicalCheckBatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PhysicalCheckBatchServiceAsync

    /** Create a Physical Check Batch */
    suspend fun create(
        params: PhysicalCheckBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** Cancel a pending Physical Check Batch, which cancels all of its related checks. */
    suspend fun cancel(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch =
        cancel(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see cancel */
    suspend fun cancel(
        params: PhysicalCheckBatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** @see cancel */
    suspend fun cancel(
        physicalCheckBatchId: String,
        requestOptions: RequestOptions,
    ): PhysicalCheckBatch =
        cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

    /**
     * Completing a Physical Check Batch closes it to new Physical Checks and begins the process of
     * printing and mailing it.
     */
    suspend fun complete(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch =
        complete(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see complete */
    suspend fun complete(
        params: PhysicalCheckBatchCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** @see complete */
    suspend fun complete(
        physicalCheckBatchId: String,
        requestOptions: RequestOptions,
    ): PhysicalCheckBatch =
        complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)

    /**
     * A view of [PhysicalCheckBatchServiceAsync] that provides access to raw HTTP responses for
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
        ): PhysicalCheckBatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_check_batches`, but is otherwise the same
         * as [PhysicalCheckBatchServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PhysicalCheckBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/cancel`, but is otherwise the same as
         * [PhysicalCheckBatchServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            cancel(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: PhysicalCheckBatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> =
            cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/complete`, but is otherwise the same as
         * [PhysicalCheckBatchServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            complete(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see complete */
        @MustBeClosed
        suspend fun complete(
            params: PhysicalCheckBatchCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /** @see complete */
        @MustBeClosed
        suspend fun complete(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> =
            complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)
    }
}
