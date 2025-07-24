package ch.sbb.compose_mds.theme.context.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

interface AlphaValue {
    val value: Float
}

sealed class CommonAlphaSteps(
    override val value: Float,
) : AlphaValue {
    object _10 : CommonAlphaSteps(0.1f)

    object _20 : CommonAlphaSteps(0.2f)

    object _30 : CommonAlphaSteps(0.3f)

    object _40 : CommonAlphaSteps(0.4f)

    object _50 : CommonAlphaSteps(0.5f)

    object _60 : CommonAlphaSteps(0.6f)

    object _70 : CommonAlphaSteps(0.7f)

    object _80 : CommonAlphaSteps(0.8f)

    object _90 : CommonAlphaSteps(0.9f)

    object _100 : CommonAlphaSteps(1f)
}

sealed class Only20AlphaSteps(
    override val value: Float,
) : AlphaValue {
    object _20 : Only20AlphaSteps(0.2f)
}

sealed class PrimaryAlpha(
    override val value: Float,
) : AlphaValue {
    object _90 : PrimaryAlpha(0.9f)

    object _20 : PrimaryAlpha(0.2f)
}

sealed class Primary125Alpha(
    value: Float,
) : Only20AlphaSteps(value)

sealed class WhiteAlpha(
    value: Float,
) : CommonAlphaSteps(value)

sealed class MilkAlpha(
    value: Float,
) : CommonAlphaSteps(value)

sealed class CloudAlpha(
    value: Float,
) : CommonAlphaSteps(value)

sealed class PlatinumAlpha(
    value: Float,
) : Only20AlphaSteps(value)

sealed class CementAlpha(
    value: Float,
) : Only20AlphaSteps(value)

sealed class SmokeAlpha(
    override val value: Float,
) : AlphaValue {
    object _5 : SmokeAlpha(0.05f)

    object _10 : SmokeAlpha(0.1f)

    object _20 : SmokeAlpha(0.2f)
}

sealed class MetalAlpha(
    value: Float,
) : Only20AlphaSteps(value)

sealed class BlackAlpha(
    value: Float,
) : CommonAlphaSteps(value)

@Immutable
data class ContextColors(
    val primary: Color,
    val primary125: Color,
    val primary150: Color,
    val primary85: Color,
    val white: Color = PrimitiveColors.white,
    val milk: Color = PrimitiveColors.milk,
    val cloud: Color = PrimitiveColors.cloud,
    val silver: Color = PrimitiveColors.silver,
    val aluminium: Color = PrimitiveColors.aluminum,
    val platinum: Color = PrimitiveColors.platinum,
    val cement: Color = PrimitiveColors.cement,
    val graphite: Color = PrimitiveColors.graphite,
    val storm: Color = PrimitiveColors.storm,
    val smoke: Color = PrimitiveColors.smoke,
    val metal: Color = PrimitiveColors.metal,
    val granite: Color = PrimitiveColors.granite,
    val anthracite: Color = PrimitiveColors.anthracite,
    val iron: Color = PrimitiveColors.iron,
    val charcoal: Color = PrimitiveColors.charcoal,
    val midnight: Color = PrimitiveColors.midnight,
    val black: Color = PrimitiveColors.black,
) {
    fun primary(alpha: PrimaryAlpha) = primary.copy(alpha = alpha.value)

    fun primary125(alpha: Primary125Alpha) = primary125.copy(alpha = alpha.value)

    fun primary85(alpha: CommonAlphaSteps) = primary.copy(alpha = alpha.value)

    fun white(alpha: WhiteAlpha) = white.copy(alpha = alpha.value)

    fun milk(alpha: MilkAlpha) = milk.copy(alpha = alpha.value)

    fun cloud(alpha: CloudAlpha) = cloud.copy(alpha = alpha.value)

    fun platinum(alpha: PlatinumAlpha) = platinum.copy(alpha = alpha.value)

    fun cement(alpha: CementAlpha) = cement.copy(alpha = alpha.value)

    fun smoke(alpha: SmokeAlpha) = smoke.copy(alpha = alpha.value)

    fun metal(alpha: MetalAlpha) = metal.copy(alpha = alpha.value)

    fun black(alpha: BlackAlpha) = black.copy(alpha = alpha.value)
}
