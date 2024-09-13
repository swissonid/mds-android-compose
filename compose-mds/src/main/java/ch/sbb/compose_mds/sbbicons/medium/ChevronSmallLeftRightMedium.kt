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

public val MediumGroup.ChevronSmallLeftRightMedium: ImageVector
    get() {
        if (_chevronSmallLeftRightMedium != null) {
            return _chevronSmallLeftRightMedium!!
        }
        _chevronSmallLeftRightMedium = Builder(name = "ChevronSmallLeftRightMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(30.83f, 17.644f)
                lineToRelative(-5.925f, -5.856f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(5.565f, 5.5f)
                lineToRelative(-5.562f, 5.501f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(5.922f, -5.856f)
                lineToRelative(0.36f, -0.355f)
                close()
                moveTo(5.23f, 17.644f)
                lineToRelative(5.925f, -5.856f)
                lineToRelative(0.703f, 0.711f)
                lineTo(6.293f, 18.0f)
                lineToRelative(5.562f, 5.501f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-5.922f, -5.856f)
                lineTo(4.87f, 18.0f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftRightMedium!!
    }

private var _chevronSmallLeftRightMedium: ImageVector? = null
