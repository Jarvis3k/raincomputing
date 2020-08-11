package com.example.raincomputing;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.raincomputing.MainActivity;
import com.example.raincomputing.R;
import com.example.raincomputing.signup;

public class verification extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification);
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(getApplicationContext(), signup.class));
    }

    public void cases(View view) {
        startActivity(new Intent(getApplicationContext(), cases.class));
    }
}