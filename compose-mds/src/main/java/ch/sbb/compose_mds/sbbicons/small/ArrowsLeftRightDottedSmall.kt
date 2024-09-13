package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.ArrowsLeftRightDottedSmall: ImageVector
    get() {
        if (_arrowsLeftRightDottedSmall != null) {
            return _arrowsLeftRightDottedSmall!!
        }
        _arrowsLeftRightDottedSmall = Builder(name = "ArrowsLeftRightDottedSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                horizontalLineToRelative(4.5f)
                moveToRelative(0.0f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                moveToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                moveTo(9.0f, 16.5f)
                horizontalLineTo(4.5f)
                moveToRelative(0.0f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                moveToRelative(-3.0f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                moveToRelative(3.512f, -12.0f)
                horizontalLineTo(8.988f)
                moveToRelative(5.024f, 0.0f)
                horizontalLineToRelative(-2.024f)
                moveToRelative(-3.976f, 0.0f)
                horizontalLineTo(5.988f)
                moveToRelative(-0.976f, 0.0f)
                horizontalLineTo(3.988f)
                moveToRelative(8.024f, 9.0f)
                horizontalLineTo(9.988f)
                moveToRelative(5.024f, 0.0f)
                horizontalLineToRelative(-2.024f)
                moveToRelative(5.024f, 0.0f)
                horizontalLineToRelative(-2.024f)
                moveToRelative(4.024f, 0.0f)
                horizontalLineToRelative(-1.024f)
            }
        }
        .build()
        return _arrowsLeftRightDottedSmall!!
    }

private var _arrowsLeftRightDottedSmall: ImageVector? = null
