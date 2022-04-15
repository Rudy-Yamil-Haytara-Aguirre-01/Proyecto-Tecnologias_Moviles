    package com.example.bici_ok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_BICI_OK);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}