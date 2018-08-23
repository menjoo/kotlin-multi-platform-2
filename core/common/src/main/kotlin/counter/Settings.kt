package org.core.counter

public interface Settings {

    public interface Factory {

        public fun create(name: String? = null): Settings
    }

    public fun putInt(key: String, value: Int)

    public fun getInt(key: String, defaultValue: Int = 0): Int
}
