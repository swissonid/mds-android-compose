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

public val LargeGroup.HeartFilledLarge: ImageVector
    get() {
        if (_heartFilledLarge != null) {
            return _heartFilledLarge!!
        }
        _heartFilledLarge = Builder(name = "HeartFilledLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.17f, 24.77f)
                lineTo(24.0f, 43.0f)
                lineTo(5.84f, 24.77f)
                curveToRelative(-0.74f, -0.78f, -1.37f, -1.66f, -1.89f, -2.62f)
                curveToRelative(-0.93f, -1.69f, -1.45f, -3.64f, -1.45f, -5.72f)
                curveTo(2.5f, 9.8f, 7.82f, 4.5f, 14.45f, 4.5f)
                curveToRelative(3.95f, 0.0f, 7.38f, 2.08f, 9.55f, 5.0f)
                curveToRelative(2.17f, -2.92f, 5.62f, -5.0f, 9.56f, -5.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 11.95f, 11.93f)
                curveToRelative(0.0f, 2.07f, -0.53f, 4.02f, -1.45f, 5.72f)
                curveToRelative(-0.52f, 0.96f, -1.14f, 1.84f, -1.89f, 2.62f)
                close()
            }
        }
        .build()
        return _heartFilledLarge!!
    }

private var _heartFilledLarge: ImageVector? = null
