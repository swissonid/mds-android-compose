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

public val MediumGroup.HighlighterMedium: ImageVector
    get() {
        if (_highlighterMedium != null) {
            return _highlighterMedium!!
        }
        _highlighterMedium = Builder(name = "HighlighterMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(26.301f, 6.094f)
                lineToRelative(0.302f, 0.302f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(0.302f, 0.302f)
                lineToRelative(-0.25f, 0.346f)
                lineToRelative(-12.0f, 16.5f)
                lineToRelative(-0.345f, 0.473f)
                lineToRelative(-0.414f, -0.413f)
                lineToRelative(-0.566f, -0.567f)
                lineToRelative(-0.28f, 0.048f)
                lineToRelative(-1.269f, 0.217f)
                curveToRelative(-0.866f, 0.147f, -1.856f, 0.312f, -2.49f, 0.41f)
                arcToRelative(204.0f, 204.0f, 0.0f, false, false, -1.205f, 1.821f)
                lineToRelative(-0.119f, 0.181f)
                lineToRelative(-0.032f, 0.049f)
                lineToRelative(-0.008f, 0.013f)
                lineToRelative(-0.002f, 0.003f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.419f, -0.274f)
                lineToRelative(0.418f, 0.274f)
                lineToRelative(-0.337f, 0.514f)
                lineToRelative(-0.435f, -0.434f)
                lineToRelative(-0.463f, -0.464f)
                lineToRelative(-1.91f, 1.273f)
                lineToRelative(-0.127f, 0.084f)
                lineTo(4.31f, 31.253f)
                lineToRelative(0.52f, -0.782f)
                lineToRelative(2.774f, -4.16f)
                lineToRelative(-0.492f, -0.492f)
                lineToRelative(-0.437f, -0.437f)
                lineToRelative(0.518f, -0.336f)
                lineToRelative(0.272f, 0.42f)
                lineToRelative(-0.272f, -0.42f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.004f, -0.003f)
                lineToRelative(0.014f, -0.01f)
                lineToRelative(0.055f, -0.035f)
                lineToRelative(0.199f, -0.129f)
                lineToRelative(0.644f, -0.416f)
                curveToRelative(0.403f, -0.26f, 0.86f, -0.553f, 1.18f, -0.755f)
                curveToRelative(0.09f, -0.574f, 0.252f, -1.543f, 0.399f, -2.41f)
                lineToRelative(0.222f, -1.311f)
                lineToRelative(0.052f, -0.306f)
                lineToRelative(-0.567f, -0.567f)
                lineToRelative(-0.413f, -0.414f)
                lineToRelative(0.473f, -0.344f)
                lineToRelative(16.5f, -12.0f)
                close()
                moveTo(10.831f, 20.537f)
                lineTo(10.675f, 21.454f)
                curveToRelative(-0.169f, 1.0f, -0.356f, 2.12f, -0.43f, 2.62f)
                lineToRelative(-0.035f, 0.229f)
                lineToRelative(-0.197f, 0.122f)
                arcToRelative(119.0f, 119.0f, 0.0f, false, false, -1.757f, 1.124f)
                lineToRelative(3.67f, 3.67f)
                lineToRelative(0.22f, -0.335f)
                curveToRelative(0.31f, -0.47f, 0.684f, -1.037f, 0.94f, -1.414f)
                lineToRelative(0.123f, -0.183f)
                lineToRelative(0.218f, -0.032f)
                curveToRelative(0.59f, -0.087f, 1.71f, -0.273f, 2.687f, -0.439f)
                lineToRelative(0.85f, -0.145f)
                close()
                moveTo(8.331f, 27.037f)
                lineTo(6.191f, 30.247f)
                horizontalLineToRelative(2.656f)
                lineToRelative(1.616f, -1.077f)
                close()
                moveTo(10.517f, 18.81f)
                lineTo(18.69f, 26.983f)
                lineTo(30.094f, 11.3f)
                lineToRelative(-3.896f, -3.895f)
                close()
                moveTo(16.853f, 21.354f)
                lineTo(25.853f, 12.354f)
                lineTo(25.146f, 11.646f)
                lineTo(16.146f, 20.646f)
                close()
            }
        }
        .build()
        return _highlighterMedium!!
    }

private var _highlighterMedium: ImageVector? = null
