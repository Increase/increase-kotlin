// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntitySupplementalDocumentCreateParams
import com.increase.api.models.EntitySupplementalDocumentListPage
import com.increase.api.models.EntitySupplementalDocumentListParams

interface SupplementalDocumentService {

    /** Create a supplemental document for an Entity */
    fun create(
        params: EntitySupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List Entity Supplemental Document Submissions */
    fun list(
        params: EntitySupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntitySupplementalDocumentListPage
}
