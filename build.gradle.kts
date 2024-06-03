buildscript {
    repositories {
        mavenCentral()
        maven ("https://developer.huawei.com/repo/")// or any other Maven repository you want to use
    }
    dependencies {
        classpath("com.huawei.agconnect:agcp:1.9.1.300")
        classpath("com.android.tools.build:gradle:8.2.2")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("com.android.library") version "8.2.2" apply false
}
