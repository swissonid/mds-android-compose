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

public val SmallGroup.BulbOffPercentageSignalSmall: ImageVector
    get() {
        if (_bulbOffPercentageSignalSmall != null) {
            return _bulbOffPercentageSignalSmall!!
        }
        _bulbOffPercentageSignalSmall = Builder(name = "BulbOffPercentageSignalSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.901f, 17.0f)
                curveToRelative(-1.4f, -0.8f, -2.4f, -2.3f, -2.4f, -4.0f)
                curveToRelative(0.0f, -2.5f, 2.0f, -4.5f, 4.5f, -4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 4.384f, 3.474f)
                moveTo(19.0f, 13.094f)
                lineToRelative(-7.0f, 7.875f)
                moveTo(13.5f, 2.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 8.5f, 8.5f)
                moveTo(15.5f, 2.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 22.0f, 8.5f)
                moveTo(17.5f, 2.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 22.0f, 6.5f)
                moveTo(19.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 4.5f)
                moveTo(10.5f, 17.0f)
                verticalLineToRelative(2.1f)
                lineToRelative(-2.0f, 0.7f)
                verticalLineToRelative(0.7f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.7f)
                lineToRelative(-2.0f, -0.7f)
                lineTo(5.5f, 17.0f)
                close()
                moveTo(13.5f, 13.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(17.5f, 18.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bulbOffPercentageSignalSmall!!
    }

private var _bulbOffPercentageSignalSmall: ImageVector? = null
