package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.ContactLineArrowTrainMedium: ImageVector
    get() {
        if (_contactLineArrowTrainMedium != null) {
            return _contactLineArrowTrainMedium!!
        }
        _contactLineArrowTrainMedium = Builder(name = "ContactLineArrowTrainMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.0f, 4.25f)
                    horizontalLineToRelative(30.0f)
                    verticalLineToRelative(-1.0f)
                    lineTo(3.0f, 3.25f)
                    close()
                    moveTo(19.777f, 9.334f)
                    lineTo(15.277f, 6.334f)
                    lineTo(14.723f, 7.166f)
                    lineTo(18.599f, 9.75f)
                    lineTo(14.849f, 12.25f)
                    lineTo(13.5f, 12.25f)
                    verticalLineToRelative(1.0f)
                    lineTo(21.0f, 13.25f)
                    curveToRelative(2.46f, 0.0f, 4.57f, 1.432f, 5.586f, 3.507f)
                    horizontalLineToRelative(-6.829f)
                    verticalLineToRelative(6.986f)
                    horizontalLineToRelative(9.4f)
                    lineToRelative(0.883f, 2.436f)
                    lineToRelative(0.01f, 0.026f)
                    lineToRelative(0.012f, 0.025f)
                    curveToRelative(0.12f, 0.24f, 0.188f, 0.5f, 0.188f, 0.77f)
                    arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                    lineTo(3.0f, 28.75f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(1.785f)
                    arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.016f, 2.0f)
                    lineTo(3.0f, 31.75f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(30.0f)
                    verticalLineToRelative(-1.0f)
                    horizontalLineToRelative(-8.8f)
                    arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                    lineTo(28.5f, 29.75f)
                    arcTo(2.75f, 2.75f, 0.0f, false, false, 31.25f, 27.0f)
                    curveToRelative(0.0f, -0.434f, -0.108f, -0.834f, -0.279f, -1.187f)
                    lineToRelative(-3.146f, -8.674f)
                    curveToRelative(-0.981f, -2.834f, -3.648f, -4.889f, -6.825f, -4.889f)
                    horizontalLineToRelative(-4.349f)
                    lineToRelative(3.126f, -2.084f)
                    lineToRelative(0.624f, -0.416f)
                    close()
                    moveTo(20.743f, 17.743f)
                    horizontalLineToRelative(6.238f)
                    lineToRelative(1.818f, 5.014f)
                    horizontalLineToRelative(-8.056f)
                    close()
                    moveTo(10.7f, 31.75f)
                    horizontalLineToRelative(8.6f)
                    arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, -2.0f)
                    horizontalLineToRelative(-6.57f)
                    arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, 2.0f)
                    moveToRelative(-4.9f, -2.0f)
                    arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.9f, 0.0f)
                    close()
                    moveTo(21.75f, 31.75f)
                    arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                    horizontalLineToRelative(4.9f)
                    arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                    moveToRelative(-13.0f, -23.793f)
                    lineToRelative(2.896f, 2.897f)
                    lineToRelative(0.708f, -0.708f)
                    lineToRelative(-3.75f, -3.75f)
                    lineToRelative(-0.354f, -0.353f)
                    lineToRelative(-0.354f, 0.353f)
                    lineToRelative(-3.75f, 3.75f)
                    lineToRelative(0.708f, 0.708f)
                    lineTo(7.75f, 7.957f)
                    lineTo(7.75f, 16.5f)
                    horizontalLineToRelative(1.0f)
                    close()
                }
            }
        }
        .build()
        return _contactLineArrowTrainMedium!!
    }

private var _contactLineArrowTrainMedium: ImageVector? = null
