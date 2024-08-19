package com.increase.api.errors

open class IncreaseException constructor(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
