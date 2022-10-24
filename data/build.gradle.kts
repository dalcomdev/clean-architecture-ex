plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply(from = "$rootDir/android.gradle")
android {
    namespace = "io.github.dalcomdev.data"
}

dependencies {
    Dependencies.AndroidX.apply {
        implementation(CORE_KTX)
        implementation(APP_COMPAT)
        implementation(MATERIAL)
    }

    Dependencies.JUnit.apply {
        testImplementation(JUNIT)
        androidTestImplementation(EXT_JUNIT)
        androidTestImplementation(ESPRESSO_CORE)
    }
}