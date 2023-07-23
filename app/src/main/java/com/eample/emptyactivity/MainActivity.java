package com.eample.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eample.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this, "Subscribe to Papaya Coders : )");

    }
}