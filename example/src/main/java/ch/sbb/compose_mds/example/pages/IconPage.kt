package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.container.SBBGroup
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.all
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun IconPage() {
    Column {
        SBBGroup(modifier = Modifier.defaultPadding) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(24.dp),
                verticalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
                horizontalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
                contentPadding = PaddingValues(SBBConst.HALF_PADDING),
                userScrollEnabled = false
            ) {
                items(SBBIcons.Small.all) {
                    Icon(
                        imageVector = it,
                        contentDescription = null,
                    )
                }
            }
        }
        SBBGroup(modifier = Modifier.defaultPadding) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(36.dp),
                verticalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
                horizontalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
                contentPadding = PaddingValues(SBBConst.HALF_PADDING),
                userScrollEnabled = false
            ) {
                items(SBBIcons.Medium.all) {
                    Icon(
                        imageVector = it,
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun IconPagePreview() {
    SBBTheme {
        Surface {
            IconPage()
        }
    }
}
