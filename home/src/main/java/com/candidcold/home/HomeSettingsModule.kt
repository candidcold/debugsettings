package com.candidcold.home

import android.app.Application
import android.content.Context
import com.candidcold.home.preferences.FeatureOnSetting
import com.candidcold.preferences.PreferenceGroup
import com.candidcold.preferences.PreferenceItem
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class HomeSettingsModule(private val application: Application) {

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    @IntoSet
    @HomeSettings
    fun provideFeatureOnSetting(context: Application): PreferenceItem {
        return FeatureOnSetting(context)
    }

    @Provides
    // I think if I qualify this then it should be fine to bring into :app
    @HomeSettings
    fun provideHomeSettings(
        @HomeSettings items: Set<@JvmSuppressWildcards PreferenceItem>
    ): PreferenceGroup {
        return PreferenceGroup(R.string.debug_settings_home, items, true)
    }
}