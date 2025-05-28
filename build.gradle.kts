// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false

}
// Top-level build.gradle
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0") // Usa la versión estable más reciente
        classpath("com.google.gms:google-services:4.4.2") // Plugin para Firebase
    }
}

allprojects {

}