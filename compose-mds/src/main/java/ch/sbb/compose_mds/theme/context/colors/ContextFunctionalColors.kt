package ch.sbb.compose_mds.theme.context.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

@Immutable
data class ContextFunctionalColors(
    val success: Color = PrimitiveColors.green,
    val warning: Color = PrimitiveColors.peach,
    val error: Color = PrimitiveColors.red125,
    val errorDark: Color = PrimitiveColors.red85,
    val brand: Color = PrimitiveColors.red,
    val products: Color = PrimitiveColors.red,
)
