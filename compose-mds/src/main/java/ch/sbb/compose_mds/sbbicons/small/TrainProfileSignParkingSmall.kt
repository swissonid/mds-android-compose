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

public val SmallGroup.TrainProfileSignParkingSmall: ImageVector
    get() {
        if (_trainProfileSignParkingSmall != null) {
            return _trainProfileSignParkingSmall!!
        }
        _trainProfileSignParkingSmall = Builder(name = "TrainProfileSignParkingSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 10.0f)
                lineTo(16.5f, 4.5f)
                lineTo(18.0f, 4.5f)
                curveToRelative(0.985f, 0.0f, 1.5f, 0.497f, 1.5f, 1.5f)
                quadToRelative(-0.002f, 1.499f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(1.0f, 4.0f)
                verticalLineToRelative(10.0f)
                moveToRelative(-4.49f, -6.0f)
                lineTo(7.5f, 15.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.074f)
                moveToRelative(-5.736f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                moveTo(2.0f, 11.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 15.5f)
                moveToRelative(0.0f, -7.0f)
                horizontalLineToRelative(5.338f)
                curveToRelative(1.97f, 0.0f, 3.627f, 1.274f, 4.236f, 3.038f)
                lineToRelative(2.104f, 5.8f)
                curveToRelative(0.099f, 0.2f, 0.16f, 0.424f, 0.16f, 0.662f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(2.0f, 19.5f)
                moveToRelative(20.0f, 2.0f)
                lineTo(2.0f, 21.5f)
                moveToRelative(12.5f, -19.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.5f, 8.5f)
                lineTo(2.5f, 6.5f)
                lineTo(5.5f, 4.5f)
                lineTo(8.5f, 6.5f)
                close()
            }
        }
        .build()
        return _trainProfileSignParkingSmall!!
    }

private var _trainProfileSignParkingSmall: ImageVector? = null
