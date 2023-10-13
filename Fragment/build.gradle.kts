buildscript {
    ext {
        var appcompat_version = "1.5.1"
        var constraintlayout_version = "2.1.4"
        var core_ktx_version = "1.9.0"
        var kotlin_version = "1.7.10"
        var material_version = "1.7.0-alpha2"
        var nav_version = "2.5.2"
    }

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}
