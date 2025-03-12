// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.interestpayments.InterestPaymentCreateParams
import com.increase.api.models.transactions.Transaction

interface InterestPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an interest payment to your account. In production, this happens
     * automatically on the first of each month.
     */
    suspend fun create(params: InterestPaymentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Transaction

    /**
     * A view of [InterestPaymentServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/interest_payments`, but is
         * otherwise the same as [InterestPaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: InterestPaymentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Transaction>
    }
}
