package ch.sbb.compose_mds.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp

object SBBConst {
    val DEFAULT_PADDING = 16.dp
    val HALF_PADDING = DEFAULT_PADDING.div(2.0f)
    val DEFAULT_VERTICAL_PADDING = DEFAULT_PADDING
    val DEFAULT_HORIZONTAL_PADDING = HALF_PADDING
}

val Modifier.defaultPadding
    get() = this.padding(
        horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING,
        vertical = SBBConst.DEFAULT_VERTICAL_PADDING,
    )

val Modifier.elementPadding
    get() = this.padding(
        horizontal = SBBConst.DEFAULT_PADDING,
        vertical = SBBConst.HALF_PADDING,
    )

val Int.asImageVector
    @Composable get() = ImageVector.vectorResource(id = this)