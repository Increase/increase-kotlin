// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPage
import com.increase.api.models.SupplementalDocumentListParams

interface SupplementalDocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a supplemental document for an Entity */
    fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitySupplementalDocument

    /** List Entity Supplemental Document Submissions */
    fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupplementalDocumentListPage

    /**
     * A view of [SupplementalDocumentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentService.create].
         */
        @MustBeClosed
        fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitySupplementalDocument>

        /**
         * Returns a raw HTTP response for `get /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentService.list].
         */
        @MustBeClosed
        fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupplementalDocumentListPage>
    }
}
