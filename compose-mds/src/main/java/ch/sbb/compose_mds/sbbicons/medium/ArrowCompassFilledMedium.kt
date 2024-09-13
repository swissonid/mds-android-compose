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

public val MediumGroup.ArrowCompassFilledMedium: ImageVector
    get() {
        if (_arrowCompassFilledMedium != null) {
            return _arrowCompassFilledMedium!!
        }
        _arrowCompassFilledMedium = Builder(name = "ArrowCompassFilledMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.251f, 29.162f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(-10.5f)
                lineTo(28.411f, 7.5f)
                close()
            }
        }
        .build()
        return _arrowCompassFilledMedium!!
    }

private var _arrowCompassFilledMedium: ImageVector? = null
