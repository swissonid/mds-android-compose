package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.CloudParticlesMedium: ImageVector
    get() {
        if (_cloudParticlesMedium != null) {
            return _cloudParticlesMedium!!
        }
        _cloudParticlesMedium = Builder(name = "CloudParticlesMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.0f, 23.25f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(-3.0f, -3.0f)
                    horizontalLineTo(9.0f)
                    moveToRelative(3.0f, 1.5f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(-3.0f, -3.0f)
                    horizontalLineTo(12.0f)
                    moveToRelative(3.0f, 4.5f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(0.0f, -3.0f)
                    horizontalLineTo(18.0f)
                    moveToRelative(-4.5f, -1.5f)
                    horizontalLineTo(15.0f)
                    moveToRelative(-3.0f, -3.0f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(4.5f, 0.0f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(1.5f, 3.0f)
                    horizontalLineToRelative(1.5f)
                    moveToRelative(0.0f, -4.5f)
                    horizontalLineTo(24.0f)
                    moveToRelative(1.5f, 7.5f)
                    horizontalLineTo(27.0f)
                    moveToRelative(-6.0f, 1.5f)
                    horizontalLineToRelative(1.5f)
                    moveTo(8.994f, 16.62f)
                    curveToRelative(-4.817f, 0.0f, -5.774f, 9.63f, 1.8f, 9.63f)
                    horizontalLineToRelative(15.752f)
                    curveToRelative(7.473f, 0.0f, 7.2f, -9.63f, 1.575f, -9.406f)
                    curveToRelative(2.475f, -8.287f, -8.55f, -12.095f, -11.926f, -4.48f)
                    curveToRelative(-2.972f, -2.423f, -7.723f, -0.097f, -7.2f, 4.255f)
                    close()
                }
            }
        }
        .build()
        return _cloudParticlesMedium!!
    }

private var _cloudParticlesMedium: ImageVector? = null
