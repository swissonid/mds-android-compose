package ch.sbb.compose_mds.theme.context

import androidx.compose.runtime.staticCompositionLocalOf
import ch.sbb.compose_mds.theme.context.colors.ThemeContextColors

interface ThemeContext : ThemeContextColors {
    val contextName: String
}

internal val LocalThemeContext = staticCompositionLocalOf<ThemeContext> { SBBThemeContext }
