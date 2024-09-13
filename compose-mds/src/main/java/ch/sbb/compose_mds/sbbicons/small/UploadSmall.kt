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

public val SmallGroup.UploadSmall: ImageVector
    get() {
        if (_uploadSmall != null) {
            return _uploadSmall!!
        }
        _uploadSmall = Builder(name = "UploadSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.991f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.99f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                moveTo(12.5f, 8.0f)
                lineToRelative(0.355f, 0.357f)
                lineToRelative(3.908f, 3.936f)
                lineToRelative(-0.71f, 0.705f)
                lineTo(13.0f, 9.923f)
                verticalLineToRelative(7.079f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.924f)
                lineToRelative(-3.049f, 3.074f)
                lineToRelative(-0.71f, -0.704f)
                lineToRelative(3.904f, -3.936f)
                close()
            }
        }
        .build()
        return _uploadSmall!!
    }

private var _uploadSmall: ImageVector? = null
