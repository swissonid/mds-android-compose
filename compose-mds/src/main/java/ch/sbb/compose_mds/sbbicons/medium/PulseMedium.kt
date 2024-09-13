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

public val MediumGroup.PulseMedium: ImageVector
    get() {
        if (_pulseMedium != null) {
            return _pulseMedium!!
        }
        _pulseMedium = Builder(name = "PulseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 20.25f)
                horizontalLineToRelative(6.0f)
                lineTo(13.5f, 9.0f)
                lineTo(18.0f, 27.0f)
                lineToRelative(4.5f, -12.0f)
                lineToRelative(1.5f, 5.25f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _pulseMedium!!
    }

private var _pulseMedium: ImageVector? = null
