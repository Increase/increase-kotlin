// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPageAsync
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams

interface DeclinedTransactionServiceAsync {

    /** Retrieve a Declined Transaction */
    suspend fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** List Declined Transactions */
    suspend fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransactionListPageAsync

    /** List Declined Transactions */
    suspend fun list(requestOptions: RequestOptions): DeclinedTransactionListPageAsync =
        list(DeclinedTransactionListParams.none(), requestOptions)
}
