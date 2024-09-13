package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.HandClockSmall: ImageVector
    get() {
        if (_handClockSmall != null) {
            return _handClockSmall!!
        }
        _handClockSmall = Builder(name = "HandClockSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f)
                curveToRelative(1.082f, 0.0f, 2.103f, 0.264f, 3.0f, 0.732f)
                moveTo(8.5f, 6.0f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(12.0f)
                moveToRelative(1.499f, 10.0f)
                horizontalLineTo(20.5f)
                reflectiveCurveToRelative(0.998f, -2.0f, 0.998f, -4.0f)
                lineToRelative(0.002f, -8.003f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -1.993f, -0.002f)
                lineTo(19.5f, 13.0f)
                verticalLineTo(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(13.0f)
                verticalLineTo(4.494f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.988f, -0.002f)
                lineTo(15.5f, 13.0f)
                lineToRelative(0.01f, -7.497f)
                arcTo(1.005f, 1.005f, 0.0f, true, false, 13.5f, 5.5f)
                lineToRelative(-0.001f, 9.615f)
                lineToRelative(-2.237f, -2.261f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, -1.559f, 1.2f)
                close()
            }
        }
        .build()
        return _handClockSmall!!
    }

private var _handClockSmall: ImageVector? = null
