package com.candidcold.yourfeed


import javax.inject.Qualifier


@Target(AnnotationTarget.TYPE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION)
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class YourFeedSettings