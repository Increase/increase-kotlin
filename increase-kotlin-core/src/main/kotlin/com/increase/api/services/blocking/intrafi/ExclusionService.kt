// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.intrafi

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams

interface ExclusionService {

    /** Create an IntraFi Exclusion */
    fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiExclusion

    /** List IntraFi Exclusions. */
    fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiExclusionListPage

    /** Archive an IntraFi Exclusion */
    fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiExclusion
}
