package com.me.lab1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

const val DEFAULT_PADDING = 44

private val DarkColorPalette = darkColorScheme(
    primary = Purple200,
    onPrimary = Color.White,
    background = DarkPurple
)

@Composable
fun FluidBottomNavigationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
