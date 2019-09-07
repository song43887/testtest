package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //code here
    final String EMAIL = "Song";
    final String PASS = "43887";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code here
        Toast toast = Toast.makeText(MainActivity.this,"Welcome to My Application!",Toast.LENGTH_SHORT);
        toast.show();
        Button loginButton = findViewById();
    }
}
