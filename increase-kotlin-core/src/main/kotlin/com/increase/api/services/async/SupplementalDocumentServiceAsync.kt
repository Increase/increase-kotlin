// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPageAsync
import com.increase.api.models.SupplementalDocumentListParams

interface SupplementalDocumentServiceAsync {

    /** Create a supplemental document for an Entity */
    suspend fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntitySupplementalDocument

    /** List Entity Supplemental Document Submissions */
    suspend fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SupplementalDocumentListPageAsync
}
