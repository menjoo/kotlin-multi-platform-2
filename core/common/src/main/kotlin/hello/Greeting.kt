package org.core.hello

expect class Platform() {
    val platform: String
}

class Greeting {
    fun greeting(): String = "Hello, ${Platform().platform} from shared Kotlin code!"
}
