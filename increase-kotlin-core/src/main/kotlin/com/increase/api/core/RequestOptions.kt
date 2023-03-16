package com.increase.api.core

class RequestOptions private constructor(val responseValidation: Boolean?) {

    companion object {

        private val NONE = builder().build()

        fun none() = NONE

        fun builder() = Builder()
    }

    class Builder {
        private var responseValidation: Boolean? = null

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun build(): RequestOptions {
            return RequestOptions(responseValidation)
        }
    }
}
