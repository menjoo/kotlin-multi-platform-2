package org.core.counter

import android.content.Context
import org.core.counter.PlatformSettings

public fun counterRepository(context: Context) = CounterRepository(PlatformSettings.Factory(context))
