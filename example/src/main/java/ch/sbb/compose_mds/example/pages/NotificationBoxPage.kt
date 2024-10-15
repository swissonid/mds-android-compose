package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.notificationBox.SBBNotificationBox
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.defaultPadding

private const val text =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris justo sapien, laoreet vel bibendum in, aliquet id libero. Mauris pellentesque nisl at urna semper porta. Nulla in justo sit amet ante tristique porttitor ac sit amet urna. In convallis neque sed nunc hendrerit convallis."

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun NotificationBoxPage() {
    Column(
        modifier = Modifier.defaultPadding,
        verticalArrangement = Arrangement.spacedBy(SBBConst.DEFAULT_HORIZONTAL_PADDING)
    ) {
        SBBNotificationBox.Alert("", text)
        SBBNotificationBox.Warning("", text)
        SBBNotificationBox.Success("", text)
        SBBNotificationBox.Information("", text)
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun NotificationBoxPagePreview() {
    SBBTheme {
        Surface {
            NotificationBoxPage()
        }
    }
}
