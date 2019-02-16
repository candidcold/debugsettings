package com.candidcold.preferences

import android.annotation.SuppressLint
import android.content.SharedPreferences

inline fun SharedPreferences.apply(operation: (SharedPreferences.Editor) -> Unit) {
    val editor = this.edit()
    operation(editor)
    editor.apply()
}

@SuppressLint("ApplySharedPref")
inline fun SharedPreferences.commit(operation: (SharedPreferences.Editor) -> Unit) {
    val editor = this.edit()
    operation(editor)
    editor.commit()
}

fun SharedPreferences.put(key: String, value: Any?) {
    when (value) {
        is String? -> apply { it.putString(key, value) }
        is Int -> apply { it.putInt(key, value) }
        is Boolean -> apply { it.putBoolean(key, value) }
        is Float -> apply { it.putFloat(key, value) }
        is Long -> apply { it.putLong(key, value) }
        else -> throw UnsupportedOperationException("Unsupported SharedPreference type")
    }
}

inline fun <reified T> SharedPreferences.get(key: String, default: T): T {
    return when (default) {
        is String? -> this.getString(key, default) as T
        is Int -> this.getInt(key, default) as T
        is Boolean -> this.getBoolean(key, default) as T
        is Float -> this.getFloat(key, default) as T
        is Long -> this.getLong(key, default) as T
        else -> throw UnsupportedOperationException("Unsupported SharedPreference type")
    }
}
