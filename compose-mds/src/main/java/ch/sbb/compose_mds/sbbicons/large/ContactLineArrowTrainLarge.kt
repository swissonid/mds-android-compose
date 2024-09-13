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

public val LargeGroup.ContactLineArrowTrainLarge: ImageVector
    get() {
        if (_contactLineArrowTrainLarge != null) {
            return _contactLineArrowTrainLarge!!
        }
        _contactLineArrowTrainLarge = Builder(name = "ContactLineArrowTrainLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(44.0f)
                lineTo(46.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(27.777f, 10.084f)
                lineTo(20.277f, 5.084f)
                lineTo(19.723f, 5.916f)
                lineTo(26.599f, 10.5f)
                lineTo(19.849f, 15.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.568f)
                arcToRelative(9.795f, 9.795f, 0.0f, false, true, 9.043f, 6.007f)
                lineTo(28.008f, 22.007f)
                verticalLineToRelative(9.986f)
                horizontalLineToRelative(14.275f)
                lineToRelative(1.382f, 3.768f)
                lineToRelative(0.01f, 0.026f)
                lineToRelative(0.012f, 0.025f)
                curveToRelative(0.197f, 0.395f, 0.314f, 0.825f, 0.314f, 1.279f)
                curveTo(44.0f, 38.693f, 42.686f, 40.0f, 41.054f, 40.0f)
                lineTo(2.0f, 40.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.022f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.315f, 4.0f)
                lineTo(2.0f, 45.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(-1.0f)
                lineTo(33.663f, 45.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.315f, -4.0f)
                horizontalLineToRelative(5.076f)
                curveTo(43.228f, 41.0f, 45.0f, 39.255f, 45.0f, 37.09f)
                curveToRelative(0.0f, -0.618f, -0.157f, -1.19f, -0.407f, -1.7f)
                lineTo(39.77f, 22.235f)
                arcTo(10.8f, 10.8f, 0.0f, false, false, 29.568f, 15.0f)
                lineTo(21.65f, 15.0f)
                lineToRelative(6.126f, -4.084f)
                lineToRelative(0.624f, -0.416f)
                close()
                moveTo(28.993f, 22.993f)
                horizontalLineToRelative(9.99f)
                lineToRelative(2.938f, 8.014f)
                lineTo(28.993f, 31.007f)
                close()
                moveTo(13.663f, 45.0f)
                horizontalLineToRelative(13.674f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.315f, -4.0f)
                horizontalLineToRelative(-9.044f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.315f, 4.0f)
                moveToRelative(-7.636f, -4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.946f, 0.0f)
                close()
                moveTo(30.5f, 45.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.472f, -4.0f)
                horizontalLineToRelative(8.944f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.472f, 4.0f)
                moveTo(10.0f, 8.207f)
                lineToRelative(5.146f, 5.147f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(0.708f, 0.708f)
                lineTo(9.0f, 8.207f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _contactLineArrowTrainLarge!!
    }

private var _contactLineArrowTrainLarge: ImageVector? = null
