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

public val SmallGroup.BatteryLightningSmall: ImageVector
    get() {
        if (_batteryLightningSmall != null) {
            return _batteryLightningSmall!!
        }
        _batteryLightningSmall = Builder(name = "BatteryLightningSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 7.0f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(18.0f)
                moveToRelative(2.0f, -9.5f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 18.0f)
                lineToRelative(1.5f, -4.5f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.0f, -5.0f)
                close()
            }
        }
        .build()
        return _batteryLightningSmall!!
    }

private var _batteryLightningSmall: ImageVector? = null
