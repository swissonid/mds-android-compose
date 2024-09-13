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

public val SmallGroup.MugHotSmall: ImageVector
    get() {
        if (_mugHotSmall != null) {
            return _mugHotSmall!!
        }
        _mugHotSmall = Builder(name = "MugHotSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 2.0f)
                curveToRelative(0.0f, 0.445f, 0.211f, 0.933f, 0.536f, 1.304f)
                curveTo(7.87f, 3.685f, 8.373f, 4.0f, 9.0f, 4.0f)
                curveToRelative(0.557f, 0.0f, 0.935f, 0.458f, 0.963f, 1.025f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.205f, 0.682f)
                curveTo(9.625f, 5.864f, 9.397f, 6.0f, 9.0f, 6.0f)
                curveToRelative(-1.054f, 0.0f, -2.0f, 0.802f, -2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -0.602f, 0.454f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.653f, 0.0f, 1.175f, -0.239f, 1.52f, -0.645f)
                curveToRelative(0.336f, -0.395f, 0.466f, -0.902f, 0.442f, -1.38f)
                curveTo(10.915f, 4.042f, 10.242f, 3.0f, 9.0f, 3.0f)
                curveToRelative(-0.273f, 0.0f, -0.52f, -0.135f, -0.711f, -0.354f)
                curveTo(8.089f, 2.417f, 8.0f, 2.155f, 8.0f, 2.0f)
                close()
                moveTo(18.5f, 12.0f)
                lineTo(16.0f, 12.0f)
                lineTo(16.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.536f, 3.304f)
                curveTo(11.211f, 2.933f, 11.0f, 2.445f, 11.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.155f, 0.089f, 0.417f, 0.289f, 0.646f)
                curveToRelative(0.192f, 0.219f, 0.438f, 0.354f, 0.711f, 0.354f)
                curveToRelative(1.243f, 0.0f, 1.915f, 1.042f, 1.962f, 1.975f)
                curveToRelative(0.024f, 0.478f, -0.106f, 0.985f, -0.442f, 1.38f)
                curveToRelative(-0.345f, 0.406f, -0.867f, 0.645f, -1.52f, 0.645f)
                curveToRelative(-0.546f, 0.0f, -1.0f, 0.398f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.198f, 0.946f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.396f, 0.0f, 0.625f, -0.136f, 0.758f, -0.293f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, 0.205f, -0.682f)
                curveTo(13.935f, 4.458f, 13.557f, 4.0f, 13.0f, 4.0f)
                curveToRelative(-0.627f, 0.0f, -1.13f, -0.315f, -1.464f, -0.696f)
                moveTo(6.0f, 20.0f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _mugHotSmall!!
    }

private var _mugHotSmall: ImageVector? = null
