package com.angiedev.summaryweb.ui.screen.links

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angiedev.summaryweb.ui.core.LinksColorScreen

@Composable
fun LinksScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LinksColorScreen)
    )
}