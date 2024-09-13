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

public val SmallGroup.HeartFilledSmall: ImageVector
    get() {
        if (_heartFilledSmall != null) {
            return _heartFilledSmall!!
        }
        _heartFilledSmall = Builder(name = "HeartFilledSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(20.2f, 7.776f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 15.5f, 4.5f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -3.997f, 2.018f)
                arcTo(4.97f, 4.97f, 0.0f, false, false, 7.5f, 4.5f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -5.006f, 4.997f)
                curveToRelative(0.0f, 0.87f, 0.22f, 1.687f, 0.605f, 2.397f)
                curveToRelative(0.22f, 0.403f, 0.48f, 0.771f, 0.792f, 1.096f)
                lineToRelative(7.61f, 7.61f)
                lineToRelative(7.598f, -7.6f)
                curveToRelative(0.18f, -0.218f, 0.606f, -0.768f, 0.746f, -1.015f)
                curveToRelative(0.417f, -0.73f, 0.655f, -1.58f, 0.655f, -2.488f)
                curveToRelative(0.0f, -0.606f, -0.106f, -1.185f, -0.3f, -1.72f)
                close()
            }
        }
        .build()
        return _heartFilledSmall!!
    }

private var _heartFilledSmall: ImageVector? = null
