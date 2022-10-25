import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

apply(from = "$rootDir/android.gradle")
android {
    namespace = "io.github.dalcomdev.domain"
}

dependencies {
    Dependencies.AndroidX.apply {
        implementation(CORE_KTX)
        implementation(APP_COMPAT)
        implementation(MATERIAL)
    }

    Dependencies.Hilt.apply {
        implementation(HILT_ANDROID)
        kapt(HILT_ANDROID_COMPILER)
    }

    Dependencies.JUnit.apply {
        testImplementation(JUNIT)
        androidTestImplementation(EXT_JUNIT)
        androidTestImplementation(ESPRESSO_CORE)
    }
}