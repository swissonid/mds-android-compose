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

public val MediumGroup.StarFilledMedium: ImageVector
    get() {
        if (_starFilledMedium != null) {
            return _starFilledMedium!!
        }
        _starFilledMedium = Builder(name = "StarFilledMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.0f, 14.25f)
                horizontalLineTo(6.75f)
                lineToRelative(6.75f, 5.25f)
                lineToRelative(-3.0f, 8.699f)
                lineTo(18.0f, 23.25f)
                lineToRelative(7.5f, 4.949f)
                lineToRelative(-3.0f, -8.699f)
                lineToRelative(6.75f, -5.25f)
                horizontalLineTo(21.0f)
                lineToRelative(-3.0f, -9.0f)
                close()
            }
        }
        .build()
        return _starFilledMedium!!
    }

private var _starFilledMedium: ImageVector? = null
