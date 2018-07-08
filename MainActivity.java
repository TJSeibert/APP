package com.example.tyler.app;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);

        final TextView closeText = findViewById(R.id.textView);
        final TextView errorText = findViewById(R.id.textView2);
        errorText.setTextColor(Color.RED);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                closeText.setVisibility(View.VISIBLE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                closeText.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                errorText.setVisibility(View.VISIBLE);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        System.exit(0);
                    }
                }, 2000);
            }
        });
    }
}
