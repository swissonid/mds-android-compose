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

public val MediumGroup.CircleQuestionMarkMedium: ImageVector
    get() {
        if (_circleQuestionMarkMedium != null) {
            return _circleQuestionMarkMedium!!
        }
        _circleQuestionMarkMedium = Builder(name = "CircleQuestionMarkMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 5.75f)
                arcTo(12.214f, 12.214f, 0.0f, false, false, 5.75f, 18.0f)
                curveToRelative(0.0f, 6.792f, 5.457f, 12.25f, 12.25f, 12.25f)
                reflectiveCurveTo(30.25f, 24.792f, 30.25f, 18.0f)
                curveToRelative(0.0f, -6.793f, -5.457f, -12.25f, -12.25f, -12.25f)
                moveTo(4.75f, 18.0f)
                curveToRelative(0.0f, -7.345f, 5.904f, -13.25f, 13.25f, -13.25f)
                reflectiveCurveTo(31.25f, 10.655f, 31.25f, 18.0f)
                reflectiveCurveTo(25.346f, 31.25f, 18.0f, 31.25f)
                arcTo(13.215f, 13.215f, 0.0f, false, true, 4.75f, 18.0f)
                moveToRelative(11.936f, 8.987f)
                horizontalLineToRelative(2.595f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.595f)
                close()
                moveTo(13.467f, 11.37f)
                quadToRelative(-0.794f, 1.227f, -0.878f, 3.459f)
                horizontalLineToRelative(2.067f)
                quadToRelative(0.25f, -3.939f, 3.46f, -3.939f)
                quadToRelative(1.547f, 0.0f, 2.341f, 0.997f)
                quadToRelative(0.66f, 0.817f, 0.66f, 2.018f)
                quadToRelative(0.0f, 0.648f, -0.228f, 1.274f)
                quadToRelative(-0.275f, 0.733f, -1.165f, 1.645f)
                quadToRelative(-1.38f, 1.418f, -1.784f, 1.933f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.618f, 1.166f)
                quadToRelative(-0.3f, 0.89f, -0.324f, 2.727f)
                horizontalLineToRelative(2.041f)
                quadToRelative(0.0f, -1.035f, 0.12f, -1.681f)
                quadToRelative(0.11f, -0.65f, 0.379f, -1.088f)
                quadToRelative(0.27f, -0.439f, 0.955f, -1.1f)
                quadToRelative(1.55f, -1.513f, 1.958f, -2.077f)
                quadToRelative(0.912f, -1.238f, 0.913f, -2.955f)
                quadToRelative(-0.001f, -2.078f, -1.346f, -3.351f)
                quadToRelative(-1.442f, -1.381f, -3.878f, -1.381f)
                quadToRelative(-1.515f, 0.0f, -2.728f, 0.612f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -1.945f, 1.741f)
            }
        }
        .build()
        return _circleQuestionMarkMedium!!
    }

private var _circleQuestionMarkMedium: ImageVector? = null
