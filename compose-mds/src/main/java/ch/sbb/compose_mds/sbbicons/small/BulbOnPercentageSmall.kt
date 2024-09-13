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

public val SmallGroup.BulbOnPercentageSmall: ImageVector
    get() {
        if (_bulbOnPercentageSmall != null) {
            return _bulbOnPercentageSmall!!
        }
        _bulbOnPercentageSmall = Builder(name = "BulbOnPercentageSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.901f, 16.0f)
                curveToRelative(-1.4f, -0.8f, -2.4f, -2.3f, -2.4f, -4.0f)
                curveToRelative(0.0f, -2.5f, 2.0f, -4.5f, 4.5f, -4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 4.384f, 3.474f)
                moveToRelative(-0.439f, -5.923f)
                lineToRelative(-0.702f, 1.287f)
                moveToRelative(3.6f, 1.613f)
                lineToRelative(-1.282f, 0.708f)
                moveTo(3.044f, 16.037f)
                lineToRelative(1.31f, -0.78f)
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-0.39f, -4.01f)
                lineToRelative(1.281f, 0.824f)
                moveToRelative(1.656f, -3.76f)
                lineToRelative(0.71f, 1.289f)
                moveTo(10.0f, 4.0f)
                verticalLineToRelative(1.5f)
                moveToRelative(11.0f, 6.594f)
                lineToRelative(-7.0f, 7.875f)
                moveTo(12.5f, 16.0f)
                verticalLineToRelative(2.1f)
                lineToRelative(-2.0f, 0.7f)
                verticalLineToRelative(0.7f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.7f)
                lineToRelative(-2.0f, -0.7f)
                lineTo(7.5f, 16.0f)
                close()
                moveTo(15.5f, 12.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(19.5f, 17.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bulbOnPercentageSmall!!
    }

private var _bulbOnPercentageSmall: ImageVector? = null
