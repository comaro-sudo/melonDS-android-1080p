package me.magnum.melonds.ui.emulator.model

import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.render.RenderStrategy

data class RuntimeRendererConfiguration(
    val videoFiltering: VideoFiltering,
    val resolutionScaling: Float,
    val renderStrategy: RenderStrategy,
)