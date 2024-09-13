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

public val SmallGroup.TramProfileSmall: ImageVector
    get() {
        if (_tramProfileSmall != null) {
            return _tramProfileSmall!!
        }
        _tramProfileSmall = Builder(name = "TramProfileSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.707f, 4.0f)
                lineTo(22.0f, 4.0f)
                lineTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.293f)
                lineToRelative(3.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.817f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.858f, 0.256f)
                lineToRelative(0.878f, 1.269f)
                lineToRelative(2.267f, 4.212f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.125f, 0.23f, 0.186f, 0.489f, 0.18f, 0.75f)
                lineTo(19.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.45f, 1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.45f, -1.0f)
                horizontalLineToRelative(4.55f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3.994f)
                lineToRelative(-3.447f, -4.981f)
                lineToRelative(-0.42f, -0.78f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.458f, -0.49f)
                lineTo(14.807f, 7.0f)
                lineToRelative(4.893f, 6.263f)
                lineToRelative(-2.69f, -5.0f)
                lineToRelative(-0.003f, -0.006f)
                lineToRelative(-0.004f, -0.007f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.807f, 7.0f)
                horizontalLineToRelative(-2.1f)
                close()
                moveTo(10.086f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.828f, 0.0f)
                close()
                moveTo(9.5f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, 1.0f)
                close()
                moveTo(4.086f, 20.0f)
                horizontalLineToRelative(2.828f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.828f, 0.0f)
                moveTo(4.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.5f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 9.0f)
                lineTo(6.5f, 9.0f)
                moveToRelative(0.5f, 5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(1.809f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(3.0f, 6.0f)
                lineToRelative(0.053f, 0.106f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 9.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.382f)
                lineTo(14.191f, 10.0f)
                close()
            }
        }
        .build()
        return _tramProfileSmall!!
    }

private var _tramProfileSmall: ImageVector? = null
