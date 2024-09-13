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

public val SmallGroup.ArrowTurnRightSmall: ImageVector
    get() {
        if (_arrowTurnRightSmall != null) {
            return _arrowTurnRightSmall!!
        }
        _arrowTurnRightSmall = Builder(name = "ArrowTurnRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5f, 14.0f)
                curveToRelative(-2.884f, 0.0f, -4.728f, -0.86f, -5.862f, -2.17f)
                curveTo(6.492f, 10.506f, 6.0f, 8.643f, 6.0f, 6.5f)
                horizontalLineTo(5.0f)
                curveToRelative(0.0f, 2.276f, 0.52f, 4.412f, 1.882f, 5.984f)
                curveTo(8.255f, 14.07f, 10.41f, 15.0f, 13.5f, 15.0f)
                horizontalLineToRelative(3.777f)
                lineToRelative(-2.282f, 2.287f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(3.142f, -3.15f)
                lineToRelative(0.352f, -0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-3.142f, -3.141f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(17.292f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowTurnRightSmall!!
    }

private var _arrowTurnRightSmall: ImageVector? = null
