import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBTypography

object SBBThemeData {
    val lightColorScheme = lightColorScheme(
        surface = SBBColors.milk,
        onSurface = SBBColors.black,
        surfaceVariant = SBBColors.white,
        onSurfaceVariant = SBBColors.black,
        surfaceContainerHighest = SBBColors.white,
        primary = SBBColors.red,
        onPrimary = SBBColors.white,
    )

    val darkColorScheme = darkColorScheme(
        surface = SBBColors.black,
        onSurface = SBBColors.white,
        surfaceVariant = SBBColors.charcoal,
        onSurfaceVariant = SBBColors.white,
        surfaceContainerHighest = SBBColors.charcoal,
        primary = SBBColors.red,
        onPrimary = SBBColors.white,
    )
}

@Composable
fun SBBTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontFamily: FontFamily? = null,
    content: @Composable () -> Unit,
) {
    return MaterialTheme(
        typography = SBBTypography.default(fontFamily = fontFamily),
        colorScheme = if (darkTheme) SBBThemeData.darkColorScheme else SBBThemeData.lightColorScheme,
        content = content,
    )
}
