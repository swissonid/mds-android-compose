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

public val SmallGroup.ThermometerSmall: ImageVector
    get() {
        if (_thermometerSmall != null) {
            return _thermometerSmall!!
        }
        _thermometerSmall = Builder(name = "ThermometerSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(11.5f, 16.5f)
                lineTo(11.5f, 8.0f)
                moveToRelative(3.5f, 2.5f)
                horizontalLineToRelative(2.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(-2.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(-3.5f, 2.633f)
                lineTo(13.5f, 3.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(11.633f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 8.0f, 18.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -1.5f, -2.867f)
                close()
            }
        }
        .build()
        return _thermometerSmall!!
    }

private var _thermometerSmall: ImageVector? = null
