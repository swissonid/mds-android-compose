package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.ContextMenuMedium: ImageVector
    get() {
        if (_contextMenuMedium != null) {
            return _contextMenuMedium!!
        }
        _contextMenuMedium = Builder(name = "ContextMenuMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.25f, 7.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.5f, 0.0f)
                moveToRelative(0.0f, 10.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.5f, 0.0f)
                moveTo(18.0f, 30.75f)
                arcToRelative(2.249f, 2.249f, 0.0f, true, false, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 18.0f, 9.25f)
                close()
                moveTo(15.25f, 7.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                close()
                moveTo(18.0f, 4.75f)
                curveToRelative(-1.52f, 0.0f, -2.75f, 1.23f, -2.75f, 2.75f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -0.967f, 0.783f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(20.75f, 7.5f)
                curveToRelative(0.0f, -1.52f, -1.23f, -2.75f, -2.75f, -2.75f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                close()
                moveTo(18.0f, 20.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 20.75f, 18.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 18.0f, 19.75f)
                close()
                moveTo(15.25f, 18.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 16.25f, 18.0f)
                close()
                moveTo(18.0f, 15.25f)
                curveToRelative(-1.52f, 0.0f, -2.75f, 1.23f, -2.75f, 2.75f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -0.967f, 0.783f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(20.75f, 18.0f)
                curveToRelative(0.0f, -1.52f, -1.23f, -2.75f, -2.75f, -2.75f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                close()
                moveTo(19.75f, 28.5f)
                curveToRelative(0.0f, 0.967f, -0.783f, 1.75f, -1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.52f, 0.0f, 2.75f, -1.23f, 2.75f, -2.75f)
                close()
                moveTo(18.0f, 26.75f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                horizontalLineToRelative(1.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.0f, 25.75f)
                close()
                moveTo(16.25f, 28.5f)
                curveToRelative(0.0f, -0.966f, 0.783f, -1.75f, 1.75f, -1.75f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.75f)
                close()
                moveTo(18.0f, 30.25f)
                curveToRelative(-0.967f, 0.0f, -1.75f, -0.783f, -1.75f, -1.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.52f, 1.23f, 2.75f, 2.75f, 2.75f)
                close()
            }
        }
        .build()
        return _contextMenuMedium!!
    }

private var _contextMenuMedium: ImageVector? = null
