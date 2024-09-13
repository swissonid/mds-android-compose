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

public val MediumGroup.PauseMedium: ImageVector
    get() {
        if (_pauseMedium != null) {
            return _pauseMedium!!
        }
        _pauseMedium = Builder(name = "PauseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(5.5f)
                lineTo(16.25f, 7.75f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 19.5f)
                lineTo(11.75f, 8.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(20.252f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(5.5f)
                lineTo(25.252f, 7.75f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 19.5f)
                lineTo(20.752f, 8.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(18.5f)
                close()
            }
        }
        .build()
        return _pauseMedium!!
    }

private var _pauseMedium: ImageVector? = null
