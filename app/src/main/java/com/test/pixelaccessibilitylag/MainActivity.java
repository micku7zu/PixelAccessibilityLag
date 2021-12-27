package com.test.pixelaccessibilitylag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString(":settings:fragment_args_key", "com.test.pixelaccessibilitylag/com.test.pixelaccessibilitylag.AccessibilityService");
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            intent.putExtra(":settings:show_fragment_args", bundle);

            try {
                this.startActivity(intent);
            } catch (Exception exception1) {
                try {
                    Intent dialogIntent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                    dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    this.startActivity(dialogIntent);
                } catch (Exception ignored) {
                }
            }
        });
    }
}