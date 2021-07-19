package com.example.myandroidapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String SEND_GREETINGS = "com.example.myandroidapp.GREETINGS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //       EditText editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
//        TextView textViewGreetings = (TextView) findViewById(R.id.textViewGreetings);
//        Button btnGreetings = (Button) findViewById(R.id.btnGreetings);
//        btnGreetings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //textViewGreetings.setText("Hello World! \n" + "Greetings from " + editTextFirstName.getText());
//
//            }
        }

        public void sendGreetings(View v) {
            Intent intent = new Intent(this, DisplayGreetings.class);
            EditText editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
            String greetings = "Hello World! \n" + "Greetings from " + editTextFirstName.getText();
            intent.putExtra(SEND_GREETINGS, greetings);
            startActivity(intent);
        }


    }







