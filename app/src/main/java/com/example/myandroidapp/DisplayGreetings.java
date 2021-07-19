package com.example.myandroidapp;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayGreetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_greetings);

        Intent intent = getIntent();
        String greeting = intent.getStringExtra(MainActivity.SEND_GREETINGS);

        TextView textView = findViewById(R.id.textView);
        textView.setText(greeting);
    }
}