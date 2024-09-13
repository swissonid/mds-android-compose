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

public val SmallGroup.WeightSmall: ImageVector
    get() {
        if (_weightSmall != null) {
            return _weightSmall!!
        }
        _weightSmall = Builder(name = "WeightSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(14.0f, 7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.0f, 0.0f)
                lineTo(5.071f, 7.0f)
                lineToRelative(-0.065f, 0.424f)
                lineToRelative(-2.0f, 13.0f)
                lineToRelative(-0.089f, 0.576f)
                horizontalLineToRelative(18.166f)
                lineToRelative(-0.089f, -0.576f)
                lineToRelative(-2.0f, -13.0f)
                lineTo(18.93f, 7.0f)
                lineTo(14.0f, 7.0f)
                moveToRelative(-2.0f, 1.0f)
                lineTo(5.929f, 8.0f)
                lineTo(4.083f, 20.0f)
                horizontalLineToRelative(15.834f)
                lineTo(18.071f, 8.0f)
                close()
                moveTo(11.834f, 12.01f)
                lineTo(9.596f, 14.27f)
                lineToRelative(2.449f, 3.453f)
                horizontalLineToRelative(-1.574f)
                lineToRelative(-1.734f, -2.563f)
                lineToRelative(-0.719f, 0.719f)
                verticalLineToRelative(1.844f)
                lineTo(6.772f, 17.723f)
                lineTo(6.772f, 12.01f)
                horizontalLineToRelative(1.246f)
                verticalLineToRelative(2.363f)
                lineToRelative(2.238f, -2.363f)
                close()
                moveTo(17.294f, 17.721f)
                verticalLineToRelative(-3.078f)
                horizontalLineToRelative(-2.397f)
                verticalLineToRelative(0.914f)
                horizontalLineToRelative(1.269f)
                quadToRelative(-0.02f, 0.578f, -0.396f, 0.934f)
                quadToRelative(-0.377f, 0.355f, -0.967f, 0.355f)
                quadToRelative(-0.816f, 0.0f, -1.235f, -0.613f)
                quadToRelative(-0.34f, -0.5f, -0.34f, -1.351f)
                quadToRelative(0.0f, -0.873f, 0.364f, -1.383f)
                quadToRelative(0.414f, -0.585f, 1.172f, -0.585f)
                quadToRelative(0.5f, 0.0f, 0.826f, 0.257f)
                reflectiveQuadToRelative(0.42f, 0.719f)
                horizontalLineToRelative(1.207f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -0.606f, -1.29f)
                quadToRelative(-0.707f, -0.725f, -1.832f, -0.726f)
                quadToRelative(-1.218f, 0.0f, -1.988f, 0.813f)
                quadToRelative(-0.82f, 0.859f, -0.82f, 2.207f)
                quadToRelative(0.0f, 1.186f, 0.629f, 1.996f)
                quadToRelative(0.758f, 0.969f, 2.066f, 0.968f)
                quadToRelative(1.074f, -0.001f, 1.707f, -0.788f)
                lineToRelative(0.125f, 0.651f)
                close()
            }
        }
        .build()
        return _weightSmall!!
    }

private var _weightSmall: ImageVector? = null
