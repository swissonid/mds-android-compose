package ch.sbb.compose_mds.sbbicons

import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

public object SBBIcons

private var __all: ____KtList<ImageVector>? = null

public val SBBIcons.all: ____KtList<ImageVector>
  get() {
    if (__all != null) {
      return __all!!
    }
    __all = Large.all + Medium.all + Small.all + listOf()
    return __all!!
  }
