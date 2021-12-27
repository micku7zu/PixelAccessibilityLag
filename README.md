# Pixel 6 Accessibility Service Freeze Bug - Dummy app

This is a dummy Android Application with an accessibility service that does absolutely nothing, just requests the "[canPerformGesture](https://developer.android.com/reference/android/accessibilityservice/AccessibilityServiceInfo#CAPABILITY_CAN_PERFORM_GESTURES)" permission in order to use "[AccessibilityService.dispatchGesture](https://developer.android.com/reference/android/accessibilityservice/AccessibilityService#dispatchGesture(android.accessibilityservice.GestureDescription,%20android.accessibilityservice.AccessibilityService.GestureResultCallback,%20android.os.Handler))".

Some users reported that having an Accessibility Service running with "**canPerformGesture=true**" it will trigger a bug in Pixel 6 Pro Android 12 every time the battery drops 1% and it will make the device freeze for 1-2 seconds and then it will unfreeze and execute all the touches from that period of time, like in the screen record below:

https://user-images.githubusercontent.com/3103859/147457981-98146d1c-43db-46f1-8c78-1cd0020d11f2.mp4

Mirror: https://imgur.com/a/YGfXsKF
