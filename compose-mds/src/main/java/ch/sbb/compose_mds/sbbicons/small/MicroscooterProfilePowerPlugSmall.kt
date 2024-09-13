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

public val SmallGroup.MicroscooterProfilePowerPlugSmall: ImageVector
    get() {
        if (_microscooterProfilePowerPlugSmall != null) {
            return _microscooterProfilePowerPlugSmall!!
        }
        _microscooterProfilePowerPlugSmall = Builder(name = "MicroscooterProfilePowerPlugSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 2.0f)
                lineTo(16.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.035f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 14.035f, 13.0f)
                lineTo(7.731f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(5.0f, 14.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                moveToRelative(9.0f, 2.999f)
                verticalLineToRelative(1.0f)
                lineToRelative(1.999f, -0.004f)
                lineToRelative(0.002f, 1.0f)
                lineToRelative(-2.001f, 0.004f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                lineTo(7.0f, 19.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.448f, -1.998f)
                lineToRelative(1.002f, -0.002f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-0.502f)
                arcToRelative(1.499f, 1.499f, 0.0f, true, false, 0.002f, 3.0f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
            }
        }
        .build()
        return _microscooterProfilePowerPlugSmall!!
    }

private var _microscooterProfilePowerPlugSmall: ImageVector? = null
