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

public val MediumGroup.PinMedium: ImageVector
    get() {
        if (_pinMedium != null) {
            return _pinMedium!!
        }
        _pinMedium = Builder(name = "PinMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 7.75f)
                horizontalLineToRelative(-0.677f)
                lineToRelative(0.2f, 0.647f)
                lineToRelative(2.972f, 9.66f)
                lineToRelative(-0.383f, 5.156f)
                lineToRelative(-0.04f, 0.537f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(4.162f)
                lineToRelative(-0.038f, -0.536f)
                lineToRelative(-0.368f, -5.156f)
                lineToRelative(2.972f, -9.661f)
                lineToRelative(0.2f, -0.647f)
                horizontalLineTo(11.25f)
                moveToRelative(3.478f, 10.103f)
                lineToRelative(-2.8f, -9.103f)
                horizontalLineToRelative(12.145f)
                lineToRelative(-2.8f, 9.103f)
                lineToRelative(-0.028f, 0.09f)
                lineToRelative(0.006f, 0.093f)
                lineToRelative(0.337f, 4.714f)
                horizontalLineToRelative(-7.19f)
                lineToRelative(0.35f, -4.713f)
                lineToRelative(0.008f, -0.094f)
                close()
            }
        }
        .build()
        return _pinMedium!!
    }

private var _pinMedium: ImageVector? = null
