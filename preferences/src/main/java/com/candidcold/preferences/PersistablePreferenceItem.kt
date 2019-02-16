package com.candidcold.preferences

import android.content.SharedPreferences

abstract class PersistablePreferenceItem<T> : PreferenceItem() {

    protected abstract val preferences: SharedPreferences

    abstract val key: String

    abstract val defaultValue: T?

    var value: T?
        get() = get(key, defaultValue)
        set(value) = preferences.put(key, value)

    // TODO: Figure this out as an extension function please :(, it's so close...

    @Suppress("UNCHECKED_CAST")
    private fun get(key: String, default: T?): T? {
        return when (default) {
            is String? -> preferences.getString(key, default) as T?
            is Int -> preferences.getInt(key, default) as T?
            is Boolean -> preferences.getBoolean(key, default) as T?
            is Float -> preferences.getFloat(key, default) as T?
            is Long -> preferences.getLong(key, default) as T?
            else -> throw UnsupportedOperationException("Unsupported SharedPreference type")
        }
    }
}
