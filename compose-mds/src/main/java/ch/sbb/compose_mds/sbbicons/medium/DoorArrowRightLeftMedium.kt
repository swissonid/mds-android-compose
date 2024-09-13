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

public val MediumGroup.DoorArrowRightLeftMedium: ImageVector
    get() {
        if (_doorArrowRightLeftMedium != null) {
            return _doorArrowRightLeftMedium!!
        }
        _doorArrowRightLeftMedium = Builder(name = "DoorArrowRightLeftMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveToRelative(12.0f, 18.0f)
                    lineToRelative(-3.75f, -3.75f)
                    moveToRelative(0.0f, 0.0f)
                    lineTo(12.0f, 10.5f)
                    moveToRelative(-3.75f, 3.75f)
                    horizontalLineToRelative(15.0f)
                    moveToRelative(-7.5f, 2.25f)
                    verticalLineToRelative(12.75f)
                    horizontalLineToRelative(10.5f)
                    verticalLineTo(6.75f)
                    horizontalLineToRelative(-10.5f)
                    verticalLineTo(12.0f)
                    moveTo(31.5f, 29.25f)
                    horizontalLineToRelative(-27.0f)
                    moveToRelative(18.75f, -15.0f)
                    lineTo(19.5f, 10.5f)
                    moveToRelative(3.75f, 3.75f)
                    lineTo(19.5f, 18.0f)
                    moveToRelative(4.5f, 0.75f)
                    horizontalLineToRelative(-1.5f)
                }
            }
        }
        .build()
        return _doorArrowRightLeftMedium!!
    }

private var _doorArrowRightLeftMedium: ImageVector? = null
