package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.DoorMedium: ImageVector
    get() {
        if (_doorMedium != null) {
            return _doorMedium!!
        }
        _doorMedium = Builder(name = "DoorMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.5f, 29.25f)
                horizontalLineToRelative(-27.0f)
                moveTo(24.0f, 18.75f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(3.75f, 10.5f)
                horizontalLineToRelative(-10.5f)
                verticalLineTo(6.75f)
                horizontalLineToRelative(10.5f)
                close()
            }
        }
        .build()
        return _doorMedium!!
    }

private var _doorMedium: ImageVector? = null
