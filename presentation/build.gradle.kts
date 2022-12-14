plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

apply(from = "$rootDir/android.gradle")
android {
    namespace = "io.github.dalcomdev.presentation"
}

dependencies {
    implementation(project(":domain"))

    Dependencies.AndroidX.apply {
        implementation(APP_COMPAT)
        implementation(CONSTRAINT_LAYOUT)
        implementation(CORE_KTX)
        implementation(MATERIAL)
        implementation(LIFECYCLE_VIEWMODEL_KTX)
        implementation(LIFECYCLE_LIVEDATA_KTX)
        implementation(FRAGMENT_KTX)
        implementation(ACTIVITY_KTX)
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