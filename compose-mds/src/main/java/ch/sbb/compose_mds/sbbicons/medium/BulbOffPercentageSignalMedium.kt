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

public val MediumGroup.BulbOffPercentageSignalMedium: ImageVector
    get() {
        if (_bulbOffPercentageSignalMedium != null) {
            return _bulbOffPercentageSignalMedium!!
        }
        _bulbOffPercentageSignalMedium = Builder(name = "BulbOffPercentageSignalMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.851f, 25.5f)
                    curveToRelative(-2.1f, -1.2f, -3.6f, -3.45f, -3.6f, -6.0f)
                    curveToRelative(0.0f, -3.75f, 3.0f, -6.75f, 6.75f, -6.75f)
                    arcToRelative(6.72f, 6.72f, 0.0f, false, true, 6.577f, 5.212f)
                    moveTo(28.5f, 19.64f)
                    lineTo(18.0f, 31.453f)
                    moveTo(20.25f, 3.0f)
                    curveToRelative(0.0f, 7.042f, 5.708f, 12.75f, 12.75f, 12.75f)
                    moveTo(23.25f, 3.0f)
                    curveToRelative(0.0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                    moveTo(26.25f, 3.0f)
                    arcTo(6.75f, 6.75f, 0.0f, false, false, 33.0f, 9.75f)
                    moveTo(29.25f, 3.0f)
                    arcTo(3.75f, 3.75f, 0.0f, false, false, 33.0f, 6.75f)
                    moveTo(15.75f, 25.5f)
                    verticalLineToRelative(3.15f)
                    lineToRelative(-3.0f, 1.05f)
                    verticalLineToRelative(1.05f)
                    horizontalLineToRelative(-1.5f)
                    lineTo(11.25f, 29.7f)
                    lineToRelative(-3.0f, -1.05f)
                    lineTo(8.25f, 25.5f)
                    close()
                    moveTo(20.25f, 20.297f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                    close()
                    moveTo(26.25f, 27.797f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                    close()
                }
            }
        }
        .build()
        return _bulbOffPercentageSignalMedium!!
    }

private var _bulbOffPercentageSignalMedium: ImageVector? = null
