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

public val SmallGroup.QuestionMarkSmall: ImageVector
    get() {
        if (_questionMarkSmall != null) {
            return _questionMarkSmall!!
        }
        _questionMarkSmall = Builder(name = "QuestionMarkSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.515f, 6.857f)
                quadToRelative(-0.617f, 0.95f, -0.681f, 2.686f)
                horizontalLineToRelative(1.604f)
                quadToRelative(0.196f, -3.06f, 2.686f, -3.059f)
                quadToRelative(1.203f, 0.0f, 1.819f, 0.774f)
                quadToRelative(0.513f, 0.634f, 0.513f, 1.566f)
                quadToRelative(0.0f, 0.504f, -0.178f, 0.989f)
                quadToRelative(-0.214f, 0.57f, -0.904f, 1.278f)
                quadToRelative(-1.073f, 1.1f, -1.385f, 1.501f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.481f, 0.905f)
                quadToRelative(-0.233f, 0.69f, -0.251f, 2.117f)
                horizontalLineToRelative(1.585f)
                quadToRelative(0.0f, -0.803f, 0.094f, -1.306f)
                quadToRelative(0.083f, -0.504f, 0.293f, -0.844f)
                reflectiveQuadToRelative(0.742f, -0.853f)
                quadToRelative(1.202f, -1.175f, 1.52f, -1.614f)
                quadToRelative(0.71f, -0.96f, 0.709f, -2.294f)
                quadToRelative(0.0f, -1.613f, -1.045f, -2.602f)
                quadToRelative(-1.119f, -1.072f, -3.012f, -1.072f)
                quadToRelative(-1.176f, 0.0f, -2.117f, 0.475f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.511f, 1.353f)
                moveToRelative(4.514f, 12.123f)
                horizontalLineToRelative(-2.015f)
                verticalLineToRelative(-1.939f)
                horizontalLineToRelative(2.015f)
                close()
            }
        }
        .build()
        return _questionMarkSmall!!
    }

private var _questionMarkSmall: ImageVector? = null
