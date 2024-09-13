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

public val MediumGroup.BulbOnPercentageMedium: ImageVector
    get() {
        if (_bulbOnPercentageMedium != null) {
            return _bulbOnPercentageMedium!!
        }
        _bulbOnPercentageMedium = Builder(name = "BulbOnPercentageMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(11.852f, 24.0f)
                    curveToRelative(-2.1f, -1.2f, -3.6f, -3.45f, -3.6f, -6.0f)
                    curveToRelative(0.0f, -3.75f, 3.0f, -6.75f, 6.75f, -6.75f)
                    arcToRelative(6.72f, 6.72f, 0.0f, false, true, 6.576f, 5.212f)
                    moveToRelative(-0.658f, -8.886f)
                    lineToRelative(-1.053f, 1.93f)
                    moveToRelative(5.4f, 2.42f)
                    lineToRelative(-1.924f, 1.062f)
                    moveTo(4.565f, 24.056f)
                    lineToRelative(1.965f, -1.17f)
                    moveTo(3.002f, 18.0f)
                    horizontalLineToRelative(2.25f)
                    moveToRelative(-0.585f, -6.015f)
                    lineToRelative(1.921f, 1.236f)
                    moveToRelative(2.485f, -5.64f)
                    lineToRelative(1.063f, 1.933f)
                    moveTo(15.0f, 6.0f)
                    verticalLineToRelative(2.25f)
                    moveToRelative(16.5f, 9.89f)
                    lineTo(21.0f, 29.954f)
                    moveTo(18.75f, 24.0f)
                    verticalLineToRelative(3.15f)
                    lineToRelative(-3.0f, 1.05f)
                    verticalLineToRelative(1.05f)
                    horizontalLineToRelative(-1.5f)
                    lineTo(14.25f, 28.2f)
                    lineToRelative(-3.0f, -1.05f)
                    lineTo(11.25f, 24.0f)
                    close()
                    moveTo(23.25f, 18.797f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                    close()
                    moveTo(29.25f, 26.297f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                    close()
                }
            }
        }
        .build()
        return _bulbOnPercentageMedium!!
    }

private var _bulbOnPercentageMedium: ImageVector? = null
