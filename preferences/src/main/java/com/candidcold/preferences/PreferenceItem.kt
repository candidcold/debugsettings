package com.candidcold.preferences

import com.xwray.groupie.kotlinandroidextensions.Item

abstract class PreferenceItem : Item() {

    abstract fun getSummary(): String

    abstract fun getTitle(): String

    fun addToRecentlyUsed() {
        RecentlyUsedSection.addToRecentlyUsed(this)
    }
}