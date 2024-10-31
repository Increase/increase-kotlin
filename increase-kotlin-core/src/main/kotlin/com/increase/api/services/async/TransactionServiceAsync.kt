// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Transaction
import com.increase.api.models.TransactionListPageAsync
import com.increase.api.models.TransactionListParams
import com.increase.api.models.TransactionRetrieveParams

interface TransactionServiceAsync {

    /** Retrieve a Transaction */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** List Transactions */
    suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPageAsync
}
