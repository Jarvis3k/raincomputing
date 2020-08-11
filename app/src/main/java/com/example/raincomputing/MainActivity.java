package com.example.raincomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.Loginbtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Email.getText().toString(),Password.getText().toString());
            }
        });


    }
    private void validate(String Email,String Password){
        if(Email.equals("admin") && Password.equals("12345")) {
            startActivity(new Intent(getApplicationContext(), cases.class));
        }
        else{
            Toast.makeText(MainActivity.this,
                    "Invalid email or password ",Toast.LENGTH_SHORT).show();

        }
    }

    public void signup(View view) {
        startActivity(new Intent(getApplicationContext(), signup.class));
    }

    public void forgotpassword(View view) {
        startActivity(new Intent(getApplicationContext(), forgotpassword.class));
    }

    public void myapps(View view) {
        startActivity(new Intent(getApplicationContext(), myapps.class));
    }
}