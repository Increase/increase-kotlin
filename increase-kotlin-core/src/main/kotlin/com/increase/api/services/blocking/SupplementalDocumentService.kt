// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPage
import com.increase.api.models.SupplementalDocumentListParams

interface SupplementalDocumentService {

    /** Create a supplemental document for an Entity */
    fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntitySupplementalDocument

    /** List Entity Supplemental Document Submissions */
    fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SupplementalDocumentListPage
}
