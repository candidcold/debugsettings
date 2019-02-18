package com.candidcold.yourfeed

import com.candidcold.preferences.PreferenceGroup
import dagger.Component

@Component(modules = [YourFeedSettingsModule::class])
interface YourFeedComponent {

    @YourFeedSettings
    fun settingsTile(): PreferenceGroup

    fun inject(target: YourFeedActivity)

}