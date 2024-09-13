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

public val MediumGroup.ArrowTurnRightMedium: ImageVector
    get() {
        if (_arrowTurnRightMedium != null) {
            return _arrowTurnRightMedium!!
        }
        _arrowTurnRightMedium = Builder(name = "ArrowTurnRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.25f, 21.25f)
                curveToRelative(-4.377f, 0.0f, -7.222f, -1.308f, -8.982f, -3.342f)
                curveToRelative(-1.772f, -2.047f, -2.518f, -4.91f, -2.518f, -8.158f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 3.38f, 0.774f, 6.516f, 2.762f, 8.813f)
                curveToRelative(2.0f, 2.309f, 5.155f, 3.687f, 9.738f, 3.687f)
                horizontalLineToRelative(6.268f)
                lineToRelative(-3.849f, 3.857f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(4.713f, -4.724f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-4.713f, -4.712f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(3.872f, 3.871f)
                close()
            }
        }
        .build()
        return _arrowTurnRightMedium!!
    }

private var _arrowTurnRightMedium: ImageVector? = null
