// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPageAsync
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.services.async.entities.BeneficialOwnerServiceAsync
import com.increase.api.services.async.entities.SupplementalDocumentServiceAsync

interface EntityServiceAsync {

    fun beneficialOwners(): BeneficialOwnerServiceAsync

    fun supplementalDocuments(): SupplementalDocumentServiceAsync

    /** Create an Entity */
    suspend fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Retrieve an Entity */
    suspend fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List Entities */
    suspend fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntityListPageAsync

    /** Archive an Entity */
    suspend fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update a Natural Person or Corporation's address */
    suspend fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
