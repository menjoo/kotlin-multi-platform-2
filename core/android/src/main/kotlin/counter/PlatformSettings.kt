package org.core.counter

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.preference.PreferenceManager

actual class PlatformSettings public constructor(private val delegate: SharedPreferences) : Settings {

    actual class Factory(context: Context) : Settings.Factory {
        private val appContext = context.applicationContext

        actual override fun create(name: String?): Settings {
            val delegate = if (name == null) {
                PreferenceManager.getDefaultSharedPreferences(appContext)
            } else {
                appContext.getSharedPreferences(name, MODE_PRIVATE)
            }
            return PlatformSettings(delegate)
        }
    }

    actual override fun putInt(key: String, value: Int): Unit = delegate.edit().putInt(key, value).apply()

    actual override fun getInt(key: String, defaultValue: Int): Int = delegate.getInt(key, defaultValue)
}
