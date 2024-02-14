// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPageAsync
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams

interface PhysicalCardProfileServiceAsync {

    /** Create a Physical Card Profile */
    suspend fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** Retrieve a Card Profile */
    suspend fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** List Physical Card Profiles */
    suspend fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfileListPageAsync

    /** Archive a Physical Card Profile */
    suspend fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile

    /** Clone a Physical Card Profile */
    suspend fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardProfile
}
