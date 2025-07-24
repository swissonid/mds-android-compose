package ch.sbb.compose_mds.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ch.sbb.compose_mds.theme.context.OffBrandThemeContext
import ch.sbb.compose_mds.theme.context.SBBThemeContext
import ch.sbb.compose_mds.theme.context.SafetyRelevantThemeContext
import ch.sbb.compose_mds.theme.context.ThemeContext

internal const val PREVIEW_GROUP = "SBB Themes"

/**
 * Data class to hold a single theme configuration for iteration.
 */
class ThemePreviewConfig(
    val themeContext: ThemeContext,
    val group: String = PREVIEW_GROUP,
) {
    val name: String = themeContext.contextName
}

/**
 * Provides a sequence of ThemePreviewConfig objects for @PreviewParameter.
 * Each item in this sequence will generate a separate preview.
 */
class SBBThemeConfigProvider : PreviewParameterProvider<ThemePreviewConfig> {
    override val values: Sequence<ThemePreviewConfig> =
        sequenceOf(
            ThemePreviewConfig(SBBThemeContext),
            ThemePreviewConfig(SafetyRelevantThemeContext),
            ThemePreviewConfig(OffBrandThemeContext),
        )
}
