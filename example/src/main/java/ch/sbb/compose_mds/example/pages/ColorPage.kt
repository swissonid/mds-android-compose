package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.container.SBBGroup
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBConst

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ColorPage() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 125.dp),
        verticalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
        horizontalArrangement = Arrangement.spacedBy(SBBConst.HALF_PADDING),
        contentPadding = PaddingValues(SBBConst.HALF_PADDING),
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Colors") }
        item { ColorEntry(name = "red", color = SBBColors.red) }
        item { ColorEntry(name = "red125", color = SBBColors.red125) }
        item { ColorEntry(name = "red150", color = SBBColors.red150) }
        item { ColorEntry(name = "redDarkMode", color = SBBColors.redDarkMode) }
        item { ColorEntry(name = "white", color = SBBColors.white) }
        item { ColorEntry(name = "milk", color = SBBColors.milk) }
        item { ColorEntry(name = "cloud", color = SBBColors.cloud) }
        item { ColorEntry(name = "silver", color = SBBColors.silver) }
        item { ColorEntry(name = "aluminum", color = SBBColors.aluminum) }
        item { ColorEntry(name = "platinum", color = SBBColors.platinum) }
        item { ColorEntry(name = "cement", color = SBBColors.cement) }
        item { ColorEntry(name = "graphite", color = SBBColors.graphite) }
        item { ColorEntry(name = "storm", color = SBBColors.storm) }
        item { ColorEntry(name = "smoke", color = SBBColors.smoke) }
        item { ColorEntry(name = "metal", color = SBBColors.metal) }
        item { ColorEntry(name = "granite", color = SBBColors.granite) }
        item { ColorEntry(name = "anthracite", color = SBBColors.anthracite) }
        item { ColorEntry(name = "iron", color = SBBColors.iron) }
        item { ColorEntry(name = "charcoal", color = SBBColors.charcoal) }
        item { ColorEntry(name = "midnight", color = SBBColors.midnight) }
        item { ColorEntry(name = "black", color = SBBColors.black) }
        item { ColorEntry(name = "blue", color = SBBColors.blue) }
        item { ColorEntry(name = "transparent", color = SBBColors.transparent) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Functional colors") }
        item { ColorEntry(name = "sky", color = SBBColors.sky) }
        item { ColorEntry(name = "night", color = SBBColors.night) }
        item { ColorEntry(name = "violet", color = SBBColors.violet) }
        item { ColorEntry(name = "pink", color = SBBColors.pink) }
        item { ColorEntry(name = "autumn", color = SBBColors.autumn) }
        item { ColorEntry(name = "orange", color = SBBColors.orange) }
        item { ColorEntry(name = "peach", color = SBBColors.peach) }
        item { ColorEntry(name = "lemon", color = SBBColors.lemon) }
        item { ColorEntry(name = "brown", color = SBBColors.brown) }
        item { ColorEntry(name = "green", color = SBBColors.green) }
        item { ColorEntry(name = "turquoise", color = SBBColors.turquoise) }

        item(span = { GridItemSpan(maxLineSpan) }) { SBBListHeader(text = "Off brand colors") }
        item { ColorEntry(name = "royal", color = SBBColors.royal) }
        item { ColorEntry(name = "royal125", color = SBBColors.royal125) }
        item { ColorEntry(name = "royal150", color = SBBColors.royal150) }
    }
}

@OptIn(ExperimentalStdlibApi::class, ExperimentalSBBComponent::class)
@Composable
private fun ColorEntry(name: String, color: Color) {
    SBBGroup(
        modifier = Modifier
            .size(100.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1.0f)
                .fillMaxSize()
                .background(color)
        )
        Text(
            modifier = Modifier.padding(
                start = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                top = SBBConst.HALF_PADDING,
                end = SBBConst.DEFAULT_HORIZONTAL_PADDING,
            ),
            text = name,
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            modifier = Modifier.padding(
                start = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                end = SBBConst.DEFAULT_HORIZONTAL_PADDING,
                bottom = SBBConst.HALF_PADDING,
            ),
            text = "#${color.toArgb().toHexString(format = HexFormat.UpperCase)}",
            style = MaterialTheme.typography.bodySmall,
        )
    }

}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_TypographyPage() {
    SBBTheme {
        Surface {
            ColorPage()
        }
    }
}
