package com.candidcold.home

import com.candidcold.preferences.PreferenceGroup
import dagger.Component

@Component(modules = [HomeSettingsModule::class])
interface HomeComponent {

    @HomeSettings
    fun settingsGroup(): PreferenceGroup
}