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

public val MediumGroup.CheckpointsMedium: ImageVector
    get() {
        if (_checkpointsMedium != null) {
            return _checkpointsMedium!!
        }
        _checkpointsMedium = Builder(name = "CheckpointsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.244f, 8.25f)
                arcToRelative(4.006f, 4.006f, 0.0f, true, true, 8.012f, 0.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -8.012f, 0.0f)
                moveTo(8.25f, 3.256f)
                arcToRelative(4.994f, 4.994f, 0.0f, true, false, 4.97f, 5.488f)
                horizontalLineToRelative(16.03f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, 2.506f, 2.506f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -2.506f, 2.506f)
                horizontalLineToRelative(-7.03f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, -9.94f, 0.0f)
                lineTo(6.75f, 16.756f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -3.494f, 3.494f)
                verticalLineToRelative(4.5f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, 3.494f, 3.494f)
                horizontalLineToRelative(16.03f)
                arcToRelative(4.995f, 4.995f, 0.0f, true, false, 0.0f, -0.988f)
                lineTo(6.75f, 27.256f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -2.506f, -2.506f)
                verticalLineToRelative(-4.5f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, 2.506f, -2.506f)
                horizontalLineToRelative(5.53f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, 9.94f, 0.0f)
                horizontalLineToRelative(7.03f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, 3.494f, -3.494f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -3.494f, -3.494f)
                lineTo(13.22f, 7.756f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, -4.97f, -4.5f)
                moveToRelative(2.6f, 3.843f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(7.5f, 9.05f)
                lineToRelative(-1.15f, -1.15f)
                lineToRelative(-0.7f, 0.698f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(0.35f, -0.35f)
                close()
                moveTo(27.75f, 23.744f)
                arcToRelative(4.006f, 4.006f, 0.0f, true, false, 0.0f, 8.012f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, 0.0f, -8.012f)
                moveToRelative(2.6f, 2.855f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(27.0f, 28.55f)
                lineToRelative(-1.15f, -1.15f)
                lineToRelative(-0.7f, 0.698f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(0.35f, -0.35f)
                close()
                moveTo(17.25f, 13.244f)
                arcToRelative(4.006f, 4.006f, 0.0f, true, false, 0.0f, 8.011f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, 0.0f, -8.011f)
                moveToRelative(2.6f, 2.855f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(-2.65f, 2.651f)
                lineToRelative(-1.15f, -1.15f)
                lineToRelative(-0.7f, 0.699f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(0.35f, -0.35f)
                close()
            }
        }
        .build()
        return _checkpointsMedium!!
    }

private var _checkpointsMedium: ImageVector? = null
