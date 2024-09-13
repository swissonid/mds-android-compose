package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.WeatherUnknownMedium: ImageVector
    get() {
        if (_weatherUnknownMedium != null) {
            return _weatherUnknownMedium!!
        }
        _weatherUnknownMedium = Builder(name = "WeatherUnknownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.178f, 15.099f)
                curveToRelative(0.678f, 0.106f, 1.24f, 0.427f, 1.663f, 0.886f)
                curveToRelative(0.542f, 0.589f, 0.835f, 1.38f, 0.896f, 2.185f)
                curveToRelative(0.123f, 1.597f, -0.666f, 3.433f, -2.551f, 4.055f)
                lineToRelative(-0.313f, -0.95f)
                curveToRelative(1.34f, -0.442f, 1.964f, -1.766f, 1.867f, -3.029f)
                curveToRelative(-0.047f, -0.625f, -0.272f, -1.19f, -0.635f, -1.583f)
                curveToRelative(-0.352f, -0.383f, -0.855f, -0.628f, -1.536f, -0.6f)
                lineToRelative(-0.697f, 0.027f)
                lineToRelative(0.198f, -0.67f)
                curveToRelative(0.749f, -2.538f, -0.531f, -4.322f, -2.213f, -4.937f)
                curveToRelative(-1.69f, -0.616f, -3.81f, -0.066f, -4.825f, 2.25f)
                lineToRelative(-0.266f, 0.606f)
                lineToRelative(-0.51f, -0.42f)
                curveToRelative(-1.627f, -1.342f, -4.299f, -0.076f, -4.0f, 2.433f)
                lineToRelative(0.066f, 0.559f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.066f, 0.0f, -1.866f, 0.965f, -1.993f, 2.258f)
                curveToRelative(-0.123f, 1.256f, 0.436f, 2.569f, 1.857f, 3.054f)
                lineToRelative(-0.323f, 0.946f)
                curveToRelative(-1.966f, -0.671f, -2.686f, -2.501f, -2.529f, -4.098f)
                curveToRelative(0.138f, -1.401f, 0.992f, -2.833f, 2.461f, -3.112f)
                curveToRelative(0.006f, -2.822f, 2.948f, -4.403f, 5.15f, -3.163f)
                curveToRelative(1.33f, -2.39f, 3.813f, -2.984f, 5.818f, -2.252f)
                curveToRelative(2.011f, 0.735f, 3.52f, 2.791f, 2.978f, 5.555f)
                moveToRelative(-7.639f, 10.4f)
                horizontalLineToRelative(1.32f)
                verticalLineToRelative(-1.257f)
                horizontalLineToRelative(-1.32f)
                close()
                moveTo(14.899f, 17.642f)
                quadToRelative(-0.402f, 0.617f, -0.445f, 1.742f)
                horizontalLineToRelative(1.051f)
                quadToRelative(0.129f, -1.983f, 1.76f, -1.983f)
                quadToRelative(0.79f, 0.0f, 1.192f, 0.502f)
                quadToRelative(0.338f, 0.41f, 0.337f, 1.014f)
                quadToRelative(-0.001f, 0.326f, -0.116f, 0.642f)
                quadToRelative(-0.143f, 0.37f, -0.593f, 0.826f)
                quadToRelative(-0.704f, 0.714f, -0.909f, 0.974f)
                quadToRelative(-0.204f, 0.258f, -0.313f, 0.586f)
                quadToRelative(-0.154f, 0.447f, -0.166f, 1.373f)
                horizontalLineToRelative(1.039f)
                quadToRelative(0.0f, -0.52f, 0.061f, -0.848f)
                quadToRelative(0.056f, -0.323f, 0.192f, -0.547f)
                quadToRelative(0.14f, -0.218f, 0.486f, -0.552f)
                quadToRelative(0.79f, -0.761f, 0.996f, -1.044f)
                quadToRelative(0.466f, -0.625f, 0.465f, -1.488f)
                quadToRelative(0.0f, -1.044f, -0.683f, -1.686f)
                quadToRelative(-0.735f, -0.694f, -1.974f, -0.694f)
                quadToRelative(-0.772f, 0.0f, -1.39f, 0.307f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.99f, 0.876f)
            }
        }
        .build()
        return _weatherUnknownMedium!!
    }

private var _weatherUnknownMedium: ImageVector? = null
