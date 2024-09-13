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

public val MediumGroup.ServiceBellMedium: ImageVector
    get() {
        if (_serviceBellMedium != null) {
            return _serviceBellMedium!!
        }
        _serviceBellMedium = Builder(name = "ServiceBellMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.47f, 7.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(10.347f, 13.245f)
                curveTo(12.073f, 10.872f, 14.653f, 9.25f, 18.0f, 9.25f)
                curveToRelative(3.348f, 0.0f, 5.923f, 1.622f, 7.648f, 3.995f)
                curveToRelative(1.715f, 2.361f, 2.594f, 5.468f, 2.602f, 8.503f)
                lineToRelative(0.001f, 0.502f)
                lineTo(7.75f, 22.25f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.036f, 0.88f, -6.144f, 2.597f, -8.505f)
                moveTo(8.758f, 21.25f)
                lineTo(27.24f, 21.25f)
                curveToRelative(-0.097f, -2.695f, -0.92f, -5.379f, -2.401f, -7.417f)
                curveToRelative(-1.565f, -2.153f, -3.857f, -3.584f, -6.839f, -3.584f)
                reflectiveCurveToRelative(-5.278f, 1.431f, -6.844f, 3.584f)
                curveToRelative(-1.483f, 2.039f, -2.307f, 4.723f, -2.398f, 7.417f)
                moveToRelative(-0.718f, 3.0f)
                horizontalLineToRelative(-0.362f)
                lineToRelative(-0.113f, 0.343f)
                lineToRelative(-0.99f, 3.0f)
                lineToRelative(-0.217f, 0.657f)
                horizontalLineToRelative(23.287f)
                lineToRelative(-0.221f, -0.66f)
                lineToRelative(-1.005f, -3.0f)
                lineToRelative(-0.114f, -0.34f)
                lineTo(8.04f, 24.25f)
                moveToRelative(-0.299f, 3.0f)
                lineToRelative(0.66f, -2.0f)
                horizontalLineToRelative(19.184f)
                lineToRelative(0.67f, 2.0f)
                close()
            }
        }
        .build()
        return _serviceBellMedium!!
    }

private var _serviceBellMedium: ImageVector? = null
