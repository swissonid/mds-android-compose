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

public val SmallGroup.ClipboardQuestionMarkSmall: ImageVector
    get() {
        if (_clipboardQuestionMarkSmall != null) {
            return _clipboardQuestionMarkSmall!!
        }
        _clipboardQuestionMarkSmall = Builder(name = "ClipboardQuestionMarkSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(15.0f, 2.0f)
                lineTo(9.5f, 2.0f)
                moveToRelative(0.5f, 1.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 4.0f)
                moveToRelative(2.305f, 12.783f)
                horizontalLineToRelative(1.266f)
                verticalLineToRelative(-1.219f)
                horizontalLineToRelative(-1.266f)
                close()
                moveTo(9.735f, 9.166f)
                quadToRelative(-0.386f, 0.597f, -0.427f, 1.688f)
                horizontalLineToRelative(1.007f)
                quadToRelative(0.123f, -1.922f, 1.688f, -1.922f)
                quadToRelative(0.756f, 0.0f, 1.143f, 0.486f)
                quadToRelative(0.322f, 0.399f, 0.322f, 0.984f)
                quadToRelative(0.0f, 0.316f, -0.112f, 0.621f)
                quadToRelative(-0.134f, 0.358f, -0.568f, 0.803f)
                quadToRelative(-0.674f, 0.692f, -0.87f, 0.944f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.302f, 0.568f)
                quadToRelative(-0.146f, 0.433f, -0.158f, 1.33f)
                horizontalLineToRelative(0.996f)
                quadToRelative(0.0f, -0.504f, 0.06f, -0.82f)
                quadToRelative(0.051f, -0.316f, 0.183f, -0.531f)
                quadToRelative(0.132f, -0.213f, 0.466f, -0.536f)
                quadToRelative(0.756f, -0.738f, 0.955f, -1.013f)
                quadToRelative(0.445f, -0.604f, 0.445f, -1.442f)
                quadToRelative(0.0f, -1.014f, -0.656f, -1.635f)
                quadToRelative(-0.703f, -0.673f, -1.892f, -0.673f)
                quadToRelative(-0.74f, 0.0f, -1.33f, 0.298f)
                quadToRelative(-0.591f, 0.3f, -0.95f, 0.85f)
            }
        }
        .build()
        return _clipboardQuestionMarkSmall!!
    }

private var _clipboardQuestionMarkSmall: ImageVector? = null
