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

public val MediumGroup.RecordMedium: ImageVector
    get() {
        if (_recordMedium != null) {
            return _recordMedium!!
        }
        _recordMedium = Builder(name = "RecordMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 18.0f)
                curveToRelative(0.0f, -5.661f, 4.589f, -10.25f, 10.25f, -10.25f)
                reflectiveCurveTo(28.25f, 12.339f, 28.25f, 18.0f)
                reflectiveCurveTo(23.661f, 28.25f, 18.0f, 28.25f)
                reflectiveCurveTo(7.75f, 23.661f, 7.75f, 18.0f)
                moveTo(18.0f, 8.75f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 8.75f, 18.0f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 18.0f, 27.25f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 27.25f, 18.0f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 18.0f, 8.75f)
            }
        }
        .build()
        return _recordMedium!!
    }

private var _recordMedium: ImageVector? = null
