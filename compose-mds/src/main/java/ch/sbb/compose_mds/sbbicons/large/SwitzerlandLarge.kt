package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.SwitzerlandLarge: ImageVector
    get() {
        if (_switzerlandLarge != null) {
            return _switzerlandLarge!!
        }
        _switzerlandLarge = Builder(name = "SwitzerlandLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 11.5f)
                lineTo(25.0f, 14.0f)
                lineToRelative(-7.5f, 2.5f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(-4.5f, 3.5f)
                lineToRelative(2.0f, 0.5f)
                lineToRelative(-6.0f, 6.5f)
                lineToRelative(-3.0f, 2.5f)
                lineToRelative(-1.0f, 5.5f)
                lineTo(8.0f, 33.0f)
                lineToRelative(0.5f, -2.0f)
                lineToRelative(3.0f, -0.5f)
                lineToRelative(1.0f, 1.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(3.0f, 4.0f)
                lineToRelative(4.0f, -1.5f)
                lineToRelative(4.0f, 0.5f)
                lineTo(26.0f, 30.0f)
                lineToRelative(5.5f, 7.5f)
                lineToRelative(3.0f, -8.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(39.0f, 31.0f)
                lineToRelative(2.5f, 1.5f)
                lineTo(41.0f, 28.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-0.5f, -6.0f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(-3.5f, -1.0f)
                lineToRelative(1.5f, -4.0f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-4.0f, 0.5f)
                close()
            }
        }
        .build()
        return _switzerlandLarge!!
    }

private var _switzerlandLarge: ImageVector? = null
