// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPageAsync
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams

interface PendingTransactionServiceAsync {

    /** Retrieve a Pending Transaction */
    suspend fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PendingTransaction

    /** List Pending Transactions */
    suspend fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PendingTransactionListPageAsync
}
