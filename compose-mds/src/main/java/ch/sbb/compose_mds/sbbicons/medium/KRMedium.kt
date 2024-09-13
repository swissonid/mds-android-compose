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

public val MediumGroup.KRMedium: ImageVector
    get() {
        if (_kRMedium != null) {
            return _kRMedium!!
        }
        _kRMedium = Builder(name = "KRMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.504f, 8.75f)
                lineTo(4.502f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(31.504f, 28.25f)
                lineTo(4.502f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(10.437f, 16.743f)
                lineToRelative(4.704f, -4.746f)
                horizontalLineToRelative(-3.317f)
                lineTo(7.12f, 16.963f)
                verticalLineToRelative(-4.967f)
                lineTo(4.501f, 11.996f)
                verticalLineToRelative(12.002f)
                horizontalLineToRelative(2.62f)
                verticalLineToRelative(-3.875f)
                lineToRelative(1.51f, -1.51f)
                lineToRelative(3.645f, 5.385f)
                horizontalLineToRelative(3.307f)
                close()
                moveTo(14.021f, 18.158f)
                horizontalLineToRelative(2.313f)
                verticalLineToRelative(-2.313f)
                horizontalLineToRelative(1.326f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(2.32f)
                verticalLineToRelative(1.324f)
                horizontalLineToRelative(-2.32f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(-1.326f)
                verticalLineToRelative(-2.313f)
                lineTo(14.02f, 19.482f)
                close()
                moveTo(23.538f, 17.358f)
                verticalLineToRelative(-3.3f)
                horizontalLineToRelative(2.61f)
                quadToRelative(1.15f, -0.001f, 1.683f, 0.395f)
                quadToRelative(0.535f, 0.392f, 0.534f, 1.246f)
                quadToRelative(0.0f, 0.88f, -0.624f, 1.314f)
                quadToRelative(-0.492f, 0.345f, -1.7f, 0.345f)
                close()
                moveTo(26.732f, 11.998f)
                horizontalLineToRelative(-5.813f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.62f)
                verticalLineToRelative(-4.72f)
                horizontalLineToRelative(2.354f)
                quadToRelative(1.257f, 0.0f, 1.778f, 0.49f)
                quadToRelative(0.522f, 0.486f, 0.62f, 1.759f)
                quadToRelative(0.099f, 1.43f, 0.16f, 1.822f)
                quadToRelative(0.064f, 0.395f, 0.2f, 0.65f)
                horizontalLineToRelative(2.734f)
                lineToRelative(-0.114f, -0.14f)
                quadToRelative(-0.237f, -0.304f, -0.353f, -1.55f)
                quadToRelative(-0.155f, -1.702f, -0.255f, -2.176f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.385f, -0.912f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, -1.248f, -0.886f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 1.408f, -1.116f)
                quadToRelative(0.505f, -0.78f, 0.506f, -1.832f)
                quadToRelative(0.0f, -0.927f, -0.404f, -1.666f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, -1.165f, -1.182f)
                quadToRelative(-0.92f, -0.541f, -2.643f, -0.542f)
            }
        }
        .build()
        return _kRMedium!!
    }

private var _kRMedium: ImageVector? = null
