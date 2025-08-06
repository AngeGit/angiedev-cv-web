package com.angiedev.summaryweb.ui.core

import kotlinx.browser.window

fun isWebSystemInDarkTheme(): Boolean {
    val darkThemeMediaQuery = window.matchMedia("(prefers-color-scheme: dark)")
    return darkThemeMediaQuery.matches
}

fun getCurrentPath(): String = window.location.pathname

