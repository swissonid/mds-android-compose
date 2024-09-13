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

public val MediumGroup.ExclamationPointMedium: ImageVector
    get() {
        if (_exclamationPointMedium != null) {
            return _exclamationPointMedium!!
        }
        _exclamationPointMedium = Builder(name = "ExclamationPointMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.357f, 14.388f)
                lineTo(19.357f, 8.154f)
                horizontalLineToRelative(-2.686f)
                verticalLineToRelative(6.234f)
                lineToRelative(0.669f, 9.046f)
                horizontalLineToRelative(1.321f)
                close()
                moveTo(19.497f, 28.5f)
                horizontalLineToRelative(-2.993f)
                verticalLineToRelative(-2.866f)
                horizontalLineToRelative(2.993f)
                close()
            }
        }
        .build()
        return _exclamationPointMedium!!
    }

private var _exclamationPointMedium: ImageVector? = null
