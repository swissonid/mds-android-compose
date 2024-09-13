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

public val SmallGroup.TrainTracksPenSmall: ImageVector
    get() {
        if (_trainTracksPenSmall != null) {
            return _trainTracksPenSmall!!
        }
        _trainTracksPenSmall = Builder(name = "TrainTracksPenSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 22.0f)
                verticalLineTo(2.0f)
                moveToRelative(7.0f, 10.0f)
                verticalLineTo(2.0f)
                moveTo(2.0f, 7.5f)
                horizontalLineToRelative(12.0f)
                moveToRelative(-12.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                moveToRelative(-12.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                moveToRelative(-12.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                moveToRelative(-8.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                moveToRelative(-6.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                moveToRelative(1.5f, -0.29f)
                verticalLineToRelative(2.29f)
                horizontalLineToRelative(2.29f)
                lineToRelative(7.5f, -7.501f)
                lineTo(15.0f, 11.71f)
                close()
                moveTo(16.71f, 10.0f)
                lineTo(19.0f, 12.29f)
                lineToRelative(2.29f, -2.3f)
                lineTo(19.0f, 7.71f)
                close()
            }
        }
        .build()
        return _trainTracksPenSmall!!
    }

private var _trainTracksPenSmall: ImageVector? = null
