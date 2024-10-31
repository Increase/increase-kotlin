// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityConfirmParams
import com.increase.api.models.EntityCreateBeneficialOwnerParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPageAsync
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.models.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.EntityUpdateIndustryCodeParams

interface EntityServiceAsync {

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

    /** Archive a beneficial owner for a corporate Entity */
    suspend fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    suspend fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Create a beneficial owner for a corporate Entity */
    suspend fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update a Natural Person or Corporation's address */
    suspend fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    suspend fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update the industry code for a corporate Entity */
    suspend fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
