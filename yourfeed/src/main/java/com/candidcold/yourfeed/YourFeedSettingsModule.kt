package com.candidcold.yourfeed

import android.app.Application
import com.candidcold.preferences.PreferenceGroup
import dagger.Provides
import dagger.multibindings.IntoSet


import com.candidcold.preferences.PreferenceItem
import com.candidcold.yourfeed.preferences.FeatureOnSetting
import dagger.Module

@Module
class YourFeedSettingsModule {

    // TODO: Only have this in the debug flavor/variant whatever

    @Provides
    @IntoSet
    @YourFeedSettings
    fun provideTurnOnSetting(context: Application): PreferenceItem {
        return FeatureOnSetting(context)
    }

    @Provides
//    @IntoSet // We hopefully only need the into set at the :app level, some glue needed
    fun provideYourFeedSettingsGroup(
        @YourFeedSettings items: Set<@JvmSuppressWildcards PreferenceItem>
    ): PreferenceGroup {
        return PreferenceGroup(R.string.debug_settings_your_feed, items, true)
    }
}