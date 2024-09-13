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

public val LargeGroup.CoinDollarLarge: ImageVector
    get() {
        if (_coinDollarLarge != null) {
            return _coinDollarLarge!!
        }
        _coinDollarLarge = Builder(name = "CoinDollarLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.5f, 6.0f)
                curveTo(13.283f, 6.0f, 5.0f, 14.283f, 5.0f, 24.5f)
                reflectiveCurveTo(13.283f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(42.0f, 34.717f, 42.0f, 24.5f)
                reflectiveCurveTo(33.717f, 6.0f, 23.5f, 6.0f)
                moveTo(4.0f, 24.5f)
                curveTo(4.0f, 13.73f, 12.73f, 5.0f, 23.5f, 5.0f)
                reflectiveCurveTo(43.0f, 13.73f, 43.0f, 24.5f)
                reflectiveCurveTo(34.27f, 44.0f, 23.5f, 44.0f)
                reflectiveCurveTo(4.0f, 35.27f, 4.0f, 24.5f)
                moveToRelative(12.25f, 3.56f)
                horizontalLineToRelative(2.355f)
                quadToRelative(0.0f, 4.215f, 3.812f, 4.435f)
                verticalLineToRelative(-7.663f)
                quadToRelative(-2.12f, -0.36f, -3.577f, -1.289f)
                quadToRelative(-2.216f, -1.4f, -2.217f, -4.144f)
                quadToRelative(0.001f, -2.342f, 1.573f, -3.818f)
                quadToRelative(1.575f, -1.475f, 4.221f, -1.602f)
                lineTo(22.417f, 11.5f)
                horizontalLineToRelative(1.524f)
                verticalLineToRelative(2.48f)
                quadToRelative(2.634f, 0.209f, 3.991f, 1.552f)
                quadToRelative(1.47f, 1.441f, 1.441f, 3.798f)
                horizontalLineToRelative(-2.328f)
                quadToRelative(-0.22f, -3.285f, -3.104f, -3.395f)
                verticalLineToRelative(6.943f)
                curveToRelative(1.166f, 0.296f, 1.97f, 0.522f, 2.42f, 0.679f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.254f, 0.61f)
                quadToRelative(2.313f, 1.496f, 2.313f, 4.559f)
                quadToRelative(0.0f, 3.16f, -2.577f, 4.81f)
                quadToRelative(-1.234f, 0.789f, -3.41f, 0.915f)
                lineTo(23.941f, 37.5f)
                horizontalLineToRelative(-1.524f)
                verticalLineToRelative(-3.049f)
                quadToRelative(-3.119f, -0.196f, -4.628f, -1.858f)
                quadToRelative(-1.553f, -1.717f, -1.539f, -4.533f)
                moveToRelative(6.167f, -12.138f)
                quadToRelative(-1.344f, 0.04f, -2.107f, 0.567f)
                quadToRelative(-1.359f, 0.941f, -1.359f, 2.717f)
                quadToRelative(0.0f, 1.385f, 0.847f, 2.189f)
                quadToRelative(0.845f, 0.805f, 2.619f, 1.108f)
                close()
                moveTo(23.941f, 32.495f)
                curveToRelative(1.072f, -0.007f, 1.95f, -0.344f, 2.634f, -1.003f)
                quadToRelative(1.025f, -0.992f, 1.024f, -2.545f)
                quadToRelative(0.001f, -1.592f, -0.887f, -2.513f)
                quadToRelative(-0.885f, -0.923f, -2.771f, -1.27f)
                close()
                moveTo(9.677f, 20.15f)
                curveToRelative(1.411f, -4.49f, 4.987f, -8.047f, 9.474f, -9.473f)
                lineToRelative(-0.302f, -0.954f)
                curveToRelative(-4.795f, 1.525f, -8.616f, 5.322f, -10.126f, 10.127f)
                close()
            }
        }
        .build()
        return _coinDollarLarge!!
    }

private var _coinDollarLarge: ImageVector? = null
