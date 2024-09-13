package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.TrainProfileSignParkingMedium: ImageVector
    get() {
        if (_trainProfileSignParkingMedium != null) {
            return _trainProfileSignParkingMedium!!
        }
        _trainProfileSignParkingMedium = Builder(name = "TrainProfileSignParkingMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.75f, 15.0f)
                    lineTo(24.75f, 6.75f)
                    lineTo(27.0f, 6.75f)
                    curveToRelative(1.477f, 0.0f, 2.25f, 0.746f, 2.25f, 2.25f)
                    curveToRelative(0.0f, 1.5f, -0.753f, 2.248f, -2.25f, 2.25f)
                    horizontalLineToRelative(-2.25f)
                    moveToRelative(1.5f, 6.0f)
                    verticalLineToRelative(15.0f)
                    moveToRelative(-6.734f, -9.0f)
                    lineTo(11.25f, 23.25f)
                    verticalLineToRelative(-6.0f)
                    horizontalLineToRelative(6.11f)
                    moveToRelative(-8.603f, 12.0f)
                    arcToRelative(3.001f, 3.001f, 0.0f, false, false, 6.0f, 0.0f)
                    moveTo(3.0f, 17.25f)
                    horizontalLineToRelative(5.25f)
                    verticalLineToRelative(6.0f)
                    lineTo(3.0f, 23.25f)
                    moveToRelative(0.0f, -10.5f)
                    horizontalLineToRelative(8.007f)
                    curveToRelative(2.955f, 0.0f, 5.44f, 1.911f, 6.354f, 4.557f)
                    lineToRelative(3.156f, 8.702f)
                    curveToRelative(0.149f, 0.3f, 0.24f, 0.634f, 0.24f, 0.991f)
                    arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.25f, 2.25f)
                    lineTo(3.0f, 29.25f)
                    moveToRelative(30.0f, 3.0f)
                    lineTo(3.0f, 32.25f)
                    moveToRelative(18.75f, -28.5f)
                    horizontalLineToRelative(9.0f)
                    curveToRelative(0.83f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                    verticalLineToRelative(10.5f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                    horizontalLineToRelative(-9.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                    lineTo(20.25f, 5.25f)
                    curveToRelative(0.0f, -0.829f, 0.67f, -1.5f, 1.5f, -1.5f)
                    close()
                    moveTo(8.25f, 12.75f)
                    lineTo(3.75f, 9.75f)
                    lineTo(8.25f, 6.75f)
                    lineTo(12.75f, 9.75f)
                    close()
                }
            }
        }
        .build()
        return _trainProfileSignParkingMedium!!
    }

private var _trainProfileSignParkingMedium: ImageVector? = null
