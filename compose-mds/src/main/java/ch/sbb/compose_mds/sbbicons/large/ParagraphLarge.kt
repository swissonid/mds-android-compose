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

public val LargeGroup.ParagraphLarge: ImageVector
    get() {
        if (_paragraphLarge != null) {
            return _paragraphLarge!!
        }
        _paragraphLarge = Builder(name = "ParagraphLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.367f, 5.737f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 6.36f, 2.513f)
                lineToRelative(0.866f, -0.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, -9.359f, 8.574f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.455f, 0.322f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, false, -2.358f, 11.678f)
                horizontalLineToRelative(0.001f)
                lineToRelative(5.88f, 4.169f)
                lineToRelative(0.003f, 0.002f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 17.3f, 39.75f)
                lineToRelative(-0.866f, 0.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 9.358f, -8.574f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.454f, -0.322f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 2.357f, -11.678f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-5.88f, -4.169f)
                lineToRelative(-0.003f, -0.002f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.558f, -9.768f)
                moveToRelative(0.761f, 24.76f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.99f, -10.002f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-4.219f, -2.99f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -2.99f, 10.002f)
                lineToRelative(0.002f, 0.002f)
                close()
            }
        }
        .build()
        return _paragraphLarge!!
    }

private var _paragraphLarge: ImageVector? = null
