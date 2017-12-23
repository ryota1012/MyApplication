package com.example.hat1012kurama.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void b1(View v){
        String s =((EditText)findViewById(R.id.et)).getText().toString();
        ((TextView)findViewById(R.id.textView2)).setText(s);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
