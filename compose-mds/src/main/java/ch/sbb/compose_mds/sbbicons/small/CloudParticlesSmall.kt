package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.CloudParticlesSmall: ImageVector
    get() {
        if (_cloudParticlesSmall != null) {
            return _cloudParticlesSmall!!
        }
        _cloudParticlesSmall = Builder(name = "CloudParticlesSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 15.5f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(2.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(2.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-3.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(3.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(1.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(1.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-4.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-9.004f, -4.42f)
                curveToRelative(-3.211f, 0.0f, -3.849f, 6.42f, 1.2f, 6.42f)
                horizontalLineToRelative(10.502f)
                curveToRelative(4.981f, 0.0f, 4.8f, -6.42f, 1.05f, -6.27f)
                curveToRelative(1.65f, -5.526f, -5.701f, -8.064f, -7.951f, -2.987f)
                curveToRelative(-1.982f, -1.616f, -5.149f, -0.065f, -4.8f, 2.836f)
                close()
            }
        }
        .build()
        return _cloudParticlesSmall!!
    }

private var _cloudParticlesSmall: ImageVector? = null
