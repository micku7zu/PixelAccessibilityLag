package com.test.pixelaccessibilitylag;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toast;

public class PixelAccessibilityService extends AccessibilityService {
    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.d("PixelAccessibilityService", "onServiceConnected");
        Toast.makeText(this,
                "PixelAccessibilityService started. Use your phone normally and check if it lags when the battery drops 1%. Thanks!",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.d("PixelAccessibilityService", "onAccessibilityEvent");
    }

    @Override
    public void onInterrupt() {
        Log.d("PixelAccessibilityService", "onInterrupt");
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d("PixelAccessibilityService", "onRebind");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("PixelAccessibilityService", "onUnbind");
        return true;
    }

    @Override
    public void onDestroy() {
        Log.d("PixelAccessibilityService", "onDestroy");
    }
}
