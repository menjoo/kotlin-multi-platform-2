// core/common/src/main/kotlin/common.kt
package org.core

expect class Platform() {
    val platform: String
}

class Greeting {
    fun greeting(): String = "Hello, ${Platform().platform} from shared Kotlin code!"
}
