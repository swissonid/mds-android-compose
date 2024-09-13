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

public val MediumGroup.RewindMedium: ImageVector
    get() {
        if (_rewindMedium != null) {
            return _rewindMedium!!
        }
        _rewindMedium = Builder(name = "RewindMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 7.25f)
                verticalLineToRelative(21.5f)
                lineToRelative(-0.8f, -0.6f)
                lineToRelative(-8.2f, -6.15f)
                verticalLineToRelative(6.728f)
                lineToRelative(-0.793f, -0.573f)
                lineToRelative(-13.5f, -9.75f)
                lineTo(5.896f, 18.0f)
                lineToRelative(0.561f, -0.405f)
                lineToRelative(13.5f, -9.75f)
                lineToRelative(0.793f, -0.573f)
                verticalLineTo(14.0f)
                lineToRelative(8.2f, -6.15f)
                close()
                moveTo(7.604f, 18.0f)
                lineToRelative(12.146f, 8.772f)
                verticalLineTo(20.0f)
                lineToRelative(0.8f, 0.6f)
                lineToRelative(8.2f, 6.15f)
                verticalLineTo(9.25f)
                lineToRelative(-8.2f, 6.15f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineTo(9.228f)
                close()
            }
        }
        .build()
        return _rewindMedium!!
    }

private var _rewindMedium: ImageVector? = null
