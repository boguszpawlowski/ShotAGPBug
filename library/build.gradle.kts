plugins {
  id("com.android.library")
  id("shot")
}

android {
  compileSdk = 30

  defaultConfig {
    minSdk = 26
    targetSdk = 30

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
    testApplicationId = "com.bpawlowski.library.test"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
}

dependencies {

  implementation("androidx.appcompat:appcompat:1.3.0")
  implementation("com.google.android.material:material:1.3.0")
  testImplementation("junit:junit:4.+")
  androidTestImplementation("androidx.test.ext:junit:1.1.2")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}
