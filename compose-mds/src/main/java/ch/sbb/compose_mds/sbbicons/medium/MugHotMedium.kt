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

public val MediumGroup.MugHotMedium: ImageVector
    get() {
        if (_mugHotMedium != null) {
            return _mugHotMedium!!
        }
        _mugHotMedium = Builder(name = "MugHotMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.75f, 3.0f)
                curveToRelative(0.0f, 0.595f, 0.286f, 1.27f, 0.742f, 1.792f)
                curveToRelative(0.465f, 0.53f, 1.156f, 0.958f, 2.008f, 0.958f)
                curveToRelative(1.007f, 0.0f, 1.647f, 0.833f, 1.694f, 1.775f)
                curveToRelative(0.023f, 0.46f, -0.105f, 0.89f, -0.366f, 1.198f)
                curveToRelative(-0.253f, 0.297f, -0.669f, 0.527f, -1.328f, 0.527f)
                curveToRelative(-1.454f, 0.0f, -2.75f, 1.102f, -2.75f, 2.75f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.052f, 0.804f, -1.75f, 1.75f, -1.75f)
                curveToRelative(0.916f, 0.0f, 1.625f, -0.332f, 2.09f, -0.88f)
                curveToRelative(0.455f, -0.535f, 0.636f, -1.23f, 0.603f, -1.895f)
                curveToRelative(-0.065f, -1.308f, -1.0f, -2.725f, -2.693f, -2.725f)
                curveToRelative(-0.498f, 0.0f, -0.932f, -0.248f, -1.255f, -0.617f)
                curveToRelative(-0.331f, -0.378f, -0.495f, -0.828f, -0.495f, -1.133f)
                close()
                moveTo(27.75f, 18.25f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(23.75f, 27.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(17.493f, 4.792f)
                curveTo(17.036f, 4.27f, 16.75f, 3.595f, 16.75f, 3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.305f, 0.164f, 0.755f, 0.495f, 1.133f)
                curveToRelative(0.323f, 0.37f, 0.757f, 0.617f, 1.255f, 0.617f)
                curveToRelative(1.693f, 0.0f, 2.628f, 1.417f, 2.693f, 2.725f)
                curveToRelative(0.033f, 0.665f, -0.148f, 1.36f, -0.603f, 1.896f)
                curveToRelative(-0.465f, 0.547f, -1.174f, 0.879f, -2.09f, 0.879f)
                curveToRelative(-0.946f, 0.0f, -1.75f, 0.698f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.648f, 1.296f, -2.75f, 2.75f, -2.75f)
                curveToRelative(0.659f, 0.0f, 1.075f, -0.23f, 1.328f, -0.527f)
                curveToRelative(0.261f, -0.308f, 0.39f, -0.738f, 0.366f, -1.198f)
                curveToRelative(-0.047f, -0.942f, -0.687f, -1.775f, -1.694f, -1.775f)
                curveToRelative(-0.852f, 0.0f, -1.543f, -0.427f, -2.008f, -0.958f)
                moveTo(8.75f, 30.25f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(15.5f)
                close()
            }
        }
        .build()
        return _mugHotMedium!!
    }

private var _mugHotMedium: ImageVector? = null
