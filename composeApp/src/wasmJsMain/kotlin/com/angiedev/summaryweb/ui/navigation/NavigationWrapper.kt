package com.angiedev.summaryweb.ui.navigation

import androidx.compose.runtime.Composable
import com.angiedev.summaryweb.ui.screen.links.LinksScreen
import com.angiedev.summaryweb.ui.screen.portfolio.PortfolioScreen
import com.angiedev.summaryweb.ui.core.getCurrentPath

@Composable
fun NavigationWrapper() {
    when (getCurrentPath()) {
        "/links" -> LinksScreen()
        else -> PortfolioScreen()
    }
}