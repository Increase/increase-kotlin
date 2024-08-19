// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPage
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams

interface PendingTransactionService {

    /** Retrieve a Pending Transaction */
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PendingTransaction

    /** List Pending Transactions */
    fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PendingTransactionListPage
}
