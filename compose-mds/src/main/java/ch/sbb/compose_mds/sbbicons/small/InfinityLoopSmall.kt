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

public val SmallGroup.InfinityLoopSmall: ImageVector
    get() {
        if (_infinityLoopSmall != null) {
            return _infinityLoopSmall!!
        }
        _infinityLoopSmall = Builder(name = "InfinityLoopSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 10.2f)
                lineTo(9.33f, 8.67f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -5.66f, 0.0f)
                curveToRelative(-1.57f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f)
                reflectiveCurveToRelative(4.09f, 1.56f, 5.66f, 0.0f)
                lineToRelative(5.34f, -5.66f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 5.66f, 0.0f)
                curveToRelative(1.57f, 1.56f, 1.56f, 4.09f, 0.0f, 5.66f)
                reflectiveCurveToRelative(-4.09f, 1.56f, -5.66f, 0.0f)
                lineTo(13.0f, 12.7f)
            }
        }
        .build()
        return _infinityLoopSmall!!
    }

private var _infinityLoopSmall: ImageVector? = null
