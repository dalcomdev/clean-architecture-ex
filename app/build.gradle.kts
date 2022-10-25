plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

apply(from = "$rootDir/android.gradle")
android {
    namespace = "io.github.dalcomdev.caex"
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presentation"))

    Dependencies.Retrofit.apply {
        implementation(RETROFIT)
        implementation(CONVERTER_GSON)
        implementation(OKHTTP3_OKHTTP)
        implementation(OKHTTP3_LOGGING_INTERCEPTOR)
    }

    Dependencies.Paging3.apply {
        implementation(PAGING_RUNTIME)
    }

    Dependencies.Room.apply {
        implementation(RUNTIME)
        kapt(COMPILER)
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