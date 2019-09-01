package com.zlcp.appviews.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.zlcp.appviews.R;
import com.zlcp.appviews.views.SlantedTextView;

/**
 * 带角标的TextView
 */
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SlantedTextView stv = (SlantedTextView) findViewById(R.id.test);

        stv.setText("PHP")
                .setTextColor(Color.WHITE)
                .setSlantedBackgroundColor(Color.BLACK)
                .setTextSize(18)
                .setSlantedLength(50)
                .setMode(SlantedTextView.MODE_LEFT_BOTTOM);
    }
}
