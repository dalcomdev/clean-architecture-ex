plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
        annotationProcessor(HILT_COMPILER)
    }

    Dependencies.JUnit.apply {
        testImplementation(JUNIT)
        androidTestImplementation(EXT_JUNIT)
        androidTestImplementation(ESPRESSO_CORE)
    }
}