package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.ThermometerMedium: ImageVector
    get() {
        if (_thermometerMedium != null) {
            return _thermometerMedium!!
        }
        _thermometerMedium = Builder(name = "ThermometerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 24.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                close()
                moveTo(17.25f, 24.75f)
                lineTo(17.25f, 12.0f)
                moveToRelative(5.25f, 3.75f)
                horizontalLineToRelative(3.0f)
                moveToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                moveToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                moveToRelative(-3.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                moveToRelative(-5.25f, 3.95f)
                lineTo(20.25f, 5.25f)
                horizontalLineToRelative(-6.0f)
                lineTo(14.25f, 22.7f)
                arcTo(5.24f, 5.24f, 0.0f, false, false, 12.0f, 27.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, true, false, 10.5f, 0.0f)
                curveToRelative(0.0f, -1.782f, -0.892f, -3.35f, -2.25f, -4.3f)
                close()
            }
        }
        .build()
        return _thermometerMedium!!
    }

private var _thermometerMedium: ImageVector? = null
