plugins {
    id("com.android.application")
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
        implementation(CONSTRAINTLAYOUT)
        implementation(CORE_KTX)
        implementation(MATERIAL)
    }

    Dependencies.Hilt.apply {
        implementation(HILT_ANDROID)
        annotationProcessor(HILT_COMPILER)
    }

    Dependencies.JUnit.apply {
        testImplementation(JUNIT)
        androidTestImplementation(EXT_JUNIT)
        androidTestImplementation(ESPRESSO_CORE)
    }
}