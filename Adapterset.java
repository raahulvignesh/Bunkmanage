package com.example.rahul.bunkmanager;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapterset extends ArrayAdapter {

    Activity context;
    ArrayList<String> subname;
    ArrayList<Integer> min;
    LayoutInflater inflater;

    public Adapterset(Activity context, ArrayList<String> subname, ArrayList<Integer> min) {

        super(context,R.layout.bunkcontent);
        this.context = context;
         this.subname = subname;
        this.min = min;
        inflater = context.getLayoutInflater();
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View rowview = inflater.inflate(R.layout.bunkcontent,null);
        TextView subject = (TextView) rowview.findViewById(R.id.subjecttxt);
        TextView minpercent = (TextView) rowview.findViewById(R.id.minpercenttxt2);
        subject.setText(subname.get(position));
        minpercent.setText(String.valueOf(min.get(position)));
        return rowview;
    }
}
