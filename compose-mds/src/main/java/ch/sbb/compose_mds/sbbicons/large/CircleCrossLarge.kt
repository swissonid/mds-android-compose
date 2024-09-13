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

public val LargeGroup.CircleCrossLarge: ImageVector
    get() {
        if (_circleCrossLarge != null) {
            return _circleCrossLarge!!
        }
        _circleCrossLarge = Builder(name = "CircleCrossLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 45.5f)
                curveToRelative(11.874f, 0.0f, 21.5f, -9.626f, 21.5f, -21.5f)
                reflectiveCurveTo(35.874f, 2.5f, 24.0f, 2.5f)
                reflectiveCurveTo(2.5f, 12.126f, 2.5f, 24.0f)
                reflectiveCurveTo(12.126f, 45.5f, 24.0f, 45.5f)
                close()
                moveTo(16.0f, 32.0f)
                lineToRelative(16.0f, -16.0f)
                moveTo(16.0f, 16.0f)
                lineToRelative(16.0f, 16.0f)
            }
        }
        .build()
        return _circleCrossLarge!!
    }

private var _circleCrossLarge: ImageVector? = null
