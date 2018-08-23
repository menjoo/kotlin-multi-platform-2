package org.core.counter

import platform.Foundation.NSUserDefaults
import platform.Foundation.NSBundle

actual class PlatformSettings public constructor(private val delegate: NSUserDefaults) : Settings {

    actual class Factory() : Settings.Factory {

        actual override fun create(name: String?): Settings {
            val delegate = if (name == null) NSUserDefaults.standardUserDefaults else NSUserDefaults(name)
            return PlatformSettings(delegate)
        }
    }

    actual override fun putInt(key: String, value: Int): Unit = delegate.setInteger(value.toLong(), key)

    actual override fun getInt(key: String, defaultValue: Int): Int =
            if (hasKey(key)) delegate.integerForKey(key).toInt() else defaultValue
}
