package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.WagonCouplingDraggingEquipmentMedium: ImageVector
    get() {
        if (_wagonCouplingDraggingEquipmentMedium != null) {
            return _wagonCouplingDraggingEquipmentMedium!!
        }
        _wagonCouplingDraggingEquipmentMedium = Builder(name =
                "WagonCouplingDraggingEquipmentMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.25f, 5.75f)
                    lineTo(3.0f, 5.75f)
                    verticalLineToRelative(-1.0f)
                    horizontalLineToRelative(19.25f)
                    verticalLineToRelative(13.5f)
                    horizontalLineToRelative(5.0f)
                    lineTo(27.25f, 15.0f)
                    horizontalLineToRelative(1.0f)
                    verticalLineToRelative(7.5f)
                    horizontalLineToRelative(-1.0f)
                    verticalLineToRelative(-3.25f)
                    horizontalLineToRelative(-2.0f)
                    verticalLineToRelative(4.272f)
                    lineToRelative(3.578f, 3.1f)
                    lineToRelative(-0.655f, 0.756f)
                    lineToRelative(-3.75f, -3.25f)
                    lineToRelative(-0.173f, -0.15f)
                    lineTo(24.25f, 19.25f)
                    horizontalLineToRelative(-2.0f)
                    verticalLineToRelative(4.5f)
                    horizontalLineToRelative(-6.0f)
                    verticalLineToRelative(1.375f)
                    curveToRelative(0.0f, 2.128f, -1.027f, 4.025f, -2.598f, 5.125f)
                    horizontalLineToRelative(3.413f)
                    lineToRelative(5.11f, -4.38f)
                    lineToRelative(0.325f, -0.279f)
                    lineToRelative(0.325f, 0.28f)
                    lineToRelative(5.11f, 4.379f)
                    lineTo(33.0f, 30.25f)
                    verticalLineToRelative(1.0f)
                    lineTo(3.0f, 31.25f)
                    verticalLineToRelative(-1.0f)
                    horizontalLineToRelative(4.348f)
                    curveToRelative(-1.571f, -1.1f, -2.598f, -2.997f, -2.598f, -5.125f)
                    lineTo(4.75f, 23.75f)
                    lineTo(3.0f, 23.75f)
                    verticalLineToRelative(-1.0f)
                    horizontalLineToRelative(18.25f)
                    close()
                    moveTo(22.5f, 26.909f)
                    lineTo(26.398f, 30.25f)
                    horizontalLineToRelative(-7.796f)
                    close()
                    moveTo(10.5f, 30.25f)
                    curveToRelative(2.591f, 0.0f, 4.75f, -2.262f, 4.75f, -5.125f)
                    lineTo(15.25f, 23.75f)
                    horizontalLineToRelative(-9.5f)
                    verticalLineToRelative(1.375f)
                    curveToRelative(0.0f, 2.863f, 2.159f, 5.125f, 4.75f, 5.125f)
                    moveToRelative(19.75f, -7.75f)
                    lineTo(30.25f, 15.0f)
                    horizontalLineToRelative(1.0f)
                    verticalLineToRelative(3.25f)
                    lineTo(33.0f, 18.25f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-1.75f)
                    verticalLineToRelative(3.25f)
                    close()
                }
            }
        }
        .build()
        return _wagonCouplingDraggingEquipmentMedium!!
    }

private var _wagonCouplingDraggingEquipmentMedium: ImageVector? = null
