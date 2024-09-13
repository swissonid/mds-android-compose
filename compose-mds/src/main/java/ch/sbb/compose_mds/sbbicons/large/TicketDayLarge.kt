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

public val LargeGroup.TicketDayLarge: ImageVector
    get() {
        if (_ticketDayLarge != null) {
            return _ticketDayLarge!!
        }
        _ticketDayLarge = Builder(name = "TicketDayLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.08f, 8.12f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-42.0f)
                verticalLineToRelative(-30.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-7.017f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.0f, -14.966f)
                lineTo(44.08f, 9.12f)
                close()
                moveTo(25.08f, 15.12f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(8.08f, 34.07f)
                lineToRelative(0.499f, 0.001f)
                lineToRelative(20.0f, 0.05f)
                lineToRelative(0.501f, 0.001f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(-4.0f)
                moveToRelative(-16.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.08f, 33.073f)
                verticalLineToRelative(-13.95f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(13.998f)
                close()
                moveTo(19.61f, 30.123f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-0.74f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -0.55f, 1.05f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, -1.71f, 0.43f)
                verticalLineToRelative(0.72f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.8f)
                close()
                moveTo(32.08f, 10.123f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(32.08f, 15.123f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(32.08f, 16.123f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(32.08f, 21.123f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(32.08f, 22.123f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(32.08f, 27.123f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(32.08f, 28.123f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(32.08f, 33.123f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(32.08f, 34.123f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _ticketDayLarge!!
    }

private var _ticketDayLarge: ImageVector? = null
