package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.CalendarOneDayLarge: ImageVector
    get() {
        if (_calendarOneDayLarge != null) {
            return _calendarOneDayLarge!!
        }
        _calendarOneDayLarge = Builder(name = "CalendarOneDayLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(22.939f)
                horizontalLineToRelative(0.499f)
                lineToRelative(30.0f, 0.06f)
                lineToRelative(0.501f, 0.002f)
                lineTo(40.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(32.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 34.94f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(15.999f)
                close()
                moveTo(25.0f, 33.0f)
                lineTo(25.0f, 21.0f)
                horizontalLineToRelative(-0.854f)
                quadToRelative(-0.163f, 0.747f, -0.336f, 1.113f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.485f, 0.61f)
                quadToRelative(-0.335f, 0.27f, -0.849f, 0.375f)
                quadToRelative(-0.512f, 0.102f, -1.637f, 0.127f)
                verticalLineToRelative(0.837f)
                horizontalLineToRelative(3.045f)
                lineTo(23.884f, 33.0f)
                close()
            }
        }
        .build()
        return _calendarOneDayLarge!!
    }

private var _calendarOneDayLarge: ImageVector? = null
