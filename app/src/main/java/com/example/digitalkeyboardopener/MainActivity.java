package com.example.digitalkeyboardopener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOpen = findViewById(R.id.button_open_calculator);
        buttonOpen.setOnClickListener(v -> {
            Uri uri = Uri.parse(getString(R.string.intent_uri));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            ActivityInfo activityInfo = intent.resolveActivityInfo(getPackageManager(), intent.getFlags());
            if (activityInfo != null) {
                startActivity(intent);
            }
        });
    }
}