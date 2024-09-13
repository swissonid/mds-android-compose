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

public val MediumGroup.ArrowCompassMedium: ImageVector
    get() {
        if (_arrowCompassMedium != null) {
            return _arrowCompassMedium!!
        }
        _arrowCompassMedium = Builder(name = "ArrowCompassMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.571f, 6.34f)
                lineToRelative(-0.716f, 1.389f)
                lineToRelative(-11.16f, 21.662f)
                lineToRelative(-0.944f, 1.833f)
                verticalLineTo(19.162f)
                horizontalLineTo(4.689f)
                lineToRelative(1.833f, -0.945f)
                lineToRelative(21.66f, -11.161f)
                close()
                moveTo(8.813f, 18.162f)
                horizontalLineToRelative(8.938f)
                verticalLineToRelative(8.937f)
                lineToRelative(9.5f, -18.439f)
                close()
            }
        }
        .build()
        return _arrowCompassMedium!!
    }

private var _arrowCompassMedium: ImageVector? = null
