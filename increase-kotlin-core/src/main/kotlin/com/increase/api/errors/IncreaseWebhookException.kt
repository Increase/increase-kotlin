package com.increase.api.errors

class IncreaseWebhookException(message: String? = null, cause: Throwable? = null) :
    IncreaseException(message, cause)
