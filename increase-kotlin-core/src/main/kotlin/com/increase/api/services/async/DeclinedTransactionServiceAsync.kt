@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
        requestOptions: RequestOptions = RequestOptions.none()
    ): DeclinedTransaction

    /** List Declined Transactions */
    suspend fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DeclinedTransactionListPageAsync
}
