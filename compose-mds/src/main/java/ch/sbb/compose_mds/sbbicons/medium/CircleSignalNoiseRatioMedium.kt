package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.CircleSignalNoiseRatioMedium: ImageVector
    get() {
        if (_circleSignalNoiseRatioMedium != null) {
            return _circleSignalNoiseRatioMedium!!
        }
        _circleSignalNoiseRatioMedium = Builder(name = "CircleSignalNoiseRatioMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.096f, 16.088f)
                    horizontalLineToRelative(-1.869f)
                    quadToRelative(-0.056f, -0.659f, -0.488f, -1.005f)
                    quadToRelative(-0.433f, -0.347f, -1.214f, -0.347f)
                    quadToRelative(-0.694f, 0.0f, -1.08f, 0.273f)
                    arcToRelative(0.89f, 0.89f, 0.0f, false, false, -0.383f, 0.765f)
                    quadToRelative(0.0f, 0.444f, 0.369f, 0.64f)
                    quadToRelative(0.355f, 0.196f, 1.807f, 0.553f)
                    quadToRelative(1.53f, 0.38f, 2.121f, 0.769f)
                    quadToRelative(1.088f, 0.713f, 1.087f, 1.985f)
                    quadToRelative(0.0f, 1.396f, -1.094f, 2.2f)
                    quadToRelative(-0.964f, 0.708f, -2.612f, 0.708f)
                    quadToRelative(-1.832f, 0.0f, -2.846f, -0.836f)
                    quadToRelative(-1.015f, -0.835f, -1.052f, -2.38f)
                    horizontalLineToRelative(1.956f)
                    quadToRelative(0.042f, 0.75f, 0.387f, 1.113f)
                    quadToRelative(0.54f, 0.578f, 1.628f, 0.578f)
                    quadToRelative(0.739f, 0.0f, 1.17f, -0.288f)
                    arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.484f, -0.904f)
                    quadToRelative(0.0f, -0.572f, -0.682f, -0.837f)
                    quadToRelative(-0.375f, -0.147f, -1.77f, -0.534f)
                    arcToRelative(10.4f, 10.4f, 0.0f, false, true, -1.365f, -0.455f)
                    arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.787f, -0.48f)
                    quadToRelative(-0.689f, -0.615f, -0.688f, -1.696f)
                    quadToRelative(-0.001f, -1.298f, 1.075f, -2.054f)
                    quadToRelative(0.915f, -0.645f, 2.379f, -0.645f)
                    quadToRelative(1.286f, 0.0f, 2.152f, 0.51f)
                    quadToRelative(1.248f, 0.732f, 1.315f, 2.367f)
                    moveTo(19.96f, 13.426f)
                    lineToRelative(-4.162f, 11.299f)
                    horizontalLineToRelative(-1.634f)
                    lineToRelative(4.18f, -11.3f)
                    close()
                    moveTo(28.575f, 13.426f)
                    verticalLineToRelative(8.987f)
                    horizontalLineToRelative(-1.973f)
                    lineToRelative(-3.764f, -6.123f)
                    lineToRelative(0.025f, 6.123f)
                    horizontalLineToRelative(-1.886f)
                    verticalLineToRelative(-8.987f)
                    horizontalLineToRelative(1.998f)
                    lineToRelative(3.736f, 6.11f)
                    lineToRelative(-0.023f, -6.11f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.0f, 32.25f)
                    curveToRelative(7.87f, 0.0f, 14.25f, -6.38f, 14.25f, -14.25f)
                    reflectiveCurveTo(25.87f, 3.75f, 18.0f, 3.75f)
                    reflectiveCurveTo(3.75f, 10.13f, 3.75f, 18.0f)
                    reflectiveCurveTo(10.13f, 32.25f, 18.0f, 32.25f)
                    close()
                }
            }
        }
        .build()
        return _circleSignalNoiseRatioMedium!!
    }

private var _circleSignalNoiseRatioMedium: ImageVector? = null
