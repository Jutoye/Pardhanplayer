# Pardhan Player APK build helper

This ZIP contains the Android source project plus a GitHub Actions workflow.

## Build from a phone using GitHub
1. Create a new GitHub repository.
2. Upload/extract all files and folders from this ZIP into the repository root.
3. Open the repository's Actions tab.
4. Select "Build Pardhan Player APK" and tap "Run workflow".
5. When the run finishes successfully, open the run and download the
   `PardhanPlayer-debug-apk` artifact.
6. Extract the downloaded artifact ZIP; install the APK on your Android phone.

Package: com.pardhancodes.pardhanplayer.debug (debug build)

Important: this source currently contains a starter screen and service/vault
foundation, not a finished MX Player replacement. The APK is a test build,
not a Play Store release.
