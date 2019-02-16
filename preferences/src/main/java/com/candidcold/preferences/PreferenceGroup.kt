package com.candidcold.preferences

import androidx.annotation.StringRes
import com.xwray.groupie.ExpandableGroup


class PreferenceGroup(@StringRes val title: Int,
                      items: Set<PreferenceItem>,
                      expanded: Boolean = false) : ExpandableGroup(ExpandableHeaderItem(title)) {
    init {
        addAll(items)
        if (expanded) {
            onToggleExpanded()
        }
    }
}
