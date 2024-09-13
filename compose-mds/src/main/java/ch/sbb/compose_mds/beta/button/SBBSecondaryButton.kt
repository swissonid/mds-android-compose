package ch.sbb.compose_mds.beta.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.SBBColors

@ExperimentalSBBComponent
@Composable
fun SBBSecondaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()

    Button(
        modifier = modifier.height(44.dp),
        enabled = enabled,
        onClick = onClick,
        shape = RoundedCornerShape(22.dp),
        border = if (isSystemInDarkTheme()) darkModeBorder(enabled) else lightModeBorder(enabled),
        colors = if (isSystemInDarkTheme()) darkModeColors(pressed) else lightModeColors(pressed),
        interactionSource = interactionSource,
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

@Composable
private fun lightModeColors(pressed: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (pressed) SBBColors.graphite else SBBColors.white,
    contentColor = SBBColors.red,
    disabledContainerColor = SBBColors.white,
    disabledContentColor = SBBColors.graphite
)

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (pressed) SBBColors.charcoal else SBBColors.iron,
    contentColor = SBBColors.white,
    disabledContainerColor = SBBColors.iron,
    disabledContentColor = SBBColors.smoke
)

@Composable
private fun lightModeBorder(enabled: Boolean): BorderStroke =
    BorderStroke(1.dp, if (enabled) SBBColors.red else SBBColors.cloud)

@Composable
private fun darkModeBorder(enabled: Boolean): BorderStroke =
    BorderStroke(1.dp, if (enabled) SBBColors.smoke else SBBColors.iron)