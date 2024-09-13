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

public val MediumGroup.ClipboardQuestionMarkMedium: ImageVector
    get() {
        if (_clipboardQuestionMarkMedium != null) {
            return _clipboardQuestionMarkMedium!!
        }
        _clipboardQuestionMarkMedium = Builder(name = "ClipboardQuestionMarkMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(0.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(1.5f)
                moveToRelative(7.5f, 0.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-26.0f)
                close()
                moveTo(16.957f, 25.175f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.829f)
                horizontalLineToRelative(-1.9f)
                close()
                moveTo(14.603f, 13.749f)
                quadToRelative(-0.58f, 0.896f, -0.64f, 2.532f)
                horizontalLineToRelative(1.51f)
                quadToRelative(0.184f, -2.884f, 2.532f, -2.883f)
                quadToRelative(1.134f, 0.0f, 1.714f, 0.729f)
                quadToRelative(0.482f, 0.598f, 0.483f, 1.476f)
                quadToRelative(0.0f, 0.474f, -0.168f, 0.932f)
                quadToRelative(-0.2f, 0.537f, -0.852f, 1.204f)
                quadToRelative(-1.01f, 1.037f, -1.305f, 1.416f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.453f, 0.852f)
                quadToRelative(-0.218f, 0.65f, -0.237f, 1.995f)
                horizontalLineToRelative(1.494f)
                quadToRelative(0.0f, -0.755f, 0.089f, -1.23f)
                quadToRelative(0.078f, -0.474f, 0.276f, -0.796f)
                quadToRelative(0.197f, -0.32f, 0.699f, -0.804f)
                quadToRelative(1.134f, -1.108f, 1.432f, -1.52f)
                quadToRelative(0.669f, -0.907f, 0.668f, -2.163f)
                quadToRelative(0.0f, -1.521f, -0.984f, -2.453f)
                quadToRelative(-1.055f, -1.01f, -2.838f, -1.009f)
                quadToRelative(-1.11f, 0.0f, -1.995f, 0.447f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.425f, 1.275f)
            }
        }
        .build()
        return _clipboardQuestionMarkMedium!!
    }

private var _clipboardQuestionMarkMedium: ImageVector? = null
