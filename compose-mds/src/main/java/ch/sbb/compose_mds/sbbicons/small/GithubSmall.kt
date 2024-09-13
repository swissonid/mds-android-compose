package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.GithubSmall: ImageVector
    get() {
        if (_githubSmall != null) {
            return _githubSmall!!
        }
        _githubSmall = Builder(name = "GithubSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 19.5f)
                curveToRelative(0.296f, 0.001f, 0.589f, -0.053f, 0.862f, -0.16f)
                curveToRelative(0.274f, -0.108f, 0.523f, -0.266f, 0.732f, -0.465f)
                curveToRelative(0.209f, -0.2f, 0.375f, -0.436f, 0.487f, -0.696f)
                curveToRelative(0.113f, -0.26f, 0.17f, -0.54f, 0.169f, -0.822f)
                verticalLineToRelative(-0.714f)
                curveToRelative(-0.001f, -0.282f, 0.056f, -0.56f, 0.169f, -0.821f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.487f, -0.697f)
                curveToRelative(0.21f, -0.2f, 0.458f, -0.357f, 0.732f, -0.464f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.862f, -0.16f)
                horizontalLineTo(10.0f)
                lineToRelative(4.0f, -0.001f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.296f, -0.001f, 0.589f, 0.053f, 0.863f, 0.16f)
                curveToRelative(0.273f, 0.108f, 0.522f, 0.266f, 0.73f, 0.465f)
                curveToRelative(0.21f, 0.2f, 0.376f, 0.436f, 0.488f, 0.697f)
                curveToRelative(0.113f, 0.26f, 0.17f, 0.54f, 0.169f, 0.82f)
                verticalLineToRelative(0.715f)
                curveToRelative(-0.001f, 0.282f, 0.056f, 0.561f, 0.169f, 0.822f)
                curveToRelative(0.112f, 0.26f, 0.278f, 0.497f, 0.487f, 0.696f)
                curveToRelative(0.21f, 0.2f, 0.458f, 0.357f, 0.732f, 0.464f)
                reflectiveCurveToRelative(0.566f, 0.162f, 0.862f, 0.161f)
                moveToRelative(-12.0f, 1.0f)
                curveToRelative(0.296f, 0.001f, 0.839f, -0.05f, 1.113f, -0.15f)
                curveToRelative(0.273f, -0.1f, 0.522f, -0.247f, 0.73f, -0.433f)
                curveToRelative(0.21f, -0.186f, 0.376f, -0.407f, 0.488f, -0.65f)
                curveToRelative(0.113f, -0.244f, 0.17f, -0.504f, 0.169f, -0.767f)
                verticalLineToRelative(-4.0f)
                moveToRelative(5.5f, 6.0f)
                curveToRelative(-0.296f, 0.001f, -0.839f, -0.05f, -1.113f, -0.15f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.73f, -0.433f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.488f, -0.65f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.169f, -0.767f)
                verticalLineToRelative(-4.0f)
                moveToRelative(-3.75f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                verticalLineToRelative(-0.75f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 0.797f, -2.56f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, 0.328f, -4.19f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, 4.106f, 2.25f)
                horizontalLineToRelative(3.038f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, 4.106f, -2.25f)
                arcToRelative(4.87f, 4.87f, 0.0f, false, true, 0.328f, 4.19f)
                curveToRelative(0.513f, 0.756f, 0.79f, 1.647f, 0.797f, 2.56f)
                verticalLineTo(10.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
            }
        }
        .build()
        return _githubSmall!!
    }

private var _githubSmall: ImageVector? = null
