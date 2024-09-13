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

public val MediumGroup.FastForwardMedium: ImageVector
    get() {
        if (_fastForwardMedium != null) {
            return _fastForwardMedium!!
        }
        _fastForwardMedium = Builder(name = "FastForwardMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(6.25f, 7.272f)
                lineToRelative(0.793f, 0.573f)
                lineToRelative(6.75f, 4.875f)
                lineToRelative(1.457f, 1.052f)
                verticalLineToRelative(-6.5f)
                lineToRelative(0.793f, 0.573f)
                lineToRelative(6.75f, 4.875f)
                lineToRelative(6.75f, 4.874f)
                lineToRelative(0.561f, 0.406f)
                lineToRelative(-0.561f, 0.405f)
                lineToRelative(-6.75f, 4.875f)
                lineToRelative(-6.75f, 4.875f)
                lineToRelative(-0.793f, 0.573f)
                verticalLineToRelative(-6.501f)
                lineToRelative(-1.457f, 1.053f)
                lineToRelative(-6.75f, 4.875f)
                lineToRelative(-0.793f, 0.573f)
                verticalLineTo(7.272f)
                moveToRelative(1.0f, 1.956f)
                verticalLineToRelative(17.544f)
                lineToRelative(5.957f, -4.302f)
                lineToRelative(2.25f, -1.626f)
                lineToRelative(0.793f, -0.573f)
                verticalLineToRelative(6.501f)
                lineToRelative(5.957f, -4.302f)
                lineTo(28.396f, 18.0f)
                lineToRelative(-6.189f, -4.47f)
                lineToRelative(-5.957f, -4.302f)
                verticalLineToRelative(6.499f)
                lineToRelative(-0.793f, -0.572f)
                lineToRelative(-2.25f, -1.625f)
                close()
            }
        }
        .build()
        return _fastForwardMedium!!
    }

private var _fastForwardMedium: ImageVector? = null
