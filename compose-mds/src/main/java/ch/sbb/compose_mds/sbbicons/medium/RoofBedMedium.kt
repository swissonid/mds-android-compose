package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.RoofBedMedium: ImageVector
    get() {
        if (_roofBedMedium != null) {
            return _roofBedMedium!!
        }
        _roofBedMedium = Builder(name = "RoofBedMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.554f, 3.393f)
                lineToRelative(-0.224f, -0.112f)
                lineToRelative(-0.224f, 0.112f)
                lineToRelative(-15.0f, 7.5f)
                lineToRelative(0.448f, 0.894f)
                lineTo(18.33f, 4.4f)
                lineToRelative(14.776f, 7.389f)
                lineToRelative(0.448f, -0.895f)
                close()
                moveTo(3.58f, 32.34f)
                verticalLineToRelative(-16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.25f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(9.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.25f)
                lineTo(4.58f, 26.09f)
                verticalLineToRelative(6.25f)
                close()
                moveTo(32.08f, 25.09f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
                moveTo(7.58f, 20.34f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(1.75f, -2.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
            }
        }
        .build()
        return _roofBedMedium!!
    }

private var _roofBedMedium: ImageVector? = null
