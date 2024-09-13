package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.PenLarge: ImageVector
    get() {
        if (_penLarge != null) {
            return _penLarge!!
        }
        _penLarge = Builder(name = "PenLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(36.73f, 4.203f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-3.182f, 3.18f)
                lineToRelative(0.005f, 0.006f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-26.17f, 26.16f)
                lineToRelative(-0.098f, 0.098f)
                lineToRelative(-0.134f, 0.033f)
                lineToRelative(-8.48f, 2.12f)
                lineToRelative(-0.809f, 0.202f)
                lineToRelative(0.202f, -0.808f)
                lineToRelative(2.12f, -8.48f)
                lineToRelative(0.034f, -0.135f)
                lineToRelative(0.098f, -0.097f)
                lineToRelative(26.16f, -26.17f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(3.182f, -3.182f)
                close()
                moveTo(42.383f, 11.27f)
                lineTo(39.555f, 14.098f)
                lineTo(33.902f, 8.445f)
                lineTo(36.73f, 5.617f)
                close()
                moveTo(33.19f, 9.147f)
                lineTo(7.737f, 34.61f)
                lineToRelative(5.653f, 5.653f)
                lineTo(38.853f, 14.81f)
                close()
                moveTo(6.172f, 40.105f)
                lineToRelative(1.13f, -4.517f)
                lineToRelative(5.11f, 5.111f)
                lineToRelative(-4.516f, 1.13f)
                close()
                moveTo(5.889f, 41.236f)
                lineTo(5.598f, 42.403f)
                lineTo(6.764f, 42.111f)
                close()
                moveTo(13.394f, 38.853f)
                lineTo(37.434f, 14.803f)
                lineTo(36.727f, 14.096f)
                lineTo(12.687f, 38.146f)
                close()
            }
        }
        .build()
        return _penLarge!!
    }

private var _penLarge: ImageVector? = null
