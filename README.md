# Pixel 6 Accessibility Service Freeze Bug - Dummy app

This is a dummy Android Application with an accessibility service that does absolutely nothing, just requests the "[canPerformGesture](https://developer.android.com/reference/android/accessibilityservice/AccessibilityServiceInfo#CAPABILITY_CAN_PERFORM_GESTURES)" permission in order to use "[AccessibilityService.dispatchGesture](https://developer.android.com/reference/android/accessibilityservice/AccessibilityService#dispatchGesture(android.accessibilityservice.GestureDescription,%20android.accessibilityservice.AccessibilityService.GestureResultCallback,%20android.os.Handler))".

Some users reported that having an Accessibility Service running with "**canPerformGesture=true**" it will trigger a bug in Pixel 6 Pro Android 12 every time the battery drops 1% and it will make the device freeze for 1-2 seconds and then it will unfreeze and execute all the touches from that period of time, like in the screen record below:

https://user-images.githubusercontent.com/3103859/147457981-98146d1c-43db-46f1-8c78-1cd0020d11f2.mp4

Mirror: https://imgur.com/a/YGfXsKF

# Steps to reproduce
1. Install the dummy accessibility service APK from Github Releases: [pixel_6_accessibility_service_freeze_bug_v1.apk](https://github.com/micku7zu/PixelAccessibilityLag/releases/download/release/pixel_6_accessibility_service_freeze_bug_v1.apk) 

(or any Android Application with an Accessibility Service with "canPerformGesture" permission)

2. Enable the accessibility service from Android Settings
3. Use the phone normally and watch for 1-2 seconds freeze each time when the battery drops 1%

# Credits
[@Burrro - Xda](https://forum.xda-developers.com/m/burrro.3374622/) for reporting the bug and helping with investigation to find the root cause
