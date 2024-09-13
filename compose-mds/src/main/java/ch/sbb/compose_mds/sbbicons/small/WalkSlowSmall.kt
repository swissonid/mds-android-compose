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

public val SmallGroup.WalkSlowSmall: ImageVector
    get() {
        if (_walkSlowSmall != null) {
            return _walkSlowSmall!!
        }
        _walkSlowSmall = Builder(name = "WalkSlowSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 5.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.5f, -1.5f)
                curveToRelative(-0.81f, 0.0f, -1.5f, 0.69f, -1.5f, 1.5f)
                reflectiveCurveTo(12.69f, 7.0f, 13.5f, 7.0f)
                reflectiveCurveTo(15.0f, 6.31f, 15.0f, 5.5f)
                reflectiveCurveTo(14.31f, 4.0f, 13.5f, 4.0f)
                moveToRelative(-1.207f, 4.0f)
                horizontalLineToRelative(2.517f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(0.98f, 1.96f)
                lineTo(17.4f, 12.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(-0.028f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.053f, -0.107f)
                verticalLineToRelative(2.853f)
                lineToRelative(0.943f, 1.798f)
                lineToRelative(0.057f, 0.109f)
                lineTo(15.999f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.377f)
                lineToRelative(-0.802f, -1.53f)
                lineTo(13.0f, 14.093f)
                verticalLineToRelative(2.443f)
                lineToRelative(-0.005f, 0.035f)
                lineToRelative(-0.5f, 3.5f)
                lineToRelative(-0.99f, -0.142f)
                lineToRelative(0.495f, -3.464f)
                lineTo(12.0f, 9.708f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.707f)
                lineToRelative(0.147f, -0.147f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(13.0f, 13.093f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.093f)
                close()
                moveTo(10.072f, 13.348f)
                lineTo(9.324f, 15.2f)
                lineToRelative(-1.388f, -0.566f)
                lineToRelative(-0.464f, -0.19f)
                lineToRelative(-0.188f, 0.466f)
                lineToRelative(-1.124f, 2.782f)
                lineToRelative(-0.187f, 0.462f)
                lineToRelative(0.462f, 0.188f)
                lineToRelative(1.806f, 0.738f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.085f, 0.035f)
                lineToRelative(0.425f, 0.173f)
                lineToRelative(0.188f, -0.466f)
                lineToRelative(2.06f, -5.1f)
                close()
                moveTo(8.023f, 15.749f)
                lineTo(8.949f, 16.127f)
                lineTo(8.199f, 17.983f)
                lineTo(7.274f, 17.605f)
                close()
                moveTo(6.24f, 18.31f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.001f)
            }
        }
        .build()
        return _walkSlowSmall!!
    }

private var _walkSlowSmall: ImageVector? = null
