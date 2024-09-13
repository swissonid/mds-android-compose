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

public val MediumGroup.PreviousMedium: ImageVector
    get() {
        if (_previousMedium != null) {
            return _previousMedium!!
        }
        _previousMedium = Builder(name = "PreviousMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.752f, 8.25f)
                verticalLineToRelative(-0.921f)
                lineToRelative(-0.773f, 0.502f)
                lineToRelative(-7.5f, 4.875f)
                lineToRelative(-7.5f, 4.875f)
                lineToRelative(-0.645f, 0.419f)
                lineToRelative(0.645f, 0.42f)
                lineToRelative(7.5f, 4.874f)
                lineToRelative(7.5f, 4.875f)
                lineToRelative(0.773f, 0.502f)
                verticalLineTo(8.25f)
                moveToRelative(-7.728f, 5.294f)
                lineToRelative(6.727f, -4.373f)
                verticalLineTo(26.83f)
                lineToRelative(-6.727f, -4.373f)
                lineTo(15.169f, 18.0f)
                close()
                moveTo(6.75f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(7.75f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 19.5f)
                verticalLineTo(8.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(18.5f)
                close()
            }
        }
        .build()
        return _previousMedium!!
    }

private var _previousMedium: ImageVector? = null
