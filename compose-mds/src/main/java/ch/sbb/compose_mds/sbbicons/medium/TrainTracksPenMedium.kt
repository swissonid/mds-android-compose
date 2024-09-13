package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.TrainTracksPenMedium: ImageVector
    get() {
        if (_trainTracksPenMedium != null) {
            return _trainTracksPenMedium!!
        }
        _trainTracksPenMedium = Builder(name = "TrainTracksPenMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.75f, 33.0f)
                    lineTo(6.75f, 3.0f)
                    moveToRelative(10.5f, 15.0f)
                    lineTo(17.25f, 3.0f)
                    moveTo(3.0f, 11.25f)
                    horizontalLineToRelative(18.0f)
                    moveTo(3.0f, 6.75f)
                    horizontalLineToRelative(18.0f)
                    moveToRelative(-18.0f, 9.0f)
                    horizontalLineToRelative(18.0f)
                    moveToRelative(-18.0f, 4.5f)
                    horizontalLineToRelative(12.0f)
                    moveToRelative(-12.0f, 4.5f)
                    horizontalLineToRelative(9.0f)
                    moveToRelative(-9.0f, 4.5f)
                    horizontalLineToRelative(6.0f)
                    moveToRelative(2.25f, -0.435f)
                    verticalLineToRelative(3.435f)
                    horizontalLineToRelative(3.435f)
                    lineToRelative(11.25f, -11.251f)
                    lineToRelative(-3.435f, -3.434f)
                    close()
                    moveTo(25.065f, 14.999f)
                    lineTo(28.5f, 18.434f)
                    lineTo(31.935f, 14.986f)
                    lineTo(28.5f, 11.565f)
                    close()
                }
            }
        }
        .build()
        return _trainTracksPenMedium!!
    }

private var _trainTracksPenMedium: ImageVector? = null
