plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.mertozan.koinsamples"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mertozan.koinsamples"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Koin
    implementation("io.insert-koin:koin-android:3.5.0")

    // Fragment
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    // Picasso
    implementation("com.squareup.picasso:picasso:2.8")

    // Constraint Layout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    // ViewModel Ktx.
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // Gson
    implementation("com.google.code.gson:gson:2.10.1")

    // Gson Converter Factory
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}