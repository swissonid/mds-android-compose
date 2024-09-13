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

public val MediumGroup.ParkAndRailMedium: ImageVector
    get() {
        if (_parkAndRailMedium != null) {
            return _parkAndRailMedium!!
        }
        _parkAndRailMedium = Builder(name = "ParkAndRailMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.504f, 8.75f)
                lineTo(4.502f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(31.504f, 28.25f)
                lineTo(4.502f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(7.104f, 17.612f)
                verticalLineToRelative(-3.4f)
                horizontalLineToRelative(2.2f)
                quadToRelative(1.076f, 0.0f, 1.55f, 0.33f)
                quadToRelative(0.658f, 0.442f, 0.658f, 1.346f)
                quadToRelative(-0.001f, 0.894f, -0.566f, 1.355f)
                quadToRelative(-0.46f, 0.369f, -1.503f, 0.369f)
                close()
                moveTo(9.328f, 11.996f)
                lineTo(4.484f, 11.996f)
                verticalLineToRelative(12.001f)
                horizontalLineToRelative(2.62f)
                verticalLineToRelative(-4.324f)
                horizontalLineToRelative(2.692f)
                quadToRelative(1.035f, 0.0f, 1.741f, -0.201f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 1.256f, -0.662f)
                quadToRelative(1.297f, -1.075f, 1.297f, -2.955f)
                quadToRelative(0.0f, -2.119f, -1.569f, -3.17f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.267f, -0.536f)
                quadToRelative(-0.702f, -0.153f, -1.926f, -0.153f)
                moveToRelative(4.79f, 6.16f)
                horizontalLineToRelative(2.314f)
                verticalLineToRelative(-2.312f)
                horizontalLineToRelative(1.326f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(1.324f)
                horizontalLineToRelative(-2.322f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(-1.326f)
                verticalLineToRelative(-2.313f)
                horizontalLineToRelative(-2.313f)
                close()
                moveTo(23.65f, 17.357f)
                verticalLineToRelative(-3.3f)
                horizontalLineToRelative(2.61f)
                quadToRelative(1.149f, -0.001f, 1.683f, 0.395f)
                quadToRelative(0.535f, 0.392f, 0.534f, 1.246f)
                quadToRelative(0.0f, 0.88f, -0.624f, 1.314f)
                quadToRelative(-0.494f, 0.345f, -1.7f, 0.345f)
                close()
                moveTo(26.843f, 11.997f)
                horizontalLineToRelative(-5.812f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.619f)
                verticalLineToRelative(-4.72f)
                horizontalLineToRelative(2.355f)
                quadToRelative(1.257f, 0.0f, 1.777f, 0.49f)
                quadToRelative(0.522f, 0.486f, 0.621f, 1.759f)
                quadToRelative(0.098f, 1.43f, 0.16f, 1.822f)
                quadToRelative(0.063f, 0.395f, 0.2f, 0.65f)
                horizontalLineToRelative(2.733f)
                lineToRelative(-0.114f, -0.14f)
                quadToRelative(-0.237f, -0.304f, -0.352f, -1.55f)
                quadToRelative(-0.157f, -1.702f, -0.255f, -2.176f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.386f, -0.912f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, -1.248f, -0.886f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 1.409f, -1.116f)
                quadToRelative(0.504f, -0.78f, 0.505f, -1.832f)
                quadToRelative(0.0f, -0.927f, -0.403f, -1.666f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, -1.166f, -1.182f)
                quadToRelative(-0.92f, -0.541f, -2.643f, -0.542f)
            }
        }
        .build()
        return _parkAndRailMedium!!
    }

private var _parkAndRailMedium: ImageVector? = null
