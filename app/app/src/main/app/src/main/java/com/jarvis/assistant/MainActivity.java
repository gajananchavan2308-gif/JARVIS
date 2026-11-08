package com.jarvis.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(7, 21, 37));

        TextView title = new TextView(this);
        title.setText("J.A.R.V.I.S");
        title.setTextSize(32);
        title.setTextColor(Color.CYAN);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("Personal Voice Assistant Ready");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setText("START JARVIS");

        button.setOnClickListener(v ->
            status.setText("Hello! JARVIS is ready.")
        );

        layout.addView(title);
        layout.addView(status);
        layout.addView(button);

        setContentView(layout);
    }
}
