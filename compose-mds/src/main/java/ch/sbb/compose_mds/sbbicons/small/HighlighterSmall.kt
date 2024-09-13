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

public val SmallGroup.HighlighterSmall: ImageVector
    get() {
        if (_highlighterSmall != null) {
            return _highlighterSmall!!
        }
        _highlighterSmall = Builder(name = "HighlighterSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.551f, 3.844f)
                lineToRelative(0.302f, 0.302f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(0.302f, 0.302f)
                lineToRelative(-0.25f, 0.346f)
                lineToRelative(-8.0f, 11.0f)
                lineToRelative(-0.345f, 0.473f)
                lineToRelative(-0.414f, -0.413f)
                lineToRelative(-0.316f, -0.317f)
                lineToRelative(-0.102f, 0.017f)
                lineToRelative(-0.846f, 0.145f)
                curveToRelative(-0.545f, 0.092f, -1.165f, 0.196f, -1.59f, 0.262f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, -0.762f, 1.153f)
                lineToRelative(-0.08f, 0.12f)
                lineToRelative(-0.02f, 0.033f)
                lineToRelative(-0.006f, 0.008f)
                lineToRelative(-0.001f, 0.002f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.42f, -0.274f)
                lineToRelative(0.42f, 0.274f)
                lineToRelative(-0.338f, 0.514f)
                lineToRelative(-0.435f, -0.434f)
                lineToRelative(-0.211f, -0.212f)
                lineToRelative(-1.16f, 0.773f)
                lineToRelative(-0.127f, 0.084f)
                lineTo(2.56f, 21.003f)
                lineToRelative(0.52f, -0.782f)
                lineToRelative(1.774f, -2.66f)
                lineToRelative(-0.23f, -0.23f)
                lineToRelative(-0.437f, -0.437f)
                lineToRelative(0.518f, -0.336f)
                lineToRelative(0.272f, 0.419f)
                lineToRelative(-0.272f, -0.42f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.01f, -0.006f)
                lineToRelative(0.036f, -0.023f)
                lineToRelative(0.132f, -0.086f)
                lineToRelative(1.155f, -0.742f)
                arcToRelative(184.0f, 184.0f, 0.0f, false, true, 0.402f, -2.408f)
                lineToRelative(0.02f, -0.12f)
                lineToRelative(-0.317f, -0.316f)
                lineToRelative(-0.413f, -0.414f)
                lineToRelative(0.473f, -0.344f)
                lineToRelative(11.0f, -8.0f)
                close()
                moveTo(7.331f, 14.037f)
                lineToRelative(-0.05f, 0.293f)
                curveToRelative(-0.113f, 0.668f, -0.237f, 1.413f, -0.287f, 1.744f)
                lineToRelative(-0.034f, 0.229f)
                lineToRelative(-0.196f, 0.122f)
                curveToRelative(-0.198f, 0.122f, -0.575f, 0.364f, -0.906f, 0.577f)
                lineToRelative(-0.09f, 0.059f)
                lineToRelative(2.155f, 2.155f)
                lineToRelative(0.035f, -0.052f)
                curveToRelative(0.206f, -0.313f, 0.457f, -0.692f, 0.628f, -0.944f)
                lineToRelative(0.123f, -0.183f)
                lineToRelative(0.218f, -0.032f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 2.037f, -0.334f)
                close()
                moveTo(5.581f, 18.287f)
                lineTo(4.441f, 19.997f)
                horizontalLineToRelative(1.406f)
                lineToRelative(0.866f, -0.577f)
                close()
                moveTo(7.267f, 12.56f)
                lineTo(12.44f, 17.733f)
                lineTo(19.844f, 7.55f)
                lineToRelative(-2.396f, -2.395f)
                close()
                moveTo(11.353f, 14.353f)
                lineTo(17.353f, 8.353f)
                lineTo(16.646f, 7.646f)
                lineTo(10.646f, 13.646f)
                close()
            }
        }
        .build()
        return _highlighterSmall!!
    }

private var _highlighterSmall: ImageVector? = null
