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

public val SmallGroup.ArrowsUpDownPressureSmall: ImageVector
    get() {
        if (_arrowsUpDownPressureSmall != null) {
            return _arrowsUpDownPressureSmall!!
        }
        _arrowsUpDownPressureSmall = Builder(name = "ArrowsUpDownPressureSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.997f, 6.992f)
                lineTo(12.5f, 9.5f)
                moveToRelative(0.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                moveToRelative(-2.5f, 2.5f)
                verticalLineTo(3.0f)
                moveTo(15.0f, 18.0f)
                lineToRelative(-2.5f, -2.5f)
                moveToRelative(0.0f, 0.0f)
                lineToRelative(-2.503f, 2.508f)
                moveTo(12.5f, 15.5f)
                verticalLineTo(22.0f)
                moveToRelative(7.0f, -8.5f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _arrowsUpDownPressureSmall!!
    }

private var _arrowsUpDownPressureSmall: ImageVector? = null
