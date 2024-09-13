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

public val MediumGroup.BatteryLightningMedium: ImageVector
    get() {
        if (_batteryLightningMedium != null) {
            return _batteryLightningMedium!!
        }
        _batteryLightningMedium = Builder(name = "BatteryLightningMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.25f, 10.5f)
                verticalLineTo(5.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(27.0f)
                moveToRelative(3.0f, -14.25f)
                lineToRelative(-3.0f, 4.5f)
                horizontalLineToRelative(4.5f)
                lineTo(19.5f, 27.0f)
                lineToRelative(2.25f, -6.75f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(3.0f, -7.5f)
                close()
            }
        }
        .build()
        return _batteryLightningMedium!!
    }

private var _batteryLightningMedium: ImageVector? = null
