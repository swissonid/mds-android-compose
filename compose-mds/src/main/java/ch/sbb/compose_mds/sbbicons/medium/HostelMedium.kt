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

public val MediumGroup.HostelMedium: ImageVector
    get() {
        if (_hostelMedium != null) {
            return _hostelMedium!!
        }
        _hostelMedium = Builder(name = "HostelMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 3.25f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(3.0f)
                lineTo(33.0f, 6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(23.0f)
                lineTo(33.0f, 30.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-23.0f)
                lineTo(3.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.0f)
                moveToRelative(0.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(8.501f)
                lineToRelative(-0.001f, 0.5f)
                lineToRelative(-0.008f, 4.0f)
                horizontalLineToRelative(8.008f)
                verticalLineToRelative(-23.0f)
                horizontalLineToRelative(-24.0f)
                moveToRelative(14.992f, 23.0f)
                lineTo(14.75f, 30.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(6.499f)
                close()
                moveTo(28.75f, 4.25f)
                verticalLineToRelative(2.0f)
                lineTo(7.25f, 6.25f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.75f, 13.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.0f)
                lineTo(20.75f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(16.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                close()
                moveTo(9.75f, 20.401f)
                lineTo(10.5f, 18.0f)
                lineToRelative(0.75f, 2.401f)
                horizontalLineToRelative(2.25f)
                lineTo(11.7f, 21.6f)
                lineToRelative(0.75f, 2.4f)
                lineToRelative(-1.95f, -1.349f)
                lineTo(8.55f, 24.0f)
                lineToRelative(0.75f, -2.25f)
                lineTo(7.5f, 20.4f)
                close()
                moveTo(18.0f, 18.0f)
                lineToRelative(-0.75f, 2.401f)
                lineTo(15.0f, 20.401f)
                lineToRelative(1.8f, 1.349f)
                lineToRelative(-0.75f, 2.25f)
                lineTo(18.0f, 22.65f)
                lineTo(19.95f, 24.0f)
                lineToRelative(-0.75f, -2.4f)
                lineToRelative(1.8f, -1.35f)
                horizontalLineToRelative(-2.25f)
                close()
                moveTo(24.75f, 20.401f)
                lineTo(25.5f, 18.0f)
                lineToRelative(0.75f, 2.25f)
                horizontalLineToRelative(2.25f)
                lineToRelative(-1.8f, 1.35f)
                lineToRelative(0.75f, 2.4f)
                lineToRelative(-1.95f, -1.349f)
                lineTo(23.55f, 24.0f)
                lineToRelative(0.75f, -2.25f)
                lineToRelative(-1.8f, -1.349f)
                close()
            }
        }
        .build()
        return _hostelMedium!!
    }

private var _hostelMedium: ImageVector? = null
