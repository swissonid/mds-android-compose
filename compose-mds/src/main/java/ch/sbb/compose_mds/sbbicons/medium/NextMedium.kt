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

public val MediumGroup.NextMedium: ImageVector
    get() {
        if (_nextMedium != null) {
            return _nextMedium!!
        }
        _nextMedium = Builder(name = "NextMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.022f, 7.83f)
                lineTo(6.25f, 7.33f)
                verticalLineTo(28.67f)
                lineToRelative(0.772f, -0.502f)
                lineToRelative(7.5f, -4.875f)
                lineToRelative(7.5f, -4.875f)
                lineToRelative(0.645f, -0.419f)
                lineToRelative(-0.645f, -0.42f)
                lineToRelative(-7.5f, -4.874f)
                close()
                moveTo(7.25f, 18.0f)
                verticalLineTo(9.171f)
                lineToRelative(6.727f, 4.373f)
                lineTo(20.834f, 18.0f)
                lineToRelative(-6.855f, 4.456f)
                lineToRelative(-6.728f, 4.373f)
                close()
                moveTo(24.752f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(7.75f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(4.0f, 19.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(8.75f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _nextMedium!!
    }

private var _nextMedium: ImageVector? = null
