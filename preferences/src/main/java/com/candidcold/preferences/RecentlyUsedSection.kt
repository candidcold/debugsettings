package com.candidcold.preferences

import androidx.annotation.StringRes
import com.xwray.groupie.Section
import java.util.*

object RecentlyUsedSection : Section() {

    // TODO: Test this
    // Make a queue that holds 5 items, evict when it's at 5
    private val items: Queue<PreferenceItem> = LinkedList<PreferenceItem>()

    init {
        setHideWhenEmpty(true)
    }

    fun setTitle(@StringRes title: Int) {
        setHeader(HeaderItem(title))
    }

    fun addToRecentlyUsed(item: PreferenceItem) {
        if (items.size >= 5) {
            items.remove()
        }

        items.forEach {
            if (it.javaClass == item.javaClass) {
                items.remove(it)
            }
        }

        items.add(item)
        update(items.reversed())
    }

}