package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.WeatherUnknownSmall: ImageVector
    get() {
        if (_weatherUnknownSmall != null) {
            return _weatherUnknownSmall!!
        }
        _weatherUnknownSmall = Builder(name = "WeatherUnknownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.311f, 9.934f)
                curveToRelative(0.416f, 0.099f, 0.767f, 0.314f, 1.039f, 0.61f)
                curveToRelative(0.391f, 0.424f, 0.598f, 0.99f, 0.641f, 1.556f)
                curveToRelative(0.086f, 1.121f, -0.468f, 2.43f, -1.815f, 2.875f)
                lineToRelative(-0.313f, -0.95f)
                curveToRelative(0.803f, -0.265f, 1.191f, -1.062f, 1.131f, -1.848f)
                curveToRelative(-0.03f, -0.387f, -0.168f, -0.726f, -0.38f, -0.956f)
                curveToRelative(-0.201f, -0.219f, -0.49f, -0.363f, -0.895f, -0.347f)
                lineToRelative(-0.696f, 0.028f)
                lineToRelative(0.197f, -0.669f)
                curveToRelative(0.473f, -1.604f, -0.33f, -2.707f, -1.373f, -3.088f)
                curveToRelative(-1.05f, -0.383f, -2.368f, -0.047f, -3.006f, 1.41f)
                lineToRelative(-0.266f, 0.607f)
                lineToRelative(-0.51f, -0.421f)
                curveToRelative(-0.965f, -0.796f, -2.578f, -0.055f, -2.396f, 1.474f)
                lineToRelative(0.066f, 0.559f)
                horizontalLineToRelative(-0.562f)
                curveToRelative(-0.59f, 0.0f, -1.083f, 0.538f, -1.163f, 1.355f)
                curveToRelative(-0.077f, 0.78f, 0.27f, 1.57f, 1.126f, 1.862f)
                lineToRelative(-0.323f, 0.946f)
                curveToRelative(-1.401f, -0.478f, -1.909f, -1.785f, -1.798f, -2.906f)
                curveToRelative(0.092f, -0.935f, 0.65f, -1.934f, 1.643f, -2.193f)
                curveToRelative(0.092f, -1.862f, 2.01f, -2.923f, 3.532f, -2.196f)
                curveToRelative(0.948f, -1.552f, 2.632f, -1.936f, 4.0f, -1.436f)
                curveToRelative(1.375f, 0.502f, 2.41f, 1.884f, 2.121f, 3.728f)
                moveToRelative(-5.285f, 7.065f)
                horizontalLineToRelative(0.88f)
                verticalLineToRelative(-0.838f)
                horizontalLineToRelative(-0.88f)
                close()
                moveTo(9.933f, 11.761f)
                quadToRelative(-0.268f, 0.411f, -0.297f, 1.161f)
                horizontalLineToRelative(0.701f)
                quadToRelative(0.086f, -1.321f, 1.173f, -1.322f)
                quadToRelative(0.527f, 0.0f, 0.795f, 0.335f)
                quadToRelative(0.225f, 0.274f, 0.224f, 0.676f)
                quadToRelative(0.0f, 0.218f, -0.077f, 0.428f)
                quadToRelative(-0.095f, 0.246f, -0.395f, 0.551f)
                quadToRelative(-0.47f, 0.476f, -0.606f, 0.65f)
                quadToRelative(-0.136f, 0.171f, -0.209f, 0.39f)
                quadToRelative(-0.103f, 0.298f, -0.111f, 0.915f)
                horizontalLineToRelative(0.693f)
                quadToRelative(0.0f, -0.347f, 0.041f, -0.565f)
                quadToRelative(0.037f, -0.216f, 0.128f, -0.365f)
                quadToRelative(0.093f, -0.146f, 0.324f, -0.368f)
                quadToRelative(0.526f, -0.508f, 0.664f, -0.696f)
                quadToRelative(0.31f, -0.417f, 0.31f, -0.992f)
                quadToRelative(0.0f, -0.696f, -0.456f, -1.124f)
                quadToRelative(-0.49f, -0.463f, -1.316f, -0.463f)
                quadToRelative(-0.514f, 0.0f, -0.926f, 0.205f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, -0.66f, 0.584f)
            }
        }
        .build()
        return _weatherUnknownSmall!!
    }

private var _weatherUnknownSmall: ImageVector? = null
