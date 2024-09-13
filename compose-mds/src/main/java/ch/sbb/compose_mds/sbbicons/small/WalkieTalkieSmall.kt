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

public val SmallGroup.WalkieTalkieSmall: ImageVector
    get() {
        if (_walkieTalkieSmall != null) {
            return _walkieTalkieSmall!!
        }
        _walkieTalkieSmall = Builder(name = "WalkieTalkieSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(15.0f, 14.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(0.0f, -0.23f, 0.111f, -0.483f, 0.314f, -0.686f)
                reflectiveCurveTo(11.771f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(0.483f, 0.111f, 0.686f, 0.314f)
                reflectiveCurveTo(13.0f, 9.771f, 13.0f, 10.0f)
                reflectiveCurveToRelative(-0.111f, 0.483f, -0.314f, 0.686f)
                curveToRelative(-0.202f, 0.203f, -0.455f, 0.314f, -0.684f, 0.314f)
                reflectiveCurveToRelative(-0.483f, -0.112f, -0.687f, -0.315f)
                curveTo(11.112f, 10.482f, 11.0f, 10.23f, 11.0f, 10.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-0.542f, 0.0f, -1.038f, 0.253f, -1.393f, 0.607f)
                curveTo(10.253f, 8.962f, 10.0f, 9.458f, 10.0f, 10.0f)
                reflectiveCurveToRelative(0.254f, 1.039f, 0.609f, 1.393f)
                curveToRelative(0.354f, 0.354f, 0.851f, 0.607f, 1.393f, 0.607f)
                reflectiveCurveToRelative(1.038f, -0.253f, 1.392f, -0.608f)
                curveToRelative(0.354f, -0.354f, 0.606f, -0.85f, 0.606f, -1.392f)
                reflectiveCurveToRelative(-0.253f, -1.038f, -0.607f, -1.393f)
                curveTo(13.038f, 8.253f, 12.542f, 8.0f, 12.0f, 8.0f)
            }
        }
        .build()
        return _walkieTalkieSmall!!
    }

private var _walkieTalkieSmall: ImageVector? = null
