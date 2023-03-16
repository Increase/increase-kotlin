@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPageAsync
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams

interface DocumentServiceAsync {

    /** Retrieve a Document */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** List Documents */
    suspend fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DocumentListPageAsync
}
