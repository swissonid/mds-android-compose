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

public val MediumGroup.UploadMedium: ImageVector
    get() {
        if (_uploadMedium != null) {
            return _uploadMedium!!
        }
        _uploadMedium = Builder(name = "UploadMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 9.237f)
                horizontalLineToRelative(22.0f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.263f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.25f)
                moveToRelative(11.0f, 3.118f)
                lineToRelative(0.355f, 0.357f)
                lineToRelative(5.862f, 5.904f)
                lineToRelative(-0.71f, 0.705f)
                lineToRelative(-5.007f, -5.044f)
                verticalLineToRelative(11.226f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(14.279f)
                lineToRelative(-5.0f, 5.042f)
                lineToRelative(-0.71f, -0.705f)
                lineToRelative(5.855f, -5.904f)
                close()
            }
        }
        .build()
        return _uploadMedium!!
    }

private var _uploadMedium: ImageVector? = null
