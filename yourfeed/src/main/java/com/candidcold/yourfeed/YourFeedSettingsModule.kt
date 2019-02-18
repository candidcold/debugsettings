package com.candidcold.yourfeed

import android.app.Application
import com.candidcold.preferences.PreferenceGroup
import dagger.Provides
import dagger.multibindings.IntoSet


import com.candidcold.preferences.PreferenceItem
import com.candidcold.yourfeed.preferences.FeatureOnSetting
import dagger.Module

@Module
class YourFeedSettingsModule(private val application: Application) {

    // TODO: Only have this in the debug flavor/variant whatever

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    @IntoSet
    @YourFeedSettings
    fun provideTurnOnSetting(context: Application): PreferenceItem {
        return FeatureOnSetting(context)
    }

    @Provides
    @YourFeedSettings
    fun provideYourFeedSettingsGroup(
        @YourFeedSettings items: Set<@JvmSuppressWildcards PreferenceItem>
    ): PreferenceGroup {
        return PreferenceGroup(R.string.debug_settings_your_feed, items, true)
    }
}