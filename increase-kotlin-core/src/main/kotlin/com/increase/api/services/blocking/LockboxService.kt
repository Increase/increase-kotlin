// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Lockbox
import com.increase.api.models.LockboxCreateParams
import com.increase.api.models.LockboxListPage
import com.increase.api.models.LockboxListParams
import com.increase.api.models.LockboxRetrieveParams
import com.increase.api.models.LockboxUpdateParams

interface LockboxService {

    /** Create a Lockbox */
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Lockbox

    /** Retrieve a Lockbox */
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Lockbox

    /** Update a Lockbox */
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Lockbox

    /** List Lockboxes */
    fun list(
        params: LockboxListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LockboxListPage
}
