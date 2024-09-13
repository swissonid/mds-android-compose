package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.GithubMedium: ImageVector
    get() {
        if (_githubMedium != null) {
            return _githubMedium!!
        }
        _githubMedium = Builder(name = "GithubMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 29.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.294f, -0.24f)
                curveToRelative(0.41f, -0.162f, 0.783f, -0.399f, 1.097f, -0.697f)
                curveToRelative(0.313f, -0.3f, 0.562f, -0.654f, 0.73f, -1.045f)
                curveToRelative(0.17f, -0.39f, 0.256f, -0.81f, 0.254f, -1.232f)
                verticalLineToRelative(-1.072f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.253f, -1.232f)
                curveToRelative(0.17f, -0.39f, 0.418f, -0.745f, 0.731f, -1.044f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.097f, -0.697f)
                curveToRelative(0.41f, -0.16f, 0.85f, -0.243f, 1.294f, -0.24f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.444f, -0.003f, 0.883f, 0.08f, 1.294f, 0.24f)
                curveToRelative(0.41f, 0.161f, 0.783f, 0.398f, 1.097f, 0.697f)
                reflectiveCurveToRelative(0.562f, 0.653f, 0.73f, 1.044f)
                curveToRelative(0.17f, 0.391f, 0.256f, 0.81f, 0.254f, 1.232f)
                verticalLineToRelative(1.072f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.253f, 1.232f)
                curveToRelative(0.17f, 0.39f, 0.418f, 0.746f, 0.731f, 1.044f)
                curveToRelative(0.314f, 0.3f, 0.687f, 0.536f, 1.097f, 0.697f)
                reflectiveCurveToRelative(0.85f, 0.243f, 1.294f, 0.241f)
                moveToRelative(-18.0f, 1.5f)
                curveToRelative(0.444f, 0.002f, 1.258f, -0.075f, 1.669f, -0.225f)
                curveToRelative(0.41f, -0.15f, 0.783f, -0.371f, 1.097f, -0.65f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.73f, -0.975f)
                curveToRelative(0.17f, -0.365f, 0.256f, -0.756f, 0.254f, -1.15f)
                verticalLineToRelative(-6.0f)
                moveToRelative(8.25f, 9.0f)
                curveToRelative(-0.444f, 0.002f, -1.258f, -0.075f, -1.669f, -0.225f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -1.097f, -0.65f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.73f, -0.975f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.254f, -1.15f)
                verticalLineToRelative(-6.0f)
                moveToRelative(-5.625f, 0.0f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 7.875f, 15.0f)
                verticalLineToRelative(-1.125f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, true, 1.195f, -3.84f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, true, 0.492f, -6.285f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, true, 6.16f, 3.375f)
                horizontalLineToRelative(4.556f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, true, 6.16f, -3.375f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, true, 0.492f, 6.286f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, true, 1.195f, 3.839f)
                verticalLineTo(15.0f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, -6.75f, 6.75f)
            }
        }
        .build()
        return _githubMedium!!
    }

private var _githubMedium: ImageVector? = null
