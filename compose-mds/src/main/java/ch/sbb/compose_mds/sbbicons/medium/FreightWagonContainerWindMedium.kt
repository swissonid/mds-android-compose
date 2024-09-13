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

public val MediumGroup.FreightWagonContainerWindMedium: ImageVector
    get() {
        if (_freightWagonContainerWindMedium != null) {
            return _freightWagonContainerWindMedium!!
        }
        _freightWagonContainerWindMedium = Builder(name = "FreightWagonContainerWindMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(26.25f, 29.25f)
                    verticalLineTo(30.0f)
                    arcTo(2.247f, 2.247f, 0.0f, false, true, 24.0f, 32.25f)
                    arcTo(2.247f, 2.247f, 0.0f, false, true, 21.75f, 30.0f)
                    verticalLineToRelative(-0.75f)
                    moveToRelative(-1.5f, -1.5f)
                    horizontalLineToRelative(-3.0f)
                    moveToRelative(0.0f, -2.25f)
                    verticalLineTo(30.0f)
                    moveToRelative(14.25f, -6.75f)
                    horizontalLineToRelative(-9.75f)
                    verticalLineTo(9.75f)
                    horizontalLineToRelative(9.75f)
                    moveToRelative(0.0f, 19.5f)
                    horizontalLineTo(20.25f)
                    verticalLineToRelative(-3.0f)
                    horizontalLineTo(31.5f)
                    moveToRelative(-12.0f, -13.5f)
                    horizontalLineToRelative(-6.0f)
                    moveToRelative(-1.5f, 0.0f)
                    horizontalLineTo(9.0f)
                    moveToRelative(-1.5f, 4.5f)
                    horizontalLineToRelative(-3.0f)
                    moveToRelative(6.0f, 4.5f)
                    horizontalLineToRelative(-3.0f)
                    moveToRelative(10.5f, -4.5f)
                    horizontalLineTo(9.0f)
                    moveToRelative(7.5f, 4.5f)
                    horizontalLineTo(12.0f)
                }
            }
        }
        .build()
        return _freightWagonContainerWindMedium!!
    }

private var _freightWagonContainerWindMedium: ImageVector? = null
