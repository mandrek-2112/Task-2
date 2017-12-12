package com.example.rutanjit.iecsetask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent1= getIntent();
        btn=(Button) findViewById(R.id.cont2);
        btn.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                finish();
            }
        });
    }
}
