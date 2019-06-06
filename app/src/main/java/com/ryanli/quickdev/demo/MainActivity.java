package com.ryanli.quickdev.demo;

import android.os.Bundle;

import com.ryanli.quickdev.arch.QDActivity;

public class MainActivity extends QDActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
