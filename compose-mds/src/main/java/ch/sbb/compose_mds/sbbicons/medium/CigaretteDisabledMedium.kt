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

public val MediumGroup.CigaretteDisabledMedium: ImageVector
    get() {
        if (_cigaretteDisabledMedium != null) {
            return _cigaretteDisabledMedium!!
        }
        _cigaretteDisabledMedium = Builder(name = "CigaretteDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.25f, 6.703f)
                curveToRelative(0.0f, -2.205f, 1.795f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.795f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.208f, -0.562f, 2.35f, -1.505f, 3.107f)
                lineToRelative(-0.283f, 0.227f)
                lineToRelative(0.128f, 0.34f)
                curveToRelative(0.105f, 0.277f, 0.16f, 0.572f, 0.16f, 0.873f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.3f, 0.055f, -0.595f, 0.16f, -0.874f)
                lineToRelative(0.128f, -0.34f)
                lineToRelative(-0.283f, -0.226f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.505f, -3.107f)
                moveToRelative(4.0f, -5.0f)
                curveToRelative(-2.758f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.402f, 0.601f, 2.725f, 1.615f, 3.66f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 3.385f, 4.387f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 3.385f, -4.387f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 1.615f, -3.66f)
                curveToRelative(0.0f, -2.757f, -2.242f, -5.0f, -5.0f, -5.0f)
                moveToRelative(4.146f, 32.4f)
                lineTo(21.543f, 22.25f)
                lineTo(3.25f, 22.25f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(12.793f)
                lineTo(1.896f, 2.604f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(31.5f, 31.5f)
                close()
                moveTo(17.043f, 17.75f)
                lineToRelative(3.5f, 3.5f)
                lineTo(14.75f, 21.25f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(11.75f, 17.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.75f, 21.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(28.375f, 17.75f)
                lineTo(21.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.125f)
                verticalLineToRelative(5.5f)
                lineTo(25.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.875f)
                close()
                moveTo(29.375f, 17.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _cigaretteDisabledMedium!!
    }

private var _cigaretteDisabledMedium: ImageVector? = null
