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

public val SmallGroup.PulseSmall: ImageVector
    get() {
        if (_pulseSmall != null) {
            return _pulseSmall!!
        }
        _pulseSmall = Builder(name = "PulseSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                horizontalLineToRelative(4.0f)
                lineTo(9.0f, 6.0f)
                lineToRelative(3.0f, 12.0f)
                lineToRelative(3.0f, -8.0f)
                lineToRelative(1.0f, 3.5f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _pulseSmall!!
    }

private var _pulseSmall: ImageVector? = null
