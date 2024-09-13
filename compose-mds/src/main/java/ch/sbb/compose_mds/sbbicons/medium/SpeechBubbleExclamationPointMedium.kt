package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.SpeechBubbleExclamationPointMedium: ImageVector
    get() {
        if (_speechBubbleExclamationPointMedium != null) {
            return _speechBubbleExclamationPointMedium!!
        }
        _speechBubbleExclamationPointMedium = Builder(name = "SpeechBubbleExclamationPointMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 9.25f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(17.5f)
                horizontalLineTo(14.832f)
                lineToRelative(-3.228f, 3.229f)
                lineToRelative(-0.854f, 0.853f)
                verticalLineTo(26.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(9.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.521f, -2.522f)
                lineToRelative(0.147f, -0.146f)
                horizontalLineTo(30.25f)
                verticalLineToRelative(-15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                verticalLineToRelative(7.5f)
                moveTo(18.5f, 21.75f)
                verticalLineTo(24.0f)
            }
        }
        .build()
        return _speechBubbleExclamationPointMedium!!
    }

private var _speechBubbleExclamationPointMedium: ImageVector? = null
