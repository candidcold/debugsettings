package com.candidcold.yourfeed.preferences

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.candidcold.preferences.SwitchPreferenceItem


class FeatureOnSetting(private val context: Context) : SwitchPreferenceItem() {

    override fun execute(selected: Boolean): () -> Unit {
        return {
            // Purposely empty
        }
    }

    override val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    override val key: String = "your_feed_key"
    override val defaultValue: Boolean? = true

    override fun getSummary(): String = "Whether or not the feature is turned on"

    override fun getTitle(): String = "Your Feed"
}