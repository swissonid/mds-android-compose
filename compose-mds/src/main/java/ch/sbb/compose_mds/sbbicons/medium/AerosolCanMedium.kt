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

public val MediumGroup.AerosolCanMedium: ImageVector
    get() {
        if (_aerosolCanMedium != null) {
            return _aerosolCanMedium!!
        }
        _aerosolCanMedium = Builder(name = "AerosolCanMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.756f, 3.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.458f)
                lineToRelative(-5.598f, 1.05f)
                lineToRelative(-0.408f, 0.077f)
                verticalLineToRelative(2.328f)
                lineToRelative(0.405f, 0.078f)
                lineToRelative(5.886f, 1.133f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.285f, 1.376f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.969f, 0.469f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -6.938f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.469f, -3.031f)
                moveToRelative(-2.5f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -0.538f, 0.174f, -1.034f, 0.467f, -1.445f)
                lineToRelative(0.451f, -0.634f)
                lineToRelative(-0.764f, -0.147f)
                lineToRelative(-6.16f, -1.187f)
                verticalLineToRelative(-0.672f)
                lineToRelative(5.634f, -1.058f)
                lineToRelative(0.456f, -0.085f)
                lineToRelative(-0.051f, -0.461f)
                lineToRelative(-0.019f, -0.149f)
                curveToRelative(-0.008f, -0.065f, -0.014f, -0.106f, -0.014f, -0.162f)
                moveTo(9.25f, 6.25f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.998f)
                horizontalLineToRelative(0.624f)
                arcToRelative(3.874f, 3.874f, 0.0f, false, true, 3.875f, 3.875f)
                lineToRelative(0.004f, 16.128f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.007f, -16.128f)
                arcToRelative(3.874f, 3.874f, 0.0f, false, true, 3.875f, -3.875f)
                horizontalLineToRelative(0.629f)
                lineTo(10.75f, 10.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.246f, 16.123f)
                arcToRelative(2.874f, 2.874f, 0.0f, false, true, 2.875f, -2.875f)
                horizontalLineToRelative(2.253f)
                arcToRelative(2.874f, 2.874f, 0.0f, false, true, 2.875f, 2.875f)
                verticalLineToRelative(0.627f)
                lineTo(7.246f, 16.75f)
                close()
                moveTo(7.246f, 17.75f)
                lineTo(7.251f, 28.752f)
                horizontalLineToRelative(8.001f)
                lineTo(15.25f, 17.75f)
                close()
                moveTo(7.253f, 31.75f)
                lineTo(7.252f, 29.752f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.001f, 1.999f)
                close()
            }
        }
        .build()
        return _aerosolCanMedium!!
    }

private var _aerosolCanMedium: ImageVector? = null
