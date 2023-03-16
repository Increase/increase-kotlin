@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPage
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.services.blocking.entities.SupplementalDocumentService

interface EntityService {

    fun supplementalDocuments(): SupplementalDocumentService

    /** Create an Entity */
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Retrieve an Entity */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List Entities */
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntityListPage
}
