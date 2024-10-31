// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.File
import com.increase.api.models.FileCreateParams
import com.increase.api.models.FileListPageAsync
import com.increase.api.models.FileListParams
import com.increase.api.models.FileRetrieveParams

interface FileServiceAsync {

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    suspend fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): File

    /** Retrieve a File */
    suspend fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): File

    /** List Files */
    suspend fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FileListPageAsync
}
