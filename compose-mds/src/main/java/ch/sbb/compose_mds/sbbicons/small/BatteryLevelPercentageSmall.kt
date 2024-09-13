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

public val SmallGroup.BatteryLevelPercentageSmall: ImageVector
    get() {
        if (_batteryLevelPercentageSmall != null) {
            return _batteryLevelPercentageSmall!!
        }
        _batteryLevelPercentageSmall = Builder(name = "BatteryLevelPercentageSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.5f)
                lineTo(3.5f, 21.5f)
                verticalLineToRelative(-18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.5f, 11.0f)
                moveTo(5.0f, 19.5f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-5.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-5.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-5.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(9.0f, -1.437f)
                lineToRelative(-7.0f, 9.875f)
                moveToRelative(1.0f, -9.438f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(18.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _batteryLevelPercentageSmall!!
    }

private var _batteryLevelPercentageSmall: ImageVector? = null
