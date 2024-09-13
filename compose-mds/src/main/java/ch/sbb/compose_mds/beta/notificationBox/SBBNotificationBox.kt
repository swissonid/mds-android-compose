package ch.sbb.compose_mds.beta.notificationBox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.sbbicons.small.CircleCrossSmall
import ch.sbb.compose_mds.sbbicons.small.CircleExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.CircleTickSmall
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.defaultPadding

class NotificationBoxStyle(
    val icon: ImageVector,
    val iconColor: Color,
    val backgroundColor: Color,
    val interactionIcon: ImageVector? = null,
)

object SBBNotificationBox {
    @ExperimentalSBBComponent
    @Composable
    fun Alert(title: String, text: String) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleCrossSmall,
            iconColor = SBBColors.red,
            backgroundColor = SBBColors.red,
        )
        SBBNotificationBox(style, title, text)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Warning(title: String, text: String) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleExclamationPointSmall,
            iconColor = SBBColors.black,
            backgroundColor = SBBColors.peach,
        )
        SBBNotificationBox(style, title, text)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Success(title: String, text: String) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleTickSmall,
            iconColor = SBBColors.green,
            backgroundColor = SBBColors.green,
        )
        SBBNotificationBox(style, title, text)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Information(title: String, text: String) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleInformationSmall,
            iconColor = SBBColors.black,
            backgroundColor = SBBColors.smoke,
        )
        SBBNotificationBox(style, title, text)
    }
}

@Composable
private fun SBBNotificationBox(
    style: NotificationBoxStyle,
    title: String,
    text: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = style.backgroundColor)
            .padding(start = SBBConst.HALF_PADDING)
            .padding(all = 1.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 8.dp,
                        bottomStart = 8.dp,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp,
                    )
                )
                .background(MaterialTheme.colorScheme.surface.copy(alpha = .6f)).defaultPadding,
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    modifier = Modifier.padding(start = 6.dp),
                    imageVector = style.icon,
                    contentDescription = null,
                    tint = style.iconColor,
                )
                Text(
                    modifier = Modifier
                        .weight(1.0f)
                        .padding(start = SBBConst.HALF_PADDING),
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                )
                Icon(
                    modifier = Modifier.padding(end = 10.dp),
                    imageVector = SBBIcons.Small.CrossSmall,
                    contentDescription = null,
                )
            }
            Row {
                Text(
                    modifier = Modifier
                        .weight(1.0f)
                        .padding(horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING)
                        .padding(top = 4.dp),
                    text = text,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodySmall,
                )
                Icon(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = SBBIcons.Small.ChevronSmallRightSmall,
                    contentDescription = null,
                )
            }
        }
    }
}