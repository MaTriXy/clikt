package com.github.ajalt.clikt.testing

import com.github.ajalt.clikt.core.UsageError
import com.github.ajalt.clikt.output.ParameterFormatter
import com.github.ajalt.clikt.output.defaultLocalization

val Throwable.formattedMessage: String?
    get() = (this as? UsageError)?.formatMessage(
        context?.localization ?: defaultLocalization,
        ParameterFormatter.Plain
    )  ?: message
