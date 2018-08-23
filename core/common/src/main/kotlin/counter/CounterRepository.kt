package org.core.counter

private val SETTINGS_NAME: String? = "my_settings_file"

class CounterRepository(factory: Settings.Factory) {

    private val settings = factory.create(SETTINGS_NAME)

    fun getCount() = settings.getInt("counter", 0)

    fun increment() = settings.putInt("counter", settings.getInt("counter") + 1)
}
