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

public val MediumGroup.HandClockMedium: ImageVector
    get() {
        if (_handClockMedium != null) {
            return _handClockMedium!!
        }
        _handClockMedium = Builder(name = "HandClockMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.5f, 24.75f)
                    arcTo(9.75f, 9.75f, 0.0f, false, true, 3.75f, 15.0f)
                    curveToRelative(0.0f, -5.385f, 4.366f, -9.75f, 9.75f, -9.75f)
                    curveToRelative(1.624f, 0.0f, 3.154f, 0.397f, 4.5f, 1.098f)
                    moveTo(12.75f, 9.0f)
                    verticalLineToRelative(6.75f)
                    horizontalLineTo(18.0f)
                    moveToRelative(2.249f, 15.0f)
                    horizontalLineTo(30.75f)
                    reflectiveCurveToRelative(1.496f, -3.0f, 1.496f, -6.0f)
                    lineToRelative(0.004f, -12.005f)
                    arcToRelative(1.495f, 1.495f, 0.0f, false, false, -2.99f, -0.003f)
                    lineToRelative(-0.01f, 6.758f)
                    verticalLineTo(8.25f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                    verticalLineTo(19.5f)
                    verticalLineTo(6.74f)
                    arcToRelative(1.49f, 1.49f, 0.0f, false, false, -2.982f, -0.001f)
                    lineToRelative(-0.018f, 12.76f)
                    lineToRelative(0.015f, -11.245f)
                    arcToRelative(1.508f, 1.508f, 0.0f, true, false, -3.015f, -0.002f)
                    lineToRelative(-0.002f, 14.422f)
                    lineToRelative(-3.355f, -3.392f)
                    arcToRelative(1.486f, 1.486f, 0.0f, false, false, -2.338f, 1.8f)
                    close()
                }
            }
        }
        .build()
        return _handClockMedium!!
    }

private var _handClockMedium: ImageVector? = null
