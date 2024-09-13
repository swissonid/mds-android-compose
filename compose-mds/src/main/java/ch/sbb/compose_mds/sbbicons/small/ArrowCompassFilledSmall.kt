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

public val SmallGroup.ArrowCompassFilledSmall: ImageVector
    get() {
        if (_arrowCompassFilledSmall != null) {
            return _arrowCompassFilledSmall!!
        }
        _arrowCompassFilledSmall = Builder(name = "ArrowCompassFilledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.5f, 19.441f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(18.94f, 5.0f)
                close()
            }
        }
        .build()
        return _arrowCompassFilledSmall!!
    }

private var _arrowCompassFilledSmall: ImageVector? = null
