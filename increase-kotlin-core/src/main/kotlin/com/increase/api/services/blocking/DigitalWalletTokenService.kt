// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPage
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams

interface DigitalWalletTokenService {

    /** Retrieve a Digital Wallet Token */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** List Digital Wallet Tokens */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListPage

    /** List Digital Wallet Tokens */
    fun list(requestOptions: RequestOptions): DigitalWalletTokenListPage =
        list(DigitalWalletTokenListParams.none(), requestOptions)
}
