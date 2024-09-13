package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.RoofBedSmall: ImageVector
    get() {
        if (_roofBedSmall != null) {
            return _roofBedSmall!!
        }
        _roofBedSmall = Builder(name = "RoofBedSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.444f, 2.113f)
                lineTo(12.22f, 2.0f)
                lineToRelative(-0.224f, 0.112f)
                lineToRelative(-10.0f, 5.0f)
                lineToRelative(0.448f, 0.894f)
                lineTo(12.22f, 3.12f)
                lineToRelative(9.776f, 4.888f)
                lineToRelative(0.448f, -0.894f)
                close()
                moveTo(2.22f, 21.56f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.22f, 16.56f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(5.22f, 13.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _roofBedSmall!!
    }

private var _roofBedSmall: ImageVector? = null
