package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.status.Alert
import ch.sbb.compose_mds.composables.status.Information
import ch.sbb.compose_mds.composables.status.SBBStatus
import ch.sbb.compose_mds.composables.status.Success
import ch.sbb.compose_mds.composables.status.Warning

@Composable
fun StatusPage() {
    Box(
        modifier = Modifier
            .padding(
                vertical = 16.dp,
                horizontal = 8.dp,
            )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Success")
            SBBStatus.Success()
            SBBStatus.Success(text = "Success with Text")
            Text("Alert")
            SBBStatus.Alert()
            SBBStatus.Alert(text = "Alert with Text")
            Text("Warning")
            SBBStatus.Warning()
            SBBStatus.Warning(text = "Warning with Text")
            Text("Information")
            SBBStatus.Information()
            SBBStatus.Information(text = "Information with Text")
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun StatusPagePreview() {
    SBBTheme {
        StatusPage()
    }
}