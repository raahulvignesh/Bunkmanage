package com.example.rahul.bunkmanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ImageView imgadd;
    String subname;
    int min;
    ArrayList<String> subjectname;
    ArrayList<Integer> minpercent;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subjectname = new ArrayList<String>();
        minpercent = new ArrayList<Integer>();
        listView = (ListView) findViewById(R.id.listbunk1);
        imgadd = (ImageView)findViewById(R.id.imageView3);
        imgadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(),AddActivity.class);
                startActivityForResult(intent1,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if((resultCode==RESULT_OK)&&(requestCode==1))
        {
            subname = data.getStringExtra("subject");
            min = data.getIntExtra("minimumpercent",75);
            subjectname.add(subname);
            minpercent.add(min);
            Adapterset adapterset =new Adapterset(this,subjectname,minpercent);
            listView.setAdapter(adapterset);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
