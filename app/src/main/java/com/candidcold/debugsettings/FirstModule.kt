package com.candidcold.debugsettings

import com.candidcold.home.HomeSettings
import com.candidcold.preferences.PreferenceGroup
import com.candidcold.yourfeed.YourFeedSettings
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet


@Module
class FirstModule {

    @Provides
    fun providesAllSettingsGroups(
        @YourFeedSettings yourFeedSettings: PreferenceGroup,
        @HomeSettings homeSettings: PreferenceGroup
    ): Set<PreferenceGroup> {
        return setOf(
            yourFeedSettings,
            homeSettings
        )
    }
}