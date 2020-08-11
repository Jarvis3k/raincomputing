package com.example.raincomputing;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.lang.reflect.Constructor;

public class MylistAdapter1 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final String[] description1;


    public MylistAdapter1(@NonNull  Activity context1, String[] mainTitle, String[] description, String[] description1) {
        super(context1, R.layout.item_custom_layout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.description1 = description1;
    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_custom_layout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);
        TextView titletext2 = rowView.findViewById(R.id.title2);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        titletext2.setText(description1[position]);

        return rowView;
    }
}
