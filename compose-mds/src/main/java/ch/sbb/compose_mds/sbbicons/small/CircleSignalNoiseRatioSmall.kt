package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.CircleSignalNoiseRatioSmall: ImageVector
    get() {
        if (_circleSignalNoiseRatioSmall != null) {
            return _circleSignalNoiseRatioSmall!!
        }
        _circleSignalNoiseRatioSmall = Builder(name = "CircleSignalNoiseRatioSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.397f, 10.725f)
                horizontalLineTo(8.151f)
                quadToRelative(-0.036f, -0.438f, -0.325f, -0.67f)
                quadToRelative(-0.289f, -0.231f, -0.81f, -0.231f)
                quadToRelative(-0.462f, 0.0f, -0.72f, 0.182f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.255f, 0.51f)
                quadToRelative(0.0f, 0.295f, 0.246f, 0.426f)
                quadToRelative(0.237f, 0.131f, 1.205f, 0.369f)
                quadToRelative(1.02f, 0.254f, 1.414f, 0.513f)
                quadToRelative(0.726f, 0.475f, 0.725f, 1.324f)
                quadToRelative(0.0f, 0.93f, -0.73f, 1.466f)
                quadToRelative(-0.642f, 0.472f, -1.74f, 0.472f)
                quadToRelative(-1.223f, 0.0f, -1.898f, -0.558f)
                quadToRelative(-0.677f, -0.556f, -0.701f, -1.586f)
                horizontalLineToRelative(1.303f)
                quadToRelative(0.029f, 0.5f, 0.258f, 0.742f)
                quadToRelative(0.36f, 0.385f, 1.086f, 0.385f)
                quadToRelative(0.492f, 0.0f, 0.78f, -0.192f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.323f, -0.603f)
                quadToRelative(0.0f, -0.38f, -0.456f, -0.557f)
                quadToRelative(-0.25f, -0.098f, -1.18f, -0.357f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.91f, -0.303f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.524f, -0.32f)
                quadToRelative(-0.459f, -0.41f, -0.459f, -1.13f)
                quadToRelative(0.0f, -0.865f, 0.717f, -1.37f)
                quadToRelative(0.61f, -0.43f, 1.586f, -0.43f)
                quadToRelative(0.857f, 0.0f, 1.435f, 0.34f)
                quadToRelative(0.831f, 0.489f, 0.876f, 1.578f)
                moveTo(13.307f, 8.95f)
                lineToRelative(-2.775f, 7.533f)
                horizontalLineToRelative(-1.09f)
                lineToRelative(2.787f, -7.532f)
                close()
                moveTo(19.05f, 8.95f)
                verticalLineToRelative(5.992f)
                horizontalLineToRelative(-1.316f)
                lineToRelative(-2.508f, -4.082f)
                lineToRelative(0.016f, 4.082f)
                horizontalLineToRelative(-1.258f)
                verticalLineTo(8.951f)
                horizontalLineToRelative(1.332f)
                lineToRelative(2.492f, 4.073f)
                lineToRelative(-0.016f, -4.073f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, false, 0.0f, -19.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.0f, 19.0f)
                close()
            }
        }
        .build()
        return _circleSignalNoiseRatioSmall!!
    }

private var _circleSignalNoiseRatioSmall: ImageVector? = null
