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

public val SmallGroup.ChevronSmallLeftRightSmall: ImageVector
    get() {
        if (_chevronSmallLeftRightSmall != null) {
            return _chevronSmallLeftRightSmall!!
        }
        _chevronSmallLeftRightSmall = Builder(name = "ChevronSmallLeftRightSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.67f, 11.644f)
                lineTo(16.72f, 7.74f)
                lineToRelative(-0.703f, 0.711f)
                lineTo(19.607f, 12.0f)
                lineToRelative(-3.588f, 3.548f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(3.948f, -3.904f)
                lineToRelative(0.36f, -0.355f)
                close()
                moveTo(3.37f, 11.644f)
                lineTo(7.32f, 7.74f)
                lineToRelative(0.703f, 0.711f)
                lineTo(4.433f, 12.0f)
                lineToRelative(3.588f, 3.548f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-3.948f, -3.904f)
                lineTo(3.01f, 12.0f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftRightSmall!!
    }

private var _chevronSmallLeftRightSmall: ImageVector? = null
