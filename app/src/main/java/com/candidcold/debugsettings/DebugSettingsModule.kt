package com.candidcold.debugsettings

import android.app.Application
import dagger.Provides
import dagger.multibindings.IntoSet


import android.preference.PreferenceGroup
import com.candidcold.preferences.PreferenceItem
import dagger.Module

@Module
class DebugSettingsModule {
//
//    // TODO: Move this into the respective module...
//
//    @Provides
//    @IntoSet
//    @FeedSettings
//    fun provideFeedSwitchItem(context: Application): PreferenceItem {
//        return FakeSwitchItem(context)
//    }
//
//    @Provides
//    @IntoSet
//    @FeedSettings
//    fun provideFeedUtilityItem(context: Application): PreferenceItem {
//        return FakeUtilityItem(context)
//    }
//
//    @Provides
//    @IntoSet
//    @EcommSettings
//    fun provideEcommSwitchItem(context: Application): PreferenceItem {
//        return FakeSwitchItem(context)
//    }
//
//    @Provides
//    @IntoSet
//    @EcommSettings
//    fun provideEcommUtilityItem(context: Application): PreferenceItem {
//        return FakeUtilityItem(context)
//    }
//
//    @Provides
//    @IntoSet
//    fun provideFeedSettingsGroup(@FeedSettings items: Set<@JvmSuppressWildcards PreferenceItem>): PreferenceGroup {
//        return PreferenceGroup(R.string.debug_settings_feed, items).apply {
//            onToggleExpanded()
//        }
//    }
//
//    @Provides
//    @IntoSet
//    fun provideEcommSettingsGroup(@EcommSettings items : Set<@JvmSuppressWildcards PreferenceItem>): PreferenceGroup {
//        return PreferenceGroup(R.string.debug_settings_ecomm, items).apply {
//            onToggleExpanded()
//        }
//    }
}