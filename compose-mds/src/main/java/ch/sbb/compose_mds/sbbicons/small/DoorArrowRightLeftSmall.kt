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

public val SmallGroup.DoorArrowRightLeftSmall: ImageVector
    get() {
        if (_doorArrowRightLeftSmall != null) {
            return _doorArrowRightLeftSmall!!
        }
        _doorArrowRightLeftSmall = Builder(name = "DoorArrowRightLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                lineTo(5.5f, 9.5f)
                moveToRelative(0.0f, 0.0f)
                lineTo(8.0f, 7.0f)
                moveTo(5.5f, 9.5f)
                horizontalLineToRelative(10.0f)
                moveToRelative(-5.0f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(8.0f)
                moveTo(21.0f, 19.5f)
                horizontalLineTo(3.0f)
                moveToRelative(12.5f, -10.0f)
                lineTo(13.0f, 7.0f)
                moveToRelative(2.5f, 2.5f)
                lineTo(13.0f, 12.0f)
                moveToRelative(3.0f, 0.5f)
                horizontalLineToRelative(-1.0f)
            }
        }
        .build()
        return _doorArrowRightLeftSmall!!
    }

private var _doorArrowRightLeftSmall: ImageVector? = null
