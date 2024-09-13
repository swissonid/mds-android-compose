package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.ContactLineArrowTrainSmall: ImageVector
    get() {
        if (_contactLineArrowTrainSmall != null) {
            return _contactLineArrowTrainSmall!!
        }
        _contactLineArrowTrainSmall = Builder(name = "ContactLineArrowTrainSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(13.277f, 6.084f)
                lineTo(10.277f, 4.084f)
                lineTo(9.723f, 4.916f)
                lineTo(12.099f, 6.5f)
                lineTo(9.849f, 8.0f)
                lineTo(9.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 3.448f, 2.007f)
                horizontalLineToRelative(-4.441f)
                verticalLineToRelative(4.986f)
                horizontalLineToRelative(6.313f)
                lineToRelative(0.55f, 1.516f)
                lineToRelative(0.01f, 0.027f)
                lineToRelative(0.012f, 0.025f)
                quadToRelative(0.106f, 0.21f, 0.108f, 0.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.075f, 0.37f, 0.231f, 0.71f, 0.45f, 1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(0.218f, -0.29f, 0.375f, -0.63f, 0.45f, -1.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.314f, -0.078f, -0.603f, -0.199f, -0.856f)
                lineToRelative(-2.094f, -5.774f)
                curveTo(18.031f, 9.418f, 16.192f, 8.0f, 14.0f, 8.0f)
                horizontalLineToRelative(-2.349f)
                lineToRelative(1.626f, -1.084f)
                lineToRelative(0.624f, -0.416f)
                close()
                moveTo(13.993f, 11.993f)
                horizontalLineToRelative(3.876f)
                lineToRelative(1.094f, 3.014f)
                horizontalLineToRelative(-4.97f)
                close()
                moveTo(7.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.075f, 0.37f, -0.231f, 0.71f, -0.45f, 1.0f)
                moveToRelative(-3.415f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(14.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.415f, -1.0f)
                horizontalLineToRelative(2.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.415f, 1.0f)
                moveTo(6.0f, 5.707f)
                lineToRelative(1.646f, 1.647f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(0.708f, 0.708f)
                lineTo(5.0f, 5.707f)
                lineTo(5.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _contactLineArrowTrainSmall!!
    }

private var _contactLineArrowTrainSmall: ImageVector? = null
