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

public val LargeGroup.BrochureLarge: ImageVector
    get() {
        if (_brochureLarge != null) {
            return _brochureLarge!!
        }
        _brochureLarge = Builder(name = "BrochureLarge", defaultWidth = 37.0.dp, defaultHeight =
                38.0.dp, viewportWidth = 37.0f, viewportHeight = 38.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.658f, 0.22f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(31.054f)
                lineToRelative(0.342f, 0.114f)
                lineToRelative(18.0f, 6.0f)
                lineToRelative(0.158f, 0.053f)
                lineToRelative(0.158f, -0.053f)
                lineToRelative(18.0f, -6.0f)
                lineToRelative(0.342f, -0.114f)
                lineTo(37.0f, 0.0f)
                lineToRelative(-0.658f, 0.22f)
                lineTo(18.5f, 6.166f)
                close()
                moveTo(1.0f, 30.332f)
                lineTo(1.0f, 1.387f)
                lineToRelative(17.0f, 5.667f)
                lineTo(18.0f, 36.0f)
                close()
                moveTo(19.0f, 36.0f)
                lineTo(19.0f, 7.054f)
                lineToRelative(17.0f, -5.667f)
                verticalLineToRelative(28.946f)
                close()
                moveTo(3.342f, 8.168f)
                lineToRelative(12.0f, 4.0f)
                lineToRelative(0.316f, -0.949f)
                lineToRelative(-12.0f, -4.0f)
                close()
                moveTo(21.658f, 12.168f)
                lineTo(33.658f, 8.168f)
                lineTo(33.342f, 7.219f)
                lineTo(21.342f, 11.219f)
                close()
                moveTo(15.342f, 18.168f)
                lineTo(3.342f, 14.168f)
                lineTo(3.658f, 13.219f)
                lineTo(15.658f, 17.219f)
                close()
                moveTo(3.342f, 20.168f)
                lineTo(15.342f, 24.168f)
                lineTo(15.658f, 23.219f)
                lineTo(3.658f, 19.219f)
                close()
                moveTo(15.342f, 30.168f)
                lineTo(3.342f, 26.168f)
                lineTo(3.658f, 25.219f)
                lineTo(15.658f, 29.219f)
                close()
                moveTo(34.0f, 13.694f)
                lineTo(34.0f, 13.0f)
                lineToRelative(-0.658f, 0.22f)
                lineToRelative(-12.0f, 4.0f)
                lineToRelative(-0.342f, 0.113f)
                verticalLineToRelative(13.054f)
                lineToRelative(0.658f, -0.219f)
                lineToRelative(12.0f, -4.0f)
                lineToRelative(0.342f, -0.114f)
                verticalLineToRelative(-12.36f)
                moveTo(22.0f, 29.0f)
                lineTo(22.0f, 18.054f)
                lineToRelative(11.0f, -3.667f)
                verticalLineToRelative(10.946f)
                close()
            }
        }
        .build()
        return _brochureLarge!!
    }

private var _brochureLarge: ImageVector? = null
