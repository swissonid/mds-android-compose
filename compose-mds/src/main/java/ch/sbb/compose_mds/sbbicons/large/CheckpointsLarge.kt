package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.CheckpointsLarge: ImageVector
    get() {
        if (_checkpointsLarge != null) {
            return _checkpointsLarge!!
        }
        _checkpointsLarge = Builder(name = "CheckpointsLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.494f, 11.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, true, true, 11.012f, 0.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -11.012f, 0.0f)
                moveTo(11.0f, 4.506f)
                arcToRelative(6.494f, 6.494f, 0.0f, true, false, 6.476f, 6.988f)
                horizontalLineTo(39.0f)
                arcTo(3.506f, 3.506f, 0.0f, false, true, 42.506f, 15.0f)
                verticalLineToRelative(4.0f)
                arcTo(3.506f, 3.506f, 0.0f, false, true, 39.0f, 22.506f)
                lineToRelative(-9.524f, -0.001f)
                arcToRelative(6.495f, 6.495f, 0.0f, false, false, -12.952f, 0.0f)
                horizontalLineTo(9.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 4.506f, 27.0f)
                verticalLineToRelative(6.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 9.0f, 37.494f)
                horizontalLineToRelative(21.524f)
                arcToRelative(6.495f, 6.495f, 0.0f, true, false, 0.0f, -0.988f)
                horizontalLineTo(9.0f)
                arcTo(3.506f, 3.506f, 0.0f, false, true, 5.494f, 33.0f)
                verticalLineToRelative(-6.0f)
                arcTo(3.506f, 3.506f, 0.0f, false, true, 9.0f, 23.494f)
                horizontalLineToRelative(7.524f)
                arcToRelative(6.495f, 6.495f, 0.0f, false, false, 12.952f, 0.0f)
                horizontalLineTo(39.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 43.494f, 19.0f)
                verticalLineToRelative(-4.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 39.0f, 10.506f)
                horizontalLineTo(17.476f)
                arcToRelative(6.495f, 6.495f, 0.0f, false, false, -6.476f, -6.0f)
                moveToRelative(-0.65f, 8.843f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(10.0f, 12.3f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(-0.7f, 0.699f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.35f, 0.349f)
                close()
                moveTo(37.0f, 31.495f)
                arcToRelative(5.506f, 5.506f, 0.0f, true, false, 0.0f, 11.012f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 0.0f, -11.012f)
                moveTo(36.0f, 39.7f)
                lineToRelative(0.35f, -0.35f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-0.7f, -0.698f)
                lineTo(36.0f, 38.3f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(-0.7f, 0.698f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(23.0f, 17.493f)
                arcToRelative(5.506f, 5.506f, 0.0f, true, false, 0.0f, 11.012f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 0.0f, -11.012f)
                moveToRelative(-0.65f, 7.856f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-0.7f, -0.7f)
                lineTo(22.0f, 24.3f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(-0.7f, 0.699f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.35f, 0.35f)
                close()
            }
        }
        .build()
        return _checkpointsLarge!!
    }

private var _checkpointsLarge: ImageVector? = null
