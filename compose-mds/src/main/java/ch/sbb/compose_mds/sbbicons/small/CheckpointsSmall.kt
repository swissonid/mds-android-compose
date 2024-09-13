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

public val SmallGroup.CheckpointsSmall: ImageVector
    get() {
        if (_checkpointsSmall != null) {
            return _checkpointsSmall!!
        }
        _checkpointsSmall = Builder(name = "CheckpointsSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.994f, 5.5f)
                arcToRelative(2.506f, 2.506f, 0.0f, true, true, 5.012f, 0.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -5.012f, 0.0f)
                moveTo(5.5f, 2.006f)
                arcToRelative(3.494f, 3.494f, 0.0f, true, false, 3.46f, 3.988f)
                horizontalLineTo(19.5f)
                curveToRelative(0.832f, 0.0f, 1.506f, 0.674f, 1.506f, 1.506f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.832f, -0.675f, 1.506f, -1.506f, 1.506f)
                horizontalLineToRelative(-4.54f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, -6.92f, 0.0f)
                horizontalLineTo(4.5f)
                arcTo(2.494f, 2.494f, 0.0f, false, false, 2.006f, 13.5f)
                verticalLineToRelative(3.0f)
                arcTo(2.494f, 2.494f, 0.0f, false, false, 4.5f, 18.994f)
                horizontalLineToRelative(10.54f)
                arcToRelative(3.495f, 3.495f, 0.0f, true, false, 0.0f, -0.988f)
                horizontalLineTo(4.5f)
                arcTo(1.506f, 1.506f, 0.0f, false, true, 2.994f, 16.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.832f, 0.674f, -1.506f, 1.506f, -1.506f)
                horizontalLineToRelative(3.54f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 6.92f, 0.0f)
                horizontalLineToRelative(4.54f)
                arcTo(2.494f, 2.494f, 0.0f, false, false, 21.994f, 9.5f)
                verticalLineToRelative(-2.0f)
                arcTo(2.494f, 2.494f, 0.0f, false, false, 19.5f, 5.006f)
                horizontalLineTo(8.96f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, -3.46f, -3.0f)
                moveToRelative(1.85f, 2.843f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(5.0f, 5.8f)
                lineToRelative(-0.65f, -0.65f)
                lineToRelative(-0.7f, 0.698f)
                lineToRelative(1.0f, 1.0f)
                lineTo(5.0f, 7.2f)
                lineToRelative(0.35f, -0.35f)
                close()
                moveTo(18.5f, 15.994f)
                arcToRelative(2.506f, 2.506f, 0.0f, true, false, 0.0f, 5.012f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 0.0f, -5.012f)
                moveToRelative(1.85f, 1.855f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(18.0f, 18.8f)
                lineToRelative(-0.65f, -0.65f)
                lineToRelative(-0.7f, 0.698f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(0.35f, -0.35f)
                close()
                moveTo(11.5f, 8.994f)
                arcToRelative(2.506f, 2.506f, 0.0f, true, false, 0.0f, 5.011f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 0.0f, -5.011f)
                moveToRelative(1.85f, 1.855f)
                lineToRelative(-0.7f, -0.699f)
                lineTo(11.0f, 11.8f)
                lineToRelative(-0.65f, -0.65f)
                lineToRelative(-0.7f, 0.699f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(0.35f, -0.35f)
                close()
            }
        }
        .build()
        return _checkpointsSmall!!
    }

private var _checkpointsSmall: ImageVector? = null
