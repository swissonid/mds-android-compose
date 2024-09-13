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

public val SmallGroup.ExclamationPointSmall: ImageVector
    get() {
        if (_exclamationPointSmall != null) {
            return _exclamationPointSmall!!
        }
        _exclamationPointSmall = Builder(name = "ExclamationPointSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.905f, 9.592f)
                verticalLineTo(5.436f)
                horizontalLineToRelative(-1.791f)
                verticalLineToRelative(4.156f)
                lineToRelative(0.446f, 6.031f)
                horizontalLineToRelative(0.88f)
                close()
                moveTo(12.998f, 19.0f)
                horizontalLineToRelative(-1.995f)
                verticalLineToRelative(-1.911f)
                horizontalLineToRelative(1.995f)
                close()
            }
        }
        .build()
        return _exclamationPointSmall!!
    }

private var _exclamationPointSmall: ImageVector? = null
