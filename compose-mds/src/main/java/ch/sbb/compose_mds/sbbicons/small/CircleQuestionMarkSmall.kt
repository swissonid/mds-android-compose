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

public val SmallGroup.CircleQuestionMarkSmall: ImageVector
    get() {
        if (_circleQuestionMarkSmall != null) {
            return _circleQuestionMarkSmall!!
        }
        _circleQuestionMarkSmall = Builder(name = "CircleQuestionMarkSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.437f, 0.0f, -8.0f, 3.563f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.563f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.564f, 8.0f, -8.0f)
                curveToRelative(0.0f, -4.437f, -3.563f, -8.0f, -8.0f, -8.0f)
                moveToRelative(-9.0f, 8.0f)
                curveToRelative(0.0f, -4.989f, 4.01f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.011f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.01f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -4.012f, -9.0f, -9.0f)
                moveToRelative(8.124f, 5.991f)
                horizontalLineToRelative(1.73f)
                verticalLineToRelative(-1.666f)
                horizontalLineToRelative(-1.73f)
                close()
                moveTo(8.978f, 7.58f)
                quadToRelative(-0.53f, 0.818f, -0.585f, 2.306f)
                horizontalLineToRelative(1.378f)
                quadToRelative(0.167f, -2.626f, 2.306f, -2.626f)
                quadToRelative(1.032f, 0.0f, 1.561f, 0.665f)
                quadToRelative(0.44f, 0.544f, 0.44f, 1.345f)
                quadToRelative(0.0f, 0.432f, -0.152f, 0.849f)
                quadToRelative(-0.183f, 0.489f, -0.777f, 1.097f)
                quadToRelative(-0.92f, 0.945f, -1.189f, 1.289f)
                quadToRelative(-0.268f, 0.344f, -0.412f, 0.777f)
                quadToRelative(-0.2f, 0.592f, -0.216f, 1.818f)
                horizontalLineToRelative(1.361f)
                quadToRelative(0.0f, -0.69f, 0.08f, -1.121f)
                quadToRelative(0.072f, -0.433f, 0.252f, -0.725f)
                reflectiveQuadToRelative(0.637f, -0.733f)
                quadToRelative(1.034f, -1.009f, 1.305f, -1.385f)
                quadToRelative(0.609f, -0.825f, 0.609f, -1.97f)
                quadToRelative(0.0f, -1.386f, -0.897f, -2.234f)
                quadToRelative(-0.961f, -0.921f, -2.586f, -0.921f)
                quadToRelative(-1.01f, 0.0f, -1.818f, 0.408f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 8.978f, 7.58f)
            }
        }
        .build()
        return _circleQuestionMarkSmall!!
    }

private var _circleQuestionMarkSmall: ImageVector? = null
