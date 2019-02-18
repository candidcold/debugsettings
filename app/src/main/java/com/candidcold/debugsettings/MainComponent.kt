package com.candidcold.debugsettings

import com.candidcold.home.HomeComponent
import com.candidcold.yourfeed.YourFeedComponent
import dagger.Component


@Component(
    modules = [FirstModule::class],
    dependencies = [
        YourFeedComponent::class,
        HomeComponent::class
    ]
)
interface MainComponent {

    fun inject(target: MainActivity)

}