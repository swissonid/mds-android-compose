package ch.sbb.compose_mds.beta.switch

import SBBTheme
import android.content.res.Configuration
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.SBBColors
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@ExperimentalSBBComponent
@Composable
fun SBBSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val darkTheme = isSystemInDarkTheme()
    Box(
        modifier = modifier.alpha(
            if (enabled) 1.0f else .5f,
        ),
    ) {
        val minBound = 0f
        val maxBound = 52f
        val valueToOffset = remember<(Boolean) -> Float>(minBound, maxBound) {
            { value -> if (value) maxBound else minBound }
        }
        val targetValue = valueToOffset(checked)
        val offset = remember { Animatable(targetValue) }
        val scope = rememberCoroutineScope()

        SideEffect {
            // min bound might have changed if the icon is only rendered in checked state.
            offset.updateBounds(lowerBound = minBound)
        }

        DisposableEffect(checked) {
            if (offset.targetValue != targetValue) {
                scope.launch {
                    offset.animateTo(targetValue, TweenSpec(durationMillis = 100))
                }
            }
            onDispose { }
        }

        Box(
            modifier = Modifier
                .toggleable(
                    value = checked,
                    onValueChange = {
                        onCheckedChange?.invoke(it)
                    },
                    enabled = enabled,
                    role = Role.Switch,
                    interactionSource = interactionSource,
                    indication = null,
                )
                .width(50.dp)
                .clip(RoundedCornerShape(50))
                .background(
                    if (checked) SBBColors.red
                    else if (darkTheme) SBBColors.metal
                    else SBBColors.smoke,
                ),
        ) {
            Box(
                modifier = Modifier
                    .offset { IntOffset(offset.value.roundToInt(), 0) }
                    .shadow(
                        elevation = 8.dp,
                        shape = CircleShape,
                    )
                    .padding(2.dp)
                    .clip(CircleShape)
                    .size(27.dp)
                    .background(SBBColors.white),
            )
        }

    }
}

@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SBBSwitchPreview() {
    val darkTheme = isSystemInDarkTheme()
    val firstChecked = remember { mutableStateOf(false) }
    val secondChecked = remember { mutableStateOf(true) }
    SBBTheme {
        Column(
            modifier = Modifier.background(
                if (darkTheme) SBBColors.black else SBBColors.white
            ),
        ) {
            Row(modifier = Modifier.padding(8.dp)) {
                SBBSwitch(
                    checked = firstChecked.value,
                    onCheckedChange = { firstChecked.value = it },
                )
                Spacer(modifier = Modifier.width(8.dp))
                SBBSwitch(
                    checked = secondChecked.value,
                    onCheckedChange = { secondChecked.value = it },
                )
            }
            Row(modifier = Modifier.padding(8.dp)) {
                SBBSwitch(
                    checked = firstChecked.value,
                    onCheckedChange = { firstChecked.value = it },
                    enabled = false,
                )
                Spacer(modifier = Modifier.width(8.dp))
                SBBSwitch(
                    checked = secondChecked.value,
                    onCheckedChange = { secondChecked.value = it },
                    enabled = false,
                )
            }
        }
    }
}
