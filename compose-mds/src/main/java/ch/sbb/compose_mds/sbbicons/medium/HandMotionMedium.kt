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

public val MediumGroup.HandMotionMedium: ImageVector
    get() {
        if (_handMotionMedium != null) {
            return _handMotionMedium!!
        }
        _handMotionMedium = Builder(name = "HandMotionMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.5f, 3.75f)
                    curveToRelative(-5.385f, 0.0f, -9.75f, 4.365f, -9.75f, 9.75f)
                    moveToRelative(9.75f, -6.75f)
                    curveToRelative(-3.59f, 0.0f, -6.75f, 3.16f, -6.75f, 6.75f)
                    moveTo(22.5f, 32.25f)
                    curveToRelative(5.385f, 0.0f, 9.75f, -4.365f, 9.75f, -9.75f)
                    moveToRelative(-9.75f, 6.75f)
                    curveToRelative(3.59f, 0.0f, 6.75f, -3.16f, 6.75f, -6.75f)
                    moveTo(10.518f, 12.496f)
                    arcToRelative(1.487f, 1.487f, 0.0f, false, true, 2.925f, 0.38f)
                    lineToRelative(-0.025f, 4.772f)
                    lineTo(23.617f, 7.45f)
                    arcToRelative(1.508f, 1.508f, 0.0f, true, true, 2.13f, 2.134f)
                    lineToRelative(-7.962f, 7.94f)
                    lineToRelative(9.036f, -9.01f)
                    arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.106f, 2.11f)
                    lineToRelative(-9.022f, 9.021f)
                    lineToRelative(7.955f, -7.954f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.122f, 2.122f)
                    lineToRelative(-7.955f, 7.954f)
                    lineToRelative(4.786f, -4.77f)
                    arcToRelative(1.495f, 1.495f, 0.0f, false, true, 2.112f, 2.115f)
                    lineToRelative(-8.491f, 8.486f)
                    curveToRelative(-2.121f, 2.122f, -5.3f, 3.185f, -5.3f, 3.185f)
                    lineToRelative(-7.427f, -7.426f)
                    close()
                }
            }
        }
        .build()
        return _handMotionMedium!!
    }

private var _handMotionMedium: ImageVector? = null
