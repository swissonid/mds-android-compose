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

public val LargeGroup.CircleQuestionMarkLarge: ImageVector
    get() {
        if (_circleQuestionMarkLarge != null) {
            return _circleQuestionMarkLarge!!
        }
        _circleQuestionMarkLarge = Builder(name = "CircleQuestionMarkLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 24.0f)
                curveTo(3.0f, 12.402f, 12.402f, 3.0f, 24.0f, 3.0f)
                reflectiveCurveToRelative(21.0f, 9.402f, 21.0f, 21.0f)
                reflectiveCurveToRelative(-9.402f, 21.0f, -21.0f, 21.0f)
                reflectiveCurveTo(3.0f, 35.598f, 3.0f, 24.0f)
                moveTo(24.0f, 2.0f)
                curveTo(11.85f, 2.0f, 2.0f, 11.85f, 2.0f, 24.0f)
                reflectiveCurveToRelative(9.85f, 22.0f, 22.0f, 22.0f)
                reflectiveCurveToRelative(22.0f, -9.85f, 22.0f, -22.0f)
                reflectiveCurveTo(36.15f, 2.0f, 24.0f, 2.0f)
                moveToRelative(-6.13f, 12.33f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, -1.1f, 4.77f)
                lineToRelative(1.34f, 0.02f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 0.8f, -3.9f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 5.27f, -3.0f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, true, 4.16f, 1.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 1.47f, 3.49f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, -1.34f, 3.53f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -2.34f, 2.39f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 23.82f, 26.0f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.46f, 3.81f)
                horizontalLineToRelative(1.37f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 0.27f, -3.0f)
                curveToRelative(0.124f, -0.457f, 0.33f, -0.888f, 0.61f, -1.27f)
                quadToRelative(0.667f, -0.825f, 1.45f, -1.54f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 2.72f, -2.75f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 1.45f, -4.12f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -1.74f, -4.2f)
                arcTo(7.1f, 7.1f, 0.0f, false, false, 24.22f, 11.0f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, false, -3.75f, 0.88f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -2.6f, 2.45f)
                moveTo(24.77f, 37.0f)
                verticalLineToRelative(-3.4f)
                horizontalLineTo(23.3f)
                verticalLineTo(37.0f)
                close()
            }
        }
        .build()
        return _circleQuestionMarkLarge!!
    }

private var _circleQuestionMarkLarge: ImageVector? = null
