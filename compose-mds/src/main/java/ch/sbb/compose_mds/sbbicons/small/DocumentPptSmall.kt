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

public val SmallGroup.DocumentPptSmall: ImageVector
    get() {
        if (_documentPptSmall != null) {
            return _documentPptSmall!!
        }
        _documentPptSmall = Builder(name = "DocumentPptSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.01f, 4.0f)
                horizontalLineToRelative(6.697f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.147f, 0.146f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.009f, -15.0f)
                close()
                moveTo(7.009f, 5.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(13.0f, 5.708f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(8.668f, 16.405f)
                verticalLineToRelative(-0.849f)
                horizontalLineToRelative(0.561f)
                quadToRelative(0.274f, 0.0f, 0.396f, 0.082f)
                quadToRelative(0.167f, 0.11f, 0.167f, 0.336f)
                quadToRelative(0.0f, 0.224f, -0.145f, 0.338f)
                quadToRelative(-0.117f, 0.092f, -0.382f, 0.093f)
                close()
                moveTo(9.235f, 15.002f)
                lineTo(8.0f, 15.002f)
                lineTo(8.0f, 18.0f)
                horizontalLineToRelative(0.668f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(0.687f)
                quadToRelative(0.263f, 0.0f, 0.443f, -0.05f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.321f, -0.166f)
                quadToRelative(0.33f, -0.268f, 0.331f, -0.738f)
                quadToRelative(0.0f, -0.53f, -0.4f, -0.792f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.324f, -0.135f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.49f, -0.037f)
                moveToRelative(2.249f, 0.554f)
                verticalLineToRelative(0.85f)
                horizontalLineToRelative(0.597f)
                quadToRelative(0.265f, -0.001f, 0.382f, -0.094f)
                quadToRelative(0.145f, -0.114f, 0.145f, -0.338f)
                quadToRelative(0.0f, -0.226f, -0.167f, -0.336f)
                quadToRelative(-0.121f, -0.082f, -0.396f, -0.082f)
                close()
                moveTo(10.817f, 15.002f)
                horizontalLineToRelative(1.235f)
                quadToRelative(0.312f, 0.0f, 0.491f, 0.037f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.324f, 0.135f)
                quadToRelative(0.4f, 0.263f, 0.4f, 0.792f)
                quadToRelative(0.0f, 0.47f, -0.331f, 0.738f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.321f, 0.165f)
                quadToRelative(-0.18f, 0.05f, -0.443f, 0.05f)
                horizontalLineToRelative(-0.687f)
                lineTo(11.485f, 18.0f)
                horizontalLineToRelative(-0.668f)
                close()
                moveTo(16.001f, 15.557f)
                verticalLineToRelative(-0.554f)
                horizontalLineToRelative(-2.523f)
                verticalLineToRelative(0.554f)
                horizontalLineToRelative(0.925f)
                lineTo(14.403f, 18.0f)
                horizontalLineToRelative(0.668f)
                verticalLineToRelative(-2.444f)
                close()
            }
        }
        .build()
        return _documentPptSmall!!
    }

private var _documentPptSmall: ImageVector? = null
