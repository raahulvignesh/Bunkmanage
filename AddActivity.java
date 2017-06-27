package com.example.rahul.bunkmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText subject;
    EditText minpercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        subject=(EditText) findViewById(R.id.editText2);
        minpercent=(EditText) findViewById(R.id.editText3);
    }

    public void enter(View view)
    {
        String sub= subject.getText().toString();
        int min = Integer.parseInt(minpercent.getText().toString());

        Intent intent2 =new Intent();
        intent2.putExtra("subject",sub);
        intent2.putExtra("minimumpercent",min);
        setResult(RESULT_OK,intent2);
        finish();
    }
}
