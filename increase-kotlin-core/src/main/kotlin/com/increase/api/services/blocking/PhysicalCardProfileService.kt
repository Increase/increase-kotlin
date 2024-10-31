// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPage
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams

interface PhysicalCardProfileService {

    /** Create a Physical Card Profile */
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** Retrieve a Card Profile */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** List Physical Card Profiles */
    fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfileListPage

    /** Archive a Physical Card Profile */
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** Clone a Physical Card Profile */
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile
}
