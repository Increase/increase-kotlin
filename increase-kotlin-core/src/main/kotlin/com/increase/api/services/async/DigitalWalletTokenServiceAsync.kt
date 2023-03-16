@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPageAsync
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams

interface DigitalWalletTokenServiceAsync {

    /** Retrieve a Digital Wallet Token */
    suspend fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalWalletToken

    /** List Digital Wallet Tokens */
    suspend fun list(
        params: DigitalWalletTokenListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalWalletTokenListPageAsync
}
