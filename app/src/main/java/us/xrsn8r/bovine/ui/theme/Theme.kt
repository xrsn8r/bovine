package us.xrsn8r.bovine.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6EB8B0),
    onPrimary = Color(0xFF0A0C0E),
    background = Color(0xFF0A0C0E),
    surface = Color(0xFF121416),
    surfaceContainer = Color(0xFF1A1C1E)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF3D8A86),
    onPrimary = Color(0xFFE8EEEA),
    background = Color(0xFFE8EEEA),
    surface = Color(0xFFF5F7F6)
)

@Composable
fun BovineTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialExpressiveTheme(
        colorScheme = colorScheme,
        content = content
    )
}
