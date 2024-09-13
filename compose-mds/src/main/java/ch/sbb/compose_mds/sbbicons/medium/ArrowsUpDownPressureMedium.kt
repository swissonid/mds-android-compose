package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.ArrowsUpDownPressureMedium: ImageVector
    get() {
        if (_arrowsUpDownPressureMedium != null) {
            return _arrowsUpDownPressureMedium!!
        }
        _arrowsUpDownPressureMedium = Builder(name = "ArrowsUpDownPressureMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveToRelative(14.996f, 10.488f)
                    lineToRelative(3.754f, 3.762f)
                    moveToRelative(0.0f, 0.0f)
                    lineToRelative(3.75f, -3.75f)
                    moveToRelative(-3.75f, 3.75f)
                    verticalLineTo(4.5f)
                    moveTo(22.5f, 27.0f)
                    lineToRelative(-3.75f, -3.75f)
                    moveToRelative(0.0f, 0.0f)
                    lineToRelative(-3.754f, 3.762f)
                    moveToRelative(3.754f, -3.762f)
                    verticalLineTo(33.0f)
                    moveToRelative(10.5f, -12.75f)
                    horizontalLineToRelative(-21.0f)
                    verticalLineToRelative(-3.0f)
                    horizontalLineToRelative(21.0f)
                    close()
                }
            }
        }
        .build()
        return _arrowsUpDownPressureMedium!!
    }

private var _arrowsUpDownPressureMedium: ImageVector? = null
