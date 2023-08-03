package com.mirongdev.libraryandroid;

import static com.mirongdev.librarybasic.Support.alertToast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertToast(this, "Ini adalah pesan dari library!");
    }
}