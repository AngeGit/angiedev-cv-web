package com.angiedev.summaryweb.ui.screen.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angiedev.summaryweb.ui.core.PortfolioColorScreen

@Composable
fun PortfolioScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PortfolioColorScreen)
    )
}