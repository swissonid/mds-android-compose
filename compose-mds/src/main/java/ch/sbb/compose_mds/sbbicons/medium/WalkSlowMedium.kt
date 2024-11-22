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

public val MediumGroup.WalkSlowMedium: ImageVector
    get() {
        if (_walkSlowMedium != null) {
            return _walkSlowMedium!!
        }
        _walkSlowMedium = Builder(name = "WalkSlowMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.25f, 8.25f)
                curveToRelative(0.0f, -0.523f, 0.477f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.076f, 0.0f, -2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                moveToRelative(-1.706f, 6.0f)
                horizontalLineToRelative(3.516f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(1.48f, 2.96f)
                lineTo(25.9f, 18.45f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-2.25f, -3.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.554f, -1.107f)
                verticalLineToRelative(5.4f)
                lineToRelative(1.443f, 2.75f)
                lineToRelative(0.057f, 0.11f)
                lineTo(23.749f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.627f)
                lineToRelative(-1.302f, -2.483f)
                lineTo(19.25f, 20.89f)
                verticalLineToRelative(3.896f)
                lineToRelative(-0.005f, 0.035f)
                lineToRelative(-0.75f, 5.25f)
                lineToRelative(-0.99f, -0.142f)
                lineToRelative(0.745f, -5.214f)
                lineTo(18.25f, 13.958f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(16.25f, 19.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.957f)
                lineToRelative(0.147f, -0.147f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(19.25f, 19.89f)
                verticalLineToRelative(-6.64f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.64f)
                close()
                moveTo(15.34f, 20.116f)
                lineTo(14.124f, 23.126f)
                lineTo(11.81f, 22.183f)
                lineTo(11.346f, 21.993f)
                lineTo(11.158f, 22.458f)
                lineTo(9.472f, 26.631f)
                lineTo(9.285f, 27.093f)
                lineTo(9.746f, 27.282f)
                lineTo(12.524f, 28.416f)
                lineTo(12.989f, 28.606f)
                lineTo(13.177f, 28.14f)
                lineTo(16.267f, 20.49f)
                close()
                moveTo(11.897f, 23.298f)
                lineTo(13.749f, 24.053f)
                lineTo(12.438f, 27.3f)
                lineTo(10.585f, 26.544f)
                close()
                moveTo(9.36f, 27.463f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.696f, 0.468f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, 1.39f, 0.562f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.694f, -1.03f)
                moveToRelative(2.086f, 1.591f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.977f, -0.414f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.977f, 0.414f)
            }
        }
        .build()
        return _walkSlowMedium!!
    }

private var _walkSlowMedium: ImageVector? = null
