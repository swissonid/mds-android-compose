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

public val SmallGroup.WeightWheelSmall: ImageVector
    get() {
        if (_weightWheelSmall != null) {
            return _weightWheelSmall!!
        }
        _weightWheelSmall = Builder(name = "WeightWheelSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(2.732f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.465f, 0.0f)
                lineTo(6.11f, 5.0f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-2.0f, 8.0f)
                lineTo(3.86f, 14.0f)
                horizontalLineToRelative(16.28f)
                lineToRelative(-0.155f, -0.621f)
                lineToRelative(-2.0f, -8.0f)
                lineTo(17.89f, 5.0f)
                horizontalLineToRelative(-4.158f)
                moveTo(12.0f, 6.0f)
                lineTo(6.89f, 6.0f)
                lineToRelative(-1.75f, 7.0f)
                horizontalLineToRelative(13.72f)
                lineToRelative(-1.75f, -7.0f)
                close()
                moveTo(14.182f, 7.0f)
                quadToRelative(0.818f, 0.0f, 1.364f, 0.6f)
                curveToRelative(0.272f, 0.3f, 0.454f, 0.7f, 0.454f, 1.1f)
                horizontalLineToRelative(-0.91f)
                quadToRelative(-0.134f, -0.45f, -0.272f, -0.6f)
                curveToRelative(-0.182f, -0.1f, -0.364f, -0.2f, -0.636f, -0.2f)
                curveToRelative(-0.364f, 0.0f, -0.636f, 0.2f, -0.91f, 0.5f)
                curveToRelative(-0.181f, 0.2f, -0.272f, 0.6f, -0.272f, 1.1f)
                reflectiveCurveToRelative(0.09f, 0.9f, 0.273f, 1.1f)
                curveToRelative(0.181f, 0.3f, 0.545f, 0.5f, 0.909f, 0.5f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.727f, -0.3f)
                curveToRelative(0.182f, -0.2f, 0.273f, -0.5f, 0.273f, -0.8f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.8f)
                lineTo(16.0f, 9.2f)
                verticalLineToRelative(2.6f)
                horizontalLineToRelative(-0.636f)
                lineToRelative(-0.091f, -0.5f)
                curveToRelative(-0.364f, 0.4f, -0.727f, 0.7f, -1.273f, 0.7f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.545f, -0.8f)
                curveToRelative(-0.273f, -0.5f, -0.455f, -1.0f, -0.455f, -1.7f)
                curveToRelative(0.0f, -0.8f, 0.182f, -1.4f, 0.636f, -1.8f)
                curveToRelative(0.364f, -0.5f, 0.91f, -0.7f, 1.546f, -0.7f)
                moveTo(8.93f, 7.0f)
                verticalLineToRelative(2.083f)
                lineTo(10.698f, 7.0f)
                horizontalLineToRelative(1.209f)
                lineTo(10.14f, 8.98f)
                lineTo(12.0f, 12.0f)
                horizontalLineToRelative(-1.21f)
                lineTo(9.489f, 9.813f)
                lineToRelative(-0.558f, 0.624f)
                lineTo(8.931f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(17.009f, 14.908f)
                curveTo(16.575f, 17.222f, 14.5f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-2.508f, 0.0f, -4.58f, -1.771f, -5.008f, -4.09f)
                lineToRelative(-0.984f, 0.18f)
                curveTo(6.524f, 17.89f, 9.015f, 20.0f, 12.0f, 20.0f)
                curveToRelative(2.98f, 0.0f, 5.469f, -2.12f, 5.991f, -4.908f)
                close()
                moveTo(4.996f, 14.933f)
                curveTo(5.456f, 18.35f, 8.414f, 21.0f, 12.0f, 21.0f)
                curveToRelative(3.59f, 0.0f, 6.548f, -2.646f, 7.004f, -6.066f)
                lineToRelative(0.992f, 0.132f)
                curveTo(19.473f, 18.984f, 16.09f, 22.0f, 12.0f, 22.0f)
                curveToRelative(-4.087f, 0.0f, -7.469f, -3.02f, -7.996f, -6.933f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.191f, 0.0f, -0.437f, -0.126f, -0.631f, -0.338f)
                lineToRelative(-0.738f, 0.676f)
                curveToRelative(0.305f, 0.333f, 0.8f, 0.662f, 1.369f, 0.662f)
                curveToRelative(0.582f, 0.0f, 1.056f, -0.281f, 1.386f, -0.682f)
                lineToRelative(-0.772f, -0.636f)
                quadToRelative(-0.264f, 0.319f, -0.614f, 0.318f)
            }
        }
        .build()
        return _weightWheelSmall!!
    }

private var _weightWheelSmall: ImageVector? = null
