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

public val MediumGroup.WalkieTalkieMedium: ImageVector
    get() {
        if (_walkieTalkieMedium != null) {
            return _walkieTalkieMedium!!
        }
        _walkieTalkieMedium = Builder(name = "WalkieTalkieMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 9.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(-14.5f)
                verticalLineToRelative(-13.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.5f)
                lineTo(21.25f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.75f, 11.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.75f, 10.25f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-20.0f)
                close()
                moveTo(22.5f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.5f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.25f, 15.0f)
                curveToRelative(0.0f, -0.422f, 0.203f, -0.863f, 0.545f, -1.205f)
                reflectiveCurveToRelative(0.783f, -0.545f, 1.205f, -0.545f)
                reflectiveCurveToRelative(0.863f, 0.203f, 1.205f, 0.545f)
                reflectiveCurveToRelative(0.545f, 0.783f, 0.545f, 1.205f)
                reflectiveCurveToRelative(-0.202f, 0.863f, -0.544f, 1.206f)
                curveToRelative(-0.341f, 0.341f, -0.781f, 0.544f, -1.203f, 0.544f)
                reflectiveCurveToRelative(-0.864f, -0.203f, -1.207f, -0.545f)
                curveToRelative(-0.343f, -0.343f, -0.546f, -0.783f, -0.546f, -1.205f)
                moveTo(18.0f, 12.25f)
                curveToRelative(-0.735f, 0.0f, -1.419f, 0.344f, -1.912f, 0.838f)
                curveToRelative(-0.494f, 0.493f, -0.838f, 1.178f, -0.838f, 1.912f)
                curveToRelative(0.0f, 0.735f, 0.345f, 1.42f, 0.84f, 1.913f)
                curveToRelative(0.494f, 0.493f, 1.179f, 0.837f, 1.913f, 0.837f)
                curveToRelative(0.735f, 0.0f, 1.418f, -0.344f, 1.911f, -0.838f)
                reflectiveCurveToRelative(0.836f, -1.178f, 0.836f, -1.912f)
                curveToRelative(0.0f, -0.735f, -0.344f, -1.419f, -0.838f, -1.912f)
                curveToRelative(-0.493f, -0.494f, -1.177f, -0.838f, -1.912f, -0.838f)
            }
        }
        .build()
        return _walkieTalkieMedium!!
    }

private var _walkieTalkieMedium: ImageVector? = null
