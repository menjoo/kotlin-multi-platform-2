# Kotlin Multi-Platform

## Minimal project to show Kotlin-Native with Android and iOS

### Structure

This project includes three parts:

 * An **Android application** represented by a separate Android Studio project written in Kotlin.
 * An **iOS application** represented by a separate Xcode project, written in Swift.
 * A **multiplatform library** containing a business logic of the application and used by both Android and iOS applications.
   This library can contain both platform-dependent and platform-independent code and is compiled into a `jar`-library
   for Android and in a `Framework` for iOS by Gradle.
   
 The multiplatform library will include three subprojects:

 * `common` - contains a common logic for both applications
 * `ios` - contains an iOS-specific code
 * `android` - contains an Android-specific code
 
 ```
     application/
    ├── androidApp/
    ├── iosApp/
    └── core/
        ├── common/
        ├── android/
        └── ios/
```
