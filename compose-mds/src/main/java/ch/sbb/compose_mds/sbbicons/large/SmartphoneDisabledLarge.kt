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

public val LargeGroup.SmartphoneDisabledLarge: ImageVector
    get() {
        if (_smartphoneDisabledLarge != null) {
            return _smartphoneDisabledLarge!!
        }
        _smartphoneDisabledLarge = Builder(name = "SmartphoneDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(35.0f, 35.707f)
                lineToRelative(9.647f, 9.647f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-42.0f, -42.0f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(13.0f, 13.707f)
                lineTo(13.0f, 41.5f)
                curveToRelative(0.0f, 2.029f, 1.498f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.002f, 0.0f, 3.5f, -1.471f, 3.5f, -3.5f)
                close()
                moveTo(34.0f, 34.707f)
                lineTo(14.0f, 14.707f)
                lineTo(14.0f, 38.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(16.5f, 5.0f)
                curveTo(15.045f, 5.0f, 14.0f, 6.029f, 14.0f, 7.5f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 7.5f)
                curveTo(13.0f, 5.472f, 14.498f, 4.0f, 16.5f, 4.0f)
                horizontalLineToRelative(15.0f)
                curveTo(33.502f, 4.0f, 35.0f, 5.472f, 35.0f, 7.5f)
                lineTo(35.0f, 32.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(34.0f, 7.5f)
                curveTo(34.0f, 6.029f, 32.955f, 5.0f, 31.5f, 5.0f)
                close()
                moveTo(14.0f, 41.5f)
                lineTo(14.0f, 39.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.471f, -1.045f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-15.0f)
                curveToRelative(-1.455f, 0.0f, -2.5f, -1.029f, -2.5f, -2.5f)
                moveToRelative(8.0f, 0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(28.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _smartphoneDisabledLarge!!
    }

private var _smartphoneDisabledLarge: ImageVector? = null
