package ch.sbb.compose_mds.composables.checkbox

import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.SBBColors

internal enum class SBBCheckboxColors(
    val borderColor: Color,
    val checkColor: Color,
    val indeterminateColor: Color,
    val textColor: Color,
    val backgroundColor: Color
) {
    LIGHT_ENABLED(
        borderColor = SBBColors.granite,
        checkColor = SBBColors.red,
        indeterminateColor = SBBColors.red,
        textColor = SBBColors.black,
        backgroundColor = SBBColors.white,
    ),
    DARK_ENABLED(
        borderColor = SBBColors.cloud,
        checkColor = SBBColors.red,
        indeterminateColor = SBBColors.red,
        textColor = SBBColors.white,
        backgroundColor = SBBColors.black,
    ),
    LIGHT_DISABLED(
        borderColor = SBBColors.cloud,
        checkColor = SBBColors.granite,
        indeterminateColor = SBBColors.granite,
        textColor = SBBColors.granite,
        backgroundColor = SBBColors.white,
    ),
    DARK_DISABLED(
        borderColor = SBBColors.iron,
        checkColor = SBBColors.graphite,
        indeterminateColor = SBBColors.graphite,
        textColor = SBBColors.graphite,
        backgroundColor = SBBColors.black,
    );
}