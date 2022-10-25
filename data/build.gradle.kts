import Dependencies.Retrofit.CONVERTER_GSON

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

apply(from = "$rootDir/android.gradle")
android {
    namespace = "io.github.dalcomdev.data"
}

dependencies {
    implementation(project(":domain"))

    Dependencies.Retrofit.apply {
        implementation(RETROFIT)
        implementation(CONVERTER_GSON)
        implementation(OKHTTP3_OKHTTP)
        implementation(OKHTTP3_LOGGING_INTERCEPTOR)
    }

    Dependencies.AndroidX.apply {
        implementation(CORE_KTX)
        implementation(APP_COMPAT)
        implementation(MATERIAL)
    }

    Dependencies.Google.apply {
        implementation(GSON)
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