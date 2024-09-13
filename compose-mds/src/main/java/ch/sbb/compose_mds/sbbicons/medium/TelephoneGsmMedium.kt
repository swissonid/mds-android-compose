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

public val MediumGroup.TelephoneGsmMedium: ImageVector
    get() {
        if (_telephoneGsmMedium != null) {
            return _telephoneGsmMedium!!
        }
        _telephoneGsmMedium = Builder(name = "TelephoneGsmMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.75f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-25.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(2.5f, 1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(10.25f, 30.25f)
                verticalLineToRelative(-23.0f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(23.0f)
                close()
                moveTo(24.0f, 22.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.5f, 22.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 22.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 25.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 28.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.5f, 28.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(19.5f, 25.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(21.0f, 25.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 28.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.75f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-11.0f)
                moveToRelative(0.5f, 9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _telephoneGsmMedium!!
    }

private var _telephoneGsmMedium: ImageVector? = null
