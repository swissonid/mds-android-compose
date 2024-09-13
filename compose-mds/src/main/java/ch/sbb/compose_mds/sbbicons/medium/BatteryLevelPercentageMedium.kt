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

public val MediumGroup.BatteryLevelPercentageMedium: ImageVector
    get() {
        if (_batteryLevelPercentageMedium != null) {
            return _batteryLevelPercentageMedium!!
        }
        _batteryLevelPercentageMedium = Builder(name = "BatteryLevelPercentageMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 32.25f)
                lineTo(5.25f, 32.25f)
                verticalLineToRelative(-27.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                lineTo(17.25f, 16.5f)
                moveTo(7.5f, 29.25f)
                lineTo(15.0f, 29.25f)
                moveToRelative(-7.5f, -3.0f)
                lineTo(15.0f, 26.25f)
                moveToRelative(-7.5f, -3.0f)
                lineTo(15.0f, 23.25f)
                moveToRelative(-7.5f, -3.0f)
                lineTo(15.0f, 20.25f)
                moveToRelative(13.5f, -2.156f)
                lineTo(18.0f, 32.906f)
                moveToRelative(1.5f, -14.156f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                close()
                moveTo(27.0f, 27.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                close()
            }
        }
        .build()
        return _batteryLevelPercentageMedium!!
    }

private var _batteryLevelPercentageMedium: ImageVector? = null
