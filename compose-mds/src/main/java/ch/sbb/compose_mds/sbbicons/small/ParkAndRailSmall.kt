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

public val SmallGroup.ParkAndRailSmall: ImageVector
    get() {
        if (_parkAndRailSmall != null) {
            return _parkAndRailSmall!!
        }
        _parkAndRailSmall = Builder(name = "ParkAndRailSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.003f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(18.002f)
                close()
                moveTo(21.003f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.002f)
                close()
                moveTo(4.735f, 11.741f)
                lineTo(4.735f, 9.475f)
                horizontalLineToRelative(1.467f)
                quadToRelative(0.718f, 0.0f, 1.035f, 0.22f)
                quadToRelative(0.438f, 0.294f, 0.438f, 0.897f)
                quadToRelative(-0.001f, 0.596f, -0.377f, 0.903f)
                quadToRelative(-0.308f, 0.246f, -1.003f, 0.246f)
                close()
                moveTo(6.218f, 7.997f)
                lineTo(2.99f, 7.997f)
                verticalLineToRelative(8.001f)
                horizontalLineToRelative(1.745f)
                verticalLineToRelative(-2.883f)
                lineTo(6.53f, 13.115f)
                quadToRelative(0.69f, 0.0f, 1.161f, -0.134f)
                reflectiveQuadToRelative(0.837f, -0.44f)
                quadToRelative(0.865f, -0.719f, 0.865f, -1.97f)
                quadToRelative(0.0f, -1.414f, -1.046f, -2.114f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.844f, -0.358f)
                quadToRelative(-0.468f, -0.102f, -1.285f, -0.102f)
                moveToRelative(3.195f, 4.108f)
                horizontalLineToRelative(1.542f)
                verticalLineToRelative(-1.543f)
                horizontalLineToRelative(0.884f)
                verticalLineToRelative(1.543f)
                horizontalLineToRelative(1.548f)
                verticalLineToRelative(0.883f)
                horizontalLineToRelative(-1.548f)
                verticalLineToRelative(1.542f)
                horizontalLineToRelative(-0.884f)
                verticalLineToRelative(-1.542f)
                lineTo(9.413f, 12.988f)
                close()
                moveTo(15.767f, 11.572f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(1.74f)
                quadToRelative(0.765f, 0.0f, 1.121f, 0.263f)
                quadToRelative(0.357f, 0.262f, 0.357f, 0.83f)
                quadToRelative(-0.001f, 0.588f, -0.416f, 0.877f)
                quadToRelative(-0.33f, 0.23f, -1.133f, 0.23f)
                close()
                moveTo(17.895f, 7.998f)
                horizontalLineToRelative(-3.874f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.745f)
                verticalLineToRelative(-3.146f)
                horizontalLineToRelative(1.57f)
                quadToRelative(0.839f, 0.0f, 1.186f, 0.326f)
                quadToRelative(0.348f, 0.325f, 0.414f, 1.173f)
                quadToRelative(0.065f, 0.953f, 0.105f, 1.215f)
                quadToRelative(0.043f, 0.264f, 0.134f, 0.433f)
                horizontalLineToRelative(1.822f)
                lineToRelative(-0.075f, -0.093f)
                quadToRelative(-0.158f, -0.203f, -0.236f, -1.034f)
                quadToRelative(-0.103f, -1.134f, -0.17f, -1.45f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.256f, -0.608f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.833f, -0.591f)
                quadToRelative(0.602f, -0.224f, 0.94f, -0.744f)
                quadToRelative(0.335f, -0.52f, 0.336f, -1.221f)
                quadToRelative(0.0f, -0.618f, -0.268f, -1.111f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.777f, -0.788f)
                quadToRelative(-0.614f, -0.36f, -1.763f, -0.361f)
            }
        }
        .build()
        return _parkAndRailSmall!!
    }

private var _parkAndRailSmall: ImageVector? = null
