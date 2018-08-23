package org.core.counter

public expect class PlatformSettings : Settings {

    public class Factory : Settings.Factory {
        public override fun create(name: String?): Settings
    }

    public override fun putInt(key: String, value: Int)
    public override fun getInt(key: String, defaultValue: Int): Int
}
