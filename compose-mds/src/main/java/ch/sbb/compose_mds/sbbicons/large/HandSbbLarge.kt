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

public val LargeGroup.HandSbbLarge: ImageVector
    get() {
        if (_handSbbLarge != null) {
            return _handSbbLarge!!
        }
        _handSbbLarge = Builder(name = "HandSbbLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.44f, 13.41f)
                lineTo(20.95f, 8.0f)
                horizontalLineToRelative(4.08f)
                lineTo(32.0f, 15.0f)
                lineToRelative(-6.97f, 7.0f)
                horizontalLineToRelative(-4.08f)
                lineToRelative(5.49f, -5.37f)
                horizontalLineToRelative(-6.83f)
                lineTo(19.61f, 22.0f)
                horizontalLineToRelative(-3.22f)
                verticalLineToRelative(-5.37f)
                lineTo(9.6f, 16.63f)
                lineTo(15.09f, 22.0f)
                horizontalLineToRelative(-4.08f)
                lineTo(4.0f, 15.0f)
                lineToRelative(7.01f, -7.0f)
                horizontalLineToRelative(4.08f)
                lineTo(9.6f, 13.41f)
                horizontalLineToRelative(6.79f)
                lineTo(16.39f, 8.0f)
                horizontalLineToRelative(3.22f)
                verticalLineToRelative(5.41f)
                close()
                moveTo(16.708f, 32.388f)
                lineTo(8.04f, 26.532f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.115f, 3.908f)
                lineToRelative(12.25f, 10.44f)
                lineToRelative(0.14f, 0.12f)
                horizontalLineToRelative(7.978f)
                lineToRelative(1.854f, 1.854f)
                lineToRelative(0.146f, 0.146f)
                lineTo(43.98f, 43.0f)
                lineToRelative(-1.177f, -0.898f)
                lineToRelative(-10.652f, -8.124f)
                quadToRelative(-0.165f, -0.134f, -0.331f, -0.273f)
                curveToRelative(-1.983f, -1.638f, -4.411f, -3.645f, -8.092f, -3.705f)
                lineTo(19.5f, 30.0f)
                curveToRelative(-0.878f, 0.0f, -1.584f, 0.29f, -2.071f, 0.768f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, false, -0.721f, 1.62f)
                moveTo(7.47f, 27.354f)
                lineToRelative(9.665f, 6.53f)
                quadToRelative(0.127f, 0.185f, 0.294f, 0.348f)
                curveToRelative(0.488f, 0.478f, 1.193f, 0.768f, 2.071f, 0.768f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.651f, 0.0f, -1.094f, -0.21f, -1.371f, -0.482f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -0.424f, -1.018f)
                curveToRelative(0.0f, -0.373f, 0.143f, -0.742f, 0.424f, -1.018f)
                curveToRelative(0.277f, -0.272f, 0.72f, -0.482f, 1.371f, -0.482f)
                horizontalLineToRelative(4.216f)
                curveToRelative(3.319f, 0.055f, 5.496f, 1.851f, 7.504f, 3.507f)
                lineToRelative(0.003f, 0.002f)
                quadToRelative(0.15f, 0.125f, 0.3f, 0.247f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.007f, 0.006f)
                lineTo(41.02f, 42.0f)
                lineTo(27.707f, 42.0f)
                lineToRelative(-1.853f, -1.853f)
                lineToRelative(-0.147f, -0.147f)
                horizontalLineToRelative(-8.023f)
                lineTo(5.574f, 29.68f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.876f, -2.34f)
                lineToRelative(0.01f, 0.007f)
                close()
            }
        }
        .build()
        return _handSbbLarge!!
    }

private var _handSbbLarge: ImageVector? = null
