package com.example.raincomputing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class forgotpassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(getApplicationContext(), signup.class));
    }

    public void newpassword(View view) {
        startActivity(new Intent(getApplicationContext(), newpassword.class));
    }
}