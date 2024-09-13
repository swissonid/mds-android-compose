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

public val MediumGroup.MicroscooterProfilePowerPlugMedium: ImageVector
    get() {
        if (_microscooterProfilePowerPlugMedium != null) {
            return _microscooterProfilePowerPlugMedium!!
        }
        _microscooterProfilePowerPlugMedium = Builder(name = "MicroscooterProfilePowerPlugMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.25f, 3.249f)
                lineTo(24.0f, 3.249f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(11.025f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -4.476f, 4.475f)
                lineTo(11.45f, 19.749f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 9.0f, 18.249f)
                arcTo(2.753f, 2.753f, 0.0f, false, false, 6.25f, 21.0f)
                arcTo(2.753f, 2.753f, 0.0f, false, false, 9.0f, 23.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, false, 2.739f, -3.0f)
                horizontalLineToRelative(10.51f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.205f, 1.796f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(7.25f, 20.999f)
                curveToRelative(0.0f, -0.964f, 0.786f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.786f, 1.75f, 1.75f)
                curveToRelative(0.0f, 0.965f, -0.786f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveTo(7.25f, 21.965f, 7.25f, 21.0f)
                moveToRelative(13.5f, 4.75f)
                verticalLineToRelative(1.5f)
                lineToRelative(3.249f, -0.007f)
                lineToRelative(0.002f, 1.0f)
                lineToRelative(-3.251f, 0.006f)
                verticalLineToRelative(2.001f)
                lineTo(24.0f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                lineTo(10.5f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.785f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.462f, -2.998f)
                lineToRelative(1.503f, -0.002f)
                close()
                moveTo(19.75f, 26.75f)
                lineTo(18.747f, 26.752f)
                arcToRelative(2.498f, 2.498f, 0.0f, true, false, 0.003f, 4.998f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(27.0f, 19.25f)
                curveToRelative(-0.964f, 0.0f, -1.75f, 0.786f, -1.75f, 1.75f)
                curveToRelative(0.0f, 0.965f, 0.786f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.785f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.964f, -0.786f, -1.75f, -1.75f, -1.75f)
                moveTo(24.25f, 21.0f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 27.0f, 18.25f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 29.75f, 21.0f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 27.0f, 23.75f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 24.25f, 21.0f)
            }
        }
        .build()
        return _microscooterProfilePowerPlugMedium!!
    }

private var _microscooterProfilePowerPlugMedium: ImageVector? = null
