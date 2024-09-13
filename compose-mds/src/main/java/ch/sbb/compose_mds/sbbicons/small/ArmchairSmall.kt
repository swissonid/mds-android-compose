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

public val SmallGroup.ArmchairSmall: ImageVector
    get() {
        if (_armchairSmall != null) {
            return _armchairSmall!!
        }
        _armchairSmall = Builder(name = "ArmchairSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.44f, 3.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 4.5f)
                verticalLineToRelative(4.555f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.97f, 2.445f)
                lineTo(16.0f, 11.5f)
                lineTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, -2.451f)
                lineTo(6.0f, 4.5f)
                curveToRelative(0.0f, -0.398f, 0.158f, -0.78f, 0.44f, -1.06f)
                moveToRelative(0.966f, 8.06f)
                lineTo(7.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.25f, 1.297f)
                lineToRelative(0.25f, 0.144f)
                verticalLineToRelative(3.59f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(11.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3.59f)
                lineToRelative(0.25f, -0.144f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.25f, -1.297f)
                horizontalLineToRelative(-0.406f)
                lineTo(17.0f, 11.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 14.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(16.0f, 14.0f)
                close()
                moveTo(19.0f, 4.5f)
                verticalLineToRelative(4.543f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.03f, 4.455f)
                verticalLineToRelative(3.032f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 18.552f)
                verticalLineToRelative(2.016f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 17.568f, 22.0f)
                horizontalLineToRelative(-0.136f)
                arcTo(1.417f, 1.417f, 0.0f, false, true, 16.0f, 20.568f)
                lineTo(16.0f, 19.03f)
                lineTo(8.0f, 19.03f)
                verticalLineToRelative(1.538f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 6.568f, 22.0f)
                horizontalLineToRelative(-0.135f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 5.0f, 20.568f)
                lineTo(5.0f, 18.53f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.0f, -2.0f)
                verticalLineToRelative(-3.032f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.0f, -4.45f)
                lineTo(5.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 4.5f)
                moveToRelative(-1.47f, 14.53f)
                quadToRelative(0.239f, 0.0f, 0.47f, -0.045f)
                verticalLineToRelative(1.591f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.424f, 0.424f)
                horizontalLineToRelative(-0.151f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.425f, -0.424f)
                lineTo(17.0f, 19.03f)
                close()
                moveTo(6.5f, 19.03f)
                lineTo(7.0f, 19.03f)
                verticalLineToRelative(1.546f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.424f, 0.424f)
                horizontalLineToRelative(-0.151f)
                arcTo(0.42f, 0.42f, 0.0f, false, true, 6.0f, 20.576f)
                lineTo(6.0f, 18.98f)
                quadToRelative(0.245f, 0.05f, 0.5f, 0.05f)
            }
        }
        .build()
        return _armchairSmall!!
    }

private var _armchairSmall: ImageVector? = null
