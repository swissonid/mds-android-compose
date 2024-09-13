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

public val SmallGroup.GlobeArrowsLeftRightUpDownSmall: ImageVector
    get() {
        if (_globeArrowsLeftRightUpDownSmall != null) {
            return _globeArrowsLeftRightUpDownSmall!!
        }
        _globeArrowsLeftRightUpDownSmall = Builder(name = "GlobeArrowsLeftRightUpDownSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 12.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                moveToRelative(4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                moveToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                moveToRelative(4.0f, 4.0f)
                curveToRelative(0.884f, 0.0f, 1.6f, -1.79f, 1.6f, -4.0f)
                moveToRelative(-1.6f, 4.0f)
                curveToRelative(-0.884f, 0.0f, -1.6f, -1.79f, -1.6f, -4.0f)
                reflectiveCurveToRelative(0.716f, -4.0f, 1.6f, -4.0f)
                moveToRelative(-4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                moveToRelative(0.0f, 0.0f)
                curveToRelative(0.884f, 0.0f, 1.6f, 1.79f, 1.6f, 4.0f)
                moveToRelative(0.0f, 0.0f)
                horizontalLineTo(8.5f)
                moveTo(9.0f, 4.0f)
                lineToRelative(2.5f, 2.5f)
                lineTo(14.0f, 4.0f)
                moveToRelative(6.0f, 6.0f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(20.0f, 15.0f)
                moveTo(3.0f, 15.0f)
                lineToRelative(2.5f, -2.5f)
                lineTo(3.0f, 10.0f)
                moveToRelative(11.0f, 11.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(9.0f, 21.0f)
            }
        }
        .build()
        return _globeArrowsLeftRightUpDownSmall!!
    }

private var _globeArrowsLeftRightUpDownSmall: ImageVector? = null
