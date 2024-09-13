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

public val MediumGroup.HeartFilledMedium: ImageVector
    get() {
        if (_heartFilledMedium != null) {
            return _heartFilledMedium!!
        }
        _heartFilledMedium = Builder(name = "HeartFilledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(30.299f, 11.664f)
                arcTo(7.47f, 7.47f, 0.0f, false, false, 23.25f, 6.75f)
                curveToRelative(-2.478f, 0.0f, -4.636f, 1.196f, -5.995f, 3.027f)
                curveTo(15.89f, 7.946f, 13.727f, 6.75f, 11.25f, 6.75f)
                arcToRelative(7.475f, 7.475f, 0.0f, false, false, -7.509f, 7.496f)
                curveToRelative(0.0f, 1.305f, 0.329f, 2.53f, 0.908f, 3.595f)
                curveToRelative(0.328f, 0.605f, 0.72f, 1.157f, 1.188f, 1.644f)
                lineTo(17.25f, 30.9f)
                lineTo(28.65f, 19.5f)
                curveToRelative(0.27f, -0.327f, 0.909f, -1.152f, 1.119f, -1.522f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.982f, -3.732f)
                curveToRelative(0.0f, -0.91f, -0.159f, -1.778f, -0.451f, -2.582f)
                close()
            }
        }
        .build()
        return _heartFilledMedium!!
    }

private var _heartFilledMedium: ImageVector? = null
