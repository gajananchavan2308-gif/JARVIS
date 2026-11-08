package com.jarvis.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("J.A.R.V.I.S\n\nJARVIS is running!");
        text.setTextSize(26);
        text.setTextColor(Color.CYAN);
        text.setGravity(Gravity.CENTER);
        text.setBackgroundColor(Color.rgb(7, 21, 37));

        setContentView(text);
    }
}
