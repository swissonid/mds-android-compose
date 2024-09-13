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

public val MediumGroup.ComputerChipMedium: ImageVector
    get() {
        if (_computerChipMedium != null) {
            return _computerChipMedium!!
        }
        _computerChipMedium = Builder(name = "ComputerChipMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 4.5f)
                verticalLineToRelative(5.25f)
                moveToRelative(4.5f, -5.25f)
                verticalLineToRelative(5.25f)
                moveToRelative(4.5f, -5.25f)
                verticalLineToRelative(5.25f)
                moveToRelative(-9.0f, 18.0f)
                lineTo(14.25f, 33.0f)
                moveToRelative(4.5f, -5.25f)
                lineTo(18.75f, 33.0f)
                moveToRelative(4.5f, -5.25f)
                lineTo(23.25f, 33.0f)
                moveTo(4.5f, 23.25f)
                horizontalLineToRelative(5.25f)
                moveToRelative(-5.25f, -4.5f)
                horizontalLineToRelative(5.25f)
                moveToRelative(-5.25f, -4.5f)
                horizontalLineToRelative(5.25f)
                moveToRelative(18.0f, 9.0f)
                lineTo(33.0f, 23.25f)
                moveToRelative(-5.25f, -4.5f)
                lineTo(33.0f, 18.75f)
                moveToRelative(-5.25f, -4.5f)
                lineTo(33.0f, 14.25f)
                moveToRelative(-5.25f, 13.5f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-18.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(23.25f, 14.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _computerChipMedium!!
    }

private var _computerChipMedium: ImageVector? = null
