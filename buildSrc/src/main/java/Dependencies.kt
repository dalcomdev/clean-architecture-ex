object Dependencies {

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
        const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val OKHTTP3_OKHTTP = "com.squareup.okhttp3:okhttp:5.0.0-alpha.10"
        const val OKHTTP3_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.10"
    }

    object Paging3 {
        const val PAGING_RUNTIME = "androidx.paging:paging-runtime:3.1.1"
    }

    object Room {
        const val RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    }

    object Hilt {
        const val HILT_ANDROID = "com.google.dagger:hilt-android:2.43.2"
        const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:2.43.2"
    }

    object JUnit {
        const val JUNIT = "junit:junit:4.13.2"
        const val EXT_JUNIT = "androidx.test.ext:junit:1.1.3"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    }
}