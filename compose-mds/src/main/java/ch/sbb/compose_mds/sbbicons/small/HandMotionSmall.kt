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

public val SmallGroup.HandMotionSmall: ImageVector
    get() {
        if (_handMotionSmall != null) {
            return _handMotionSmall!!
        }
        _handMotionSmall = Builder(name = "HandMotionSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 2.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 2.5f, 9.0f)
                moveTo(9.0f, 4.5f)
                curveTo(6.607f, 4.5f, 4.5f, 6.607f, 4.5f, 9.0f)
                moveTo(15.0f, 21.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 6.5f, -6.5f)
                moveTo(15.0f, 19.5f)
                curveToRelative(2.393f, 0.0f, 4.5f, -2.107f, 4.5f, -4.5f)
                moveTo(7.012f, 8.33f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, true, 1.95f, 0.254f)
                lineToRelative(-0.017f, 3.181f)
                lineToRelative(6.8f, -6.798f)
                arcToRelative(1.005f, 1.005f, 0.0f, true, true, 1.42f, 1.423f)
                lineToRelative(-5.308f, 5.294f)
                lineToRelative(6.024f, -6.008f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 1.404f, 1.407f)
                lineToRelative(-6.015f, 6.015f)
                lineToRelative(5.303f, -5.303f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 1.414f)
                lineToRelative(-5.303f, 5.303f)
                lineToRelative(3.19f, -3.18f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, 1.408f, 1.41f)
                reflectiveCurveToRelative(-4.246f, 4.243f, -5.66f, 5.658f)
                curveToRelative(-1.414f, 1.414f, -3.534f, 2.123f, -3.534f, 2.123f)
                lineToRelative(-4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _handMotionSmall!!
    }

private var _handMotionSmall: ImageVector? = null
