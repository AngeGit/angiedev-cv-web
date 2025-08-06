package com.angiedev.summaryweb

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.angiedev.summaryweb.ui.navigation.NavigationWrapper

@Composable
fun App() {
    MaterialTheme {
        NavigationWrapper()
    }
}