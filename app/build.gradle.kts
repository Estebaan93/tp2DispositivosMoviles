plugins {
  alias(libs.plugins.android.application)
}

android {
  namespace = "com.example.ui.View"
  compileSdk = 36

  defaultConfig {
    applicationId = "com.example.tp2dispositivosmoviles"
    minSdk = 28
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
/*Configuramos el viewBinding por cada elemento xml que haya dentro de la vista (botones, editext, viewtext etc)
  Me va crear instancias en java que mas adelante poder referenciar en codigo */
  buildFeatures {
    viewBinding= true;
  }

}

dependencies {

  implementation(libs.appcompat)
  implementation(libs.material)
  implementation(libs.activity)
  implementation(libs.constraintlayout)
  testImplementation(libs.junit)
  androidTestImplementation(libs.ext.junit)
  androidTestImplementation(libs.espresso.core)
}