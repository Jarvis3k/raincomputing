package com.example.raincomputing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void verifivation(View view) {
        startActivity(new Intent(getApplicationContext(), verification.class));
    }
}