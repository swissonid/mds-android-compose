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

public val MediumGroup.ArrowsLeftRightDottedMedium: ImageVector
    get() {
        if (_arrowsLeftRightDottedMedium != null) {
            return _arrowsLeftRightDottedMedium!!
        }
        _arrowsLeftRightDottedMedium = Builder(name = "ArrowsLeftRightDottedMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.5f, 11.25f)
                    horizontalLineToRelative(6.75f)
                    moveToRelative(0.0f, 0.0f)
                    lineToRelative(-4.5f, 4.5f)
                    moveToRelative(4.5f, -4.5f)
                    lineToRelative(-4.5f, -4.5f)
                    moveToRelative(-11.25f, 18.0f)
                    horizontalLineTo(6.75f)
                    moveToRelative(0.0f, 0.0f)
                    lineToRelative(4.5f, -4.5f)
                    moveToRelative(-4.5f, 4.5f)
                    lineToRelative(4.5f, 4.5f)
                    moveToRelative(5.268f, -18.0f)
                    horizontalLineToRelative(-3.036f)
                    moveToRelative(7.536f, 0.0f)
                    horizontalLineToRelative(-3.036f)
                    moveToRelative(-5.964f, 0.0f)
                    horizontalLineTo(8.982f)
                    moveToRelative(-1.464f, 0.0f)
                    horizontalLineTo(5.982f)
                    moveToRelative(12.036f, 13.5f)
                    horizontalLineToRelative(-3.036f)
                    moveToRelative(7.536f, 0.0f)
                    horizontalLineToRelative(-3.036f)
                    moveToRelative(7.536f, 0.0f)
                    horizontalLineToRelative(-3.036f)
                    moveToRelative(6.036f, 0.0f)
                    horizontalLineToRelative(-1.536f)
                }
            }
        }
        .build()
        return _arrowsLeftRightDottedMedium!!
    }

private var _arrowsLeftRightDottedMedium: ImageVector? = null
