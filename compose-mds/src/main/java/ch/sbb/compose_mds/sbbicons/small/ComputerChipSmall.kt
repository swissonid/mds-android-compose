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

public val SmallGroup.ComputerChipSmall: ImageVector
    get() {
        if (_computerChipSmall != null) {
            return _computerChipSmall!!
        }
        _computerChipSmall = Builder(name = "ComputerChipSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 3.0f)
                verticalLineToRelative(3.5f)
                moveToRelative(3.0f, -3.5f)
                verticalLineToRelative(3.5f)
                moveToRelative(3.0f, -3.5f)
                verticalLineToRelative(3.5f)
                moveToRelative(-6.0f, 12.0f)
                lineTo(9.5f, 22.0f)
                moveToRelative(3.0f, -3.5f)
                lineTo(12.5f, 22.0f)
                moveToRelative(3.0f, -3.5f)
                lineTo(15.5f, 22.0f)
                moveTo(3.0f, 15.5f)
                horizontalLineToRelative(3.5f)
                moveToRelative(-3.5f, -3.0f)
                horizontalLineToRelative(3.5f)
                moveTo(3.0f, 9.5f)
                horizontalLineToRelative(3.5f)
                moveToRelative(12.0f, 6.0f)
                lineTo(22.0f, 15.5f)
                moveToRelative(-3.5f, -3.0f)
                lineTo(22.0f, 12.5f)
                moveToRelative(-3.5f, -3.0f)
                lineTo(22.0f, 9.5f)
                moveToRelative(-3.5f, 9.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.5f, 9.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _computerChipSmall!!
    }

private var _computerChipSmall: ImageVector? = null
