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

public val SmallGroup.CigaretteDisabledSmall: ImageVector
    get() {
        if (_cigaretteDisabledSmall != null) {
            return _cigaretteDisabledSmall!!
        }
        _cigaretteDisabledSmall = Builder(name = "CigaretteDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 4.469f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveTo(22.0f, 3.09f, 22.0f, 4.469f)
                curveToRelative(0.0f, 0.753f, -0.35f, 1.468f, -0.94f, 1.94f)
                lineToRelative(-0.284f, 0.228f)
                lineToRelative(0.128f, 0.34f)
                quadTo(21.0f, 7.227f, 21.0f, 7.5f)
                curveToRelative(0.0f, 0.826f, -0.674f, 1.5f, -1.5f, 1.5f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, true, -1.404f, -2.024f)
                lineToRelative(0.128f, -0.34f)
                lineToRelative(-0.283f, -0.226f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 4.469f)
                moveToRelative(2.5f, -3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.059f, 2.494f)
                arcTo(2.503f, 2.503f, 0.0f, false, false, 19.5f, 10.0f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, false, 2.441f, -3.037f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 23.0f, 4.47f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                moveToRelative(2.646f, 21.885f)
                lineTo(14.293f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.293f)
                lineTo(1.146f, 1.854f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(21.0f, 21.0f)
                close()
                moveTo(11.293f, 12.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.75f, 12.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.25f)
                verticalLineToRelative(4.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(19.75f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cigaretteDisabledSmall!!
    }

private var _cigaretteDisabledSmall: ImageVector? = null
