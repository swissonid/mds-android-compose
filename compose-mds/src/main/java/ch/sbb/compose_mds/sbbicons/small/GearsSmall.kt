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

public val SmallGroup.GearsSmall: ImageVector
    get() {
        if (_gearsSmall != null) {
            return _gearsSmall!!
        }
        _gearsSmall = Builder(name = "GearsSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(2.016f)
                curveToRelative(1.0f, 0.065f, 1.946f, 0.323f, 2.799f, 0.738f)
                lineTo(16.86f, 3.96f)
                lineToRelative(0.86f, 0.51f)
                lineToRelative(-1.055f, 1.781f)
                curveToRelative(0.64f, 0.426f, 1.21f, 0.947f, 1.689f, 1.544f)
                lineToRelative(1.724f, -0.977f)
                lineToRelative(0.493f, 0.87f)
                lineToRelative(-1.643f, 0.93f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 19.984f, 12.0f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.673f, 2.66f)
                lineToRelative(1.614f, 1.03f)
                lineToRelative(-0.538f, 0.843f)
                lineToRelative(-1.556f, -0.993f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.272f, 2.279f)
                lineToRelative(0.881f, 1.644f)
                lineToRelative(-0.881f, 0.473f)
                lineToRelative(-0.876f, -1.635f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.683f, 0.683f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.758f, -0.719f)
                lineToRelative(-0.98f, 1.73f)
                lineToRelative(-0.87f, -0.493f)
                lineToRelative(0.98f, -1.728f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.405f, -2.57f)
                lineToRelative(-1.69f, 0.957f)
                lineToRelative(-0.494f, -0.87f)
                lineToRelative(1.751f, -0.99f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.518f, -2.3f)
                lineTo(3.0f, 13.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.694f, -2.707f)
                lineTo(3.911f, 8.23f)
                lineToRelative(0.51f, -0.86f)
                lineToRelative(1.774f, 1.05f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 8.27f, 6.294f)
                lineToRelative(-0.95f, -1.68f)
                lineToRelative(0.87f, -0.492f)
                lineToRelative(0.943f, 1.666f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 5.016f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(9.737f, 18.393f)
                curveToRelative(0.837f, 0.39f, 1.773f, 0.607f, 2.763f, 0.607f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 6.481f, -6.0f)
                horizontalLineToRelative(-3.015f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, true, -3.466f, 3.0f)
                curveToRelative(-0.452f, 0.0f, -0.883f, -0.082f, -1.277f, -0.232f)
                close()
                moveTo(10.351f, 15.279f)
                lineTo(8.866f, 17.901f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 6.0f, 12.501f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 2.765f, -5.333f)
                lineToRelative(1.49f, 2.63f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 9.0f, 12.5f)
                curveToRelative(0.0f, 1.143f, 0.525f, 2.144f, 1.35f, 2.78f)
                moveToRelative(0.758f, -6.0f)
                lineToRelative(-1.482f, -2.62f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.5f, 6.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 6.481f, 6.0f)
                horizontalLineToRelative(-3.015f)
                arcTo(3.46f, 3.46f, 0.0f, false, false, 12.5f, 9.0f)
                curveToRelative(-0.496f, 0.0f, -0.966f, 0.1f, -1.39f, 0.279f)
                moveTo(10.0f, 12.5f)
                curveToRelative(0.0f, -1.407f, 1.093f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.093f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.093f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, true, -2.5f, -2.5f)
            }
        }
        .build()
        return _gearsSmall!!
    }

private var _gearsSmall: ImageVector? = null
