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

public val SmallGroup.WheelMicrophoneSmall: ImageVector
    get() {
        if (_wheelMicrophoneSmall != null) {
            return _wheelMicrophoneSmall!!
        }
        _wheelMicrophoneSmall = Builder(name = "WheelMicrophoneSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 18.0f)
                curveToRelative(0.927f, 0.0f, 1.77f, -0.122f, 2.603f, -0.378f)
                lineToRelative(0.294f, 0.956f)
                arcTo(9.7f, 9.7f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.485f, 0.0f, 6.626f, 1.76f, 8.417f, 4.475f)
                lineToRelative(-0.834f, 0.55f)
                curveTo(17.975f, 4.59f, 15.147f, 3.0f, 12.0f, 3.0f)
                moveToRelative(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(7.5f, 7.976f)
                lineTo(17.5f, 21.0f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.024f)
                curveToRelative(1.901f, -0.188f, 3.5f, -1.447f, 3.5f, -3.476f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.477f, -1.246f, 2.5f, -3.0f, 2.5f)
                reflectiveCurveToRelative(-3.0f, -1.023f, -3.0f, -2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 2.03f, 1.599f, 3.288f, 3.5f, 3.476f)
                moveTo(5.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                curveToRelative(1.985f, 0.0f, 3.765f, 0.819f, 5.04f, 2.146f)
                lineToRelative(0.72f, -0.692f)
                arcTo(7.95f, 7.95f, 0.0f, false, false, 12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                curveToRelative(0.688f, 0.0f, 1.312f, -0.112f, 1.922f, -0.265f)
                lineToRelative(-0.244f, -0.97f)
                curveToRelative(-0.564f, 0.142f, -1.1f, 0.235f, -1.678f, 0.235f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, -7.0f)
            }
        }
        .build()
        return _wheelMicrophoneSmall!!
    }

private var _wheelMicrophoneSmall: ImageVector? = null
