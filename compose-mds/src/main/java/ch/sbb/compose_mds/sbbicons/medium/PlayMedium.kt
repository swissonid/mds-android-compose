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

public val MediumGroup.PlayMedium: ImageVector
    get() {
        if (_playMedium != null) {
            return _playMedium!!
        }
        _playMedium = Builder(name = "PlayMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(10.75f, 6.63f)
                lineToRelative(0.752f, 0.438f)
                lineToRelative(9.0f, 5.25f)
                lineToRelative(9.0f, 5.25f)
                lineToRelative(0.74f, 0.432f)
                lineToRelative(-0.74f, 0.432f)
                lineToRelative(-9.0f, 5.25f)
                lineToRelative(-9.0f, 5.25f)
                lineToRelative(-0.752f, 0.438f)
                verticalLineTo(6.63f)
                moveToRelative(1.0f, 1.74f)
                verticalLineToRelative(19.26f)
                lineToRelative(8.248f, -4.812f)
                lineTo(28.258f, 18.0f)
                lineToRelative(-8.26f, -4.818f)
                close()
            }
        }
        .build()
        return _playMedium!!
    }

private var _playMedium: ImageVector? = null
