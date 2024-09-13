package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.TrashLarge: ImageVector
    get() {
        if (_trashLarge != null) {
            return _trashLarge!!
        }
        _trashLarge = Builder(name = "TrashLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 5.47f)
                curveToRelative(0.0f, -0.204f, 0.203f, -0.46f, 0.57f, -0.46f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.367f, 0.0f, 0.57f, 0.256f, 0.57f, 0.46f)
                verticalLineToRelative(1.604f)
                quadToRelative(-4.5f, -0.148f, -9.0f, 0.0f)
                close()
                moveTo(29.0f, 5.47f)
                verticalLineToRelative(1.64f)
                quadToRelative(5.102f, 0.207f, 10.178f, 0.793f)
                lineToRelative(1.38f, 0.16f)
                lineToRelative(0.442f, 0.052f)
                lineTo(41.0f, 12.0f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-2.041f, 32.531f)
                lineToRelative(-0.03f, 0.469f)
                lineTo(10.1f, 45.0f)
                lineToRelative(-0.029f, -0.469f)
                lineTo(8.031f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 8.115f)
                lineToRelative(0.442f, -0.052f)
                lineToRelative(1.38f, -0.16f)
                curveToRelative(3.384f, -0.39f, 6.78f, -0.655f, 10.178f, -0.792f)
                lineTo(18.0f, 5.47f)
                curveToRelative(0.0f, -0.856f, 0.756f, -1.46f, 1.57f, -1.46f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.814f, 0.0f, 1.57f, 0.604f, 1.57f, 1.46f)
                moveTo(9.032f, 12.0f)
                horizontalLineToRelative(28.936f)
                lineToRelative(-0.126f, 2.0f)
                lineTo(9.158f, 14.0f)
                close()
                moveTo(9.221f, 15.0f)
                lineTo(10.851f, 41.0f)
                lineTo(36.15f, 41.0f)
                lineToRelative(1.63f, -26.0f)
                close()
                moveTo(10.914f, 42.0f)
                horizontalLineToRelative(25.172f)
                lineToRelative(-0.126f, 2.0f)
                lineTo(11.04f, 44.0f)
                close()
                moveTo(7.938f, 8.897f)
                lineTo(7.0f, 9.005f)
                lineTo(7.0f, 11.0f)
                horizontalLineToRelative(33.0f)
                lineTo(40.0f, 9.005f)
                lineToRelative(-0.937f, -0.108f)
                arcToRelative(135.5f, 135.5f, 0.0f, false, false, -31.125f, 0.0f)
                moveToRelative(25.563f, 8.08f)
                lineToRelative(-1.0f, 22.0f)
                lineToRelative(0.999f, 0.046f)
                lineToRelative(1.0f, -22.0f)
                close()
                moveTo(13.5f, 16.977f)
                lineTo(14.5f, 38.977f)
                lineTo(13.5f, 39.023f)
                lineTo(12.5f, 17.023f)
                close()
                moveTo(28.5f, 16.977f)
                lineTo(27.5f, 38.977f)
                lineTo(28.5f, 39.023f)
                lineTo(29.5f, 17.023f)
                close()
                moveTo(18.5f, 16.977f)
                lineTo(19.5f, 38.977f)
                lineTo(18.5f, 39.023f)
                lineTo(17.5f, 17.023f)
                close()
                moveTo(23.0f, 17.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 17.0f)
                close()
            }
        }
        .build()
        return _trashLarge!!
    }

private var _trashLarge: ImageVector? = null
