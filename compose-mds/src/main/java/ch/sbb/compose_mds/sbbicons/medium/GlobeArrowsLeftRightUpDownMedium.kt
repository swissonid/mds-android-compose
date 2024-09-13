package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.GlobeArrowsLeftRightUpDownMedium: ImageVector
    get() {
        if (_globeArrowsLeftRightUpDownMedium != null) {
            return _globeArrowsLeftRightUpDownMedium!!
        }
        _globeArrowsLeftRightUpDownMedium = Builder(name = "GlobeArrowsLeftRightUpDownMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.25f, 18.75f)
                    arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                    moveToRelative(6.0f, -6.0f)
                    arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                    moveToRelative(6.0f, 6.0f)
                    horizontalLineToRelative(-12.0f)
                    moveToRelative(6.0f, 6.0f)
                    arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                    moveToRelative(6.0f, 6.0f)
                    curveToRelative(1.326f, 0.0f, 2.4f, -2.686f, 2.4f, -6.0f)
                    moveToRelative(-2.4f, 6.0f)
                    curveToRelative(-1.326f, 0.0f, -2.4f, -2.686f, -2.4f, -6.0f)
                    reflectiveCurveToRelative(1.074f, -6.0f, 2.4f, -6.0f)
                    moveToRelative(-6.0f, 6.0f)
                    arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                    moveToRelative(0.0f, 0.0f)
                    curveToRelative(1.326f, 0.0f, 2.4f, 2.686f, 2.4f, 6.0f)
                    moveToRelative(0.0f, 0.0f)
                    horizontalLineToRelative(-6.9f)
                    moveTo(13.5f, 6.0f)
                    lineToRelative(3.75f, 3.75f)
                    lineTo(21.0f, 6.0f)
                    moveToRelative(9.0f, 9.0f)
                    lineToRelative(-3.75f, 3.75f)
                    lineTo(30.0f, 22.5f)
                    moveToRelative(-25.5f, 0.0f)
                    lineToRelative(3.75f, -3.75f)
                    lineTo(4.5f, 15.0f)
                    moveTo(21.0f, 31.5f)
                    lineToRelative(-3.75f, -3.75f)
                    lineToRelative(-3.75f, 3.75f)
                }
            }
        }
        .build()
        return _globeArrowsLeftRightUpDownMedium!!
    }

private var _globeArrowsLeftRightUpDownMedium: ImageVector? = null
