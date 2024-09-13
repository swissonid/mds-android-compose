package ch.sbb.compose_mds.beta.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.SBBColors

@ExperimentalSBBComponent
@Composable
fun SBBTertiaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String? = null,
    icon: ImageVector? = null,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()

    var buttonModifier = modifier
    if (label == null) {
        buttonModifier = buttonModifier.width(44.dp)
    }

    Button(
        modifier = buttonModifier.height(44.dp),
        enabled = enabled,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        border = if (isSystemInDarkTheme()) darkModeBorder(enabled) else lightModeBorder(enabled),
        colors = if (isSystemInDarkTheme()) darkModeColors(pressed) else lightModeColors(pressed),
        contentPadding = contentPadding(label),
        interactionSource = interactionSource,
    ) {

        if (icon != null) {
            Icon(
                modifier = Modifier.padding(end = if (label != null) 4.dp else 0.dp),
                imageVector = icon,
                contentDescription = null,
                tint = iconColor(enabled = enabled),
            )
        }
        if (label != null) {
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}

private fun contentPadding(label: String?): PaddingValues {
    return PaddingValues(
        start = if (label == null) 0.dp else 16.dp,
        top = 10.dp,
        end = if (label == null) 0.dp else 16.dp,
        bottom = 10.dp
    )
}

@Composable
private fun iconColor(enabled: Boolean): Color {
    return if (isSystemInDarkTheme()) {
        if (enabled) SBBColors.white else SBBColors.smoke
    } else {
        if (enabled) SBBColors.black else SBBColors.cloud
    }
}

@Composable
private fun lightModeColors(pressed: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (pressed) SBBColors.graphite else SBBColors.white,
    contentColor = SBBColors.black,
    disabledContainerColor = SBBColors.white,
    disabledContentColor = SBBColors.cloud
)

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (pressed) SBBColors.black else SBBColors.charcoal,
    contentColor = SBBColors.white,
    disabledContainerColor = SBBColors.black,
    disabledContentColor = SBBColors.smoke
)

@Composable
private fun lightModeBorder(enabled: Boolean): BorderStroke =
    BorderStroke(1.dp, if (enabled) SBBColors.smoke else SBBColors.cloud)

@Composable
private fun darkModeBorder(enabled: Boolean): BorderStroke =
    BorderStroke(1.dp, if (enabled) SBBColors.smoke else SBBColors.iron)