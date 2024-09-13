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

public val SmallGroup.DocumentPdfSmall: ImageVector
    get() {
        if (_documentPdfSmall != null) {
            return _documentPdfSmall!!
        }
        _documentPdfSmall = Builder(name = "DocumentPdfSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.01f, 4.0f)
                horizontalLineToRelative(6.697f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.147f, 0.146f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.009f, -15.0f)
                close()
                moveTo(7.009f, 5.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(13.0f, 5.708f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(8.651f, 16.404f)
                verticalLineToRelative(-0.848f)
                horizontalLineToRelative(0.55f)
                quadToRelative(0.27f, 0.0f, 0.387f, 0.082f)
                quadToRelative(0.165f, 0.11f, 0.164f, 0.335f)
                quadToRelative(0.0f, 0.225f, -0.142f, 0.34f)
                quadToRelative(-0.113f, 0.09f, -0.375f, 0.091f)
                close()
                moveTo(9.207f, 15.002f)
                horizontalLineToRelative(-1.21f)
                lineTo(7.997f, 18.0f)
                horizontalLineToRelative(0.654f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(0.672f)
                quadToRelative(0.26f, 0.0f, 0.435f, -0.052f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.314f, -0.165f)
                quadToRelative(0.324f, -0.267f, 0.324f, -0.737f)
                quadToRelative(0.0f, -0.528f, -0.39f, -0.792f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.318f, -0.134f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.48f, -0.038f)
                moveToRelative(2.203f, 0.553f)
                verticalLineToRelative(1.892f)
                horizontalLineToRelative(0.504f)
                quadToRelative(0.232f, -0.001f, 0.37f, -0.046f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.239f, -0.159f)
                quadToRelative(0.238f, -0.255f, 0.238f, -0.756f)
                quadToRelative(0.0f, -0.459f, -0.22f, -0.695f)
                reflectiveQuadToRelative(-0.652f, -0.236f)
                close()
                moveTo(10.757f, 15.002f)
                horizontalLineToRelative(1.212f)
                quadToRelative(0.337f, 0.0f, 0.579f, 0.077f)
                quadToRelative(0.24f, 0.079f, 0.425f, 0.247f)
                quadToRelative(0.45f, 0.41f, 0.449f, 1.137f)
                quadToRelative(0.0f, 0.772f, -0.424f, 1.192f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.42f, 0.265f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.595f, 0.08f)
                horizontalLineToRelative(-1.226f)
                close()
                moveTo(15.983f, 15.556f)
                verticalLineToRelative(-0.554f)
                horizontalLineToRelative(-2.11f)
                lineTo(13.873f, 18.0f)
                horizontalLineToRelative(0.654f)
                verticalLineToRelative(-1.234f)
                horizontalLineToRelative(1.268f)
                verticalLineToRelative(-0.515f)
                horizontalLineToRelative(-1.268f)
                verticalLineToRelative(-0.695f)
                close()
            }
        }
        .build()
        return _documentPdfSmall!!
    }

private var _documentPdfSmall: ImageVector? = null
