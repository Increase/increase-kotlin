package com.increase.api.errors

open class IncreaseException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
