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

public val SmallGroup.QuestionAnswerSmall: ImageVector
    get() {
        if (_questionAnswerSmall != null) {
            return _questionAnswerSmall!!
        }
        _questionAnswerSmall = Builder(name = "QuestionAnswerSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.957f)
                lineToRelative(0.854f, -0.853f)
                lineTo(8.957f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.043f)
                lineToRelative(2.103f, 2.104f)
                lineToRelative(0.854f, 0.853f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.5f)
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.457f)
                lineToRelative(0.147f, 0.146f)
                lineTo(17.0f, 18.543f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(8.543f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(7.0f, 15.543f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                moveToRelative(4.828f, -1.372f)
                horizontalLineToRelative(0.844f)
                verticalLineToRelative(-0.812f)
                horizontalLineToRelative(-0.844f)
                close()
                moveTo(7.782f, 7.55f)
                quadToRelative(-0.258f, 0.399f, -0.285f, 1.125f)
                horizontalLineToRelative(0.671f)
                quadToRelative(0.082f, -1.281f, 1.125f, -1.281f)
                quadToRelative(0.504f, 0.0f, 0.762f, 0.324f)
                quadToRelative(0.215f, 0.266f, 0.215f, 0.657f)
                quadToRelative(0.0f, 0.21f, -0.074f, 0.414f)
                quadToRelative(-0.09f, 0.238f, -0.379f, 0.535f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.58f, 0.629f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.2f, 0.379f)
                quadToRelative(-0.098f, 0.288f, -0.107f, 0.886f)
                horizontalLineToRelative(0.664f)
                quadToRelative(0.0f, -0.336f, 0.04f, -0.547f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.122f, -0.353f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.311f, -0.358f)
                quadToRelative(0.504f, -0.492f, 0.637f, -0.675f)
                arcTo(1.58f, 1.58f, 0.0f, false, false, 11.0f, 8.324f)
                quadToRelative(0.0f, -0.676f, -0.437f, -1.09f)
                quadToRelative(-0.469f, -0.449f, -1.262f, -0.449f)
                quadToRelative(-0.492f, 0.0f, -0.886f, 0.199f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.633f, 0.566f)
            }
        }
        .build()
        return _questionAnswerSmall!!
    }

private var _questionAnswerSmall: ImageVector? = null
