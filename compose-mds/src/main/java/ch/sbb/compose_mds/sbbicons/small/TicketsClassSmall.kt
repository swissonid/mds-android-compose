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

public val SmallGroup.TicketsClassSmall: ImageVector
    get() {
        if (_ticketsClassSmall != null) {
            return _ticketsClassSmall!!
        }
        _ticketsClassSmall = Builder(name = "TicketsClassSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.0f)
                lineTo(10.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(3.0f, 2.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(13.0f, 18.5f)
                lineTo(13.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.975f, 4.931f)
                verticalLineToRelative(4.07f)
                horizontalLineToRelative(-0.812f)
                lineTo(17.163f, 6.335f)
                horizontalLineToRelative(-0.959f)
                verticalLineToRelative(-0.59f)
                quadToRelative(0.298f, -0.007f, 0.487f, -0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.344f, -0.173f)
                quadToRelative(0.224f, -0.174f, 0.302f, -0.582f)
                close()
                moveTo(11.99f, 10.276f)
                lineTo(11.99f, 11.0f)
                lineTo(9.059f, 11.0f)
                quadToRelative(0.0f, -0.332f, 0.108f, -0.632f)
                quadToRelative(0.106f, -0.3f, 0.302f, -0.518f)
                quadToRelative(0.15f, -0.167f, 0.352f, -0.325f)
                quadToRelative(0.201f, -0.159f, 0.802f, -0.582f)
                quadToRelative(0.293f, -0.204f, 0.409f, -0.379f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.118f, -0.406f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.158f, -0.433f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.413f, -0.165f)
                quadToRelative(-0.629f, 0.0f, -0.65f, 0.904f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(-0.089f)
                quadToRelative(0.0f, -0.741f, 0.414f, -1.146f)
                quadToRelative(0.404f, -0.396f, 1.044f, -0.396f)
                quadToRelative(0.568f, 0.0f, 0.949f, 0.323f)
                quadToRelative(0.414f, 0.35f, 0.414f, 0.944f)
                quadToRelative(0.0f, 0.516f, -0.331f, 0.89f)
                quadToRelative(-0.108f, 0.123f, -0.203f, 0.196f)
                reflectiveQuadToRelative(-0.498f, 0.355f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.55f, 0.409f)
                quadToRelative(-0.165f, 0.142f, -0.307f, 0.326f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _ticketsClassSmall!!
    }

private var _ticketsClassSmall: ImageVector? = null
