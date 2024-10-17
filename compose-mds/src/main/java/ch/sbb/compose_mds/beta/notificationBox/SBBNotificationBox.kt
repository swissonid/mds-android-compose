package ch.sbb.compose_mds.beta.notificationBox

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
    val interactionIcon: ImageVector?,
)

typealias OnCloseCallback = () -> Unit

object SBBNotificationBox {
    @ExperimentalSBBComponent
    @Composable
    fun Alert(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleCrossSmall,
            iconColor = SBBColors.red,
            backgroundColor = SBBColors.red,
            interactionIcon = interactionIcon,
        )
        SBBNotificationBox(modifier, style, title, text, isCloseable, onClose)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Warning(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleExclamationPointSmall,
            iconColor = if (isSystemInDarkTheme()) SBBColors.peach else SBBColors.black,
            backgroundColor = SBBColors.peach,
            interactionIcon = interactionIcon,
        )
        SBBNotificationBox(modifier, style, title, text, isCloseable, onClose)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Success(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleTickSmall,
            iconColor = SBBColors.green,
            backgroundColor = SBBColors.green,
            interactionIcon = interactionIcon,
        )
        SBBNotificationBox(modifier, style, title, text, isCloseable, onClose)
    }

    @ExperimentalSBBComponent
    @Composable
    fun Information(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        val style = NotificationBoxStyle(
            icon = SBBIcons.Small.CircleInformationSmall,
            iconColor = if (isSystemInDarkTheme()) SBBColors.white else SBBColors.black,
            backgroundColor = SBBColors.smoke,
            interactionIcon = interactionIcon,
        )
        SBBNotificationBox(modifier, style, title, text, isCloseable, onClose)
    }
}

@Composable
private fun SBBNotificationBox(
    modifier: Modifier = Modifier,
    style: NotificationBoxStyle,
    title: String?,
    text: String,
    isCloseable: Boolean,
    onClose: OnCloseCallback?,
) {
    Box(
        modifier = modifier
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
            if (title != null) {
                Row {
                    TypeIcon(style)
                    TitleBody(title)
                    CloseButton(isCloseable, onClose)
                }
                Row {
                    TextBody(text)
                    InteractionIcon(
                        Modifier.align(Alignment.CenterVertically),
                        style.interactionIcon
                    )
                }
            } else {
                Row(Modifier.height(IntrinsicSize.Max)) {
                    TypeIcon(style)
                    TextBody(text)
                    Column(Modifier.fillMaxHeight()) {
                        CloseButton(isCloseable, onClose)
                        InteractionIcon(
                            Modifier.weight(1f),
                            style.interactionIcon
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun TypeIcon(style: NotificationBoxStyle) {
    Icon(
        modifier = Modifier.padding(start = 6.dp),
        imageVector = style.icon,
        contentDescription = null,
        tint = style.iconColor,
    )
}

@Composable
private fun CloseButton(isCloseable: Boolean, onClose: OnCloseCallback?) {
    if (isCloseable) Icon(
        modifier = Modifier
            .padding(end = 10.dp)
            .clickable { onClose?.invoke() },
        imageVector = SBBIcons.Small.CrossSmall,
        contentDescription = null,
    )
}

@Composable
private fun RowScope.TitleBody(title: String) {
    Text(
        modifier = Modifier
            .weight(1.0f)
            .padding(start = SBBConst.HALF_PADDING),
        text = title,
        style = MaterialTheme.typography.titleMedium,
    )
}

@Composable
private fun RowScope.TextBody(text: String) {
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
}

@Composable
private fun InteractionIcon(modifier: Modifier, vector: ImageVector?) {
    if (vector == null) return
    Icon(
        modifier = modifier.padding(end = 6.dp),
        imageVector = vector,
        contentDescription = null,
    )
}
