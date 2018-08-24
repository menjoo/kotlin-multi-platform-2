package org.core.counter

import org.core.counter.PlatformSettings

public fun counterRepository() = CounterRepository(PlatformSettings.Factory())
