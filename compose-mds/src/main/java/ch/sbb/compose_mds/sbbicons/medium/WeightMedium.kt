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

public val MediumGroup.WeightMedium: ImageVector
    get() {
        if (_weightMedium != null) {
            return _weightMedium!!
        }
        _weightMedium = Builder(name = "WeightMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5f, 8.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(4.949f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.898f, 0.0f)
                horizontalLineToRelative(-7.73f)
                lineToRelative(-0.065f, 0.424f)
                lineToRelative(-3.0f, 19.5f)
                lineToRelative(-0.089f, 0.576f)
                horizontalLineToRelative(26.666f)
                lineToRelative(-0.089f, -0.576f)
                lineToRelative(-3.0f, -19.5f)
                lineToRelative(-0.065f, -0.424f)
                horizontalLineToRelative(-7.73f)
                moveToRelative(-2.449f, 1.0f)
                lineTo(8.679f, 11.75f)
                lineToRelative(-2.846f, 18.5f)
                horizontalLineToRelative(24.334f)
                lineToRelative(-2.846f, -18.5f)
                close()
                moveTo(17.75f, 18.016f)
                lineTo(14.394f, 21.403f)
                lineTo(18.067f, 26.583f)
                horizontalLineToRelative(-2.36f)
                lineToRelative(-2.602f, -3.845f)
                lineToRelative(-1.078f, 1.079f)
                verticalLineToRelative(2.766f)
                horizontalLineToRelative(-1.87f)
                verticalLineToRelative(-8.567f)
                horizontalLineToRelative(1.87f)
                verticalLineToRelative(3.545f)
                lineToRelative(3.357f, -3.545f)
                close()
                moveTo(25.942f, 26.582f)
                verticalLineToRelative(-4.617f)
                horizontalLineToRelative(-3.597f)
                verticalLineToRelative(1.371f)
                horizontalLineToRelative(1.904f)
                quadToRelative(-0.03f, 0.866f, -0.594f, 1.401f)
                quadToRelative(-0.566f, 0.532f, -1.45f, 0.533f)
                quadToRelative(-1.226f, -0.001f, -1.853f, -0.92f)
                quadToRelative(-0.51f, -0.75f, -0.509f, -2.028f)
                quadToRelative(0.0f, -1.307f, 0.545f, -2.074f)
                quadToRelative(0.621f, -0.878f, 1.758f, -0.878f)
                quadToRelative(0.75f, 0.0f, 1.239f, 0.386f)
                reflectiveQuadToRelative(0.63f, 1.078f)
                horizontalLineToRelative(1.81f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -0.909f, -1.933f)
                quadToRelative(-1.06f, -1.09f, -2.748f, -1.09f)
                quadToRelative(-1.827f, 0.0f, -2.982f, 1.219f)
                quadToRelative(-1.23f, 1.29f, -1.23f, 3.31f)
                quadToRelative(0.0f, 1.781f, 0.944f, 2.994f)
                quadToRelative(1.136f, 1.455f, 3.099f, 1.454f)
                quadToRelative(1.61f, -0.001f, 2.56f, -1.184f)
                lineToRelative(0.188f, 0.978f)
                close()
            }
        }
        .build()
        return _weightMedium!!
    }

private var _weightMedium: ImageVector? = null
