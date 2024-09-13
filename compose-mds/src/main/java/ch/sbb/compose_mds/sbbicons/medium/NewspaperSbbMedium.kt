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

public val MediumGroup.NewspaperSbbMedium: ImageVector
    get() {
        if (_newspaperSbbMedium != null) {
            return _newspaperSbbMedium!!
        }
        _newspaperSbbMedium = Builder(name = "NewspaperSbbMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 1.926f, 1.574f, 3.5f, 3.5f, 3.5f)
                lineTo(12.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                lineTo(8.25f, 28.75f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(21.5f)
                lineTo(27.25f, 22.5f)
                horizontalLineToRelative(1.0f)
                lineTo(28.25f, 6.25f)
                horizontalLineToRelative(-23.0f)
                moveToRelative(2.25f, 4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(8.25f, 12.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(16.5f, 16.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(25.5f, 13.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(25.5f, 20.75f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(7.5f, 20.75f)
                lineTo(15.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 19.75f)
                close()
                moveTo(15.0f, 23.75f)
                lineTo(7.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 22.75f)
                close()
                moveTo(7.5f, 26.75f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(25.8f, 24.0f)
                lineToRelative(3.6f, 3.375f)
                horizontalLineToRelative(-4.275f)
                lineTo(25.125f, 24.0f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3.375f)
                lineTo(18.6f, 27.375f)
                lineTo(22.2f, 24.0f)
                horizontalLineToRelative(-2.7f)
                lineTo(15.0f, 28.5f)
                lineToRelative(4.5f, 4.5f)
                horizontalLineToRelative(2.7f)
                lineToRelative(-3.6f, -3.375f)
                horizontalLineToRelative(4.275f)
                lineTo(22.875f, 33.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(-3.375f)
                lineTo(29.4f, 29.625f)
                lineTo(25.8f, 33.0f)
                horizontalLineToRelative(2.7f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _newspaperSbbMedium!!
    }

private var _newspaperSbbMedium: ImageVector? = null
