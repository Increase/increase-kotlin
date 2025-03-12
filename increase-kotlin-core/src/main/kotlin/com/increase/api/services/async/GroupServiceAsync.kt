// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.groups.Group
import com.increase.api.models.groups.GroupRetrieveParams

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Returns details for the currently authenticated Group. */
    suspend fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see [retrieve] */
    suspend fun retrieve(requestOptions: RequestOptions): Group =
        retrieve(GroupRetrieveParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /groups/current`, but is otherwise the same as
         * [GroupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Group> =
            retrieve(GroupRetrieveParams.none(), requestOptions)
    }
}
