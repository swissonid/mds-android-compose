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

public val MediumGroup.DocumentPptMedium: ImageVector
    get() {
        if (_documentPptMedium != null) {
            return _documentPptMedium!!
        }
        _documentPptMedium = Builder(name = "DocumentPptMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.263f, 6.25f)
                horizontalLineToRelative(9.694f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.147f, 0.146f)
                verticalLineToRelative(15.708f)
                lineTo(9.25f, 29.751f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                close()
                moveTo(10.263f, 7.25f)
                lineTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(13.002f, 24.608f)
                verticalLineToRelative(-1.273f)
                horizontalLineToRelative(0.841f)
                quadToRelative(0.412f, 0.0f, 0.594f, 0.123f)
                quadToRelative(0.25f, 0.166f, 0.25f, 0.504f)
                quadToRelative(0.001f, 0.335f, -0.217f, 0.507f)
                quadToRelative(-0.176f, 0.138f, -0.573f, 0.14f)
                close()
                moveTo(13.852f, 22.504f)
                lineTo(12.0f, 22.504f)
                lineTo(12.0f, 27.0f)
                horizontalLineToRelative(1.002f)
                verticalLineToRelative(-1.622f)
                horizontalLineToRelative(1.03f)
                quadToRelative(0.395f, 0.0f, 0.665f, -0.075f)
                reflectiveQuadToRelative(0.481f, -0.247f)
                quadToRelative(0.496f, -0.404f, 0.497f, -1.107f)
                quadToRelative(0.0f, -0.795f, -0.6f, -1.188f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.486f, -0.203f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.737f, -0.055f)
                moveToRelative(3.374f, 0.83f)
                verticalLineToRelative(1.274f)
                horizontalLineToRelative(0.895f)
                quadToRelative(0.397f, -0.001f, 0.573f, -0.14f)
                quadToRelative(0.218f, -0.17f, 0.218f, -0.506f)
                quadToRelative(0.0f, -0.339f, -0.25f, -0.504f)
                quadToRelative(-0.183f, -0.124f, -0.595f, -0.123f)
                close()
                moveTo(16.224f, 22.503f)
                horizontalLineToRelative(1.852f)
                quadToRelative(0.467f, 0.001f, 0.737f, 0.055f)
                quadToRelative(0.267f, 0.06f, 0.486f, 0.203f)
                quadToRelative(0.6f, 0.393f, 0.6f, 1.188f)
                quadToRelative(-0.001f, 0.704f, -0.497f, 1.107f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.481f, 0.247f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.665f, 0.075f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(1.622f)
                horizontalLineToRelative(-1.002f)
                close()
                moveTo(24.0f, 23.334f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-3.785f)
                verticalLineToRelative(0.83f)
                horizontalLineToRelative(1.388f)
                verticalLineToRelative(3.666f)
                horizontalLineToRelative(1.002f)
                verticalLineToRelative(-3.666f)
                close()
            }
        }
        .build()
        return _documentPptMedium!!
    }

private var _documentPptMedium: ImageVector? = null
