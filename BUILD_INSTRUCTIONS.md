# Pardhan Player — Android Native Build Instructions
**Package Name:** `com.pardhancodes.pardhanplayer`
**Target SDKs:** Android 8.0 (API 26) to Android 16+ (API 35+)
**Developer:** PardhanCode (`POWERED BY PARDHANCODE`)

## Prerequisites
1. Install **Android Studio Ladybug (2024.2.1+)** or newer with **JDK 17**.
2. Install Android SDK Platform 35 and Android SDK Build-Tools 35.0.0.

## Building a Working Debug APK
Run from the project root directory:
```bash
./gradlew assembleDebug
```
Output APK location:
`app/build/outputs/apk/debug/app-debug.apk`

Install onto a connected Android phone, tablet, or Android TV device:
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

## Building a Release-Ready Android App Bundle (AAB)
1. Generate a signing keystore (if you do not already have one):
```bash
keytool -genkey -v -keystore pardhan-release.jks -keyalg RSA -keysize 2048 -validity 10000 -alias pardhanplayer
```
2. Configure signing credentials in `local.properties` or Android Studio **Build > Generate Signed App Bundle / APK**.
3. Build the signed release AAB for Google Play distribution:
```bash
./gradlew bundleRelease
```
Output AAB location:
`app/build/outputs/bundle/release/app-release.aab`
