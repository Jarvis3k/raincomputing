package com.example.raincomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class myapps extends AppCompatActivity {
    ListView listView;

    String[] title={
            "Vlc Media Player App",
            "7 Zip App",
            "CCleaner App",
            "Visual Studio code App",

    };

    String[] description={
            "Vlc Media Player App",
            "7 Zip App",
            "CCleaner App",
            "Visual Studio code App",

    };

    Integer[] imgs = {
            R.drawable.vlc,
            R.drawable.zip,
            R.drawable.ccleaner,
            R.drawable.visual
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myapps);

        MylistAdapter adapter = new MylistAdapter(this,title,description,imgs);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0){
                    Toast.makeText(myapps.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 1){
                    Toast.makeText(myapps.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 2){
                    Toast.makeText(myapps.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(myapps.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void cases(View view) {
        startActivity(new Intent(getApplicationContext(), cases.class));
    }
}