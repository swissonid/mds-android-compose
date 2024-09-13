package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.WheelMicrophoneMedium: ImageVector
    get() {
        if (_wheelMicrophoneMedium != null) {
            return _wheelMicrophoneMedium!!
        }
        _wheelMicrophoneMedium = Builder(name = "WheelMicrophoneMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.0f, 4.25f)
                    curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                    reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                    curveToRelative(1.414f, 0.0f, 2.702f, -0.185f, 3.978f, -0.578f)
                    lineToRelative(0.294f, 0.956f)
                    curveToRelative(-1.377f, 0.424f, -2.765f, 0.622f, -4.272f, 0.622f)
                    curveToRelative(-8.146f, 0.0f, -14.75f, -6.604f, -14.75f, -14.75f)
                    reflectiveCurveTo(9.854f, 3.25f, 18.0f, 3.25f)
                    curveToRelative(5.142f, 0.0f, 9.776f, 2.598f, 12.417f, 6.6f)
                    lineToRelative(-0.834f, 0.55f)
                    curveTo(27.126f, 6.678f, 22.805f, 4.25f, 18.0f, 4.25f)
                    moveToRelative(9.0f, 9.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, false, 25.25f, 15.0f)
                    verticalLineToRelative(9.0f)
                    arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                    verticalLineToRelative(-9.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, false, 27.0f, 13.25f)
                    moveTo(24.25f, 15.0f)
                    arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                    verticalLineToRelative(9.0f)
                    arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                    close()
                    moveTo(18.0f, 16.25f)
                    arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                    arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                    moveTo(15.25f, 18.0f)
                    arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                    arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                    moveTo(26.5f, 29.733f)
                    verticalLineToRelative(2.017f)
                    horizontalLineTo(24.0f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(6.0f)
                    verticalLineToRelative(-1.0f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineToRelative(-2.017f)
                    curveToRelative(2.862f, -0.191f, 5.25f, -2.028f, 5.25f, -4.983f)
                    horizontalLineToRelative(-1.0f)
                    curveToRelative(0.0f, 2.398f, -2.03f, 4.0f, -4.75f, 4.0f)
                    reflectiveCurveToRelative(-4.75f, -1.602f, -4.75f, -4.0f)
                    horizontalLineToRelative(-1.0f)
                    curveToRelative(0.0f, 2.955f, 2.388f, 4.792f, 5.25f, 4.983f)
                    moveTo(7.25f, 18.0f)
                    curveToRelative(0.0f, -5.937f, 4.813f, -10.75f, 10.75f, -10.75f)
                    arcToRelative(10.67f, 10.67f, 0.0f, false, true, 7.74f, 3.296f)
                    lineToRelative(0.72f, -0.692f)
                    arcTo(11.67f, 11.67f, 0.0f, false, false, 18.0f, 6.25f)
                    curveTo(11.51f, 6.25f, 6.25f, 11.51f, 6.25f, 18.0f)
                    reflectiveCurveTo(11.51f, 29.75f, 18.0f, 29.75f)
                    curveToRelative(1.005f, 0.0f, 1.919f, -0.163f, 2.822f, -0.39f)
                    lineToRelative(-0.244f, -0.97f)
                    curveToRelative(-0.858f, 0.216f, -1.684f, 0.36f, -2.578f, 0.36f)
                    curveToRelative(-5.937f, 0.0f, -10.75f, -4.813f, -10.75f, -10.75f)
                }
            }
        }
        .build()
        return _wheelMicrophoneMedium!!
    }

private var _wheelMicrophoneMedium: ImageVector? = null
