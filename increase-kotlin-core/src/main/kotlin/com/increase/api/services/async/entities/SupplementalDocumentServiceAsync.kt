@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntitySupplementalDocumentCreateParams
import com.increase.api.models.EntitySupplementalDocumentListPageAsync
import com.increase.api.models.EntitySupplementalDocumentListParams

interface SupplementalDocumentServiceAsync {

    /** Create a supplemental document for an Entity */
    suspend fun create(
        params: EntitySupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List Entity Supplemental Document Submissions */
    suspend fun list(
        params: EntitySupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntitySupplementalDocumentListPageAsync
}
