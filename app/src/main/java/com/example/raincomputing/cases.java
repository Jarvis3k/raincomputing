package com.example.raincomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class cases extends AppCompatActivity {
    ListView listView;

    String[] title={
            " 1234 - 5678",
            " 1234 - 5678",
            " 1234 - 5678",
            " 1234 - 5678",
            " 1234 - 5678",
            " 1234 - 5678",
            " 1234 - 5678",
    };

    String[] title1={
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
    };

    String[] title2={
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);



        MylistAdapter1 adapter=new MylistAdapter1(this,title,title1,title2);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
    public void myapps(View view) {
        startActivity(new Intent(getApplicationContext(), myapps.class));
    }
}