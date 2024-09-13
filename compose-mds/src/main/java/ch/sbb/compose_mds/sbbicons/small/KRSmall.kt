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

public val SmallGroup.KRSmall: ImageVector
    get() {
        if (_kRSmall != null) {
            return _kRSmall!!
        }
        _kRSmall = Builder(name = "KRSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.003f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(18.002f)
                close()
                moveTo(21.003f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.002f)
                close()
                moveTo(6.958f, 11.162f)
                lineToRelative(3.136f, -3.164f)
                lineTo(7.883f, 7.998f)
                lineToRelative(-3.136f, 3.31f)
                verticalLineToRelative(-3.31f)
                lineTo(3.0f, 7.998f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.746f)
                verticalLineToRelative(-2.582f)
                lineToRelative(1.007f, -1.007f)
                lineToRelative(2.43f, 3.59f)
                horizontalLineToRelative(2.205f)
                close()
                moveTo(9.348f, 12.104f)
                horizontalLineToRelative(1.541f)
                verticalLineToRelative(-1.541f)
                horizontalLineToRelative(0.884f)
                verticalLineToRelative(1.541f)
                horizontalLineToRelative(1.547f)
                verticalLineToRelative(0.884f)
                horizontalLineToRelative(-1.547f)
                verticalLineToRelative(1.542f)
                horizontalLineToRelative(-0.884f)
                verticalLineToRelative(-1.542f)
                lineTo(9.347f, 12.988f)
                close()
                moveTo(15.692f, 11.572f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(1.74f)
                quadToRelative(0.767f, 0.0f, 1.122f, 0.263f)
                quadToRelative(0.357f, 0.262f, 0.356f, 0.83f)
                quadToRelative(0.0f, 0.588f, -0.416f, 0.877f)
                quadToRelative(-0.329f, 0.23f, -1.133f, 0.23f)
                close()
                moveTo(17.822f, 7.998f)
                horizontalLineToRelative(-3.876f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.746f)
                verticalLineToRelative(-3.146f)
                horizontalLineToRelative(1.57f)
                quadToRelative(0.838f, 0.0f, 1.185f, 0.326f)
                quadToRelative(0.348f, 0.325f, 0.414f, 1.173f)
                quadToRelative(0.066f, 0.953f, 0.106f, 1.215f)
                quadToRelative(0.042f, 0.264f, 0.134f, 0.433f)
                horizontalLineToRelative(1.822f)
                lineToRelative(-0.076f, -0.093f)
                quadToRelative(-0.158f, -0.203f, -0.235f, -1.034f)
                quadToRelative(-0.104f, -1.134f, -0.17f, -1.45f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.257f, -0.608f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.832f, -0.591f)
                quadToRelative(0.601f, -0.224f, 0.94f, -0.744f)
                quadToRelative(0.335f, -0.52f, 0.336f, -1.221f)
                quadToRelative(0.0f, -0.618f, -0.269f, -1.111f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.777f, -0.788f)
                quadToRelative(-0.613f, -0.36f, -1.762f, -0.361f)
            }
        }
        .build()
        return _kRSmall!!
    }

private var _kRSmall: ImageVector? = null
