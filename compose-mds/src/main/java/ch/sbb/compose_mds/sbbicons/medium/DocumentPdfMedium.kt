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

public val MediumGroup.DocumentPdfMedium: ImageVector
    get() {
        if (_documentPdfMedium != null) {
            return _documentPdfMedium!!
        }
        _documentPdfMedium = Builder(name = "DocumentPdfMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.263f, 6.25f)
                horizontalLineToRelative(9.694f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.147f, 0.146f)
                verticalLineToRelative(15.708f)
                lineTo(9.25f, 29.751f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                close()
                moveTo(10.263f, 7.25f)
                lineTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(12.977f, 24.607f)
                verticalLineToRelative(-1.274f)
                horizontalLineToRelative(0.823f)
                quadToRelative(0.405f, 0.0f, 0.582f, 0.123f)
                quadToRelative(0.246f, 0.167f, 0.246f, 0.504f)
                reflectiveQuadToRelative(-0.213f, 0.509f)
                quadToRelative(-0.17f, 0.137f, -0.562f, 0.138f)
                close()
                moveTo(13.811f, 22.502f)
                horizontalLineToRelative(-1.815f)
                lineTo(11.996f, 27.0f)
                horizontalLineToRelative(0.98f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(1.009f)
                quadToRelative(0.39f, 0.0f, 0.652f, -0.076f)
                quadToRelative(0.266f, -0.075f, 0.471f, -0.248f)
                quadToRelative(0.486f, -0.4f, 0.486f, -1.107f)
                quadToRelative(0.0f, -0.792f, -0.586f, -1.188f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.476f, -0.2f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.721f, -0.058f)
                moveToRelative(3.303f, 0.831f)
                verticalLineToRelative(2.837f)
                horizontalLineToRelative(0.756f)
                quadToRelative(0.349f, 0.0f, 0.555f, -0.07f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, 0.359f, -0.236f)
                quadToRelative(0.357f, -0.386f, 0.357f, -1.134f)
                quadToRelative(0.0f, -0.689f, -0.33f, -1.043f)
                quadToRelative(-0.33f, -0.353f, -0.978f, -0.354f)
                close()
                moveTo(16.134f, 22.504f)
                horizontalLineToRelative(1.817f)
                quadToRelative(0.506f, 0.001f, 0.869f, 0.116f)
                quadToRelative(0.361f, 0.117f, 0.637f, 0.37f)
                quadToRelative(0.675f, 0.615f, 0.674f, 1.706f)
                quadToRelative(0.0f, 1.158f, -0.636f, 1.788f)
                quadToRelative(-0.279f, 0.28f, -0.63f, 0.398f)
                quadToRelative(-0.352f, 0.119f, -0.893f, 0.118f)
                horizontalLineToRelative(-1.839f)
                close()
                moveTo(23.974f, 23.334f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-3.166f)
                lineTo(20.808f, 27.0f)
                horizontalLineToRelative(0.981f)
                verticalLineToRelative(-1.851f)
                horizontalLineToRelative(1.902f)
                verticalLineToRelative(-0.773f)
                lineTo(21.79f, 24.376f)
                verticalLineToRelative(-1.042f)
                close()
            }
        }
        .build()
        return _documentPdfMedium!!
    }

private var _documentPdfMedium: ImageVector? = null
