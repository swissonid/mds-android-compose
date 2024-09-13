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

public val MediumGroup.QuestionMarkMedium: ImageVector
    get() {
        if (_questionMarkMedium != null) {
            return _questionMarkMedium!!
        }
        _questionMarkMedium = Builder(name = "QuestionMarkMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.773f, 10.286f)
                quadToRelative(-0.925f, 1.425f, -1.022f, 4.029f)
                horizontalLineToRelative(2.406f)
                quadToRelative(0.295f, -4.59f, 4.029f, -4.589f)
                quadToRelative(1.804f, 0.0f, 2.729f, 1.161f)
                quadToRelative(0.768f, 0.951f, 0.769f, 2.349f)
                quadToRelative(0.0f, 0.756f, -0.267f, 1.483f)
                quadToRelative(-0.32f, 0.854f, -1.356f, 1.918f)
                quadToRelative(-1.609f, 1.649f, -2.078f, 2.251f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.721f, 1.357f)
                quadToRelative(-0.349f, 1.036f, -0.377f, 3.176f)
                horizontalLineToRelative(2.378f)
                quadToRelative(0.0f, -1.204f, 0.141f, -1.959f)
                quadToRelative(0.125f, -0.755f, 0.44f, -1.266f)
                quadToRelative(0.314f, -0.51f, 1.112f, -1.28f)
                quadToRelative(1.804f, -1.762f, 2.28f, -2.42f)
                quadToRelative(1.065f, -1.44f, 1.064f, -3.441f)
                quadToRelative(0.0f, -2.42f, -1.567f, -3.904f)
                quadToRelative(-1.68f, -1.608f, -4.518f, -1.608f)
                quadToRelative(-1.765f, 0.0f, -3.176f, 0.713f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -2.266f, 2.03f)
                moveToRelative(6.77f, 18.184f)
                horizontalLineToRelative(-3.022f)
                verticalLineToRelative(-2.908f)
                horizontalLineToRelative(3.022f)
                close()
            }
        }
        .build()
        return _questionMarkMedium!!
    }

private var _questionMarkMedium: ImageVector? = null
