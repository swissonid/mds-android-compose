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

public val MediumGroup.TicketsClassMedium: ImageVector
    get() {
        if (_ticketsClassMedium != null) {
            return _ticketsClassMedium!!
        }
        _ticketsClassMedium = Builder(name = "TicketsClassMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.0f)
                lineTo(29.75f, 4.75f)
                horizontalLineToRelative(-14.0f)
                moveToRelative(4.5f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-6.5f)
                lineTo(27.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(-2.0f)
                lineTo(27.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(19.75f, 27.75f)
                verticalLineToRelative(2.5f)
                lineTo(7.25f, 30.25f)
                lineTo(7.25f, 8.75f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(26.962f, 7.397f)
                verticalLineToRelative(6.104f)
                horizontalLineToRelative(-1.218f)
                lineTo(25.744f, 9.505f)
                horizontalLineToRelative(-1.439f)
                lineTo(24.305f, 8.62f)
                quadToRelative(0.449f, -0.011f, 0.73f, -0.092f)
                quadToRelative(0.282f, -0.08f, 0.517f, -0.258f)
                quadToRelative(0.338f, -0.261f, 0.453f, -0.873f)
                close()
                moveTo(17.984f, 15.414f)
                lineTo(17.984f, 16.5f)
                horizontalLineToRelative(-4.396f)
                quadToRelative(0.0f, -0.497f, 0.162f, -0.948f)
                quadToRelative(0.16f, -0.45f, 0.453f, -0.777f)
                quadToRelative(0.224f, -0.25f, 0.528f, -0.487f)
                quadToRelative(0.301f, -0.24f, 1.203f, -0.873f)
                quadToRelative(0.44f, -0.306f, 0.613f, -0.569f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.177f, -0.609f)
                quadToRelative(0.0f, -0.4f, -0.237f, -0.65f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.62f, -0.247f)
                quadToRelative(-0.943f, 0.0f, -0.973f, 1.356f)
                horizontalLineToRelative(-1.171f)
                verticalLineToRelative(-0.133f)
                quadToRelative(0.0f, -1.111f, 0.62f, -1.72f)
                quadToRelative(0.606f, -0.593f, 1.567f, -0.593f)
                quadToRelative(0.852f, 0.0f, 1.423f, 0.484f)
                quadToRelative(0.621f, 0.526f, 0.621f, 1.416f)
                quadToRelative(0.0f, 0.775f, -0.496f, 1.335f)
                quadToRelative(-0.162f, 0.184f, -0.305f, 0.294f)
                quadToRelative(-0.141f, 0.111f, -0.747f, 0.533f)
                quadToRelative(-0.575f, 0.401f, -0.825f, 0.613f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.46f, 0.49f)
                close()
                moveTo(18.0f, 20.75f)
                lineTo(9.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(9.0f, 23.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 22.75f)
                close()
            }
        }
        .build()
        return _ticketsClassMedium!!
    }

private var _ticketsClassMedium: ImageVector? = null
