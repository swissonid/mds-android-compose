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

public val MediumGroup.QuestionAnswerMedium: ImageVector
    get() {
        if (_questionAnswerMedium != null) {
            return _questionAnswerMedium!!
        }
        _questionAnswerMedium = Builder(name = "QuestionAnswerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.082f)
                lineToRelative(0.854f, -0.853f)
                lineToRelative(3.228f, -3.229f)
                horizontalLineToRelative(0.418f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(8.918f)
                lineToRelative(3.228f, 3.229f)
                lineToRelative(0.854f, 0.853f)
                lineTo(26.75f, 26.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4.5f)
                lineTo(5.25f, 7.75f)
                moveToRelative(18.5f, 5.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(2.0f)
                lineTo(27.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.332f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(2.521f, 2.522f)
                lineTo(25.75f, 25.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(5.75f, 21.25f)
                lineTo(5.75f, 8.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-9.832f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-2.521f, 2.522f)
                lineTo(10.25f, 21.25f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(7.492f, -2.308f)
                horizontalLineToRelative(1.266f)
                verticalLineToRelative(-1.218f)
                horizontalLineToRelative(-1.266f)
                close()
                moveTo(11.673f, 11.325f)
                quadToRelative(-0.387f, 0.6f, -0.427f, 1.688f)
                horizontalLineToRelative(1.006f)
                quadToRelative(0.124f, -1.922f, 1.688f, -1.922f)
                quadToRelative(0.756f, 0.0f, 1.143f, 0.486f)
                quadToRelative(0.322f, 0.4f, 0.322f, 0.986f)
                quadToRelative(0.0f, 0.315f, -0.11f, 0.62f)
                quadToRelative(-0.135f, 0.357f, -0.57f, 0.803f)
                quadToRelative(-0.673f, 0.691f, -0.87f, 0.944f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.3f, 0.568f)
                quadToRelative(-0.146f, 0.432f, -0.16f, 1.33f)
                horizontalLineToRelative(0.996f)
                quadToRelative(0.0f, -0.505f, 0.059f, -0.821f)
                quadToRelative(0.054f, -0.315f, 0.184f, -0.53f)
                quadToRelative(0.132f, -0.212f, 0.467f, -0.537f)
                quadToRelative(0.756f, -0.739f, 0.955f, -1.012f)
                quadToRelative(0.444f, -0.604f, 0.444f, -1.442f)
                quadToRelative(0.0f, -1.013f, -0.655f, -1.635f)
                quadToRelative(-0.704f, -0.673f, -1.893f, -0.673f)
                quadToRelative(-0.738f, 0.0f, -1.33f, 0.298f)
                quadToRelative(-0.593f, 0.3f, -0.949f, 0.85f)
            }
        }
        .build()
        return _questionAnswerMedium!!
    }

private var _questionAnswerMedium: ImageVector? = null
