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

public val SmallGroup.WheelchairSubstituteTransportSmall: ImageVector
    get() {
        if (_wheelchairSubstituteTransportSmall != null) {
            return _wheelchairSubstituteTransportSmall!!
        }
        _wheelchairSubstituteTransportSmall = Builder(name = "WheelchairSubstituteTransportSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(8.0f, 14.5f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(4.5f, 15.2f)
                curveToRelative(0.0f, -1.485f, 0.805f, -2.77f, 2.093f, -3.355f)
                lineToRelative(0.414f, 0.91f)
                curveTo(6.095f, 13.17f, 5.5f, 14.085f, 5.5f, 15.2f)
                curveToRelative(0.0f, 1.524f, 1.276f, 2.8f, 2.8f, 2.8f)
                curveToRelative(1.082f, 0.0f, 2.03f, -0.667f, 2.561f, -1.64f)
                lineToRelative(0.878f, 0.48f)
                curveTo(11.069f, 18.066f, 9.818f, 19.0f, 8.3f, 19.0f)
                curveToRelative(-2.076f, 0.0f, -3.8f, -1.724f, -3.8f, -3.8f)
                moveToRelative(4.0f, -8.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(4.911f, -1.579f)
                curveToRelative(0.282f, -0.28f, 0.665f, -0.421f, 1.079f, -0.421f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.908f, 0.0f, 1.5f, 0.757f, 1.5f, 1.5f)
                verticalLineToRelative(0.505f)
                horizontalLineToRelative(0.224f)
                verticalLineToRelative(0.25f)
                lineToRelative(0.001f, 1.0f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-0.225f)
                lineTo(18.99f, 11.0f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(0.496f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.989f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.989f, 8.505f)
                horizontalLineToRelative(-0.218f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(0.219f)
                lineTo(12.99f, 6.5f)
                curveToRelative(0.0f, -0.414f, 0.14f, -0.797f, 0.421f, -1.079f)
                moveToRelative(0.707f, 0.708f)
                curveToRelative(-0.068f, 0.068f, -0.128f, 0.185f, -0.128f, 0.371f)
                lineTo(13.99f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.99f, 6.5f)
                curveToRelative(0.0f, -0.257f, -0.208f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.187f, 0.0f, -0.303f, 0.06f, -0.372f, 0.129f)
                moveTo(17.99f, 9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _wheelchairSubstituteTransportSmall!!
    }

private var _wheelchairSubstituteTransportSmall: ImageVector? = null
