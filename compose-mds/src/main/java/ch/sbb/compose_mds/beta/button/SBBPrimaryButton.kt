package ch.sbb.compose_mds.beta.button

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
fun SBBPrimaryButton(
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
    containerColor = if (pressed) SBBColors.red125 else SBBColors.red,
    contentColor = SBBColors.white,
    disabledContainerColor = SBBColors.graphite,
    disabledContentColor = SBBColors.white
)

@Composable
private fun darkModeColors(pressed: Boolean): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = if (pressed) SBBColors.red125 else SBBColors.red,
    contentColor = SBBColors.white,
    disabledContainerColor = SBBColors.iron,
    disabledContentColor = SBBColors.smoke
)