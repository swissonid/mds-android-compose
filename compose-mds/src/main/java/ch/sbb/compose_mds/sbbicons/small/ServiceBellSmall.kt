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

public val SmallGroup.ServiceBellSmall: ImageVector
    get() {
        if (_serviceBellSmall != null) {
            return _serviceBellSmall!!
        }
        _serviceBellSmall = Builder(name = "ServiceBellSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.98f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.763f, 8.732f)
                curveTo(7.941f, 7.113f, 9.707f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(4.057f, 1.113f, 5.233f, 2.732f)
                curveToRelative(1.168f, 1.607f, 1.762f, 3.714f, 1.767f, 5.766f)
                lineTo(19.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.054f, 0.594f, -4.161f, 1.763f, -5.768f)
                moveTo(6.013f, 14.0f)
                horizontalLineToRelative(11.973f)
                curveToRelative(-0.092f, -1.71f, -0.628f, -3.395f, -1.562f, -4.68f)
                curveTo(15.408f, 7.92f, 13.927f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(-3.41f, 0.921f, -4.428f, 2.32f)
                curveTo(6.637f, 10.605f, 6.1f, 12.29f, 6.012f, 14.0f)
                moveToRelative(-0.653f, 2.0f)
                horizontalLineToRelative(-0.362f)
                lineToRelative(-0.113f, 0.343f)
                lineToRelative(-0.66f, 2.0f)
                lineToRelative(-0.217f, 0.657f)
                horizontalLineToRelative(15.987f)
                lineToRelative(-0.221f, -0.66f)
                lineToRelative(-0.67f, -2.0f)
                lineToRelative(-0.114f, -0.34f)
                horizontalLineTo(5.36f)
                moveToRelative(0.031f, 2.0f)
                lineToRelative(0.33f, -1.0f)
                horizontalLineTo(18.27f)
                lineToRelative(0.335f, 1.0f)
                close()
            }
        }
        .build()
        return _serviceBellSmall!!
    }

private var _serviceBellSmall: ImageVector? = null
