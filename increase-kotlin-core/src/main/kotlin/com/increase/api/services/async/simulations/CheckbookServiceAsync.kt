// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.simulations.checkbooks.CheckbookMailParams

interface CheckbookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckbookServiceAsync

    /**
     * Simulates the mailing of a [Checkbook](#checkbooks), which happens periodically throughout
     * the day in production but can be sped up in sandbox. This Checkbook must have a `status` of
     * `pending_submission` or `pending_mailing`.
     */
    suspend fun mail(
        checkbookId: String,
        params: CheckbookMailParams = CheckbookMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see mail */
    suspend fun mail(
        params: CheckbookMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see mail */
    suspend fun mail(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        mail(checkbookId, CheckbookMailParams.none(), requestOptions)

    /**
     * A view of [CheckbookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckbookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/checkbooks/{checkbook_id}/mail`, but
         * is otherwise the same as [CheckbookServiceAsync.mail].
         */
        @MustBeClosed
        suspend fun mail(
            checkbookId: String,
            params: CheckbookMailParams = CheckbookMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see mail */
        @MustBeClosed
        suspend fun mail(
            params: CheckbookMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see mail */
        @MustBeClosed
        suspend fun mail(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> =
            mail(checkbookId, CheckbookMailParams.none(), requestOptions)
    }
}
