@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityBeneficialOwnerArchiveParams
import com.increase.api.models.EntityBeneficialOwnerCreateParams
import com.increase.api.models.EntityBeneficialOwnerUpdateAddressParams

interface BeneficialOwnerServiceAsync {

    /** Create a beneficial owner for a corporate Entity */
    suspend fun create(
        params: EntityBeneficialOwnerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Archive a beneficial owner for a corporate Entity */
    suspend fun archive(
        params: EntityBeneficialOwnerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    suspend fun updateAddress(
        params: EntityBeneficialOwnerUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
