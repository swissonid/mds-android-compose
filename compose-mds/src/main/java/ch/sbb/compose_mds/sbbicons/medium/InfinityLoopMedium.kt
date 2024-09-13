package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.InfinityLoopMedium: ImageVector
    get() {
        if (_infinityLoopMedium != null) {
            return _infinityLoopMedium!!
        }
        _infinityLoopMedium = Builder(name = "InfinityLoopMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.5f, 15.3f)
                lineToRelative(-2.505f, -2.295f)
                curveToRelative(-2.34f, -2.34f, -6.135f, -2.34f, -8.49f, 0.0f)
                reflectiveCurveToRelative(-2.34f, 6.135f, 0.0f, 8.49f)
                reflectiveCurveToRelative(6.135f, 2.34f, 8.49f, 0.0f)
                lineToRelative(8.01f, -8.49f)
                curveToRelative(2.34f, -2.34f, 6.135f, -2.34f, 8.49f, 0.0f)
                reflectiveCurveToRelative(2.34f, 6.135f, 0.0f, 8.49f)
                reflectiveCurveToRelative(-6.135f, 2.34f, -8.49f, 0.0f)
                lineTo(19.5f, 19.05f)
            }
        }
        .build()
        return _infinityLoopMedium!!
    }

private var _infinityLoopMedium: ImageVector? = null
