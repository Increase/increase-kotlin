// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListResponse

interface SupplementalDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SupplementalDocumentServiceAsync

    /** Create a supplemental document for an Entity */
    suspend fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitySupplementalDocument

    /** List Entity Supplemental Document Submissions */
    suspend fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupplementalDocumentListResponse

    /**
     * A view of [SupplementalDocumentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SupplementalDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitySupplementalDocument>

        /**
         * Returns a raw HTTP response for `get /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupplementalDocumentListResponse>
    }
}
