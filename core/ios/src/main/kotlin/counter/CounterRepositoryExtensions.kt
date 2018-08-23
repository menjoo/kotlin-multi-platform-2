package org.core.counter

import org.core.counter.PlatformSettings

fun counterRepository() = CounterRepository(PlatformSettings.Factory())
