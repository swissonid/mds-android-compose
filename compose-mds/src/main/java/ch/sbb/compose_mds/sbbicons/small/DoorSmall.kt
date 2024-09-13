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

public val SmallGroup.DoorSmall: ImageVector
    get() {
        if (_doorSmall != null) {
            return _doorSmall!!
        }
        _doorSmall = Builder(name = "DoorSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 19.5f)
                horizontalLineTo(3.0f)
                moveToRelative(13.0f, -7.0f)
                horizontalLineToRelative(-1.0f)
                moveToRelative(2.5f, 7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _doorSmall!!
    }

private var _doorSmall: ImageVector? = null
