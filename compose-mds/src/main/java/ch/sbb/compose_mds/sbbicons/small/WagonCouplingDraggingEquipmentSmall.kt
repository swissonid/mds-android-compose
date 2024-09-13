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

public val SmallGroup.WagonCouplingDraggingEquipmentSmall: ImageVector
    get() {
        if (_wagonCouplingDraggingEquipmentSmall != null) {
            return _wagonCouplingDraggingEquipmentSmall!!
        }
        _wagonCouplingDraggingEquipmentSmall = Builder(name = "WagonCouplingDraggingEquipmentSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.605f)
                lineToRelative(2.328f, 2.017f)
                lineToRelative(-0.655f, 0.756f)
                lineToRelative(-2.5f, -2.167f)
                lineToRelative(-0.173f, -0.15f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.75f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 9.579f, 20.0f)
                horizontalLineToRelative(1.736f)
                lineToRelative(3.36f, -2.88f)
                lineToRelative(0.325f, -0.279f)
                lineToRelative(0.325f, 0.28f)
                lineTo(18.685f, 20.0f)
                lineTo(22.0f, 20.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.421f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 3.0f, 16.75f)
                lineTo(3.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.0f, 18.159f)
                lineTo(17.148f, 20.0f)
                horizontalLineToRelative(-4.296f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(1.625f, 0.0f, 3.0f, -1.422f, 3.0f, -3.25f)
                lineTo(10.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(0.75f)
                curveTo(4.0f, 18.578f, 5.375f, 20.0f, 7.0f, 20.0f)
                moveToRelative(13.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _wagonCouplingDraggingEquipmentSmall!!
    }

private var _wagonCouplingDraggingEquipmentSmall: ImageVector? = null
