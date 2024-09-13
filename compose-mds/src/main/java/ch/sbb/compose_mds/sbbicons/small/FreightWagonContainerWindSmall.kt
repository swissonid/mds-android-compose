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

public val SmallGroup.FreightWagonContainerWindSmall: ImageVector
    get() {
        if (_freightWagonContainerWindSmall != null) {
            return _freightWagonContainerWindSmall!!
        }
        _freightWagonContainerWindSmall = Builder(name = "FreightWagonContainerWindSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 19.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                moveToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                moveToRelative(0.0f, -1.5f)
                verticalLineToRelative(3.0f)
                moveToRelative(9.5f, -4.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(21.0f)
                moveToRelative(0.0f, 13.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(21.0f)
                moveToRelative(-8.0f, -9.0f)
                horizontalLineTo(9.0f)
                moveToRelative(-1.0f, 0.0f)
                horizontalLineTo(6.0f)
                moveToRelative(-1.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveToRelative(4.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveToRelative(7.0f, -3.0f)
                horizontalLineTo(6.0f)
                moveToRelative(5.0f, 3.0f)
                horizontalLineTo(8.0f)
            }
        }
        .build()
        return _freightWagonContainerWindSmall!!
    }

private var _freightWagonContainerWindSmall: ImageVector? = null
