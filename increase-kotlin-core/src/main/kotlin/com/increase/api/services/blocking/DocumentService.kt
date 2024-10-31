// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPage
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams

interface DocumentService {

    /** Retrieve a Document */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** List Documents */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DocumentListPage
}
